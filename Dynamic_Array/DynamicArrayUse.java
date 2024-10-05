package Dynamic_Array;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            d.add(100 + i);
        }
        System.out.println("size: " + d.size());

        try {
            d.set(-3, 10000);
        } catch (IndexOutOfBoundException e) {
            System.out.println("Index Out Of Bound Exception");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }
        // d.set(169, 170);
        // System.out.println(d.getElement(169));
        // d.add(3, 55555);
        while (!d.isEmpty()) {
            System.out.println(d.removeLast());
            System.out.println("size: " + d.size());

        }

    }

}
