package o;

import java.util.ArrayDeque;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class RgbCompanionExternalSyntheticLambda0 {
    private static int read = 0;
    private static int write = 1;
    public final Object IconCompatParcelizer;

    public abstract getTypeConverter IconCompatParcelizer();

    public abstract getTypeConverter read();

    public abstract List serializer();

    public RgbCompanionExternalSyntheticLambda0(int i) {
        if (i != 1) {
            this.IconCompatParcelizer = new ArrayDeque(20);
        } else {
            this.IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new waExternalSyntheticLambda3(2));
        }
    }

    public void RemoteActionCompatParcelizer(isPQishui_graphics ispqishui_graphics) {
        int i = 2 % 2;
        ArrayDeque arrayDeque = (ArrayDeque) this.IconCompatParcelizer;
        Object obj = null;
        if (arrayDeque.size() < 20) {
            int i2 = read + 23;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                arrayDeque.offer(ispqishui_graphics);
                throw null;
            }
            arrayDeque.offer(ispqishui_graphics);
        }
        int i3 = write + 87;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void write() {
        int i = 2 % 2;
        int i2 = write + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.REQUEST_PERMISSION);
            return;
        }
        ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.REQUEST_PERMISSION);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
