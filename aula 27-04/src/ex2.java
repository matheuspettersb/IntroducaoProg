import javax.swing.JOptionPane;

public class ex2
{public static void main(String[] args)
	{int area[],sala,media;
	String entra;
	media=0;
	
	area=new int [10];
	for (sala=0; sala<10;sala=sala+1)
		{entra=JOptionPane.showInputDialog("informe a area da sala");
		area[sala]=Integer.parseInt(entra);
		media=media+area[sala];
		System.out.println("sala "+sala+", area: "+area[sala]+" m²");
		}
	media=media/10;
	System.out.println("media = "+media+" m²");
	for (sala=0;sala<10;sala++);
		{if (area[sala]>media)
			{System.out.println("area da sala "+sala+" é maior que a média");
			}
		}
	}
}