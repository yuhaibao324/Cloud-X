package cn.ucaner.raspi.common.service;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.mns.model.Message;
import cn.ucaner.raspi.common.configs.SpeakOption;
import cn.ucaner.raspi.common.queue.Sender;

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
