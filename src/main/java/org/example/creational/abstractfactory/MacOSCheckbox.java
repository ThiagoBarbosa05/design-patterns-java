package org.example.creational.abstractfactory;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a variant of a checkbox.
 */

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
