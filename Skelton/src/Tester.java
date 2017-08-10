
public class Tester {
    public static void main(String[] args) {
        Pazzel p = new Pazzel(7,5);
        Words words = new Words(new String[]{"זוהר","שלום","להתראות"});
        boolean sucess;
        System.out.println(words);
        sucess = p.addWord(0,0,words.getWord(0),true);
        sucess = p.addWord(0,0,words.getWord(0),false);
        System.out.println(sucess);
        System.out.println(p);


    }
}
