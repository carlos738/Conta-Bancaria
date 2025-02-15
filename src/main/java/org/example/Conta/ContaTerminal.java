package org.example.Conta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ContaTerminal {

    private String agencia;
    private Integer numeroDaAgencia;
    private String nomeDoCliente;
    private String numeroDaConta;
    private  Double saldo;


    public ContaTerminal() {

    }
}
