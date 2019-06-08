package br.com.farmacia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTROLE_ESTOQUE")
public class farmacia {
	@Id
	@GeneratedValue
	@Column(name="MEDICAMENTO")
	private medicamento id;
	
    @Column(name="DATA_PRODUCAO")
	private data_producao
}
