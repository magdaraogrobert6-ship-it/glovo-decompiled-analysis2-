package com.qualtrics.digital.theming;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import o.removeOnPictureInPictureModeChangedListener;

/* JADX INFO: loaded from: classes4.dex */
public class AppNightMode {
    private boolean isNightModeOverridden() {
        int i = removeOnPictureInPictureModeChangedListener.read;
        return i == 2 || i == 1;
    }

    private void applyNightMode(Configuration configuration) {
        int i = removeOnPictureInPictureModeChangedListener.read;
        int i2 = configuration.uiMode & (-49);
        configuration.uiMode = i2;
        if (i == 2) {
            configuration.uiMode = i2 | 32;
        } else if (i == 1) {
            configuration.uiMode = i2 | 16;
        }
    }

    public void makeNightAware(Context context) {
        if (!isNightModeOverridden() || Build.VERSION.SDK_INT >= 31) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        applyNightMode(configuration);
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }
}
