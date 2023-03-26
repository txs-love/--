package example.Design.AbstractFactoryPattern抽象工厂模式.Test;

import example.Design.AbstractFactoryPattern抽象工厂模式.AbstractWhiteHuman;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 13:56
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    public void sex() {
        System.out.println("该白种人的性别为男....");
    }
}
