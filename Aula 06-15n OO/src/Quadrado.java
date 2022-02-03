public class Quadrado
{//Atributos:
 private int lado;
 private String cor;

 //Métodos:
public Quadrado(int ld, String cr)
	{lado = ld;
	cor=cr;
	}
public int area()
	{int result;
	result=lado*lado;
	return result;
	}

public int perimetro()
	{int prmt;
	prmt=4*lado;
	return prmt;
	}
public void pintar(String como)
	{cor=como;
	}
}
