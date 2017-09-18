package pastel.com.pastel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by sans on 21-02-2017.
 */

public class activity_signup  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    public void submit(View view) {
        Intent intent = new Intent(this, activity_dashboard.class);
        startActivity(intent);
    }

    public void cancel(View view) {
        finish();
    }
}
