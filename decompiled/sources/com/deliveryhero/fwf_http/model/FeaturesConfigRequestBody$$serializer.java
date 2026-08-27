package com.deliveryhero.fwf_http.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.List;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class FeaturesConfigRequestBody$$serializer implements getInAppMessageManager {
    public static final FeaturesConfigRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private FeaturesConfigRequestBody$$serializer() {
    }

    @Override // o.setGraphicModalMaxWidthDp
    public r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        FeaturesConfigRequestBody$$serializer featuresConfigRequestBody$$serializer = new FeaturesConfigRequestBody$$serializer();
        INSTANCE = featuresConfigRequestBody$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_http.model.FeaturesConfigRequestBody", featuresConfigRequestBody$$serializer, 2);
        oncloseactionlambda1.read(FWFHelper.ENDPOINT_FEATURES, false);
        oncloseactionlambda1.read("holdouts", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public FeaturesConfigRequestBody deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = FeaturesConfigRequestBody.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 0, setgraphicmodalmaxwidthdpArr[0], list);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 1, setgraphicmodalmaxwidthdpArr[1], list2);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new FeaturesConfigRequestBody(i, list, list2, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, FeaturesConfigRequestBody featuresConfigRequestBody) {
        defaultInAppMessageViewWrapperFactory.getClass();
        featuresConfigRequestBody.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        FeaturesConfigRequestBody.write$Self$fwf_client_release(featuresConfigRequestBody, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = FeaturesConfigRequestBody.$childSerializers;
        return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdpArr[0], setgraphicmodalmaxwidthdpArr[1]};
    }
}
