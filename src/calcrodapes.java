
import java.util.Scanner;
public class calcrodapes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double largamb,compamb,tampeca=0;
		int opcao;
		System.out.println("ATENÇÃO: TODOS OS VALORES INFORMADOS PRECISAM SER EM M²");
	    System.out.print("informe a largura do ambiente: ");
	    largamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("informe o comprimento do ambiente: ");
	    compamb=(Double.parseDouble(sc.nextLine()));
	    System.out.print("Selecione a opcao do rodape - 1(1,2m) 2(1,5m) 3(1,8m): ");
	    opcao=(Integer.parseInt(sc.nextLine()));
	    
	    switch (opcao){
	    
	    case 1 :
    	    tampeca=1.2;
	        break;
	    case 2 :
	    	tampeca=1.5;
	    	break;
	    case 3 :
	        tampeca=1.8;
	        break;
	       
	     default :
	    	 System.out.println("Informe uma opção valida");
	    	 break;
	    }
	    
	    double diametro=((largamb*2)+(compamb*2));
	    double qtpecas= diametro/tampeca;
	    
	    System.out.println(qtpecas+" Peças de Rodapé");
	    
	    sc.close();
	}

}
