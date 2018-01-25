package cn.ucaner.raspi.common.utils;

import java.io.IOException;

/**
* @Package：cn.ucaner.raspi.common.utils   
* @ClassName：MailUtil   
* @Description：   <p> MailUtil </p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:38:28   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public class MailUtil {
    public static void mail(String title, String content) {
        try {
            content = content.replace(" ", "_");
            Runtime.getRuntime().exec(String.format("/home/pi/mailer.sh %s %s", title, content));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
