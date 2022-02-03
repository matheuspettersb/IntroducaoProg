import javax.swing.JOptionPane;

public class lista2ex1 
{
	public static void main(String[] args) 
	{int matric,aluno,somamedia,somanota,nota,n,mediaaluno,mediaturma;
	String entra;
	somamedia=0;
		for(aluno=1;aluno<=5;aluno=aluno+1)
			{somanota=0;
			entra = JOptionPane.showInputDialog("Informe a Matrícula "+aluno);
			matric= Integer.parseInt(entra);
			for(nota=1;nota<=4;nota=nota+1);
				{entra=JOptionPane.showInputDialog("informe a nota " +nota);
				n=Integer.parseInt(entra);
				somanota=somanota+n;
				}
			mediaaluno=somanota/4;
			somamedia=somamedia+mediaaluno;
			System.out.println("Aluno matricula "+matric+", a média dele(a) é "+mediaaluno);
			}
		mediaturma=somamedia/5;
		System.out.println("média da turma é "+mediaturma);
	}
}
