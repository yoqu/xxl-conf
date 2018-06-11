package com.xxl.conf.sample.demo;

import com.xxl.conf.core.annotation.XxlConf;

/**
 *  测试示例（可删除）
 *
 *  @author xuxueli
 */
public class DemoConf {

	/**
	 * XXL-CONF：@XxlConf 注解方式
	 */
	@XxlConf("kuyin-movie.dubbo.registry.address")
	private String paramByAnno;

	public String getParamByAnno() {
		return paramByAnno;
	}

	public void setParamByAnno(String paramByAnno) {
		this.paramByAnno = paramByAnno;
	}

	public String getParamByXml() {
		return paramByXml;
	}

	/**
	 * XXL-CONF：$XxlConf{default.key03} XML占位符方式
	 */
	public String paramByXml;

	public void setParamByXml(String paramByXml) {
		this.paramByXml = paramByXml;
	}

}
