package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzo;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Objects;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadEntercp;
import o.accessgetScp;
import o.getMinusEK5gGoQ;
import o.getNavigateInEK5gGoQ;
import o.getNavigateNextEK5gGoQ;
import o.getNavigateOutEK5gGoQ;
import o.getNavigatePreviousEK5gGoQ;
import o.getNumPad1EK5gGoQ;
import o.getNumPad2EK5gGoQ;
import o.getNumPadDeleteEK5gGoQ;
import o.processDragGesture;
import o.scale0AR0LA0default;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdz extends accessgetScp {
    public final processDragGesture r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final processDragGesture r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final processDragGesture write;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] MediaMetadataCompat() {
        return zzo.zzp;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean ResultReceiver() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 11717000;
    }

    public final void IconCompatParcelizer(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) throws RemoteException {
        if (IconCompatParcelizer(zzo.zzn)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls);
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, geofencingRequest);
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
            parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
            getnumpaddeleteek5ggoq.zzc(97, parcelZza);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        zzdg zzdgVar = new zzdg(0, parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, geofencingRequest);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, pendingIntent);
        parcelZza2.writeStrongBinder(zzdgVar.asBinder());
        getnumpaddeleteek5ggoq2.zzc(57, parcelZza2);
    }

    public final void IconCompatParcelizer(LastLocationRequest lastLocationRequest, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        if (IconCompatParcelizer(zzo.zzj)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            zzee zzeeVar = new zzee(4, null, new getNavigateOutEK5gGoQ(parentDataModifierDefaultImpls), null, null);
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, lastLocationRequest);
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
            getnumpaddeleteek5ggoq.zzc(90, parcelZza);
            return;
        }
        if (!IconCompatParcelizer(zzo.zzf)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZzb = getnumpaddeleteek5ggoq2.zzb(7, getnumpaddeleteek5ggoq2.zza());
            Location location = (Location) getMinusEK5gGoQ.read(parcelZzb, Location.CREATOR);
            parcelZzb.recycle();
            parentDataModifierDefaultImpls.IconCompatParcelizer(location);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq3 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        getNavigateOutEK5gGoQ getnavigateoutek5ggoq = new getNavigateOutEK5gGoQ(parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq3.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, lastLocationRequest);
        parcelZza2.writeStrongBinder(getnavigateoutek5ggoq.asBinder());
        getnumpaddeleteek5ggoq3.zzc(82, parcelZza2);
    }

    public final void IconCompatParcelizer(scale0AR0LA0default scale0ar0la0default, DeviceOrientationRequest deviceOrientationRequest, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) scale0ar0la0default.RemoteActionCompatParcelizer;
        Objects.requireNonNull(accessgetnumpadentercp);
        synchronized (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            getNavigateNextEK5gGoQ getnavigatenextek5ggoq = (getNavigateNextEK5gGoQ) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.get(accessgetnumpadentercp);
            if (getnavigatenextek5ggoq == null) {
                getnavigatenextek5ggoq = new getNavigateNextEK5gGoQ(scale0ar0la0default);
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.put(accessgetnumpadentercp, getnavigatenextek5ggoq);
            } else {
                getnavigatenextek5ggoq.read(scale0ar0la0default);
            }
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            zzj zzjVar = new zzj(1, new zzh(deviceOrientationRequest, zzh.write, null), getnavigatenextek5ggoq, new zzdd(null, parentDataModifierDefaultImpls));
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzjVar);
            getnumpaddeleteek5ggoq.zzc(75, parcelZza);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void RemoteActionCompatParcelizer(accessgetNumPadEntercp accessgetnumpadentercp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        synchronized (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            getNavigateNextEK5gGoQ getnavigatenextek5ggoq = (getNavigateNextEK5gGoQ) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.remove(accessgetnumpadentercp);
            if (getnavigatenextek5ggoq == null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.FALSE);
                return;
            }
            getnavigatenextek5ggoq.serializer();
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            zzj zzjVar = new zzj(2, null, getnavigatenextek5ggoq, new zzdd(Boolean.TRUE, parentDataModifierDefaultImpls));
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzjVar);
            getnumpaddeleteek5ggoq.zzc(75, parcelZza);
        }
    }

    public final void read(PendingIntent pendingIntent, LocationRequest locationRequest, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        if (IconCompatParcelizer(zzo.zzj)) {
            ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).write(new zzee(3, null, null, pendingIntent, null), locationRequest, new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls));
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        zzeg zzegVar = zzeg.read(locationRequest);
        zzdd zzddVar = new zzdd(null, parentDataModifierDefaultImpls);
        int iHashCode = pendingIntent.hashCode();
        getnumpaddeleteek5ggoq.serializer(new zzei(1, zzegVar, null, null, pendingIntent, zzddVar, d$$ExternalSyntheticOutline0.m(iHashCode, "PendingIntent@", new StringBuilder(String.valueOf(iHashCode).length() + 14))));
    }

    public final void read(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        if (!IconCompatParcelizer(zzo.zzg)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            int i = getMinusEK5gGoQ.IconCompatParcelizer;
            parcelZza.writeInt(0);
            getnumpaddeleteek5ggoq.zzc(12, parcelZza);
            parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.TRUE);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(Boolean.TRUE, parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
        int i2 = getMinusEK5gGoQ.IconCompatParcelizer;
        parcelZza2.writeInt(0);
        parcelZza2.writeStrongBinder(getnavigatepreviousek5ggoq);
        getnumpaddeleteek5ggoq2.zzc(84, parcelZza2);
    }

    public final void read(accessgetNumPadEntercp accessgetnumpadentercp, boolean z, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        synchronized (this.write) {
            getNumPad2EK5gGoQ getnumpad2ek5ggoq = (getNumPad2EK5gGoQ) this.write.remove(accessgetnumpadentercp);
            if (getnumpad2ek5ggoq == null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.FALSE);
                return;
            }
            getnumpad2ek5ggoq.read();
            if (!z) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.TRUE);
            } else if (IconCompatParcelizer(zzo.zzj)) {
                getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
                int iIdentityHashCode = System.identityHashCode(getnumpad2ek5ggoq);
                StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                sb.append("ILocationListener@");
                sb.append(iIdentityHashCode);
                zzee zzeeVar = new zzee(1, null, getnumpad2ek5ggoq, null, sb.toString());
                getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(Boolean.TRUE, parentDataModifierDefaultImpls);
                Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
                getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
                parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
                getnumpaddeleteek5ggoq.zzc(89, parcelZza);
            } else {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).serializer(new zzei(2, null, getnumpad2ek5ggoq, null, null, new zzdd(Boolean.TRUE, parentDataModifierDefaultImpls), null));
            }
        }
    }

    public final void serializer(Location location, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) throws RemoteException {
        if (!IconCompatParcelizer(zzo.zzh)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, location);
            getnumpaddeleteek5ggoq.zzc(13, parcelZza);
            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, location);
        parcelZza2.writeStrongBinder(getnavigatepreviousek5ggoq);
        getnumpaddeleteek5ggoq2.zzc(85, parcelZza2);
    }

    public final void serializer(zzem zzemVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) throws RemoteException {
        if (IconCompatParcelizer(zzo.zzn)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls);
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzemVar);
            parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
            getnumpaddeleteek5ggoq.zzc(98, parcelZza);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        zzdg zzdgVar = new zzdg(0, parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, zzemVar);
        parcelZza2.writeStrongBinder(zzdgVar.asBinder());
        getnumpaddeleteek5ggoq2.zzc(74, parcelZza2);
    }

    public final void serializer(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) throws RemoteException {
        if (!IconCompatParcelizer(zzo.zzg)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            int i = getMinusEK5gGoQ.IconCompatParcelizer;
            parcelZza.writeInt(1);
            getnumpaddeleteek5ggoq.zzc(12, parcelZza);
            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls);
        Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
        int i2 = getMinusEK5gGoQ.IconCompatParcelizer;
        parcelZza2.writeInt(1);
        parcelZza2.writeStrongBinder(getnavigatepreviousek5ggoq);
        getnumpaddeleteek5ggoq2.zzc(84, parcelZza2);
    }

    public final void serializer(accessgetNumPadEntercp accessgetnumpadentercp, boolean z, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        synchronized (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            getNumPad1EK5gGoQ getnumpad1ek5ggoq = (getNumPad1EK5gGoQ) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.remove(accessgetnumpadentercp);
            if (getnumpad1ek5ggoq == null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.FALSE);
                return;
            }
            getnumpad1ek5ggoq.write.write().RemoteActionCompatParcelizer = null;
            if (!z) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(Boolean.TRUE);
            } else if (IconCompatParcelizer(zzo.zzj)) {
                getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
                int iIdentityHashCode = System.identityHashCode(getnumpad1ek5ggoq);
                StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                sb.append("ILocationCallback@");
                sb.append(iIdentityHashCode);
                zzee zzeeVar = new zzee(2, null, getnumpad1ek5ggoq, null, sb.toString());
                getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(Boolean.TRUE, parentDataModifierDefaultImpls);
                Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
                getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
                parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
                getnumpaddeleteek5ggoq.zzc(89, parcelZza);
            } else {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).serializer(new zzei(2, null, null, getnumpad1ek5ggoq, null, new zzdd(Boolean.TRUE, parentDataModifierDefaultImpls), null));
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final void write(PendingIntent pendingIntent, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) throws RemoteException {
        if (!IconCompatParcelizer(zzo.zzj)) {
            ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).serializer(new zzei(2, null, null, null, pendingIntent, new zzdd(null, parentDataModifierDefaultImpls), null));
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper();
        zzee zzeeVar = new zzee(3, null, null, pendingIntent, null);
        getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq = new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls);
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
        parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
        getnumpaddeleteek5ggoq.zzc(89, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void MediaSessionCompatToken() {
        System.currentTimeMillis();
        synchronized (this.write) {
            this.write.clear();
        }
        synchronized (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.clear();
        }
        synchronized (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.clear();
        }
    }

    public final void read(getNavigateInEK5gGoQ getnavigateinek5ggoq, LocationRequest locationRequest, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        getNumPad1EK5gGoQ getnumpad1ek5ggoq;
        scale0AR0LA0default scale0ar0la0defaultWrite = getnavigateinek5ggoq.write();
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) scale0ar0la0defaultWrite.RemoteActionCompatParcelizer;
        Objects.requireNonNull(accessgetnumpadentercp);
        boolean zIconCompatParcelizer = IconCompatParcelizer(zzo.zzj);
        synchronized (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            getNumPad1EK5gGoQ getnumpad1ek5ggoq2 = (getNumPad1EK5gGoQ) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.get(accessgetnumpadentercp);
            if (getnumpad1ek5ggoq2 != null && !zIconCompatParcelizer) {
                getnumpad1ek5ggoq2.write.serializer(scale0ar0la0defaultWrite);
                getnumpad1ek5ggoq = getnumpad1ek5ggoq2;
                getnumpad1ek5ggoq2 = null;
            } else {
                getNumPad1EK5gGoQ getnumpad1ek5ggoq3 = new getNumPad1EK5gGoQ(getnavigateinek5ggoq);
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.put(accessgetnumpadentercp, getnumpad1ek5ggoq3);
                getnumpad1ek5ggoq = getnumpad1ek5ggoq3;
            }
            if (zIconCompatParcelizer) {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).write(new zzee(2, getnumpad1ek5ggoq2 == null ? null : getnumpad1ek5ggoq2, getnumpad1ek5ggoq, null, accessgetnumpadentercp.serializer()), locationRequest, new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls));
            } else {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).serializer(new zzei(1, zzeg.read(locationRequest), null, getnumpad1ek5ggoq, null, new zzdd(parentDataModifierDefaultImpls, getnumpad1ek5ggoq, 0), accessgetnumpadentercp.serializer()));
            }
        }
    }

    public final void serializer(getNavigateInEK5gGoQ getnavigateinek5ggoq, LocationRequest locationRequest, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        getNumPad2EK5gGoQ getnumpad2ek5ggoq;
        scale0AR0LA0default scale0ar0la0defaultWrite = getnavigateinek5ggoq.write();
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) scale0ar0la0defaultWrite.RemoteActionCompatParcelizer;
        Objects.requireNonNull(accessgetnumpadentercp);
        boolean zIconCompatParcelizer = IconCompatParcelizer(zzo.zzj);
        synchronized (this.write) {
            getNumPad2EK5gGoQ getnumpad2ek5ggoq2 = (getNumPad2EK5gGoQ) this.write.get(accessgetnumpadentercp);
            if (getnumpad2ek5ggoq2 != null && !zIconCompatParcelizer) {
                getnumpad2ek5ggoq2.RemoteActionCompatParcelizer(scale0ar0la0defaultWrite);
                getnumpad2ek5ggoq = getnumpad2ek5ggoq2;
                getnumpad2ek5ggoq2 = null;
            } else {
                getNumPad2EK5gGoQ getnumpad2ek5ggoq3 = new getNumPad2EK5gGoQ(getnavigateinek5ggoq);
                this.write.put(accessgetnumpadentercp, getnumpad2ek5ggoq3);
                getnumpad2ek5ggoq = getnumpad2ek5ggoq3;
            }
            if (zIconCompatParcelizer) {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).write(new zzee(1, getnumpad2ek5ggoq2 == null ? null : getnumpad2ek5ggoq2, getnumpad2ek5ggoq, null, accessgetnumpadentercp.serializer()), locationRequest, new getNavigatePreviousEK5gGoQ(null, parentDataModifierDefaultImpls));
            } else {
                ((getNumPadDeleteEK5gGoQ) MediaSessionCompatResultReceiverWrapper()).serializer(new zzei(1, zzeg.read(locationRequest), getnumpad2ek5ggoq, null, null, new zzdd(parentDataModifierDefaultImpls, getnumpad2ek5ggoq, 2), accessgetnumpadentercp.serializer()));
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (iInterfaceQueryLocalInterface instanceof getNumPadDeleteEK5gGoQ) {
            return (getNumPadDeleteEK5gGoQ) iInterfaceQueryLocalInterface;
        }
        return new getNumPadDeleteEK5gGoQ(iBinder);
    }

    public final boolean IconCompatParcelizer(Feature feature) {
        com.google.android.gms.common.internal.zzj zzjVar = this.MediaSessionCompatQueueItem;
        Feature feature2 = null;
        Feature[] featureArr = zzjVar == null ? null : zzjVar.write;
        if (featureArr != null) {
            for (Feature feature3 : featureArr) {
                if (feature.read.equals(feature3.read)) {
                    feature2 = feature3;
                    break;
                }
            }
            if (feature2 != null && feature2.IconCompatParcelizer() >= feature.IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    public zzdz(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, zabk zabkVar, zabk zabkVar2) {
        super(context, looper, 23, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        this.write = new processDragGesture(0);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new processDragGesture(0);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new processDragGesture(0);
    }
}
