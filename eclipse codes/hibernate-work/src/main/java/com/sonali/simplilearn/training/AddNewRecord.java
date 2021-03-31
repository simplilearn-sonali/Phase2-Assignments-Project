package com.sonali.simplilearn.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewRecord 
{
    public static void main( String[] args )
    {
//       Get a Reference to the SessionFactory
    	SessionFactory theFactory = new Configuration()
    								.configure("hibernate-config.xml")
    								.addAnnotatedClass(Learners.class)
    								.buildSessionFactory();
    	
    	
//    	Get a reference to the Session
    	Session theSession =theFactory.getCurrentSession();
    	
    	try {
//    		Create a Learner Object
    		Learners theLearner = new Learners("Sonali", "New york, USA");
    		
//    		Start the transaction
    		theSession.beginTransaction();
    		
//			Create new skills for this learner
    		Skill firstSkill = new Skill("Apache Tomcat", "4.0");
    		Skill secondSkill = new Skill("Hibernate", "4.5");
    		Skill thirdSkill = new Skill("Java", "5.0");
    		Skill fourthSkill = new Skill("JDBC", "4.5");
    		
//    		Set the skills into a collection for the learner
    		theLearner.getListOfSkills().add(firstSkill);
    		theLearner.getListOfSkills().add(secondSkill);
    		theLearner.getListOfSkills().add(thirdSkill);
    		theLearner.getListOfSkills().add(fourthSkill);
    		
//    		Set the Skill for this Learner
//    		theLearner.setSkill(theSkill);
    		
    		
//    		Save the new object
    		theSession.save(theLearner);
    		
//    		Commit the Transaction
    		theSession.getTransaction().commit();
    		
    		
    	}finally {
//    		Close the factory
    		theFactory.close();
    	}
    }
}
