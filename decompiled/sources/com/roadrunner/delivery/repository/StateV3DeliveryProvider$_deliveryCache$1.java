package com.roadrunner.delivery.repository;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidPopup_androidKtPopup41;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.isItemDismissable;
import o.isUnspecifiedR2X_6o;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.setFitInsetsSides;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3DeliveryProvider$_deliveryCache$1 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public /* synthetic */ Object write;

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        Object obj6 = ((onItemDismiss) obj).IconCompatParcelizer;
        Object obj7 = ((onItemDismiss) obj2).IconCompatParcelizer;
        Object obj8 = ((onItemDismiss) obj3).IconCompatParcelizer;
        Object obj9 = ((onItemDismiss) obj4).IconCompatParcelizer;
        StateV3DeliveryProvider$_deliveryCache$1 stateV3DeliveryProvider$_deliveryCache$1 = new StateV3DeliveryProvider$_deliveryCache$1(5, (ShortNewsContentCardView) obj5);
        stateV3DeliveryProvider$_deliveryCache$1.write = obj6;
        stateV3DeliveryProvider$_deliveryCache$1.read = obj7;
        stateV3DeliveryProvider$_deliveryCache$1.IconCompatParcelizer = obj8;
        stateV3DeliveryProvider$_deliveryCache$1.RemoteActionCompatParcelizer = obj9;
        Object objInvokeSuspend = stateV3DeliveryProvider$_deliveryCache$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = serializer + 77;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 47;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj2 = this.write;
        Object obj3 = this.read;
        Object obj4 = this.IconCompatParcelizer;
        Object obj5 = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (obj2 instanceof isItemDismissable) {
            obj2 = null;
        }
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = (AndroidPopup_androidKtPopup41) obj2;
        if (!(!(obj3 instanceof isItemDismissable))) {
            obj3 = null;
        }
        setFitInsetsSides setfitinsetssides = (setFitInsetsSides) obj3;
        if (obj4 instanceof isItemDismissable) {
            obj4 = null;
        }
        List list = (List) obj4;
        if (list != null) {
            arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) list);
            int i4 = serializer + 13;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            arrayListRemoteActionCompatParcelizer = null;
        }
        if (obj5 instanceof isItemDismissable) {
            obj5 = null;
        }
        return new isUnspecifiedR2X_6o(androidPopup_androidKtPopup41, setfitinsetssides, arrayListRemoteActionCompatParcelizer, (List) obj5);
    }

    public StateV3DeliveryProvider$_deliveryCache$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
