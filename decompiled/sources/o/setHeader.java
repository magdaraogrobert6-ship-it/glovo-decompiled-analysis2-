package o;

import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class setHeader extends getImageStyle {
    private final WhereClause read;

    public final WhereClause read() {
        return this.read;
    }

    public final int hashCode() {
        return Objects.hash(this.read);
    }

    public setHeader(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnys, WhereClause whereClause, TimelineUpdateDetails timelineUpdateDetails) {
        super(timelineUpdateDetails, r8lambdarf7yhczztbilw1gecuyccn6jnys);
        this.read = whereClause;
    }

    @Override // o.getImageStyle
    public final String toString() {
        return "DeleteAction{mTimelineUpdateDetails=" + this.RemoteActionCompatParcelizer + ", mTable=" + this.IconCompatParcelizer + ", mWhereClause=" + this.read + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.read.equals(((setHeader) obj).read);
    }
}
