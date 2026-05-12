package exceptions;

//Error
//1) Compile time Error
//2) Runtime Error => Exception Handling
//3) Logical Error

class NullValueException extends Exception{
    public NullValueException(String msg){
        super(msg);
    }
}
public class Demo {
    public static void main(String[] args) {

        //System.out.Println("Bonjour");
        //System.out.println(1+2);
        int i = 20;
        int j = 0;
        //ligne critique : peut dans un certain cas lancer une exception
        /*int[] nums = new int[5];
        String str = null;*/

        try{
            //System.out.println("Hello");
            //System.out.println(str.length());
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);
            j = 18/i;
            if(j == 0){
                throw new NullValueException("J cannot be zero");
            }

        }catch(ArithmeticException e){
            //System.out.println(e.getMessage());
            j = 18;
            System.out.println("this is the default value");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur limit");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(NullValueException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");

        /*try{
            Class.forName("Demo");
        }catch(Exception e){

        }*/

    }
}
