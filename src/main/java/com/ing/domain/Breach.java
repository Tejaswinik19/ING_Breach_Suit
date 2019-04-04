package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "breach")
public class Breach {

	@Id
	@GeneratedValue
	private Long id;

	
	private String franchies;
	private String bussness_area;
	private String identify_by;
	private String c_full_name;
	
	private String c_supply;
	
	private String reported_to;
	private String company_name;
	private String contact_details;
	private String aware_of_breach;
	private String breach_date;
	private String aware_of;
	private String where_and_when_aware;
	private String breach_category;
	private String number_faxed;
	private String info_misplaced;
	private String own_word;
	private String breach_cause;
	private String customre_name;
	private String info_comprimesd;
	private String  risk_profile;
	
	
	
	public String getC_supply() {
		return c_supply;
	}

	public void setC_supply(String c_supply) {
		this.c_supply = c_supply;
	}

	public String getReported_to() {
		return reported_to;
	}

	public void setReported_to(String reported_to) {
		this.reported_to = reported_to;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getContact_details() {
		return contact_details;
	}

	public void setContact_details(String contact_details) {
		this.contact_details = contact_details;
	}

	public String getAware_of_breach() {
		return aware_of_breach;
	}

	public void setAware_of_breach(String aware_of_breach) {
		this.aware_of_breach = aware_of_breach;
	}

	public String getBreach_date() {
		return breach_date;
	}

	public void setBreach_date(String breach_date) {
		this.breach_date = breach_date;
	}

	public String getAware_of() {
		return aware_of;
	}

	public void setAware_of(String aware_of) {
		this.aware_of = aware_of;
	}

	public String getWhere_and_when_aware() {
		return where_and_when_aware;
	}

	public void setWhere_and_when_aware(String where_and_when_aware) {
		this.where_and_when_aware = where_and_when_aware;
	}

	public String getBreach_category() {
		return breach_category;
	}

	public void setBreach_category(String breach_category) {
		this.breach_category = breach_category;
	}

	public String getNumber_faxed() {
		return number_faxed;
	}

	public void setNumber_faxed(String number_faxed) {
		this.number_faxed = number_faxed;
	}

	public String getInfo_misplaced() {
		return info_misplaced;
	}

	public void setInfo_misplaced(String info_misplaced) {
		this.info_misplaced = info_misplaced;
	}

	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFranchies() {
		return franchies;
	}

	public void setFranchies(String franchies) {
		this.franchies = franchies;
	}

	public String getBussness_area() {
		return bussness_area;
	}

	public void setBussness_area(String bussness_area) {
		this.bussness_area = bussness_area;
	}

	public String getIdentify_by() {
		return identify_by;
	}

	public void setIdentify_by(String identify_by) {
		this.identify_by = identify_by;
	}

	public String getC_full_name() {
		return c_full_name;
	}

	public void setC_full_name(String c_full_name) {
		this.c_full_name = c_full_name;
	}

	public Breach(Long id) {
		super();
		this.id = id;
	}

	public Breach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOwn_word() {
		return own_word;
	}

	public void setOwn_word(String own_word) {
		this.own_word = own_word;
	}

	public String getBreach_cause() {
		return breach_cause;
	}

	public void setBreach_cause(String breach_cause) {
		this.breach_cause = breach_cause;
	}

	public String getCustomre_name() {
		return customre_name;
	}

	public void setCustomre_name(String customre_name) {
		this.customre_name = customre_name;
	}

	public String getInfo_comprimesd() {
		return info_comprimesd;
	}

	public void setInfo_comprimesd(String info_comprimesd) {
		this.info_comprimesd = info_comprimesd;
	}

	public String getRisk_profile() {
		return risk_profile;
	}

	public void setRisk_profile(String risk_profile) {
		this.risk_profile = risk_profile;
	}

}
