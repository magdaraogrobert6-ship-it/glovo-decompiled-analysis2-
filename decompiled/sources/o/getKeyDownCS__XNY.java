package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getKeyDownCS__XNY {
    public static volatile DelegatableNode_androidKt write = visitChildrenYYKmho.read;
    public static final Object RemoteActionCompatParcelizer = new Object();

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x0035, B:14:0x003d, B:15:0x0049, B:17:0x004b, B:19:0x0057, B:23:0x0065, B:25:0x006d, B:32:0x0088, B:33:0x0093, B:27:0x0077, B:28:0x007b, B:29:0x0081), top: B:40:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    public static boolean read(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            SentryLogcatAdapter.serializer("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (write.IconCompatParcelizer()) {
            return ((Boolean) write.read()).booleanValue();
        }
        synchronized (RemoteActionCompatParcelizer) {
            if (write.IconCompatParcelizer()) {
                return ((Boolean) write.read()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                z = true;
            }
            write = new visitSubtreeIfYYKmhodefault(Boolean.valueOf(z));
            return ((Boolean) write.read()).booleanValue();
        }
    }
}
