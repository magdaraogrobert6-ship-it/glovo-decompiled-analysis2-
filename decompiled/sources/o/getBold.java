package o;

import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getBold {
    private static int read = 0;
    private static int serializer = 1;
    public static final ScrollableComponent$Instructions$Item$Companion Companion = new ScrollableComponent$Instructions$Item$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(7));

    static {
        int i = read + 29;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
