package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FileBasedFontFamily implements getInAppMessageManager {
    public static final FileBasedFontFamily IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        FileBasedFontFamily fileBasedFontFamily = new FileBasedFontFamily();
        IconCompatParcelizer = fileBasedFontFamily;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("customer_unavailable", fileBasedFontFamily, 13);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("timer", true);
        oncloseactionlambda1.read("customer", true);
        oncloseactionlambda1.read("dispatcher", true);
        oncloseactionlambda1.read("cancel_order", true);
        oncloseactionlambda1.read("timer_start_action", true);
        oncloseactionlambda1.read("ivr_call", true);
        oncloseactionlambda1.read("countdown", true);
        oncloseactionlambda1.read("take_picture", true);
        oncloseactionlambda1.read("tracking_events", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DeviceFontFamilyNameFont.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer), LazyKt__LazyJVMKt.read(accessgetSerifcp.write), LazyKt__LazyJVMKt.read(getCursive.read), LazyKt__LazyJVMKt.read(Fontvxs03AYdefault.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper()), LazyKt__LazyJVMKt.read(preload.IconCompatParcelizer), LazyKt__LazyJVMKt.read(Font.read), LazyKt__LazyJVMKt.read(filterByClosestWeightui_textdefault.IconCompatParcelizer), onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper()};
        int i4 = read + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb A[DONT_INVERT] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        deviceFontFamilyNameFont.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DeviceFontFamilyNameFont.$childSerializers;
        String str = deviceFontFamilyNameFont.id;
        matchFontRetOiIg matchfontretoiig = deviceFontFamilyNameFont.takePicture;
        FontResourceLoader fontResourceLoader = deviceFontFamilyNameFont.countdownTime;
        resolveDPcqOEQ resolvedpcqoeq = deviceFontFamilyNameFont.ivrCall;
        getWindowTitle getwindowtitle = deviceFontFamilyNameFont.timerStartAction;
        FontCompanion fontCompanion = deviceFontFamilyNameFont.cancel;
        getMonospace getmonospace = deviceFontFamilyNameFont.dispatcher;
        getCanLoadSynchronouslyannotations getcanloadsynchronouslyannotations = deviceFontFamilyNameFont.customer;
        Integer num = deviceFontFamilyNameFont.timer;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, deviceFontFamilyNameFont.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, deviceFontFamilyNameFont.description);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, deviceFontFamilyNameFont.required);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || num != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, afterClosed.IconCompatParcelizer, num);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (getcanloadsynchronouslyannotations != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmonospace != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getCursive.read, getmonospace);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontCompanion != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, Fontvxs03AYdefault.RemoteActionCompatParcelizer, fontCompanion);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getwindowtitle != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getwindowtitle);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || resolvedpcqoeq != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, preload.IconCompatParcelizer, resolvedpcqoeq);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontResourceLoader != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, Font.read, fontResourceLoader);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (matchfontretoiig != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), deviceFontFamilyNameFont.trackingEvents);
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            } else {
                int i4 = read + 109;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, filterByClosestWeightui_textdefault.IconCompatParcelizer, matchfontretoiig);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), deviceFontFamilyNameFont.trackingEvents);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = read + 99;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, accessgetSerifcp.write, getcanloadsynchronouslyannotations);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getCursive.read, getmonospace);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getCursive.read, getmonospace);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, Fontvxs03AYdefault.RemoteActionCompatParcelizer, fontCompanion);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, Fontvxs03AYdefault.RemoteActionCompatParcelizer, fontCompanion);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getwindowtitle);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getwindowtitle);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, preload.IconCompatParcelizer, resolvedpcqoeq);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, preload.IconCompatParcelizer, resolvedpcqoeq);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, Font.read, fontResourceLoader);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, Font.read, fontResourceLoader);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (matchfontretoiig != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), deviceFontFamilyNameFont.trackingEvents);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i8 = read + 109;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, filterByClosestWeightui_textdefault.IconCompatParcelizer, matchfontretoiig);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), deviceFontFamilyNameFont.trackingEvents);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:16:0x009c  */
    /* JADX WARN: Code duplicated, block: B:17:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:18:0x00da  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:20:0x0104  */
    /* JADX WARN: Code duplicated, block: B:26:0x0124  */
    /* JADX WARN: Code duplicated, block: B:27:0x0139  */
    /* JADX WARN: Code duplicated, block: B:28:0x0153  */
    /* JADX WARN: Code duplicated, block: B:30:0x0165  */
    /* JADX WARN: Code duplicated, block: B:34:0x0193  */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DeviceFontFamilyNameFont.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        getWindowTitle getwindowtitle = null;
        FontCompanion fontCompanion = null;
        boolean z = true;
        getMonospace getmonospace = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        boolean zWrite = false;
        Integer num = null;
        getCanLoadSynchronouslyannotations getcanloadsynchronouslyannotations = null;
        resolveDPcqOEQ resolvedpcqoeq = null;
        FontResourceLoader fontResourceLoader = null;
        matchFontRetOiIg matchfontretoiig = null;
        List list = null;
        while (z) {
            int i7 = read + 115;
            boolean z2 = z;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % i4 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i8 = 86 / 0;
                switch (i) {
                    case -1:
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z2 = false;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i6 |= 1;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 1:
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i4);
                        i3 = i6 | 4;
                        i6 = i3;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 3:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i6 | 8;
                        int i9 = read + 97;
                        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        i6 = i3;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 4:
                        num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, afterClosed.IconCompatParcelizer, num);
                        i6 |= 16;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 5:
                        getcanloadsynchronouslyannotations = (getCanLoadSynchronouslyannotations) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, accessgetSerifcp.write, getcanloadsynchronouslyannotations);
                        i6 |= 32;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 6:
                        getmonospace = (getMonospace) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getCursive.read, getmonospace);
                        i6 |= 64;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 7:
                        fontCompanion = (FontCompanion) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, Fontvxs03AYdefault.RemoteActionCompatParcelizer, fontCompanion);
                        i6 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 8:
                        getwindowtitle = (getWindowTitle) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getwindowtitle);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationX;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 9:
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        fontResourceLoader = fontResourceLoader;
                        resolvedpcqoeq = (resolveDPcqOEQ) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, preload.IconCompatParcelizer, resolvedpcqoeq);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationY;
                        int i11 = read + 29;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 10:
                        list = list;
                        matchfontretoiig = matchfontretoiig;
                        fontResourceLoader = (FontResourceLoader) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, Font.read, fontResourceLoader);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationZ;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 11:
                        list = list;
                        matchfontretoiig = (matchFontRetOiIg) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, filterByClosestWeightui_textdefault.IconCompatParcelizer, matchfontretoiig);
                        i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                        list = list;
                        z = z2;
                        break;
                    case 12:
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), list);
                        i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                        z = z2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z2 = false;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i6 |= 1;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 1:
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i4);
                        i3 = i6 | 4;
                        i6 = i3;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 3:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i6 | 8;
                        int i13 = read + 97;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        i6 = i3;
                        resolvedpcqoeq = resolvedpcqoeq;
                        z = z2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        break;
                    case 4:
                        num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, afterClosed.IconCompatParcelizer, num);
                        i6 |= 16;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 5:
                        getcanloadsynchronouslyannotations = (getCanLoadSynchronouslyannotations) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, accessgetSerifcp.write, getcanloadsynchronouslyannotations);
                        i6 |= 32;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 6:
                        getmonospace = (getMonospace) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getCursive.read, getmonospace);
                        i6 |= 64;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 7:
                        fontCompanion = (FontCompanion) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, Fontvxs03AYdefault.RemoteActionCompatParcelizer, fontCompanion);
                        i6 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 8:
                        getwindowtitle = (getWindowTitle) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getwindowtitle);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationX;
                        resolvedpcqoeq = resolvedpcqoeq;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 9:
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        fontResourceLoader = fontResourceLoader;
                        resolvedpcqoeq = (resolveDPcqOEQ) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, preload.IconCompatParcelizer, resolvedpcqoeq);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationY;
                        int i15 = read + 29;
                        write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        fontResourceLoader = fontResourceLoader;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 10:
                        list = list;
                        matchfontretoiig = matchfontretoiig;
                        fontResourceLoader = (FontResourceLoader) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, Font.read, fontResourceLoader);
                        i6 |= androidx.compose.ui.graphics.Fields.RotationZ;
                        matchfontretoiig = matchfontretoiig;
                        list = list;
                        z = z2;
                        break;
                    case 11:
                        list = list;
                        matchfontretoiig = (matchFontRetOiIg) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, filterByClosestWeightui_textdefault.IconCompatParcelizer, matchfontretoiig);
                        i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                        list = list;
                        z = z2;
                        break;
                    case 12:
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), list);
                        i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                        z = z2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            }
            i4 = 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = new DeviceFontFamilyNameFont(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, zWrite, num, getcanloadsynchronouslyannotations, getmonospace, fontCompanion, getwindowtitle, resolvedpcqoeq, fontResourceLoader, matchfontretoiig, list);
        int i17 = write + 79;
        read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return deviceFontFamilyNameFont;
    }
}
