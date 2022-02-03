
import javax.swing.JOptionPane;

public class saske
{	public static void main(String[] args) 
      {int carro, anofab, imedia, marca, vw, gm, fiat, ford, outros,vw2020;
	  String entra;
	  imedia = 0;
	  vw2020=0;
	  vw=0;
	  gm=0;
	  fiat=0;
	  ford=0;
	  outros=0;
	  for (carro=1; carro<=5; carro=carro+1)
	  	 {entra = JOptionPane.showInputDialog ("qual a marca do carro?");
		  marca = Integer.parseInt(entra);
		  switch (marca)
	  		{case 1: vw=vw+1;
	  		break;
	  		
	  		case 2: gm=gm+1;
	  		break;
	  	
	  		case 3: fiat=fiat+1;
	  		break;
	  		
	  		case 4: ford=ford+1;
	  		break;
	  		
	  		case 5: outros=outros+1;
	  		}
		  entra=JOptionPane.showInputDialog("qual o ano do carro");
		  anofab=Integer.parseInt(entra);
		  imedia=imedia+anofab;
		  if (anofab==2020)
		  	{if (marca==1)
		  		{vw2020=vw2020+1;
		  		}
		  	}
	  	 }
	  imedia=2020-(imedia/5);
	  System.out.println("existem "+vw+" carros da Volkswagen, "+gm+" da GM, "+fiat+ " da fiat, "+ford+" da ford e "+outros+" de outras marcas.");
	  System.out.println("a idade média da frota é "+imedia+" anos");
	  if (vw2020>=1)
	  	{System.out.println("tem "+vw2020+" carros da vw desse ano");
	  	}
	  else
	  	{System.out.println("não tem nenhum carro 2020 da vw na frota");
	  	}
      }
}