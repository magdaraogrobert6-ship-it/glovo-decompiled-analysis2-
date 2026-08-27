package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class isRemoteUrilambda0 implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;
    public static final isRemoteUrilambda0 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed, afterclosed, afterclosed, beforeinappmessageviewclosed};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        isRemoteUrilambda0 isremoteurilambda0 = new isRemoteUrilambda0();
        write = isremoteurilambda0;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.tflitemodel.ModelInfo", isremoteurilambda0, 5);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("flavour", false);
        oncloseactionlambda1.read("majorVersion", false);
        oncloseactionlambda1.read("minorVersion", false);
        oncloseactionlambda1.read("extension", true);
        RemoteActionCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
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
            } else if (i2 == 2) {
                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2);
                i |= 4;
            } else if (i2 == 3) {
                iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 4);
                i |= 16;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new isRemoteUri(i, strMediaMetadataCompat, strMediaMetadataCompat2, iIconCompatParcelizer, iIconCompatParcelizer2, strMediaMetadataCompat3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        isRemoteUri isremoteuri = (isRemoteUri) obj;
        isremoteuri.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = RemoteActionCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        String str = isremoteuri.a;
        String str2 = isremoteuri.e;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, isremoteuri.b);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, isremoteuri.c, oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, isremoteuri.d, oncloseactionlambda1);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "tflite"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, str2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
