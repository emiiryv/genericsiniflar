public class Main {
    public static void main(String[] args) {

        /*String str = null;
        Nullable n =  new Nullable(str);
        n.run();
        */
        /*
        Integer a = 123123;
        NullableInteger n = new NullableInteger(a);
        n.run();
         */
        /*
        Integer a = 12;
        Nullable<Integer> n = new Nullable<>(a);
        n.run();

         */
        /*
        Integer a = 10;
        String b = "asd";
        Double d = 3.14;
        String c = "fgh";
        Test<Integer,String,Double> t = new Test<>(a,b,d);
        t.showInfo();

         */
        /*
        String[] a = {"Java", "Gen", "Flm"};
        Character[] b = {'K', 'L', 'M'};
        Print.printArray(a, b);

         */
        Student<String> stu = new Student<>();
        stu.insert("abc");
    }

}