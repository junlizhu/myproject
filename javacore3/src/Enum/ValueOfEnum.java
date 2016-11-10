package Enum;

public  enum  ValueOfEnum {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    

	public static void main(String[] args) {
		ValueOfEnum a = ValueOfEnum.valueOf(ValueOfEnum.class,"SATURDAY");
		System.out.println(a);
	}

}
