package enumerations;

enum Status{
    Pending, Failed, Running, Success
}
public class Demo {
    public static void main(String[] args) {

        int i = 5;
        Status s = Status.Pending;
        Status[] ss = Status.values();

        //System.out.println(s.ordinal());
        for(Status st : ss){
            System.out.println(st + " : " + st.ordinal());
        }

        Status t = Status.valueOf("Success");
        System.out.println(t);

    }
}
