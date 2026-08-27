package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaPL85OQRKTFk3qoyXtasg0koOjMc;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class NothingSerializer implements setGraphicModalMaxWidthDp {
    public static final NothingSerializer write = new NothingSerializer();
    public static final r8lambdaPL85OQRKTFk3qoyXtasg0koOjMc RemoteActionCompatParcelizer = r8lambdaPL85OQRKTFk3qoyXtasg0koOjMc.IconCompatParcelizer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        ((Void) obj).getClass();
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }
}
