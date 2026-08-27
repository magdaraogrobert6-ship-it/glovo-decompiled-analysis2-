package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentType;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetDisplayNamejd implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final accessgetDisplayNamejd read;
    private static int serializer = 1;
    private static int write;

    static {
        accessgetDisplayNamejd accessgetdisplaynamejd = new accessgetDisplayNamejd();
        read = accessgetdisplaynamejd;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem", accessgetdisplaynamejd, 10);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read("defaultPaymentType", false);
        oncloseactionlambda1.read("switchToCashButton", false);
        oncloseactionlambda1.read("switchToQrCodeButton", false);
        oncloseactionlambda1.read("qrCode", false);
        oncloseactionlambda1.read("cashPaymentTaskUiItem", false);
        oncloseactionlambda1.read("currency", false);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("trackingEvents", false);
        descriptor = oncloseactionlambda1;
        int i = write + 21;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 13;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = C0195provider.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getExitjXw82LU getexitjxw82lu = getExitjXw82LU.read;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, getWasCloseMessageCalled.write, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(getexitjxw82lu), LazyKt__LazyJVMKt.read(getexitjxw82lu), LazyKt__LazyJVMKt.read(PreviewParameterProviderDefaultImpls.RemoteActionCompatParcelizer), TargetState.read, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(PreviewWrapperProvider.RemoteActionCompatParcelizer), onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper()};
        int i4 = IconCompatParcelizer + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        C0195provider c0195provider = (C0195provider) obj;
        c0195provider.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = C0195provider.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, c0195provider.taskId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, c0195provider.isOptional);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), c0195provider.defaultPaymentType);
        getExitjXw82LU getexitjxw82lu = getExitjXw82LU.read;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getexitjxw82lu, c0195provider.switchToCashButton);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getexitjxw82lu, c0195provider.switchToQrCodeButton);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, PreviewParameterProviderDefaultImpls.RemoteActionCompatParcelizer, c0195provider.qrCode);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, TargetState.read, c0195provider.cashPaymentTaskUiItem);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, c0195provider.currency);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, PreviewWrapperProvider.RemoteActionCompatParcelizer, c0195provider.status);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), c0195provider.trackingEvents);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = C0195provider.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        Wallpaper wallpaper = null;
        String str = null;
        boolean z = true;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = null;
        int i4 = 0;
        String strMediaMetadataCompat = null;
        boolean zWrite = false;
        QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType = null;
        ComposeAnimationState composeAnimationState = null;
        ComposeAnimationState composeAnimationState2 = null;
        getDisplayName getdisplayname = null;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    z = false;
                    z = z;
                    break;
                case 0:
                    z = z;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    z = z;
                    break;
                case 1:
                    z = z;
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    z = z;
                    break;
                case 2:
                    z = z;
                    qrPaymentTaskUiItem$PaymentType = (QrPaymentTaskUiItem$PaymentType) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), qrPaymentTaskUiItem$PaymentType);
                    i4 |= 4;
                    z = z;
                    break;
                case 3:
                    z = z;
                    composeAnimationState = (ComposeAnimationState) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getExitjXw82LU.read, composeAnimationState);
                    i4 |= 8;
                    z = z;
                    break;
                case 4:
                    z = z;
                    composeAnimationState2 = (ComposeAnimationState) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getExitjXw82LU.read, composeAnimationState2);
                    i4 |= 16;
                    z = z;
                    break;
                case 5:
                    z = z;
                    getdisplayname = (getDisplayName) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, PreviewParameterProviderDefaultImpls.RemoteActionCompatParcelizer, getdisplayname);
                    i4 |= 32;
                    z = z;
                    break;
                case 6:
                    z = z;
                    cashPaymentTaskUiItem = (CashPaymentTaskUiItem) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, TargetState.read, cashPaymentTaskUiItem);
                    i4 |= 64;
                    z = z;
                    break;
                case 7:
                    z = z;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    z = z;
                    break;
                case 8:
                    wallpaper = (Wallpaper) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, PreviewWrapperProvider.RemoteActionCompatParcelizer, wallpaper);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                    i = serializer;
                    i2 = 9;
                    int i6 = i + i2;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = z;
                    break;
                case 9:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                    i = serializer;
                    i2 = 3;
                    int i8 = i + i2;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z = z;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        C0195provider c0195provider = new C0195provider(i4, strMediaMetadataCompat, zWrite, qrPaymentTaskUiItem$PaymentType, composeAnimationState, composeAnimationState2, getdisplayname, cashPaymentTaskUiItem, str, wallpaper, list);
        int i10 = serializer + 33;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return c0195provider;
        }
        throw null;
    }
}
