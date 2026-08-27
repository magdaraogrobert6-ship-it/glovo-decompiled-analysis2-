package o;

import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;

/* JADX INFO: loaded from: classes3.dex */
public class setHeaderTextAlign extends getImageStyle {
    private final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 read;

    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 read() {
        return this.read;
    }

    public setHeaderTextAlign(r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 r8lambda5ta641qk4ejfidaa2z9nuude5e0, TimelineUpdateDetails timelineUpdateDetails) {
        super(timelineUpdateDetails, r8lambda5ta641qk4ejfidaa2z9nuude5e0.write());
        this.read = r8lambda5ta641qk4ejfidaa2z9nuude5e0;
    }

    @Override // o.getImageStyle
    public final String toString() {
        return "AddAction{timelineUpdateDetails=" + this.RemoteActionCompatParcelizer + ", mEntry=" + this.read + '}';
    }
}
