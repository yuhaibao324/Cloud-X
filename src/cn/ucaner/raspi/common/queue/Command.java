package cn.ucaner.raspi.common.queue;

import lombok.Data;
import cn.ucaner.raspi.common.enums.CommandType;


@Data
public class Command {
    private CommandType Type;
    private String commandBody;

    public Command(CommandType type, String commandBody) {
        Type = type;
        this.commandBody = commandBody;
    }

    public Command() {
    }


}
