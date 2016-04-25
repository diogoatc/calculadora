
import java.util.Scanner;
public class calcpisos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		double largamb,compamb,largpeca,comppeca;
		System.out.println("ATENÇÃO: TODOS OS VALORES INFORMADOS PRECISAM SER EM M²");
	    System.out.print("informe a largura do ambiente: ");
	    largamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe o comprimento do ambiente: ");
	    compamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe o comprimento da peça: ");
	    comppeca=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe a largura da peca: ");
	    largpeca=(Double.parseDouble(sc.nextLine()));
	    
	    double metambiente=largamb*compamb;
	    double metpeca=largpeca*comppeca;
	    double qtdpecas=metambiente/metpeca;
	    
	    System.out.print(qtdpecas+" Peças Cerâmicas");
	    sc.close();
	}

}
