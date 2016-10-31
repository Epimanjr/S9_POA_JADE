package fr.maxinosal.jade;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import java.util.Iterator;

/**
 * java -cp "jade\lib\jade.jar;target\classes" jade.Boot -gui
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class HelloWorldAgent extends Agent {

    protected void setUp() {
        System.out.println("Bonjour, mon nom est : " + this.getLocalName());
    }

    private void searchAgent() {
        int i;
        DFAgentDescription dfd = new DFAgentDescription();

        try {
            DFAgentDescription[] result = DFService.search(this, dfd);
            for (i = 0; i < result.length; i++) {
                DFAgentDescription desc = (DFAgentDescription) result[i];
                String out = desc.getName()+" provide";
                Iterator iter2 = desc.getAllServices();
                while (iter2.hasNext()) {
                    ServiceDescription sd = (ServiceDescription) iter2.next();
                    out += " " + sd.getName();
                }
                System.out.println(this.getLocalName() + ": " + out);
            }
        } catch (Exception fe) {
            System.out.println(this.getLocalName() + " search will DF is not succeded");
            doDelete();
        }
    }

}
