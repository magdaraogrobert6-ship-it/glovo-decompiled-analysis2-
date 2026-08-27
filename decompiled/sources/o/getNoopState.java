package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonAction$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getNoopState {
    private static int read = 1;
    private static int write;
    public static final ButtonAction$Companion Companion = new ButtonAction$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(14));

    static {
        int i = read + 83;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
