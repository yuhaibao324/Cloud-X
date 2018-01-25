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
package cn.ucaner.raspi.common.queue;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.model.Message;

import cn.ucaner.raspi.common.base.QueueBase;

/**
* @Package：cn.ucaner.raspi.common.queue   
* @ClassName：Sender   
* @Description：   <p> Sender</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:37:10   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public abstract class Sender implements QueueBase{
	
    private CloudAccount account = null;
    private MNSClient client = null;
    private CloudQueue queue = null;
    
    
   private String accessId;
    
    private String accessKey;
    
    private String mnsEndPoint;
    
    public String getQueueName() {
    	return "";
    }


    public Sender() {
        this.account = new CloudAccount(accessId, accessKey, mnsEndPoint);
        this.client = account.getMNSClient();
        this.queue = client.getQueueRef(getQueueName());
    }

    public Message publish(String msgBody){
        Message message = new Message();
        message.setMessageBody(msgBody);
        return queue.putMessage(message);
    }
    
	public CloudAccount getAccount() {
		return account;
	}

	public void setAccount(CloudAccount account) {
		this.account = account;
	}

	public MNSClient getClient() {
		return client;
	}

	public void setClient(MNSClient client) {
		this.client = client;
	}

	public CloudQueue getQueue() {
		return queue;
	}

	public void setQueue(CloudQueue queue) {
		this.queue = queue;
	}
    
}
