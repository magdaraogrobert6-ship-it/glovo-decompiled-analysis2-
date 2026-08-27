package o;

/* JADX INFO: loaded from: classes4.dex */
public final class beforeInAppMessageViewClosed implements setGraphicModalMaxWidthDp {
    public static final beforeInAppMessageViewClosed RemoteActionCompatParcelizer = new beforeInAppMessageViewClosed();
    public static final DefaultInAppMessageWebViewClientListenerCompanion read = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.String", DefaultInAppMessageModalViewFactory.RatingCompat);

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        String str = (String) obj;
        str.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(str);
    }
}
