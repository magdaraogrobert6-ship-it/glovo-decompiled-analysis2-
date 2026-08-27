package o;

/* JADX INFO: loaded from: classes4.dex */
public final class afterClosed implements setGraphicModalMaxWidthDp {
    public static final afterClosed IconCompatParcelizer = new afterClosed();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Int", DefaultInAppMessageModalViewFactory.serializer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.read(((Number) obj).intValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Integer.valueOf(defaultInAppMessageModalViewFactoryCompanion.MediaSessionCompatToken());
    }
}
