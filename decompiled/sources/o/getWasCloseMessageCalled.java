package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getWasCloseMessageCalled implements setGraphicModalMaxWidthDp {
    public static final getWasCloseMessageCalled write = new getWasCloseMessageCalled();
    public static final DefaultInAppMessageWebViewClientListenerCompanion read = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Boolean", DefaultInAppMessageModalViewFactory.RemoteActionCompatParcelizer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(((Boolean) obj).booleanValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Boolean.valueOf(defaultInAppMessageModalViewFactoryCompanion.MediaDescriptionCompat());
    }
}
