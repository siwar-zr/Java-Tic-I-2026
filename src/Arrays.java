class Student{

    int id;
    String name;
    int marks;

    public void infos(){
        System.out.println(id + " : " + name + " : " + marks);
    }

    public int add(int n1,int n2){

        return n1 + n2;
    }
}

public class Arrays {
    public static void main(String args[]) {

        //int nums1[] = {3,5,8,7};
        //Jagged Array
        /*int[][] nums = new int[3][];
        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[2];


        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int) (Math.random()*100);
            }
        }


//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 4; j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }

        for (int[] n: nums){
            for (int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }*/

/*        Student s1 = new Student();
        s1.id = 1;
        s1.name = "John";
        s1. marks = 85;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Maria";
        s2. marks = 98;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Mark";
        s3. marks = 73;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (Student s : students){
            s.infos();
        }*/

        int data = 10;
        Student s1 = new Student();
        int result = s1.add(3,4);
        System.out.println(s1);




    }
}
