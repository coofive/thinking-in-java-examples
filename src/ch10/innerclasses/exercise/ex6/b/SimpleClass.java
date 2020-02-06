package ch10.innerclasses.exercise.ex6.b;

import ch10.innerclasses.exercise.ex6.a.SimpleInterface;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2/6/2020 4:40 PM
 */
public class SimpleClass {
    protected class Inner implements SimpleInterface {

        public Inner() {
        }

        @Override
        public void f() {
        }
    }
}
