package com.ars.backend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ars.backend.dao.UserLoginDao;
import com.ars.backend.dto.UserLogin;

@Repository("userDao")
public class UserLoginDaoImpl implements UserLoginDao {

	private static List<UserLogin> users = new ArrayList<>();
	static
	{
		UserLogin user = new UserLogin();
		
		//add first record
		user.setLoginId("skshiwali30");
		user.setPassword("1234");
		user.setTypeOfUser("admin");
		
		users.add(user);
		
		//add 2nd record
		user = new UserLogin();
		user.setLoginId("akanshu07");
		user.setPassword("7890");
		user.setTypeOfUser("passenger");
		
		users.add(user);
		
	}
	
	@Override
	public List<UserLogin> list() {
		return users;
	}

}
