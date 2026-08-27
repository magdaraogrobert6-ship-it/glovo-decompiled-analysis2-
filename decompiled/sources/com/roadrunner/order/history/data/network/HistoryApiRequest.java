package com.roadrunner.order.history.data.network;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;
import o.z6;
import o.z7;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryApiRequest {
    private static int read = 0;
    private static int write = 1;
    public final z7 IconCompatParcelizer;
    public final ExecuteApiRequest RemoteActionCompatParcelizer;
    public final z6 serializer;

    public HistoryApiRequest(z7 z7Var, z6 z6Var, ExecuteApiRequest executeApiRequest) {
        z7Var.getClass();
        z6Var.getClass();
        executeApiRequest.getClass();
        this.IconCompatParcelizer = z7Var;
        this.serializer = z6Var;
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX INFO: renamed from: getHistory-0E7RQCE, reason: not valid java name */
    public final Object m4998getHistory0E7RQCE(long j, LocalDate localDate, ContinuationImpl continuationImpl) {
        HistoryApiRequest$getHistory$1 historyApiRequest$getHistory$1;
        int i = 2 % 2;
        if (continuationImpl instanceof HistoryApiRequest$getHistory$1) {
            historyApiRequest$getHistory$1 = (HistoryApiRequest$getHistory$1) continuationImpl;
            int i2 = historyApiRequest$getHistory$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = write + 73;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    historyApiRequest$getHistory$1.write = i2 >>> Integer.MIN_VALUE;
                } else {
                    historyApiRequest$getHistory$1.write = i2 - Integer.MIN_VALUE;
                }
            } else {
                historyApiRequest$getHistory$1 = new HistoryApiRequest$getHistory$1(this, continuationImpl);
            }
        } else {
            historyApiRequest$getHistory$1 = new HistoryApiRequest$getHistory$1(this, continuationImpl);
        }
        HistoryApiRequest$getHistory$1 historyApiRequest$getHistory$2 = historyApiRequest$getHistory$1;
        Object obj = historyApiRequest$getHistory$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = historyApiRequest$getHistory$2.write;
        Object obj2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$3 = new HistoryApiRequest$getHistory$2(this, j, localDate, (ShortNewsContentCardView) null, 0);
            historyApiRequest$getHistory$2.write = 1;
            Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(historyApiRequest$getHistory$3, historyApiRequest$getHistory$2);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i5 = write + 93;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i4 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = read + 113;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i7 = read + 121;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
