package fr.maxinosal.jade;

import jade.core.Agent;

/**
 * java -cp "jade\lib\jade.jar;target\classes" jade.Boot -gui
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class HelloWorldAgent extends Agent {

    protected void setUp() {
        System.out.println("Bonjour, mon nom est : " + this.getLocalName());
    }
}