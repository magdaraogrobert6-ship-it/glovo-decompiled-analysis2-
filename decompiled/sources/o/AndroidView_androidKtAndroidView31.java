package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidView_androidKtAndroidView31;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class AndroidView_androidKtAndroidView31 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final StateV3$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 23;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) AndroidView_androidKtAndroidView31.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = RemoteActionCompatParcelizer + 67;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(0));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$Companion] */
    static {
        int i = serializer + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }
}
