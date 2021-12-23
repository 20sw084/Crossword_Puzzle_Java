package testCWP16;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Crossword {
	char[][] letterGrid;
	private static enum squares {O,X,S,H};

	public Crossword(){
		Scanner sc = new Scanner(new File("puzzle.txt"));
		char[][] crossword = new char [13][13];
		for (int i=0; i<10; i++) {
			String str = sc.next();
			crossword[i]=str.toCharArray();
		}
		switch(square) {
		case "Black square":
			letter='X';
			break;
		case "White square":
			letter='O';
			break;
		case "Grey square":
			letter='S';
			break;
		case "Blue square":
			letter='H';
			break;	
			
		}
		
	}
	public static void main(String[] args) {
		
		
		ArrayList<String> words = new ArrayList<>();
		words.add("MICHAELPHELPS");
		words.add("HARPO");
		words.add("SWAMI");
		words.add("OSMOSIS");
		words.add("IDA");
		words.add("EVANLYSACEK");
		words.add("CARLLEWIS");
		words.add("BRUCEJENNER");
		words.add("SIR");
		words.add("STARDOM");
		words.add("HAITI");
		words.add("OLAND");
		words.add("PEYTONMANNING");
		
		words.add("MASTER");
		words.add("FESSUP");
		words.add("IT");
		words.add("CHA");
		words.add("ARC");
		words.add("BRADY");
		words.add("HAM");
		words.add("ARIEL");
		words.add("ROUND");
		words.add("EP");
		words.add("LOO");
		words.add("SOLVE");
		words.add("MOM");
		words.add("LA");
		words.add("MACAW");
		words.add("ETHAN");
		words.add("ANN");
		words.add("LASIK");
		words.add("SON");
		words.add("IDI");
		words.add("ID");
		words.add("SUSANN");
		words.add("CRYING");
		for(int i=0; i<words.size();i++) {
			System.out.println(words.get(i));
		}
		System.out.println("\nOUTPUT:\n");
		int index;
		solveCr(crossword,words,index=0);
	}
	public static void solveCr(char[][] crossword,ArrayList<String> words,int index) {
        if(index==words.size()) {
        	printC(crossword);
        	return;
        }
        String current = words.get(index);
        for(int i=0; i<crossword.length;i++) {
        	for(int j=0; j<crossword.length;j++) {
        		if (crossword[i][j]=='0' || crossword[i][j]==current.charAt(0)) {
        			if (canplaceH(crossword,current,i,j)==true) {
        				boolean[] wePlaced = placeH(crossword,current,i,j);
        				solveCr(crossword,words,index+1);
        				unplaceH(crossword,wePlaced,i,j);	
        			}
        			if (canplaceV(crossword,current,i,j)==true) {
        				boolean[] wePlaced = placeV(crossword,current,i,j);
        				solveCr(crossword,words,index+1);
        				unplaceV(crossword,wePlaced,i,j);	
        			}
        		}
        	}
        }
	}
   /* checks if the word can be placed horizontally from index i,j */
   public static boolean canplaceH(char[][] crossword,String current, int i, int j) {
	   if (j-1>=0 && crossword[i][j-1]!='X') return false;
	   if(j+current.length()<crossword.length && crossword[i][j+current.length()]!='X')
		   return false;
	   
	   for(int x= 0; x<current.length(); x++) {
		   if (x+i>=crossword.length) return false;
		   if (crossword[i][x+j]=='0' || crossword[i][x+j]==current.charAt(x)) {
			   continue;
		   }else {
			   return false;
		   }
	   }
	   return true;
   }
   /* places the word horizontally from index i,j */		   
	public static boolean[] placeH(char[][] crossword, String current, int i, int j) {
		boolean[] res=new boolean[current.length()];
		for (int k=0; k<current.length(); k++) {
			if(crossword[i][j+k]=='0') {
				res[k]=true;
				crossword[i][j+k]=current.charAt(k);
			}
			else res[k]=false;
		}
		return res;
	}
	/* places the word vertically from index i,j */
	public static boolean[] placeV(char[][] crossword, String current, int i, int j) {
		boolean[] res=new boolean[current.length()];
		for (int k=0; k<current.length(); k++) {
			if(crossword[i][j+k]=='0') {
				res[k]=true;
				crossword[i][j+k]=current.charAt(k);
			}
			else res[k]=false;
		}
		return res;
	}
	/* backtrack using the boolean array horizontally*/
	public static void unplaceH(char[][] crossword,boolean[] arr, int i, int j) {
		for (int k=0; k<arr.length; k++) {
			if(arr[k]){
				crossword[i][j+k]='0';
			}
		}
	}
	/* backtrack using the boolean array vertically*/
	public static void unplaceV(char[][] crossword,boolean[] arr, int i, int j) {
		for (int k=0; k<arr.length; k++) {
			if(arr[k]){
				crossword[i][j+k]='0';
			}
		}
	}
	/* Prints the crossword puzzle */
	public static void printC(char[][] crossword) {
		for (int i=0; i<crossword.length; i++){
			for (int j=0; i<crossword.length; j++){
				System.out.print(crossword[i][j]+" ");
			}
			System.out.println();
		   }
		}	
}
