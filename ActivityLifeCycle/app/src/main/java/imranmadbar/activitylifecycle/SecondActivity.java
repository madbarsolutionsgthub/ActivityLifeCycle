package imranmadbar.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String msg = "From Second Activity: ";
    Button btSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btSecond = (Button) findViewById(R.id.btnSecond);
        btSecond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(SecondActivity.this, MainActivity.class);
                inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(inten);
            }
        });

        Log.d(msg, "The onCreate() event");
        Toast.makeText(this,msg+"The onCreate() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
        Toast.makeText(this,msg+"The onStart() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
        Toast.makeText(this,msg+"The onResume() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
        Toast.makeText(this,msg+"The onPause() event", Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
        Toast.makeText(this,msg+"The onStop() event", Toast.LENGTH_SHORT).show();
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
        Toast.makeText(this,msg+"The onDestroy() event", Toast.LENGTH_SHORT).show();
    }

    /** Called just before got to back with click system back button */
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(msg, "The onRestart() event");
        Toast.makeText(this,msg+"The onRestart() event", Toast.LENGTH_SHORT).show();
    }

}
