package com.finan.orcamento.model;

import com.finan.orcamento.OrcamentoApplication;

import java.math.BigDecimal;

public class OrcamentoProxy extends OrcamentoModel {
    //valor que deixaremos em proxy
    private BigDecimal descontoOrcamento;
    //Objeto original
    private OrcamentoModel orcamento;
    //Contrutor
    public OrcamentoProxy(BigDecimal descontoOrcamento, OrcamentoModel orcamento) {
        this.descontoOrcamento = descontoOrcamento;
        this.orcamento = orcamento;
    }
    @Override
    public BigDecimal getDescontoOrcamento() {
        if(descontoOrcamento == null){ //se for null chama
            this.descontoOrcamento = orcamento.getDescontoOrcamento(); // Variavel q tu vai criar
        }//se nao for null so mostra o que tem
        return this.descontoOrcamento;
    }
}
