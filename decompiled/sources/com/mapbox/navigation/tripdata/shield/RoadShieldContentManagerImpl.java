package com.mapbox.navigation.tripdata.shield;

import android.util.LruCache;
import androidx.room.Room;
import com.mapbox.navigation.utils.internal.JobControl;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.verifyOrientationStatuslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadShieldContentManagerImpl implements RoadShieldContentManager {
    public final JobControl mainJob;

    @Override // com.mapbox.navigation.tripdata.shield.RoadShieldContentManager
    public final void cancelAll() {
        SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((verifyOrientationStatuslambda2) this.mainJob.job.H_()).write);
        while (sequenceBuilderIterator.hasNext()) {
            ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) sequenceBuilderIterator.next()).write(null);
        }
    }

    public RoadShieldContentManagerImpl() {
        new LruCache(8);
        new LinkedHashSet();
        new ArrayList();
        new LruCache(15);
        new LinkedHashSet();
        new ArrayList();
        new LruCache(40);
        new LinkedHashSet();
        new ArrayList();
        new HashMap();
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.mainJob = new JobControl(onbackinvokedlambda0Serializer, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)));
        new ArrayList();
    }
}
