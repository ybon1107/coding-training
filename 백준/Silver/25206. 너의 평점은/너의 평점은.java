import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> grades = new HashMap<>();

        grades.put("A+",4.5);
        grades.put("A0",4.0);
        grades.put("B+",3.5);
        grades.put("B0",3.0);
        grades.put("C+",2.5);
        grades.put("C0",2.0);
        grades.put("D+",1.5);
        grades.put("D0",1.0);
        grades.put("F",0.0);

        double total = 0.0;
        double N = 0.0;

        for(int i=0; i<20; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            String subject = token.nextToken();
            double score = Double.parseDouble(token.nextToken());
            String grade = token.nextToken();

            if(!grade.equals("P")){
                total += grades.get(grade)*score;
                N += score;
            }
        }

        System.out.println(total/N);
    }
}