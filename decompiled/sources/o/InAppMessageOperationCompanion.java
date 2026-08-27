package o;

import java.time.LocalTime;
import kotlinx.datetime.LocalTime$Companion;
import kotlinx.datetime.serializers.LocalTimeIso8601Serializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable(write = LocalTimeIso8601Serializer.class)
public final class InAppMessageOperationCompanion implements Comparable<InAppMessageOperationCompanion> {
    public static final LocalTime$Companion Companion = new Object() { // from class: kotlinx.datetime.LocalTime$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return LocalTimeIso8601Serializer.RemoteActionCompatParcelizer;
        }
    };
    public final LocalTime value;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.LocalTime$Companion] */
    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new InAppMessageOperationCompanion(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new InAppMessageOperationCompanion(localTime2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(InAppMessageOperationCompanion inAppMessageOperationCompanion) {
        InAppMessageOperationCompanion inAppMessageOperationCompanion2 = inAppMessageOperationCompanion;
        inAppMessageOperationCompanion2.getClass();
        return this.value.compareTo(inAppMessageOperationCompanion2.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageOperationCompanion)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((InAppMessageOperationCompanion) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public InAppMessageOperationCompanion(LocalTime localTime) {
        localTime.getClass();
        this.value = localTime;
    }
}
