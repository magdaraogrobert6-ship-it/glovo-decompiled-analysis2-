package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderNodeVerificationHelper implements getInAppMessageManager {
    public static final RenderNodeVerificationHelper RemoteActionCompatParcelizer;
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
        RenderNodeVerificationHelper renderNodeVerificationHelper = new RenderNodeVerificationHelper();
        RemoteActionCompatParcelizer = renderNodeVerificationHelper;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.contract.model.DeliveryInfo", renderNodeVerificationHelper, 8);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("code", false);
        oncloseactionlambda1.read("amount", false);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("comments", false);
        oncloseactionlambda1.read("customer", false);
        oncloseactionlambda1.read("phoneNumber", false);
        oncloseactionlambda1.read("deliveryNotes", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{onDismissed.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        OutlineVerificationHelper outlineVerificationHelper = (OutlineVerificationHelper) obj;
        outlineVerificationHelper.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        long j = outlineVerificationHelper.id;
        String str = outlineVerificationHelper.deliveryNotes;
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(oncloseactionlambda1, 0, j);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 1, beforeinappmessageviewclosed, outlineVerificationHelper.code);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 2, beforeinappmessageviewclosed, outlineVerificationHelper.amount);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 3, beforeinappmessageviewclosed, outlineVerificationHelper.address);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 4, beforeinappmessageviewclosed, outlineVerificationHelper.comments);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 5, beforeinappmessageviewclosed, outlineVerificationHelper.customer);
        defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 6, beforeinappmessageviewclosed, outlineVerificationHelper.phoneNumber);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 7, beforeinappmessageviewclosed, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        long jSerializer = 0;
        boolean z = true;
        String str = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i3) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i = i2 | 2;
                    break;
                case 2:
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i = i2 | 4;
                    break;
                case 3:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i = i2 | 8;
                    break;
                case 4:
                    str6 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
                    i = i2 | 16;
                    break;
                case 5:
                    str7 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
                    i = i2 | 32;
                    break;
                case 6:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i2 | 64;
                    break;
                case 7:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i = i2 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                    return null;
            }
            i2 = i;
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new OutlineVerificationHelper(i2, jSerializer, str3, str4, str5, str6, str7, str, str2);
    }
}
