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
package cn.ucaner.raspi.common.enums;

/**
* @Package：cn.ucaner.raspi.common.enums   
* @ClassName：SpeakerEnum   
* @Description：   <p> https://github.com/IceSeaOnly</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:35:33   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public enum SpeakerEnum {

    WOMAN(0),
    MAN(1),
    EMOTIONAL_WOMAN(4),
    EMOTIONAL_MAN(3);

    private int id;

    SpeakerEnum(int id) {
        this.id = id;
    }

    public String getId() {
        return String.valueOf(id);
    }
}
