package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.domain.ComponentHost$BottomSheet$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.dispatchNestedScroll;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class dispatchNestedScroll extends dispatchLayoutStep1 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public static final ComponentHost$BottomSheet$Companion Companion = new Object() { // from class: com.roadrunner.home.state.domain.ComponentHost$BottomSheet$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 117;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) dispatchNestedScroll.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = write + 51;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new dispatchSaveInstanceState(8));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.domain.ComponentHost$BottomSheet$Companion] */
    static {
        int i = write + 71;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }
}
