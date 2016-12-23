package cn.edu.imnu.ciec.rtest5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends BaseActivity {
    private static final String TAG = "FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: "+this.toString());
        Log.i(TAG, "Task id is: "+getTaskId());

        setContentView(R.layout.activity_first);
        Button button = (Button) findViewById(R.id.button_first);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//                intent.putExtra("param1","data");
//                intent.putExtra("param2","data");
//                startActivity(intent);
                    SecondActivity.actionStart(FirstActivity.this,"data1","data2");
            }
        });

    }

}
