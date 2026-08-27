package com.deliveryhero.perseus.utils;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.google.android.gms.dynamite.zzj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.isQuad;

/* JADX INFO: loaded from: classes2.dex */
public final class BackoffTimer {
    public static final zzj IconCompatParcelizer = new zzj(8);
    public final PerseusLogger MediaMetadataCompat;
    public long RatingCompat;
    public long RemoteActionCompatParcelizer;
    public final PerseusConfigLocalDataStoreImpl read;
    public int serializer;
    public long write;

    public BackoffTimer(PerseusLogger perseusLogger, PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl) {
        perseusLogger.getClass();
        perseusConfigLocalDataStoreImpl.getClass();
        this.MediaMetadataCompat = perseusLogger;
        this.read = perseusConfigLocalDataStoreImpl;
        this.write = -1L;
        this.RatingCompat = 60L;
        this.serializer = -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object refreshConfig$perseus_release(ContinuationImpl continuationImpl) {
        isQuad isquad;
        BackoffTimer backoffTimer;
        BackoffTimer backoffTimer2;
        if (continuationImpl instanceof isQuad) {
            isquad = (isQuad) continuationImpl;
            int i = isquad.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                isquad.write = i - Integer.MIN_VALUE;
            } else {
                isquad = new isQuad(this, continuationImpl);
            }
        } else {
            isquad = new isQuad(this, continuationImpl);
        }
        Object batchDispatchHitsDelay = isquad.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = isquad.write;
        PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl = this.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(batchDispatchHitsDelay);
            isquad.IconCompatParcelizer = this;
            isquad.write = 1;
            batchDispatchHitsDelay = perseusConfigLocalDataStoreImpl.getBatchDispatchHitsDelay(isquad);
            if (batchDispatchHitsDelay != coroutineSingletons) {
                backoffTimer = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            backoffTimer = isquad.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(batchDispatchHitsDelay);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            backoffTimer2 = isquad.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(batchDispatchHitsDelay);
        }
        backoffTimer2.RatingCompat = ((Number) batchDispatchHitsDelay).longValue();
        return createFromParcel.INSTANCE;
        backoffTimer.RemoteActionCompatParcelizer = ((Number) batchDispatchHitsDelay).longValue();
        isquad.IconCompatParcelizer = this;
        isquad.write = 2;
        batchDispatchHitsDelay = perseusConfigLocalDataStoreImpl.getMaxBackoffTime(isquad);
        if (batchDispatchHitsDelay != coroutineSingletons) {
            backoffTimer2 = this;
            backoffTimer2.RatingCompat = ((Number) batchDispatchHitsDelay).longValue();
            return createFromParcel.INSTANCE;
        }
        return coroutineSingletons;
    }
}
