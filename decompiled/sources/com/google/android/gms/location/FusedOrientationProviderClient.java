package com.google.android.gms.location;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadDividecp;

/* JADX INFO: loaded from: classes4.dex */
public interface FusedOrientationProviderClient extends accessgetNumPadAddcp {
    @Override // o.accessgetNumPadAddcp
    /* synthetic */ accessgetNumPadDividecp getApiKey();

    Task removeOrientationUpdates(DeviceOrientationListener deviceOrientationListener);

    Task requestOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, DeviceOrientationListener deviceOrientationListener);
}
