package o;

import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$Data$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class AndroidPopup_androidKtPopup41 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public static final StateV3$Data$Companion Companion = new StateV3$Data$Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(20));

    public abstract String read();

    static {
        int i = write + 41;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }
}
