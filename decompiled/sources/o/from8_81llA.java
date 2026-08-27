package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.overdue.data.model.IssueRequestBody$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.from8_81llA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class from8_81llA {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final IssueRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.overdue.data.model.IssueRequestBody$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 41;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return (setGraphicModalMaxWidthDp) from8_81llA.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            }
            int i3 = 41 / 0;
            return (setGraphicModalMaxWidthDp) from8_81llA.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    };
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(4));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.overdue.data.model.IssueRequestBody$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
