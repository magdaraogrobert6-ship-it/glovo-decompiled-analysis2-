package com.deliveryhero.performance.core.analytics;

/* JADX INFO: loaded from: classes2.dex */
public final class TraceRateLimitExceededException extends IllegalStateException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public TraceRateLimitExceededException(String str, int i, int i2) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Trace '");
        sb.append(str);
        sb.append("' started ");
        sb.append(i);
        sb.append(" times in the last 1000ms limit=50");
        if (i2 > 0) {
            sb.append(" Suppressed ");
            sb.append(i2);
            sb.append(" duplicate exceedance alerts in the last 300000ms.");
        }
        super(sb.toString());
    }
}
