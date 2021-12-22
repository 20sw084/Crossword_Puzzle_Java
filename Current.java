package jonnyCrosswords;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class GUI {
	 JFrame jf;
	 JPanel jp1,jp2,jp3;
	 FileReader  fs;
	public GUI() {
		jf=new JFrame();
		fs=null;
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(750,700);
		jf.setLayout(null);
		jp1=new JPanel();
//		jp1.setSize(200,450);
		jp1.setBounds(2,3,200,450);
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
		
		try{
            fs=new FileReader("C:/Users/hp/eclipse-workspace/jonnyCrosswords/src/puzzle.txt");
            BufferedReader br=new BufferedReader(fs);
            String[] dimensions = br.readLine().split(" ");
            char[][] letterGrid = new char[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
            String line=null;
            while ((line=br.readLine())!=null) {
            	String[] str=line.split(" ",13);
            	for(int i=0;i<str.length;i++) {
            		
            	}
            }

			}
		catch(Exception e) {
			e.printStackTrace();
		}
		jf.add(jp1);
		jf.add(jp2);
		jf.add(jp3);
		jf.add(jb1);
	}
}
