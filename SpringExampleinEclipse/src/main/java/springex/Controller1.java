package springex;

import org.springframework.stereotype.*;

@Controller
public class Controller1 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.println(name);
	}

}
