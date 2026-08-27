package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ClickableSaverlambda1;
import o.copyaIRg9q4default;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptDeliveryImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ClickableSaverlambda1 RemoteActionCompatParcelizer;

    public AutoAcceptDeliveryImpl(ClickableSaverlambda1 clickableSaverlambda1) {
        this.RemoteActionCompatParcelizer = clickableSaverlambda1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: autoAcceptDelivery-0E7RQCE, reason: not valid java name */
    public final Object m4899autoAcceptDelivery0E7RQCE(String str, String str2, ContinuationImpl continuationImpl) {
        int i;
        AutoAcceptDeliveryImpl$autoAcceptDelivery$1 autoAcceptDeliveryImpl$autoAcceptDelivery$1;
        int i2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i3;
        Object objM4910autoAcceptDeliverygIAlus;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 7;
        int i6 = i5 % Fields.SpotShadowColor;
        serializer = i6;
        if (i5 % 2 == 0) {
            if (continuationImpl instanceof AutoAcceptDeliveryImpl$autoAcceptDelivery$1) {
                i = i6 + 11;
                IconCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i7 = ((AutoAcceptDeliveryImpl$autoAcceptDelivery$1) continuationImpl).serializer;
                    throw null;
                }
                autoAcceptDeliveryImpl$autoAcceptDelivery$1 = (AutoAcceptDeliveryImpl$autoAcceptDelivery$1) continuationImpl;
                i2 = autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i8 = serializer + 119;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer = i2 - Integer.MIN_VALUE;
                }
            }
            obj = autoAcceptDeliveryImpl$autoAcceptDelivery$1.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                copyaIRg9q4default copyairg9q4default = new copyaIRg9q4default(str, str2);
                autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer = 1;
                objM4910autoAcceptDeliverygIAlus = ((DeliveryAcceptDataRepository) this.RemoteActionCompatParcelizer).m4910autoAcceptDeliverygIAlus(copyairg9q4default, autoAcceptDeliveryImpl$autoAcceptDelivery$1);
                if (objM4910autoAcceptDeliverygIAlus == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objM4910autoAcceptDeliverygIAlus;
            }
            int i10 = IconCompatParcelizer + 29;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i12 = 22 / 0;
        if (continuationImpl instanceof AutoAcceptDeliveryImpl$autoAcceptDelivery$1) {
            i = i6 + 11;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i13 = ((AutoAcceptDeliveryImpl$autoAcceptDelivery$1) continuationImpl).serializer;
                throw null;
            }
            autoAcceptDeliveryImpl$autoAcceptDelivery$1 = (AutoAcceptDeliveryImpl$autoAcceptDelivery$1) continuationImpl;
            i2 = autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i14 = serializer + 119;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer = i2 - Integer.MIN_VALUE;
            }
        }
        obj = autoAcceptDeliveryImpl$autoAcceptDelivery$1.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            copyaIRg9q4default copyairg9q4default2 = new copyaIRg9q4default(str, str2);
            autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer = 1;
            objM4910autoAcceptDeliverygIAlus = ((DeliveryAcceptDataRepository) this.RemoteActionCompatParcelizer).m4910autoAcceptDeliverygIAlus(copyairg9q4default2, autoAcceptDeliveryImpl$autoAcceptDelivery$1);
            if (objM4910autoAcceptDeliverygIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM4910autoAcceptDeliverygIAlus;
        }
        int i16 = IconCompatParcelizer + 29;
        serializer = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
        autoAcceptDeliveryImpl$autoAcceptDelivery$1 = new AutoAcceptDeliveryImpl$autoAcceptDelivery$1(this, continuationImpl);
        int i18 = serializer + 11;
        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        obj = autoAcceptDeliveryImpl$autoAcceptDelivery$1.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            copyaIRg9q4default copyairg9q4default3 = new copyaIRg9q4default(str, str2);
            autoAcceptDeliveryImpl$autoAcceptDelivery$1.serializer = 1;
            objM4910autoAcceptDeliverygIAlus = ((DeliveryAcceptDataRepository) this.RemoteActionCompatParcelizer).m4910autoAcceptDeliverygIAlus(copyairg9q4default3, autoAcceptDeliveryImpl$autoAcceptDelivery$1);
            if (objM4910autoAcceptDeliverygIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM4910autoAcceptDeliverygIAlus;
        }
        int i110 = IconCompatParcelizer + 29;
        serializer = i110 % Fields.SpotShadowColor;
        int i111 = i110 % 2;
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
