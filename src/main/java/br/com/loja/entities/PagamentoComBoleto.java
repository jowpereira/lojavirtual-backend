package br.com.loja.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.loja.entities.enuns.EstadoPagamento;

@Entity
@Table(name = "pagamentos_com_boleto")
public class PagamentoComBoleto extends Pagamento{
	
	private static final long serialVersionUID = 1L;
	
	private Date dataVencidmento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencidmento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencidmento = dataVencidmento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencidmento() {
		return dataVencidmento;
	}

	public void setDataVencidmento(Date dataVencidmento) {
		this.dataVencidmento = dataVencidmento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
