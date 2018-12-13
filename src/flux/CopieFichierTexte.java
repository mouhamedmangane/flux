package flux;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopieFichierTexte {
	private String source;
	private String destination;

	public CopieFichierTexte(String source,String destination) {
		this.source=source;
		this.destination=destination;
	}

	public static void main(String[] args) {

			CopieFichierTexte c=new CopieFichierTexte("/root/Documents/PP.txt","/root/Documents/mp.txt");
			System.out.println("fin");
			try {
				c.copieLignes();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void copieCaracteres() throws IOException {
		int c;
		FileReader in=new FileReader(this.source);
		FileWriter out=new FileWriter(this.destination);
		BufferedReader bf=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		while((c=bf.read())!=-1) {
			System.out.println(c);
			bw.write(c);
		}
		bf.close();
		bw.close();
		in.close();
		out.close();
	}

	public void copieLignes() throws IOException {
		String ch;
		FileReader in=new FileReader(this.source);
		FileWriter out=new FileWriter(this.destination);
		BufferedReader bf=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		while((ch=bf.readLine())!=null) {
			bw.write(ch);
		}
		bf.close();
		bw.close();
		in.close();
		out.close();
	}
}
