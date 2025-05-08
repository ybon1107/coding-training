import java.io.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result = new int[3];

        for(int i=0;i<3;i++){
            result[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(result);

        if(Arrays.stream(result).sum() == 180){
            if(result[0] == 60 && result[1] == 60){
                System.out.println("Equilateral");
            } else if(result[0]==result[1] || result[1]==result[2]){
                System.out.println("Isosceles");
            } else{
                System.out.println("Scalene");
            }
        } else{
            System.out.println("Error");
        }
    }
}