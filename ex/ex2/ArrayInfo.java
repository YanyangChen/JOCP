package ex2;

public class ArrayInfo { 
    static int cal(int[] a) {
        if (a.length < 5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int sum = 0;
        for (int i=0;i<5;i++) {
            sum += a[i];
            System.out.println("Adding element " + i + " to sum");
        }
        return sum;
    }
    
    static int cal2(int[] a) {
        if (a.length == 7) {
            throw new ArrayWith7Elements();
        }
        int sum = 0;
        for (int i=0;i<5;i++) {
            sum += a[i];
            System.out.println("Adding element " + i + " to sum");
        }
        return sum;
    }
}

