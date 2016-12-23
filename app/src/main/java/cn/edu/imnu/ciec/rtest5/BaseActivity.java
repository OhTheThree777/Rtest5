package cn.edu.imnu.ciec.rtest5;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;

/**
 * Created by HP301 on 2016/12/21.
 */

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClass().getSimpleName());
        //命名打印
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        Log.i(TAG, "onDestroy:"+getClass().getSimpleName());
    }

    //一键退出
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        ActivityCollector.finishAll();
//    }

    //长按返回退出
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode=event.getKeyCode();
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                if (event.isLongPress()){
                    ActivityCollector.finishAll();
                }
        }
        return super.dispatchKeyEvent(event);
    }
}
