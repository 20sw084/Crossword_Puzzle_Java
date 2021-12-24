package jonnyCrosswords;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class GUI implements MouseListener{
	 JFrame jf;
	 JPanel jp1,jp2,jp3;
	 FileReader  fs;
	 JTextField[][] jtf2,jtf3;
//		
//	 	int[] pCols = {0,0,0,0,0,0,0,0,0,0,0,0,0,    
//	 				   1,1,1,1,1,1,1,1,1,1,1,1,1,    
//	 				   2,2,2,2,2,2,2,2,2,2,2,2,2,     
//	 				   3,3,3,3,3,3,3,3,3,3,3,3,3,    
//	 				   4,4,4,4,4,4,4,4,4,4,4,4,4,    
//	 				   5,5,5,5,5,5,5,5,5,5,5,5,5,    
//	 				   6,6,6,6,6,6,6,6,6,6,6,6,6,     
//	 				   7,7,7,7,7,7,7,7,7,7,7,7,7,    
//	 				   8,8,8,8,8,8,8,8,8,8,8,8,8,     
//	 				   9,9,9,9,9,9,9,9,9,9,9,9,9,     
//	 				   10,10,10,10,10,10,10,10,10,10,10,10,10,  
//	 				   11,11,11,11,11,11,11,11,11,11,11,11,11,  
//	 				   12,12,12,12,12,12,12,12,12,12,12,12,12};
////	 	
//	    int[] pRows = {0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,   
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   0,1,2,3,4,5,6,7,8,9,10,11,12,  
//	    			   };
//	   
	 
//	 char[] pChars = {'M', 'A', 'S', 'T', 'E', 'R',' ', 'F', 'E', 'S', 'S', 'U', 'P',
//				'I',' ','W',' ', 'V',' ',' ',' ',' ', 'I', 'T',' ', 'E',
//				'C', 'H', 'A',' ', 'A', 'R', 'C',' ', 'B', 'R','A', 'D','Y', 
//	 			'H', 'A', 'M',' ', 'N',' ', 'A',' ', 'R',' ', 'R',' ', 'T', 
//	 			'A', 'R','I', 'E', 'L',' ', 'R', 'O', 'U', 'N', 'D',' ', 'O', 
//	 			'E', 'P',' ',' ', 'Y',' ', 'L',' ', 'C',' ', 'O',' ', 'N', 
//	 			'L','O', 'O',' ', 'S', 'O', 'L', 'V', 'E',' ', 'M', 'O','M', 
//	 			'P',' ', 'S',' ', 'A',' ', 'E',' ', 'J',' ',' ', 'L', 'A', 
//	 			'H',' ', 'M', 'A', 'C', 'A','W',' ', 'E', 'T', 'H', 'A', 'N',
//	 			'E',' ', 'O',' ', 'E',' ', 'I',' ', 'N',' ', 'A', 'N', 'N', 
//	 			'L', 'A', 'S', 'I', 'K',' ', 'S', 'O', 'N',' ', 'I', 'D', 'I', 
//	 			'P',' ','I', 'D',' ',' ',' ',' ', 'E',' ', 'T',' ', 'N', 
//	 			'S', 'U', 'S', 'A', 'N', 'N',' ', 'C', 'R','Y', 'I', 'N', 'G'};
////	 
	 	int[] pRows = {0,0,0,0,0,0,0,0,0,0,0,0,     1,1,1,1,1,1,    2,2,2,2,2,2,2,2,2,2,2,     3,3,3,3,3,3,3,3,    4,4,4,4,4,4,4,4,4,4,4,4,    5,5,5,5,5,5,5,    6,6,6,6,6,6,6,6,6,6,6,     7,7,7,7,7,7,7,    8,8,8,8,8,8,8,8,8,8,8,     9,9,9,9,9,9,9,9,     10,10,10,10,10,10,10,10,10,10,10,  11,11,11,11,11,11,  12,12,12,12,12,12,12,12,12,12,12,12};
		   
//	 	int[] pRows = {0,0,0,0,0,0,0,0,0,0,0,0,     1,1,1,1,1,1,    2,2,2,2,2,2,2,2,2,2,2,     3,3,3,3,3,3,3,3,    4,4,4,4,4,4,4,4,4,4,4,4,    5,5,5,5,5,5,5,    6,6,6,6,6,6,6,6,6,6,6,     7,7,7,7,7,7,7,    8,8,8,8,8,8,8,8,8,8,8,     9,9,9,9,9,9,9,9,     10,10,10,10,10,10,10,10,10,10,10,  11,11,11,11,11,11,  12,12,12,12,12,12,12,12,12,12,12,12};
	    int[] pCols = {0,1,2,3,4,5,7,8,9,10,11,12,  0,2,4,9,10,12,  0,1,2,4,5,6,8,9,10,11,12,  0,1,2,4,6,8,10,12,  0,1,2,3,4,5,6,7,8,9,10,12,  0,1,4,6,8,10,12,  0,1,2,4,5,6,7,8,10,11,12,  0,2,4,6,8,11,12,  0,2,3,4,5,6,8,9,10,11,12,  0,2,4,6,8,10,11,12,  0,1,2,3,4,6,7,8,10,11,12,          0,2,3,8,10,12,      0,1,2,3,4,5,7,8,9,10,11,12};

	    char[] pChars = {'M','I', 'C', 'H','A','E','L','P','H','E','L','P','S',
	    		'A', 'H','A', 'R','P','O', 'A','U',
	    		'S','W','A','M', 'I','O', 'S','M', 'O','S','I','S', 
	    		'T', 'E','A','I','D','A',
	    		 'E','V','A','N','L','Y','S','A', 'C','E','K', 'N',
	    		 'R','R', 'O','A','N',
	    		 'C', 'A','R','L','L', 'E','W', 'I', 'S',
	    		 'F','O', 'V','O','C',
	    		 'E','B','R', 'U','C','E','J','E',  'N','N', 'E', 'R',
	    		 'S','I','R','N','T','Y',
	    		 'S','T', 'A','R', 'D','O','M','H', 'A','I','T','I',
	    		 'U', 'D','O','L','A', 'N','D','N', 
	    		 'P','E','Y','T','O','N','M','A','N', 'N','I', 'N', 'G'
	    		 };

	    
//	    char[] pChars = {'M', 'A', 'S', 'T', 'E', 'R', 'F', 'E', 'S', 'S', 'U', 'P',
//	    				'I','W', 'V', 'I', 'T', 'E',
//	    				'C', 'H', 'A','A', 'R', 'C', 'B', 'R','A', 'D','Y', 
//			 			'H', 'A', 'M','N', 'A', 'R', 'R', 'T', 
//			 			'A', 'R','I', 'E', 'L', 'R', 'O', 'U', 'N', 'D','O', 
//			 			'E', 'P', 'Y', 'L', 'C','O', 'N', 
//			 			'L','O', 'O', 'S', 'O', 'L', 'V', 'E', 'M', 'O','M', 
//			 			'P','S','A', 'E', 'J', 'L', 'A', 
//			 			'H','M', 'A', 'C', 'A','W','E', 'T', 'H', 'A', 'N',
//			 			'E','O','E', 'I', 'N','A', 'N', 'N', 
//			 			'L', 'A', 'S', 'I', 'K','S', 'O', 'N', 'I', 'D', 'I', 
//			 			'P','I', 'D','E','T','N', 
//			 			'S', 'U', 'S', 'A', 'N', 'N', 'C', 'R','Y', 'I', 'N', 'G'};
	    
	public GUI() {
		jf=new JFrame();
		fs=null;
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(750,700);
		jf.setLayout(null);
		jp1=new JPanel();
//		jp1.setSize(200,450);
		jp1.setBounds(2,3,200,480);
		jp1.setBorder(BorderFactory.createLineBorder(Color.black));
		jp1.setVisible(true);
		jp2=new JPanel();
//		jp2.setSize(205,500);
		jp2.setBounds(205,0,490,545);
		jp2.setBorder(BorderFactory.createLineBorder(Color.black));
		jp2.setVisible(true);
		jp3=new JPanel();
//		jp3.setSize(205,500);
		jp3.setBounds(255,555,300,40);
		jp3.setBorder(BorderFactory.createLineBorder(Color.black));
		jp3.setVisible(true);
		JButton jb1=new JButton();
		jb1.setBounds(570,570,55,15);
		jb1.setText("Check");
		jb1.setFont(new Font(null,Font.PLAIN,6));
		jb1.setVisible(true);
		GridLayout gl=new GridLayout(13,13);

		jtf2=new JTextField[13][13];	
		
		GridLayout gl2=new GridLayout(1,9);
		jp3.setLayout(gl2);
		jtf3=new JTextField[1][9];	


		
		JTextArea text=new JTextArea("Crossword Puzzle Instructions:\n");
		text.setFont(new Font(null,Font.PLAIN,9));
		text.setBounds(5,5,200,550);
		
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				jtf2[i][j]=new JTextField();
				jtf2[i][j].setFocusable(true);
                jtf2[i][j].setHorizontalAlignment(JTextField.CENTER);
                jtf2[i][j].setName(String.valueOf(pChars[i]));
				jtf2[i][j].addMouseListener(this);
			
			}
		}
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<9;j++) {
				jtf3[i][j]=new JTextField(1);
                jtf3[i][j].setHorizontalAlignment(JTextField.CENTER);
				jtf3[i][j].setFont(new Font(null, Font.BOLD, 30));
				jtf3[i][j].setBackground(Color.gray);
			}
		}
		
		try{
			String line=null;
            int j=0;
            fs=new FileReader("C:/Users/hp/eclipse-workspace/jonnyCrosswords/src/puzzle.txt");
            BufferedReader br=new BufferedReader(fs);
            String[] dimensions = br.readLine().split(" ");
//            char[][] letterGrid = new char[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
//            System.out.println(br.readLine());
            
            while ((line=br.readLine())!=null) {
//            	System.out.println(line);
            	String[] str=line.split(" ",13);
            	
            	for(int i=0;i<13;i++) {
            		if(str[i].equals("O")) {
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            			jtf2[j][i].setBackground(Color.WHITE);
            			jtf2[j][i].setForeground(Color.YELLOW);
            		}
            		else if(str[i].equals("X")) {
            			jtf2[j][i].setBackground(Color.BLACK);
//            			jtf2[j][i].setForeground(Color.BLACK);
            			jtf2[j][i].setEditable(false);
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            		}
            		else if(str[i].equals("S")) {
            			jtf2[j][i].setBackground(Color.GRAY);
            			jtf2[j][i].setForeground(Color.YELLOW);
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            		}
            		else if(str[i].equals("H(H)") ){
            			jtf2[j][i].setBackground(Color.decode("#87ceeb"));
            			jtf2[j][i].setForeground(Color.YELLOW);
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            		}
            		else if(str[i].equals("H(C)")) {
            			(jtf2[j][i]).setBackground(Color.decode("#87ceeb"));
            			jtf2[j][i].setForeground(Color.YELLOW);
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            		}
            		else if(str[i].equals("H(Y)") ){
            			jtf2[j][i].setBackground(Color.decode("#87ceeb"));
            			jtf2[j][i].setForeground(Color.YELLOW);
            			jtf2[j][i].setFont(new Font("SansSerif", Font.BOLD, 30));
            		}
            	}
            	j++;
            }
            br.close();
            fs.close();

			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try{
			String line=null;
            int j=0;
            fs=new FileReader("C:/Users/hp/eclipse-workspace/jonnyCrosswords/src/Word.txt");
            BufferedReader br=new BufferedReader(fs);
            String[] dimensions = br.readLine().split(" ");
//    char[][] letterGrid = new char[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
            
            while ((line=br.readLine())!=null) {
            	text.setText(text.getText()+ line+"\n");
            }
            br.close();
            fs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		jp2.setLayout(gl);

		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				jp2.add(jtf2[i][j]);
			}
		}
		jp1.add(text);
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<9;j++) {
				
				jp3.add(jtf3[i][j]);
			}
		}
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				initializeGame();
				checkWords( pCols,pRows, pChars);
//				// TODO Auto-generated method stub
				String strtext="";
				for(int i=0;i<1;i++) {
					for(int j=0;j<9;j++) {
					strtext=strtext+jtf3[i][j].getText();
					}
				}
				String strings[]=new String[26];
				strings[0]="MICHAELPHELPS";
				strings[1]="SUSANN";
				strings[2]="LASIK";
				strings[3]="MASTER";
				strings[4]="HARPO";
				strings[5]="OSMOSIS";
				strings[6]="ARIEL";
				strings[7]="SWAMI";
				strings[8]="LOO";
				strings[9]="MACAW";
				strings[10]="ID";
				strings[11]="EVANLYCASEK";
				strings[12]="SOLVE";
				strings[13]="CARLLEWIS";
				strings[14]="CRYING";
				strings[15]="BRUCEJENNER";
				strings[16]="SIR";
				strings[17]="STARDOM";
				strings[18]="ROUND";
				strings[19]="SON";
				strings[20]="BRADY";
				strings[21]="ETHAN";
				strings[22]="HAITI";
				strings[23]="MOM";
				strings[24]="OLAND";
				strings[25]="PEYTONMANNING";
				strings[25]="ARC";
				Arrays.sort(strings, Collections.reverseOrder());
				int Found=0;
				if(strtext.equals("")) {
					
				}
				else {
				for(int i=0;i<strings.length;i++) {
					if(strings[i].equals(strtext)){
					JOptionPane.showMessageDialog(jf,"Word Found","Success",JOptionPane.INFORMATION_MESSAGE); 
					Found++;		
					initializeGame();
					checkWords(pCols, pRows, pChars);
						}
				}
				if(Found==0) {
					JOptionPane.showMessageDialog(jf,"Word Not Found","Invalid Try",JOptionPane.ERROR_MESSAGE);  
				}
				}
			}

		});
		
		jf.add(jp1);
		jf.add(jp2);
		jf.add(jp3);
		jf.add(jb1);
	}
	
	
	 public void initializeGame() {
	            initializeSlot(pCols, pRows, pChars);
	    }

	 public void initializeSlot(int[] cols, int[] rows, char[] chars) {
        int k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                try {
                	if (i == rows[k] && j == cols[k]) {
                        jtf2[i][j].setBackground(Color.white);
                        jtf2[i][j].setEditable(true);
                        jtf2[i][j].setFocusable(true);
                        jtf2[i][j].setName(String.valueOf(chars[k]));
                        k++;
                    }
                } 
                catch (Exception e) {

                }

            }
        }
    }
    public void checkWords(int[] cols, int[] rows, char[] chars) {
        int k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
//        pRows = {0,0,0,0,0,0,0,0,0,0,0,0,     1,1,1,1,1,1,    2,2,2,2,2,2,2,2,2,2,2,     3,3,3,3,3,3,3,3,    4,4,4,4,4,4,4,4,4,4,4,4,    5,5,5,5,5,5,5,    6,6,6,6,6,6,6,6,6,6,6,     7,7,7,7,7,7,7,    8,8,8,8,8,8,8,8,8,8,8,     9,9,9,9,9,9,9,9,     10,10,10,10,10,10,10,10,10,10,10,  11,11,11,11,11,11,  12,12,12,12,12,12,12,12,12,12,12,12};
//    	  pCols = {0,1,2,3,4,5,7,8,9,10,11,12,  0,2,4,9,10,12,  0,1,2,4,5,6,8,9,10,11,12,  0,1,2,4,6,8,10,12,  0,1,2,3,4,5,6,7,8,9,10,12,  0,1,4,6,8,10,12,  0,1,2,4,5,6,7,8,10,11,12,  0,2,4,6,8,11,12,  0,2,3,4,5,6,8,9,10,11,12,  0,2,4,6,8,10,11,12,  0,1,2,3,4,6,7,8,10,11,12,          0,2,3,8,10,12,      0,1,2,3,4,5,7,8,9,10,11,12};
            	if (i == rows[k] || j == cols[k]) {
//                	  System.out.println("I\t"+i+"\tJ\t"+j+"\tK\t"+k);
                        if (jtf2[i][j].getName().equals(jtf2[i][j].getText())) {
                        	jtf2[i][j].setForeground(new Color(0, 134, 30));
                        	
                        }
                        else {
                        	jtf2[i][j].setForeground(Color.red);
                        }
                        k++;
                  }
            }
        }
        if(checkWin(cols,rows)){
            System.out.println("You Won");
        }
}
    public boolean checkWin(int[] cols,int[] rows){
        int k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                try {
                	if (i == rows[k] && j == cols[k]) {
                        if(jtf2[i][j].getForeground()==Color.red){
                            return false;
                        }
                    }
                } 
                catch (Exception e) {

                }
            }
        }
        return true;
    }
    @Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		 String sysroot = System.getenv("SystemRoot");
//		    try {
//				Process proc = Runtime.getRuntime().exec(sysroot + "/system32/osk.exe");
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}		    
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
