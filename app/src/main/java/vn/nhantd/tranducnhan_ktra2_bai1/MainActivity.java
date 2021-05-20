package vn.nhantd.tranducnhan_ktra2_bai1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import vn.nhantd.tranducnhan_ktra2_bai1.ui.CherryFragment;
import vn.nhantd.tranducnhan_ktra2_bai1.ui.CuliFragment;
import vn.nhantd.tranducnhan_ktra2_bai1.ui.MokaFragment;

/**
 * Created by nhantd on 2021-05-14
 */
public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(CherryFragment.newInstance(R.drawable.cherry, "Chery"));

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {
                Fragment fragmentSelected = null;
                switch (item.getItemId()) {
                    case R.id.nav_cherry:
                        fragmentSelected = CherryFragment.newInstance(R.drawable.cherry, "Chery");
                        break;
                    case R.id.nav_culi:
                        fragmentSelected = CuliFragment.newInstance(R.drawable.culi, "Culi");
                        break;
                    case R.id.nav_moka:
                        fragmentSelected = MokaFragment.newInstance(R.drawable.moka, "Moka");
                        break;
                }
                loadFragment(fragmentSelected);
                return true;

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, InformationActivity.class);
                startActivity(intent);
                break;

            case R.id.exit:
                System.exit(0);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}