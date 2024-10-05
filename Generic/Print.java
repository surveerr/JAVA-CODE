package Generic;

public class Print {

    public static <T extends PrintInterface> void printArray(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].Print();
        }
    }

    public static <T extends Comparable<T>> void ArraySort(T[] sort) {
        int n = sort.length - 1;
        boolean swapOccurred = true;
        for (int i = n; i > 0 && swapOccurred == true; i--) {
            swapOccurred = false;
            for (int j = 0; j < i; j++) {
                if ((sort[j]).compareTo(sort[j + 1]) > 0) {
                    T temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                    swapOccurred = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Integer arr[] = new Integer[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = i + 1;
        // }
        // printArray(arr);

        // String arrS[] = new String[5];
        // for (int i = 0; i < arrS.length; i++) {
        // arrS[i] = "abc";
        // }
        // printArray(arrS);

        Vehicle v[] = new Vehicle[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new Vehicle(10 * i, "BMW");
        }
        printArray(v);

        Student s[] = new Student[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student(i);
        }
        printArray(s);

        Integer arr[] = { 5, 3, 6, 2, 1 };
        Print.ArraySort(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }

        String S[] = { "def", "abc", "mno", "ghi", "pqr" };
        Print.ArraySort(S);
        for (String i : S) {
            System.out.println(i);
        }
    }

}
