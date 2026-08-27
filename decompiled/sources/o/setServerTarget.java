package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setServerTarget implements getInAppMessageManager {
    public static final setServerTarget read;
    public static final /* synthetic */ onCloseActionlambda1 write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setServerTarget setservertarget = new setServerTarget();
        read = setservertarget;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.PolygonLocation", setservertarget, 3);
        oncloseactionlambda1.read("outer", false);
        oncloseactionlambda1.read("holes", false);
        oncloseactionlambda1.read("box", false);
        write = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = write;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setSdkFlavor.d;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        Object objIconCompatParcelizer2 = null;
        Object objIconCompatParcelizer3 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushHtmlRenderingEnabled.RemoteActionCompatParcelizer, objIconCompatParcelizer);
                i |= 1;
            } else if (i2 == 1) {
                objIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 1, setgraphicmodalmaxwidthdpArr[1], objIconCompatParcelizer2);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.write, objIconCompatParcelizer3);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setSdkFlavor(i, (setSdkAuthEnabledandroid_sdk_base_release) objIconCompatParcelizer, (List) objIconCompatParcelizer2, (setIsAutomaticLocationCollectionEnabled) objIconCompatParcelizer3);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setSdkFlavor setsdkflavor = (setSdkFlavor) obj;
        setsdkflavor.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = write;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setSdkFlavor.d;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setPushHtmlRenderingEnabled.RemoteActionCompatParcelizer, setsdkflavor.a);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, setgraphicmodalmaxwidthdpArr[1], setsdkflavor.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.write, setsdkflavor.c);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{setPushHtmlRenderingEnabled.RemoteActionCompatParcelizer, setSdkFlavor.d[1], setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.write};
    }
}
