package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda1VgBO9VidiFdX4WL52nRFDgX4 implements setGraphicModalMaxWidthDp {
    public static final r8lambda1VgBO9VidiFdX4WL52nRFDgX4 RemoteActionCompatParcelizer = new r8lambda1VgBO9VidiFdX4WL52nRFDgX4();
    public static final DefaultInAppMessageWebViewClientListenerCompanion IconCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Byte", DefaultInAppMessageModalViewFactory.write);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(((Number) obj).byteValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Byte.valueOf(defaultInAppMessageModalViewFactoryCompanion.PlaybackStateCompatCustomAction());
    }
}
