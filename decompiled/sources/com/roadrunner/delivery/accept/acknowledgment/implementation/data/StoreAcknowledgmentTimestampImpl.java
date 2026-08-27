package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.TextUnitSaverlambda1;
import o.TextUnitTypeSaverlambda0;
import o.TextUnitTypeSaverlambda1;
import o.createFromParcel;
import o.isItemDismissable;
import o.onBackPressedDispatcher_delegatelambda010;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.setFrom58bKbWc;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreAcknowledgmentTimestampImpl implements TextUnitTypeSaverlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final Clock IconCompatParcelizer;
    public final WorkManagerImpl read;
    public final TextUnitTypeSaverlambda1 write;

    public StoreAcknowledgmentTimestampImpl(TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1, WorkManagerImpl workManagerImpl, Clock clock) {
        this.write = textUnitTypeSaverlambda1;
        this.read = workManagerImpl;
        this.IconCompatParcelizer = clock;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4896invokegIAlus(TextUnitSaverlambda1 textUnitSaverlambda1, ContinuationImpl continuationImpl) {
        StoreAcknowledgmentTimestampImpl$invoke$1 storeAcknowledgmentTimestampImpl$invoke$1;
        long j;
        long j2;
        int i = 2 % 2;
        if (continuationImpl instanceof StoreAcknowledgmentTimestampImpl$invoke$1) {
            storeAcknowledgmentTimestampImpl$invoke$1 = (StoreAcknowledgmentTimestampImpl$invoke$1) continuationImpl;
            int i2 = storeAcknowledgmentTimestampImpl$invoke$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storeAcknowledgmentTimestampImpl$invoke$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                storeAcknowledgmentTimestampImpl$invoke$1 = new StoreAcknowledgmentTimestampImpl$invoke$1(this, continuationImpl);
            }
        } else {
            storeAcknowledgmentTimestampImpl$invoke$1 = new StoreAcknowledgmentTimestampImpl$invoke$1(this, continuationImpl);
        }
        Object obj = storeAcknowledgmentTimestampImpl$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = storeAcknowledgmentTimestampImpl$invoke$1.serializer;
        TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1 = this.write;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long jIconCompatParcelizer = textUnitSaverlambda1.IconCompatParcelizer();
                storeAcknowledgmentTimestampImpl$invoke$1.IconCompatParcelizer = jIconCompatParcelizer;
                storeAcknowledgmentTimestampImpl$invoke$1.serializer = 1;
                Object objContains = ((TimestampRepositoryImpl) textUnitTypeSaverlambda1).contains(jIconCompatParcelizer, storeAcknowledgmentTimestampImpl$invoke$1);
                if (objContains != coroutineSingletons) {
                    j = jIconCompatParcelizer;
                    obj = objContains;
                }
                return coroutineSingletons;
            }
            int i4 = serializer + 63;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 == 1 : i3 == 1) {
                long j3 = storeAcknowledgmentTimestampImpl$invoke$1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i5 = RemoteActionCompatParcelizer + 99;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                j = j3;
            } else {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = storeAcknowledgmentTimestampImpl$invoke$1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            WorkManagerImpl workManagerImpl = this.read;
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(CleanAcknowledgmentTimestampWorker.class).serializer(2L, TimeUnit.HOURS);
            ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer.serializer).MediaSessionCompatToken = onBackPressedDispatcher_delegatelambda010.read(j2);
            workManagerImpl.RemoteActionCompatParcelizer(r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer.RemoteActionCompatParcelizer());
            return createFromParcel.INSTANCE;
            if (!((Boolean) obj).booleanValue()) {
                long epochMilli = Instant.now(this.IconCompatParcelizer).toEpochMilli();
                storeAcknowledgmentTimestampImpl$invoke$1.IconCompatParcelizer = j;
                storeAcknowledgmentTimestampImpl$invoke$1.serializer = 2;
                if (pauseWebviewIfNecessarylambda10.serializer(((TimestampRepositoryImpl) textUnitTypeSaverlambda1).RemoteActionCompatParcelizer, new TimestampRepositoryImpl$addTimestamp$2(j, epochMilli, null), storeAcknowledgmentTimestampImpl$invoke$1) != coroutineSingletons) {
                    j2 = j;
                    WorkManagerImpl workManagerImpl2 = this.read;
                    r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer2 = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(CleanAcknowledgmentTimestampWorker.class).serializer(2L, TimeUnit.HOURS);
                    ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer2.serializer).MediaSessionCompatToken = onBackPressedDispatcher_delegatelambda010.read(j2);
                    workManagerImpl2.RemoteActionCompatParcelizer(r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer2.RemoteActionCompatParcelizer());
                }
                return coroutineSingletons;
            }
            return createFromParcel.INSTANCE;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Storing expiry timestamp failed", new Object[0]);
            return new isItemDismissable(e);
        }
    }
}
