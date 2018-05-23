package com.tsb.cmpp;

import java.util.ResourceBundle;


/**
 * 用于获取短信接口配置参数
 * @author zzl
 * 2016-07-20 16:30 
 */
public class MsgConfig{
	private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("MsgConfig");
	public static String get(String key){
		return resourceBundle.getString(key);
	}
	/**
	 * 获取互联网短信网关IP
	 * @return
	 */
	public static String getIsmgIp(){
		return MsgConfig.get("ismgIp");
	}
	/**
	 * 获取互联网短信网关端口号
	 * @return
	 */
	public static int getIsmgPort(){
		return Integer.parseInt(MsgConfig.get("ismgPort"));
	}
	/**
	 * 获取sp企业代码
	 * @return
	 */
	public static String getSpId(){
		return MsgConfig.get("spId");
	}
	/**
	 * 获取sp下发短信号码
	 * @return
	 */
	public static String getSpCode(){
		return MsgConfig.get("spCode");
	}
	/**
	 * 获取sp sharedSecret
	 * @return
	 */
	public static String getSpSharedSecret(){
		return MsgConfig.get("sharedSecret");
	}
	/**
	 * 获取链接的次数
	 * @return
	 */
	public static int getConnectCount(){
		return Integer.parseInt(MsgConfig.get("connectCount"));
	}
	/**
	 * 获取链接的超时时间
	 * @return
	 */
	public static int getTimeOut(){
		return Integer.parseInt(MsgConfig.get("timeOut"));
	}
	/**
	 * 获取发送短信提交的参数serviceId值
	 * @author TSB Dongrisheng
	 * @return
	 */
	public static String getServiceId(){
		return MsgConfig.get("serviceId");
	}

	/**
	 * 接收response消息的最大返回时间
	 * @author TSB Dongrisheng
	 * @return
	 */
	public static int getDelayTime(){
		return Integer.parseInt(MsgConfig.get("delayTime"));
	}
}