package com.example.manymodel.Singleton;


//金典的单例模式写法  嵌套类
public class GoldenModelSingleton {

    //断掉外部new goldenModelSingleton()法法
    private GoldenModelSingleton(){};

    //创建内部静态类
    private static class Holder{
        private static GoldenModelSingleton goldenInstance = new GoldenModelSingleton();
    }

    //返回单例模式
    public static GoldenModelSingleton getInsatance(){

        return Holder.goldenInstance;
    }

}
