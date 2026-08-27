package o;

import com.sentiance.core.model.thrift.E1$b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class removeFromCustomAttributeArraylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE read = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(9);
    public final List IconCompatParcelizer;

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public removeFromCustomAttributeArraylambda0(E1$b e1$b) {
        this.IconCompatParcelizer = Collections.unmodifiableList(e1$b.serializer);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("VenueMapConfiguration{points_of_interest="), this.IconCompatParcelizer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof removeFromCustomAttributeArraylambda0)) {
            return false;
        }
        Object obj2 = ((removeFromCustomAttributeArraylambda0) obj).IconCompatParcelizer;
        List list = this.IconCompatParcelizer;
        return list == obj2 || list.equals(obj2);
    }
}
