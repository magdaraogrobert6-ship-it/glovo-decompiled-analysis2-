package o;

import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getImageStyle {
    protected final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> IconCompatParcelizer;
    protected final TimelineUpdateDetails RemoteActionCompatParcelizer;

    public final TimelineUpdateDetails RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static setHeaderTextAlign RemoteActionCompatParcelizer(r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 r8lambda5ta641qk4ejfidaa2z9nuude5e0) {
        return new setHeaderTextAlign(r8lambda5ta641qk4ejfidaa2z9nuude5e0, new TimelineUpdateDetails());
    }

    public getImageStyle(TimelineUpdateDetails timelineUpdateDetails, r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnys) {
        this.RemoteActionCompatParcelizer = timelineUpdateDetails;
        this.IconCompatParcelizer = r8lambdarf7yhczztbilw1gecuyccn6jnys;
    }

    public String toString() {
        return "Action{mTimelineUpdateDetails=" + this.RemoteActionCompatParcelizer + ", mTable=" + this.IconCompatParcelizer + '}';
    }

    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> serializer() {
        return this.IconCompatParcelizer;
    }

    public static setHeader RemoteActionCompatParcelizer(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnys, WhereClause whereClause) {
        return new setHeader(r8lambdarf7yhczztbilw1gecuyccn6jnys, whereClause, new TimelineUpdateDetails());
    }
}
