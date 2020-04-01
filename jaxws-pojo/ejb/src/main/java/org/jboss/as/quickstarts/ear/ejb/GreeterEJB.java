
package org.jboss.as.quickstarts.ear.ejb;

import javax.ejb.Stateful;

/**
 * A simple Hello World EJB. The EJB does not use an interface.
 *
 * @author paul.robinson@redhat.com, 2011-12-21
 */
@Stateful
public class GreeterEJB {
    /**
     * This method takes a name and returns a personalised greeting.
     *
     * @param input
     *            the name of the person to be greeted
     * @return the personalised greeting.
     */
    public String sayHello(String input) {
        return "JSEBean pojo: " + input;
    }
}
