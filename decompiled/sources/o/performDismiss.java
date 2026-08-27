package o;

import java.util.Iterator;
import java.util.List;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class performDismiss implements setGraphicModalMaxWidthDp {
    public static final performDismiss IconCompatParcelizer = new performDismiss();
    public static final SwipeDismissTouchListener3 write = SwipeDismissTouchListener3.read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        requestDisallowParentIntercept requestdisallowparentintercept = (requestDisallowParentIntercept) obj;
        requestdisallowparentintercept.getClass();
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        r8lambda2svec8wazNIYAk5Hq146H0SPIb4 r8lambda2svec8wazniyak5hq146h0spib4 = r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = r8lambda2svec8wazniyak5hq146h0spib4.getDescriptor();
        descriptor.getClass();
        InAppMessageJavascriptInterfaceCompanion inAppMessageJavascriptInterfaceCompanion = new InAppMessageJavascriptInterfaceCompanion(descriptor, 0);
        int size = requestdisallowparentintercept.size();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactoryWrite = defaultInAppMessageViewWrapperFactory.write(inAppMessageJavascriptInterfaceCompanion, size);
        Iterator<SwipeDismissTouchListenerVerticalDismissDirection> it = requestdisallowparentintercept.iterator();
        for (int i = 0; i < size; i++) {
            defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(inAppMessageJavascriptInterfaceCompanion, i, r8lambda2svec8wazniyak5hq146h0spib4, it.next());
        }
        defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(inAppMessageJavascriptInterfaceCompanion);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion);
        return new requestDisallowParentIntercept((List) new setWasCloseMessageCalled(r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, 0).IconCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion, null));
    }
}
