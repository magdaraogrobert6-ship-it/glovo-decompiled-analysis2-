package o;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlinx.datetime.LocalDate$Companion;
import kotlinx.datetime.serializers.LocalDateIso8601Serializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = LocalDateIso8601Serializer.class)
public final class InAppMessageManagerBaseExternalSyntheticLambda1 implements Comparable<InAppMessageManagerBaseExternalSyntheticLambda1> {
    public static final LocalDate$Companion Companion = new Object() { // from class: kotlinx.datetime.LocalDate$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return LocalDateIso8601Serializer.IconCompatParcelizer;
        }
    };
    public final LocalDate value;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.LocalDate$Companion] */
    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new InAppMessageManagerBaseExternalSyntheticLambda1(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new InAppMessageManagerBaseExternalSyntheticLambda1(localDate2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1) {
        InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda2 = inAppMessageManagerBaseExternalSyntheticLambda1;
        inAppMessageManagerBaseExternalSyntheticLambda2.getClass();
        return this.value.compareTo((ChronoLocalDate) inAppMessageManagerBaseExternalSyntheticLambda2.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageManagerBaseExternalSyntheticLambda1)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((InAppMessageManagerBaseExternalSyntheticLambda1) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public InAppMessageManagerBaseExternalSyntheticLambda1(LocalDate localDate) {
        localDate.getClass();
        this.value = localDate;
    }
}
