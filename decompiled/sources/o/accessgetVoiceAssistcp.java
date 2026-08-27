package o;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetVoiceAssistcp extends ThreadLocal {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            try {
                return (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                return null;
            }
        }
        if (i == 2) {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
        if (i == 3) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(java.util.Locale.ROOT));
        }
        if (i == 4) {
            return new io.sentry.util.ParcelableVolumeInfo();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(setWebViewContent.RemoteActionCompatParcelizer);
        return simpleDateFormat;
    }
}
