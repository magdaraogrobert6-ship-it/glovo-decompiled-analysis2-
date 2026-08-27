package com.deliveryhero.fwf_client.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoRuleMsg$$serializer implements getInAppMessageManager {
    public static final ProtoRuleMsg$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoRuleMsg$$serializer() {
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
        ProtoRuleMsg$$serializer protoRuleMsg$$serializer = new ProtoRuleMsg$$serializer();
        INSTANCE = protoRuleMsg$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoRuleMsg", protoRuleMsg$$serializer, 6);
        oncloseactionlambda1.read("clauses", true);
        oncloseactionlambda1.read("default", true);
        oncloseactionlambda1.read("variation", true);
        oncloseactionlambda1.read("variationName", true);
        oncloseactionlambda1.read("rollouts", true);
        oncloseactionlambda1.read("isABTest", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoRuleMsg deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoRuleMsg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        boolean zWrite = false;
        boolean zWrite2 = false;
        List list = null;
        ProtoValue protoValue = null;
        ProtoValue protoValue2 = null;
        List list2 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, setgraphicmodalmaxwidthdpArr[0], list);
                    i |= 1;
                    break;
                case 1:
                    zWrite = createinappmessageviewlambda1Serializer.write(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    protoValue = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, ProtoValue$$serializer.INSTANCE, protoValue);
                    i |= 4;
                    break;
                case 3:
                    protoValue2 = (ProtoValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 3, ProtoValue$$serializer.INSTANCE, protoValue2);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) createinappmessageviewlambda1Serializer.serializer(descriptor2, 4, setgraphicmodalmaxwidthdpArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(descriptor2, 5);
                    i |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoRuleMsg(i, list, zWrite, protoValue, protoValue2, list2, zWrite2, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoRuleMsg protoRuleMsg) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoRuleMsg.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoRuleMsg.write$Self$fwf_client_release(protoRuleMsg, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = ProtoRuleMsg.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[0]);
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = LazyKt__LazyJVMKt.read(protoValue$$serializer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpArr[4]);
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdp, getwasclosemessagecalled, setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, setgraphicmodalmaxwidthdp4, getwasclosemessagecalled};
    }
}
