package exo2;
import java.util.Scanner;

public class Calculette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int nbre1, nbre2;
		int res;

		//ADDITION
		//On recupère les nombres saisis par l'utilisateur
		System.out.print("Entrer un nombre: ");
		nbre1 = clavier.nextInt();
		System.out.print("Entrer un nombre: ");
		nbre2 = clavier.nextInt();
		//On éffectue le calcul et retourne le résultat
		res = nbre1 + nbre2;
		System.out.println(nbre1 + "+" + nbre2 + "=" + res);

		//SOUSTRACTION
		//On recupère les nombres saisis par l'utilisateur
		System.out.print("Entrer un nombre: ");
		nbre1 = clavier.nextInt();
		System.out.print("Entrer un nombre: ");
		nbre2 = clavier.nextInt();
		//On éffectue le calcul et retourne le résultat
		res = nbre1 - nbre2;
		System.out.println(nbre1 + "-" + nbre2 + "=" + res);

		//MULTIPLICATION
		//On recupère les nombres saisis par l'utilisateur
		System.out.print("Entrer un nombre: ");
		nbre1 = clavier.nextInt();
		System.out.print("Entrer un nombre: ");
		nbre2 = clavier.nextInt();
		//On éffectue le calcul et retourne le résultat
		res = nbre1 * nbre2;
		System.out.println(nbre1 + "*" + nbre2 + "=" + res);

		//DIVISION
		//On recupère les nombres saisis par l'utilisateur
		System.out.print("Entrer un nombre: ");
		nbre1 = clavier.nextInt();
		System.out.print("Entrer un nombre: ");
		nbre2 = clavier.nextInt();
		//On éffectue le calcul et retourne le résultat
		res = nbre1 / nbre2;
		System.out.println(nbre1 + "/" + nbre2 + "=" + res);

		//POURCENTAGE
		//On recupère les nombres saisis par l'utilisateur
		System.out.print("Entrer un nombre: ");
		nbre1 = clavier.nextInt();
		System.out.print("Entrer un nombre: ");
		nbre2 = clavier.nextInt();
		//On éffectue le calcul et retourne le résultat
		System.out.println(nbre1 + "% de " + nbre2 + " : " + ((nbre1 * nbre2) / 100.0) + "%");

	}

}
