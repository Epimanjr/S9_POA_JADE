package fr.maxinosal;

import jade.core.Agent;

public class HelloWorldAgent extends Agent {

    protected void setUp() {
        System.out.println("Bonjour, mon nom est : " + this.getLocalName());
    }
}