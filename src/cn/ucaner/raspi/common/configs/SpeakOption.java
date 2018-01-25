package cn.ucaner.raspi.common.configs;

import cn.ucaner.raspi.common.enums.Measure;
import cn.ucaner.raspi.common.enums.SpeakLanguage;
import cn.ucaner.raspi.common.enums.SpeakType;
import cn.ucaner.raspi.common.enums.SpeakerEnum;
import lombok.Data;

import java.util.Map;

@Data
public class SpeakOption {
    private String content;
    private Measure speakSpeed; // 语速
    private Measure intonation; // 语调
    private Measure volume; // 音量
    private SpeakerEnum person; // 发音人
    private SpeakLanguage language; // 语言
    private SpeakType speakType;
    private Map<String, Object> extra; // 其他配置

    public SpeakOption(String content) {
        this(content, Measure.NORMAL, SpeakerEnum.EMOTIONAL_WOMAN);
    }

    public SpeakOption(String content, Measure volume, SpeakerEnum speakerEnum) {
        this(content, Measure.NORMAL, Measure.NORMAL, volume, speakerEnum, SpeakLanguage.CHINESE, SpeakType.SPEAK_DIRECT, null);
    }

    public SpeakOption(String content, Measure speakSpeed, Measure intonation, Measure volume, SpeakerEnum person, SpeakLanguage language, SpeakType speakType, Map<String, Object> extra) {
        this.content = content;
        this.speakSpeed = speakSpeed;
        this.intonation = intonation;
        this.volume = volume;
        this.person = person;
        this.language = language;
        this.speakType = speakType;
        this.extra = extra;
    }
}
