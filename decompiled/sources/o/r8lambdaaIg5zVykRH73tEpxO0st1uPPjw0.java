package o;

import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 {
    private final Range<Long> serializer;

    public final long IconCompatParcelizer() {
        return ((Long) this.serializer.getLower()).longValue();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.serializer, ((r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0) obj).serializer);
    }

    public final int hashCode() {
        return Objects.hashCode(this.serializer);
    }

    public final long serializer() {
        return ((Long) this.serializer.getUpper()).longValue();
    }

    public r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0(long j, long j2) {
        this.serializer = Range.create(Long.valueOf(j), Long.valueOf(j2));
    }
}
