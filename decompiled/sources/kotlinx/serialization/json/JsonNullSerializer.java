package kotlinx.serialization.json;

import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.getAppropriateModalView;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc;
import o.setGraphicModalMaxWidthDp;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonNullSerializer implements setGraphicModalMaxWidthDp {
    public static final JsonNullSerializer read = new JsonNullSerializer();
    public static final getAppropriateModalView RemoteActionCompatParcelizer = RangesKt.read("kotlinx.serialization.json.JsonNull", r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        ((r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc) obj).getClass();
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion);
        if (defaultInAppMessageModalViewFactoryCompanion.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE;
    }
}
