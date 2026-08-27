package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzjs;
import io.grpc.Status;
import io.sentry.SentryClient;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdapbG_fqEcit8CH1waoNmDxLhROlU implements Runnable {
    public static int MediaBrowserCompatMediaItem;
    public static int RatingCompat;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int serializer;
    public final Object write;

    public r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(Context context, getExponentimpl getexponentimpl, getF4EK5gGoQ getf4ek5ggoq) {
        this.serializer = 1;
        setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default = new setRoundRectOutlineTNW_H78default(10);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        this.read = context;
        this.IconCompatParcelizer = getf4ek5ggoq;
        this.write = getexponentimpl;
        this.RemoteActionCompatParcelizer = setroundrectoutlinetnw_h78default;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.write;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        Object obj4 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) obj4;
            replaceprefetchedurlswithlocalassetslambda1.ParcelableVolumeInfo = true;
            replaceprefetchedurlswithlocalassetslambda1.ComponentActivity.serializer((Status) obj3, (r8lambdacIxdbs1VMz7DJpiM5hikhHgartg) obj2, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) obj);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((isValidLogPurchaseInputlambda0) obj4).write.serializer((Status) obj3, (r8lambdacIxdbs1VMz7DJpiM5hikhHgartg) obj2, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) obj);
                return;
            } else {
                ((r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q) obj4).RemoteActionCompatParcelizer((Status) obj3, (r8lambdacIxdbs1VMz7DJpiM5hikhHgartg) obj2, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) obj);
                return;
            }
        }
        getF4EK5gGoQ getf4ek5ggoq = (getF4EK5gGoQ) obj2;
        Context context = (Context) obj3;
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0) {
            getButtonThumbLeftEK5gGoQ.write("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
        } else if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                zzbv zzbvVar = new zzbv(5);
                InputStream inputStreamRemoteActionCompatParcelizer = null;
                zzbvVar.RemoteActionCompatParcelizer = null;
                try {
                    SentryClient sentryClient = (SentryClient) ((getExponentimpl) obj).read;
                    ((setRoundRectOutlineTNW_H78default) obj4).getClass();
                    String strSerializer = setRoundRectOutlineTNW_H78default.serializer(sentryClient);
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    try {
                        try {
                            inputStreamRemoteActionCompatParcelizer = zzbvVar.RemoteActionCompatParcelizer(strSerializer);
                        } catch (zzjs unused) {
                            getButtonThumbLeftEK5gGoQ.write("NetworkLoader: Error when loading resource for url: ".concat(strSerializer));
                            getf4ek5ggoq.serializer(3, 0);
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                            while (true) {
                                int i2 = inputStreamRemoteActionCompatParcelizer.read(bArr, 0, androidx.compose.ui.graphics.Fields.RotationZ);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            }
                            getf4ek5ggoq.read(byteArrayOutputStream.toByteArray());
                        } catch (IOException e) {
                            getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("NetworkLoader: Error when parsing downloaded resources from url: " + strSerializer + " " + e.getMessage(), e);
                            getf4ek5ggoq.serializer(2, 0);
                        }
                    } catch (FileNotFoundException unused2) {
                        getButtonThumbLeftEK5gGoQ.write("NetworkLoader: No data was retrieved from the given url: ".concat(strSerializer));
                        getf4ek5ggoq.serializer(2, 0);
                    } catch (IOException e2) {
                        getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("NetworkLoader: Error when loading resource from url: " + strSerializer + " " + e2.getMessage(), e2);
                        getf4ek5ggoq.serializer(1, 0);
                    }
                    return;
                } finally {
                    zzbvVar.MediaDescriptionCompat();
                }
            }
            getButtonThumbLeftEK5gGoQ.serializer("No network connectivity - Offline");
        } else {
            getButtonThumbLeftEK5gGoQ.write("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
        }
        getf4ek5ggoq.serializer(0, 0);
    }

    public /* synthetic */ r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(Object obj, Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = status;
        this.IconCompatParcelizer = r8lambdacixdbs1vmz7djpim5hikhhgartg;
        this.write = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
    }

    public static int write() {
        int i = RatingCompat;
        int i2 = i % 5314938;
        RatingCompat = i + 1;
        if (i2 != 0) {
            return MediaBrowserCompatMediaItem;
        }
        int iNextInt = new Random().nextInt();
        MediaBrowserCompatMediaItem = iNextInt;
        return iNextInt;
    }
}
