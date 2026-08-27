package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKt implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final VectorComposeKt write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        VectorComposeKt vectorComposeKt = new VectorComposeKt();
        write = vectorComposeKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostAppProvidesChatConfig.Payload", vectorComposeKt, 4);
        oncloseactionlambda1.read("delivery", false);
        oncloseactionlambda1.read("phoneCallingType", false);
        oncloseactionlambda1.read("quickReplies", false);
        oncloseactionlambda1.read("translation", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = VectorComponentdrawVectorBlock1.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        VectorComposable vectorComposable = null;
        String strMediaMetadataCompat = null;
        List list = null;
        Path9cdaXJ4 path9cdaXJ4 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                vectorComposable = (VectorComposable) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, VectorComponentinvalidateCallback1.RemoteActionCompatParcelizer, vectorComposable);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            } else if (i2 == 2) {
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], list);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                path9cdaXJ4 = (Path9cdaXJ4) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 3, Group.IconCompatParcelizer, path9cdaXJ4);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new VectorComponentdrawVectorBlock1(i, vectorComposable, strMediaMetadataCompat, list, path9cdaXJ4);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1 = (VectorComponentdrawVectorBlock1) obj;
        vectorComponentdrawVectorBlock1.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = VectorComponentdrawVectorBlock1.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, VectorComponentinvalidateCallback1.RemoteActionCompatParcelizer, vectorComponentdrawVectorBlock1.delivery);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, vectorComponentdrawVectorBlock1.phoneCallingType);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], vectorComponentdrawVectorBlock1.quickReplies);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 3, Group.IconCompatParcelizer, vectorComponentdrawVectorBlock1.translation);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{VectorComponentinvalidateCallback1.RemoteActionCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, VectorComponentdrawVectorBlock1.$childSerializers[2], Group.IconCompatParcelizer};
    }
}
