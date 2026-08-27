package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY {
    public static final r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY read;
    public final String[] IconCompatParcelizer;
    public final String[] RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final boolean write;

    static {
        r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI[] r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr = {r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_CHACHA20_POLY1305_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_RSA_WITH_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_RSA_WITH_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_RSA_WITH_AES_128_CBC_SHA, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_RSA_WITH_AES_256_CBC_SHA, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM r8lambdadub55uayvsb0x6jhq2bbhcsccgm = new r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM(true);
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer(r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr);
        r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M r8lambdavsago_uwvhihuj_4tmd5_spc5m = r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.TLS_1_3;
        r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M r8lambdavsago_uwvhihuj_4tmd5_spc5m2 = r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.TLS_1_2;
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer(r8lambdavsago_uwvhihuj_4tmd5_spc5m, r8lambdavsago_uwvhihuj_4tmd5_spc5m2);
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.IconCompatParcelizer = true;
        r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny = new r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY(r8lambdadub55uayvsb0x6jhq2bbhcsccgm);
        read = r8lambdayjdq0ic3o_lbr72bnjjtmnwny;
        r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M[] r8lambdavsago_uwvhihuj_4tmd5_spc5mArr = {r8lambdavsago_uwvhihuj_4tmd5_spc5m, r8lambdavsago_uwvhihuj_4tmd5_spc5m2, r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.TLS_1_1, r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.TLS_1_0};
        boolean z = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.write;
        if (!z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS versions for cleartext connections");
            return;
        }
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            strArr[i] = r8lambdavsago_uwvhihuj_4tmd5_spc5mArr[i].javaName;
        }
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS extensions for cleartext connections");
    }

    public r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY(r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM r8lambdadub55uayvsb0x6jhq2bbhcsccgm) {
        this.write = r8lambdadub55uayvsb0x6jhq2bbhcsccgm.write;
        this.IconCompatParcelizer = r8lambdadub55uayvsb0x6jhq2bbhcsccgm.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer;
        this.serializer = r8lambdadub55uayvsb0x6jhq2bbhcsccgm.IconCompatParcelizer;
    }

    public final int hashCode() {
        if (!this.write) {
            return 17;
        }
        int iHashCode = Arrays.hashCode(this.IconCompatParcelizer);
        return ((((iHashCode + 527) * 31) + Arrays.hashCode(this.RemoteActionCompatParcelizer)) * 31) + (!this.serializer ? 1 : 0);
    }

    public final String toString() {
        List listUnmodifiableList;
        if (!this.write) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.IconCompatParcelizer;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI[] r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr = new r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr[i] = r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.forJavaName(strArr[i]);
            }
            String[] strArr2 = r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.IconCompatParcelizer;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr.clone()));
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.RemoteActionCompatParcelizer;
        r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M[] r8lambdavsago_uwvhihuj_4tmd5_spc5mArr = new r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            r8lambdavsago_uwvhihuj_4tmd5_spc5mArr[i2] = r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.forJavaName(strArr3[i2]);
        }
        String[] strArr4 = r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.IconCompatParcelizer;
        sbM.append(Collections.unmodifiableList(Arrays.asList((Object[]) r8lambdavsago_uwvhihuj_4tmd5_spc5mArr.clone())));
        sbM.append(", supportsTlsExtensions=");
        return ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny = (r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY) obj;
        boolean z = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.write;
        boolean z2 = this.write;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.IconCompatParcelizer, r8lambdayjdq0ic3o_lbr72bnjjtmnwny.IconCompatParcelizer) && Arrays.equals(this.RemoteActionCompatParcelizer, r8lambdayjdq0ic3o_lbr72bnjjtmnwny.RemoteActionCompatParcelizer) && this.serializer == r8lambdayjdq0ic3o_lbr72bnjjtmnwny.serializer;
        }
        return true;
    }
}
