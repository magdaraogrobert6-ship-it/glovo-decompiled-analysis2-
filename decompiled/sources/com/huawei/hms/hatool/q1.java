package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;

/* JADX INFO: loaded from: classes2.dex */
public class q1 {
    private static q1 c = new q1();
    private boolean a = false;
    private Context b = q0.i();

    public static q1 b() {
        return c;
    }

    private q1() {
    }

    @TargetApi
    public boolean a() {
        if (!this.a) {
            Context context = this.b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService(FeedbackEvent.UI);
            if (userManager != null) {
                this.a = userManager.isUserUnlocked();
            } else {
                this.a = false;
            }
        }
        return this.a;
    }
}
