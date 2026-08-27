package com.incognia.internal;

import android.os.Process;
import androidx.compose.ui.platform.AndroidComposeView;
import com.mapbox.bindgen.Cleaner;
import io.sentry.android.core.internal.util.MediaMetadataCompat;
import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xr$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    private final void run$androidx$camera$camera2$internal$Camera2CameraControlImpl$$ExternalSyntheticLambda3() {
    }

    public /* synthetic */ xr$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        if (i == 0) {
            xr.BGx();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                AndroidComposeView.Companion.addNotificationForSysPropsChange$lambda$0();
                return;
            }
            if (i == 3) {
                Cleaner.lambda$create$0();
            } else if (i != 4) {
                SentryNdk.lambda$static$0();
            } else {
                MediaMetadataCompat.IconCompatParcelizer = Process.myTid();
            }
        }
    }
}
