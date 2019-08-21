package com.hframework.peacock.controller.bean.apiconf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * generated by hframework on 2017.
 */@XStreamAlias("parameter")
public class Parameter   {

    @XStreamAsAttribute
    @XStreamAlias("code")
    private String code;
    @XStreamAsAttribute
    @XStreamAlias("value")
    private String value;
	@XStreamAsAttribute
    @XStreamAlias("name")
	private String name;
	@XStreamAsAttribute
    @XStreamAlias("type")
	private String type;
	@XStreamAsAttribute
    @XStreamAlias("required")
	private String required;
	@XStreamAsAttribute
    @XStreamAlias("description")
	private String description;
	@XStreamAsAttribute
    @XStreamAlias("enum")
	private String enumClass;
	@XStreamAsAttribute
    @XStreamAlias("default")
	private String defaultValue;
	@XStreamAsAttribute
    @XStreamAlias("min")
	private String min;
	@XStreamAsAttribute
    @XStreamAlias("max")
	private String max;
    @XStreamAsAttribute
    @XStreamAlias("regex")
    private String regex;
	@XStreamAsAttribute
    @XStreamAlias("scope")
	private String scope;
	@XStreamAsAttribute
    @XStreamAlias("ref")
	private String ref;
    @XStreamAsAttribute
    @XStreamAlias("is-public")
	private boolean isPublic;

    @XStreamAsAttribute
    @XStreamAlias("batch-helper")
    private String batchHelper;


    @XStreamOmitField
    private String oper;

    @XStreamOmitField
    private boolean isCommon;

    public Parameter() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnumClass() {
        return enumClass;
    }

    public void setEnumClass(String enumClass) {
        this.enumClass = enumClass;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void mergeHist(Parameter hisParameter) {
        boolean change = false;
        if(StringUtils.isBlank(this.name)){
            this.name = hisParameter.getName();
        }
        if(!hisParameter.type.equals(this.type)){
            this.type = hisParameter.getType();
        }

        if(StringUtils.isBlank(this.batchHelper) && StringUtils.isNotBlank(hisParameter.batchHelper)){
            this.batchHelper = hisParameter.batchHelper;
        }

        this.oper = "2";
    }

    public boolean isCommon() {
        return isCommon;
    }

    public void setCommon(boolean common) {
        isCommon = common;
    }

    public String getBatchHelper() {
        return batchHelper;
    }

    public void setBatchHelper(String batchHelper) {
        this.batchHelper = batchHelper;
    }
}
