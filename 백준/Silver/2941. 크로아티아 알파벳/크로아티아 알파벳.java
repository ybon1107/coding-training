import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String voca = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] croatias = {"c=","c-","dz=","d-","lj","nj","s=","z="};


        for(String croatia : croatias){
            voca = voca.replace(croatia,"*");
        }
        
        System.out.println(voca.length());
    }
}