package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesClient {

    public static final class GooglePlayServicesConnection implements ServiceConnection {
        public final long a;
        public boolean b = false;
        public final LinkedBlockingQueue c = new LinkedBlockingQueue(1);

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public GooglePlayServicesConnection(long j) {
            this.a = j;
        }

        public final IBinder a() {
            if (this.b) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return null;
            }
            this.b = true;
            return (IBinder) this.c.poll(this.a, TimeUnit.MILLISECONDS);
        }
    }

    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }
    }

    public static final class GooglePlayServicesInterface implements IInterface {
        public final IBinder a;

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.a;
        }

        public GooglePlayServicesInterface(IBinder iBinder) {
            this.a = iBinder;
        }

        public final String a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final Boolean b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return Boolean.valueOf(!(parcelObtain2.readInt() != 0));
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        GooglePlayServicesConnection googlePlayServicesConnection = new GooglePlayServicesConnection(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, googlePlayServicesConnection, 1)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Google Play connection failed");
            return null;
        }
        try {
            try {
                GooglePlayServicesInterface googlePlayServicesInterface = new GooglePlayServicesInterface(googlePlayServicesConnection.a());
                GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(googlePlayServicesInterface.a(), googlePlayServicesInterface.b());
                context.unbindService(googlePlayServicesConnection);
                return googlePlayServicesInfo;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            context.unbindService(googlePlayServicesConnection);
            throw th;
        }
    }
}
