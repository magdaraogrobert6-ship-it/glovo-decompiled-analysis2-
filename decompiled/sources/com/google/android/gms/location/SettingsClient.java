package com.google.android.gms.location;

import com.google.android.gms.tasks.Task;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadDividecp;

/* JADX INFO: loaded from: classes4.dex */
public interface SettingsClient extends accessgetNumPadAddcp {
    Task checkLocationSettings(LocationSettingsRequest locationSettingsRequest);

    @Override // o.accessgetNumPadAddcp
    /* synthetic */ accessgetNumPadDividecp getApiKey();

    Task isGoogleLocationAccuracyEnabled();
}
