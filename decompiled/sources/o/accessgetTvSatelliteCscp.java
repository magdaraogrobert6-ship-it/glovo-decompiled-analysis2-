package o;

import com.google.android.gms.common.zzj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvSatelliteCscp extends zzj {
    public final byte[] read;

    @Override // com.google.android.gms.common.zzj
    public final byte[] write() {
        return this.read;
    }

    public accessgetTvSatelliteCscp(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.read = bArr;
    }
}
