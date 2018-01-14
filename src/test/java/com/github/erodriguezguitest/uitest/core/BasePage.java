package com.github.erodriguezguitest.uitest.core;

import org.jboss.arquillian.graphene.Graphene;

public abstract class BasePage {

    public void navegar() {
        Graphene.goTo(this.getClass());
    }

}