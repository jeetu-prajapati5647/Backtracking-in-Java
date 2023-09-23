public class BasicOfBackTracking {
    private static int total(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int down=total(sr,sc+1,er,ec);
        int right=total(sr+1,sc,er,ec);
        return down+right;
    }

    public static void main(String[] args) {
        int row=2;
        int col=3;
        System.out.println(total(0,0,row,col));
    }
}
