import java.util.*;
class A{
	
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		float N1=0, N2=0, N3=0, N4=0, MD=0,NOVA_MD=0, EX=0;
		N1 = scan.nextFloat();
		N2 = scan.nextFloat();
		N3 = scan.nextFloat();
		N4 = scan.nextFloat();
		MD = (N1+N2+N3+N4)/4;
		if(MD>=7){
			System.out.printf("Aluno Aprovado %f\n",MD);
		} else {
			EX = scan.nextFloat();
			NOVA_MD = (MD + EX) /2;
			if (NOVA_MD >= 5) {
				System.out.printf("Aluno Aprovado em Exame %f\n",NOVA_MD);
				} else {
				System.out.printf("Aluno Reprovado %f\n",NOVA_MD);
				}
		
		}
	}

}
