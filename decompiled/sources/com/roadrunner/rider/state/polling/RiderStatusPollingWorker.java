package com.roadrunner.rider.state.polling;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ApiHelperForM3;
import o.ShortNewsContentCardView;
import o.accesssetRenderEffectjd;
import o.getOaidParameters;
import o.getOptimizationLevel;
import o.getPageSize;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.setClip;
import o.setOnSessionTrackingFailedListener;
import o.setOnThirdPartySharingSettingsChangedListener;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatusPollingWorker extends CoroutineWorker {
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final getPageSize MediaSessionCompatQueueItem;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderStatusPollingWorker(Context context, WorkerParameters workerParameters, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, getPageSize getpagesize) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        getpagesize.getClass();
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RatingCompat = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.MediaSessionCompatQueueItem = getpagesize;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        getOaidParameters getoaidparameters;
        int i;
        Object objFirstOrNull;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3;
        getOptimizationLevel getoptimizationlevel;
        int i4 = 2 % 2;
        int i5 = ParcelableVolumeInfo + 99;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            if (shortNewsContentCardView instanceof getOaidParameters) {
                getoaidparameters = (getOaidParameters) shortNewsContentCardView;
                i = getoaidparameters.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getoaidparameters.read = i - Integer.MIN_VALUE;
                }
            }
            objFirstOrNull = getoaidparameters.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = getoaidparameters.read;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                if (((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.RatingCompat).RemoteActionCompatParcelizer.serializer() == null) {
                    return new setClip();
                }
                Flow flowWrite = TuplesKt.write(((UpdateStateUseCaseImpl) this.MediaMetadataCompat.write()).IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.SMART_POLLING)));
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(19);
                getoaidparameters.read = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowWrite, signInDataStore$clear$2, getoaidparameters);
                if (objFirstOrNull == coroutineSingletons) {
                    i3 = MediaDescriptionCompat + 31;
                    ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            }
            getoptimizationlevel = (getOptimizationLevel) objFirstOrNull;
            if (getoptimizationlevel != null) {
                int i6 = ParcelableVolumeInfo + 51;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (getoptimizationlevel.serializer()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Smart status polling success", new Object[0]);
                    ((ApiHelperForM3) this.MediaSessionCompatQueueItem).serializer();
                    return new setClip();
                }
            }
            Timber.RemoteActionCompatParcelizer.write(new RiderStatusPollingException(getoptimizationlevel != null ? getoptimizationlevel.read() : null));
            return new accesssetRenderEffectjd();
        }
        int i8 = 21 / 0;
        if (!(!(shortNewsContentCardView instanceof getOaidParameters))) {
            getoaidparameters = (getOaidParameters) shortNewsContentCardView;
            i = getoaidparameters.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                getoaidparameters.read = i - Integer.MIN_VALUE;
            }
        }
        objFirstOrNull = getoaidparameters.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getoaidparameters.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            if (((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.RatingCompat).RemoteActionCompatParcelizer.serializer() == null) {
                return new setClip();
            }
            Flow flowWrite2 = TuplesKt.write(((UpdateStateUseCaseImpl) this.MediaMetadataCompat.write()).IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.SMART_POLLING)));
            SignInDataStore$clear$2 signInDataStore$clear$3 = new SignInDataStore$clear$2(19);
            getoaidparameters.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowWrite2, signInDataStore$clear$3, getoaidparameters);
            if (objFirstOrNull == coroutineSingletons) {
                i3 = MediaDescriptionCompat + 31;
                ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getoptimizationlevel = (getOptimizationLevel) objFirstOrNull;
        if (getoptimizationlevel != null) {
            int i9 = ParcelableVolumeInfo + 51;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getoptimizationlevel.serializer()) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Smart status polling success", new Object[0]);
                ((ApiHelperForM3) this.MediaSessionCompatQueueItem).serializer();
                return new setClip();
            }
        }
        Timber.RemoteActionCompatParcelizer.write(new RiderStatusPollingException(getoptimizationlevel != null ? getoptimizationlevel.read() : null));
        return new accesssetRenderEffectjd();
        getoaidparameters = new getOaidParameters(this, (ContinuationImpl) shortNewsContentCardView);
        objFirstOrNull = getoaidparameters.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getoaidparameters.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            if (((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.RatingCompat).RemoteActionCompatParcelizer.serializer() == null) {
                return new setClip();
            }
            Flow flowWrite3 = TuplesKt.write(((UpdateStateUseCaseImpl) this.MediaMetadataCompat.write()).IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.SMART_POLLING)));
            SignInDataStore$clear$2 signInDataStore$clear$4 = new SignInDataStore$clear$2(19);
            getoaidparameters.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowWrite3, signInDataStore$clear$4, getoaidparameters);
            if (objFirstOrNull == coroutineSingletons) {
                i3 = MediaDescriptionCompat + 31;
                ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getoptimizationlevel = (getOptimizationLevel) objFirstOrNull;
        if (getoptimizationlevel != null) {
            int i11 = ParcelableVolumeInfo + 51;
            MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getoptimizationlevel.serializer()) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Smart status polling success", new Object[0]);
                ((ApiHelperForM3) this.MediaSessionCompatQueueItem).serializer();
                return new setClip();
            }
        }
        Timber.RemoteActionCompatParcelizer.write(new RiderStatusPollingException(getoptimizationlevel != null ? getoptimizationlevel.read() : null));
        return new accesssetRenderEffectjd();
    }
}
