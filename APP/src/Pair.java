import java.util.*;

public class Pair<T, P>  implements PublisherSH{
    T fst;
    P snd;
    List <Shoutable> subs;

    public Pair (T first, P second){
        fst = first;
        snd = second;
        subs = new ArrayList<Shoutable>();

    }
    
    public T getFst(){
        for(Shoutable a: subs){
            a.shout();

        }
        return fst;
    }

    public P getSnd(){
        return snd;
    }

    public  void subscribe(Shoutable a){
        subs.add(a);


        
    }
    public String toString(){
        return"(" + fst + ", " +snd+ ")";

    }
}
