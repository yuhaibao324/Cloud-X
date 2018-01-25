package cn.ucaner.raspi.common.enums;

/**
 * GitHub: https://github.com/IceSeaOnly
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
