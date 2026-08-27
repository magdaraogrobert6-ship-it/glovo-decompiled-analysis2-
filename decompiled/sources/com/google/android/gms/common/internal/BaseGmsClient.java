package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import coil3.Extras$Key;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.huawei.hms.api.HuaweiApiClientImpl;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.accessgetRefreshcp;
import o.accessgetRightBracketcp;
import o.accessgetRocp;
import o.accessgetScrollLockcp;
import o.accessgetSpacebarcp;
import o.accessgetStem1cp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetSystemNavigationLeftcp;
import o.accessgetSystemNavigationRightcp;
import o.accessgetSystemNavigationUpcp;
import o.accessgetTcp;
import o.accessgetThreecp;
import o.accessgetThumbsDowncp;
import o.accessgetTvContentsMenucp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseGmsClient {
    public static final Feature[] serializer = new Feature[0];
    public accessgetSystemNavigationLeftcp ComponentActivity;
    public volatile String IconCompatParcelizer;
    public accessgetThumbsDowncp MediaBrowserCompatMediaItem;
    public final zzb MediaDescriptionCompat;
    public accessgetRefreshcp MediaMetadataCompat;
    public final Context ParcelableVolumeInfo;
    public final zzq PlaybackStateCompat;
    public final GoogleApiAvailabilityLight PlaybackStateCompatCustomAction;
    public volatile Extras$Key RemoteActionCompatParcelizer;
    public IInterface ResultReceiver;
    public accessgetTcp r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final accessgetRightBracketcp r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final accessgetRocp r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public volatile String MediaSessionCompatToken = null;
    public final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Object();
    public final Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Object();
    public final ArrayList r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
    public ConnectionResult read = null;
    public boolean RatingCompat = false;
    public volatile zzj MediaSessionCompatQueueItem = null;
    public final AtomicInteger MediaSessionCompatResultReceiverWrapper = new AtomicInteger(0);

    public Account MediaBrowserCompatMediaItem() {
        return null;
    }

    public Set MediaDescriptionCompat() {
        return Collections.EMPTY_SET;
    }

    public Feature[] MediaMetadataCompat() {
        return serializer;
    }

    public void MediaSessionCompatToken() {
        System.currentTimeMillis();
    }

    public boolean PlaybackStateCompat() {
        return read() >= 211700000;
    }

    public Executor RatingCompat() {
        return null;
    }

    public abstract String RemoteActionCompatParcelizer();

    public boolean ResultReceiver() {
        return this instanceof accessgetTvContentsMenucp;
    }

    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return false;
    }

    public abstract int read();

    public abstract IInterface read(IBinder iBinder);

    public abstract String write();

    public final /* synthetic */ void ComponentActivity() {
        int i;
        int i2;
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            i = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        if (i == 3) {
            this.RatingCompat = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        zzb zzbVar = this.MediaDescriptionCompat;
        zzbVar.sendMessage(zzbVar.obtainMessage(i2, this.MediaSessionCompatResultReceiverWrapper.get(), 16));
    }

    public final void IconCompatParcelizer() {
        int iIsGooglePlayServicesAvailable = this.PlaybackStateCompatCustomAction.isGooglePlayServicesAvailable(this.ParcelableVolumeInfo, read());
        if (iIsGooglePlayServicesAvailable == 0) {
            this.MediaMetadataCompat = new accessgetSpacebarcp(this);
            RemoteActionCompatParcelizer(2, null);
            return;
        }
        RemoteActionCompatParcelizer(1, null);
        this.MediaMetadataCompat = new accessgetSpacebarcp(this);
        int i = this.MediaSessionCompatResultReceiverWrapper.get();
        zzb zzbVar = this.MediaDescriptionCompat;
        zzbVar.sendMessage(zzbVar.obtainMessage(3, i, iIsGooglePlayServicesAvailable, null));
    }

    public final /* synthetic */ boolean IconCompatParcelizer(int i, int i2, IInterface iInterface) {
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != i) {
                return false;
            }
            RemoteActionCompatParcelizer(i2, iInterface);
            return true;
        }
    }

    public Bundle MediaSessionCompatQueueItem() {
        return new Bundle();
    }

    public final IInterface MediaSessionCompatResultReceiverWrapper() {
        IInterface iInterface;
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 5) {
                throw new DeadObjectException();
            }
            if (!ParcelableVolumeInfo()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.ResultReceiver;
            accessgetSystemNavigationDowncp.serializer(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    public final boolean ParcelableVolumeInfo() {
        boolean z;
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            z = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 4;
        }
        return z;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        boolean z;
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            int i = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void serializer() {
        this.MediaSessionCompatResultReceiverWrapper.incrementAndGet();
        ArrayList arrayList = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                accessgetStem1cp accessgetstem1cp = (accessgetStem1cp) arrayList.get(i);
                synchronized (accessgetstem1cp) {
                    accessgetstem1cp.RemoteActionCompatParcelizer = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            this.ComponentActivity = null;
        }
        RemoteActionCompatParcelizer(1, null);
    }

    public BaseGmsClient(Context context, Looper looper, zzq zzqVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, accessgetRocp accessgetrocp, accessgetRightBracketcp accessgetrightbracketcp, String str) {
        accessgetSystemNavigationDowncp.serializer(context, "Context must not be null");
        this.ParcelableVolumeInfo = context;
        accessgetSystemNavigationDowncp.serializer(looper, "Looper must not be null");
        accessgetSystemNavigationDowncp.serializer(zzqVar, "Supervisor must not be null");
        this.PlaybackStateCompat = zzqVar;
        accessgetSystemNavigationDowncp.serializer(googleApiAvailabilityLight, "API availability must not be null");
        this.PlaybackStateCompatCustomAction = googleApiAvailabilityLight;
        this.MediaDescriptionCompat = new zzb(this, looper);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = accessgetrocp;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = accessgetrightbracketcp;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = str;
    }

    public final void IconCompatParcelizer(accessgetScrollLockcp accessgetscrolllockcp, Set set) {
        AttributionSource attributionSource;
        String attributionTag;
        Bundle bundleMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        if (Build.VERSION.SDK_INT < 31 || this.RemoteActionCompatParcelizer == null || (attributionSource = (AttributionSource) this.RemoteActionCompatParcelizer.IconCompatParcelizer) == null || attributionSource.getAttributionTag() == null) {
            attributionTag = this.IconCompatParcelizer;
        } else {
            attributionTag = attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.write;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.RemoteActionCompatParcelizer;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.MediaDescriptionCompat = this.ParcelableVolumeInfo.getPackageName();
        getServiceRequest.MediaMetadataCompat = bundleMediaSessionCompatQueueItem;
        if (set != null) {
            getServiceRequest.MediaSessionCompatQueueItem = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
            Account accountMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            if (accountMediaBrowserCompatMediaItem == null) {
                accountMediaBrowserCompatMediaItem = new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.MediaBrowserCompatMediaItem = accountMediaBrowserCompatMediaItem;
            if (accessgetscrolllockcp != null) {
                getServiceRequest.RatingCompat = accessgetscrolllockcp.asBinder();
            }
        }
        getServiceRequest.MediaSessionCompatResultReceiverWrapper = serializer;
        getServiceRequest.PlaybackStateCompatCustomAction = MediaMetadataCompat();
        if (ResultReceiver()) {
            getServiceRequest.ParcelableVolumeInfo = true;
        }
        try {
            synchronized (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                accessgetSystemNavigationLeftcp accessgetsystemnavigationleftcp = this.ComponentActivity;
                if (accessgetsystemnavigationleftcp != null) {
                    accessgetsystemnavigationleftcp.write(new zzd(this, this.MediaSessionCompatResultReceiverWrapper.get()), getServiceRequest);
                } else {
                    SentryLogcatAdapter.IconCompatParcelizer("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            SentryLogcatAdapter.write("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.MediaSessionCompatResultReceiverWrapper.get();
            zzb zzbVar = this.MediaDescriptionCompat;
            zzbVar.sendMessage(zzbVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            SentryLogcatAdapter.write("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.MediaSessionCompatResultReceiverWrapper.get();
            accessgetSystemNavigationRightcp accessgetsystemnavigationrightcp = new accessgetSystemNavigationRightcp(this, 8, null, null);
            zzb zzbVar2 = this.MediaDescriptionCompat;
            zzbVar2.sendMessage(zzbVar2.obtainMessage(1, i4, -1, accessgetsystemnavigationrightcp));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            SentryLogcatAdapter.write("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.MediaSessionCompatResultReceiverWrapper.get();
            accessgetSystemNavigationRightcp accessgetsystemnavigationrightcp2 = new accessgetSystemNavigationRightcp(this, 8, null, null);
            zzb zzbVar3 = this.MediaDescriptionCompat;
            zzbVar3.sendMessage(zzbVar3.obtainMessage(1, i5, -1, accessgetsystemnavigationrightcp2));
        }
    }

    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        String str = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        return str == null ? this.ParcelableVolumeInfo.getClass().getName() : str;
    }

    public final /* synthetic */ boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        if (this.RatingCompat || TextUtils.isEmpty(write()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(write());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void RemoteActionCompatParcelizer(int i, IInterface iInterface) {
        accessgetThumbsDowncp accessgetthumbsdowncp;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer((i == 4) == (iInterface != null));
        synchronized (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
            this.ResultReceiver = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                accessgetTcp accessgettcp = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (accessgettcp != null) {
                    zzq zzqVar = this.PlaybackStateCompat;
                    String str = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
                    this.MediaBrowserCompatMediaItem.getClass();
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    zzqVar.IconCompatParcelizer(new accessgetThreecp(str, this.MediaBrowserCompatMediaItem.write), accessgettcp);
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
                }
            } else if (i == 2 || i == 3) {
                accessgetTcp accessgettcp2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (accessgettcp2 != null && (accessgetthumbsdowncp = this.MediaBrowserCompatMediaItem) != null) {
                    String str2 = accessgetthumbsdowncp.RemoteActionCompatParcelizer;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 92);
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str2);
                    sb.append(" on com.google.android.gms");
                    SentryLogcatAdapter.serializer("GmsClient", sb.toString());
                    zzq zzqVar2 = this.PlaybackStateCompat;
                    String str3 = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
                    this.MediaBrowserCompatMediaItem.getClass();
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    boolean z = this.MediaBrowserCompatMediaItem.write;
                    zzqVar2.getClass();
                    zzqVar2.IconCompatParcelizer(new accessgetThreecp(str3, z), accessgettcp2);
                    this.MediaSessionCompatResultReceiverWrapper.incrementAndGet();
                }
                accessgetTcp accessgettcp3 = new accessgetTcp(this, this.MediaSessionCompatResultReceiverWrapper.get());
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = accessgettcp3;
                String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                boolean zPlaybackStateCompat = PlaybackStateCompat();
                this.MediaBrowserCompatMediaItem = new accessgetThumbsDowncp(strRemoteActionCompatParcelizer, zPlaybackStateCompat);
                if (zPlaybackStateCompat && read() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer)));
                }
                zzq zzqVar3 = this.PlaybackStateCompat;
                String str4 = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str4);
                this.MediaBrowserCompatMediaItem.getClass();
                ConnectionResult connectionResultWrite = zzqVar3.write(new accessgetThreecp(str4, this.MediaBrowserCompatMediaItem.write), accessgettcp3, r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), RatingCompat());
                if (!connectionResultWrite.read()) {
                    String str5 = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 56);
                    sb2.append("unable to connect to service: ");
                    sb2.append(str5);
                    sb2.append(" on com.google.android.gms");
                    SentryLogcatAdapter.IconCompatParcelizer("GmsClient", sb2.toString());
                    int i2 = connectionResultWrite.IconCompatParcelizer;
                    if (i2 == -1) {
                        i2 = 16;
                    }
                    if (connectionResultWrite.serializer != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", connectionResultWrite.serializer);
                    }
                    int i3 = this.MediaSessionCompatResultReceiverWrapper.get();
                    accessgetSystemNavigationUpcp accessgetsystemnavigationupcp = new accessgetSystemNavigationUpcp(this, i2, bundle);
                    zzb zzbVar = this.MediaDescriptionCompat;
                    zzbVar.sendMessage(zzbVar.obtainMessage(7, i3, -1, accessgetsystemnavigationupcp));
                }
            } else if (i == 4) {
                accessgetSystemNavigationDowncp.IconCompatParcelizer(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.MediaSessionCompatToken = str;
        serializer();
    }
}
