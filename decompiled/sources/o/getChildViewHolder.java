package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.domain.ComponentHost$MapLayer$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getChildViewHolder;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class getChildViewHolder extends dispatchLayoutStep1 {
    private static int serializer = 0;
    private static int write = 1;
    public static final ComponentHost$MapLayer$Companion Companion = new Object() { // from class: com.roadrunner.home.state.domain.ComponentHost$MapLayer$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) getChildViewHolder.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new dispatchSaveInstanceState(27));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.domain.ComponentHost$MapLayer$Companion] */
    static {
        int i = serializer + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
