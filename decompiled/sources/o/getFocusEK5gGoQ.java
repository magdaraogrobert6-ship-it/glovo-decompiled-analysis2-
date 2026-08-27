package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getFocusEK5gGoQ implements rotateRad0AR0LA0, DelegatingNode {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Context write;

    public /* synthetic */ getFocusEK5gGoQ(Context context, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = context;
    }

    @Override // o.rotateRad0AR0LA0
    public Object B_() {
        DelegatableNode_androidKt visitsubtreeifyykmhodefault;
        DelegatableNode_androidKt visitsubtreeifyykmhodefault2;
        if (this.RemoteActionCompatParcelizer == 1) {
            return (ConnectivityManager) this.write.getSystemService("connectivity");
        }
        Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
        Context contextCreateDeviceProtectedStorageContext = this.write;
        DelegatableNode_androidKt delegatableNode_androidKt = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.MediaSessionCompatResultReceiverWrapper;
        if (delegatableNode_androidKt == null) {
            synchronized (r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.class) {
                delegatableNode_androidKt = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.MediaSessionCompatResultReceiverWrapper;
                if (delegatableNode_androidKt == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    ImageKt imageKt = getTypeZmokQxo.IconCompatParcelizer;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                visitsubtreeifyykmhodefault = file.exists() ? new visitSubtreeIfYYKmhodefault(file) : visitChildrenYYKmho.read;
                            } catch (RuntimeException e) {
                                SentryLogcatAdapter.read("HermeticFileOverrides", "no data dir", e);
                                visitsubtreeifyykmhodefault = visitChildrenYYKmho.read;
                            }
                            if (visitsubtreeifyykmhodefault.IconCompatParcelizer()) {
                                File file2 = (File) visitsubtreeifyykmhodefault.read();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getActiveFocusTargetNode.write(file2, new FileInputStream(file2))));
                                    try {
                                        processDragGesture processdraggesture = new processDragGesture(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                SentryLogcatAdapter.serializer("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                processDragGesture processdraggesture2 = (processDragGesture) processdraggesture.get(str3);
                                                if (processdraggesture2 == null) {
                                                    processdraggesture2 = new processDragGesture(0);
                                                    processdraggesture.put(str3, processdraggesture2);
                                                }
                                                processdraggesture2.put(strDecode, strDecode2);
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        SentryLogcatAdapter.IconCompatParcelizer("HermeticFileOverrides", sb2.toString());
                                        getUnknownCS__XNY getunknowncs__xny = new getUnknownCS__XNY(processdraggesture);
                                        bufferedReader.close();
                                        visitsubtreeifyykmhodefault2 = new visitSubtreeIfYYKmhodefault(getunknowncs__xny);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                visitsubtreeifyykmhodefault2 = visitChildrenYYKmho.read;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        visitsubtreeifyykmhodefault2 = visitChildrenYYKmho.read;
                    }
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.MediaSessionCompatResultReceiverWrapper = visitsubtreeifyykmhodefault2;
                    delegatableNode_androidKt = visitsubtreeifyykmhodefault2;
                }
            }
        }
        return delegatableNode_androidKt;
    }

    public PackageInfo read(int i, String str) {
        return this.write.getPackageManager().getPackageInfo(str, i);
    }

    public ApplicationInfo write(int i, String str) {
        return this.write.getPackageManager().getApplicationInfo(str, i);
    }

    public boolean write() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.write;
        if (callingUid != iMyUid) {
            String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return context.getPackageManager().isInstantApp(nameForUid);
            }
            return false;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        int iSerializer3 = isAppSetIdReadingEnabled.serializer();
        return ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[]{context}, iSerializer, iSerializer3, -2109582586)).booleanValue();
    }

    public io.sentry.transport.PlaybackStateCompat IconCompatParcelizer() {
        Context context = this.write;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        io.sentry.transport.PlaybackStateCompat playbackStateCompat = new io.sentry.transport.PlaybackStateCompat();
        playbackStateCompat.read = accessgetFocuscp.IconCompatParcelizer(accessgetEscapecp.RemoteActionCompatParcelizer);
        int i = 0;
        accessgetGuidecp accessgetguidecp = new accessgetGuidecp(i, context);
        playbackStateCompat.RemoteActionCompatParcelizer = accessgetguidecp;
        int i2 = 1;
        playbackStateCompat.write = accessgetFocuscp.IconCompatParcelizer(new accessgetFourcp(accessgetguidecp, new accessgetGuidecp(i2, accessgetguidecp), i));
        accessgetGuidecp accessgetguidecp2 = (accessgetGuidecp) playbackStateCompat.RemoteActionCompatParcelizer;
        playbackStateCompat.serializer = new accessgetMediaNextcp(accessgetguidecp2, i);
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer = accessgetFocuscp.IconCompatParcelizer(new accessgetFourcp((accessgetMediaNextcp) playbackStateCompat.serializer, accessgetFocuscp.IconCompatParcelizer(new accessgetMediaNextcp(accessgetguidecp2, i2)), i2));
        playbackStateCompat.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer;
        accessgetEnvelopecp accessgetenvelopecp = new accessgetEnvelopecp(i2);
        accessgetGuidecp accessgetguidecp3 = (accessgetGuidecp) playbackStateCompat.RemoteActionCompatParcelizer;
        accessgetF5cp accessgetf5cp = new accessgetF5cp(accessgetguidecp3, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer, accessgetenvelopecp, i2);
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = (r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) playbackStateCompat.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = (r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) playbackStateCompat.write;
        playbackStateCompat.RatingCompat = accessgetFocuscp.IconCompatParcelizer(new accessgetF5cp(new accessgetHomecp(r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktwlyipskq3tfa9ey3gatonixfq2, accessgetf5cp, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer), new accessgetLcp(accessgetguidecp3, r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer, accessgetf5cp, r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer), new accessgetKatakanaHiraganacp(r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer, accessgetf5cp, r8lambdaktwlyipskq3tfa9ey3gatonixfqIconCompatParcelizer), i));
        return playbackStateCompat;
    }

    public /* synthetic */ getFocusEK5gGoQ() {
        this.RemoteActionCompatParcelizer = 2;
    }
}
