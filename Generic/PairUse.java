package Generic;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, Integer> pSI = new Pair<String, Integer>("def", 10);
        Pair<Pair<String, Integer>, String> p = new Pair<>();
        p.setfirst(pSI);
        System.out.println(p.getfirst());
        System.out.println(p.getfirst().getfirst() + " " + p.getfirst().getsecond());
        p.setsecond("abc");
        System.out.println(p.getsecond());

        // Pair<String> pS = new Pair<String>("AA", "BB");
        // System.out.println(pS.getfirst() + " " + pS.getsecond());

        // Pair<Integer> pI = new Pair<Integer>(10, 20);
        // System.out.println(pI.getfirst() + " " + pI.getsecond());

        // Pair<Double> pD = new Pair<Double>(3.14, 3.14);
        // System.out.println(pD.getfirst() + " " + pD.getsecond());

        // Pair<Character> pC = new Pair<Character>('a', 'b');
        // System.out.println(pC.getfirst() + " " + pC.getsecond());
    }
}
