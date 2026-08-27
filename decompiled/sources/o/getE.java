package o;

import android.os.Handler;
import android.os.Looper;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class getE extends ThreadLocal {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getE(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.IconCompatParcelizer) {
            case 0:
                return new android.graphics.PathMeasure();
            case 1:
                return new SimpleDateFormat("yyyy:MM:dd", java.util.Locale.US);
            case 2:
                return new SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
            case 3:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
            case 4:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();
                }
                if (Looper.myLooper() != null) {
                    return new ReportedVideoQualityNotSupportedQuirk(new Handler(Looper.myLooper()));
                }
                return null;
            case 5:
                return new android.graphics.Path();
            case 6:
                return new android.graphics.Path();
            case 7:
                return new float[4];
            case 8:
                return Boolean.FALSE;
            case 9:
                try {
                    return (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
                    return null;
                }
            case 10:
                try {
                    return (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e2) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e2);
                    return null;
                }
            case 11:
                try {
                    return (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e3);
                    return null;
                }
            case 12:
                try {
                    return (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e4) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e4);
                    return null;
                }
            case 13:
                return new HashMap(0);
            case 14:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaSessionCompatResultReceiverWrapper);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
