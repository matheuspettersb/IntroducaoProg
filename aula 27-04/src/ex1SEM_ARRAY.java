import javax.swing.JOptionPane;

public class ex1SEM_ARRAY
{
	public static void main(String[] args)
	{int media,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,menor;
	String entra;
	menor=0;
	entra=JOptionPane.showInputDialog("qual a idade?");
	i1=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i2=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i3=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i4=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i5=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i6=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i7=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i8=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i9=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("qual a idade?");
	i10=Integer.parseInt(entra);
	media=(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10)/10;
	System.out.println("a média é "+media+" anos");
	if (i1<media)
		{menor=menor+1;
		}
	if (i2<media)
		{menor=menor+1;
		}
	if (i3<media)
		{menor=menor+1;
		}
	if (i4<media)
		{menor=menor+1;
		}
	if (i5<media)
		{menor=menor+1;
		}
	if (i6<media)
		{menor=menor+1;
		}
	if (i7<media)
		{menor=menor+1;
		}
	if (i8<media)
		{menor=menor+1;
		}
	if (i9<media)
		{menor=menor+1;
		}
	if (i10<media)
		{menor=menor+1;
		}
	System.out.println("tem "+menor+" alunos abaixo da media");
	}
}