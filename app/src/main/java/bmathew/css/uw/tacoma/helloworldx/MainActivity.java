package bmathew.css.uw.tacoma.helloworldx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Testing commits with git");
    }

    @Override
    protected void onResume () {
        super.onResume();

        Log.i(TAG, "Override onResume");
    }
}
