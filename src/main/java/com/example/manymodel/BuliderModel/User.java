package com.example.manymodel.BuliderModel;

import lombok.Data;

//建造模式
//核心是：先把所有的属性都设置给 Builder，然后 build() 方法的时候，将这些属性复制给实际产生的对象。
@Data
public class User {
    //下面是“堆”的属性
    private String name;
    private String password;
    private String nickName;
    private int age;

    //构造方法私有化
    private User(String name, String password, String nickName, int age) {
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
    }

    //静态方法，用于生成一个Bulider
    public static UserBuilder builder(){

        return new UserBuilder();
    }

    public static class UserBuilder{
        private String name;
        private String password;
        private String nickName;
        private int age;

        private UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }
        public UserBuilder nickName(String nickName){
            this.nickName = nickName;
            return this;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User bulid(){

            return new User(name,password,nickName,age);

        }

    }

}
