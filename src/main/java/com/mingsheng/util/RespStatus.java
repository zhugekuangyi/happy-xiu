package com.mingsheng.util;


import com.alibaba.fastjson.JSONObject;

public class RespStatus {
	//0：成功，-1：失败
	/**
	 * 成功
	 * @param return_msg
	 * @return
	 */
	public static JSONObject success(String return_msg) {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.SUCCESS);
		obj.put("return_msg", return_msg);
		return obj;
	}

	/**
	 * 成功
	 * @return
	 */
	public static JSONObject success() {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.SUCCESS);
		obj.put("return_msg", "success");
		return obj;
	}
	
	/**
	 * 失败
	 * @return
	 */
	public static JSONObject fail() {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.FAIL);
		obj.put("return_msg", "fail");
		return obj;
	}
	
	/**
	 * 失败
	 * @param return_msg
	 * @return
	 */
	public static JSONObject fail(String return_msg) {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.FAIL);
		obj.put("return_msg", return_msg);
		return obj;
	}
	
	/**
	 * 异常
	 * @param exception
	 * @return
	 */
	public static JSONObject exception(Exception exception) {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.EXCE);
		obj.put("return_msg", "exception");
		return obj;
	}
	
	/**
	 * 异常
	 * @return
	 */
	public static JSONObject exception() {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.EXCE);
		obj.put("return_msg", "exception");
		return obj;
	}
	
	/**
	 * 异常
	 * @param return_msg
	 * @param exception
	 * @return
	 */
	public static JSONObject exception(String return_msg,Exception exception) {
		JSONObject obj = new JSONObject();
		obj.put("return_code", ReturnCode.EXCE);
		obj.put("return_msg", return_msg);
		return obj;
	}
	
	/**
	 * 自定义返回信息
	 * @param return_code
	 * @param return_msg
	 * @return
	 */
	public static JSONObject resp(int return_code,String return_msg) {
		JSONObject obj = new JSONObject();
		obj.put("return_code", return_code);
		obj.put("return_msg", return_msg);
		return obj;
	}

}
