public class UnionFind{
    private int[] arr;
    
    public UnionFind (int N)
    {
        arr = new int[N];
        for (int i = 0; i < N; i ++) arr[i] = i;
    }

    //I should really keep track of branch length here, but I don't think it's worth the
    //trouble of returning multiple items for what won't be a huge benefit in the long run
    private int root (int N)
    {
        while (arr[N] != N)
            arr[N] = arr[arr[N]];
            N = arr[N];
        return N;
    }

    public void join (int A, int B)
    {
        A = root(A);
        B = root(B);
        arr[A] = B;
    }

    public boolean connected (int A, int B)
    {
        A = root(A);
        B = root(B);
        return A == B;
    }
}