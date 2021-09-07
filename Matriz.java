package clase.principal.m;

public class Matriz {
    private int tam;
    
    //con el constructor colocado se asigna el valor de la variable propuesta 
    //en la clase Main de la variable global de esta subclase
    public Matriz(int tam){
        this.tam = tam;
    }
    public void matriz(){
        
        //tipodedato[][] nombre = new tipodedato[tamaño][tamaño]
        int[][] mat = new int[tam][tam];
        
        //el siguiente for da un valor aleatorio a la colocacion de la matriz
        for(int n=0; n<tam; n++){
            for(int m=0; m<tam; m++){
                mat[n][m]=(int)(Math.random()*101);
            }
        }
        
        //Este for imprime la matriz
        for(int n=0; n<tam; n++){
            for(int m=0; m<tam; m++){
                System.out.print(mat[n][m] + "   ");
            }
            System.out.println();
        }
    }
}
