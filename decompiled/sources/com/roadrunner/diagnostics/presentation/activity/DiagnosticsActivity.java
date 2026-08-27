package com.roadrunner.diagnostics.presentation.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.logistics.rider.glovo.R;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.ui.common.base.BaseInjectionActivity;
import o.div7Ah8Wj8;
import o.isInfiniteannotations;

/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticsActivity extends BaseInjectionActivity {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_diagnostics);
        SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment = new SettingsNotificationsDiagnosticsFragment();
        div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(supportFragmentManager);
        isinfiniteannotations.read(R.id.fragment_container_view, settingsNotificationsDiagnosticsFragment, null, 1);
        isinfiniteannotations.read();
        int i2 = RatingCompat + 123;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
