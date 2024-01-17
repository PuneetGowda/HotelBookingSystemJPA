package com.entlogics.hotelbookingsystemjpa.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO implements ITestDAO {
	
	private static Logger logger = LogManager.getLogger(TestDAO.class);

//	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPersistence");
//	
//	private EntityManager entityManager = emf.createEntityManager();
//	
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void testMethod() {
		
		logger.info("Inside test method of test dao");
		
		
	Query query = entityManager.createNativeQuery("select * from hotel");
		
		List<Object[]> list = query.getResultList();
			
		for (Object[] arr : list) {
			logger.info("QUERY IS "+Arrays.toString(arr));
		
		}
		
	}

	public static void main(String[] args) {
	
		TestDAO test = new TestDAO();
		
		test.testMethod();
	
	}
}
