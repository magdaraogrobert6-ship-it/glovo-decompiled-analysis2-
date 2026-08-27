package o;

import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "PayloadCreator")
public class setSummaryTextIfPresentAndSupportedlambda0 {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;

    public setSummaryTextIfPresentAndSupportedlambda0(com.sentiance.sdk.util.c cVar) {
        this.IconCompatParcelizer = cVar;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.read("long_stationary_before_trip", false);
    }

    public final long write(long j) {
        return this.IconCompatParcelizer.IconCompatParcelizer("last_update", j);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.IconCompatParcelizer("long_stationary_before_trip", z);
    }

    public final void IconCompatParcelizer(long j) {
        this.IconCompatParcelizer.read(j, "last_update");
    }

    public final void write() {
        this.IconCompatParcelizer.read();
    }
}
