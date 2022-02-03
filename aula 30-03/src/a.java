import javax.swing.JOptionPane;

public class a
{	public static void main(String[] args) 
	  {int candidatos,gados,manomuie,idade,sexo,m45,f35,exp,p45,p35,somaidadeh,xph,idademedia;
	  gados=0;
	  manomuie=0;
	  idade=0;
	  m45=0;
	  f35=0;
	  exp=0;
	  xph=0;
	  somaidadeh=0;
	  
	  String entra;
	  for(candidatos=1;candidatos<=10;candidatos=candidatos+1)
	  	{entra = JOptionPane.showInputDialog ("qual o teu sexo? m=1, f=2");
	  	sexo = Integer.parseInt(entra);
	  	if (sexo==1)
	  		{gados=gados+1;
	  		}
	  	else
	  		{manomuie=manomuie+1;
	  		}	
	  	entra = JOptionPane.showInputDialog ("tem experiencia? s=1 e n=2");
	  	exp = Integer.parseInt(entra);
	  
	  	entra = JOptionPane.showInputDialog ("qual a tua idade?");
	  	idade = Integer.parseInt(entra);
	  	if(sexo==2)
	  		{if(exp==1)
	  			{if (idade<35)
	  				{f35 = f35 +1;
	  				}
	  			}
	  		}
	  	if(sexo==1)
	  		{if(idade>45)
	  			{m45=m45+1;
	  			}
	  		}
	  	if(sexo==1)
	  		{if(exp==1)
	  			{somaidadeh=somaidadeh+idade;
		  		xph=xph+1;
	  			}
	  		}
	  	}
		System.out.println("quantidade de candidato muie = "+manomuie);
		System.out.println("quantidade de candidato homi = "+gados);
		
		idademedia=somaidadeh/xph;
	    System.out.println("idade media dos homens com experiencia = "+idademedia);
	    
	    p45=m45*100/gados;
	    System.out.println("a porcentagem de homens com mais de 45 em relação ao total de homens é "+p45+"%");
	    System.out.println("a quantidade de mulheres c menos de 35 e experiencia é "+f35);
	  }
}