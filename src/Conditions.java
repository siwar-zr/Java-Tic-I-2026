public class Conditions {

    public static void main(String[] args) {
//        int n = 21;
//
//        if (n > 10 && n <= 20) {  //11 --> 20
//            System.out.println("Hello !");
//            System.out.println("Thank you !");
//        }else if (n < 11)
//            System.out.println("Bye !");
//        else
//            System.out.println("GoodBye !");

        //int age = 19;
        //boolean tr = false;

        //String msg = age < 18 ? "Mineur" : tr ? "Majeur et travaille" : "Majeur et ne travaille pas";
        //System.out.println(msg);
        //System.out.println(age < 18 ? "Mineur" : tr ? "Majeur et travaille" : "Majeur et ne travaille pas");
//
//        if (age < 18)
//            System.out.println("Mineur");
//        else {
//            if (tr)
//                System.out.println("Majeur et travaille");
//            else
//                System.out.println("Majeur et ne travaille pas");
//        }

//        int n = 13;
//        int result;

//        if (n % 2 == 0)
//            result = 10;
//        else
//            result = 20;
         //Ternary Operator
        // var = condition ? val si true : val si false
        //var = condition1 ? val si true : condition2 ? val si true : ..... :conditionN ? val si true : val si false
//        result = n % 2 == 0 ? 10 : 20;
//
//        System.out.println(result);

        int n = 6;

        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number");

        }




    }
}
