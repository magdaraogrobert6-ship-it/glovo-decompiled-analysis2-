package com.deliveryhero.fwf_client.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoTestTargetMsg$$serializer implements getInAppMessageManager {
    public static final ProtoTestTargetMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoTestTargetMsg$$serializer() {
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
        ProtoTestTargetMsg$$serializer protoTestTargetMsg$$serializer = new ProtoTestTargetMsg$$serializer();
        INSTANCE = protoTestTargetMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoTestTargetMsg", protoTestTargetMsg$$serializer, 3);
        oncloseactionlambda1.read("variation", true);
        oncloseactionlambda1.read("variationName", true);
        oncloseactionlambda1.read("values", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoTestTargetMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoTestTargetMsg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        ProtoValue protoValue = null;
        ProtoValue protoValue2 = null;
        List list = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                protoValue = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, ProtoValue$$serializer.INSTANCE, protoValue);
                i |= 1;
            } else if (i2 == 1) {
                protoValue2 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, ProtoValue$$serializer.INSTANCE, protoValue2);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                list = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, setgraphicmodalmaxwidthdpArr[2], list);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoTestTargetMsg(i, protoValue, protoValue2, list, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoTestTargetMsg protoTestTargetMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoTestTargetMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoTestTargetMsg.write$Self$fwf_client_release(protoTestTargetMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoTestTargetMsg.$childSerializers;
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(protoValue$$serializer), LazyKt__LazyJVMKt.read(protoValue$$serializer), LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[2])};
    }
}
