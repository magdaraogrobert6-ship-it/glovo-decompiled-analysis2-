package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isPopupLayoutdefault implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    private static int serializer;
    public static final isPopupLayoutdefault write;

    static {
        isPopupLayoutdefault ispopuplayoutdefault = new isPopupLayoutdefault();
        write = ispopuplayoutdefault;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("auto_accept", ispopuplayoutdefault, 4);
        oncloseactionlambda1.read("type", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("subtitle", true);
        oncloseactionlambda1.read("components", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 51;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 67;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 57;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidPopup_androidKtLocalIsInPopupLayout1.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004c  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout1 = (AndroidPopup_androidKtLocalIsInPopupLayout1) obj;
            androidPopup_androidKtLocalIsInPopupLayout1.getClass();
            String str = androidPopup_androidKtLocalIsInPopupLayout1.type;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidPopup_androidKtLocalIsInPopupLayout1.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout2 = (AndroidPopup_androidKtLocalIsInPopupLayout1) obj;
        androidPopup_androidKtLocalIsInPopupLayout2.getClass();
        String str2 = androidPopup_androidKtLocalIsInPopupLayout2.type;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = AndroidPopup_androidKtLocalIsInPopupLayout1.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "auto_accept"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            }
        }
        String str3 = androidPopup_androidKtLocalIsInPopupLayout2.title;
        String str4 = androidPopup_androidKtLocalIsInPopupLayout2.subtitle;
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
        if (!defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            if (str4 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[3].MediaSessionCompatResultReceiverWrapper(), androidPopup_androidKtLocalIsInPopupLayout2.components);
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        } else {
            int i3 = RemoteActionCompatParcelizer + 81;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[3].MediaSessionCompatResultReceiverWrapper(), androidPopup_androidKtLocalIsInPopupLayout2.components);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = AndroidPopup_androidKtLocalIsInPopupLayout1.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        String strMediaMetadataCompat = null;
        String str2 = null;
        List list = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int i3 = RemoteActionCompatParcelizer + 93;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = read;
                int i7 = i6 + 75;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 |= 1;
                } else if (i5 != 1) {
                    int i8 = i6 + 103;
                    int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i9;
                    int i10 = i8 % 2;
                    if (i5 != 2) {
                        int i11 = i9 + 33;
                        int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        read = i12;
                        int i13 = i11 % 2;
                        if (i5 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        int i14 = i12 + 99;
                        RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 8;
                    } else {
                        str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                        i2 |= 4;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidPopup_androidKtLocalIsInPopupLayout1(i2, str, strMediaMetadataCompat, str2, list);
    }
}
