import javax.swing.JOptionPane;

public class dowhile 
{
	public static void main(String[] args) 
	{int op�ao,ladoa,ladob,hipotenusa,area,perimetro,respop;
	String entra;
	do {entra = JOptionPane.showInputDialog("BORA CALCULAR PORRA" +
											"\n\n\t1. �rea o Quadrado\n\t2. �rea do Retangulo"+
											"\n\t3. �rea do Tri�ngulo\n\t4. Per�metro Quadrado"+
											"\n\t5. Per�metro do Ret�ngulo\n\t6.Per�metro do Tri�ngulo"+
											"\n\t7.VAZALE\n\nQUAL FOI, FOI ONTEM. AGORA � QUAL VAI SE? ");
		op�ao=Integer.parseInt(entra);
		ladoa=0;
		if (op�ao<=6)
		{entra=JOptionPane.showInputDialog("MANDA O LADO MAIOR AE, MENOR(ou o qqr um dos dois se for quadraar)");
		ladoa=Integer.parseInt(entra);
		}
			switch(op�ao) 
			{case 1: respop=ladoa*ladoa;
			System.out.println("area do quaaq � "+respop+" unidadedemedida�");
			break;
			
			case 2: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, LEK");
			ladob=Integer.parseInt(entra);
			respop=ladoa*ladob;
			System.out.println("area do rataang � "+respop+" unidadedemedida�");
			break;
			
			case 3: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, MANIN");
			ladob=Integer.parseInt(entra);
			respop=(ladoa*ladob)/2;
			System.out.println("area do trigiig � "+respop+" unidadedemedida�");
			break;
			
			case 4: respop=ladoa*4;
			System.out.println("perimetro do quaaq � "+respop+" unidadedemedida");
			break;
			
			case 5: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, LEK");
			ladob=Integer.parseInt(entra);
			respop=(ladoa*2) + (ladob*2);
			System.out.println("perimetro do retaang � "+respop+" unidadedemedida");
			break;
			
			case 6:entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, MANIN");
			ladob=Integer.parseInt(entra);
			entra=JOptionPane.showInputDialog("A HIPOTENUSA SHOW");
			hipotenusa=Integer.parseInt(entra);
			respop=hipotenusa+ladoa+ladob;
			System.out.println("perimetro do trigiig � "+respop+" unidadedemedida");
			break;
			
			case 7: System.out.println("VAI ESTUDAR, GEI");
			
			}
		}while (op�ao!=7);
	}
}