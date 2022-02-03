import javax.swing.JOptionPane;
public class perhaps_trab
{public static void main(String[] args)
	{int A[][], B[][], C[][], D[][],somaDiagonal;
	A = new int [4][4];
	B = new int [4][4];
	C = new int [4][4];
	D = new int [4][4];
	
	SubGerar(A);
	SubTransposta(A,B);
	SubSoma(A,B,C);
	SubMult(A,B,D);
	
	System.out.println("\tMATRIZ A:");
	SubMostrar(A);
	System.out.println("\n\tMATRIZ B:");
	SubMostrar(B);
	System.out.println("\n\tMATRIZ C:");
	SubMostrar(C);
	System.out.println("\n\tMATRIZ D:");
	SubMostrar(D);
	
	System.out.println("\n\tDIAGONAL A:");
	somaDiagonal = SubDiag(A);
	System.out.println("\t"+somaDiagonal);
	System.out.println("\n\tDIAGONAL B:");
	somaDiagonal = SubDiag(B);
	System.out.println("\t"+somaDiagonal);
	System.out.println("\n\tDIAGONAL C:");
	somaDiagonal = SubDiag(C);
	System.out.println("\t"+somaDiagonal);
	System.out.println("\n\tDIAGONAL D:");
	somaDiagonal = SubDiag(D);
	System.out.println("\t"+somaDiagonal);
	
	
	}


public static void SubGerar(int matrizA[][])
	{int i,j;
	String entra;
	for (i=0;i<4;i++)
		{for (j=0;j<4;j++)
			{entra=JOptionPane.showInputDialog("Manda o numero irmao ("+(i+1)+","+(j+1)+"):");
			matrizA[i][j]=Integer.parseInt(entra);
			}
		}
	}


public static void SubTransposta(int matrizA[][], int matrizB[][])
	{int i,j;
	for (i=0;i<4;i++)
		{for (j=0;j<4;j++)
			{matrizB[i][j]=matrizA[j][i];
			}
		}
	}


public static void SubSoma(int matrizA[][], int matrizB[][], int matrizC[][])
	{int i,j;
	for (i=0;i<4;i++)
		{for (j=0;j<4;j++)
			{matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
	}


public static void SubMult(int matrizA[][], int matrizB[][], int matrizD[][])
	{int i,j,k;
	for (i=0;i<4;i++)
		{for (j=0;j<4;j++)
			{matrizD[i][j]=0;
			for (k=0;k<4;k++)
					{matrizD[i][j]= 4*(matrizA[i][k] * matrizB[k][j]);
					}
			}
		}
	}


public static void SubMostrar(int matriz[][])
	{int i,j;
    for(i=0; i < 4; i++)
    	{for(j=0; j < 4; j++)
    		{System.out.print("\t"+matriz[i][j]);
    		System.out.print("");
    		}
    	System.out.println("");
    	}	
	}


public static int SubDiag(int matriz[][])
	{int i,j,somaDiag = 0;
	for(i=0; i < 4; i++)
		{for(j=0; j < 4; j++)
			{if (i==j)
				{somaDiag=somaDiag+matriz[i][j];
				}
			}
		}
	return somaDiag;
	}
}