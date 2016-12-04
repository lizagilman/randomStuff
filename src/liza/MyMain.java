package liza;


import OOP.BadmintonPlayer;
import OOP.BasketballPlayer;
import OOP.Sportsman;

import java.util.*;

public class MyMain {

    public static void main(String []args){

        //Demos demo = new Demos();
        BadmintonPlayer jan = new BadmintonPlayer("Jan", "Yonex", 3, "Voltric");
        BasketballPlayer lebron = new BasketballPlayer("Lebron", "Nike", 1, "kklivlend");


        List<Sportsman> arrL = new ArrayList<>();
        arrL.add(jan);
        arrL.add(lebron);


        for(int i=0;i<2;i++){
            (arrL.get(i)).jump();
        }

//        List<String> myl = new ArrayList<>();
//        myl.add("a");
//        myl.add("b");
//        myl.add("c");
//        myl.add("d");
//        Demos demo = new Demos();
//        demo.reverseList(myl);

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
