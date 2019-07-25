package com.ars.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.ars.backend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/airlines";
	private static final String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	private static final String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	private static final String DATABASE_USERNAME="root";
	private static final String DATABASE_PASSWORD="";
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}
	
	//session factory
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.ars.backend.dto");
		return builder.buildSessionFactory();
	}

	//All hibernate properties will return in this method
	private Properties getHibernateProperties() {
		// TODO Auto-generated method stub
		Properties property = new Properties();
		property.put("hibernate.dialect", DATABASE_DIALECT);
		property.put("hibernate.show_sql",true);
		property.put("hibernate.format_sql", true);
		
		return null;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
}
