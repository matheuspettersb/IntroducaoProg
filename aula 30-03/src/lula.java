import javax.swing.JOptionPane;

public class lula
{
	public static void main(String[] args)
	{int nmotoristas, idosas, molieres,sexobixo, dmenor,veiogeral,idade = 0,pmenozada,pmanomuie,pveios;
	String entra;
	idosas = 0;
	molieres = 0;
	dmenor = 0;
	veiogeral = 0;
	sexobixo=0;
	pmanomuie=0;
	pmenozada=0;
	
	for (nmotoristas=1;nmotoristas<=5;nmotoristas=nmotoristas+1)
		{entra = JOptionPane.showInputDialog("Qual o kkkkk sexo? M=1, F=2");
		sexobixo = Integer.parseInt(entra);
		if (sexobixo == 2)
			{molieres = molieres +1;
			}
		entra = JOptionPane.showInputDialog("qual a o seu ano de nascimento?");
		idade = Integer.parseInt(entra);
		idade = 2020 - idade;
		if (idade<21)
			{dmenor=dmenor +1;
			}
		if (idade>60)
			{if (sexobixo==2)
				{idosas = idosas +1;
				}
			veiogeral = veiogeral +1;
			}
		}
	pmenozada=dmenor*100/(nmotoristas-1);
	System.out.println("a porcentagem de menores de 21 é "+pmenozada+ "% dos motoriastas");
	pmanomuie=molieres*100/(nmotoristas-1);
	System.out.println("a porcentagem de mulheres nomotoristas é "+pmanomuie+ "% do total");
	pveios=veiogeral*100/(nmotoristas-1);
	System.out.println("e por fim, temos "+veiogeral+" ("+pveios+"%) idosos no transito, sendo destes, "+idosas+" mulheres");
	}
}