/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author otavio
 */
public class Aluno {
    
    private final List<Double> notas = new ArrayList<>();
    
    private double getMedia() {
        double soma = 0;
        for (double nota : notas)
            soma += nota;
        
        return soma / notas.size();
    }
    
    private boolean estaAprovado(double media) {
        if (this.getMedia() >= media) {
            return true;
        } else {
            return false;
        }
    }

    public List getNotas() {
        return notas;
    }

    public void addNota(double nota) {
        notas.add(nota);
    }
}

