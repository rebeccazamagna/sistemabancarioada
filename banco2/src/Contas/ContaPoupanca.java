package Contas;

import Usuario.Cliente;
import Enum.Status;


public class ContaPoupanca extends Conta {


    public ContaPoupanca(String id, double saldo, Status status, Cliente cliente) {
        super(id, saldo, status, cliente);
    }




}