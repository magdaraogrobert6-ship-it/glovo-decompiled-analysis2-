package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getPlatformFontLoaderui_text implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final getPlatformFontLoaderui_text write;

    static {
        getPlatformFontLoaderui_text getplatformfontloaderui_text = new getPlatformFontLoaderui_text();
        write = getplatformfontloaderui_text;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan.CodeScanScreen", getplatformfontloaderui_text, 11);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("instruction_message", false);
        oncloseactionlambda1.read("codes", false);
        oncloseactionlambda1.read("total_bags", false);
        oncloseactionlambda1.read("already_scanned_message", false);
        oncloseactionlambda1.read("wrong_shelf_message", false);
        oncloseactionlambda1.read("move_closer_message", false);
        oncloseactionlambda1.read("success_message", false);
        oncloseactionlambda1.read("scanned_items_dialog", true);
        oncloseactionlambda1.read("extra_code_close_button", false);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 113;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = createDefaultTypefacelambda0.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, LazyKt__LazyJVMKt.read(FontFamilyResolverImplpreload1.RemoteActionCompatParcelizer), PopupLayoutHelper.read, onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper()};
        int i4 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0083  */
    /* JADX WARN: Code duplicated, block: B:13:0x00ad  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createDefaultTypefacelambda0 createdefaulttypefacelambda0 = (createDefaultTypefacelambda0) obj;
        createdefaulttypefacelambda0.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = createDefaultTypefacelambda0.$childSerializers;
        String str = createdefaulttypefacelambda0.title;
        List list = createdefaulttypefacelambda0.trackingEvents;
        resolvelambda0 resolvelambda0Var = createdefaulttypefacelambda0.scannedItemsDialog;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, createdefaulttypefacelambda0.instructionMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), createdefaulttypefacelambda0.codes);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, createdefaulttypefacelambda0.totalBags);
        r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, createdefaulttypefacelambda0.alreadyScannedMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, createdefaulttypefacelambda0.wrongShelfMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, createdefaulttypefacelambda0.moveCloserMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, r8lambdaphkjrxd645vvjmkonpiiicyf6fy, createdefaulttypefacelambda0.successMessage);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (resolvelambda0Var != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, PopupLayoutHelper.read, createdefaulttypefacelambda0.extraCodeCloseButton);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, FontFamilyResolverImplpreload1.RemoteActionCompatParcelizer, resolvelambda0Var);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, PopupLayoutHelper.read, createdefaulttypefacelambda0.extraCodeCloseButton);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        preloadlambda1 preloadlambda1Var;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = createDefaultTypefacelambda0.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i10 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        int i12 = 1;
        boolean z = true;
        preloadlambda1 preloadlambda1Var2 = null;
        preloadlambda1 preloadlambda1Var3 = null;
        int i13 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        List list = null;
        String strMediaMetadataCompat3 = null;
        preloadlambda1 preloadlambda1Var4 = null;
        preloadlambda1 preloadlambda1Var5 = null;
        resolvelambda0 resolvelambda0Var = null;
        getDismissOnBackPress getdismissonbackpress = null;
        List list2 = null;
        while (!(!z)) {
            int i14 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i14) {
                case -1:
                    z = false;
                    i6 = i6;
                    i12 = i12;
                    break;
                case 0:
                    i = i6;
                    i2 = i12;
                    getdismissonbackpress = getdismissonbackpress;
                    preloadlambda1Var = preloadlambda1Var2;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i13 |= 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 1:
                    i3 = i6;
                    i4 = i12;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i4);
                    i13 |= 2;
                    preloadlambda1Var2 = preloadlambda1Var2;
                    i6 = i3;
                    list2 = list2;
                    i12 = i4;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 2:
                    i = i6;
                    getdismissonbackpress = getdismissonbackpress;
                    preloadlambda1Var = preloadlambda1Var2;
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[i].MediaSessionCompatResultReceiverWrapper(), list);
                    i13 |= 4;
                    i2 = 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 3:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    int i15 = RemoteActionCompatParcelizer + 117;
                    IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i4 = 1;
                    i13 |= 8;
                    i3 = 2;
                    preloadlambda1Var2 = preloadlambda1Var2;
                    i6 = i3;
                    list2 = list2;
                    i12 = i4;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 4:
                    preloadlambda1Var = preloadlambda1Var2;
                    preloadlambda1Var4 = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var4);
                    i5 = i13 | 16;
                    i13 = i5;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 5:
                    preloadlambda1Var = preloadlambda1Var2;
                    preloadlambda1Var5 = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var5);
                    i5 = i13 | 32;
                    i13 = i5;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 6:
                    preloadlambda1Var = preloadlambda1Var2;
                    preloadlambda1Var3 = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var3);
                    i5 = i13 | 64;
                    i13 = i5;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 7:
                    preloadlambda1Var = (preloadlambda1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write, preloadlambda1Var2);
                    i5 = i13 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i13 = i5;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 8:
                    getdismissonbackpress = getdismissonbackpress;
                    resolvelambda0Var = (resolvelambda0) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, FontFamilyResolverImplpreload1.RemoteActionCompatParcelizer, resolvelambda0Var);
                    i13 |= androidx.compose.ui.graphics.Fields.RotationX;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var = preloadlambda1Var2;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 9:
                    getDismissOnBackPress getdismissonbackpress2 = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, PopupLayoutHelper.read, getdismissonbackpress);
                    i13 |= androidx.compose.ui.graphics.Fields.RotationY;
                    list2 = list2;
                    getdismissonbackpress = getdismissonbackpress2;
                    i = 2;
                    i2 = 1;
                    preloadlambda1Var = preloadlambda1Var2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                case 10:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list2);
                    i13 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    getdismissonbackpress = getdismissonbackpress;
                    i2 = 1;
                    i = i6;
                    preloadlambda1Var = preloadlambda1Var2;
                    preloadlambda1Var2 = preloadlambda1Var;
                    i6 = i;
                    i12 = i2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    getdismissonbackpress = getdismissonbackpress;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i14);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new createDefaultTypefacelambda0(i13, strMediaMetadataCompat, strMediaMetadataCompat2, list, strMediaMetadataCompat3, preloadlambda1Var4, preloadlambda1Var5, preloadlambda1Var3, preloadlambda1Var2, resolvelambda0Var, getdismissonbackpress, list2);
    }
}
