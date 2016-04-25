
import java.util.Scanner;
public class calctinta {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double agmult,altparede,largparede;
	int demao;
	
	System.out.println("ATENÇÃO: TODOS OS VALORES INFORMADOS PRECISAM SER EM M²");
    System.out.print("informe a altura da parede: ");
    altparede=(Double.parseDouble(sc.nextLine()));
    System.out.print("informe a largura da parede: ");
    largparede=(Double.parseDouble(sc.nextLine()));
    System.out.print("informe a quantidade de demaos(maximo 3): ");
    demao=(Integer.parseInt(sc.nextLine()));
    System.out.print("informe o agente multiplicador da tinta(em l/m²): ");
    agmult=(Double.parseDouble(sc.nextLine()));
    
    double areaparede=altparede*largparede;
    double qtdtinta= (areaparede*agmult*demao);
    
    System.out.print(qtdtinta+" Litros de Tinta");
    sc.close();
	}

}
