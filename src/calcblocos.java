import java.util.Scanner;
public class calcblocos {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		double largparede,altparede;
		double largtijolo,alttijolo,comptijolo;
		int vez;
	   System.out.println("ATENÇÃO: TODOS OS VALORES PRECISAM ESTAR EM M²");
		System.out.print("Informe a largura da parede: ");
		largparede=(Double.parseDouble(sc.nextLine()));
		System.out.print("Informe a altura da parede: ");
		altparede=(Double.parseDouble(sc.nextLine()));
		System.out.print("Informe a largura do bloco: ");
		largtijolo=(Double.parseDouble(sc.nextLine()));
		System.out.print("Informe a altura do bloco: ");
		alttijolo=(Double.parseDouble(sc.nextLine()));
		System.out.print("Informe o comprimento do bloco: ");
		comptijolo=(Double.parseDouble(sc.nextLine()));
		System.out.println("Informe se a parede é de uma vez ou meia (1 para uma e 2 para meia");
		vez=(Integer.parseInt(sc.nextLine()));
		
		double metragem = largparede*altparede;
		double metbloco=0;
		double qtblocos=0;
		if(vez==1){
			metbloco=largtijolo*comptijolo;
		    qtblocos=metragem/metbloco;
		}else{
			if(vez==2){
				metbloco=comptijolo*alttijolo;
				qtblocos=metragem/metbloco;
			}else{
				System.err.println("OPÇÃO DE VEZ INVÁLIDA, SELECIONE 1 PARA UMA VEZ E 2 PARA MEIA VEZ");
			}
		}
	System.out.println(qtblocos+" Blocos");
	sc.close();
	
	}
	
	}

