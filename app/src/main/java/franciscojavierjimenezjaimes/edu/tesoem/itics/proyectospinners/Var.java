package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectospinners;

import java.util.ArrayList;
public class Var {
    public static ArrayList<String> colores = new ArrayList<String>();

    //Forma de utilizar la variable con array.add() ubicado en addActivity para agregar color;

    public  static  void agrega(String coloress){
        colores.add(coloress);
    }

    public static ArrayList<String> miscolores(){
        return colores;
    }

}
