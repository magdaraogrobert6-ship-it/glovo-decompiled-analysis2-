package o;

import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.JsonNullSerializer;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaugY17WQO8mpsLV5Hi_noV0m5c6M implements setGraphicModalMaxWidthDp {
    public static final r8lambdaugY17WQO8mpsLV5Hi_noV0m5c6M serializer = new r8lambdaugY17WQO8mpsLV5Hi_noV0m5c6M();
    public static final getAppropriateModalView write = RangesKt.read("kotlinx.serialization.json.JsonPrimitive", DefaultInAppMessageModalViewFactory.RatingCompat, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) obj;
        r8lambdagbekcaskecamm7h9dyqnzofon0.getClass();
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        if (r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc) {
            defaultInAppMessageViewWrapperFactory.read(JsonNullSerializer.read, r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE);
        } else {
            defaultInAppMessageViewWrapperFactory.read(r8lambdaW1Un4um7jYXCqpIQphdSIfhdGU.write, (r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) r8lambdagbekcaskecamm7h9dyqnzofon0);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion).read();
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            return (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection;
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection.toString(), -1, "Unexpected JSON element, expected JsonPrimitive, had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirection.getClass()));
    }
}
