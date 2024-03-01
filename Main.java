import java.util.ArrayList;

public class Main {

    static Main Result = new Main();





    public static void main(String[] args) {

        int a = 3;
        int n = (int) Math.pow(10, a);
        int unique = 0;
        int not_unique =0;

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {

                if(i <=10){
                    unique++;
                }
                else if (!Result.checker(arr, i)){
                    unique++;
                }
                else{
                    not_unique++;
                }
            }
        System.out.println("Numbers unique " + unique);
        System.out.println("Numbers NOT unique " + not_unique);
        }

    public boolean checker(ArrayList<Integer> arr, int i) {
        boolean toggle = false;

        String string_number = Integer.toString(arr.get(i));

        for(int k=0; k < string_number.length()-1; k ++){
            if(string_number.charAt(k) == string_number.charAt(k+1)){
                toggle = true;
            }
        }
        return toggle;


    }
}
