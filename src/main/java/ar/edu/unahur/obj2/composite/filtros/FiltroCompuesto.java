package ar.edu.unahur.obj2.composite.filtros;

import java.util.*;

import ar.edu.unahur.obj2.composite.agrupable.Agrupable;

public class FiltroCompuesto implements Agrupable{

    private List<Agrupable> filtros = new ArrayList<>();

    public FiltroCompuesto(List<Agrupable> filtros) {
        this.filtros = filtros;
    }

// los compuestos , vemos que todos los filtros cumplen, 
// es recursivo porque el metodo
// aplicar se llama a si mismo.
    @Override
    public Boolean aplicar() {
        return filtros.stream().allMatch(filtro -> filtro.aplicar());
    
    }

    public void agregarFiltro(Agrupable filtro) {
        filtros.add(filtro);
    }
    
}
