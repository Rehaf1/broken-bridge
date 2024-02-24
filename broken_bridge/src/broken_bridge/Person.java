package broken_bridge;

 public class Person {
 protected String name; 
 protected String id ; 

 public Person(String n , String iD) {
	name = n ; 
	id = iD ; 
}
 public Person(){ this("unnamed","without Id");
}}