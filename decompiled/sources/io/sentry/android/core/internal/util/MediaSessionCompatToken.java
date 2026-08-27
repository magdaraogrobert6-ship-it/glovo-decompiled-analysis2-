package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.adjust.sdk.Constants;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatToken {
    public static final Charset serializer = Charset.forName(Constants.ENCODING);
    public final String[] IconCompatParcelizer;
    public final String[] MediaBrowserCompatMediaItem;
    public final Runtime MediaDescriptionCompat;
    public final BrazeActionParserExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ read;
    public final Context write;

    /* JADX INFO: Removed unreachable split cross block B:59:0x00bc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    public final boolean IconCompatParcelizer() {
        Process process;
        ?? r2;
        this.read.getClass();
        String str = Build.TAGS;
        boolean z = true;
        if (str == null || !str.contains("test-keys")) {
            String[] strArr = this.IconCompatParcelizer;
            int length = strArr.length;
            int i = 0;
            while (true) {
                BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
                if (i < length) {
                    String str2 = strArr[i];
                    try {
                        if (new File(str2).exists()) {
                            break;
                        }
                        i++;
                    } catch (RuntimeException e) {
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error when trying to check if root file %s exists.", str2);
                    }
                } else {
                    ?? r3 = 0;
                    processExec = null;
                    Process processExec = null;
                    try {
                        try {
                            processExec = this.MediaDescriptionCompat.exec(new String[]{"/system/xbin/which", "su"});
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), serializer));
                            try {
                                boolean z2 = bufferedReader.readLine() != null;
                                bufferedReader.close();
                                processExec.destroy();
                                r2 = processExec;
                                if (!z2) {
                                    setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "The ILogger object is required.");
                                    ?? packageManager = this.write.getPackageManager();
                                    if (packageManager != 0) {
                                        r2 = this.MediaBrowserCompatMediaItem;
                                        for (?? r6 : r2) {
                                            try {
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    packageManager.getPackageInfo(r6, PackageManager.PackageInfoFlags.of(0L));
                                                    r3 = r2;
                                                } else {
                                                    packageManager.getPackageInfo(r6, 0);
                                                    r3 = r2;
                                                }
                                            } catch (PackageManager.NameNotFoundException unused) {
                                            }
                                        }
                                        z = false;
                                        r3 = r2;
                                    } else {
                                        z = false;
                                        r3 = r2;
                                    }
                                    break;
                                }
                                break;
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (r3 != 0) {
                                r3.destroy();
                            }
                            throw th3;
                        }
                    } catch (IOException unused2) {
                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SU isn't found on this Device.", new Object[0]);
                        r2 = processExec;
                        process = processExec;
                        if (processExec != null) {
                            process.destroy();
                            r2 = process;
                        }
                    } catch (Throwable th4) {
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Error when trying to check if SU exists.", th4);
                        r2 = processExec;
                        if (processExec != null) {
                            process = processExec;
                            process.destroy();
                            r2 = process;
                        }
                    }
                }
            }
        }
        return z;
    }

    public MediaSessionCompatToken(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        Runtime runtime = Runtime.getRuntime();
        this.write = context;
        setNativeShader.read(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, "The BuildInfoProvider is required.");
        this.read = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "The Logger is required.");
        this.RemoteActionCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.IconCompatParcelizer = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.MediaBrowserCompatMediaItem = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        setNativeShader.read(runtime, "The Runtime is required.");
        this.MediaDescriptionCompat = runtime;
    }
}
