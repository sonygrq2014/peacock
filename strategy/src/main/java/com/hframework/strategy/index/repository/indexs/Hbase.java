package com.hframework.strategy.index.repository.indexs;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * generated by hframework on 2017.
 */@XStreamAlias("hbase")
public class Hbase   {

	@XStreamAsAttribute
    @XStreamAlias("zklist")
	private String zklist;
	@XStreamAsAttribute
    @XStreamAlias("zkport")
	private String zkport;
	@XStreamAsAttribute
    @XStreamAlias("table")
	private String table;
	@XStreamAsAttribute
    @XStreamAlias("family")
	private String family;
	@XStreamAsAttribute
    @XStreamAlias("qualifier")
	private String qualifier;
	@XStreamAsAttribute
    @XStreamAlias("rowkey-converter")
	private String rowkeyConverter;

    public Hbase() {
    }
   
 	 	 
     public String getZklist(){
     	return zklist;
     }

     public void setZklist(String zklist){
     	this.zklist = zklist;
     }
	 	 	 
     public String getZkport(){
     	return zkport;
     }

     public void setZkport(String zkport){
     	this.zkport = zkport;
     }
	 	 	 
     public String getTable(){
     	return table;
     }

     public void setTable(String table){
     	this.table = table;
     }
	 	 	 
     public String getFamily(){
     	return family;
     }

     public void setFamily(String family){
     	this.family = family;
     }
	 	 	 
     public String getQualifier(){
     	return qualifier;
     }

     public void setQualifier(String qualifier){
     	this.qualifier = qualifier;
     }
	 	 	 
     public String getRowkeyConverter(){
     	return rowkeyConverter;
     }

     public void setRowkeyConverter(String rowkeyConverter){
     	this.rowkeyConverter = rowkeyConverter;
     }
	 
}
