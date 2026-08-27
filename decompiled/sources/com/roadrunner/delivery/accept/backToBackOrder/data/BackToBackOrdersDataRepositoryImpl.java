package com.roadrunner.delivery.accept.backToBackOrder.data;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.TextLayoutCache;
import o.copyO0kMr_c;
import o.createFromParcel;
import o.getAnyOverlap;
import o.getContainsCenter;
import o.prepareForActivityTransitionCarryover;
import o.restoreChildFragmentState;
import o.setOnSessionTrackingFailedListener;
import o.setOnThirdPartySharingSettingsChangedListener;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BackToBackOrdersDataRepositoryImpl {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final UpdateStateUseCaseImpl IconCompatParcelizer;
    public final restoreChildFragmentState read;
    public final copyO0kMr_c serializer;
    public final getAnyOverlap write;

    public BackToBackOrdersDataRepositoryImpl(getAnyOverlap getanyoverlap, copyO0kMr_c copyo0kmr_c, restoreChildFragmentState restorechildfragmentstate, UpdateStateUseCaseImpl updateStateUseCaseImpl) {
        this.write = getanyoverlap;
        this.serializer = copyo0kmr_c;
        this.read = restorechildfragmentstate;
        this.IconCompatParcelizer = updateStateUseCaseImpl;
    }

    public final Object optOutOfBackToBackOrders(ContinuationImpl continuationImpl) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 77;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean zRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zRemoteActionCompatParcelizer) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new TextFieldSelectionManager$copy$1((Object) this.write, false, (ShortNewsContentCardView) null, i), continuationImpl);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext != coroutineSingletons) {
                objWithContext = createfromparcel;
            }
            if (objWithContext == coroutineSingletons) {
                int i5 = RatingCompat + 17;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 49 / 0;
                }
                return objWithContext;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r5
  0x002b: PHI (r1v15 o.getContainsCenter) = (r1v14 o.getContainsCenter), (r1v17 o.getContainsCenter) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final Object updateRiderState(ContinuationImpl continuationImpl) {
        getContainsCenter getcontainscenter;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof getContainsCenter) {
            int i3 = RatingCompat + 1;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                getcontainscenter = (getContainsCenter) continuationImpl;
                i = getcontainscenter.serializer;
                int i4 = 40 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getcontainscenter.serializer = i - Integer.MIN_VALUE;
                } else {
                    getcontainscenter = new getContainsCenter(this, continuationImpl);
                }
            } else {
                getcontainscenter = (getContainsCenter) continuationImpl;
                i = getcontainscenter.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getcontainscenter.serializer = i - Integer.MIN_VALUE;
                } else {
                    getcontainscenter = new getContainsCenter(this, continuationImpl);
                }
            }
        } else {
            getcontainscenter = new getContainsCenter(this, continuationImpl);
        }
        Object obj = getcontainscenter.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getcontainscenter.serializer;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowWrite = TuplesKt.write(this.IconCompatParcelizer.IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.OTHER, true)));
                getcontainscenter.serializer = 1;
                if (FlowKt.firstOrNull(flowWrite, getcontainscenter) == coroutineSingletons) {
                    int i6 = RemoteActionCompatParcelizer + 33;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = RatingCompat + 13;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = RemoteActionCompatParcelizer + 91;
                RatingCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        } catch (Throwable th) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Tapped but error fetching state for Back to back overlay", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object fetchBackToBackOrders(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        TextLayoutCache textLayoutCache;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof TextLayoutCache) {
            int i3 = RemoteActionCompatParcelizer + 55;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            textLayoutCache = (TextLayoutCache) continuationImpl;
            int i5 = textLayoutCache.RemoteActionCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                textLayoutCache.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                textLayoutCache = new TextLayoutCache(this, continuationImpl);
            }
        } else {
            textLayoutCache = new TextLayoutCache(this, continuationImpl);
        }
        Object obj = textLayoutCache.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = textLayoutCache.RemoteActionCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        boolean z2 = true;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            textLayoutCache.read = z;
            textLayoutCache.RemoteActionCompatParcelizer = 1;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new TextFieldSelectionManager$copy$1(this.write, z2, shortNewsContentCardView, i), textLayoutCache);
            if (objWithContext != obj2) {
                objWithContext = obj3;
            }
            if (objWithContext != obj2) {
            }
        }
        if (i6 != 1) {
            int i7 = RemoteActionCompatParcelizer + 43;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj3;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = textLayoutCache.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!z) {
            this.read.serializer(setOnSessionTrackingFailedListener.OTHER);
            return obj3;
        }
        textLayoutCache.read = z;
        textLayoutCache.RemoteActionCompatParcelizer = 2;
        return updateRiderState(textLayoutCache) == obj2 ? obj2 : obj3;
    }
}
