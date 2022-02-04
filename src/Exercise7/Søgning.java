package Exercise7;

import java.util.ArrayList;

public class Søgning {
    public static void main(String[] args) {

    }
    public static void match(String str, ArrayList<String> arrayString){
        try{
            if(arrayString.contains(str)){
                System.out.println(arrayString.indexOf(str));
            }else {
                System.out.println(-1);
            }

        }catch (Exception e){
            System.out.println("not found");
        }

    }
}
