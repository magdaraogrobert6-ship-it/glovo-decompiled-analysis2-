package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final class getModalizedImageRadiusDpannotations implements setGraphicModalMaxWidthDp {
    public static final getModalizedImageRadiusDpannotations IconCompatParcelizer = new getModalizedImageRadiusDpannotations();
    public static final onViewDetachedFromWindowlambda1 serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, getModalizedImageRadiusDp.write);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) serializer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setCustomInAppMessageViewFactory setcustominappmessageviewfactory = (setCustomInAppMessageViewFactory) obj;
        setcustominappmessageviewfactory.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, setcustominappmessageviewfactory.months, IconCompatParcelizer.getDescriptor());
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = false;
        int iIconCompatParcelizer = 0;
        while (true) {
            getModalizedImageRadiusDpannotations getmodalizedimageradiusdpannotations = IconCompatParcelizer;
            int i = createinappmessageviewlambda1Serializer.read(getmodalizedimageradiusdpannotations.getDescriptor());
            if (i == -1) {
                createinappmessageviewlambda1Serializer.write(descriptor);
                if (z) {
                    return new setCustomInAppMessageViewFactory(iIconCompatParcelizer);
                }
                throw new MissingFieldException("months");
            }
            if (i != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                return null;
            }
            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getmodalizedimageradiusdpannotations.getDescriptor(), 0);
            z = true;
        }
    }
}
