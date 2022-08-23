import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Race extends Thread{
    String name;


    public Race(String name) {
        this.name = name;
    }
    ArrayList<Integer> oddList = new ArrayList<>();
    ArrayList<Integer> evenList = new ArrayList<>();

    @Override
    public void run() {
            for (int i =0;i<=2500;i++){
                System.out.println(this.name+" "+i);
                if(i%2==1){
                    oddList.add(i);
                }else {
                    evenList.add(i);
                }
            }
        }

    }



