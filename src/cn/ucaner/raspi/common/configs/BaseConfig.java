/**
 * <html>
 * <body>
 *  <P> Copyright 1994-2018 JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年 </p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.raspi.common.configs;

/**
* @Package：cn.ucaner.raspi.common.configs   
* @ClassName：BaseConfig   
* @Description：   <p> BaseConfig</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:34:18   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public class BaseConfig {
	
    private String accessId;
    
    private String accessKey;
    
    private String mnsEndPoint;

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getMnsEndPoint() {
		return mnsEndPoint;
	}

	public void setMnsEndPoint(String mnsEndPoint) {
		this.mnsEndPoint = mnsEndPoint;
	}
    
}
