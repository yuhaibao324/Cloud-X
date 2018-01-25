package cn.ucaner.raspi.common.enums;

/**
 * GitHub: https://github.com/IceSeaOnly
 */
public enum SpeakLanguage {

    CHINESE("zh"),
    ENGLISH("en");

    private String language;

    SpeakLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
