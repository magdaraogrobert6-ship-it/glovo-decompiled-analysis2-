package com.deliveryhero.fwf_client.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class ProtoValue$$serializer implements getInAppMessageManager {
    public static final ProtoValue$$serializer INSTANCE;
    private static final /* synthetic */ onCloseActionlambda1 descriptor;

    private ProtoValue$$serializer() {
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
        ProtoValue$$serializer protoValue$$serializer = new ProtoValue$$serializer();
        INSTANCE = protoValue$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.fwf_client.model.ProtoValue", protoValue$$serializer, 6);
        oncloseactionlambda1.read("nullValue", true);
        oncloseactionlambda1.read("numberValue", true);
        oncloseactionlambda1.read("stringValue", true);
        oncloseactionlambda1.read("boolValue", true);
        oncloseactionlambda1.read("structValue", true);
        oncloseactionlambda1.read("listValue", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer), LazyKt__LazyJVMKt.read(r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(getWasCloseMessageCalled.write), LazyKt__LazyJVMKt.read(ProtoStructValue$$serializer.INSTANCE), LazyKt__LazyJVMKt.read(ProtoListValue$$serializer.INSTANCE)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public ProtoValue deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor2);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Double d = null;
        String str = null;
        Boolean bool = null;
        ProtoStructValue protoStructValue = null;
        ProtoListValue protoListValue = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(descriptor2);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) createinappmessageviewlambda1Serializer.serializer(descriptor2, 0, afterClosed.IconCompatParcelizer, num);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) createinappmessageviewlambda1Serializer.serializer(descriptor2, 1, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
                    i |= 2;
                    break;
                case 2:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(descriptor2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) createinappmessageviewlambda1Serializer.serializer(descriptor2, 3, getWasCloseMessageCalled.write, bool);
                    i |= 8;
                    break;
                case 4:
                    protoStructValue = (ProtoStructValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 4, ProtoStructValue$$serializer.INSTANCE, protoStructValue);
                    i |= 16;
                    break;
                case 5:
                    protoListValue = (ProtoListValue) createinappmessageviewlambda1Serializer.serializer(descriptor2, 5, ProtoListValue$$serializer.INSTANCE, protoListValue);
                    i |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(descriptor2);
        return new ProtoValue(i, num, d, str, bool, protoStructValue, protoListValue, (onCloseClicked) null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ProtoValue protoValue) {
        defaultInAppMessageViewWrapperFactory.getClass();
        protoValue.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor2);
        ProtoValue.write$Self$fwf_client_release(protoValue, defaultInAppMessageSlideupViewFactorySerializer, descriptor2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2);
    }
}
