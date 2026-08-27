package o;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageOperation extends AbstractPolymorphicSerializer {
    public static final InAppMessageOperation serializer = new InAppMessageOperation();
    public static final onViewDetachedFromWindowlambda1 IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, getModalizedImageRadiusDp.RemoteActionCompatParcelizer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return ((DefaultInAppMessageHtmlFullViewFactory) IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).getDescriptor();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final getUnregisteredInAppMessageannotations read() {
        return displayInAppMessagelambda1.serializer(setCustomInAppMessageManagerListener.class);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp serializer(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setCustomInAppMessageManagerListener setcustominappmessagemanagerlistener = (setCustomInAppMessageManagerListener) obj;
        setcustominappmessagemanagerlistener.getClass();
        return ((DefaultInAppMessageHtmlFullViewFactory) IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer(defaultInAppMessageViewWrapperFactory, setcustominappmessagemanagerlistener);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp read(createInAppMessageViewlambda1 createinappmessageviewlambda1, String str) {
        return ((DefaultInAppMessageHtmlFullViewFactory) IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).read(createinappmessageviewlambda1, str);
    }
}
