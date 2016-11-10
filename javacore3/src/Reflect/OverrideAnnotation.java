package Reflect;
class Message{


/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//return super.toString();
		return "HelloWorld";
	}
}

public class OverrideAnnotation 
{
	
	public static void main (String[] args) 
	{
		System.out.println(new Message());
	}

}

