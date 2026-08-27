package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpHeaders;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidView_androidKtNoOpUpdate1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final AndroidView_androidKtNoOpUpdate1 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        AndroidView_androidKtNoOpUpdate1 androidView_androidKtNoOpUpdate1 = new AndroidView_androidKtNoOpUpdate1();
        RemoteActionCompatParcelizer = androidView_androidKtNoOpUpdate1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1(HttpHeaders.ACCEPT, androidView_androidKtNoOpUpdate1, 8);
        oncloseactionlambda1.read("type", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("subtitle", true);
        oncloseactionlambda1.read("components", false);
        oncloseactionlambda1.read("headerComponents", true);
        oncloseactionlambda1.read("scrollableComponents", true);
        oncloseactionlambda1.read("footerComponents", true);
        oncloseactionlambda1.read("orderItemsComponents", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtcreateAndroidViewNodeFactory11.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 71;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtcreateAndroidViewNodeFactory11.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        boolean z = true;
        List list2 = null;
        int i4 = 0;
        String str = null;
        String strMediaMetadataCompat = null;
        String str2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    int i6 = read + 73;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = false;
                    continue;
                case 0:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 |= 1;
                    continue;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    break;
                case 2:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i4 |= 4;
                    break;
                case 3:
                    list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list3);
                    i4 |= 8;
                    break;
                case 4:
                    list4 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list4);
                    i4 |= 16;
                    break;
                case 5:
                    list5 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list5);
                    i4 |= 32;
                    int i8 = read + 31;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    break;
                case 6:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list2);
                    i4 |= 64;
                    break;
                case 7:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = new AndroidView_androidKtcreateAndroidViewNodeFactory11(i4, str, strMediaMetadataCompat, str2, list3, list4, list5, list2, list);
        int i10 = read + 75;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return androidView_androidKtcreateAndroidViewNodeFactory11;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0045  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List list;
        int i = 2 % 2;
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj;
        androidView_androidKtcreateAndroidViewNodeFactory11.getClass();
        String str = androidView_androidKtcreateAndroidViewNodeFactory11.type;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidView_androidKtcreateAndroidViewNodeFactory11.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, HttpHeaders.ACCEPT}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
            }
        }
        String str2 = androidView_androidKtcreateAndroidViewNodeFactory11.title;
        List list2 = androidView_androidKtcreateAndroidViewNodeFactory11.orderItemsComponents;
        List list3 = androidView_androidKtcreateAndroidViewNodeFactory11.footerComponents;
        List list4 = androidView_androidKtcreateAndroidViewNodeFactory11.headerComponents;
        String str3 = androidView_androidKtcreateAndroidViewNodeFactory11.subtitle;
        List list5 = androidView_androidKtcreateAndroidViewNodeFactory11.scrollableComponents;
        List list6 = androidView_androidKtcreateAndroidViewNodeFactory11.components;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list6);
        boolean z = defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        List list7 = instance_delegatelambda0.write;
        List listRemoteActionCompatParcelizer = null;
        if (z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list4);
        } else {
            Iterator it = list6.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                int i2 = read + 101;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                next4 = it.next();
            } while (!(next4 instanceof getResetBlock));
            getResetBlock getresetblock = (getResetBlock) next4;
            if (getresetblock != null) {
                list = getresetblock.read();
                int i4 = serializer + 107;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 5;
                }
            } else {
                list = null;
            }
            if (list == null) {
                list = list7;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list4, list}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list4);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list5);
        } else {
            Iterator it2 = list6.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!(next3 instanceof PopupK5zGePQ));
            PopupK5zGePQ popupK5zGePQ = (PopupK5zGePQ) next3;
            List listRemoteActionCompatParcelizer2 = popupK5zGePQ != null ? popupK5zGePQ.RemoteActionCompatParcelizer() : null;
            if (listRemoteActionCompatParcelizer2 == null) {
                int i6 = serializer + 95;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                listRemoteActionCompatParcelizer2 = list7;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list5, listRemoteActionCompatParcelizer2}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list5);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list3);
        } else {
            Iterator it3 = list6.iterator();
            do {
                if (!it3.hasNext()) {
                    int i8 = serializer + 75;
                    read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    next2 = null;
                    break;
                }
                int i10 = serializer + 51;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                next2 = it3.next();
            } while (!(next2 instanceof accessgetTypedViewp));
            accessgetTypedViewp accessgettypedviewp = (accessgetTypedViewp) next2;
            List listRemoteActionCompatParcelizer3 = accessgettypedviewp != null ? accessgettypedviewp.RemoteActionCompatParcelizer() : null;
            if (listRemoteActionCompatParcelizer3 == null) {
                listRemoteActionCompatParcelizer3 = list7;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list3, listRemoteActionCompatParcelizer3}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list3);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list2);
        } else {
            Iterator it4 = list5.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!(next instanceof AndroidDialog_androidKtDialogdialog111));
            AndroidDialog_androidKtDialogdialog111 androidDialog_androidKtDialogdialog111 = (AndroidDialog_androidKtDialogdialog111) next;
            if (androidDialog_androidKtDialogdialog111 != null) {
                int i12 = serializer + 119;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    androidDialog_androidKtDialogdialog111.RemoteActionCompatParcelizer();
                    listRemoteActionCompatParcelizer.hashCode();
                    throw null;
                }
                listRemoteActionCompatParcelizer = androidDialog_androidKtDialogdialog111.RemoteActionCompatParcelizer();
            }
            if (listRemoteActionCompatParcelizer != null) {
                list7 = listRemoteActionCompatParcelizer;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list2, list7}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
