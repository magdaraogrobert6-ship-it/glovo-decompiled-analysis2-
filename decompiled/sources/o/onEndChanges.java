package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onEndChanges implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final onEndChanges read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        onEndChanges onendchanges = new onEndChanges();
        read = onendchanges;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage.InitStarted.Payload", onendchanges, 1);
        oncloseactionlambda1.read("supportedMessageTypes", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = accessgetRootScaleYp.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], list);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new accessgetRootScaleYp(i, list);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        accessgetRootScaleYp accessgetrootscaleyp = (accessgetRootScaleYp) obj;
        accessgetrootscaleyp.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, accessgetRootScaleYp.$childSerializers[0], accessgetrootscaleyp.supportedMessageTypes);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{accessgetRootScaleYp.$childSerializers[0]};
    }
}
