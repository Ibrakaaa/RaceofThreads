import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        Race r1 = new Race("Thread -1");
        Race r2 = new Race("Thread -2");
        Race r3 = new Race("Thread -3");
        Race r4 = new Race("Thread -4");

        ArrayList<Integer> racelist = new ArrayList<>(); // main
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();



        ArrayList<Integer> subrlist1 = new ArrayList<>(2500);
        ArrayList<Integer> subrlist2 = new ArrayList<>(2500);
        ArrayList<Integer> subrlist3 = new ArrayList<>(2500);
        ArrayList<Integer> subrlist4 = new ArrayList<>(2500);

        for (int i = 1; i <= 100000; i++) {
            racelist.add(i);
            if(i<2500){
                subrlist1.add(i);
                if(i%2 == 0){
                    evenList.add(i);
                }else{
                    oddList.add(i);
                }
            } else if (i<=5000 && i>2500) {

                subrlist2.add(i);
                if(i%2 == 0){
                    evenList.add(i);
                }else{
                    oddList.add(i);
                }
            } else if (i<=7500 && i>5000) {
                subrlist3.add(i);
                if(i%2 == 0){
                    evenList.add(i);
                }else{
                    oddList.add(i);
                }
            } else if (i<=10000 && i>7500) {
                subrlist4.add(i);
                if(i%2 == 0){
                    evenList.add(i);
                }else{
                    oddList.add(i);
                }
            }
        }
        subrlist1.addAll(racelist.subList(0, 2500));
        subrlist2.addAll(racelist.subList(2500, 5000));
        subrlist3.addAll(racelist.subList(5000, 7500));
        subrlist4.addAll(racelist.subList(7500, 10000));


        System.out.println("=========================");
        r1.run();
        r2.run();
        r3.run();
        r4.run();
        System.out.println("===========================");

        for(Integer a :evenList){
            System.out.println("Even "+a);
        }
        for(Integer b: oddList){
            System.out.println("Odd "+b);
        }


    }



}