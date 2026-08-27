package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onClickedlambda0 implements setGraphicModalMaxWidthDp {
    public static final onClickedlambda0 serializer = new onClickedlambda0();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Float", DefaultInAppMessageModalViewFactory.MediaBrowserCompatMediaItem);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.read(((Number) obj).floatValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Float.valueOf(defaultInAppMessageModalViewFactoryCompanion.PlaybackStateCompat());
    }
}
