import javax.swing.JOptionPane;
public class arrayBi
{public static void main(String[] args) 
	{int matrizA[][],i,j;
	String entra;
	matrizA = new int[3][3];
	for(i=0; i < 3; i++)
		{for(j=0; j < 3; j++)
			{entra = JOptionPane.showInputDialog("INFORME ELEMENTO " +(i+1) + (j+1)+" DA MATRIZ");
	    	matrizA[i][j] = Integer.parseInt(entra); 
	    	}
	    }
	System.out.println("\t  VEJA A MATRIZ");
	for(i=0; i < 3; i++)
		{for(j=0; j < 3; j++)
	    System.out.print("\t"+matrizA[i][j]);
		System.out.println(); 
	    }	
	}
}