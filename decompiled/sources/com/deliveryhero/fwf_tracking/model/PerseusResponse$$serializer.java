package com.deliveryhero.fwf_tracking.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class PerseusResponse$$serializer implements getInAppMessageManager {
    public static final PerseusResponse$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private PerseusResponse$$serializer() {
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
        PerseusResponse$$serializer perseusResponse$$serializer = new PerseusResponse$$serializer();
        INSTANCE = perseusResponse$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_tracking.model.PerseusResponse", perseusResponse$$serializer, 4);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("timestamp", false);
        oncloseactionlambda1.read("message", false);
        oncloseactionlambda1.read("errors", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public PerseusResponse deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = PerseusResponse.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                str = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i |= 1;
            } else if (i2 == 1) {
                str2 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                i |= 2;
            } else if (i2 == 2) {
                str3 = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                i |= 4;
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                list = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 3, setgraphicmodalmaxwidthdpArr[3], list);
                i |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new PerseusResponse(i, str, str2, str3, list, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, PerseusResponse perseusResponse) {
        defaultInAppMessageViewWrapperFactory.getClass();
        perseusResponse.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        PerseusResponse.write$Self$fwf_client_release(perseusResponse, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = PerseusResponse.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[3])};
    }
}
