import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,5,1,2,123,523,523,123,88,99,1};

        for (int i=0;i< arr.length;i++){
            int counter=0;
            boolean isCount=false;

            for (int j=0;j<i;j++){
                if (arr[j]==arr[i]){
                    isCount=true;
                    break;
                }

            }
            if (!isCount){
                for (int k=0;k< arr.length;k++){
                    if (arr[i]==arr[k])
                        counter++;
                }
            }
            if (counter>=2)
                System.out.println(arr[i] +" repeated "+counter+" times.");
        }

    }
}
