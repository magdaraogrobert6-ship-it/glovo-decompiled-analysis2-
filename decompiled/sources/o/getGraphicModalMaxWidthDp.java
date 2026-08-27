package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final class getGraphicModalMaxWidthDp implements setGraphicModalMaxWidthDp {
    public static final getGraphicModalMaxWidthDp serializer = new getGraphicModalMaxWidthDp();
    public static final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, getModalizedImageRadiusDp.read);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setCustomInAppMessageAnimationFactory setcustominappmessageanimationfactory = (setCustomInAppMessageAnimationFactory) obj;
        setcustominappmessageanimationfactory.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, setcustominappmessageanimationfactory.days, serializer.getDescriptor());
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
            getGraphicModalMaxWidthDp getgraphicmodalmaxwidthdp = serializer;
            int i = createinappmessageviewlambda1Serializer.read(getgraphicmodalmaxwidthdp.getDescriptor());
            if (i == -1) {
                createinappmessageviewlambda1Serializer.write(descriptor);
                if (z) {
                    return new setCustomInAppMessageAnimationFactory(iIconCompatParcelizer);
                }
                throw new MissingFieldException("days");
            }
            if (i != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                return null;
            }
            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getgraphicmodalmaxwidthdp.getDescriptor(), 0);
            z = true;
        }
    }
}
