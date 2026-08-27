package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e1 extends u1 {
    private PendingIntent b;

    public void a(PendingIntent pendingIntent) {
        this.b = pendingIntent;
    }

    public int hashCode() {
        return Objects.hash(this.b);
    }

    @Override // com.huawei.hms.locationSdk.u1
    public boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || (pendingIntent = this.b) == null) {
            return false;
        }
        return pendingIntent.equals(((e1) obj).b);
    }
}
