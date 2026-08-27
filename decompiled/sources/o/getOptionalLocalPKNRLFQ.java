package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getOptionalLocalPKNRLFQ implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final getOptionalLocalPKNRLFQ serializer;
    private static int write = 1;

    static {
        getOptionalLocalPKNRLFQ getoptionallocalpknrlfq = new getOptionalLocalPKNRLFQ();
        serializer = getoptionallocalpknrlfq;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("signature", getoptionallocalpknrlfq, 9);
        oncloseactionlambda1.read("id", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("required_text", true);
        oncloseactionlambda1.read("upload_path", false);
        oncloseactionlambda1.read("action_title", false);
        oncloseactionlambda1.read("action_title_delete", false);
        oncloseactionlambda1.read("compression", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = firstImmediatelyAvailable.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper()};
        int i4 = write + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0074  */
    /* JADX WARN: Code duplicated, block: B:12:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e7  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        List list;
        String str;
        int i = 2 % 2;
        int i2 = read + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        firstImmediatelyAvailable firstimmediatelyavailable = (firstImmediatelyAvailable) obj;
        firstimmediatelyavailable.getClass();
        String str2 = firstimmediatelyavailable.id;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = firstImmediatelyAvailable.$childSerializers;
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "signature"}, getCieXyz.write())).booleanValue()) {
            }
            String str3 = firstimmediatelyavailable.title;
            list = firstimmediatelyavailable.compression;
            str = firstimmediatelyavailable.requiredText;
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str3);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, firstimmediatelyavailable.description);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, firstimmediatelyavailable.required);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (str != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, firstimmediatelyavailable.uploadPath);
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, firstimmediatelyavailable.actionTitle);
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, firstimmediatelyavailable.actionTitleDelete);
                if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{DeviceFontFamilyName.read}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())}, getCieXyz.write())).booleanValue()) {
                        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                    }
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            int i4 = read + 35;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, firstimmediatelyavailable.uploadPath);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, firstimmediatelyavailable.actionTitle);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, firstimmediatelyavailable.actionTitleDelete);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{DeviceFontFamilyName.read}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = read + 107;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str2);
        String str4 = firstimmediatelyavailable.title;
        list = firstimmediatelyavailable.compression;
        str = firstimmediatelyavailable.requiredText;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str4);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, firstimmediatelyavailable.description);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, firstimmediatelyavailable.required);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, firstimmediatelyavailable.uploadPath);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, firstimmediatelyavailable.actionTitle);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, firstimmediatelyavailable.actionTitleDelete);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{DeviceFontFamilyName.read}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i8 = read + 35;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, firstimmediatelyavailable.uploadPath);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, firstimmediatelyavailable.actionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, firstimmediatelyavailable.actionTitleDelete);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{DeviceFontFamilyName.read}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = firstImmediatelyAvailable.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        List list = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        boolean zWrite = false;
        String str = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    int i7 = i5 | 4;
                    int i8 = write + 103;
                    read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        int i9 = 3 / 5;
                    }
                    i5 = i7;
                    break;
                case 3:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i = i5 | 8;
                    i5 = i;
                    break;
                case 4:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i5 | 16;
                    i5 = i;
                    break;
                case 5:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i = i5 | 32;
                    i5 = i;
                    break;
                case 6:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i = i5 | 64;
                    i5 = i;
                    break;
                case 7:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i = i5 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i5 = i;
                    break;
                case 8:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i5 | androidx.compose.ui.graphics.Fields.RotationX;
                    i5 = i;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new firstImmediatelyAvailable(i5, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, zWrite, str, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6, list);
    }
}
