package com.mapbox.navigation.core.replay;

import androidx.room.Room;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxReplayer {
    public final LinkedHashSet replayEventsObservers;

    public MapboxReplayer() {
        new ArrayList();
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read));
        this.replayEventsObservers = new LinkedHashSet();
    }
}
