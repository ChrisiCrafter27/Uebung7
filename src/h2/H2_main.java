package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {

    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if(end <= start) return new int[]{};
        if(Arrays.compare(a, b) != 0) return Arrays.copyOfRange(a, 0, a.length);
        Arrays.sort(a);
        return Arrays.copyOfRange(a, start, end);
    }
}
