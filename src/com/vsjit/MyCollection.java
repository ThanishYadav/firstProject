package com.vsjit;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollection {
	
	private List<String> myList;
	private Set<String> mySet;
	private Map<Integer,String> myMap;	
	private Properties myProp;
	
	public MyCollection() {
		super();
	}

	public MyCollection(List<String> myList, Set<String> mySet, Map<Integer, String> myMap, Properties myProp) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.myProp = myProp;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public Set<String> getMySet() {
		return mySet;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public Map<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProp() {
		return myProp;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}
	
	

}
