package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import com.huawei.hms.locationSdk.z;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityIdentificationService {
    private z locationArClient;

    public setShouldUseDispatchDrawui createActivityConversionUpdates(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        return this.locationArClient.a(activityConversionRequest, pendingIntent);
    }

    public setShouldUseDispatchDrawui createActivityIdentificationUpdates(long j, PendingIntent pendingIntent) {
        return this.locationArClient.a(j, pendingIntent);
    }

    public setShouldUseDispatchDrawui deleteActivityConversionUpdates(PendingIntent pendingIntent) {
        return this.locationArClient.a(pendingIntent);
    }

    public setShouldUseDispatchDrawui deleteActivityIdentificationUpdates(PendingIntent pendingIntent) {
        return this.locationArClient.b(pendingIntent);
    }

    public ActivityIdentificationService(Activity activity) {
        this.locationArClient = t.a(activity, (v0) null);
    }

    public ActivityIdentificationService(Context context) {
        this.locationArClient = t.a(context, (v0) null);
    }
}
