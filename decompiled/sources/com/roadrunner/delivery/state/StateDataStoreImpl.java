package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.accesstoComposeOffset;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.layoutAccordingTo;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.toNestedScrollSource;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class StateDataStoreImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final accesstoComposeOffset write;
    public final isRoot read = new isRoot("state_response");
    public final isRoot RemoteActionCompatParcelizer = new isRoot("force_update_increment");

    public StateDataStoreImpl(accesstoComposeOffset accesstocomposeoffset, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = accesstocomposeoffset;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object clearState(ContinuationImpl continuationImpl) {
        layoutAccordingTo layoutaccordingto;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        serializer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof layoutAccordingTo;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof layoutAccordingTo) {
            layoutaccordingto = (layoutAccordingTo) continuationImpl;
            int i3 = layoutaccordingto.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                layoutaccordingto.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                int i4 = IconCompatParcelizer + 121;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                layoutaccordingto = new layoutAccordingTo(this, continuationImpl);
            }
        } else {
            layoutaccordingto = new layoutAccordingTo(this, continuationImpl);
        }
        Object obj = layoutaccordingto.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = layoutaccordingto.RemoteActionCompatParcelizer;
        int i7 = 1;
        try {
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                DividerUiModelImpl$1 dividerUiModelImpl$1 = new DividerUiModelImpl$1(this, shortNewsContentCardView, i7);
                layoutaccordingto.RemoteActionCompatParcelizer = 1;
                if (BuildersKt.withContext(defaultIoScheduler, dividerUiModelImpl$1, layoutaccordingto) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to clear delivery state", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final Object storeState(String str, ContinuationImpl continuationImpl) {
        toNestedScrollSource tonestedscrollsource;
        int i = 2;
        int i2 = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!(continuationImpl instanceof toNestedScrollSource)) {
            tonestedscrollsource = new toNestedScrollSource(this, continuationImpl);
        } else {
            int i3 = IconCompatParcelizer + 99;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = ((toNestedScrollSource) continuationImpl).serializer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            tonestedscrollsource = (toNestedScrollSource) continuationImpl;
            int i5 = tonestedscrollsource.serializer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = serializer + 35;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    tonestedscrollsource.serializer = i5 >>> Integer.MIN_VALUE;
                } else {
                    tonestedscrollsource.serializer = i5 - Integer.MIN_VALUE;
                }
            } else {
                tonestedscrollsource = new toNestedScrollSource(this, continuationImpl);
            }
        }
        Object obj = tonestedscrollsource.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = tonestedscrollsource.serializer;
        try {
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) this.write.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                HeatmapDataStore$set$2 heatmapDataStore$set$2 = new HeatmapDataStore$set$2(this, str, shortNewsContentCardView, i);
                tonestedscrollsource.serializer = 1;
                if (performcustomexitmxy_nc0.updateData(heatmapDataStore$set$2, tonestedscrollsource) == coroutineSingletons) {
                    int i8 = IconCompatParcelizer + 71;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = serializer + 101;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to store delivery state", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
