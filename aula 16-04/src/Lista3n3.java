import javax.swing.JOptionPane;

public class Lista3n3
{
	public static void main(String[] args)
	{int opção,sala,larg,comp,area,areamedia,sareamedia,nsalas,bigarea,bigsala;
	String entra;
	sareamedia=0;
	nsalas=0;
	bigarea=0;
	bigsala=0;
	do {entra=JOptionPane.showInputDialog("escolhe ai\n\n\t1. registrar nova  sala\n\t0. terminar");
		opção=Integer.parseInt(entra);
		larg=0;
		comp=0;
		switch(opção)
			{case 1:entra=JOptionPane.showInputDialog("informe o numero da sala");
			sala=Integer.parseInt(entra);
			entra=JOptionPane.showInputDialog("informe a largura da sala");
			larg=Integer.parseInt(entra);
			entra=JOptionPane.showInputDialog("informe o comprimento da sala");
			comp=Integer.parseInt(entra);
			area=larg*comp;
			if(area>bigarea)
				{bigarea=area;
				bigsala=sala;
				}
			sareamedia=sareamedia+area;
			nsalas=nsalas+1;
			System.out.println("Sala: "+sala+"    Área: "+area+"m²");
			break;
		
			case 0:areamedia=sareamedia/nsalas;
			System.out.println("Área média das salas "+areamedia+"m²");
			System.out.println("maior sala foi a "+bigsala+ ", com "+bigarea+"m²");
			}
		}while(opção!=0);
	}

}
