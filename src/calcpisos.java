
import java.util.Scanner;
public class calcpisos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		double largamb,compamb,largpeca,comppeca;
		System.out.println("ATEN��O: TODOS OS VALORES INFORMADOS PRECISAM SER EM M�");
	    System.out.print("informe a largura do ambiente: ");
	    largamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe o comprimento do ambiente: ");
	    compamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe o comprimento da pe�a: ");
	    comppeca=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe a largura da peca: ");
	    largpeca=(Double.parseDouble(sc.nextLine()));
	    
	    double metambiente=largamb*compamb;
	    double metpeca=largpeca*comppeca;
	    double qtdpecas=metambiente/metpeca;
	    
	    System.out.print(qtdpecas+" Pe�as Cer�micas");
	    sc.close();
	}

}
