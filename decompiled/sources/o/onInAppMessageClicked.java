package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onInAppMessageClicked implements setGraphicModalMaxWidthDp {
    public static final onInAppMessageClicked read = new onInAppMessageClicked();
    public static final performClickActionlambda1 write = performClickAction.IconCompatParcelizer("kotlin.UByte", r8lambda1VgBO9VidiFdX4WL52nRFDgX4.RemoteActionCompatParcelizer);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return new setImpressedCardIds(defaultInAppMessageModalViewFactoryCompanion.RemoteActionCompatParcelizer(write).PlaybackStateCompatCustomAction());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(write).RemoteActionCompatParcelizer(((setImpressedCardIds) obj).serializer);
    }
}
