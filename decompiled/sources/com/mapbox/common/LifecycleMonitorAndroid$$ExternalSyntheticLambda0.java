package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LifecycleMonitorAndroid$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ Expected f$1;

    public /* synthetic */ LifecycleMonitorAndroid$$ExternalSyntheticLambda0(Map.Entry entry, Expected expected, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = expected;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Expected expected = this.f$1;
        Map.Entry entry = this.f$0;
        if (i != 0) {
            LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$13$lambda$11$lambda$10(entry, expected);
        } else {
            LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$19$lambda$17$lambda$16(entry, expected);
        }
    }
}
