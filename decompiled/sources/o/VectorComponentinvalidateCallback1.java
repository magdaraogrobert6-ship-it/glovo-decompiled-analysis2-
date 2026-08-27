package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComponentinvalidateCallback1 implements getInAppMessageManager {
    public static final VectorComponentinvalidateCallback1 RemoteActionCompatParcelizer;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        VectorComponentinvalidateCallback1 vectorComponentinvalidateCallback1 = new VectorComponentinvalidateCallback1();
        RemoteActionCompatParcelizer = vectorComponentinvalidateCallback1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.HostMessage.HostAppProvidesChatConfig.Payload.Delivery", vectorComponentinvalidateCallback1, 7);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("customerNote", false);
        oncloseactionlambda1.read("entityNote", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("orderId", false);
        oncloseactionlambda1.read("phoneNumber", false);
        oncloseactionlambda1.read("totalAmountInCurrency", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strMediaMetadataCompat = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i |= 8;
                    break;
                case 4:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
                    i |= 64;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new VectorComposable(i, str, str2, str3, str4, strMediaMetadataCompat, str5, str6);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        VectorComposable vectorComposable = (VectorComposable) obj;
        vectorComposable.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 0, beforeinappmessageviewclosed, vectorComposable.address);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 1, beforeinappmessageviewclosed, vectorComposable.customerNote);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 2, beforeinappmessageviewclosed, vectorComposable.entityNote);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 3, beforeinappmessageviewclosed, vectorComposable.name);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, vectorComposable.orderId);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 5, beforeinappmessageviewclosed, vectorComposable.phoneNumber);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 6, beforeinappmessageviewclosed, vectorComposable.totalAmountInCurrency);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
