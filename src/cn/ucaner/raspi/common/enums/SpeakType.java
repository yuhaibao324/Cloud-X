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
* @ClassName：SpeakType   
* @Description：   <p> https://github.com/IceSeaOnly</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:36:11   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public enum SpeakType {
    SPEAK_DIRECT, // 直接发声
    NUMBER2CHINESE,// 数字转大写中文后直接发声
    LOCAL_FILE,// 播放本地文件
    DELAY_PLAY, // 延时播放
    TIMED_REPEAT, // 定时重复
    ;
}
