package fes.aragon.inicio;

import java.util.Random;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;


public class Problemas {
		
		public static void main(String[] args) {
			Arreglos<Integer> numeros=new Arreglos<>(10);
			Random rd=new Random();
			int aux=0;
			for(int i=0;i<numeros.longitud();i++) {
			for(int j=0;j<numeros.longitud();j++) {
			if(numeros.recupera(j)>numeros.recupera(j+1)) {
			aux=numeros.recupera(j);
			}
			}
			System.out.println(n);
			}
			}


}
