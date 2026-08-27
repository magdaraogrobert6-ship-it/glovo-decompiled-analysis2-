package o;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc implements setGraphicModalMaxWidthDp {
    public static final r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc serializer = new r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc();
    public static final r8lambdagPJkKPmK6NmiRVYpj74Jv2gOTik IconCompatParcelizer = r8lambdagPJkKPmK6NmiRVYpj74Jv2gOTik.RemoteActionCompatParcelizer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj;
        r8lambdaerwhggzq_gqgn8cultnvrcshm8k.getClass();
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        Object[] objArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer};
        ((beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr)).serialize(defaultInAppMessageViewWrapperFactory, r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion);
        Object[] objArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer};
        return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k((Map) ((beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr)).deserialize(defaultInAppMessageModalViewFactoryCompanion));
    }
}
