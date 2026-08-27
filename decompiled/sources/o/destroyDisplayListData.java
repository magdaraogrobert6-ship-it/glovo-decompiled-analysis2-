package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class destroyDisplayListData implements getInAppMessageManager {
    public static final destroyDisplayListData RemoteActionCompatParcelizer;
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
        destroyDisplayListData destroydisplaylistdata = new destroyDisplayListData();
        RemoteActionCompatParcelizer = destroydisplaylistdata;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.contract.model.Translations.ENABLED", destroydisplaylistdata, 5);
        oncloseactionlambda1.read("supportedTranslationsList", false);
        oncloseactionlambda1.read("shouldShowOriginalWithTranslated", false);
        oncloseactionlambda1.read("supportedTranslations", false);
        oncloseactionlambda1.read("preferredLanguage", false);
        oncloseactionlambda1.read("showOriginalWithTranslated", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = RenderNodeVerificationHelper28.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        boolean zWrite = false;
        boolean zWrite2 = false;
        List list = null;
        List list2 = null;
        String strMediaMetadataCompat = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], list);
                i |= 1;
            } else if (i2 == 1) {
                zWrite = createinappmessageviewlambda1Serializer.write(oncloseactionlambda1, 1);
                i |= 2;
            } else if (i2 == 2) {
                list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], list2);
                i |= 4;
            } else if (i2 == 3) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                zWrite2 = createinappmessageviewlambda1Serializer.write(oncloseactionlambda1, 4);
                i |= 16;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new RenderNodeVerificationHelper28(i, list, zWrite, list2, strMediaMetadataCompat, zWrite2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = (RenderNodeVerificationHelper28) obj;
        renderNodeVerificationHelper28.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, getAmbientShadowColor.$childSerializers[0], renderNodeVerificationHelper28.supportedTranslationsList);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 1, renderNodeVerificationHelper28.shouldShowOriginalWithTranslated);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = RenderNodeVerificationHelper28.$childSerializers[2];
        List list = renderNodeVerificationHelper28.supportedTranslations;
        boolean z = renderNodeVerificationHelper28.showOriginalWithTranslated;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdp, list);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 3, renderNodeVerificationHelper28.preferredLanguage);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 4, z);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = RenderNodeVerificationHelper28.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpArr[0];
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpArr[2];
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdp, getwasclosemessagecalled, setgraphicmodalmaxwidthdp2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getwasclosemessagecalled};
    }
}
