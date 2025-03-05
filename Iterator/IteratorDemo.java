import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo{


    public static void main(String[] args) {
        
        ArrayList I=new ArrayList<>();

        for(int i=0;i<=10;i++){
            I.add(i);
        }
        System.out.println(I);

        Iterator itr=I.iterator();
        while (itr.hasNext()) {
            Integer integer =(Integer)itr.next();
            if(integer%2==0){
                System.out.println(I);
            }else
                itr.remove();
        }
        System.out.println(I);
    }
}