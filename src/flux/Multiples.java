package flux;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Multiples {
	private double val;

	public Multiples(double val) {
		this.val = val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir = new File("/root/fichiers_eclipse");
			File fic=new File(dir,"multiples.txt");
			if (!fic.exists()) {
				dir.mkdirs();
				fic.createNewFile();
			}
			FileOutputStream f = new FileOutputStream(fic);
			DataOutputStream out = new DataOutputStream(f);
			System.out.println("entrer le reel:");
			Scanner sc=new Scanner(System.in);
			double val=sc.nextDouble();
			System.out.println("donner le nombre de fois:");
			int n=sc.nextInt();
			Multiples m=new Multiples(val);
			m.remplirFichier(out, n);
			System.out.printf("%.2f",val);
			System.out.println("fin de l'algorithme");
			f.close();
			out.close();
			sc.close();

			
		} catch (IOException e) {

		}
	}

	public void remplirFichier(DataOutputStream out,int n ) throws IOException{
		BufferedWriter tt=new BufferedWriter(new OutputStreamWriter(out));
		
		double tab[]=new double[5];
		for (int i = 0; i < n; i++) {
			System.out.println(val*(i+1));
			tt.write(val*(i+1)+"");
		}
		
		
	}

}
