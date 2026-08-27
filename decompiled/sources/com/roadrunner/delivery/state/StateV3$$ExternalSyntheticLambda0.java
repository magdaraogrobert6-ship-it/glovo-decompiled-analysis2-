package com.roadrunner.delivery.state;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.ui.graphics.Fields;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.foodora.courier.app.application.CourierApplication;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import java.lang.annotation.Annotation;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.internal.EnumSerializer;
import o.AndroidPopup_androidKtLocalIsInPopupLayout1;
import o.AndroidPopup_androidKtPopup31;
import o.AndroidPopup_androidKtPopup41;
import o.AndroidPopup_androidKtPopup71;
import o.AndroidPopup_androidKtPopup811;
import o.AndroidView_androidKtAndroidView31;
import o.AndroidView_androidKtNoOpUpdate1;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.DialogProperties;
import o.PopupLayoutHelperImpl;
import o.SemanticsOwner;
import o.SuspendingTransactionWithoutReturn;
import o.beforeInAppMessageViewClosed;
import o.createBackCallback;
import o.createBackCallbacklambda0;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.fastCoerceAtMost;
import o.fastMaxOf;
import o.getClippingEnabled;
import o.getLambda1131826196ui;
import o.getListenersui;
import o.getRootInfoui;
import o.getUnregisteredInAppMessageannotations;
import o.isPopupLayoutdefault;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.resetLayoutParamsIfAppropriate;
import o.setFitInsetsTypes;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;
import o.trace;
import o.traceValue;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class StateV3$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ StateV3$$ExternalSyntheticLambda0(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Thread thread;
        int i = 2;
        int i2 = 2 % 2;
        Object obj = null;
        int i3 = 0;
        switch (this.serializer) {
            case 0:
                resetLayoutParamsIfAppropriate resetlayoutparamsifappropriate = new resetLayoutParamsIfAppropriate(displayInAppMessagelambda1.serializer(AndroidView_androidKtAndroidView31.class));
                List listAsList = Arrays.asList(new Annotation[0]);
                listAsList.getClass();
                resetlayoutparamsifappropriate.RemoteActionCompatParcelizer = listAsList;
                return resetlayoutparamsifappropriate;
            case 1:
                Looper mainLooper = Looper.getMainLooper();
                return Long.valueOf((mainLooper == null || (thread = mainLooper.getThread()) == null) ? -1L : thread.getId());
            case 2:
                CourierApplication courierApplication = CourierApplication.write;
                return SuspendingTransactionWithoutReturn.read;
            case 3:
                return new AudioAttributes.Builder().setUsage(10).setContentType(4).build();
            case 4:
                return null;
            case 5:
                SemanticsOwner.read.getClass();
                return Boolean.valueOf(getListenersui.serializer());
            case 6:
                return new getRootInfoui();
            case 7:
                return LocalAuthDataSource.serializer();
            case 8:
                return DelayKt.serializer(new hg$$ExternalSyntheticLambda5(24));
            case 9:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 10:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
                int i4 = RemoteActionCompatParcelizer + 93;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return setwasclosemessagecalled;
            case 11:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 12:
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglcSerializer = DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(i3));
                int i6 = RemoteActionCompatParcelizer + 43;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return r8lambda3kmch7yklpui_5smgazrgczhglcSerializer;
                }
                obj.hashCode();
                throw null;
            case 13:
                return DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(i));
            case 14:
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerChat registerPushToken - Success", new Object[0]);
                return createFromParcel.INSTANCE;
            case 15:
                return Long.valueOf(Instant.now().toEpochMilli());
            case 16:
                return Uri.parse("roadrunner://accept/decline_order");
            case 17:
                Uri uri = Uri.parse("roadrunner://accept/decline_order_v2");
                int i7 = read + 79;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return uri;
                }
                obj.hashCode();
                throw null;
            case 18:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 19:
                return DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(12));
            case 20:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.StateV3.Data", displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup41.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(traceValue.class), displayInAppMessagelambda1.serializer(fastCoerceAtMost.class), displayInAppMessagelambda1.serializer(AndroidView_androidKtcreateAndroidViewNodeFactory11.class), displayInAppMessagelambda1.serializer(AndroidPopup_androidKtLocalIsInPopupLayout1.class), displayInAppMessagelambda1.serializer(createBackCallback.class), displayInAppMessagelambda1.serializer(createBackCallbacklambda0.class)}, new setGraphicModalMaxWidthDp[]{trace.IconCompatParcelizer, fastMaxOf.serializer, AndroidView_androidKtNoOpUpdate1.RemoteActionCompatParcelizer, isPopupLayoutdefault.write, r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w.read, new EnumSerializer("com.roadrunner.delivery.state.StateV3.UnknownData", createBackCallbacklambda0.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 21:
                return new setWasCloseMessageCalled(AndroidPopup_androidKtPopup71.RemoteActionCompatParcelizer, 0);
            case 22:
                return new EnumSerializer(AndroidPopup_androidKtPopup811.Companion.serializer());
            case 23:
                return new EnumSerializer("last_stop", setFitInsetsTypes.INSTANCE, new Annotation[0]);
            case 24:
                return new PopupLayoutHelperImpl(DialogProperties.write);
            case 25:
                return new PopupLayoutHelperImpl(getLambda1131826196ui.serializer);
            case 26:
                return StateV3$ScreenType.m4949$r8$lambda$uPuq8UOwdJCFoS0JdLYFMHf0QE();
            case 27:
                return new EnumSerializer("com.roadrunner.delivery.state.StateV3.UnknownData", createBackCallbacklambda0.INSTANCE, new Annotation[0]);
            case 28:
                return AndroidPopup_androidKtPopup41.Companion.serializer();
            default:
                return new getClippingEnabled(AndroidPopup_androidKtPopup31.Companion.serializer());
        }
    }
}
