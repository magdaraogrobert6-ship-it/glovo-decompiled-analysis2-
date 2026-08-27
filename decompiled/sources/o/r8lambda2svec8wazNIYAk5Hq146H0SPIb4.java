package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.ranges.RangesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda2svec8wazNIYAk5Hq146H0SPIb4 implements setGraphicModalMaxWidthDp {
    public static final r8lambda2svec8wazNIYAk5Hq146H0SPIb4 IconCompatParcelizer = new r8lambda2svec8wazNIYAk5Hq146H0SPIb4();
    public static final getAppropriateModalView RemoteActionCompatParcelizer = RangesKt.write("kotlinx.serialization.json.JsonElement", createInAppMessageViewlambda0.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(7));

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) obj;
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            defaultInAppMessageViewWrapperFactory.read(r8lambdaugY17WQO8mpsLV5Hi_noV0m5c6M.serializer, swipeDismissTouchListenerVerticalDismissDirection);
            return;
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            defaultInAppMessageViewWrapperFactory.read(r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer, swipeDismissTouchListenerVerticalDismissDirection);
        } else if (swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept) {
            defaultInAppMessageViewWrapperFactory.read(performDismiss.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion).read();
    }
}
