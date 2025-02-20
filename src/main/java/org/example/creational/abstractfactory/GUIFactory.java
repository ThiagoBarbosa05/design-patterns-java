package org.example.creational.abstractfactory;

/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
