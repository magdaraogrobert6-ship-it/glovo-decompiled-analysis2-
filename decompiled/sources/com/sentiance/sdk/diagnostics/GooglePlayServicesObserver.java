package com.sentiance.sdk.diagnostics;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface GooglePlayServicesObserver {
    default void onRemoveLocationUpdates(Task task) {
    }

    default void onRequestLocationUpdates(LocationRequest locationRequest, Task task) {
    }
}
