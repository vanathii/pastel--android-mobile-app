package pastel.com.pastel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by sans on 22-02-2017.
 */

public class activity_splashscreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3650;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(activity_splashscreen.this, activity_login.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
