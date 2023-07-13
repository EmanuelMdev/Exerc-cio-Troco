import java.util.Scanner;
public class Code {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int resposta = 1;
	do {
  System.out.println("Digite um numero e eu lhe darei o troco");
  long num = in.nextLong();
  if (num >= 10) {
  long notas10 = (num / 10);

  String numString = String.valueOf(num);
  
  char numfim = numString.charAt(numString.length()-1);
  if (numfim == '0') {
	  numfim = 0;
  };
  if (numfim == '1') {
	  numfim = 1;
  };
  if (numfim == '2') {
	  numfim = 2;
  };
  if (numfim == '3') {
	  numfim = 3;
  };
  if (numfim == '4') {
	  numfim = 4;
  };
  if (numfim == '5') {
	  numfim = 5;
  };
  if (numfim == '6') {
	  numfim = 6;
  };
  if (numfim == '7') {
	  numfim = 7;
  };
  if (numfim == '8') {
	  numfim = 8;
  };
  if (numfim == '9') {
	  numfim = 9;
  };
  long notas5 = (numfim / 5);
  
  long notas2 = 0;
  
  
  if (numfim == 2 || numfim == 4 || numfim == 6 || numfim == 8) {
	  notas2 = (numfim / 2);
	  notas5 = 0;
  }
  
  if (numfim == 3) {
	  notas10 = notas10 - 1;
	  notas5 = 1;
	  notas2 = 4;
  }
  if (numfim == 1) {
	  notas10 = notas10 - 1;
	  notas5 = 1;
	  notas2 = 3;
  }
  if (numfim == 7) {
	  notas2 = 1;
  }
  if (numfim == 9) {
	  notas10 = notas10 - 1;
	  notas5 = 1;
	  notas2 = 2;
  }
  
  System.out.println("--------------- \nSeu troco é: \nNotas de 10: " + notas10 + "\nNotas de 5: " + notas5 + "\nNotas de 2: " + notas2);
} else if (num == 1 || num == 3) {
	  System.out.println("--------------- \nSeu troco é: \nNotas de 10: NULL" + "\nNotas de 5: NULL" + "\nNotas de 2: NULL");
} else {
	long notas2 = 0;
	if (num % 2 == 0) {
		  notas2 = (num / 2);
	}
		  long notas5 = (num / 5);
		  System.out.println("--------------- \nSeu troco é: \nNotas de 10: 0" + "\nNotas de 5: " + notas5 + "\nNotas de 2: " + notas2);
	  }
  System.out.println("--------------- \nQuer tentar novamente? (1) Sim (2) Não");
  resposta = in.nextInt();
  
  if (resposta == 2){
	  System.out.println("------------------- \nTenha um ótimo dia! \n-------------------");
  }
	} while (resposta == 1);
  }
}