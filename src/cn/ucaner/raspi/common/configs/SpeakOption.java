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

import cn.ucaner.raspi.common.enums.Measure;
import cn.ucaner.raspi.common.enums.SpeakLanguage;
import cn.ucaner.raspi.common.enums.SpeakType;
import cn.ucaner.raspi.common.enums.SpeakerEnum;

import java.util.Map;

/**
* @Package：cn.ucaner.raspi.common.configs   
* @ClassName：SpeakOption   
* @Description：   <p> SpeakOption</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:34:49   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Measure getSpeakSpeed() {
		return speakSpeed;
	}

	public void setSpeakSpeed(Measure speakSpeed) {
		this.speakSpeed = speakSpeed;
	}

	public Measure getIntonation() {
		return intonation;
	}

	public void setIntonation(Measure intonation) {
		this.intonation = intonation;
	}

	public Measure getVolume() {
		return volume;
	}

	public void setVolume(Measure volume) {
		this.volume = volume;
	}

	public SpeakerEnum getPerson() {
		return person;
	}

	public void setPerson(SpeakerEnum person) {
		this.person = person;
	}

	public SpeakLanguage getLanguage() {
		return language;
	}

	public void setLanguage(SpeakLanguage language) {
		this.language = language;
	}

	public SpeakType getSpeakType() {
		return speakType;
	}

	public void setSpeakType(SpeakType speakType) {
		this.speakType = speakType;
	}

	public Map<String, Object> getExtra() {
		return extra;
	}

	public void setExtra(Map<String, Object> extra) {
		this.extra = extra;
	}
    
}
