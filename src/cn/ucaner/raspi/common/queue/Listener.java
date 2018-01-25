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
* @ClassName：Listener   
* @Description：   <p> Listener</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:37:24   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public abstract class Listener extends Thread implements QueueBase{


    private CloudAccount account = null;
    private MNSClient client = null;
    private CloudQueue queue = null;

    private String accessId;
    
    private String accessKey;
    
    private String mnsEndPoint;
    
    public String getQueueName() {
    	return "";
	}
    
    protected abstract String consume(String msg);

    protected abstract void handleException(Exception e);

    public Listener() {
        this.account = new CloudAccount(accessId, accessKey, mnsEndPoint);
        this.client = account.getMNSClient();
        this.queue = client.getQueueRef(getQueueName());
    }



    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                Message popMsg = queue.popMessage(10);
                if (popMsg != null) {
//                    System.out.println("新消息:" + popMsg.getMessageBody());
                    queue.deleteMessage(popMsg.getReceiptHandle());
                    consume(popMsg.getMessageBody());
                }
            } catch (Exception e) {
                handleException(e);
            }
        }
    }
    
}
