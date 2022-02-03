import javax.swing.JOptionPane;
public class UsaFigura
{public static void main(String[] args)
	{int num, aux;
	String entra;
	//variavel do tipo "Quadrado"
	Quadrado meu, teu;
	entra = JOptionPane.showInputDialog("Informe o lado do quadrado meu");
	num = Integer.parseInt(entra);
	entra = JOptionPane.showInputDialog("Informe a cor do quadrado meu");
	meu = new Quadrado(num,entra);
	aux = meu.area();
	System.out.println("area Meu = "+aux);
	aux = meu.perimetro();
	System.out.println("perimetro Meu = "+aux);
	teu = new Quadrado(5,"sas");
	System.out.println("area Teu = "+teu.area());
	System.out.println("perimetro Teu = "+teu.perimetro());
	}
}