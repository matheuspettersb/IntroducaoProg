import javax.swing.JOptionPane;
public class exercício
{public static void main(String[] args)
	{int x, y, troca;
	String entra;
	entra=JOptionPane.showInputDialog("Digite X:");
	x=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("Digite Y:");
	y=Integer.parseInt(entra);
	System.out.println("x: "+x+"\ty: "+y);
	troca(x,y);
	System.out.println("x: "+x+"\ty: "+y);
	}
	
	public static int troca(int n1, int n2)
	{System.out.println("<entrou no subprograma>");
	int troca;
	troca=n1;
	n1=n2;
	n2=troca;
	return n1;
	return n2;
	}
}

