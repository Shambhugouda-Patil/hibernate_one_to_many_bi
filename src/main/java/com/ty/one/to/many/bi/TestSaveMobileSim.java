package com.ty.one.to.many.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {
	public static void main(String[] args) {
	
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			Mobile mobile=new Mobile();
			mobile.setName("iphone");
			mobile.setCost(20000);
	}

}
