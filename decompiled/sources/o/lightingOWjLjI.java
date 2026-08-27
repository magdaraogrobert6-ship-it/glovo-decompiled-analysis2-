package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.IllegalFormatException;

/* JADX INFO: loaded from: classes.dex */
public final class lightingOWjLjI {
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public String write;

    public lightingOWjLjI(String str) {
        this.write = af$$ExternalSyntheticOutline0.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String IconCompatParcelizer(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(java.util.Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                SentryLogcatAdapter.read("PlayCore", "Unable to format ".concat(str2), e);
                str2 = m1$$ExternalSyntheticOutline0.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return af$$ExternalSyntheticOutline0.m(str, " : ", str2);
    }

    public void write(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            IconCompatParcelizer(this.write, str, objArr);
        }
    }

    public String toString() {
        boolean zContainsAlias;
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
        String str = this.write;
        sb.append(str);
        sb.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            zContainsAlias = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            zContainsAlias = false;
        }
        return ff$$ExternalSyntheticOutline0.m(sb, zContainsAlias, "}");
    }

    public /* synthetic */ lightingOWjLjI() {
    }

    public lightingOWjLjI(String str, Object obj) {
        this.write = str;
    }
}
