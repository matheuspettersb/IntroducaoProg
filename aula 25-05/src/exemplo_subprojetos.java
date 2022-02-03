public class exemplo_subprojetos
{public static void main(String[] args) 
	{System.out.println("AQUI ESTOU EXECUTANDO O PROGRAMA PRINCIPAL");
	System.out.println("TODA EXECUCAO COMECA AQUI");
	System.out.println("AGORA VOU DESVIAR PARA O SUB-PROGRAMA\n");
	rotinaA();
	System.out.println("AGORA VOLTEI AO PROGRAMA PRINCIPAL E VOU ENCERRAR");
	}
		  
	public static void rotinaA()
	{System.out.println("AGORA ESTOU NA ROTINA A");
	System.out.println("HOUVE UM DESVIO PARA CA");
	System.out.println("AGORA VOU RETORNAR AO PROGRAMA PRINCIPAL\n");
	}
}