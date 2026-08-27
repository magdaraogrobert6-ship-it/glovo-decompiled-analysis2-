package com.mapbox.navigation.utils.internal;

import androidx.room.Room;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadController {
    public static final DefaultScheduler DefaultDispatcher;
    public static final DefaultIoScheduler IODispatcher;
    public onBackInvokedlambda0 ioRootJob;
    public onBackInvokedlambda0 mainRootJob;

    static {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        IODispatcher = DefaultIoScheduler.RemoteActionCompatParcelizer;
        DefaultDispatcher = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
    }

    public final JobControl getMainScopeAndRootJob() {
        onBackInvokedlambda0 onbackinvokedlambda0 = new onBackInvokedlambda0(this.mainRootJob);
        return new JobControl(onbackinvokedlambda0, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0, MainDispatcherLoader.read)));
    }
}
