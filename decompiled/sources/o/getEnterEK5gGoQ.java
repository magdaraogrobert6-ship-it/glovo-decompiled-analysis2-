package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes2.dex */
public final class getEnterEK5gGoQ implements getDirectionDownEK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Context serializer;

    public getEnterEK5gGoQ(Context context, int i) {
        this.IconCompatParcelizer = i;
        if (i == 3) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.serializer = context;
            return;
        }
        if (i == 4) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.serializer = context;
        } else if (i == 6) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.serializer = context;
        } else if (i != 7) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.serializer = context;
        } else {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.serializer = context;
        }
    }

    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        String networkOperatorName;
        getFunctionEK5gGoQ getfunctionek5ggoq;
        int i = this.IconCompatParcelizer;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        Context context = this.serializer;
        switch (i) {
            case 0:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return new getInfoEK5gGoQ(context.getPackageName());
            case 1:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                try {
                    PackageManager packageManager = context.getPackageManager();
                    return new getInfoEK5gGoQ(packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString());
                } catch (PackageManager.NameNotFoundException unused) {
                    return new getInfoEK5gGoQ("");
                }
            case 2:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                try {
                    return new getGEK5gGoQ(Double.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (PackageManager.NameNotFoundException e) {
                    getButtonThumbLeftEK5gGoQ.write("Package name " + context.getPackageName() + " not found. " + e.getMessage());
                    return gethelpek5ggoq;
                }
            case 3:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                try {
                    return new getInfoEK5gGoQ(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
                } catch (PackageManager.NameNotFoundException e2) {
                    getButtonThumbLeftEK5gGoQ.write("Package name " + context.getPackageName() + " not found. " + e2.toString());
                    return gethelpek5ggoq;
                }
            case 4:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? gethelpek5ggoq : new getInfoEK5gGoQ(networkOperatorName);
            case 5:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                return new getInfoEK5gGoQ(string != null ? string : "");
            case 6:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                String strIconCompatParcelizer = getButtonR2EK5gGoQ.IconCompatParcelizer(context, (getfunctionek5ggoqArr.length <= 0 || (getfunctionek5ggoq = getfunctionek5ggoqArr[0]) == gethelpek5ggoq) ? null : LoadBalancer$Helper.IconCompatParcelizer(androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoq)));
                return strIconCompatParcelizer != null ? new getInfoEK5gGoQ(strIconCompatParcelizer) : gethelpek5ggoq;
            default:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                return string2 != null ? new getInfoEK5gGoQ(string2) : gethelpek5ggoq;
        }
    }

    public /* synthetic */ getEnterEK5gGoQ(Context context, int i, boolean z) {
        this.IconCompatParcelizer = i;
        this.serializer = context;
    }
}
