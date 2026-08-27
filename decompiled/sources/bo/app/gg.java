package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class gg {
    public int a;
    public int b;
    public final eg c;
    public long d;
    public double e;

    public gg(int i, int i2, eg egVar) {
        float fFloatValue;
        egVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = egVar;
        Long l = egVar.readLong(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, 0L);
        this.d = l != null ? l.longValue() : 0L;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        int i3 = this.a;
        Float f = egVar.readFloat(dataStoreKey, Float.valueOf(i3 < 1 ? 1 : i3));
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            int i4 = this.a;
            fFloatValue = i4 >= 1 ? i4 : 1;
        }
        this.e = fFloatValue;
    }

    public static final String b(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i, "TokenBucketRateLimiter updated with new capacity: ", i2, " and refill rate: ");
    }

    public final long a() {
        double dA = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.e = dA;
        this.c.writeData(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf((float) dA));
        double d = this.e;
        if (d >= 1.0d) {
            return 0L;
        }
        int i = this.b;
        if (i < 1) {
            i = 1;
        }
        return Math.max(0L, (long) ((1.0d - d) * ((double) i) * 1000.0d));
    }

    public final String toString() {
        int i = this.a;
        if (i < 1) {
            i = 1;
        }
        double d = i;
        int i2 = this.b;
        int i3 = i2 >= 1 ? i2 : 1;
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(this.d, null, null, 3, null);
        long j = this.d;
        double dA = a(DateTimeUtils.nowInMillisecondsSystemClock());
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "(capacity=", ", refillRate=");
        sbM.append(i3);
        sbM.append(", lastCallAt='");
        sbM.append(dateFromMillis$default);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, "', lastCallAt raw value='", j, "', currentTokenCount=");
        return ff$$ExternalSyntheticOutline0.m(dA, ")", sbM);
    }

    public final double a(long j) {
        double d = this.e;
        double d2 = j - this.d;
        int i = this.b;
        if (i < 1) {
            i = 1;
        }
        double d3 = (d2 / ((double) i)) / 1000.0d;
        int i2 = this.a;
        return Math.min(d3 + d, i2 >= 1 ? i2 : 1);
    }

    public final void a(final int i, final int i2) {
        if (i < 1 || i2 < 1) {
            return;
        }
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.gg$$ExternalSyntheticLambda0
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return gg.b(i, i2);
            }
        }, 6, (Object) null);
    }
}
