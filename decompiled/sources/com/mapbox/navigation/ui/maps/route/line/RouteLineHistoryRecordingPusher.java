package com.mapbox.navigation.ui.maps.route.line;

import androidx.compose.material3.TooltipStateImpl;
import androidx.room.Room;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigationProvider;
import com.mapbox.navigation.core.history.MapboxHistoryRecorder;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver;
import com.mapbox.navigation.ui.maps.util.LimitedQueue;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.sentiance.core.model.events.H$b;
import io.sentry.util.UrlUtils;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineHistoryRecordingPusher implements MapboxNavigationObserver {
    public final LimitedQueue eventsQueue;
    public final IsFixableByRetry historyRecorderChooserFactory;
    public final H$b mutexBasedMainScope;
    public MapboxHistoryRecorder recorder;
    public final CoroutineDispatcher serialisationDispatcher;

    @Override // com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver
    public final void onAttached(MapboxNavigation mapboxNavigation) {
        mapboxNavigation.getClass();
        this.historyRecorderChooserFactory.getClass();
        NavigationOptions navigationOptions = mapboxNavigation.navigationOptions;
        navigationOptions.historyRecorderOptions.getClass();
        navigationOptions.copilotOptions.getClass();
        new LinkedHashSet();
    }

    public RouteLineHistoryRecordingPusher() {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        H$b h$b = new H$b(YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), MainDispatcherLoader.read.IconCompatParcelizer())));
        IsFixableByRetry isFixableByRetry = new IsFixableByRetry(9);
        defaultScheduler.getClass();
        this.serialisationDispatcher = defaultScheduler;
        this.mutexBasedMainScope = h$b;
        this.historyRecorderChooserFactory = isFixableByRetry;
        this.eventsQueue = new LimitedQueue();
        MapboxNavigationProvider.observers.add(this);
        MapboxNavigation mapboxNavigation = MapboxNavigationProvider.mapboxNavigation;
        if (mapboxNavigation != null) {
            onAttached(mapboxNavigation);
        }
    }

    @Override // com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver
    public final void onDetached(MapboxNavigation mapboxNavigation) {
        mapboxNavigation.getClass();
        this.recorder = null;
        JobKt.serializer(((ContextScope) this.mutexBasedMainScope.serializer).serializer);
    }

    public final void pushEventOrAddToQueue(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        MapboxHistoryRecorder mapboxHistoryRecorder = this.recorder;
        if (mapboxHistoryRecorder != null) {
            this.mutexBasedMainScope.launchWithMutex(new TooltipStateImpl.AnonymousClass2(this, mapboxHistoryRecorder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 5));
        } else {
            LinkedList linkedList = (LinkedList) this.eventsQueue.list;
            linkedList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            while (linkedList.size() > 8) {
                linkedList.remove();
            }
        }
    }

    public final void pushEventIfEnabled(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        MapboxHistoryRecorder mapboxHistoryRecorder = this.recorder;
        if (mapboxHistoryRecorder != null) {
            this.mutexBasedMainScope.launchWithMutex(new TooltipStateImpl.AnonymousClass2(this, mapboxHistoryRecorder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 5));
        }
    }
}
