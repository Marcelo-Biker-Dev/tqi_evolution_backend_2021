package com.marceloBikerDev.loanAppuser.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcao")
public class Funcao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String funcaoName;
	
	public Funcao(Long id, String funcaoName) {
		super();
		this.id = id;
		this.funcaoName = funcaoName;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFuncaoName() {
		return funcaoName;
	}
	public void setFuncaoName(String funcaoName) {
		this.funcaoName = funcaoName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funcaoName == null) ? 0 : funcaoName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcao other = (Funcao) obj;
		if (funcaoName == null) {
			if (other.funcaoName != null)
				return false;
		} else if (!funcaoName.equals(other.funcaoName))
			return false;
		return true;
	}	

	

}
