package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.domain.ComponentHost$FloatingLayer$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.findMinMaxChildLayoutPositions;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class findMinMaxChildLayoutPositions extends dispatchLayoutStep1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public static final ComponentHost$FloatingLayer$Companion Companion = new Object() { // from class: com.roadrunner.home.state.domain.ComponentHost$FloatingLayer$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 77;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) findMinMaxChildLayoutPositions.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = RemoteActionCompatParcelizer + 107;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return setgraphicmodalmaxwidthdp;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new dispatchSaveInstanceState(19));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.domain.ComponentHost$FloatingLayer$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
