package example.org.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
            implements View.OnClickListener
{

    private Button btnLaunchStandalone;
    private Button btnLaunchOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLaunchStandalone = (Button) findViewById(R.id.launch_standalone);
        btnLaunchOther = (Button) findViewById(R.id.launch_other);
        btnLaunchStandalone.setOnClickListener(this);
        btnLaunchOther.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()) {
            case R.id.launch_standalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            case R.id.launch_other:
                intent = new Intent(this,YoutubeActivity.class);
                break;
            default:
        }

        if(intent != null){
            startActivity(intent);
        }

    }
}
