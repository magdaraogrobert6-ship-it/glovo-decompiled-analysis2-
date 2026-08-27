package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s implements setGraphicModalMaxWidthDp {
    public static final r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s RemoteActionCompatParcelizer = new r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s();
    public static final DefaultInAppMessageWebViewClientListenerCompanion serializer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.Double", DefaultInAppMessageModalViewFactory.MediaSessionCompatQueueItem);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(((Number) obj).doubleValue());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return Double.valueOf(defaultInAppMessageModalViewFactoryCompanion.ParcelableVolumeInfo());
    }
}
