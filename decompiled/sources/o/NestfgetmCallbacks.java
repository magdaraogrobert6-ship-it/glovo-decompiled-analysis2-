package o;

import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfgetmCallbacks implements setGraphicModalMaxWidthDp {
    public static final NestfgetmCallbacks IconCompatParcelizer = new NestfgetmCallbacks();
    public final /* synthetic */ EnumSerializer write = new EnumSerializer("kotlin.Unit", createFromParcel.INSTANCE);

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        this.write.deserialize(defaultInAppMessageModalViewFactoryCompanion);
        return createFromParcel.INSTANCE;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.write.getDescriptor();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        createFromParcel createfromparcel = (createFromParcel) obj;
        createfromparcel.getClass();
        this.write.serialize(defaultInAppMessageViewWrapperFactory, createfromparcel);
    }
}
