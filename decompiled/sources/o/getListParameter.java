package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.BridgeMessage$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getListParameter;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getListParameter {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final BridgeMessage$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.BridgeMessage$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 105;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) getListParameter.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = serializer + 71;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(27));

    public abstract String RemoteActionCompatParcelizer();

    public abstract String serializer();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.BridgeMessage$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 93;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
