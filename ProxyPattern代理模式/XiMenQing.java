package example.Design.ProxyPattern代理模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:32
 */
public class XiMenQing {
    /*
     * 水浒里是这样写的：西门庆被潘金莲用竹竿敲了一下难道，痴迷了，
     * 被王婆看到了, 就开始撮合两人好事，王婆作为潘金莲的代理人
     * 收了不少好处费，那我们假设一下：
     * 如果没有王婆在中间牵线，这两个不要脸的能成吗？难说的很！
     */
    public static void main(String[] args) {
        //把王婆叫出来
        WangPo wangPo = new WangPo();

        //然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();

        /**
         * 家室代理;
         */
        JiaSi jia = new JiaSi();
        WangPo JiaProxy = new WangPo(jia);
        JiaProxy.happyWithMan();
        JiaProxy.makeEyesWithMan();

    }
}
