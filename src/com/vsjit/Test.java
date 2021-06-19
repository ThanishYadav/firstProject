package com.vsjit;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
//	Resource resource=new ClassPathResource("applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(resource);
		 ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// Student student=(Student)context.getBean("studentbean");
		// student.displayInfo();
		/*
		 * Patient pat= (Patient) factory.getBean("pat");
		 * 
		 * System.out.println("Age::::::"+pat.getPatAge());
		 * System.out.println("Id::::::::::::"+pat.getPatId());
		 * System.out.println("Name:::::::::::::::::"+pat.getPatName());
		 */
		
		Doctor doct=(Doctor) context.getBean("doc");
		
		System.out.println("DoctorId::::::::::"+doct.getDocId());
		System.out.println("Doctor Name:::::::"+ doct.getDocName());
		System.out.println("Patient details:::::::::: "+doct.getPatId().getPatAge()+"  Patient Name:::"+doct.getPatId().getPatName());
	    List list =doct.getPateintList();
	    System.out.println(list.get(0));
	    System.out.println(list.get(1));
	    System.out.println(list.get(2));
	    
	    MyCollection myCollection=(MyCollection)context.getBean("myCollection");
	    System.out.println("---access list---");        
        List<String> list1=myCollection.getMyList();
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        
        System.out.println("---access set---");
        Set<String> set=myCollection.getMySet();
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        //access map
        System.out.println("---access map---");
        Map<Integer,String> map=myCollection.getMyMap();
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        //access properties
        System.out.println("---access properties---");
        Properties prop=myCollection.getMyProp();
        System.out.println(prop.getProperty("propKeyA"));
        System.out.println(prop.getProperty("propKeyB"));       
	
	
	}
}
