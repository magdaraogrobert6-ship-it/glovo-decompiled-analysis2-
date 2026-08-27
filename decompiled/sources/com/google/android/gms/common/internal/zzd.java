package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import io.sentry.android.core.SentryLogcatAdapter;
import o.accessgetSpacebarcp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetSystemNavigationRightcp;
import o.getButton11EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends com.google.android.gms.internal.common.zzb {
    public final int IconCompatParcelizer;
    public BaseGmsClient RemoteActionCompatParcelizer;

    public zzd(BaseGmsClient baseGmsClient, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.RemoteActionCompatParcelizer = baseGmsClient;
        this.IconCompatParcelizer = i;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) getButton11EK5gGoQ.read(parcel, Bundle.CREATOR);
            getButton11EK5gGoQ.read(parcel);
            accessgetSystemNavigationDowncp.serializer(this.RemoteActionCompatParcelizer, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient = this.RemoteActionCompatParcelizer;
            int i3 = this.IconCompatParcelizer;
            baseGmsClient.getClass();
            accessgetSystemNavigationRightcp accessgetsystemnavigationrightcp = new accessgetSystemNavigationRightcp(baseGmsClient, i2, strongBinder, bundle);
            zzb zzbVar = baseGmsClient.MediaDescriptionCompat;
            zzbVar.sendMessage(zzbVar.obtainMessage(1, i3, -1, accessgetsystemnavigationrightcp));
            this.RemoteActionCompatParcelizer = null;
        } else if (i == 2) {
            parcel.readInt();
            getButton11EK5gGoQ.read(parcel);
            SentryLogcatAdapter.IconCompatParcelizer("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) getButton11EK5gGoQ.read(parcel, zzj.CREATOR);
            getButton11EK5gGoQ.read(parcel);
            BaseGmsClient baseGmsClient2 = this.RemoteActionCompatParcelizer;
            accessgetSystemNavigationDowncp.serializer(baseGmsClient2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            accessgetSystemNavigationDowncp.IconCompatParcelizer(zzjVar);
            baseGmsClient2.MediaSessionCompatQueueItem = zzjVar;
            if (baseGmsClient2.ResultReceiver()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.serializer;
                accessgetSpacebarcp accessgetspacebarcpIconCompatParcelizer = accessgetSpacebarcp.IconCompatParcelizer();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.IconCompatParcelizer;
                synchronized (accessgetspacebarcpIconCompatParcelizer) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = accessgetSpacebarcp.IconCompatParcelizer;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) accessgetspacebarcpIconCompatParcelizer.read;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.write < rootTelemetryConfiguration.write) {
                            }
                        }
                        accessgetspacebarcpIconCompatParcelizer.read = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzjVar.RemoteActionCompatParcelizer;
            accessgetSystemNavigationDowncp.serializer(this.RemoteActionCompatParcelizer, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient3 = this.RemoteActionCompatParcelizer;
            int i5 = this.IconCompatParcelizer;
            baseGmsClient3.getClass();
            accessgetSystemNavigationRightcp accessgetsystemnavigationrightcp2 = new accessgetSystemNavigationRightcp(baseGmsClient3, i4, strongBinder2, bundle2);
            zzb zzbVar2 = baseGmsClient3.MediaDescriptionCompat;
            zzbVar2.sendMessage(zzbVar2.obtainMessage(1, i5, -1, accessgetsystemnavigationrightcp2));
            this.RemoteActionCompatParcelizer = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
