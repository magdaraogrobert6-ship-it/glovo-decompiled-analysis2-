package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setNextChildPlaceOrderui {
    public final byte[] RemoteActionCompatParcelizer;

    public static setNextChildPlaceOrderui IconCompatParcelizer(byte[] bArr) {
        if (bArr != null) {
            return new setNextChildPlaceOrderui(bArr, bArr.length);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("data must be non-null");
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.RemoteActionCompatParcelizer);
    }

    public setNextChildPlaceOrderui(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.RemoteActionCompatParcelizer = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public final String toString() {
        return "Bytes(" + TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer) + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setNextChildPlaceOrderui) {
            return Arrays.equals(((setNextChildPlaceOrderui) obj).RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
