package cn.edu.imnu.ciec.rtest5;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity";

    public static void actionStart(Context context, String data1, String data2){

        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("param1","data");
        intent.putExtra("param2","data");
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Task id is: "+getTaskId());

        Intent intent=getIntent();
        String data1=intent.getStringExtra("data1");
        String data2=intent.getStringExtra("data2");

        setContentView(R.layout.activity_second);

        Button button2 = (Button) findViewById(R.id.button_second);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: "+this.toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: "+this.toString());
    }
}
