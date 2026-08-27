package o;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.oss.licenses.zzh;
import com.google.android.gms.tasks.zzw;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnPlaced {
    public static getOnPlaced read;
    public OnPlacedElement IconCompatParcelizer;
    public final Context write;

    public final String write(String str) {
        try {
            OnPlacedElement onPlacedElement = this.IconCompatParcelizer;
            zzw zzwVar = onPlacedElement.read(0, new zzh(onPlacedElement, str));
            forceRecomposeChildren forcerecomposechildren = new forceRecomposeChildren();
            forcerecomposechildren.write = zzwVar;
            zzwVar.addOnCompleteListener(setActive.INSTANCE, new PinnableContainerKtLocalPinnableContainer1(8, forcerecomposechildren));
            return (String) forcerecomposechildren.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            SentryLogcatAdapter.write("OssLicenses", "Failed to get package name from OssLicensesClient", e);
            return str;
        }
    }

    public getOnPlaced(Context context) {
        this.write = context.getApplicationContext();
    }

    public static OnPlacedModifier RemoteActionCompatParcelizer(Context context, String str) {
        try {
            return new OnPlacedModifier(context.getPackageManager().getResourcesForApplication(str), str);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
            sb.append("Unable to get resources for ");
            sb.append(str);
            sb.append(", using local resources.");
            SentryLogcatAdapter.IconCompatParcelizer("OssLicenses", sb.toString());
            return new OnPlacedModifier(context.getResources(), context.getPackageName());
        }
    }

    public static getOnPlaced IconCompatParcelizer(Context context) {
        if (read == null) {
            getOnPlaced getonplaced = new getOnPlaced(context);
            read = getonplaced;
            getonplaced.IconCompatParcelizer = new OnPlacedElement(getonplaced.write, null, OnPlacedElement.IconCompatParcelizer, null, accessgetNumPad8cp.IconCompatParcelizer);
        }
        return read;
    }
}
