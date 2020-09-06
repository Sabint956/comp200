public class App implements Shoutable{
    public static void main(String[] args) throws Exception {
        Pair <Integer, Character> p = new Pair <Integer, Character> (1,'c');
      
        App a=  new App();
        p.subscribe(a);
        System.out.println(p);
        Integer q = p.getFst();
        Integer r = p.getFst();
        System.out.println(q);


        }
        public void shout(){
            System.out.println(" I observed somethnhs on changeds of data");
        }
    }

