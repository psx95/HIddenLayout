package com.psx.hiddedlinearlayout;

import android.content.Intent;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.psx.hiddenlinearlayoutview.HiddenLayoutView;
import com.psx.hiddenlinearlayoutview.Interfaces.AnimationUpdateListeners;

public class MainActivity extends AppCompatActivity {

    HiddenLayoutView hiddenLayoutView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity", "OnPausedCalled");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(hiddenLayoutView);
    }

    public void moveToSpringActivty(View view) {
    }

    public void moveToFlingActivty(View view) {
        startActivity(new Intent(this,FlingActivity.class));
    }
}
