package com.example.manymodel.Singleton;

//饱汉单例模式
public class SingletonModel {

    //断掉外部new singletonModel()方法
    private SingletonModel(){};

    //volatile 关键字不能少了,因为饱汉模式是需要时才会初始化所以这里设置为null
    private static volatile SingletonModel singletonInstance = null;

    //获取对象实例
    public static SingletonModel getInstance(){
        if (singletonInstance == null){
            //加锁
            synchronized (SingletonModel.class){
                //这一次判断也是必须的，不然会有并发问题
                if (singletonInstance == null){
                    singletonInstance = new SingletonModel();
                }
            }
        }
        return singletonInstance;
    }

}
