package o;

/* JADX INFO: loaded from: classes4.dex */
public final class performClickActionlambda2 implements getInAppMessageManager {
    public final /* synthetic */ setGraphicModalMaxWidthDp serializer;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    public performClickActionlambda2(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        this.serializer = setgraphicmodalmaxwidthdp;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{this.serializer};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        throw new IllegalStateException("unsupported");
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        throw new IllegalStateException("unsupported");
    }
}
