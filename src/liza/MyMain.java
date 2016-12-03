package liza;


import java.util.*;

public class MyMain {



    public static void main(String []args){

        //Demos demo = new Demos();
        BadmintonPlayer jan = new BadmintonPlayer("Jan", "Yonex", 3, "Voltric");
        BasketballPlayer lebron = new BasketballPlayer("Lebron", "Nike", 1, "kklivlend");


        Sportsman[] arr = new Sportsman[2];
        arr[0] = jan;
        arr[1] = lebron;

        List arrL = new ArrayList();
        arrL.add(jan);
        arrL.add(lebron);


        for(int i=0;i<2;i++){
//            arrL.get(i).comp
//            arrL.get(i).sayHi();
        }

//        try {
//            jan.doActivity("watch tv");
//            jan.doActivity("code");
//        }catch (Exception e){
//            System.out.println("ex: "+ e);
//            //e.printStackTrace();
//        }

//
//        Vector<Person> myvec = new Vector<>();
//        myvec.add(liza);
//        myvec.add(jan);



    }
}
