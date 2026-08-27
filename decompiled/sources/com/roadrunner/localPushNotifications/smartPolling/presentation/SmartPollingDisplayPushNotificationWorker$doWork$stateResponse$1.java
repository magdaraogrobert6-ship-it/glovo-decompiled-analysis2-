package com.roadrunner.localPushNotifications.smartPolling.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.state.StateV3$ScreenType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidPopup_androidKtLocalIsInPopupLayout1;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.ContainsAlllambda0;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getOffscreenPageLimit;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.setFitInsetsSides;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartPollingDisplayPushNotificationWorker$doWork$stateResponse$1 extends SuspendLambda implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ ContainsAlllambda0 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public /* synthetic */ Object serializer;
    public /* synthetic */ Object write;

    public SmartPollingDisplayPushNotificationWorker$doWork$stateResponse$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(6, shortNewsContentCardView);
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = 2 % 2;
        Object obj7 = ((onItemDismiss) obj).IconCompatParcelizer;
        Object obj8 = ((onItemDismiss) obj2).IconCompatParcelizer;
        Object obj9 = ((onItemDismiss) obj4).IconCompatParcelizer;
        Object obj10 = ((onItemDismiss) obj5).IconCompatParcelizer;
        SmartPollingDisplayPushNotificationWorker$doWork$stateResponse$1 smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1 = new SmartPollingDisplayPushNotificationWorker$doWork$stateResponse$1((ShortNewsContentCardView) obj6);
        smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.serializer = obj7;
        smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.read = obj8;
        smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.RemoteActionCompatParcelizer = (ContainsAlllambda0) obj3;
        smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.write = obj9;
        smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.IconCompatParcelizer = obj10;
        Object objInvokeSuspend = smartPollingDisplayPushNotificationWorker$doWork$stateResponse$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaSessionCompatQueueItem + 19;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object obj2 = this.serializer;
        Object obj3 = this.read;
        ContainsAlllambda0 containsAlllambda0 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.write;
        Object obj5 = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (obj2 instanceof isItemDismissable) {
            obj2 = null;
        }
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj2;
        if (!(!(obj3 instanceof isItemDismissable))) {
            int i2 = MediaSessionCompatQueueItem + 37;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            obj3 = null;
        }
        AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout1 = (AndroidPopup_androidKtLocalIsInPopupLayout1) obj3;
        if (obj4 instanceof isItemDismissable) {
            obj4 = null;
        }
        StateV3$ScreenType stateV3$ScreenType = (StateV3$ScreenType) obj4;
        if (obj5 instanceof isItemDismissable) {
            int i4 = MediaDescriptionCompat + 119;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            obj5 = null;
        }
        return new getOffscreenPageLimit(androidView_androidKtcreateAndroidViewNodeFactory11, androidPopup_androidKtLocalIsInPopupLayout1, containsAlllambda0, stateV3$ScreenType, (setFitInsetsSides) obj5);
    }
}
