package org.example.creational.factorymethod;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test button</button>");
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello world!'");
    }
}
