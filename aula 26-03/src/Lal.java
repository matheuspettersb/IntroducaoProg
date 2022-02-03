import javax.swing.JOptionPane;

public class Lal 
{

	public static void main(String[] args)
    	{String entra;
    	int r, altura, alt2,volume,v2, pi,vt;
    	pi = 314/100;
    	entra = JOptionPane.showInputDialog("qual a altura ? (sem a cabeça))");
    	altura = Integer.parseInt(entra);
    	entra = JOptionPane.showInputDialog("qual o raio?");
    	r = Integer.parseInt(entra);
    	entra = JOptionPane.showInputDialog("qual a altura da cabeça?");
		alt2 = Integer.parseInt(entra);
		volume = (r*r*altura*pi);
		v2= (r*r*r*3/4*pi);
		vt= volume + v2;
		System.out.println("o volume do meninão é " + vt + "cm^3");
    	}
}