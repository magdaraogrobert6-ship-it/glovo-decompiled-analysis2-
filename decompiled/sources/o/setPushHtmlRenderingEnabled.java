package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setPushHtmlRenderingEnabled implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 IconCompatParcelizer;
    public static final setPushHtmlRenderingEnabled RemoteActionCompatParcelizer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        setPushHtmlRenderingEnabled setpushhtmlrenderingenabled = new setPushHtmlRenderingEnabled();
        RemoteActionCompatParcelizer = setpushhtmlrenderingenabled;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.dsko.modules.PolyLine", setpushhtmlrenderingenabled, 1);
        oncloseactionlambda1.read("lineSegments", false);
        IconCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = setSdkAuthEnabledandroid_sdk_base_release.b;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], objIconCompatParcelizer);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new setSdkAuthEnabledandroid_sdk_base_release(i, (List) objIconCompatParcelizer);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release = (setSdkAuthEnabledandroid_sdk_base_release) obj;
        setsdkauthenabledandroid_sdk_base_release.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, setSdkAuthEnabledandroid_sdk_base_release.b[0], setsdkauthenabledandroid_sdk_base_release.a);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{setSdkAuthEnabledandroid_sdk_base_release.b[0]};
    }
}
