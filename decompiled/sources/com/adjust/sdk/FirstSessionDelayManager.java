package com.adjust.sdk;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class FirstSessionDelayManager {
    public final ActivityHandler a;
    public final ArrayList b = new ArrayList();
    public int c = 0;

    public final void a(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.c;
        ActivityHandler activityHandler = this.a;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(ff$$ExternalSyntheticOutline0.m("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.c == 3) {
            this.a.getAdjustConfig().getLogger().debug(ff$$ExternalSyntheticOutline0.m("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
