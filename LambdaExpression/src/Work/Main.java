package Work;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       // first method--->>
//       MyInterImpl myInter= new MyInterImpl();
//       myInter.sayHello();

        //second method--->>

//        MyInter i= new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is my Ayush");
//            }
//       };
//         i.sayHello();
 //       }

        // using our interface with the help of lambda--->>

        MyInter i=()-> System.out.println("this is my ayush");
        i.sayHello();


        // for suminter ke leye
        SumInter s=(a,b)->{return a+b;};
        System.out.println(s.sum(5,6));
        System.out.println(s.sum(11,13));

        SumInter s1=(a,b)->a+b;
        System.out.println(s.sum(12,14));

        //Lengthinter-->>
        LengthInter lengthInter=str -> str.length();
        System.out.println(lengthInter.getLength("ayushGupta"));
    }
}
