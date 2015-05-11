package se.cirillo.main;

import org.springframework.stereotype.Component;


@Component
public class NameService {
	final String name = "Dennis";
	
	public String getName(){
		return name;
	}
}
