package com.company;
public class Programa {
    
    public static void main(String[] args) {
        
        Conta contaCaio;
        
        Conta contaSamuel;
        
        Conta contaLucas;
        
        contaCaio = new Conta();
        
        contaSamuel = new Conta();
        
        contaLucas = new Conta();
        

        contaSamuel.titular = "Samuel";
        
        contaSamuel.saldo = 384.00;

        contaLucas.titular = "Lucas";
        
        contaLucas.saldo = 8991.00;

        contaCaio.titular = "Caio";
        
        contaCaio.saldo = 2587.00;
        
        contaCaio.numero = 642;
        
        contaCaio.agencia = "0087-2";
        
        contaCaio.dataAbertura = "01/01/2019";
        
        

        contaCaio.saque(0.00);
        
        contaCaio.deposito(0.00);
        

        System.out.println("Saldo atual: " + contaCaio.saldo);
        
        System.out.println("Rendimento mensal: " + contaCaio.rendimento());
        
        System.out.println(contaCaio.dadosConta());
        

        contaLucas = contaSamuel;

        if (contaCaio == contaSamuel) {
            
            System.out.println("As contas são iguais");
            
        } else {
            
            System.out.println("As contas são diferentes");
        }
        

        if (contaLucas == contaSamuel) {
            
            System.out.println("As contas são iguais");
            
        } else {
            System.out.println("As contas são diferentes");
            
        }
    }
}
