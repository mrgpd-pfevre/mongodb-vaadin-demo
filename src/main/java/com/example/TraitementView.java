package com.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("/traitement")
public class TraitementView extends VerticalLayout {

    public TraitementView(TraitementService service) {
        GridCrud<ImportTraitement> crud = new GridCrud<>(ImportTraitement.class, service);
        add(crud);
        setSizeFull();
    }

}
