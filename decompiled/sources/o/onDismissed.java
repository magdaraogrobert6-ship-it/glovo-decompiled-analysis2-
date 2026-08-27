package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onDismissed implements setGraphicModalMaxWidthDp {
    public static final onDismissed write = new onDismissed();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Long", DefaultInAppMessageModalViewFactory.MediaMetadataCompat);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.serializer(((Number) obj).longValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Long.valueOf(defaultInAppMessageModalViewFactoryCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
    }
}
