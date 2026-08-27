package com.roadrunner.delivery.accept.footer.implementation.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.drawRGB;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptFooterUiModelImpl$1$1 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ boolean read;
    public /* synthetic */ boolean serializer;
    public /* synthetic */ drawRGB write;

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        boolean z = this.serializer;
        boolean z2 = this.RemoteActionCompatParcelizer;
        boolean z3 = this.read;
        drawRGB drawrgb = this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (drawrgb == drawRGB.ACTIVE) {
            Boolean bool = Boolean.FALSE;
            int i2 = IconCompatParcelizer + 7;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return bool;
        }
        boolean z4 = true;
        if (z) {
            int i4 = MediaSessionCompatQueueItem + 21;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            int i6 = IconCompatParcelizer + 103;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if ((!z2) && !z3) {
                z4 = false;
            } else {
                int i7 = MediaSessionCompatQueueItem + 21;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        return Boolean.valueOf(z4);
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        DeliveryAcceptFooterUiModelImpl$1$1 deliveryAcceptFooterUiModelImpl$1$1 = new DeliveryAcceptFooterUiModelImpl$1$1(5, (ShortNewsContentCardView) obj5);
        deliveryAcceptFooterUiModelImpl$1$1.serializer = zBooleanValue;
        deliveryAcceptFooterUiModelImpl$1$1.RemoteActionCompatParcelizer = zBooleanValue2;
        deliveryAcceptFooterUiModelImpl$1$1.read = zBooleanValue3;
        deliveryAcceptFooterUiModelImpl$1$1.write = (drawRGB) obj4;
        Object objInvokeSuspend = deliveryAcceptFooterUiModelImpl$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = IconCompatParcelizer + 99;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    public DeliveryAcceptFooterUiModelImpl$1$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
