package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath211 implements getInAppMessageManager {
    public static final VectorComposeKtPath211 RemoteActionCompatParcelizer;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, VectorComposeKtPath213.write, beforeinappmessageviewclosed};
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
        VectorComposeKtPath211 vectorComposeKtPath211 = new VectorComposeKtPath211();
        RemoteActionCompatParcelizer = vectorComposeKtPath211;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostSendsNewAccessToken", vectorComposeKtPath211, 3);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("payload", false);
        oncloseactionlambda1.read("messageType", true);
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
        VectorComposeKtPath212 vectorComposeKtPath212 = null;
        String strMediaMetadataCompat2 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 0);
                i |= 1;
            } else if (i2 == 1) {
                vectorComposeKtPath212 = (VectorComposeKtPath212) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 1, VectorComposeKtPath213.write, vectorComposeKtPath212);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 2);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new VectorComposeKtPath22(i, strMediaMetadataCompat, vectorComposeKtPath212, strMediaMetadataCompat2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004a  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        VectorComposeKtPath22 vectorComposeKtPath22 = (VectorComposeKtPath22) obj;
        vectorComposeKtPath22.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        String str = vectorComposeKtPath22.id;
        String str2 = vectorComposeKtPath22.messageType;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, VectorComposeKtPath213.write, vectorComposeKtPath22.payload);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "HOST_SENDS_NEW_ACCESS_TOKEN"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 2, str2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
