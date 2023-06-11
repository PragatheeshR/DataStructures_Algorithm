package com.praga.datastructures;

import java.util.HashMap;

public class Solutions {

	public String rankTeams(String[] votes) {

        int statMatrix[][] = new int[votes[0].length()][votes[0].length()];
        String indexRefer = votes[0];
        HashMap<Character, Integer> refMap = new HashMap<>();
        int rank = 0;
        for(char a : votes[0].toCharArray()){
            refMap.put(a, rank++);
        }

        System.out.println(refMap);

        for(int j = 0 ;j < votes.length; j++){
            String a = votes[j];
            for(int i = 0; i < a.length(); i++){
                //refMap.get(a.charAt(i));
            statMatrix[refMap.get(a.charAt(i))][i]++;

            }
            
        }
        for(int[] a: statMatrix){
            for(int b: a){
                System.out.print(b+" ");
            
            }
            System.out.println("");
        }
        String op = "";
        for(int j = 0; j < statMatrix[0].length; j++){
            char a = '_';
            int max = 0;
            System.out.println("****");
            for(int i = 0; i < votes[0].length(); i++){
//                System.out.println("i "+i+" j "+j);
//                System.out.println("value "+statMatrix[j][i]);
//                System.out.println("test "+statMatrix[1][0]);
                if(statMatrix[i][j] != 0){
                    System.out.println("Inside if "+i);
                    if(max <= statMatrix[i][j]){
                       // System.out.println("i "+i+" j "+j);
                        max = statMatrix[i][j];
                        if(a != '_'){
                            a = a < votes[0].charAt(i) ? votes[0].charAt(i) : a;
                            System.out.println("i "+a);
                        }
                        else{
                        	if(op.contains(""+a)) continue;
                            a = votes[0].charAt(i);
                            System.out.println("ias "+a);
                        }
                    }
                }
            }
            op += a;
        }
        System.out.println(op);
        return op;

        /*for(int[] a: statMatrix){
            for(int b: a){
                System.out.print(b+" ");
            
            }
            System.out.println("");
        }
        return "";*/
        
    }
	
	public static void main(String[] args) {
		String[] op = {"WXYZ","XYZW"};
		Solutions so = new Solutions();
		so.rankTeams(op);

	}

}
