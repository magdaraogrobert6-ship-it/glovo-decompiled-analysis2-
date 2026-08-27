package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class Wallpapers {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final SignatureTaskUiItem$SignatureState$Companion Companion = new SignatureTaskUiItem$SignatureState$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(18));

    static {
        int i = read + 59;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
