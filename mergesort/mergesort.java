package mergesort;

public class mergesort {
    private int[] data;

    public mergesort (int... N)
    {
        int[] data = new int[N.length];
        int i = 0;
        for (int num: N){
            data[i] = num;
            i++;
        }

    }

    public int[] Sort (int[] N)
    {
        if (data.length < 2){
            //how do I return nothing in java?
        }
        int[] a = new int[data.length/2];
        int[] b = new int[data.length - a.length];
        if (a.length > 1){
            a = Sort(a);
        }
        if (b.length > 1){
            b = Sort(b);
        }
        return merge(a, b);
    }

    private int[] merge (int[] a, int[]b)
    {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int r = 0;
        while (i < a.length && j < b.length){
            if (a[i] == b[j]){
                res[r] = a[i];
                i++;
                j++;
                r++;
            }
            if (a[i] < b[j]){
                res[r] = a[i];
                i++;
                r++;
            }
            if (a[i] > b[j]){
                res[r] = b[j];
                j++;
                r++;
            }
        }
        return res;
    }

}
