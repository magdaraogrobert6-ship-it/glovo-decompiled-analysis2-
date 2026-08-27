package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.io.IOException;
import java.util.HashMap;
import o.accessgetMediaStopcp;
import o.accessgetMediaTopMenucp;
import o.accessgetNumPad3cp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvAudioDescriptionMixingVolumeUpcp;
import o.accessgetYencp;
import o.accessgetZcp;
import o.accessgetZoomIncp;
import o.getKeyCode;

/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdClient {
    accessgetNumPad3cp zza;
    accessgetZcp zzb;
    boolean zzc;
    final Object zzd;
    accessgetMediaStopcp zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    private final Info zzd(int i) throws IOException {
        Info info;
        accessgetSystemNavigationDowncp.IconCompatParcelizer("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                accessgetSystemNavigationDowncp.IconCompatParcelizer(this.zza);
                accessgetSystemNavigationDowncp.IconCompatParcelizer(this.zzb);
                getKeyCode getkeycode = (getKeyCode) this.zzb;
                getkeycode.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                Parcel parcelIconCompatParcelizer = getkeycode.IconCompatParcelizer(1, parcelObtain);
                String string = parcelIconCompatParcelizer.readString();
                parcelIconCompatParcelizer.recycle();
                getKeyCode getkeycode2 = (getKeyCode) this.zzb;
                getkeycode2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = accessgetYencp.RemoteActionCompatParcelizer;
                parcelObtain2.writeInt(1);
                Parcel parcelIconCompatParcelizer2 = getkeycode2.IconCompatParcelizer(2, parcelObtain2);
                if (parcelIconCompatParcelizer2.readInt() != 0) {
                }
                parcelIconCompatParcelizer2.recycle();
                info = new Info(string, z);
            } else {
                synchronized (this.zzd) {
                    accessgetMediaStopcp accessgetmediastopcp = this.zze;
                    if (accessgetmediastopcp == null || !accessgetmediastopcp.serializer) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(this.zza);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(this.zzb);
                    try {
                        getKeyCode getkeycode3 = (getKeyCode) this.zzb;
                        getkeycode3.getClass();
                        Parcel parcelObtain3 = Parcel.obtain();
                        parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelIconCompatParcelizer3 = getkeycode3.IconCompatParcelizer(1, parcelObtain3);
                        String string2 = parcelIconCompatParcelizer3.readString();
                        parcelIconCompatParcelizer3.recycle();
                        getKeyCode getkeycode4 = (getKeyCode) this.zzb;
                        getkeycode4.getClass();
                        Parcel parcelObtain4 = Parcel.obtain();
                        parcelObtain4.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        int i3 = accessgetYencp.RemoteActionCompatParcelizer;
                        parcelObtain4.writeInt(1);
                        Parcel parcelIconCompatParcelizer4 = getkeycode4.IconCompatParcelizer(2, parcelObtain4);
                        boolean z = parcelIconCompatParcelizer4.readInt() != 0;
                        parcelIconCompatParcelizer4.recycle();
                        info = new Info(string2, z);
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            throw th;
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            accessgetMediaStopcp accessgetmediastopcp = this.zze;
            if (accessgetmediastopcp != null) {
                accessgetmediastopcp.write.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new accessgetMediaStopcp(this, j);
            }
        }
    }

    public final void zza() {
        accessgetSystemNavigationDowncp.IconCompatParcelizer("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg == null || this.zza == null) {
                return;
            }
            try {
                if (this.zzc) {
                    accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().IconCompatParcelizer(this.zzg, this.zza);
                }
            } catch (Throwable unused) {
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    public final void zzb(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        accessgetSystemNavigationDowncp.IconCompatParcelizer("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                accessgetNumPad3cp accessgetnumpad3cp = new accessgetNumPad3cp();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().read(context, intent, accessgetnumpad3cp, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.zza = accessgetnumpad3cp;
                    try {
                        IBinder iBinderIconCompatParcelizer = accessgetnumpad3cp.IconCompatParcelizer();
                        int i = accessgetZoomIncp.write;
                        IInterface iInterfaceQueryLocalInterface = iBinderIconCompatParcelizer.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.zzb = iInterfaceQueryLocalInterface instanceof accessgetZcp ? (accessgetZcp) iInterfaceQueryLocalInterface : new getKeyCode(iBinderIconCompatParcelizer);
                        this.zzc = true;
                        if (z) {
                            zze();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } catch (Throwable th2) {
                    throw new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException();
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            return infoZzd;
        } catch (Throwable th) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            accessgetSystemNavigationDowncp.IconCompatParcelizer("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        accessgetMediaStopcp accessgetmediastopcp = advertisingIdClient.zze;
                        if (accessgetmediastopcp == null || !accessgetmediastopcp.serializer) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(advertisingIdClient.zza);
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(advertisingIdClient.zzb);
                        try {
                            getKeyCode getkeycode = (getKeyCode) advertisingIdClient.zzb;
                            getkeycode.getClass();
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            Parcel parcelIconCompatParcelizer = getkeycode.IconCompatParcelizer(6, parcelObtain);
                            int i = accessgetYencp.RemoteActionCompatParcelizer;
                            z = parcelIconCompatParcelizer.readInt() != 0;
                            parcelIconCompatParcelizer.recycle();
                        } catch (RemoteException unused) {
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                } else {
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(advertisingIdClient.zza);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(advertisingIdClient.zzb);
                    getKeyCode getkeycode2 = (getKeyCode) advertisingIdClient.zzb;
                    getkeycode2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelIconCompatParcelizer2 = getkeycode2.IconCompatParcelizer(6, parcelObtain2);
                    int i2 = accessgetYencp.RemoteActionCompatParcelizer;
                    if (parcelIconCompatParcelizer2.readInt() != 0) {
                    }
                    parcelIconCompatParcelizer2.recycle();
                }
                throw th;
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return z;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public final boolean zzc(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put(FWFConstants.EXPLANATION_TYPE_ERROR, th.getClass().getName());
        }
        map.put(RemoteMessageConst.Notification.TAG, "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new accessgetMediaTopMenucp(map).start();
        return true;
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }
}
