package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class GlideException extends ApiErrorResponseCompanion {
    public ApiErrorResponseCompanion IconCompatParcelizer;

    @Override // o.ApiErrorResponseCompanion
    public final long MediaMetadataCompat() {
        return this.IconCompatParcelizer.MediaMetadataCompat();
    }

    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion N_() {
        return this.IconCompatParcelizer.N_();
    }

    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion O_() {
        return this.IconCompatParcelizer.O_();
    }

    @Override // o.ApiErrorResponseCompanion
    public final boolean P_() {
        return this.IconCompatParcelizer.P_();
    }

    @Override // o.ApiErrorResponseCompanion
    public final long Q_() {
        return this.IconCompatParcelizer.Q_();
    }

    @Override // o.ApiErrorResponseCompanion
    public final void serializer() throws InterruptedIOException {
        this.IconCompatParcelizer.serializer();
    }

    public GlideException(ApiErrorResponseCompanion apiErrorResponseCompanion) {
        apiErrorResponseCompanion.getClass();
        this.IconCompatParcelizer = apiErrorResponseCompanion;
    }

    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion IconCompatParcelizer(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.IconCompatParcelizer.IconCompatParcelizer(j, timeUnit);
    }

    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion IconCompatParcelizer(long j) {
        return this.IconCompatParcelizer.IconCompatParcelizer(j);
    }
}
