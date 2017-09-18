package pastel.com.pastel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView fb = (ImageView) findViewById(R.id.fb);
        ImageView twitter = (ImageView) findViewById(R.id.twitter);
        ImageView google_plus = (ImageView) findViewById(R.id.google_plus);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                v.startAnimation(shake);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                v.startAnimation(fade);
            }
        });

        google_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                v.startAnimation(blink);
            }
        });
    }

    public void signin(View view) {
        Intent intent = new Intent(this, activity_dashboard.class);
        startActivity(intent);
    }

    public void signup(View view) {
        Intent intent = new Intent(this, activity_signup.class);
        startActivity(intent);
    }
}
