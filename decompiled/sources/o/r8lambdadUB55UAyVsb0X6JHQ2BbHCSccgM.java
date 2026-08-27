package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM {
    public boolean IconCompatParcelizer;
    public String[] RemoteActionCompatParcelizer;
    public String[] serializer;
    public final boolean write;

    public r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM(r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny) {
        this.write = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.write;
        this.RemoteActionCompatParcelizer = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.IconCompatParcelizer;
        this.serializer = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.serializer;
    }

    public final void serializer(r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI... r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr) {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr.length];
        for (int i = 0; i < r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr.length; i++) {
            strArr[i] = r8lambdavk6ad2nc8jg9pwqi3uwiw6anogiArr[i].javaName;
        }
        this.RemoteActionCompatParcelizer = strArr;
    }

    public final void serializer(r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M... r8lambdavsago_uwvhihuj_4tmd5_spc5mArr) {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS versions for cleartext connections");
            return;
        }
        if (r8lambdavsago_uwvhihuj_4tmd5_spc5mArr.length == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[r8lambdavsago_uwvhihuj_4tmd5_spc5mArr.length];
        for (int i = 0; i < r8lambdavsago_uwvhihuj_4tmd5_spc5mArr.length; i++) {
            strArr[i] = r8lambdavsago_uwvhihuj_4tmd5_spc5mArr[i].javaName;
        }
        this.serializer = strArr;
    }

    public r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM(boolean z) {
        this.write = z;
    }
}
