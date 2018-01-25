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
package cn.ucaner.raspi.common.queue;

import cn.ucaner.raspi.common.enums.CommandType;

/**
* @Package：cn.ucaner.raspi.common.queue   
* @ClassName：Command   
* @Description：   <p> Command </p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:36:36   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public class Command {
	
    private CommandType Type;
    private String commandBody;

    public Command(CommandType type, String commandBody) {
        Type = type;
        this.commandBody = commandBody;
    }

    public Command() {
    }

	public CommandType getType() {
		return Type;
	}

	public void setType(CommandType type) {
		Type = type;
	}

	public String getCommandBody() {
		return commandBody;
	}

	public void setCommandBody(String commandBody) {
		this.commandBody = commandBody;
	}

    

}
