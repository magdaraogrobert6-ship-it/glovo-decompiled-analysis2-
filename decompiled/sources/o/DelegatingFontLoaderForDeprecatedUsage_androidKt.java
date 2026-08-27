package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DelegatingFontLoaderForDeprecatedUsage_androidKt implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    public static final DelegatingFontLoaderForDeprecatedUsage_androidKt write;

    static {
        DelegatingFontLoaderForDeprecatedUsage_androidKt delegatingFontLoaderForDeprecatedUsage_androidKt = new DelegatingFontLoaderForDeprecatedUsage_androidKt();
        write = delegatingFontLoaderForDeprecatedUsage_androidKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("cash_payment", delegatingFontLoaderForDeprecatedUsage_androidKt, 17);
        oncloseactionlambda1.read("id", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("note", true);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("required_text", true);
        oncloseactionlambda1.read("editable", false);
        oncloseactionlambda1.read("add_action_title", false);
        oncloseactionlambda1.read("edit_action_title", false);
        oncloseactionlambda1.read("cancel_action_title", false);
        oncloseactionlambda1.read("done_action_title", false);
        oncloseactionlambda1.read("currency", true);
        oncloseactionlambda1.read("default_amount", true);
        oncloseactionlambda1.read("validation", true);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("reason", true);
        oncloseactionlambda1.read("tracking_events", true);
        descriptor = oncloseactionlambda1;
        int i = read + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = serializer;
        int i3 = i2 + 25;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 17;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DelegatingFontLoaderForBridgeUsage.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getwasclosemessagecalled, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getwasclosemessagecalled, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(accessgetBlockingcp.write), onviewdetachedfromwindowlambda1Arr[16].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x004a  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = (DelegatingFontLoaderForBridgeUsage) obj;
        delegatingFontLoaderForBridgeUsage.getClass();
        String str = delegatingFontLoaderForBridgeUsage.id;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DelegatingFontLoaderForBridgeUsage.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "cash_payment"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
            }
        }
        String str2 = delegatingFontLoaderForBridgeUsage.title;
        List list = delegatingFontLoaderForBridgeUsage.trackingEvents;
        FontLoadingStrategy fontLoadingStrategy = delegatingFontLoaderForBridgeUsage.reason;
        String str3 = delegatingFontLoaderForBridgeUsage.validation;
        Double d = delegatingFontLoaderForBridgeUsage.defaultAmount;
        String str4 = delegatingFontLoaderForBridgeUsage.currency;
        String str5 = delegatingFontLoaderForBridgeUsage.requiredText;
        String str6 = delegatingFontLoaderForBridgeUsage.note;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, delegatingFontLoaderForBridgeUsage.description);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str6 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, delegatingFontLoaderForBridgeUsage.required);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str5 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, delegatingFontLoaderForBridgeUsage.editable);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, delegatingFontLoaderForBridgeUsage.addActionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, delegatingFontLoaderForBridgeUsage.editActionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, delegatingFontLoaderForBridgeUsage.cancelActionTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, delegatingFontLoaderForBridgeUsage.doneActionTitle);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
            int i4 = serializer + 87;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || d != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, delegatingFontLoaderForBridgeUsage.key);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontLoadingStrategy != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, accessgetBlockingcp.write, fontLoadingStrategy);
            int i6 = serializer + 117;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[16].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[16].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = DelegatingFontLoaderForBridgeUsage.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        FontLoadingStrategy fontLoadingStrategy = null;
        String str = null;
        Double d = null;
        boolean z = true;
        String str2 = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String str3 = null;
        boolean zWrite = false;
        String str4 = null;
        boolean zWrite2 = false;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        String strMediaMetadataCompat7 = null;
        String strMediaMetadataCompat8 = null;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            boolean z2 = z;
            switch (i7) {
                case -1:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z2 = false;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 0:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 1:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i6 |= 2;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 2:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i6 |= 4;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 3:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i6 |= 8;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 4:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i = i6 | 16;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 5:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i6 |= 32;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 6:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i = i6 | 64;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 7:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i = i6 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 8:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationX;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 9:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationY;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 10:
                    strMediaMetadataCompat7 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationZ;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 11:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 12:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    d = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
                    i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 13:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i6 |= 8192;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 14:
                    strMediaMetadataCompat8 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14);
                    i = i6 | androidx.compose.ui.graphics.Fields.Clip;
                    int i8 = serializer + 15;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i6 = i;
                    strMediaMetadataCompat = strMediaMetadataCompat;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 15:
                    fontLoadingStrategy = (FontLoadingStrategy) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, accessgetBlockingcp.write, fontLoadingStrategy);
                    i2 = androidx.compose.ui.graphics.Fields.CompositingStrategy;
                    i6 |= i2;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                case 16:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[16].MediaSessionCompatResultReceiverWrapper(), list);
                    i2 = 65536;
                    i6 |= i2;
                    z = z2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new DelegatingFontLoaderForBridgeUsage(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, str3, zWrite, str4, zWrite2, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6, strMediaMetadataCompat7, str2, d, str, strMediaMetadataCompat8, fontLoadingStrategy, list);
    }
}
