import javax.swing.JOptionPane;
public class ExArrayBi
{public static void main(String[] args)
	//NÃO COLOCAR ; DEPOIS DE for
	{int matrizA[][], matrizB[][], matrizC[][], matrizD[][], matrizE[][], i, j,somaDiagPrincipalD, sla,soma;
	String entra;
	matrizA=new int [3][3];
	matrizB=new int [3][3];
	matrizC=new int [3][3];
	matrizD=new int [3][3];
	matrizE=new int [3][3];
	somaDiagPrincipalD=0;
	
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{entra=JOptionPane.showInputDialog("Informe o numero "+(i+1)+(j+1)+" da matriz A");
			matrizA[i][j]=Integer.parseInt(entra);
			}
		}
	System.out.println("\t matriz A:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{System.out.print("\t"+matrizA[i][j]);
			}
		System.out.println();
		}
	System.out.println();
		
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{entra=JOptionPane.showInputDialog("Agora declare o numero"+(i+1)+(j+1)+" da matriz B");
			matrizB[i][j]=Integer.parseInt(entra);
			}
		}
	System.out.println("\t matriz B:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{System.out.print("\t"+matrizB[i][j]);
			}
		System.out.println();
		}
	System.out.println();
	System.out.println("Agora veja a matriz C (C=A+B)");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
	System.out.println("\t matriz C:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			System.out.print("\t"+matrizC[i][j]);
			System.out.println();
		}
	
	System.out.println();
	System.out.println("Matriz D (transposta de C):");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{matrizD[i][j]=matrizC[j][i];
			}
		}
	System.out.println("\t matriz D:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			System.out.print("\t"+matrizD[i][j]);
			System.out.println();
		}
	System.out.println();
	System.out.println("somatorio da diagonal principal de D:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{if (i==j)
				{somaDiagPrincipalD=somaDiagPrincipalD+matrizD[i][j];
				}
			}
		}
	System.out.println("a soma da diagonal principal de D é "+somaDiagPrincipalD);
	
	System.out.println();
	System.out.println("Matriz E (A.B):");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			{soma=0;
			for (sla=0;sla<3;sla++)
				{soma=soma+(matrizA[i][sla]*matrizB[sla][j]);
				}
			matrizE[i][j]=soma;
			}
		}
	System.out.println("\t matriz E:");
	for (i=0;i<3;i++)
		{for (j=0;j<3;j++)
			System.out.print("\t"+matrizE[i][j]);
			System.out.println();
		}
	}
}
