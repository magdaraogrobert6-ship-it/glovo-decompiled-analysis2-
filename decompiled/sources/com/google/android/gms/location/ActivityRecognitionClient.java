package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadDividecp;

/* JADX INFO: loaded from: classes2.dex */
public interface ActivityRecognitionClient extends accessgetNumPadAddcp {
    @Override // o.accessgetNumPadAddcp
    /* synthetic */ accessgetNumPadDividecp getApiKey();

    Task removeActivityTransitionUpdates(PendingIntent pendingIntent);

    Task removeActivityUpdates(PendingIntent pendingIntent);

    Task removeSleepSegmentUpdates(PendingIntent pendingIntent);

    Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);

    Task requestActivityUpdates(long j, PendingIntent pendingIntent);

    Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest);
}
