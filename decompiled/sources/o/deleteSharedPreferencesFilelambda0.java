package o;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class deleteSharedPreferencesFilelambda0 {
    public static final downloadFileToPath Companion = new downloadFileToPath();
    public final int a;
    public final int b;

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteSharedPreferencesFilelambda0)) {
            return false;
        }
        deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda0 = (deleteSharedPreferencesFilelambda0) obj;
        return this.a == deletesharedpreferencesfilelambda0.a && this.b == deletesharedpreferencesfilelambda0.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalTime(hour=");
        sb.append(this.a);
        sb.append(", minute=");
        return af$$ExternalSyntheticOutline0.m(sb, this.b, ')');
    }

    public deleteSharedPreferencesFilelambda0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
