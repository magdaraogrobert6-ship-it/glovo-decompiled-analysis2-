package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.appupdate.internal.zzx;
import io.sentry.android.core.SentryLogcatAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getMaximumhdzbrEE {
    public final getSourceValueInsetshdzbrEE MediaBrowserCompatMediaItem;
    public final zzx RemoteActionCompatParcelizer;
    public final String serializer;
    public final Context write;
    public static final lightingOWjLjI read = new lightingOWjLjI("AppUpdateService");
    public static final Intent IconCompatParcelizer = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    public static Bundle RemoteActionCompatParcelizer(getMaximumhdzbrEE getmaximumhdzbree, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        Map mapSerializer = WindowInsetsRulers_androidKt.serializer();
        bundle3.putInt("playcore_version_code", ((Integer) mapSerializer.get("java")).intValue());
        if (mapSerializer.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) mapSerializer.get("native")).intValue());
        }
        if (mapSerializer.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) mapSerializer.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(getmaximumhdzbree.write.getPackageManager().getPackageInfo(getmaximumhdzbree.write.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            lightingOWjLjI lightingowjlji = read;
            lightingowjlji.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                SentryLogcatAdapter.serializer("PlayCore", lightingOWjLjI.IconCompatParcelizer(lightingowjlji.write, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    public getMaximumhdzbrEE(Context context, getSourceValueInsetshdzbrEE getsourcevalueinsetshdzbree) {
        String strEncodeToString;
        this.serializer = context.getPackageName();
        this.write = context;
        this.MediaBrowserCompatMediaItem = getsourcevalueinsetshdzbree;
        lightingOWjLjI lightingowjlji = getMandatorySystemGestures.read;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    lightingOWjLjI lightingowjlji2 = getMandatorySystemGestures.read;
                    Object[] objArr = new Object[0];
                    lightingowjlji2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        SentryLogcatAdapter.IconCompatParcelizer("PlayCore", lightingOWjLjI.IconCompatParcelizer(lightingowjlji2.write, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.RemoteActionCompatParcelizer = new zzx(applicationContext != null ? applicationContext : context, read, IconCompatParcelizer);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
