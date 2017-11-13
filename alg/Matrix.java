public class Matrix {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int[][] a = new int[num][num];
        int[][] b = new int[num][num];
        for (int i =0; i < num; i ++) {
          a[i][i] = i*2;
          b[i][i] = i;
        }
        int[][] c;
        c = add(a, b);
        c = multiply(c, a);
        c = custom(c, b);
        System.out.println(c[0]);
    }
    
    private int[][] a;
    private int[][] b;
    private int[][] c;
    
    public int[][] getA() {
        return this.a;
    }
    
    public void setA(int[][] a) {
        this.a = a;
    }
    
    public int[][] getB() {
        return this.a;
    }
    
    public void setB(int[][] b) {
        this.b = b;
    }
    
    public int[][] getC() {
        return this.a;
    }
    
    public void setC(int[][] c) {
        this.c = c;
    }
    
    public static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }
    
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
    
    public static int[][] custom(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                c[i][j] = Math.max(a[i][j], b[i][j]) +
                          (int)Math.pow(a[i][j], 2)       +
                          (int)Math.pow(b[i][j], 2);
        return c;
    }
}

