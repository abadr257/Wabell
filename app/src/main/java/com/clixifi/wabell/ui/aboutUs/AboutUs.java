package com.clixifi.wabell.ui.aboutUs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.clixifi.wabell.R;
import com.clixifi.wabell.databinding.ActivityAboutUsBinding;
import com.clixifi.wabell.ui.register.RegisterScreen;

public class AboutUs extends AppCompatActivity {
    ActivityAboutUsBinding binding ;
    MyHandlers handlers ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_us);
        handlers = new MyHandlers(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding.setHandlers(handlers);
    }
    public class MyHandlers{
        Context context ;

        public MyHandlers(Context context) {
            this.context = context;
        }
        public void back(View view){
            onBackPressed();
        }
    }
}