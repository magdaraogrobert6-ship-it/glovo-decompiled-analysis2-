package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetDropExceptionHandlercp implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final accessgetDropExceptionHandlercp write;

    static {
        accessgetDropExceptionHandlercp accessgetdropexceptionhandlercp = new accessgetDropExceptionHandlercp();
        write = accessgetdropexceptionhandlercp;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("qr_code_payment", accessgetdropexceptionhandlercp, 9);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("default", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("switch_to_cash_button", true);
        oncloseactionlambda1.read("switch_to_qr_button", true);
        oncloseactionlambda1.read("cash", false);
        oncloseactionlambda1.read("qr_code", true);
        oncloseactionlambda1.read("status", true);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        PopupLayoutHelper popupLayoutHelper = PopupLayoutHelper.read;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(popupLayoutHelper), LazyKt__LazyJVMKt.read(popupLayoutHelper), DelegatingFontLoaderForDeprecatedUsage_androidKt.write, LazyKt__LazyJVMKt.read(accessgetFontMatchercp.read), LazyKt__LazyJVMKt.read(FontListFontFamilyTypefaceAdapterpreload3.IconCompatParcelizer), onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic = (r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc) obj;
        r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc.$childSerializers;
        String str = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.id;
        List list = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.trackingEvents;
        FontListFontFamilyTypefaceAdapterpreload3211 fontListFontFamilyTypefaceAdapterpreload3211 = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.status;
        FontListFontFamilyTypefaceAdapterCompanion fontListFontFamilyTypefaceAdapterCompanion = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.qrCodePayment;
        getDismissOnBackPress getdismissonbackpress = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.switchToQrButton;
        getDismissOnBackPress getdismissonbackpress2 = r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.switchToCashButton;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.defaultPayment);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.required);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getdismissonbackpress2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, PopupLayoutHelper.read, getdismissonbackpress2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getdismissonbackpress != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, PopupLayoutHelper.read, getdismissonbackpress);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, DelegatingFontLoaderForDeprecatedUsage_androidKt.write, r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic.cashPayment);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontListFontFamilyTypefaceAdapterCompanion != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessgetFontMatchercp.read, fontListFontFamilyTypefaceAdapterCompanion);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (fontListFontFamilyTypefaceAdapterpreload3211 != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = RemoteActionCompatParcelizer + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, FontListFontFamilyTypefaceAdapterpreload3.IconCompatParcelizer, fontListFontFamilyTypefaceAdapterpreload3211);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = RemoteActionCompatParcelizer + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 2 % 5;
        }
        List list = null;
        FontListFontFamilyTypefaceAdapterpreload3211 fontListFontFamilyTypefaceAdapterpreload3211 = null;
        FontListFontFamilyTypefaceAdapterCompanion fontListFontFamilyTypefaceAdapterCompanion = null;
        boolean z = true;
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        boolean zWrite = false;
        getDismissOnBackPress getdismissonbackpress = null;
        getDismissOnBackPress getdismissonbackpress2 = null;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    z = false;
                    i = 2;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    i = 2;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    int i7 = read + 119;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i = 2;
                    break;
                case 2:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i5 |= 4;
                    i = 2;
                    break;
                case 3:
                    getdismissonbackpress = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, PopupLayoutHelper.read, getdismissonbackpress);
                    i5 |= 8;
                    i = 2;
                    break;
                case 4:
                    getdismissonbackpress2 = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, PopupLayoutHelper.read, getdismissonbackpress2);
                    i5 |= 16;
                    i = 2;
                    break;
                case 5:
                    delegatingFontLoaderForBridgeUsage = (DelegatingFontLoaderForBridgeUsage) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, DelegatingFontLoaderForDeprecatedUsage_androidKt.write, delegatingFontLoaderForBridgeUsage);
                    i5 |= 32;
                    i = 2;
                    break;
                case 6:
                    fontListFontFamilyTypefaceAdapterCompanion = (FontListFontFamilyTypefaceAdapterCompanion) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessgetFontMatchercp.read, fontListFontFamilyTypefaceAdapterCompanion);
                    i5 |= 64;
                    i = 2;
                    break;
                case 7:
                    fontListFontFamilyTypefaceAdapterpreload3211 = (FontListFontFamilyTypefaceAdapterpreload3211) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, FontListFontFamilyTypefaceAdapterpreload3.IconCompatParcelizer, fontListFontFamilyTypefaceAdapterpreload3211);
                    i5 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    break;
                case 8:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    i = 2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic = new r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc(i5, strMediaMetadataCompat, strMediaMetadataCompat2, zWrite, getdismissonbackpress, getdismissonbackpress2, delegatingFontLoaderForBridgeUsage, fontListFontFamilyTypefaceAdapterCompanion, fontListFontFamilyTypefaceAdapterpreload3211, list);
        int i9 = read + 47;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return r8lambdajvpnp1g4npxuhv7kc_gm_6h5dic;
    }
}
