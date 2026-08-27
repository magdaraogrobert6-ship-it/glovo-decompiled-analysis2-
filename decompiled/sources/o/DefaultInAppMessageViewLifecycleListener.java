package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewLifecycleListener implements setGraphicModalMaxWidthDp {
    public static final DefaultInAppMessageViewLifecycleListener RemoteActionCompatParcelizer = new DefaultInAppMessageViewLifecycleListener();
    public static final DefaultInAppMessageWebViewClientListenerCompanion serializer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Char", DefaultInAppMessageModalViewFactory.IconCompatParcelizer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(((Character) obj).charValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Character.valueOf(defaultInAppMessageModalViewFactoryCompanion.MediaSessionCompatResultReceiverWrapper());
    }
}
