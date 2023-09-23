public class RatInMaze4Dr {
   static void paths(String p,int sr,int er,int sc,int ec){
       if(sr==er && sc==ec){
           System.out.println(p);
           return;
       }
       if(sr<er){
           paths(p+"D",sr+1,er,sc,ec);
       }
       if(sr>0){
           paths(p+"U",sr-1,er,sc,ec);
       }
       if(sc>0){
           paths(p+"L",sr,er,sc-1,ec);
       }
       if(sc<ec){
           paths(p+"R",sr,er,sc+1,ec);
       }

    }
    public static void main(String[] args) {
       paths("",0,0,2,2);

    }
}
