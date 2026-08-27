package o;

/* JADX INFO: loaded from: classes4.dex */
public final class afterInAppMessageViewClosed implements setGraphicModalMaxWidthDp {
    public static final afterInAppMessageViewClosed RemoteActionCompatParcelizer = new afterInAppMessageViewClosed();
    public static final DefaultInAppMessageWebViewClientListenerCompanion read = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Short", DefaultInAppMessageModalViewFactory.MediaDescriptionCompat);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.read(((Number) obj).shortValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Short.valueOf(defaultInAppMessageModalViewFactoryCompanion.ComponentActivity());
    }
}
