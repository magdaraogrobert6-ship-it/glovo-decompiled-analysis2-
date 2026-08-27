package o;

import android.content.ContentValues;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public class handleLogClicklambda0 extends getImageStyle {
    private final WhereClause read;
    private final boolean serializer;
    private final ContentValues write;

    public final boolean IconCompatParcelizer() {
        return this.serializer;
    }

    public final WhereClause read() {
        return this.read;
    }

    public final ContentValues write() {
        return this.write;
    }

    public handleLogClicklambda0(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnys, ContentValues contentValues, WhereClause whereClause, boolean z, TimelineUpdateDetails timelineUpdateDetails) {
        super(timelineUpdateDetails, r8lambdarf7yhczztbilw1gecuyccn6jnys);
        this.write = contentValues;
        this.read = whereClause;
        this.serializer = z;
    }

    @Override // o.getImageStyle
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateAction{mTimelineUpdateDetails=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", mTable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mContentValues=");
        sb.append(this.write);
        sb.append(", mInsertIfFailedToUpdate=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, '}');
    }
}
