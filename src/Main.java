import java.util.*;

public class Main {
    public static void main(String[] args) {
        String chuoi = "hfdawhwhcoomdd";
        int soChu = demChu(chuoi);
        System.out.println(soChu);

    }
    public static int demChu(String chuoi) {
        List<String> list = Arrays.asList(new String[]{"aw", "aa", "dd", "ee", "oo", "ow", "w"});
        String [] arr = chuoi.split("");
        int count = 0;
        for (int i = 0; i< arr.length-1; i++) {
            // truong hop 2 ki tu
            if (list.contains(arr[i]+arr[i+1])) {
                count++;
            }
            // kí tu w
            if (arr[i+1].equals("w") && !arr[i].equals("a") && !arr[i].equals("o") ){
                count++;
            }
        }
        // ki tu w dung dau
        if (arr[0].equals("w")){
            count++;
        }
        return count;
    }
}