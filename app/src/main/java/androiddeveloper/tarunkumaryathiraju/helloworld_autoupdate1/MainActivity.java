package androiddeveloper.helloworld_autoupdate1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import androiddeveloper.helloworld_autoupdate1.AutoUpdateApk;

public class MainActivity extends AppCompatActivity {

    private AutoUpdateApk aua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aua = new AutoUpdateApk(getApplicationContext());
    }
}
