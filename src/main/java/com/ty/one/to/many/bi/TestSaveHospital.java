package com.ty.one.to.many.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.many.bi.*;

public class TestSaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch1=new Branch();
		branch1.setName("btm apollo");
		branch1.setAddress("bangalore");
		branch1.setPhone(12345678);
		
		Branch branch2=new Branch();
		branch2.setName("btr apollo");
		branch2.setAddress("bangalore");
		branch2.setPhone(34567890);
		
		Branch branch3=new Branch();
		branch3.setName("jp nagar apollo");
		branch3.setAddress("bangalore");
		branch3.setPhone(4567890);
		
		Hospital hospital=new Hospital();
		hospital.setName("apolo");
		hospital.setWebsite("www.apollo.com");
		hospital.setGstNumber(12345);
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	}
		

}
