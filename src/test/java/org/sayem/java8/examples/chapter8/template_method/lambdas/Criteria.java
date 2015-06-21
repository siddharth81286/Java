package org.sayem.java8.examples.chapter8.template_method.lambdas;

import org.sayem.java8.examples.chapter8.template_method.ApplicationDenied;

// BEGIN Criteria
public interface Criteria {

    public void check() throws ApplicationDenied;

}
// END Criteria
