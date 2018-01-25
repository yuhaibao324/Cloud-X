package cn.ucaner.raspi.common.enums;

/**
 * 发声类型
 * GitHub: https://github.com/IceSeaOnly
 */
public enum SpeakType {
    SPEAK_DIRECT, // 直接发声
    NUMBER2CHINESE,// 数字转大写中文后直接发声
    LOCAL_FILE,// 播放本地文件
    DELAY_PLAY, // 延时播放
    TIMED_REPEAT, // 定时重复
    ;
}
