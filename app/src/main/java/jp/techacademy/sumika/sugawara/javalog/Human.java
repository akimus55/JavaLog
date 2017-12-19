package jp.techacademy.sumika.sugawara.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    // クラス変数
    static String to_jp = "人";

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby= hobby;
    }

    // クラス関数
    public static void introduce() {
    }

    // メンバ関数
    public void say() {
    }

    @Override
    public void think(){
    }
}