package com.praga.datastructures;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static ArrayList<Character> vowelList = new ArrayList<>();
    static ArrayList<Character> mainVList = new ArrayList<>();
    static ArrayList<Character> mainCList = new ArrayList<>();
    
    
    public String rearrange(String S, int N){
        
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        
        int vowelsCount = getVCount(S);
        int constCount  = N - vowelsCount;
        
        if(Math.abs(vowelsCount-constCount) > 1) return "-1";
        
        if(Math.abs(vowelsCount-constCount) == N) return S;
        
        
        boolean isConstFirst = mainCList.get(0) < mainVList.get(0);
        
        StringBuilder sb = new StringBuilder();
        if(isConstFirst){
            for(int i = 0; i < Math.max(vowelsCount, constCount); i++){
                
                if(i < mainCList.size()){
                    sb.append(mainCList.get(i));
                }
                if(i < mainVList.size()){
                    sb.append(mainVList.get(i));
                }
                
            }
        }
        else{
            for(int i = 0; i < Math.max(vowelsCount, constCount); i++){
                
                if(i < mainVList.size()){
                    sb.append(mainVList.get(i));
                }
                if(i < mainCList.size()){
                    sb.append(mainCList.get(i));
                }
                
            }
        }
        
        return sb.toString();
    }
    
    int getVCount(String S){
        int op = 0;
        
        for(int i = 0; i < S.length(); i++){
            if(vowelList.contains(S.charAt(i))){
                mainVList.add(S.charAt(i));
                op++;
            }
            else{
                mainCList.add(S.charAt(i));
            }
        }
        Collections.sort(mainCList);
        Collections.sort(mainVList);
        return op;
    }
}
