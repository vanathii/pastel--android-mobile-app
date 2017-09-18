package pastel.com.pastel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import pastel.com.pastel.Dashboard.activity_cart;
import pastel.com.pastel.Dashboard.activity_contact;
import pastel.com.pastel.Dashboard.activity_menu;

/**
 * Created by sans on 21-02-2017.
 */

public class activity_dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void menu(View view) {

        Intent intent = new Intent(this, activity_menu.class);
        startActivity(intent);
    }

    public void cart(View view) {

        Intent intent = new Intent(this, activity_cart.class);
        startActivity(intent);
    }

    public void specials(View view) {

        Toast.makeText(getApplicationContext(), "We are baking yet :)",
                Toast.LENGTH_SHORT).show();
      //  Intent intent = new Intent(this, activity_specials.class);
     //   startActivity(intent);
    }

    public void contact(View view) {

        Intent intent = new Intent(this, activity_contact.class);
        startActivity(intent);
    }
}
