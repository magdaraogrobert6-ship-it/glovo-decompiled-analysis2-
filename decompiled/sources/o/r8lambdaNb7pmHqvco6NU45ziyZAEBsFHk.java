package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk implements setGraphicModalMaxWidthDp {
    public final setGraphicModalMaxWidthDp IconCompatParcelizer;
    public final onOtherUrlActionlambda2 serializer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        if (obj != null) {
            defaultInAppMessageViewWrapperFactory.read(this.IconCompatParcelizer, obj);
        } else {
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer();
        }
    }

    public r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        setgraphicmodalmaxwidthdp.getClass();
        this.IconCompatParcelizer = setgraphicmodalmaxwidthdp;
        this.serializer = new onOtherUrlActionlambda2(setgraphicmodalmaxwidthdp.getDescriptor());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        if (defaultInAppMessageModalViewFactoryCompanion.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
            return defaultInAppMessageModalViewFactoryCompanion.write(this.IconCompatParcelizer);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk.class != obj.getClass()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
