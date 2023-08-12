package org.example.model;

public class Money{
	private String ccyNmEN;
	private String ccyNmUZC;
	private String diff;
	private String rate;
	private String ccy;
	private String ccyNmRU;
	private int id;
	private String ccyNmUZ;
	private String code;
	private String nominal;
	private String date;

	public void setCcyNmEN(String ccyNmEN){
		this.ccyNmEN = ccyNmEN;
	}

	public String getCcyNmEN(){
		return ccyNmEN;
	}

	public void setCcyNmUZC(String ccyNmUZC){
		this.ccyNmUZC = ccyNmUZC;
	}

	public String getCcyNmUZC(){
		return ccyNmUZC;
	}

	public void setDiff(String diff){
		this.diff = diff;
	}

	public String getDiff(){
		return diff;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getRate(){
		return rate;
	}

	public void setCcy(String ccy){
		this.ccy = ccy;
	}

	public String getCcy(){
		return ccy;
	}

	public void setCcyNmRU(String ccyNmRU){
		this.ccyNmRU = ccyNmRU;
	}

	public String getCcyNmRU(){
		return ccyNmRU;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCcyNmUZ(String ccyNmUZ){
		this.ccyNmUZ = ccyNmUZ;
	}

	public String getCcyNmUZ(){
		return ccyNmUZ;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setNominal(String nominal){
		this.nominal = nominal;
	}

	public String getNominal(){
		return nominal;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"Money{" + 
			"ccyNm_EN = '" + ccyNmEN + '\'' + 
			",ccyNm_UZC = '" + ccyNmUZC + '\'' + 
			",diff = '" + diff + '\'' + 
			",rate = '" + rate + '\'' + 
			",ccy = '" + ccy + '\'' + 
			",ccyNm_RU = '" + ccyNmRU + '\'' + 
			",id = '" + id + '\'' + 
			",ccyNm_UZ = '" + ccyNmUZ + '\'' + 
			",code = '" + code + '\'' + 
			",nominal = '" + nominal + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}
