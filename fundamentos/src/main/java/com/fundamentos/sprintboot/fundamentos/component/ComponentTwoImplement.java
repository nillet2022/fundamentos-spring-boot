package com.fundamentos.sprintboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependecy {
    @Override
    public void saludar() {
        System.out.println("Hola desde mi dependencia dos");
    }
}
