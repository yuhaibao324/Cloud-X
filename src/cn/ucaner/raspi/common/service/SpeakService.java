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
package cn.ucaner.raspi.common.service;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.mns.model.Message;
import cn.ucaner.raspi.common.configs.SpeakOption;
import cn.ucaner.raspi.common.queue.Sender;

/**
* @Package：cn.ucaner.raspi.common.service   
* @ClassName：SpeakService   
* @Description：   <p> SpeakService</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:37:40   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public class SpeakService {

    private SpeakSender speakSender;

    public SpeakService() {
        this.speakSender = new SpeakSender();
    }

    public boolean speak(SpeakOption option) {
        Message message = speakSender.publish(JSONObject.toJSONString(option));
        return message.getReceiptHandle() != null;
    }

    public boolean speak(String content) {
        Message message = speakSender.publish(content);
        return message.getReceiptHandle() != null;
    }

    private class SpeakSender extends Sender {

        @Override
        public String getQueueName() {
            return "pi-speaker";
        }
    }
}
