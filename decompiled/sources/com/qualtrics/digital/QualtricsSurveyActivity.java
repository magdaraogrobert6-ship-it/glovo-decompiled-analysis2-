package com.qualtrics.digital;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.qualtrics.digital.ui.EdgeToEdge;
import io.sentry.android.core.SentryLogcatAdapter;
import o.onTrimMemory;

/* JADX INFO: loaded from: classes4.dex */
public class QualtricsSurveyActivity extends AppCompatActivity {
    protected ViewGroup linearLayout;

    /* JADX INFO: loaded from: classes5.dex */
    public final class IntentKeys {
        static final String AUTO_CLOSE_AT_END_OF_SURVEY = "autoCloseAtEndOfSurvey";
        static final String LAYOUT_FLAGS = "layoutFlags";

        public IntentKeys() {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

    private void setQualtricsThemeWithBottomBorderActionBar() {
        Drawable drawable = getDrawable(R.drawable.bottom_border);
        ((GradientDrawable) ((LayerDrawable) drawable).getDrawable(0)).setColor(Qualtrics.instance().getWebviewTheme().getActionBarColor());
        getSupportActionBar().IconCompatParcelizer(drawable);
        getSupportActionBar().serializer(0.0f);
    }

    @Override // android.app.Activity
    public void finish() {
        if (isTaskRoot()) {
            getApplicationContext().startActivity(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()));
        } else {
            super.finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            getApplicationContext().startActivity(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()));
        } else {
            super.onBackPressed();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            String stringExtra = getIntent().getStringExtra("targetURL");
            String stringExtra2 = getIntent().getStringExtra("interceptID");
            String stringExtra3 = getIntent().getStringExtra("creativeID");
            String stringExtra4 = getIntent().getStringExtra("actionSetID");
            boolean booleanExtra = getIntent().getBooleanExtra("autoCloseAtEndOfSurvey", false);
            if (stringExtra == null) {
                SentryLogcatAdapter.serializer("Qualtrics", "Could not get target URL from intent");
            }
            setTheme(R.style.Theme_AppCompat_Light);
            EdgeToEdge.enableWhenSupportedFor(this);
            onTrimMemory supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.write(Qualtrics.instance().getWebviewTheme().getCloseButtonId());
                setQualtricsThemeWithBottomBorderActionBar();
                supportActionBar.IconCompatParcelizer(true);
                supportActionBar.MediaSessionCompatToken();
            } else {
                QualtricsLog.logError("Support action bar is null");
            }
            getWindow().setSoftInputMode(16);
            getWindow().addFlags(getIntent().getIntExtra("layoutFlags", 0));
            this.linearLayout = new LinearLayout(this);
            this.linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((LinearLayout) this.linearLayout).setOrientation(1);
            this.linearLayout.setFitsSystemWindows(true);
            this.linearLayout.setBackgroundColor(-1);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(View.generateViewId());
            this.linearLayout.addView(frameLayout);
            QualtricsSurveyFragment qualtricsSurveyFragmentNewInstance = QualtricsSurveyFragment.newInstance(stringExtra, stringExtra2, stringExtra3, stringExtra4, getPackageName(), booleanExtra);
            getFragmentManager().beginTransaction().add(frameLayout.getId(), qualtricsSurveyFragmentNewInstance).commit();
            qualtricsSurveyFragmentNewInstance.setWebViewShown(true);
            setContentView(this.linearLayout);
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
