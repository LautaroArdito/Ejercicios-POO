package Tp4_3;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private double superficie;
    private int idLote;
    private List<String> minerales = new ArrayList<String>();

    //@Override
    public boolean equals(ArrayList<String> o) {
        for (int i=0;i<minerales.size()-1;i++){
            if(minerales.get(i)!=o.get(i))
                return false;
        }
        return true;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getIdLote() {
        return idLote;
    }

    /*public class Lote {
    private double superficie;
    private int idLote;
    private List<String> minerales = new ArrayList<String>();


        public boolean equals (List<String> lote) {
            for (int i = 0; i < minerales.size() ; i++) {
                if (!lote.contains(minerales.get(i)))
                    return false;
            }
            return true;
        }

    public double getSuperficie() {
        return superficie;
    }

    public int getIdLote() {
        return idLote;
    }

   /* public Lote(double superficie, int idLote,String...minerales ) {
        this.minerales = new ArrayList<String>();
        this.superficie = superficie;
        this.idLote = idLote;
        for (String mineral : minerales) {
            this.minerales.add(mineral);
        }
    } //
    public Lote(double superficie, int idLote,List<String> lista ) {
        for(int i=0;i<lista.size();i++)
            this.minerales.add(lista.get(i));
        this.minerales=lista;
        this.superficie = superficie;
        this.idLote = idLote;

    }*/
}
