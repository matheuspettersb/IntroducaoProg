import javax.swing.JOptionPane;

public class dowhile 
{
	public static void main(String[] args) 
	{int opçao,ladoa,ladob,hipotenusa,area,perimetro,respop;
	String entra;
	do {entra = JOptionPane.showInputDialog("BORA CALCULAR PORRA" +
											"\n\n\t1. Área o Quadrado\n\t2. Área do Retangulo"+
											"\n\t3. Área do Triângulo\n\t4. Perímetro Quadrado"+
											"\n\t5. Perímetro do Retângulo\n\t6.Perímetro do Triângulo"+
											"\n\t7.VAZALE\n\nQUAL FOI, FOI ONTEM. AGORA É QUAL VAI SE? ");
		opçao=Integer.parseInt(entra);
		ladoa=0;
		if (opçao<=6)
		{entra=JOptionPane.showInputDialog("MANDA O LADO MAIOR AE, MENOR(ou o qqr um dos dois se for quadraar)");
		ladoa=Integer.parseInt(entra);
		}
			switch(opçao) 
			{case 1: respop=ladoa*ladoa;
			System.out.println("area do quaaq é "+respop+" unidadedemedida²");
			break;
			
			case 2: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, LEK");
			ladob=Integer.parseInt(entra);
			respop=ladoa*ladob;
			System.out.println("area do rataang é "+respop+" unidadedemedida²");
			break;
			
			case 3: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, MANIN");
			ladob=Integer.parseInt(entra);
			respop=(ladoa*ladob)/2;
			System.out.println("area do trigiig é "+respop+" unidadedemedida²");
			break;
			
			case 4: respop=ladoa*4;
			System.out.println("perimetro do quaaq é "+respop+" unidadedemedida");
			break;
			
			case 5: entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, LEK");
			ladob=Integer.parseInt(entra);
			respop=(ladoa*2) + (ladob*2);
			System.out.println("perimetro do retaang é "+respop+" unidadedemedida");
			break;
			
			case 6:entra=JOptionPane.showInputDialog("AGORA O LADO MENOR, MANIN");
			ladob=Integer.parseInt(entra);
			entra=JOptionPane.showInputDialog("A HIPOTENUSA SHOW");
			hipotenusa=Integer.parseInt(entra);
			respop=hipotenusa+ladoa+ladob;
			System.out.println("perimetro do trigiig é "+respop+" unidadedemedida");
			break;
			
			case 7: System.out.println("VAI ESTUDAR, GEI");
			
			}
		}while (opçao!=7);
	}
}