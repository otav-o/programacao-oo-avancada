package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio
 */
public class Calculadora {
    public static double getIMC(double altura, double peso) {
        return peso / (altura * altura);
    }
}
