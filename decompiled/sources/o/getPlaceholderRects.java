package o;

import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getPlaceholderRects {
    private static int read = 1;
    private static int write;
    public static final HostMessage$Companion Companion = new HostMessage$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(17));

    public abstract String serializer();

    static {
        int i = write + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
