
package Reflect;

 
class ReffectDemo1{
    public static void main(String[] args) {
        Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //一般尽量采用这种形式
            demo1=Class.forName("Reflect.ReffectDemo1");
        }catch(Exception e){
            e.printStackTrace();
        }
        demo2=new ReffectDemo1().getClass();
        demo3=ReffectDemo1.class;
         
        System.out.println("类名称   "+demo1.getName());
        System.out.println("类名称   "+demo2.getName());
        System.out.println("类名称   "+demo3.getName());
         
    }
}
