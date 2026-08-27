package o;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class getGraphicModalMaxWidthDpannotations extends AbstractPolymorphicSerializer {
    public static final getGraphicModalMaxWidthDpannotations IconCompatParcelizer = new getGraphicModalMaxWidthDpannotations();
    public static final onViewDetachedFromWindowlambda1 read = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, getModalizedImageRadiusDp.serializer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return ((DefaultInAppMessageHtmlFullViewFactory) read.MediaSessionCompatResultReceiverWrapper()).getDescriptor();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final getUnregisteredInAppMessageannotations read() {
        return displayInAppMessagelambda1.serializer(setCustomHtmlInAppMessageActionListener.class);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp serializer(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setCustomHtmlInAppMessageActionListener setcustomhtmlinappmessageactionlistener = (setCustomHtmlInAppMessageActionListener) obj;
        setcustomhtmlinappmessageactionlistener.getClass();
        return ((DefaultInAppMessageHtmlFullViewFactory) read.MediaSessionCompatResultReceiverWrapper()).serializer(defaultInAppMessageViewWrapperFactory, setcustomhtmlinappmessageactionlistener);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp read(createInAppMessageViewlambda1 createinappmessageviewlambda1, String str) {
        return ((DefaultInAppMessageHtmlFullViewFactory) read.MediaSessionCompatResultReceiverWrapper()).read(createinappmessageviewlambda1, str);
    }
}
