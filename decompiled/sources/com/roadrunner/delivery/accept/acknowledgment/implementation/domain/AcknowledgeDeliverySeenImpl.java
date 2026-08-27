package com.roadrunner.delivery.accept.acknowledgment.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ClickableSaverlambda1;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgeDeliverySeenImpl {
    private static int serializer = 1;
    private static int write;
    public final ClickableSaverlambda1 RemoteActionCompatParcelizer;

    public AcknowledgeDeliverySeenImpl(ClickableSaverlambda1 clickableSaverlambda1) {
        this.RemoteActionCompatParcelizer = clickableSaverlambda1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    public final Object m4897invokeyxL6bBk(String str, String str2, String str3, long j, ContinuationImpl continuationImpl) {
        AcknowledgeDeliverySeenImpl$invoke$1 acknowledgeDeliverySeenImpl$invoke$1;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 11;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof AcknowledgeDeliverySeenImpl$invoke$1) {
            int i5 = i2 + 51;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            acknowledgeDeliverySeenImpl$invoke$1 = (AcknowledgeDeliverySeenImpl$invoke$1) continuationImpl;
            int i7 = acknowledgeDeliverySeenImpl$invoke$1.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = serializer + 17;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                acknowledgeDeliverySeenImpl$invoke$1.read = i7 - Integer.MIN_VALUE;
            } else {
                acknowledgeDeliverySeenImpl$invoke$1 = new AcknowledgeDeliverySeenImpl$invoke$1(this, continuationImpl);
                int i10 = serializer + 13;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        } else {
            acknowledgeDeliverySeenImpl$invoke$1 = new AcknowledgeDeliverySeenImpl$invoke$1(this, continuationImpl);
            int i12 = serializer + 13;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        AcknowledgeDeliverySeenImpl$invoke$1 acknowledgeDeliverySeenImpl$invoke$2 = acknowledgeDeliverySeenImpl$invoke$1;
        Object obj = acknowledgeDeliverySeenImpl$invoke$2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = acknowledgeDeliverySeenImpl$invoke$2.read;
        if (i14 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            acknowledgeDeliverySeenImpl$invoke$2.read = 1;
            Object objM4909ackOrderSeenyxL6bBk = ((DeliveryAcceptDataRepository) this.RemoteActionCompatParcelizer).m4909ackOrderSeenyxL6bBk(str, str2, str3, j, acknowledgeDeliverySeenImpl$invoke$2);
            return objM4909ackOrderSeenyxL6bBk == coroutineSingletons ? coroutineSingletons : objM4909ackOrderSeenyxL6bBk;
        }
        if (i14 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i15 = serializer + 75;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                int i16 = 27 / 0;
            }
            return null;
        }
        int i17 = serializer + 73;
        write = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        throw null;
    }
}
