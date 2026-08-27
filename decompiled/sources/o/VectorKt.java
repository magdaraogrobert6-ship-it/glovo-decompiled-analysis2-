package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorKt implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final VectorKt read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        VectorKt vectorKt = new VectorKt();
        read = vectorKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlConfiguration", vectorKt, 8);
        oncloseactionlambda1.read("url", true);
        oncloseactionlambda1.read("p2pChatToken", true);
        oncloseactionlambda1.read("verificationToken", true);
        oncloseactionlambda1.read("locale", true);
        oncloseactionlambda1.read("orderID", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, true);
        oncloseactionlambda1.read("timestamp", true);
        oncloseactionlambda1.read("hostPerseusSessionId", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onDismissed.write, beforeinappmessageviewclosed};
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        accessgetChildrenp accessgetchildrenp = (accessgetChildrenp) obj;
        accessgetchildrenp.getClass();
        String str = accessgetchildrenp.hostPerseusSessionId;
        long j = accessgetchildrenp.timestamp;
        String str2 = accessgetchildrenp.country;
        String str3 = accessgetchildrenp.orderID;
        String str4 = accessgetchildrenp.locale;
        String str5 = accessgetchildrenp.verificationToken;
        String str6 = accessgetchildrenp.p2pChatToken;
        String str7 = accessgetchildrenp.url;
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str7);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str7, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str7);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str6);
        } else {
            int iWrite4 = getCieXyz.write();
            int iWrite5 = getCieXyz.write();
            int iWrite6 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str6, ""}, iWrite6)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str6);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, str5);
        } else {
            int iWrite7 = getCieXyz.write();
            int iWrite8 = getCieXyz.write();
            int iWrite9 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{str5, ""}, iWrite9)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, str5);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 3, str4);
        } else {
            int iWrite10 = getCieXyz.write();
            int iWrite11 = getCieXyz.write();
            int iWrite12 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite10, 1803334089, -1803334089, getCieXyz.write(), iWrite11, new Object[]{str4, ""}, iWrite12)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 3, str4);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, str3);
        } else {
            int iWrite13 = getCieXyz.write();
            int iWrite14 = getCieXyz.write();
            int iWrite15 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite13, 1803334089, -1803334089, getCieXyz.write(), iWrite14, new Object[]{str3, ""}, iWrite15)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, str3);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 5, str2);
        } else {
            int iWrite16 = getCieXyz.write();
            int iWrite17 = getCieXyz.write();
            int iWrite18 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite16, 1803334089, -1803334089, getCieXyz.write(), iWrite17, new Object[]{str2, ""}, iWrite18)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 5, str2);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || j != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 6, j);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 7, str);
        } else {
            int iWrite19 = getCieXyz.write();
            int iWrite20 = getCieXyz.write();
            int iWrite21 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite19, 1803334089, -1803334089, getCieXyz.write(), iWrite20, new Object[]{str, ""}, iWrite21)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 7, str);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        String strMediaMetadataCompat7 = null;
        long jSerializer = 0;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                    i |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                    i |= 2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 2);
                    i |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 3);
                    i |= 8;
                    break;
                case 4:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 4);
                    i |= 16;
                    break;
                case 5:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 5);
                    i |= 32;
                    break;
                case 6:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 6);
                    i |= 64;
                    break;
                case 7:
                    strMediaMetadataCompat7 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 7);
                    i |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new accessgetChildrenp(i, jSerializer, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6, strMediaMetadataCompat7);
    }
}
