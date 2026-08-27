package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public enum getKeyZmokQxo implements accessonPostFlingRZ2iAVYjd {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    private final int zzf;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    getKeyZmokQxo(int i) {
        this.zzf = i;
    }

    @Override // o.accessonPostFlingRZ2iAVYjd
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
        return 0;
    }
}
