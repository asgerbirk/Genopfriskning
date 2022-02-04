
public class ArrayList {



    public boolean doesArrayListContainString(java.util.ArrayList<String> arrayListString, String str){

        if (!arrayListString.contains(str)){
            return false;
        }else {
            System.out.println("The string has been found");
            return true;

        }
    }
}
