package com.deliveryhero.fwf_http.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Set;
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

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class CustomerProfileRequestBody$$serializer implements getInAppMessageManager {
    public static final CustomerProfileRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private CustomerProfileRequestBody$$serializer() {
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
        CustomerProfileRequestBody$$serializer customerProfileRequestBody$$serializer = new CustomerProfileRequestBody$$serializer();
        INSTANCE = customerProfileRequestBody$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_http.model.CustomerProfileRequestBody", customerProfileRequestBody$$serializer, 1);
        oncloseactionlambda1.read("profileAttributes", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public CustomerProfileRequestBody deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = CustomerProfileRequestBody.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                set = (Set) createinappmessageviewlambda1Serializer.IconCompatParcelizer(descriptor2, 0, setgraphicmodalmaxwidthdpArr[0], set);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new CustomerProfileRequestBody(i, set, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, CustomerProfileRequestBody customerProfileRequestBody) {
        defaultInAppMessageViewWrapperFactory.getClass();
        customerProfileRequestBody.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2, 0, CustomerProfileRequestBody.$childSerializers[0], customerProfileRequestBody.profileAttributes);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{CustomerProfileRequestBody.$childSerializers[0]};
    }
}
