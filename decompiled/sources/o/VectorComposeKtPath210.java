package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath210 implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final VectorComposeKtPath210 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, VectorComposeKtPath214.serializer};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        VectorComposeKtPath210 vectorComposeKtPath210 = new VectorComposeKtPath210();
        write = vectorComposeKtPath210;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostNotifiesAboutVisibilityChange", vectorComposeKtPath210, 3);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("messageType", true);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        invokeCSYIeUk invokecsyieuk = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                invokecsyieuk = (invokeCSYIeUk) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, VectorComposeKtPath214.serializer, invokecsyieuk);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new VectorComposeKtPath21(i, strMediaMetadataCompat, strMediaMetadataCompat2, invokecsyieuk);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        VectorComposeKtPath21 vectorComposeKtPath21 = (VectorComposeKtPath21) obj;
        vectorComposeKtPath21.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        String str = vectorComposeKtPath21.id;
        String str2 = vectorComposeKtPath21.messageType;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, VectorComposeKtPath214.serializer, vectorComposeKtPath21.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
