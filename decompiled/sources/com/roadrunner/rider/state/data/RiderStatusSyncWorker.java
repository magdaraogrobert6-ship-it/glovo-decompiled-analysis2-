package com.roadrunner.rider.state.data;

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
import o.ShortNewsContentCardView;
import o.accesssetRenderEffectjd;
import o.getOptimizationLevel;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.setAmbientShadowColor8_81llA;
import o.setClip;
import o.setSdkClickBackoffStrategy;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatusSyncWorker extends CoroutineWorker {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 MediaSessionCompatQueueItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderStatusSyncWorker(Context context, WorkerParameters workerParameters, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaSessionCompatQueueItem = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        setSdkClickBackoffStrategy setsdkclickbackoffstrategy;
        int i = 2 % 2;
        Object obj = null;
        if (shortNewsContentCardView instanceof setSdkClickBackoffStrategy) {
            int i2 = RatingCompat + 69;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((setSdkClickBackoffStrategy) shortNewsContentCardView).IconCompatParcelizer;
                throw null;
            }
            setsdkclickbackoffstrategy = (setSdkClickBackoffStrategy) shortNewsContentCardView;
            int i4 = setsdkclickbackoffstrategy.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setsdkclickbackoffstrategy.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                setsdkclickbackoffstrategy = new setSdkClickBackoffStrategy(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            setsdkclickbackoffstrategy = new setSdkClickBackoffStrategy(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objFirstOrNull = setsdkclickbackoffstrategy.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setsdkclickbackoffstrategy.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = RatingCompat;
            int i7 = i6 + 57;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i6 + 11;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            if (((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.serializer() == null) {
                return new setClip();
            }
            Object objWrite = this.MediaMetadataCompat.write();
            objWrite.getClass();
            Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write((UpdateStateUseCaseImpl) objWrite));
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(17);
            setsdkclickbackoffstrategy.IconCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowWrite, signInDataStore$clear$2, setsdkclickbackoffstrategy);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirstOrNull;
        if (getoptimizationlevel != null && getoptimizationlevel.serializer()) {
            setClip setclip = new setClip();
            int i11 = RatingCompat + 43;
            MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return setclip;
        }
        boolean z = this.MediaBrowserCompatMediaItem.write < 3;
        Timber.RemoteActionCompatParcelizer.write(new RiderStatusWorkerException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to update state from RiderSafetyStatusSyncWorker. Will retry: ", z), getoptimizationlevel != null ? getoptimizationlevel.read() : null));
        if (!z) {
            return new accesssetRenderEffectjd();
        }
        setAmbientShadowColor8_81llA setambientshadowcolor8_81lla = new setAmbientShadowColor8_81llA();
        int i13 = MediaDescriptionCompat + 33;
        RatingCompat = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            return setambientshadowcolor8_81lla;
        }
        obj.hashCode();
        throw null;
    }
}
