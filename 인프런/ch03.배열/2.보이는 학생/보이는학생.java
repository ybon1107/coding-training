import java.io.*;
  
public class Main {

  public void solution(int[] students){   
    int max_height = 0;
    int visiable = 0;
    for(int i=0; i<students.length;i++){
        if(max_height<students[i]){
            visiable ++;
            max_height = students[i];
        }
    }
    System.out.println(visiable);
  }

  public static void main(String[] args) throws IOException {
    Main T = new Main();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] tokens = br.readLine().split(" ");
    int[] students = new int[n];
    for(int i=0; i<n; i++){
        students[i] = Integer.parseInt(tokens[i]);
    }
    T.solution(students);
  }
}