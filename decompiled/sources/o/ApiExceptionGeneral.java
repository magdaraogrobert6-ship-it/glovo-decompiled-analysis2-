package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ApiExceptionGeneral extends ApiErrorResponseCompanion {
    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion IconCompatParcelizer(long j) {
        return this;
    }

    @Override // o.ApiErrorResponseCompanion
    public final ApiErrorResponseCompanion IconCompatParcelizer(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this;
    }

    @Override // o.ApiErrorResponseCompanion
    public final void serializer() {
    }
}
