package com.hframework.smartweb.bean.apiconf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * generated by hframework on 2017.
 */@XStreamAlias("handler")
public class Handler   {

	@XStreamImplicit
    @XStreamAlias("precheck")
	private List<Precheck> precheckList;
	@XStreamImplicit
    @XStreamAlias("parameter")
	private List<Parameter> parameterList;
	@XStreamImplicit
    @XStreamAlias("result")
	private List<Result> resultList;
	@XStreamAsAttribute
    @XStreamAlias("class")
	private String clazz;
    @XStreamAsAttribute
    @XStreamAlias("path")
    private String path;
    @XStreamAsAttribute
    @XStreamAlias("returnType")
    private String returnType;
    @XStreamAsAttribute
    @XStreamAlias("parentPath")
    private String parentPath;
	@XStreamAsAttribute
    @XStreamAlias("version")
	private String version;

    public Handler() {
    }
   
 	 	 
     public List<Precheck> getPrecheckList(){
     	return precheckList;
     }

     public void setPrecheckList(List<Precheck> precheckList){
     	this.precheckList = precheckList;
     }
	 	 	 
     public List<Parameter> getParameterList(){
     	return parameterList;
     }

     public void setParameterList(List<Parameter> parameterList){
     	this.parameterList = parameterList;
     }
	 	 	 
     public List<Result> getResultList(){
     	return resultList;
     }

     public void setResultList(List<Result> resultList){
     	this.resultList = resultList;
     }
	 	 	 
     public String getClazz(){
     	return clazz;
     }

     public void setClazz(String clazz){
     	this.clazz = clazz;
     }
	 	 	 
     public String getVersion(){
     	return version;
     }

     public void setVersion(String version){
     	this.version = version;
     }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }
}
