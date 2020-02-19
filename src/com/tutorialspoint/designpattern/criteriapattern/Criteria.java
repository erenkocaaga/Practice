package com.tutorialspoint.designpattern.criteriapattern;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
