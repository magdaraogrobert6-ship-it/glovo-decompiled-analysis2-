package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class emptyCancelMotionEventScopedefault {
    public final MatrixPositionCalculator IconCompatParcelizer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer});
    }

    public /* synthetic */ emptyCancelMotionEventScopedefault(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        this.IconCompatParcelizer = (MatrixPositionCalculator) pinnableContainerKtLocalPinnableContainer1.serializer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emptyCancelMotionEventScopedefault) {
            return TuplesKt.write(this.IconCompatParcelizer, ((emptyCancelMotionEventScopedefault) obj).IconCompatParcelizer);
        }
        return false;
    }
}
