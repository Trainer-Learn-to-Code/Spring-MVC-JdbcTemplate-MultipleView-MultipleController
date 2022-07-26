package springex;

public class Student {
private int id;
private String name;

/*Constructor Injection
 * public Student(int id, String name) { super(); this.id = id; this.name =
 * name; } public Student(int id) { super(); this.id = id; } public
 * Student(String name) { super(); this.name = name; }
 */
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student(int id) {
	super();
	this.id = id;
}
public Student(String name) {
	super();
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void show(){  
    System.out.println(id+" "+name);  
}  
/* Setter Injection
 * public int getId() { return id; } public void setId(int id) { this.id = id; }
 * public String getName() { return name; } public void setName(String name) {
 * this.name = name; }
 */

}
