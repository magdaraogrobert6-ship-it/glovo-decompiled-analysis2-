package com.qualtrics.digital.ui;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import o.onTrimMemory;

/* JADX INFO: loaded from: classes4.dex */
public class EdgeToEdge {
    public static void enableWhenSupportedFor(Activity activity) {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        Window window = activity.getWindow();
        onTrimMemory supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (window == null || supportActionBar == null || window.getStatusBarColor() != 0) {
            return;
        }
        window.setDecorFitsSystemWindows(false);
        window.setNavigationBarColor(0);
        window.setFlags(Fields.RotationY, Fields.RotationY);
        window.setFlags(Fields.RotationZ, Fields.RotationZ);
    }
}
