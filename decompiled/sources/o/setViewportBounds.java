package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.grpc.internal.DelayedClientCall$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class setViewportBounds extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public final getLastResult IconCompatParcelizer;
    public final getLastResult MediaBrowserCompatMediaItem;
    public ScheduledExecutorService MediaDescriptionCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public final getCacheFileSuffixlambda0 RatingCompat;
    public volatile Boolean read;
    public final setCallback serializer;
    public isComplete write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return false;
    }

    public final zzr RemoteActionCompatParcelizer(boolean z) {
        long jAbs;
        Pair pair;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.getClass();
        resume resumeVarMediaMetadataCompat = lookaheadScopeKtLookaheadScope221.MediaMetadataCompat();
        String strM = null;
        if (z) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) getlookaheaddelegate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope222.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            if (lookaheadScopeKt.IconCompatParcelizer != null) {
                LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope222.PlaybackStateCompatCustomAction;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                localLookaheadPositionOfauaQtc locallookaheadpositionofauaqtc = lookaheadScopeKt2.IconCompatParcelizer;
                LookaheadScopeKt lookaheadScopeKt3 = (LookaheadScopeKt) locallookaheadpositionofauaqtc.IconCompatParcelizer;
                lookaheadScopeKt3.MediaSessionCompatToken();
                lookaheadScopeKt3.MediaSessionCompatToken();
                long j = ((LookaheadScopeKt) locallookaheadpositionofauaqtc.IconCompatParcelizer).serializer().getLong((String) locallookaheadpositionofauaqtc.read, 0L);
                if (j == 0) {
                    locallookaheadpositionofauaqtc.read();
                    jAbs = 0;
                } else {
                    ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = locallookaheadpositionofauaqtc.RemoteActionCompatParcelizer;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    locallookaheadpositionofauaqtc.read();
                    pair = null;
                } else {
                    String string = lookaheadScopeKt3.serializer().getString((String) locallookaheadpositionofauaqtc.write, null);
                    long j3 = lookaheadScopeKt3.serializer().getLong((String) locallookaheadpositionofauaqtc.serializer, 0L);
                    locallookaheadpositionofauaqtc.read();
                    pair = (string == null || j3 <= 0) ? LookaheadScopeKt.read : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != LookaheadScopeKt.read) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM = d$$ExternalSyntheticOutline0.m(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return resumeVarMediaMetadataCompat.serializer(strM);
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
    }

    public final void ComponentActivity() {
        MediaSessionCompatToken();
        serializer();
        setCallback setcallback = this.serializer;
        if (setcallback.IconCompatParcelizer != null && (setcallback.IconCompatParcelizer.ParcelableVolumeInfo() || setcallback.IconCompatParcelizer.PlaybackStateCompatCustomAction())) {
            setcallback.IconCompatParcelizer.serializer();
        }
        setcallback.IconCompatParcelizer = null;
        try {
            accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().IconCompatParcelizer(((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat, setcallback);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.write = null;
    }

    public final void MediaSessionCompatQueueItem() {
        MediaSessionCompatToken();
        serializer();
        if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
            return;
        }
        if (MediaSessionCompatResultReceiverWrapper()) {
            setCallback setcallback = this.serializer;
            setViewportBounds setviewportbounds = setcallback.serializer;
            setviewportbounds.MediaSessionCompatToken();
            Context context = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat;
            synchronized (setcallback) {
                if (setcallback.read) {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setcallback.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Connection attempt already in progress");
                    return;
                } else {
                    if (setcallback.IconCompatParcelizer != null && (setcallback.IconCompatParcelizer.PlaybackStateCompatCustomAction() || setcallback.IconCompatParcelizer.ParcelableVolumeInfo())) {
                        getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setcallback.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Already awaiting connection attempt");
                        return;
                    }
                    setcallback.IconCompatParcelizer = new current(context, Looper.getMainLooper(), zzq.read(context), GoogleApiAvailabilityLight.getInstance(), 93, setcallback, setcallback, null);
                    getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) setcallback.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("Connecting to remote service");
                    setcallback.read = true;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(setcallback.IconCompatParcelizer);
                    setcallback.IconCompatParcelizer.IconCompatParcelizer();
                    return;
                }
            }
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageManager().queryIntentServices(new Intent().setClassName(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
            getlookaheaddelegate4.serializer.RemoteActionCompatParcelizer("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat, "com.google.android.gms.measurement.AppMeasurementService"));
        setCallback setcallback2 = this.serializer;
        setViewportBounds setviewportbounds2 = setcallback2.serializer;
        setviewportbounds2.MediaSessionCompatToken();
        Context context2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat;
        accessgetTvAudioDescriptionMixingVolumeUpcp accessgettvaudiodescriptionmixingvolumeupcpRemoteActionCompatParcelizer = accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer();
        synchronized (setcallback2) {
            boolean z = setcallback2.read;
            setViewportBounds setviewportbounds3 = setcallback2.serializer;
            if (z) {
                getLookaheadDelegate getlookaheaddelegate5 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                getlookaheaddelegate5.PlaybackStateCompat.RemoteActionCompatParcelizer("Connection attempt already in progress");
            } else {
                getLookaheadDelegate getlookaheaddelegate6 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                getlookaheaddelegate6.PlaybackStateCompat.RemoteActionCompatParcelizer("Using local app measurement service");
                setcallback2.read = true;
                accessgettvaudiodescriptionmixingvolumeupcpRemoteActionCompatParcelizer.read(context2, intent, setviewportbounds3.serializer, 129);
            }
        }
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        MediaSessionCompatToken();
        serializer();
        if (this.read == null) {
            MediaSessionCompatToken();
            serializer();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.MediaSessionCompatToken();
            boolean z = false;
            Boolean boolValueOf = !lookaheadScopeKt.serializer().contains("use_service") ? null : Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                resume resumeVarMediaMetadataCompat = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaMetadataCompat();
                resumeVarMediaMetadataCompat.serializer();
                if (resumeVarMediaMetadataCompat.MediaSessionCompatResultReceiverWrapper == 1) {
                    z = true;
                } else {
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Checking service availability");
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat, 12451000);
                    if (iIsGooglePlayServicesAvailable == 0) {
                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Service available");
                    } else if (iIsGooglePlayServicesAvailable == 1) {
                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("Service missing");
                    } else if (iIsGooglePlayServicesAvailable != 2) {
                        if (iIsGooglePlayServicesAvailable != 3) {
                            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            if (iIsGooglePlayServicesAvailable == 9) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Service invalid");
                            } else if (iIsGooglePlayServicesAvailable != 18) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.MediaSessionCompatQueueItem.serializer(Integer.valueOf(iIsGooglePlayServicesAvailable), "Unexpected service status");
                            } else {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Service updating");
                            }
                        } else {
                            getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                            getlookaheaddelegate5.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Service disabled");
                        }
                        z2 = false;
                    } else {
                        getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                        getlookaheaddelegate6.MediaSessionCompatToken.RemoteActionCompatParcelizer("Service container out of date");
                        onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                        if (onlayoutrectchangeddefault2.MediaSessionCompatResultReceiverWrapper() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer()) {
                    getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                    getlookaheaddelegate7.serializer.RemoteActionCompatParcelizer("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                    lookaheadScopeKt2.MediaSessionCompatToken();
                    SharedPreferences.Editor editorEdit = lookaheadScopeKt2.serializer().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.read = Boolean.valueOf(z2);
        }
        return this.read.booleanValue();
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        MediaSessionCompatToken();
        if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.MediaSessionCompatQueueItem;
        long size = arrayList.size();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.getClass();
        if (size >= 1000) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(60000L);
            MediaSessionCompatQueueItem();
        }
    }

    public final void RemoteActionCompatParcelizer(AtomicReference atomicReference) {
        MediaSessionCompatToken();
        serializer();
        RemoteActionCompatParcelizer((Runnable) new DelayedClientCall$2(this, atomicReference, RemoteActionCompatParcelizer(false)));
    }

    public final boolean ResultReceiver() {
        MediaSessionCompatToken();
        serializer();
        if (!MediaSessionCompatResultReceiverWrapper()) {
            return true;
        }
        onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        return onlayoutrectchangeddefault.MediaSessionCompatResultReceiverWrapper() >= ((Integer) premeasure0kLqBqw.createFullyDrawnExecutor.IconCompatParcelizer(null)).intValue();
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        MediaSessionCompatToken();
        getCacheFileSuffixlambda0 getcachefilesuffixlambda0 = this.RatingCompat;
        getcachefilesuffixlambda0.read = ((accessgetTvInputComposite2cp) getcachefilesuffixlambda0.serializer).IconCompatParcelizer();
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(((Long) premeasure0kLqBqw.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer(null)).longValue());
    }

    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        MediaSessionCompatToken();
        serializer();
        if (!MediaSessionCompatResultReceiverWrapper()) {
            return true;
        }
        onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        return onlayoutrectchangeddefault.MediaSessionCompatResultReceiverWrapper() >= 241200;
    }

    public final void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
        ArrayList arrayList = this.MediaSessionCompatQueueItem;
        zzgsVar.serializer(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    public final boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        MediaSessionCompatToken();
        serializer();
        return this.write != null;
    }

    public final void serializer(ComponentName componentName) {
        MediaSessionCompatToken();
        if (this.write != null) {
            this.write = null;
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(componentName, "Disconnected from device MeasurementService");
            MediaSessionCompatToken();
            MediaSessionCompatQueueItem();
        }
    }

    public final void serializer(Bundle bundle) {
        boolean z;
        MediaSessionCompatToken();
        serializer();
        zzbe zzbeVar = new zzbe(bundle);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onPanelClosed)) {
            getParentWidth getparentwidth = lookaheadScopeKtLookaheadScope221.read();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            byte[] bArrIconCompatParcelizer = onLayoutRectChangeddefault.IconCompatParcelizer((Parcelable) zzbeVar);
            if (bArrIconCompatParcelizer == null) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.write.RemoteActionCompatParcelizer("Null default event parameters; not writing to database");
            } else if (bArrIconCompatParcelizer.length > 131072) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.write.RemoteActionCompatParcelizer("Default event parameters too long for local database. Sending directly to service");
            } else if (getparentwidth.RemoteActionCompatParcelizer(4, bArrIconCompatParcelizer)) {
                z = true;
            }
            z = false;
        } else {
            z = false;
        }
        RemoteActionCompatParcelizer((Runnable) new setLastResult(this, RemoteActionCompatParcelizer(false), z, zzbeVar, bundle));
    }

    public final void serializer(zzah zzahVar) {
        boolean zRemoteActionCompatParcelizer;
        MediaSessionCompatToken();
        serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.getClass();
        getParentWidth getparentwidth = lookaheadScopeKtLookaheadScope221.read();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        byte[] bArrIconCompatParcelizer = onLayoutRectChangeddefault.IconCompatParcelizer((Parcelable) zzahVar);
        if (bArrIconCompatParcelizer.length > 131072) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.write.RemoteActionCompatParcelizer("Conditional user property too long for local database. Sending directly to service");
            zRemoteActionCompatParcelizer = false;
        } else {
            zRemoteActionCompatParcelizer = getparentwidth.RemoteActionCompatParcelizer(2, bArrIconCompatParcelizer);
        }
        RemoteActionCompatParcelizer((Runnable) new accessgetNotificationcp(this, RemoteActionCompatParcelizer(true), zRemoteActionCompatParcelizer, new zzah(zzahVar)));
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0404 A[Catch: all -> 0x0479, TryCatch #38 {all -> 0x0479, blocks: (B:241:0x03fe, B:243:0x0404, B:244:0x0407, B:252:0x042e, B:261:0x044c, B:61:0x0140, B:64:0x0147, B:66:0x014c, B:68:0x0153, B:70:0x015c, B:72:0x0162, B:77:0x0178, B:81:0x018e, B:83:0x0193, B:92:0x01b6, B:93:0x01b9, B:91:0x01b1, B:100:0x01c7, B:102:0x01db, B:109:0x01f3, B:110:0x01fc, B:111:0x01ff, B:107:0x01ed, B:114:0x0203, B:116:0x0217, B:123:0x022f, B:125:0x023a, B:126:0x023d, B:121:0x0229, B:129:0x0241, B:133:0x0255, B:143:0x0271, B:145:0x027b, B:146:0x027e, B:141:0x026b, B:153:0x028d, B:154:0x0298, B:183:0x02ff, B:185:0x031d, B:186:0x0329), top: B:393:0x03fe }] */
    /* JADX WARN: Code duplicated, block: B:246:0x0416  */
    /* JADX WARN: Code duplicated, block: B:255:0x0435  */
    /* JADX WARN: Code duplicated, block: B:263:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x0460 A[PHI: r5 r10 r23 r25 r27 r32 r35 r36
  0x0460: PHI (r5v12 android.database.sqlite.SQLiteDatabase) = (r5v10 android.database.sqlite.SQLiteDatabase), (r5v13 android.database.sqlite.SQLiteDatabase) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r10v8 int) = (r10v5 int), (r10v9 int) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r23v6 java.lang.String) = (r23v3 java.lang.String), (r23v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r25v6 java.lang.String) = (r25v3 java.lang.String), (r25v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r27v6 java.lang.String) = (r27v3 java.lang.String), (r27v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r32v8 o.accessgetTvInputComposite1cp) = (r32v5 o.accessgetTvInputComposite1cp), (r32v9 o.accessgetTvInputComposite1cp) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r35v8 o.setComposedWithReusableContentHost) = (r35v5 o.setComposedWithReusableContentHost), (r35v9 o.setComposedWithReusableContentHost) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0460: PHI (r36v8 com.google.android.gms.measurement.internal.zzr) = (r36v5 com.google.android.gms.measurement.internal.zzr), (r36v9 com.google.android.gms.measurement.internal.zzr) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x0461 A[PHI: r1 r5 r23 r25 r27 r32 r35 r36
  0x0461: PHI (r1v12 int) = (r1v7 int), (r1v14 int) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r5v16 android.database.sqlite.SQLiteDatabase) = (r5v12 android.database.sqlite.SQLiteDatabase), (r5v17 android.database.sqlite.SQLiteDatabase) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r23v10 java.lang.String) = (r23v6 java.lang.String), (r23v11 java.lang.String) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r25v10 java.lang.String) = (r25v6 java.lang.String), (r25v11 java.lang.String) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r27v10 java.lang.String) = (r27v6 java.lang.String), (r27v11 java.lang.String) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r32v12 o.accessgetTvInputComposite1cp) = (r32v8 o.accessgetTvInputComposite1cp), (r32v13 o.accessgetTvInputComposite1cp) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r35v12 o.setComposedWithReusableContentHost) = (r35v8 o.setComposedWithReusableContentHost), (r35v13 o.setComposedWithReusableContentHost) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]
  0x0461: PHI (r36v12 com.google.android.gms.measurement.internal.zzr) = (r36v8 com.google.android.gms.measurement.internal.zzr), (r36v13 com.google.android.gms.measurement.internal.zzr) binds: [B:265:0x0460, B:256:0x0438] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:267:0x0465 A[PHI: r10 r23 r25 r27 r32 r35 r36
  0x0465: PHI (r10v7 int) = (r10v5 int), (r10v9 int) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r23v5 java.lang.String) = (r23v3 java.lang.String), (r23v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r25v5 java.lang.String) = (r25v3 java.lang.String), (r25v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r27v5 java.lang.String) = (r27v3 java.lang.String), (r27v7 java.lang.String) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r32v7 o.accessgetTvInputComposite1cp) = (r32v5 o.accessgetTvInputComposite1cp), (r32v9 o.accessgetTvInputComposite1cp) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r35v7 o.setComposedWithReusableContentHost) = (r35v5 o.setComposedWithReusableContentHost), (r35v9 o.setComposedWithReusableContentHost) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x0465: PHI (r36v7 com.google.android.gms.measurement.internal.zzr) = (r36v5 com.google.android.gms.measurement.internal.zzr), (r36v9 com.google.android.gms.measurement.internal.zzr) binds: [B:247:0x0419, B:264:0x045e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x047d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0482  */
    /* JADX WARN: Code duplicated, block: B:280:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:281:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:283:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:285:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:286:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:289:0x04de  */
    /* JADX WARN: Code duplicated, block: B:291:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:293:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:294:0x0579  */
    /* JADX WARN: Code duplicated, block: B:297:0x057e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:306:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:311:0x05ae A[Catch: RemoteException -> 0x05e6, TRY_LEAVE, TryCatch #35 {RemoteException -> 0x05e6, blocks: (B:309:0x05a9, B:311:0x05ae), top: B:391:0x05a9 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:330:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:334:0x061e  */
    /* JADX WARN: Code duplicated, block: B:340:0x063a  */
    /* JADX WARN: Code duplicated, block: B:347:0x0651  */
    /* JADX WARN: Code duplicated, block: B:355:0x0672  */
    /* JADX WARN: Code duplicated, block: B:369:0x0628 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x063e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x03fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0580 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x03af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0466 A[SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(isComplete iscomplete, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        ArrayList arrayList;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        getLookaheadDelegate getlookaheaddelegate;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp;
        int i;
        SQLiteDatabase sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        long j2;
        String string;
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        int size;
        zzr zzrVar2;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost;
        String str2;
        boolean zWrite;
        int size2;
        int i2;
        getParentLayoutDirection getparentlayoutdirection;
        AbstractSafeParcelable abstractSafeParcelable2;
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2;
        getLookaheadDelegate getlookaheaddelegate2;
        boolean z;
        String str3;
        long jCurrentTimeMillis;
        long j3;
        long jElapsedRealtime;
        getLookaheadDelegate getlookaheaddelegate3;
        String str4;
        MediaSessionCompatToken();
        serializer();
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope222.getClass();
        getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp2 = lookaheadScopeKtLookaheadScope222.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost2 = lookaheadScopeKtLookaheadScope222.PlaybackStateCompat;
        int i3 = 100;
        zzr zzrVar3 = zzrVar;
        int i4 = 100;
        int i5 = 0;
        while (i5 < 1001 && i4 == i3) {
            ArrayList arrayList2 = new ArrayList();
            getParentWidth getparentwidth = lookaheadScopeKtLookaheadScope222.read();
            String str5 = "entry";
            String str6 = "type";
            String str7 = "rowid";
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getparentwidth.MediaSessionCompatToken();
            int i6 = i5;
            if (getparentwidth.read) {
                lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope222;
                getlookaheaddelegate = getlookaheaddelegate4;
                accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
            } else {
                arrayList = new ArrayList();
                lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope222;
                if (((LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i7 = 5;
                    int i8 = 5;
                    getlookaheaddelegate = getlookaheaddelegate4;
                    int i9 = 0;
                    while (true) {
                        if (i9 < i7) {
                            try {
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getparentwidth.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
                                    accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                    try {
                                        try {
                                            getparentwidth.read = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        zzrVar3 = zzrVar3;
                                        str5 = str5;
                                        i8 = i8;
                                        cursorQuery = null;
                                        SystemClock.sleep(i8);
                                        i8 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                        }
                                        i9++;
                                        str6 = str6;
                                        str7 = str7;
                                        str5 = str5;
                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        zzrVar3 = zzrVar3;
                                        i7 = 5;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        str6 = str6;
                                        str7 = str7;
                                        zzrVar3 = zzrVar3;
                                        str5 = str5;
                                        i8 = i8;
                                        cursorQuery = null;
                                        getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                        getlookaheaddelegate5.serializer.serializer(e, "Error reading entries from local database");
                                        getparentwidth.read = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                            i8 = i8;
                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                        } else {
                                            i8 = i8;
                                        }
                                        i9++;
                                        str6 = str6;
                                        str7 = str7;
                                        str5 = str5;
                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        zzrVar3 = zzrVar3;
                                        i7 = 5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        zzrVar3 = zzrVar3;
                                        str5 = str5;
                                        i8 = i8;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                            try {
                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                        getlookaheaddelegate6.serializer.serializer(e, "Error reading entries from local database");
                                        getparentwidth.read = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                            i8 = i8;
                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                        } else {
                                            i8 = i8;
                                        }
                                        i9++;
                                        str6 = str6;
                                        str7 = str7;
                                        str5 = str5;
                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                        zzrVar3 = zzrVar3;
                                        i7 = 5;
                                    }
                                } else {
                                    accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.beginTransaction();
                                    try {
                                        String[] strArr2 = {str7};
                                        String[] strArr3 = new String[1];
                                        try {
                                            strArr3[0] = "3";
                                            cursorQuery2 = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.query("messages", strArr2, "type=?", strArr3, null, null, "rowid desc", "1");
                                            try {
                                                long j4 = -1;
                                                if (cursorQuery2.moveToFirst()) {
                                                    setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                    try {
                                                        j = cursorQuery2.getLong(0);
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused2) {
                                                            zzrVar3 = zzrVar3;
                                                            str5 = str5;
                                                            i8 = i8;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i8);
                                                            i8 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                            }
                                                            i9++;
                                                            str6 = str6;
                                                            str7 = str7;
                                                            str5 = str5;
                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                            zzrVar3 = zzrVar3;
                                                            i7 = 5;
                                                        } catch (SQLiteFullException e3) {
                                                            e = e3;
                                                            str6 = str6;
                                                            str7 = str7;
                                                            zzrVar3 = zzrVar3;
                                                            str5 = str5;
                                                            i8 = i8;
                                                            cursorQuery = null;
                                                            getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                                                            getlookaheaddelegate7.serializer.serializer(e, "Error reading entries from local database");
                                                            getparentwidth.read = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                i8 = i8;
                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                            } else {
                                                                i8 = i8;
                                                            }
                                                            i9++;
                                                            str6 = str6;
                                                            str7 = str7;
                                                            str5 = str5;
                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                            zzrVar3 = zzrVar3;
                                                            i7 = 5;
                                                        } catch (SQLiteException e4) {
                                                            e = e4;
                                                            zzrVar3 = zzrVar3;
                                                            str5 = str5;
                                                            i8 = i8;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                }
                                                            }
                                                            getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                                                            getlookaheaddelegate8.serializer.serializer(e, "Error reading entries from local database");
                                                            getparentwidth.read = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                i8 = i8;
                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                            } else {
                                                                i8 = i8;
                                                            }
                                                            i9++;
                                                            str6 = str6;
                                                            str7 = str7;
                                                            str5 = str5;
                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                            zzrVar3 = zzrVar3;
                                                            i7 = 5;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        str6 = str6;
                                                        str7 = str7;
                                                        zzrVar3 = zzrVar3;
                                                        str5 = str5;
                                                        if (cursorQuery2 != null) {
                                                            try {
                                                                cursorQuery2.close();
                                                            } catch (SQLiteDatabaseLockedException unused3) {
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i8);
                                                                i8 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                }
                                                                i9++;
                                                                str6 = str6;
                                                                str7 = str7;
                                                                str5 = str5;
                                                                accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                zzrVar3 = zzrVar3;
                                                                i7 = 5;
                                                            } catch (SQLiteFullException e5) {
                                                                e = e5;
                                                                cursorQuery = null;
                                                                getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                                                                getlookaheaddelegate9.serializer.serializer(e, "Error reading entries from local database");
                                                                getparentwidth.read = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                    i8 = i8;
                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                } else {
                                                                    i8 = i8;
                                                                }
                                                                i9++;
                                                                str6 = str6;
                                                                str7 = str7;
                                                                str5 = str5;
                                                                accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                zzrVar3 = zzrVar3;
                                                                i7 = 5;
                                                            } catch (SQLiteException e6) {
                                                                e = e6;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                    }
                                                                }
                                                                getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                                                                getlookaheaddelegate10.serializer.serializer(e, "Error reading entries from local database");
                                                                getparentwidth.read = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                    i8 = i8;
                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                } else {
                                                                    i8 = i8;
                                                                }
                                                                i9++;
                                                                str6 = str6;
                                                                str7 = str7;
                                                                str5 = str5;
                                                                accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                zzrVar3 = zzrVar3;
                                                                i7 = 5;
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                    cursorQuery2.close();
                                                    j = -1;
                                                }
                                                if (j != -1) {
                                                    strArr = new String[]{String.valueOf(j)};
                                                    str = "rowid<?";
                                                } else {
                                                    str = null;
                                                    strArr = null;
                                                }
                                                try {
                                                    String[] strArr4 = {str7, str6, str5};
                                                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompat;
                                                    LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3 = premeasure0kLqBqw.onPanelClosed;
                                                    zzrVar3 = zzrVar3;
                                                    try {
                                                        try {
                                                            if (setcomposedwithreusablecontenthost3.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3)) {
                                                                try {
                                                                    try {
                                                                        strArr4 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                                    } catch (SQLiteDatabaseLockedException unused4) {
                                                                        str6 = str6;
                                                                        str7 = str7;
                                                                        str5 = str5;
                                                                        i8 = i8;
                                                                        cursorQuery = null;
                                                                        SystemClock.sleep(i8);
                                                                        i8 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                        }
                                                                        i9++;
                                                                        str6 = str6;
                                                                        str7 = str7;
                                                                        str5 = str5;
                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                        zzrVar3 = zzrVar3;
                                                                        i7 = 5;
                                                                    }
                                                                } catch (SQLiteFullException e7) {
                                                                    e = e7;
                                                                    str6 = str6;
                                                                    str7 = str7;
                                                                    str5 = str5;
                                                                    i8 = i8;
                                                                    cursorQuery = null;
                                                                    getLookaheadDelegate getlookaheaddelegate11 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                                                                    getlookaheaddelegate11.serializer.serializer(e, "Error reading entries from local database");
                                                                    getparentwidth.read = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                        i8 = i8;
                                                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                    } else {
                                                                        i8 = i8;
                                                                    }
                                                                    i9++;
                                                                    str6 = str6;
                                                                    str7 = str7;
                                                                    str5 = str5;
                                                                    accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                    setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                    zzrVar3 = zzrVar3;
                                                                    i7 = 5;
                                                                } catch (SQLiteException e8) {
                                                                    e = e8;
                                                                    str6 = str6;
                                                                    str7 = str7;
                                                                    str5 = str5;
                                                                    i8 = i8;
                                                                    cursorQuery = null;
                                                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                        }
                                                                    }
                                                                    getLookaheadDelegate getlookaheaddelegate12 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate12);
                                                                    getlookaheaddelegate12.serializer.serializer(e, "Error reading entries from local database");
                                                                    getparentwidth.read = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                        i8 = i8;
                                                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                    } else {
                                                                        i8 = i8;
                                                                    }
                                                                    i9++;
                                                                    str6 = str6;
                                                                    str7 = str7;
                                                                    str5 = str5;
                                                                    accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                    setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                    zzrVar3 = zzrVar3;
                                                                    i7 = 5;
                                                                }
                                                            }
                                                            cursorQuery = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.query("messages", strArr4, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        j4 = cursorQuery.getLong(0);
                                                                        int i10 = cursorQuery.getInt(1);
                                                                        str6 = str6;
                                                                        try {
                                                                            byte[] blob = cursorQuery.getBlob(2);
                                                                            str7 = str7;
                                                                            try {
                                                                                if (lookaheadScopeKtLookaheadScope223.PlaybackStateCompat.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3)) {
                                                                                    string = cursorQuery.getString(3);
                                                                                    j2 = cursorQuery.getLong(4);
                                                                                } else {
                                                                                    j2 = 0;
                                                                                    string = null;
                                                                                }
                                                                                if (i10 == 0) {
                                                                                    layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3;
                                                                                    try {
                                                                                        Parcel parcelObtain = Parcel.obtain();
                                                                                        try {
                                                                                            str5 = str5;
                                                                                            try {
                                                                                                try {
                                                                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                    parcelObtain.setDataPosition(0);
                                                                                                    zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                                                    try {
                                                                                                        parcelObtain.recycle();
                                                                                                        if (zzbgVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new getParentLayoutDirection(zzbgVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                        SystemClock.sleep(i8);
                                                                                                        i8 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                        }
                                                                                                        i9++;
                                                                                                        str6 = str6;
                                                                                                        str7 = str7;
                                                                                                        str5 = str5;
                                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                        zzrVar3 = zzrVar3;
                                                                                                        i7 = 5;
                                                                                                    } catch (SQLiteFullException e9) {
                                                                                                        e = e9;
                                                                                                        getLookaheadDelegate getlookaheaddelegate13 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate13);
                                                                                                        getlookaheaddelegate13.serializer.serializer(e, "Error reading entries from local database");
                                                                                                        getparentwidth.read = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                            i8 = i8;
                                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                        } else {
                                                                                                            i8 = i8;
                                                                                                        }
                                                                                                        i9++;
                                                                                                        str6 = str6;
                                                                                                        str7 = str7;
                                                                                                        str5 = str5;
                                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                        zzrVar3 = zzrVar3;
                                                                                                        i7 = 5;
                                                                                                    } catch (SQLiteException e10) {
                                                                                                        e = e10;
                                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                                                            }
                                                                                                        }
                                                                                                        getLookaheadDelegate getlookaheaddelegate14 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate14);
                                                                                                        getlookaheaddelegate14.serializer.serializer(e, "Error reading entries from local database");
                                                                                                        getparentwidth.read = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                            i8 = i8;
                                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                        } else {
                                                                                                            i8 = i8;
                                                                                                        }
                                                                                                        i9++;
                                                                                                        str6 = str6;
                                                                                                        str7 = str7;
                                                                                                        str5 = str5;
                                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                        zzrVar3 = zzrVar3;
                                                                                                        i7 = 5;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused6) {
                                                                                                    getLookaheadDelegate getlookaheaddelegate15 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate15);
                                                                                                    getlookaheaddelegate15.serializer.RemoteActionCompatParcelizer("Failed to load event from local database");
                                                                                                    parcelObtain.recycle();
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                parcelObtain.recycle();
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused7) {
                                                                                            str5 = str5;
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused8) {
                                                                                        str5 = str5;
                                                                                        SystemClock.sleep(i8);
                                                                                        i8 += 20;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                        }
                                                                                        i9++;
                                                                                        str6 = str6;
                                                                                        str7 = str7;
                                                                                        str5 = str5;
                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                        zzrVar3 = zzrVar3;
                                                                                        i7 = 5;
                                                                                    } catch (SQLiteFullException e11) {
                                                                                        e = e11;
                                                                                        str5 = str5;
                                                                                        getLookaheadDelegate getlookaheaddelegate16 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate16);
                                                                                        getlookaheaddelegate16.serializer.serializer(e, "Error reading entries from local database");
                                                                                        getparentwidth.read = true;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                            i8 = i8;
                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                        } else {
                                                                                            i8 = i8;
                                                                                        }
                                                                                        i9++;
                                                                                        str6 = str6;
                                                                                        str7 = str7;
                                                                                        str5 = str5;
                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                        zzrVar3 = zzrVar3;
                                                                                        i7 = 5;
                                                                                    } catch (SQLiteException e12) {
                                                                                        e = e12;
                                                                                        str5 = str5;
                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                                            }
                                                                                        }
                                                                                        getLookaheadDelegate getlookaheaddelegate17 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate17);
                                                                                        getlookaheaddelegate17.serializer.serializer(e, "Error reading entries from local database");
                                                                                        getparentwidth.read = true;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                            i8 = i8;
                                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                        } else {
                                                                                            i8 = i8;
                                                                                        }
                                                                                        i9++;
                                                                                        str6 = str6;
                                                                                        str7 = str7;
                                                                                        str5 = str5;
                                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                        zzrVar3 = zzrVar3;
                                                                                        i7 = 5;
                                                                                    }
                                                                                } else {
                                                                                    layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3;
                                                                                    str5 = str5;
                                                                                    if (i10 == 1) {
                                                                                        Parcel parcelObtain2 = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                parcelObtain2.setDataPosition(0);
                                                                                                zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                parcelObtain2.recycle();
                                                                                            } catch (Throwable th6) {
                                                                                                parcelObtain2.recycle();
                                                                                                throw th6;
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused9) {
                                                                                            getLookaheadDelegate getlookaheaddelegate18 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate18);
                                                                                            getlookaheaddelegate18.serializer.RemoteActionCompatParcelizer("Failed to load user property from local database");
                                                                                            parcelObtain2.recycle();
                                                                                            zzplVarCreateFromParcel = null;
                                                                                        }
                                                                                        if (zzplVarCreateFromParcel != null) {
                                                                                            arrayList.add(new getParentLayoutDirection(zzplVarCreateFromParcel, string, j2));
                                                                                        }
                                                                                    } else {
                                                                                        if (i10 == 2) {
                                                                                            Parcel parcelObtain3 = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                    parcelObtain3.setDataPosition(0);
                                                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                    parcelObtain3.recycle();
                                                                                                } catch (SafeParcelReader$ParseException unused10) {
                                                                                                    getLookaheadDelegate getlookaheaddelegate19 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate19);
                                                                                                    getlookaheaddelegate19.serializer.RemoteActionCompatParcelizer("Failed to load conditional user property from local database");
                                                                                                    parcelObtain3.recycle();
                                                                                                    zzahVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (zzahVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new getParentLayoutDirection(zzahVarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } catch (Throwable th7) {
                                                                                                parcelObtain3.recycle();
                                                                                                throw th7;
                                                                                            }
                                                                                        } else if (i10 == 4) {
                                                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain4.setDataPosition(0);
                                                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                                                        try {
                                                                                                            parcelObtain4.recycle();
                                                                                                            if (zzbeVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new getParentLayoutDirection(zzbeVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (SQLiteDatabaseLockedException unused11) {
                                                                                                            SystemClock.sleep(i8);
                                                                                                            i8 += 20;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                            }
                                                                                                            i9++;
                                                                                                            str6 = str6;
                                                                                                            str7 = str7;
                                                                                                            str5 = str5;
                                                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                            zzrVar3 = zzrVar3;
                                                                                                            i7 = 5;
                                                                                                        } catch (SQLiteFullException e13) {
                                                                                                            e = e13;
                                                                                                            getLookaheadDelegate getlookaheaddelegate110 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate110);
                                                                                                            getlookaheaddelegate110.serializer.serializer(e, "Error reading entries from local database");
                                                                                                            getparentwidth.read = true;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                                i8 = i8;
                                                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                            } else {
                                                                                                                i8 = i8;
                                                                                                            }
                                                                                                            i9++;
                                                                                                            str6 = str6;
                                                                                                            str7 = str7;
                                                                                                            str5 = str5;
                                                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                            zzrVar3 = zzrVar3;
                                                                                                            i7 = 5;
                                                                                                        } catch (SQLiteException e14) {
                                                                                                            e = e14;
                                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                                                                }
                                                                                                            }
                                                                                                            getLookaheadDelegate getlookaheaddelegate111 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate111);
                                                                                                            getlookaheaddelegate111.serializer.serializer(e, "Error reading entries from local database");
                                                                                                            getparentwidth.read = true;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                                                i8 = i8;
                                                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                                                            } else {
                                                                                                                i8 = i8;
                                                                                                            }
                                                                                                            i9++;
                                                                                                            str6 = str6;
                                                                                                            str7 = str7;
                                                                                                            str5 = str5;
                                                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                                                            zzrVar3 = zzrVar3;
                                                                                                            i7 = 5;
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        th = th8;
                                                                                                        parcelObtain4.recycle();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused12) {
                                                                                                    getLookaheadDelegate getlookaheaddelegate20 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate20);
                                                                                                    getlookaheaddelegate20.serializer.RemoteActionCompatParcelizer("Failed to load default event parameters from local database");
                                                                                                    parcelObtain4.recycle();
                                                                                                    zzbeVarCreateFromParcel = null;
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused13) {
                                                                                            } catch (Throwable th9) {
                                                                                                th = th9;
                                                                                            }
                                                                                        } else {
                                                                                            getLookaheadDelegate getlookaheaddelegate21 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                                            if (i10 == 3) {
                                                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate21);
                                                                                                getlookaheaddelegate21.PlaybackStateCompat.RemoteActionCompatParcelizer("Skipping app launch break");
                                                                                            } else {
                                                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate21);
                                                                                                getlookaheaddelegate21.serializer.RemoteActionCompatParcelizer("Unknown record type in local database");
                                                                                            }
                                                                                        }
                                                                                        i8 = i8;
                                                                                        str6 = str6;
                                                                                        str7 = str7;
                                                                                        layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3 = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
                                                                                        str5 = str5;
                                                                                    }
                                                                                }
                                                                                i8 = i8;
                                                                                str6 = str6;
                                                                                str7 = str7;
                                                                                layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3 = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
                                                                                str5 = str5;
                                                                            } catch (SQLiteDatabaseLockedException unused14) {
                                                                                i8 = i8;
                                                                            } catch (SQLiteFullException e15) {
                                                                                e = e15;
                                                                                i8 = i8;
                                                                            } catch (SQLiteException e16) {
                                                                                e = e16;
                                                                                i8 = i8;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused15) {
                                                                            i8 = i8;
                                                                            SystemClock.sleep(i8);
                                                                            i8 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                            }
                                                                            i9++;
                                                                            str6 = str6;
                                                                            str7 = str7;
                                                                            str5 = str5;
                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                            zzrVar3 = zzrVar3;
                                                                            i7 = 5;
                                                                        } catch (SQLiteFullException e17) {
                                                                            e = e17;
                                                                            i8 = i8;
                                                                            getLookaheadDelegate getlookaheaddelegate112 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate112);
                                                                            getlookaheaddelegate112.serializer.serializer(e, "Error reading entries from local database");
                                                                            getparentwidth.read = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                i8 = i8;
                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                            } else {
                                                                                i8 = i8;
                                                                            }
                                                                            i9++;
                                                                            str6 = str6;
                                                                            str7 = str7;
                                                                            str5 = str5;
                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                            zzrVar3 = zzrVar3;
                                                                            i7 = 5;
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                            i8 = i8;
                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                                }
                                                                            }
                                                                            getLookaheadDelegate getlookaheaddelegate113 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate113);
                                                                            getlookaheaddelegate113.serializer.serializer(e, "Error reading entries from local database");
                                                                            getparentwidth.read = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                                i8 = i8;
                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                            } else {
                                                                                i8 = i8;
                                                                            }
                                                                            i9++;
                                                                            str6 = str6;
                                                                            str7 = str7;
                                                                            str5 = str5;
                                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                            zzrVar3 = zzrVar3;
                                                                            i7 = 5;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused16) {
                                                                        str6 = str6;
                                                                        i8 = i8;
                                                                        SystemClock.sleep(i8);
                                                                        i8 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                        }
                                                                        i9++;
                                                                        str6 = str6;
                                                                        str7 = str7;
                                                                        str5 = str5;
                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                        zzrVar3 = zzrVar3;
                                                                        i7 = 5;
                                                                    } catch (SQLiteFullException e19) {
                                                                        e = e19;
                                                                        str6 = str6;
                                                                        i8 = i8;
                                                                        getLookaheadDelegate getlookaheaddelegate114 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate114);
                                                                        getlookaheaddelegate114.serializer.serializer(e, "Error reading entries from local database");
                                                                        getparentwidth.read = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                            i8 = i8;
                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                        } else {
                                                                            i8 = i8;
                                                                        }
                                                                        i9++;
                                                                        str6 = str6;
                                                                        str7 = str7;
                                                                        str5 = str5;
                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                        zzrVar3 = zzrVar3;
                                                                        i7 = 5;
                                                                    } catch (SQLiteException e20) {
                                                                        e = e20;
                                                                        str6 = str6;
                                                                        i8 = i8;
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                                            }
                                                                        }
                                                                        getLookaheadDelegate getlookaheaddelegate115 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate115);
                                                                        getlookaheaddelegate115.serializer.serializer(e, "Error reading entries from local database");
                                                                        getparentwidth.read = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                            i8 = i8;
                                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                                        } else {
                                                                            i8 = i8;
                                                                        }
                                                                        i9++;
                                                                        str6 = str6;
                                                                        str7 = str7;
                                                                        str5 = str5;
                                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                                        zzrVar3 = zzrVar3;
                                                                        i7 = 5;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused17) {
                                                                    str6 = str6;
                                                                } catch (SQLiteFullException e21) {
                                                                    e = e21;
                                                                    str6 = str6;
                                                                } catch (SQLiteException e22) {
                                                                    e = e22;
                                                                    str6 = str6;
                                                                }
                                                            }
                                                            i = 0;
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                getLookaheadDelegate getlookaheaddelegate22 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate22);
                                                                getlookaheaddelegate22.serializer.RemoteActionCompatParcelizer("Fewer entries removed from local database than expected");
                                                            }
                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTransactionSuccessful();
                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                            cursorQuery.close();
                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                        } catch (SQLiteDatabaseLockedException unused18) {
                                                            str5 = str5;
                                                            i8 = i8;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i8);
                                                            i8 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                            }
                                                            i9++;
                                                            str6 = str6;
                                                            str7 = str7;
                                                            str5 = str5;
                                                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                            zzrVar3 = zzrVar3;
                                                            i7 = 5;
                                                        }
                                                    } catch (SQLiteFullException e23) {
                                                        e = e23;
                                                        str5 = str5;
                                                        i8 = i8;
                                                        cursorQuery = null;
                                                        getLookaheadDelegate getlookaheaddelegate116 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate116);
                                                        getlookaheaddelegate116.serializer.serializer(e, "Error reading entries from local database");
                                                        getparentwidth.read = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                            i8 = i8;
                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                        } else {
                                                            i8 = i8;
                                                        }
                                                        i9++;
                                                        str6 = str6;
                                                        str7 = str7;
                                                        str5 = str5;
                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                        zzrVar3 = zzrVar3;
                                                        i7 = 5;
                                                    } catch (SQLiteException e24) {
                                                        e = e24;
                                                        str5 = str5;
                                                        i8 = i8;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                                            }
                                                        }
                                                        getLookaheadDelegate getlookaheaddelegate117 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate117);
                                                        getlookaheaddelegate117.serializer.serializer(e, "Error reading entries from local database");
                                                        getparentwidth.read = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                            i8 = i8;
                                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                                        } else {
                                                            i8 = i8;
                                                        }
                                                        i9++;
                                                        str6 = str6;
                                                        str7 = str7;
                                                        str5 = str5;
                                                        accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                                                        setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                                        zzrVar3 = zzrVar3;
                                                        i7 = 5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused19) {
                                                    zzrVar3 = zzrVar3;
                                                } catch (SQLiteFullException e25) {
                                                    e = e25;
                                                    zzrVar3 = zzrVar3;
                                                } catch (SQLiteException e26) {
                                                    e = e26;
                                                    zzrVar3 = zzrVar3;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            cursorQuery2 = null;
                                            if (cursorQuery2 != null) {
                                                cursorQuery2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused20) {
                                accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                str6 = str6;
                                str7 = str7;
                                zzrVar3 = zzrVar3;
                                str5 = str5;
                                i8 = i8;
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                            } catch (SQLiteFullException e27) {
                                e = e27;
                                accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                str6 = str6;
                                str7 = str7;
                                zzrVar3 = zzrVar3;
                                str5 = str5;
                                i8 = i8;
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                            } catch (SQLiteException e28) {
                                e = e28;
                                accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                                str6 = str6;
                                str7 = str7;
                                zzrVar3 = zzrVar3;
                                str5 = str5;
                                i8 = i8;
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                            } catch (Throwable th13) {
                                th = th13;
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                            }
                            i9++;
                            str6 = str6;
                            str7 = str7;
                            str5 = str5;
                            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                            zzrVar3 = zzrVar3;
                            i7 = 5;
                        } else {
                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                            zzrVar3 = zzrVar3;
                            i = 0;
                            getLookaheadDelegate getlookaheaddelegate23 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate23);
                            getlookaheaddelegate23.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                    }
                } else {
                    getlookaheaddelegate = getlookaheaddelegate4;
                    accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                    setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
                    zzrVar3 = zzrVar3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractSafeParcelable != 0) {
                    zzrVar2 = zzrVar3;
                    if (size < 100) {
                        arrayList2.add(new getParentLayoutDirection(abstractSafeParcelable, zzrVar2.MediaSessionCompatQueueItem, zzrVar2.MediaSessionCompatResultReceiverWrapper));
                    }
                } else {
                    zzrVar2 = zzrVar3;
                }
                setcomposedwithreusablecontenthost = setcomposedwithreusablecontenthost2;
                str2 = null;
                zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda0);
                size2 = arrayList2.size();
                zzrVar3 = zzrVar2;
                i2 = i;
                while (i2 < size2) {
                    getparentlayoutdirection = (getParentLayoutDirection) arrayList2.get(i2);
                    abstractSafeParcelable2 = getparentlayoutdirection.IconCompatParcelizer;
                    layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 = premeasure0kLqBqw.onPanelClosed;
                    if (setcomposedwithreusablecontenthost.write(str2, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2)) {
                        str4 = getparentlayoutdirection.read;
                        if (!TextUtils.isEmpty(str4)) {
                            zzrVar3 = new zzr(zzrVar3.RatingCompat, zzrVar3.MediaBrowserCompatMediaItem, str4, getparentlayoutdirection.write, zzrVar3.MediaDescriptionCompat, zzrVar3.MediaMetadataCompat, zzrVar3.PlaybackStateCompatCustomAction, zzrVar3.MediaSessionCompatToken, zzrVar3.ParcelableVolumeInfo, zzrVar3.PlaybackStateCompat, zzrVar3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, zzrVar3.ComponentActivity, zzrVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, zzrVar3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, zzrVar3.ResultReceiver, zzrVar3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, zzrVar3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, zzrVar3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, zzrVar3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, zzrVar3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, zzrVar3.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, zzrVar3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, zzrVar3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, zzrVar3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, zzrVar3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, zzrVar3._init_lambda2, zzrVar3.serializer, zzrVar3.RemoteActionCompatParcelizer, zzrVar3.write, zzrVar3.read, zzrVar3.IconCompatParcelizer);
                        }
                    }
                    if (abstractSafeParcelable2 instanceof zzbg) {
                        if (zWrite) {
                            try {
                                accessgettvinputcomposite1cp.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    accessgettvinputcomposite1cp.getClass();
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                } catch (RemoteException e29) {
                                    e = e29;
                                    j3 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    getlookaheaddelegate3 = getlookaheaddelegate;
                                    z = zWrite;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                    getlookaheaddelegate3.serializer.serializer(e, "Failed to send event to the service");
                                    if (z) {
                                        accessgetTvTeletextcp accessgettvteletextcpWrite = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                                        accessgettvinputcomposite1cp.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        accessgettvinputcomposite1cp.getClass();
                                        accessgettvteletextcpWrite.IconCompatParcelizer(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                    }
                                    getlookaheaddelegate2 = getlookaheaddelegate3;
                                    str3 = null;
                                    str2 = str3;
                                    zWrite = z;
                                    i2++;
                                    getlookaheaddelegate = getlookaheaddelegate2;
                                }
                            } catch (RemoteException e30) {
                                e = e30;
                                jCurrentTimeMillis = 0;
                            }
                        } else {
                            jCurrentTimeMillis = 0;
                            jElapsedRealtime = 0;
                        }
                        try {
                            try {
                                iscomplete.read((zzbg) abstractSafeParcelable2, zzrVar3);
                                if (zWrite) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate3 = getlookaheaddelegate;
                                    try {
                                        getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("Logging telemetry for logEvent from database");
                                        accessgetTvTeletextcp accessgettvteletextcpWrite2 = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                                        accessgettvinputcomposite1cp.getClass();
                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                        accessgettvinputcomposite1cp.getClass();
                                        z = zWrite;
                                        try {
                                            accessgettvteletextcpWrite2.IconCompatParcelizer(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e31) {
                                            e = e31;
                                            j3 = jCurrentTimeMillis;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                            getlookaheaddelegate3.serializer.serializer(e, "Failed to send event to the service");
                                            if (z && j3 != 0) {
                                                accessgetTvTeletextcp accessgettvteletextcpWrite3 = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                                                accessgettvinputcomposite1cp.getClass();
                                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                accessgettvinputcomposite1cp.getClass();
                                                accessgettvteletextcpWrite3.IconCompatParcelizer(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                            }
                                        }
                                    } catch (RemoteException e32) {
                                        e = e32;
                                        z = zWrite;
                                        j3 = jCurrentTimeMillis;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                        getlookaheaddelegate3.serializer.serializer(e, "Failed to send event to the service");
                                        if (z) {
                                            accessgetTvTeletextcp accessgettvteletextcpWrite4 = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                                            accessgettvinputcomposite1cp.getClass();
                                            long jCurrentTimeMillis5 = System.currentTimeMillis();
                                            accessgettvinputcomposite1cp.getClass();
                                            accessgettvteletextcpWrite4.IconCompatParcelizer(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis5);
                                        }
                                        getlookaheaddelegate2 = getlookaheaddelegate3;
                                        str3 = null;
                                        str2 = str3;
                                        zWrite = z;
                                        i2++;
                                        getlookaheaddelegate = getlookaheaddelegate2;
                                    }
                                } else {
                                    getlookaheaddelegate3 = getlookaheaddelegate;
                                    z = zWrite;
                                }
                            } catch (RemoteException e33) {
                                e = e33;
                                getlookaheaddelegate3 = getlookaheaddelegate;
                                z = zWrite;
                                j3 = jCurrentTimeMillis;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                getlookaheaddelegate3.serializer.serializer(e, "Failed to send event to the service");
                                if (z) {
                                    accessgetTvTeletextcp accessgettvteletextcpWrite5 = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                                    accessgettvinputcomposite1cp.getClass();
                                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                                    accessgettvinputcomposite1cp.getClass();
                                    accessgettvteletextcpWrite5.IconCompatParcelizer(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis6);
                                }
                                getlookaheaddelegate2 = getlookaheaddelegate3;
                                str3 = null;
                                str2 = str3;
                                zWrite = z;
                                i2++;
                                getlookaheaddelegate = getlookaheaddelegate2;
                            }
                        } catch (RemoteException e34) {
                            e = e34;
                        }
                        getlookaheaddelegate2 = getlookaheaddelegate3;
                    } else {
                        getlookaheaddelegate2 = getlookaheaddelegate;
                        z = zWrite;
                        if (abstractSafeParcelable2 instanceof zzpl) {
                            try {
                                iscomplete.IconCompatParcelizer((zzpl) abstractSafeParcelable2, zzrVar3);
                            } catch (RemoteException e35) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.serializer(e35, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractSafeParcelable2 instanceof zzah) {
                                try {
                                    iscomplete.read((zzah) abstractSafeParcelable2, zzrVar3);
                                } catch (RemoteException e36) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                    getlookaheaddelegate2.serializer.serializer(e36, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str3 = null;
                                if (setcomposedwithreusablecontenthost.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2) || !(abstractSafeParcelable2 instanceof zzbe)) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                    getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        iscomplete.read(((zzbe) abstractSafeParcelable2).write(), zzrVar3);
                                    } catch (RemoteException e37) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                        getlookaheaddelegate2.serializer.serializer(e37, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            str2 = str3;
                            zWrite = z;
                            i2++;
                            getlookaheaddelegate = getlookaheaddelegate2;
                        }
                    }
                    str3 = null;
                    str2 = str3;
                    zWrite = z;
                    i2++;
                    getlookaheaddelegate = getlookaheaddelegate2;
                }
                i5 = i6 + 1;
                i4 = size;
                setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost;
                lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope221;
                accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
                i3 = 100;
                getlookaheaddelegate4 = getlookaheaddelegate;
            }
            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost2;
            zzrVar3 = zzrVar3;
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractSafeParcelable != 0) {
                zzrVar2 = zzrVar3;
                if (size < 100) {
                    arrayList2.add(new getParentLayoutDirection(abstractSafeParcelable, zzrVar2.MediaSessionCompatQueueItem, zzrVar2.MediaSessionCompatResultReceiverWrapper));
                }
            } else {
                zzrVar2 = zzrVar3;
            }
            setcomposedwithreusablecontenthost = setcomposedwithreusablecontenthost2;
            str2 = null;
            zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda0);
            size2 = arrayList2.size();
            zzrVar3 = zzrVar2;
            i2 = i;
            while (i2 < size2) {
                getparentlayoutdirection = (getParentLayoutDirection) arrayList2.get(i2);
                abstractSafeParcelable2 = getparentlayoutdirection.IconCompatParcelizer;
                layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 = premeasure0kLqBqw.onPanelClosed;
                if (setcomposedwithreusablecontenthost.write(str2, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2)) {
                    str4 = getparentlayoutdirection.read;
                    if (!TextUtils.isEmpty(str4)) {
                        zzrVar3 = new zzr(zzrVar3.RatingCompat, zzrVar3.MediaBrowserCompatMediaItem, str4, getparentlayoutdirection.write, zzrVar3.MediaDescriptionCompat, zzrVar3.MediaMetadataCompat, zzrVar3.PlaybackStateCompatCustomAction, zzrVar3.MediaSessionCompatToken, zzrVar3.ParcelableVolumeInfo, zzrVar3.PlaybackStateCompat, zzrVar3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, zzrVar3.ComponentActivity, zzrVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, zzrVar3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, zzrVar3.ResultReceiver, zzrVar3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, zzrVar3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, zzrVar3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, zzrVar3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, zzrVar3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, zzrVar3.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, zzrVar3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, zzrVar3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, zzrVar3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, zzrVar3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, zzrVar3._init_lambda2, zzrVar3.serializer, zzrVar3.RemoteActionCompatParcelizer, zzrVar3.write, zzrVar3.read, zzrVar3.IconCompatParcelizer);
                    }
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zWrite) {
                        accessgettvinputcomposite1cp.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        accessgettvinputcomposite1cp.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                    iscomplete.read((zzbg) abstractSafeParcelable2, zzrVar3);
                    if (zWrite) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate3 = getlookaheaddelegate;
                        getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("Logging telemetry for logEvent from database");
                        accessgetTvTeletextcp accessgettvteletextcpWrite6 = accessgetTvTeletextcp.write(lookaheadScopeKtLookaheadScope221);
                        accessgettvinputcomposite1cp.getClass();
                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                        accessgettvinputcomposite1cp.getClass();
                        z = zWrite;
                        accessgettvteletextcpWrite6.IconCompatParcelizer(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis7);
                    } else {
                        getlookaheaddelegate3 = getlookaheaddelegate;
                        z = zWrite;
                    }
                    getlookaheaddelegate2 = getlookaheaddelegate3;
                } else {
                    getlookaheaddelegate2 = getlookaheaddelegate;
                    z = zWrite;
                    if (abstractSafeParcelable2 instanceof zzpl) {
                        iscomplete.IconCompatParcelizer((zzpl) abstractSafeParcelable2, zzrVar3);
                    } else {
                        if (abstractSafeParcelable2 instanceof zzah) {
                            iscomplete.read((zzah) abstractSafeParcelable2, zzrVar3);
                        } else {
                            str3 = null;
                            if (setcomposedwithreusablecontenthost.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2)) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Discarding data. Unrecognized parcel type.");
                            } else {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        str2 = str3;
                        zWrite = z;
                        i2++;
                        getlookaheaddelegate = getlookaheaddelegate2;
                    }
                }
                str3 = null;
                str2 = str3;
                zWrite = z;
                i2++;
                getlookaheaddelegate = getlookaheaddelegate2;
            }
            i5 = i6 + 1;
            i4 = size;
            setcomposedwithreusablecontenthost2 = setcomposedwithreusablecontenthost;
            lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope221;
            accessgettvinputcomposite1cp2 = accessgettvinputcomposite1cp;
            i3 = 100;
            getlookaheaddelegate4 = getlookaheaddelegate;
        }
    }

    public setViewportBounds(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.RatingCompat = new getCacheFileSuffixlambda0(lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        this.serializer = new setCallback(this);
        this.IconCompatParcelizer = new getLastResult(this, lookaheadScopeKtLookaheadScope221, 0);
        this.MediaBrowserCompatMediaItem = new getLastResult(this, lookaheadScopeKtLookaheadScope221, 1);
    }
}
