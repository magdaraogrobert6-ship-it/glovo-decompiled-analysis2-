package o;

import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeFinish implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final maybeFinish serializer = new maybeFinish();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 21;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean z = ((getOptimizationLevel) obj) instanceof getMaxWidth;
            throw null;
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
        if (getoptimizationlevel instanceof getMaxWidth) {
            Timber.RemoteActionCompatParcelizer.read(((getMaxWidth) getoptimizationlevel).serializer, "Background state update for overlay", new Object[0]);
            int i3 = RemoteActionCompatParcelizer + 25;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("State update operation completed successfully.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
