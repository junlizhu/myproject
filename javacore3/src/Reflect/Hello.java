package Reflect;


import lombok.Getter;
import lombok.Setter;

class Person2{
	@Getter@Setter
	
	private String name;
	@Getter@Setter
	private int age;
	
	@Override
	public String toString() {
		return "[" + this.name+ ", age=" +this.age + "]";
	}
	
	
}


 class Hello {

	public static void main(String[] args) {
		Class<?>demo = null;
		try {
			demo=Class.forName("Reflect.Person2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person2 per= null;
		 
			
					try {
						per=(Person2)demo.newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			
		per.setName("zhangsan");
	    per.setAge(26);
	    System.out.println(per);
	    
	}

}
