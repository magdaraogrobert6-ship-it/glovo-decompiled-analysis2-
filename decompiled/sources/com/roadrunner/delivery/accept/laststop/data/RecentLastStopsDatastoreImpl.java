package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.drawARGB;
import o.getPrimaryHorizontaldefault;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentLastStopsDatastoreImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final performCustomExitMxy_nc0 IconCompatParcelizer;
    public final isRoot serializer = new isRoot("pref_key_recent_last_stops");

    public RecentLastStopsDatastoreImpl(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$decodeFromJson(RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl, String str, ContinuationImpl continuationImpl) throws Throwable {
        getPrimaryHorizontaldefault getprimaryhorizontaldefault;
        int i = 2 % 2;
        if (continuationImpl instanceof getPrimaryHorizontaldefault) {
            getprimaryhorizontaldefault = (getPrimaryHorizontaldefault) continuationImpl;
            int i2 = getprimaryhorizontaldefault.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getprimaryhorizontaldefault.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                getprimaryhorizontaldefault = new getPrimaryHorizontaldefault(recentLastStopsDatastoreImpl, continuationImpl);
            }
        } else {
            getprimaryhorizontaldefault = new getPrimaryHorizontaldefault(recentLastStopsDatastoreImpl, continuationImpl);
        }
        Object obj = getprimaryhorizontaldefault.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getprimaryhorizontaldefault.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i4 = 1;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                return (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(drawARGB.Companion.serializer(), 0));
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.write(e);
                getprimaryhorizontaldefault.RemoteActionCompatParcelizer = 1;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RecentLastStopsDatastoreImpl$getRecentLastStops$2(recentLastStopsDatastoreImpl, shortNewsContentCardView, i4), getprimaryhorizontaldefault);
                if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objWithContext = createFromParcel.INSTANCE;
                }
                if (objWithContext == obj2) {
                    int i5 = read + 37;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return obj2;
                    }
                    int i6 = 14 / 0;
                    return obj2;
                }
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = RemoteActionCompatParcelizer + 35;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return instance_delegatelambda0.write;
    }
}
