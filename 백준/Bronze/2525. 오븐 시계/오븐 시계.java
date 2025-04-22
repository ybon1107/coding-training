import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(token.nextToken());
        int minute = Integer.parseInt(token.nextToken());
        int cooking = Integer.parseInt(br.readLine());

        hour = hour + (minute+cooking)/60;
        minute = (minute+cooking)%60;

        if(hour>23){
            hour = hour - 24;
        }

        System.out.println(hour + " " + minute);

    }
}