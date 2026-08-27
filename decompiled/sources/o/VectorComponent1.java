package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComponent1 implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final VectorComponent1 read;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{VectorComposeKt.write, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
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
        VectorComponent1 vectorComponent1 = new VectorComponent1();
        read = vectorComponent1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostAppProvidesChatConfig", vectorComponent1, 2);
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
        VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1 = null;
        String strMediaMetadataCompat = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                vectorComponentdrawVectorBlock1 = (VectorComponentdrawVectorBlock1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, VectorComposeKt.write, vectorComponentdrawVectorBlock1);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setIntrinsicColorFilterui(i, vectorComponentdrawVectorBlock1, strMediaMetadataCompat);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0044  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setIntrinsicColorFilterui setintrinsiccolorfilterui = (setIntrinsicColorFilterui) obj;
        setintrinsiccolorfilterui.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        VectorComposeKt vectorComposeKt = VectorComposeKt.write;
        VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1 = setintrinsiccolorfilterui.payload;
        String str = setintrinsiccolorfilterui.messageType;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, vectorComposeKt, vectorComponentdrawVectorBlock1);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "HOST_APP_PROVIDES_CHAT_CONFIG"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
