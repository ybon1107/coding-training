import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(token.nextToken());
        int minute = Integer.parseInt(token.nextToken());

        if(minute-45 < 0){
            hour --;
            minute = minute + 15;
            if(hour < 0){
                hour = hour + 24;
            }
        } else{
            minute = minute - 45;
        }
        System.out.println(hour + " " + minute);
    }
}