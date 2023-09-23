package PAndC;

import java.util.ArrayList;
import java.util.List;

public class PermutationOnString {
  static   List<String> rec(String p, String up, List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            rec(f+ch+s,up.substring(1),ans);
        }
        return ans;

    }
    public static void main(String[] args) {
        int n=3;
        String s="";
        for(int i=1;i<=n;i++){
            s=s+n;
        }
        List<String> l=new ArrayList<>();
        List<String> ans=rec("",s,l);
        System.out.println(ans);

    }
}
