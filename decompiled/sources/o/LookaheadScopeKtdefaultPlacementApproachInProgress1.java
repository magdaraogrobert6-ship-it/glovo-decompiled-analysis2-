package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.net.zza;
import io.grpc.SynchronizationContext$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKtdefaultPlacementApproachInProgress1 extends zzbm implements isComplete {
    public String read;
    public final zzpg serializer;
    public Boolean write;

    @Override // o.isComplete
    public final List IconCompatParcelizer(String str, String str2, String str3, boolean z) {
        IconCompatParcelizer(str, true);
        zzpg zzpgVar = this.serializer;
        try {
            List<getThrottleMillis> list = (List) zzpgVar.PlaybackStateCompat().read((Callable) new MeasurePolicy(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (getThrottleMillis getthrottlemillis : list) {
                if (z || !onLayoutRectChangeddefault.RemoteActionCompatParcelizer(getthrottlemillis.write)) {
                    arrayList.add(new zzpl(getthrottlemillis));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.serializer("Failed to get user properties as. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // o.isComplete
    public final List RemoteActionCompatParcelizer(String str, String str2, String str3) {
        IconCompatParcelizer(str, true);
        zzpg zzpgVar = this.serializer;
        try {
            return (List) zzpgVar.PlaybackStateCompat().read((Callable) new MeasurePolicy(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.serializer(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public LookaheadScopeKtdefaultPlacementApproachInProgress1(zzpg zzpgVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzpgVar);
        this.serializer = zzpgVar;
        this.read = null;
    }

    @Override // o.isComplete
    public final void IconCompatParcelizer(zzr zzrVar) {
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        IconCompatParcelizer(str, false);
        serializer(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 3));
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.serializer;
        if (zIsEmpty) {
            zzpgVar.RatingCompat().serializer.RemoteActionCompatParcelizer("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.write == null) {
                    this.write = Boolean.valueOf("com.google.android.gms".equals(this.read) || accessgetTvInputHdmi4cp.IconCompatParcelizer(zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaDescriptionCompat, Binder.getCallingUid()) || scale0AR0LA0default.write(zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaDescriptionCompat).read(Binder.getCallingUid()));
                }
                if (this.write.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                zzpgVar.RatingCompat().serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.read == null && GooglePlayServicesUtilLight.uidHasPackageName(zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaDescriptionCompat, Binder.getCallingUid(), str)) {
            this.read = str;
        }
        if (str.equals(this.read)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // o.isComplete
    public final void MediaDescriptionCompat(zzr zzrVar) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzrVar.RatingCompat);
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) zzrVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        write(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 5));
    }

    @Override // o.isComplete
    public final void MediaSessionCompatQueueItem(zzr zzrVar) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzrVar.RatingCompat);
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) zzrVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        write(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 4));
    }

    @Override // o.isComplete
    public final void RatingCompat(zzr zzrVar) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzrVar.RatingCompat);
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) zzrVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        write(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 6));
    }

    public final void serializer(Runnable runnable) {
        zzpg zzpgVar = this.serializer;
        if (zzpgVar.PlaybackStateCompat().MediaMetadataCompat()) {
            runnable.run();
        } else {
            zzpgVar.PlaybackStateCompat().write(runnable);
        }
    }

    public final void write(Runnable runnable) {
        zzpg zzpgVar = this.serializer;
        if (zzpgVar.PlaybackStateCompat().MediaMetadataCompat()) {
            runnable.run();
        } else {
            zzpgVar.PlaybackStateCompat().RemoteActionCompatParcelizer(runnable);
        }
    }

    @Override // o.isComplete
    public final void IconCompatParcelizer(zzpl zzplVar, zzr zzrVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzplVar);
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new SynchronizationContext$1(8, this, zzplVar, zzrVar, false));
    }

    public final void MediaBrowserCompatMediaItem(zzr zzrVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        IconCompatParcelizer(str, false);
        this.serializer.ResultReceiver().read(zzrVar.MediaBrowserCompatMediaItem);
    }

    @Override // o.isComplete
    public final zzao MediaMetadataCompat(zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        zzpg zzpgVar = this.serializer;
        try {
            return (zzao) zzpgVar.PlaybackStateCompat().serializer((Callable) new Api35Impl(this, zzrVar, 2)).get(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.RatingCompat().serializer.serializer("Failed to get consent. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            return new zzao(null);
        }
    }

    @Override // o.isComplete
    public final ArrayList RemoteActionCompatParcelizer(zzr zzrVar, boolean z) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        zzpg zzpgVar = this.serializer;
        try {
            List<getThrottleMillis> list = (List) zzpgVar.PlaybackStateCompat().read((Callable) new Api35Impl(this, str, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (getThrottleMillis getthrottlemillis : list) {
                if (z || !onLayoutRectChangeddefault.RemoteActionCompatParcelizer(getthrottlemillis.write)) {
                    arrayList.add(new zzpl(getthrottlemillis));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.serializer("Failed to get user properties. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            return null;
        }
    }

    @Override // o.isComplete
    public final List RemoteActionCompatParcelizer(String str, String str2, boolean z, zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str3 = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
        zzpg zzpgVar = this.serializer;
        try {
            List<getThrottleMillis> list = (List) zzpgVar.PlaybackStateCompat().read((Callable) new MeasurePolicy(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (getThrottleMillis getthrottlemillis : list) {
                if (z || !onLayoutRectChangeddefault.RemoteActionCompatParcelizer(getthrottlemillis.write)) {
                    arrayList.add(new zzpl(getthrottlemillis));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.serializer("Failed to query user properties. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // o.isComplete
    public final List read(String str, String str2, zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str3 = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
        zzpg zzpgVar = this.serializer;
        try {
            return (List) zzpgVar.PlaybackStateCompat().read((Callable) new MeasurePolicy(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.serializer(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // o.isComplete
    public final void read(Bundle bundle, zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        serializer(new ImageVectorCacheImageVectorEntry(this, bundle, str, zzrVar));
    }

    @Override // o.isComplete
    public final void read(zzah zzahVar, zzr zzrVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzahVar);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzahVar.serializer);
        MediaBrowserCompatMediaItem(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.RemoteActionCompatParcelizer = zzrVar.RatingCompat;
        serializer(new SynchronizationContext$1(5, this, zzahVar2, zzrVar, false));
    }

    @Override // o.isComplete
    public final void read(zzbg zzbgVar, zzr zzrVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbgVar);
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new SynchronizationContext$1(6, this, zzbgVar, zzrVar, false));
    }

    @Override // o.isComplete
    public final String serializer(zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        zzpg zzpgVar = this.serializer;
        try {
            return (String) zzpgVar.PlaybackStateCompat().read((Callable) new Api35Impl(zzpgVar, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.RatingCompat().serializer.serializer("Failed to get app instance id. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(zzrVar.RatingCompat), e);
            return null;
        }
    }

    @Override // o.isComplete
    public final void serializer(zzr zzrVar, Bundle bundle, LayoutNodeSubcompositionsStateprecomposePaused2 layoutNodeSubcompositionsStateprecomposePaused2) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.serializer.PlaybackStateCompat().write((Runnable) new getLayoutNodeToHolder(this, zzrVar, bundle, layoutNodeSubcompositionsStateprecomposePaused2, str, 1));
    }

    @Override // o.isComplete
    public final byte[] serializer(zzbg zzbgVar, String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbgVar);
        IconCompatParcelizer(str, true);
        zzpg zzpgVar = this.serializer;
        zzgs zzgsVar = zzpgVar.RatingCompat().MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        String str2 = zzbgVar.IconCompatParcelizer;
        zzgsVar.serializer(zzgnVar.write(str2), "Log and bundle. event");
        ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.PlaybackStateCompat().serializer((Callable) new ModernAsyncTask$1(this, zzbgVar, str)).get();
            if (bArr == null) {
                zzpgVar.RatingCompat().serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
            zzpgVar.RatingCompat().MediaSessionCompatToken.IconCompatParcelizer("Log and bundle processed. event, size, time_ms", lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.RatingCompat().serializer.IconCompatParcelizer("Failed to log and bundle. appId, event, error", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(str2), e);
            return null;
        }
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar, zzoo zzooVar, LayoutNodeSubcompositionsStatesubcompose41composable1 layoutNodeSubcompositionsStatesubcompose41composable1) {
        MediaBrowserCompatMediaItem(zzrVar);
        String str = zzrVar.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.serializer.PlaybackStateCompat().write((Runnable) new ImageVectorCacheImageVectorEntry(this, str, zzooVar, layoutNodeSubcompositionsStatesubcompose41composable1));
    }

    @Override // o.isComplete
    public final void RemoteActionCompatParcelizer(zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 2));
    }

    @Override // o.isComplete
    public final void read(zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 0));
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new LookaheadScopeKtLookaheadScope11(this, zzrVar, 1));
    }

    @Override // o.isComplete
    public final void serializer(String str, String str2, long j, String str3) {
        serializer(new MeasurePolicyDefaultImpls(this, str2, str3, str, j));
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar, zzaf zzafVar) {
        MediaBrowserCompatMediaItem(zzrVar);
        serializer(new SynchronizationContext$1(this, zzrVar, zzafVar, 9));
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        List list;
        int i2 = 1;
        LayoutNodeSubcompositionsStatesubcompose41composable1 getnodestate = null;
        LayoutNodeSubcompositionsStateprecomposePaused2 traversedescendants = null;
        boolean z = false;
        switch (i) {
            case 1:
                zzbg zzbgVar = (zzbg) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                read(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                IconCompatParcelizer(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                read(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                getPageDownEK5gGoQ.read(parcel);
                accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbgVar2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(string);
                IconCompatParcelizer(string, true);
                serializer(new SynchronizationContext$1(7, this, zzbgVar2, string, false));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                RemoteActionCompatParcelizer(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                z = parcel.readInt() != 0;
                getPageDownEK5gGoQ.read(parcel);
                ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zzrVar5, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayListRemoteActionCompatParcelizer);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzbg.CREATOR);
                String string2 = parcel.readString();
                getPageDownEK5gGoQ.read(parcel);
                byte[] bArrSerializer = serializer(zzbgVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrSerializer);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                getPageDownEK5gGoQ.read(parcel);
                serializer(string3, string4, j, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                String strSerializer = serializer(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strSerializer);
                return true;
            case 12:
                zzah zzahVar = (zzah) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                read(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzah.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                accessgetSystemNavigationDowncp.IconCompatParcelizer(zzahVar2);
                accessgetSystemNavigationDowncp.IconCompatParcelizer(zzahVar2.serializer);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzahVar2.RemoteActionCompatParcelizer);
                IconCompatParcelizer(zzahVar2.RemoteActionCompatParcelizer, true);
                serializer(new zza(this, new zzah(zzahVar2), z, 14));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = getPageDownEK5gGoQ.serializer;
                boolean z2 = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(string6, string7, z2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listRemoteActionCompatParcelizer);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = getPageDownEK5gGoQ.serializer;
                boolean z3 = parcel.readInt() != 0;
                getPageDownEK5gGoQ.read(parcel);
                List listIconCompatParcelizer = IconCompatParcelizer(string8, string9, string10, z3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listIconCompatParcelizer);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                List list2 = read(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(list2);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                getPageDownEK5gGoQ.read(parcel);
                List listRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listRemoteActionCompatParcelizer2);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                IconCompatParcelizer(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                read(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                MediaSessionCompatQueueItem(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                zzao zzaoVarMediaMetadataCompat = MediaMetadataCompat(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarMediaMetadataCompat == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarMediaMetadataCompat.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                MediaBrowserCompatMediaItem(zzrVar14);
                String str = zzrVar14.RatingCompat;
                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
                zzpg zzpgVar = this.serializer;
                if (zzpgVar.MediaDescriptionCompat().write(null, premeasure0kLqBqw.addOnConfigurationChangedListener)) {
                    try {
                        list = (List) zzpgVar.PlaybackStateCompat().serializer((Callable) new MeasureResult(this, zzrVar14, bundle2, z ? 1 : 0)).get(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        zzpgVar.RatingCompat().serializer.serializer("Failed to get trigger URIs. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) zzpgVar.PlaybackStateCompat().read((Callable) new MeasureResult(this, zzrVar14, bundle2, i2)).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        zzpgVar.RatingCompat().serializer.serializer("Failed to get trigger URIs. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e2);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                RatingCompat(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                MediaDescriptionCompat(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                write(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (iInterfaceQueryLocalInterface instanceof LayoutNodeSubcompositionsStatesubcompose41composable1) {
                        getnodestate = (LayoutNodeSubcompositionsStatesubcompose41composable1) iInterfaceQueryLocalInterface;
                    } else {
                        getnodestate = new getNodeState(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                write(zzrVar18, zzooVar, getnodestate);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzaf.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                write(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (iInterfaceQueryLocalInterface2 instanceof LayoutNodeSubcompositionsStateprecomposePaused2) {
                        traversedescendants = (LayoutNodeSubcompositionsStateprecomposePaused2) iInterfaceQueryLocalInterface2;
                    } else {
                        traversedescendants = new traverseDescendants(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                serializer(zzrVar20, bundle3, traversedescendants);
                parcel2.writeNoException();
                return true;
        }
    }
}
