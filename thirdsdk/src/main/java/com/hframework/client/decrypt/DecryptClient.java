package com.hframework.client.decrypt;

import com.hframework.common.client.http.HttpClient;
import com.hframework.common.util.UrlHelper;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.message.JsonUtils;
import com.hframework.client.decrypt.bean.EncryptResult;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * generated by hframework on 2018.
 */
public class DecryptClient   {

	
	public static EncryptResult des(String data)  throws Exception{
			Map<String, String> parameterMap = new LinkedHashMap();
			parameterMap.put("data" ,data);
			parameterMap.put("client_id" ,DecryptConfig.getInstance().getClient());
			parameterMap.put("timestamp" ,DecryptHelper.getCurTimestamp());
			parameterMap.put("sign" ,DecryptHelper.sign(parameterMap.get("timestamp")));
			String url = UrlHelper.getUrlPath(DecryptConfig.getInstance().getDes());
			String result;
			if("true".equals(DecryptConfig.getInstance().getTestModel())) {
			   result = FileUtils.readFile(Thread.currentThread().getContextClassLoader().getResource(
			          "third/decrypt/des.response").getPath());
			}else {
			   result = HttpClient.doGet(url,parameterMap);
			}
			EncryptResult responseData = JsonUtils.readValue(result,EncryptResult.class);
			return responseData.convert();
	}

  
 
}