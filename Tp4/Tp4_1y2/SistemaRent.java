package Tp4_1y2;
import java.util.List;
import java.util.ArrayList;
//import Tp4_1y2.ElemRent;

public class SistemaRent {
    //Atributos
    private List<ElemRent> elem = new ArrayList<ElemRent>();

    //Metodos
    public void addElem(ElemRent e){
        if (!elem.contains(e)){
            e.setStatus(false);
            elem.add(e);
        }
    }

    public void deleteElem(ElemRent e){
        if (elem.contains(e)){
            elem.remove(e);
        }
    }

    public int buscarElem(ElemRent e){
        for(int i=0; i <= elem.size() ; i++) {
            if (elem.get(i).getnSerie() == e.getnSerie())
                return i;
        }
        return -1;
    }

    public boolean estaAlquilado(ElemRent e){
        int i = buscarElem(e);
        if (i > -1)
            return elem.get(i).isStatus();
        else
            return false;
    }

   public void alquilarElem(ElemRent e){
        int i = buscarElem(e);
        if (i > -1)
            elem.get(i).setStatus(true);
   }
   public void devolverElem(ElemRent e){
        int i = buscarElem(e);
        if(i > -1)
            elem.get(i).setStatus(false);
   }
} //nos vemos gente, me voy a dormir, los quiero mucho
