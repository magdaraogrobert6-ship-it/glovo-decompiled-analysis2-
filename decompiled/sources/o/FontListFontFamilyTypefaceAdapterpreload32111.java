package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontListFontFamilyTypefaceAdapterpreload32111 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    public static final FontListFontFamilyTypefaceAdapterpreload32111 write;

    static {
        FontListFontFamilyTypefaceAdapterpreload32111 fontListFontFamilyTypefaceAdapterpreload32111 = new FontListFontFamilyTypefaceAdapterpreload32111();
        write = fontListFontFamilyTypefaceAdapterpreload32111;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask.QrScanScreen", fontListFontFamilyTypefaceAdapterpreload32111, 8);
        oncloseactionlambda1.read("instruction_message", false);
        oncloseactionlambda1.read("headline", false);
        oncloseactionlambda1.read("error_message", false);
        oncloseactionlambda1.read("success_message", false);
        oncloseactionlambda1.read("qr_code", false);
        oncloseactionlambda1.read("tracking_events", true);
        oncloseactionlambda1.read("fallback_screen_button", false);
        oncloseactionlambda1.read("fallback_screen", false);
        descriptor = oncloseactionlambda1;
        int i = read + 15;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 71;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) FontListFontFamilyTypefaceAdapterKt.$childSerializers[5].MediaSessionCompatResultReceiverWrapper());
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, PopupLayoutHelper.read, FontListFontFamilyTypefaceAdapterresolve1.IconCompatParcelizer};
        int i4 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FontListFontFamilyTypefaceAdapterKt fontListFontFamilyTypefaceAdapterKt = (FontListFontFamilyTypefaceAdapterKt) obj;
        fontListFontFamilyTypefaceAdapterKt.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FontListFontFamilyTypefaceAdapterKt.$childSerializers;
        String str = fontListFontFamilyTypefaceAdapterKt.instructionMessage;
        List list = fontListFontFamilyTypefaceAdapterKt.trackingEvents;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, fontListFontFamilyTypefaceAdapterKt.headline);
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, fontListFontFamilyTypefaceAdapterKt.errorMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, fontListFontFamilyTypefaceAdapterKt.successMessage);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, fontListFontFamilyTypefaceAdapterKt.qrCode);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list);
            int i4 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, PopupLayoutHelper.read, fontListFontFamilyTypefaceAdapterKt.fallbackScreenButton);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, FontListFontFamilyTypefaceAdapterresolve1.IconCompatParcelizer, fontListFontFamilyTypefaceAdapterKt.fallbackScreen);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FontListFontFamilyTypefaceAdapterKt.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 = null;
        boolean z = true;
        getDismissOnBackPress getdismissonbackpress = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        preloadlambda1 preloadlambda1Var = null;
        preloadlambda1 preloadlambda1Var2 = null;
        String strMediaMetadataCompat3 = null;
        List list = null;
        while (z) {
            int i6 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i8) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    continue;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    continue;
                case 2:
                    preloadlambda1Var = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var);
                    i = i5 | 4;
                    break;
                case 3:
                    preloadlambda1Var2 = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var2);
                    i = i5 | 8;
                    break;
                case 4:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i = i5 | 16;
                    break;
                case 5:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i5 | 32;
                    break;
                case 6:
                    getdismissonbackpress = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, PopupLayoutHelper.read, getdismissonbackpress);
                    i = i5 | 64;
                    break;
                case 7:
                    fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 = (FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, FontListFontFamilyTypefaceAdapterresolve1.IconCompatParcelizer, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1);
                    i = i5 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i8);
                    return null;
            }
            i5 = i;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new FontListFontFamilyTypefaceAdapterKt(i5, strMediaMetadataCompat, strMediaMetadataCompat2, preloadlambda1Var, preloadlambda1Var2, strMediaMetadataCompat3, list, getdismissonbackpress, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1);
    }
}
