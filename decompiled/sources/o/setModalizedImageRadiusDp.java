package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final class setModalizedImageRadiusDp implements setGraphicModalMaxWidthDp {
    public static final setModalizedImageRadiusDp RemoteActionCompatParcelizer = new setModalizedImageRadiusDp();
    public static final onViewDetachedFromWindowlambda1 IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, getModalizedImageRadiusDp.IconCompatParcelizer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setCustomInAppMessageViewWrapperFactory setcustominappmessageviewwrapperfactory = (setCustomInAppMessageViewWrapperFactory) obj;
        setcustominappmessageviewwrapperfactory.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.getDescriptor(), 0, setcustominappmessageviewwrapperfactory.nanoseconds);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor);
        createinappmessageviewlambda1Serializer.getClass();
        long jSerializer = 0;
        boolean z = false;
        while (true) {
            setModalizedImageRadiusDp setmodalizedimageradiusdp = RemoteActionCompatParcelizer;
            int i = createinappmessageviewlambda1Serializer.read(setmodalizedimageradiusdp.getDescriptor());
            if (i == -1) {
                createinappmessageviewlambda1Serializer.write(descriptor);
                if (z) {
                    return new setCustomInAppMessageViewWrapperFactory(jSerializer);
                }
                throw new MissingFieldException("nanoseconds");
            }
            if (i != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                return null;
            }
            jSerializer = createinappmessageviewlambda1Serializer.serializer(setmodalizedimageradiusdp.getDescriptor(), 0);
            z = true;
        }
    }
}
