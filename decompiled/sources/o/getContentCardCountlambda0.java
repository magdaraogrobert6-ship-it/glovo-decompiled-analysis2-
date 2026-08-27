package o;

import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getContentCardCountlambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public static final StartWorkingComponent$Companion Companion = new StartWorkingComponent$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(5));

    static {
        int i = write + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
