package o;

import com.google.android.gms.common.zzo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetTvSatellitecp implements Callable {
    public final /* synthetic */ accessgetTvSatelliteCscp IconCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ boolean serializer;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.serializer;
        String str = this.read;
        accessgetTvSatelliteCscp accessgettvsatellitecscp = this.IconCompatParcelizer;
        String str2 = (z || !zzo.zzf(str, accessgettvsatellitecscp, true, false).RemoteActionCompatParcelizer) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(messageDigest);
        byte[] bArrDigest = messageDigest.digest(accessgettvsatellitecscp.read);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = accessgetTvInputVga1cp.RemoteActionCompatParcelizer;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }

    public /* synthetic */ accessgetTvSatellitecp(boolean z, String str, accessgetTvSatelliteCscp accessgettvsatellitecscp) {
        this.serializer = z;
        this.read = str;
        this.IconCompatParcelizer = accessgettvsatellitecscp;
    }
}
