package com.sonali.simplilearn.training;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchOperationsUsingHQL {
	
	Session theSession;
	
	SessionFactory theFactory;
	
	public FetchOperationsUsingHQL() {
//      Get a Reference to the SessionFactory
   	SessionFactory theFactory = new Configuration()
   								.configure("hibernate-config.xml")
   								.addAnnotatedClass(Learners.class)
   								.buildSessionFactory();
   	
   	
//   	Get a reference to the Session
   	theSession =theFactory.getCurrentSession();
   	
   	try {
   		theSession.beginTransaction();
   	}
   	finally {
//   		theFactory.close();
   	}
	}
	
	public static void main(String[] args) {
//		List<Learners> theLearners =  new FetchOperationsUsingHQL().getAllLearners();
		
//		System.out.println("Enter the ending portion of address to search: ");
		System.out.println("Enter the name and id of learner: ");
		
		Scanner theScanner =  new Scanner(System.in);
		
		String name = theScanner.nextLine();
		
		int id = theScanner.nextInt();
		
		
//		List<Learners> theLearners =  new FetchOperationsUsingHQL().getLearnersByAddress(addressToSearchFor);
//		List<Learners> theLearners =  new FetchOperationsUsingHQL().getLearnersByAddressLike(addressToSearchFor);
		List<Learners> theLearners =  new FetchOperationsUsingHQL().getLearnersByIdOrName(id, name);
		
		System.out.println("Learners with that address are : ");
		
		for(Learners tempLearners : theLearners) {
			System.out.println(tempLearners.getLearnerId());
		}
		
	}
	
	
//	This method when called, gets all learners from the table:learners
	List<Learners> getAllLearners(){
		return theSession.createQuery("from Learners").getResultList();
	}
	
//	This method when called, returns a Learners by address
	 List<Learners> getLearnersByAddress(String address) {
		return theSession.createQuery("from Learners l where l.learnerAddress = '" + address + "'").getResultList();
	}
	 
// This method returns all those Learners whose address ends with USA
	 List<Learners> getLearnersByAddressLike(String addressToSearchFor){
		 return theSession.createQuery("from Learners l where l.learnerAddress LIKE '%" + addressToSearchFor + "'").getResultList();
	 }
	 
//	 Using OR with HQL
	 List<Learners> getLearnersByIdOrName(int id, String learnerName){
		 return theSession.createQuery("from Learners l where l.learnerId = '" + id + "' OR l.learnerName = '" + learnerName + "'").getResultList();
	 }
	
	
	
	
	
}
