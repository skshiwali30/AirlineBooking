package com.ars.backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ars.backend.dao.FlightInformationDao;
import com.ars.backend.dto.FlightInformation;

@Repository("flightInfo")
@Transactional
public class FlightInformationDaoImpl implements FlightInformationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<FlightInformation> list() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean add(FlightInformation fInfo) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().persist(fInfo);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public FlightInformation get(int flightId) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().get(FlightInformation.class, Integer.valueOf(flightId));
	}

	@Override
	public boolean update(FlightInformation fInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(FlightInformation fInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
