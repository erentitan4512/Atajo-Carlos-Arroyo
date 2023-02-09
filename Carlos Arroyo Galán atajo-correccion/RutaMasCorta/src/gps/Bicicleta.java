package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<camino1.length; i++)
        {
            sum1 += camino1[i];
            sum2 += camino2[i];
            sum3 += camino3[i];
        }
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return " camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return " camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return " camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return " camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return " caminos 1 y 3";
            }else if(sum2 == sum3){
                return " caminos 2 y 3";
            }else{
                return " caminos 1 y 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {1,1,1,1,1,1,1,1,1}; //El error se estaba dando debido a que los arrays no estaban igualados, en camino 1 habian 5, en camino 2 7, y en camino 3 9, mi solucion a sido igualarlos todos a 9.
        int[] camino2 = {0,0,0,0,0,0,0,0,0};
        int[] camino3 = {0,0,0,0,0,0,0,0,0};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

