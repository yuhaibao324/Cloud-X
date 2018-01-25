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
* @ClassName：Measure   
* @Description：   <p> 通用度量 https://github.com/IceSeaOnly </p>
* @Author： - DaoDou   
* @CreatTime：2018年1月25日 上午10:35:16   
* @Modify By：   
* @ModifyTime：  2018年1月25日
* @Modify marker：   
* @version    V1.0
 */
public enum Measure {

    VERY_LOW(1),
    LESS(3),
    NORMAL(5),
    MORE(7),
    VERY(9);

    private int value;

    Measure(int value) {
        this.value = value;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
