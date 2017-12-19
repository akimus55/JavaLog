package jp.techacademy.sumika.sugawara.javalog;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

        public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎", 15,"旅行");     // 名前を太郎、年齢15歳で、Humanのインスタンスを作る

        human.say();
        Log.d("javatest","私の名前は" + human.name + "です。");
        Log.d("javatest","年は" + human.age + "です。");
        Log.d("javatest","私は" + human.hobby +"について考える。");
    }
}
