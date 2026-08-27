package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateAlignmentAndPlaceChildAsNeeded {
    public final setNextChildPlaceOrderui read;
    public final Class serializer;

    public final int hashCode() {
        return Objects.hash(this.serializer, this.read);
    }

    public final String toString() {
        return this.serializer.getSimpleName() + ", object identifier: " + this.read;
    }

    public calculateAlignmentAndPlaceChildAsNeeded(Class cls, setNextChildPlaceOrderui setnextchildplaceorderui) {
        this.serializer = cls;
        this.read = setnextchildplaceorderui;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof calculateAlignmentAndPlaceChildAsNeeded)) {
            return false;
        }
        calculateAlignmentAndPlaceChildAsNeeded calculatealignmentandplacechildasneeded = (calculateAlignmentAndPlaceChildAsNeeded) obj;
        return calculatealignmentandplacechildasneeded.serializer.equals(this.serializer) && calculatealignmentandplacechildasneeded.read.equals(this.read);
    }
}
