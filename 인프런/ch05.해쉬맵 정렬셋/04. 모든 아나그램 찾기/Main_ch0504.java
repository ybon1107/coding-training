package com.inflearn;
import java.io.*;
import java.util.HashMap;

public class Main_ch0504 {

    public void solution(String a, String b){

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()){ bm.put(x, bm.getOrDefault(x,0)+1);}
        int L = b.length()-1;
        for(int i=0; i<L;i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        }

        int lt = 0, answer =0;
        for(int rt = L; rt<a.length();rt ++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer ++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt ++;
        }
        System.out.println(answer);

    }
    public static void main(String[] args) throws IOException {
        Main_ch0504 T = new Main_ch0504();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        T.solution(a, b);
    }
}
