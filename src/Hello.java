class Hello{
    public static void main(String[]args){
        int num1 = 6;
        byte by = 50;
        short sh = 1000;
        long lo = 2500000000l;

        float fl = 5.6f;
        double d = 125.86;

        char c = 'k';

        boolean b = true;

        //Literals
        int x = 100_000_000;
        //System.out.println(x);


        int y = 0b101;
        //System.out.println(y);

        byte z = 0x7f;
        //System.out.println(z);

        double e = 125e10;
        //System.out.println(e);

        //Conversion

        byte b1 = 10;
        int num3 = 257;

        //Si la valeur de num3 excede la valeur maximale de byte alors le resultat est la valeur modulo le range de byte (256)

        //num3 = b1;  //conversion implicite
        b1 = (byte) num3;   //conversion explicite
        //System.out.println(b1);

        int i1 = 2;
        float f1 = 5.8f;

        //f1 = i1;  //Conversion implicite
        i1 = (int) f1;
        System.out.println(i1);






    }
}
