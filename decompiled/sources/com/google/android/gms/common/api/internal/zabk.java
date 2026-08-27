package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import androidx.cardview.widget.CardView$1;
import androidx.core.provider.CallbackWrapper$2;
import androidx.emoji2.text.EmojiProcessor;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.signin.internal.SignInClientImpl;
import io.sentry.SentryClient;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.TuplesKt;
import o.ImageKt;
import o.OnRemeasuredModifier;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPad4cp;
import o.accessgetNumPad7cp;
import o.accessgetNumPadDeletecp;
import o.accessgetNumPadDividecp;
import o.accessgetNumPadEntercp;
import o.accessgetOnecp;
import o.accessgetPageDowncp;
import o.accessgetPairingcp;
import o.accessgetPeriodcp;
import o.accessgetProfileSwitchcp;
import o.accessgetProgramRedcp;
import o.accessgetScp;
import o.accessgetSoftSleepcp;
import o.accessgetSystemNavigationDowncp;
import o.createnHHXs2Y;
import o.getBackEK5gGoQ;
import o.getExponentimpl;
import o.onSizeChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class zabk implements accessgetNumPad4cp, accessgetNumPadDeletecp {
    public final accessgetNumPadDividecp IconCompatParcelizer;
    public final zacl MediaBrowserCompatMediaItem;
    public final int MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public final accessgetScp RemoteActionCompatParcelizer;
    public final /* synthetic */ GoogleApiManager read;
    public final CardView$1 serializer;
    public final LinkedList write = new LinkedList();
    public final HashSet MediaMetadataCompat = new HashSet();
    public final HashMap MediaDescriptionCompat = new HashMap();
    public final ArrayList ParcelableVolumeInfo = new ArrayList();
    public ConnectionResult PlaybackStateCompat = null;
    public int MediaSessionCompatResultReceiverWrapper = 0;

    @Override // o.accessgetNumPadDeletecp
    public final void write(ConnectionResult connectionResult) {
        RemoteActionCompatParcelizer(connectionResult, null);
    }

    public final void IconCompatParcelizer() {
        LinkedList linkedList = this.write;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.RemoteActionCompatParcelizer.ParcelableVolumeInfo()) {
                return;
            }
            if (IconCompatParcelizer(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    @Override // o.accessgetNumPad4cp
    public final void IconCompatParcelizer(int i) {
        GoogleApiManager googleApiManager = this.read;
        if (Looper.myLooper() == googleApiManager.ComponentActivity.getLooper()) {
            read(i);
        } else {
            googleApiManager.ComponentActivity.post(new CallbackWrapper$2(this, i, 2));
        }
    }

    public final boolean IconCompatParcelizer(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.write) {
            GoogleApiManager googleApiManager = this.read;
            if (googleApiManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || !googleApiManager.ResultReceiver.contains(this.IconCompatParcelizer)) {
                return false;
            }
            googleApiManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(connectionResult, this.MediaSessionCompatQueueItem);
            return true;
        }
    }

    public final void MediaSessionCompatQueueItem() {
        GoogleApiManager googleApiManager = this.read;
        accessgetSystemNavigationDowncp.write(googleApiManager.ComponentActivity);
        accessgetScp accessgetscp = this.RemoteActionCompatParcelizer;
        accessgetScp accessgetscp2 = accessgetscp;
        if (accessgetscp2.ParcelableVolumeInfo() || accessgetscp2.PlaybackStateCompatCustomAction()) {
            return;
        }
        try {
            int i = googleApiManager.MediaSessionCompatToken.read(googleApiManager.MediaDescriptionCompat, accessgetscp);
            if (i != 0) {
                ConnectionResult connectionResult = new ConnectionResult(i, null, null);
                String name = accessgetscp.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", sb.toString());
                RemoteActionCompatParcelizer(connectionResult, null);
                return;
            }
            SentryClient sentryClient = new SentryClient(googleApiManager, accessgetscp, this.IconCompatParcelizer);
            if (accessgetscp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
                zacl zaclVar = this.MediaBrowserCompatMediaItem;
                accessgetSystemNavigationDowncp.IconCompatParcelizer(zaclVar);
                SignInClientImpl signInClientImpl = zaclVar.MediaSessionCompatQueueItem;
                if (signInClientImpl != null) {
                    signInClientImpl.serializer();
                }
                MetricsBatchProcessor metricsBatchProcessor = zaclVar.MediaDescriptionCompat;
                metricsBatchProcessor.IconCompatParcelizer = Integer.valueOf(System.identityHashCode(zaclVar));
                onSizeChanged onsizechanged = zaclVar.read;
                Context context = zaclVar.IconCompatParcelizer;
                Handler handler = zaclVar.RemoteActionCompatParcelizer;
                zaclVar.MediaSessionCompatQueueItem = (SignInClientImpl) onsizechanged.IconCompatParcelizer(context, handler.getLooper(), metricsBatchProcessor, (OnRemeasuredModifier) metricsBatchProcessor.MediaSessionCompatQueueItem, zaclVar, zaclVar);
                zaclVar.MediaMetadataCompat = sentryClient;
                Set set = zaclVar.serializer;
                if (set == null || set.isEmpty()) {
                    handler.post(new com.google.android.gms.stats.zza(zaclVar));
                } else {
                    zaclVar.MediaSessionCompatQueueItem.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                }
            }
            try {
                accessgetscp2.MediaMetadataCompat = sentryClient;
                accessgetscp2.RemoteActionCompatParcelizer(2, null);
            } catch (SecurityException e) {
                RemoteActionCompatParcelizer(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            RemoteActionCompatParcelizer(new ConnectionResult(10, null, null), e2);
        }
    }

    @Override // o.accessgetNumPad4cp
    public final void RemoteActionCompatParcelizer() {
        GoogleApiManager googleApiManager = this.read;
        if (Looper.myLooper() == googleApiManager.ComponentActivity.getLooper()) {
            write();
        } else {
            googleApiManager.ComponentActivity.post(new com.google.android.gms.stats.zza(12, this));
        }
    }

    public final void RemoteActionCompatParcelizer(ConnectionResult connectionResult) {
        String str;
        HashSet<accessgetProgramRedcp> hashSet = this.MediaMetadataCompat;
        for (accessgetProgramRedcp accessgetprogramredcp : hashSet) {
            if (TuplesKt.write(connectionResult, ConnectionResult.write)) {
                accessgetScp accessgetscp = this.RemoteActionCompatParcelizer;
                if (!accessgetscp.ParcelableVolumeInfo() || accessgetscp.MediaBrowserCompatMediaItem == null) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Failed to connect when checking package");
                    return;
                }
                str = "com.google.android.gms";
            } else {
                str = null;
            }
            accessgetprogramredcp.IconCompatParcelizer(this.IconCompatParcelizer, connectionResult, str);
        }
        hashSet.clear();
    }

    public final void RemoteActionCompatParcelizer(ConnectionResult connectionResult, RuntimeException runtimeException) {
        SignInClientImpl signInClientImpl;
        GoogleApiManager googleApiManager = this.read;
        accessgetSystemNavigationDowncp.write(googleApiManager.ComponentActivity);
        zacl zaclVar = this.MediaBrowserCompatMediaItem;
        if (zaclVar != null && (signInClientImpl = zaclVar.MediaSessionCompatQueueItem) != null) {
            signInClientImpl.serializer();
        }
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        this.PlaybackStateCompat = null;
        SparseIntArray sparseIntArray = (SparseIntArray) googleApiManager.MediaSessionCompatToken.write;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        RemoteActionCompatParcelizer(connectionResult);
        if ((this.RemoteActionCompatParcelizer instanceof accessgetSoftSleepcp) && connectionResult.IconCompatParcelizer != 24) {
            googleApiManager.MediaSessionCompatQueueItem = true;
            getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
            getbackek5ggoq.sendMessageDelayed(getbackek5ggoq.obtainMessage(19), 300000L);
        }
        int i = connectionResult.IconCompatParcelizer;
        if (i == 4) {
            read(GoogleApiManager.IconCompatParcelizer);
            return;
        }
        if (i == 25) {
            read(GoogleApiManager.read(this.IconCompatParcelizer, connectionResult));
            return;
        }
        LinkedList linkedList = this.write;
        if (linkedList.isEmpty()) {
            this.PlaybackStateCompat = connectionResult;
            return;
        }
        if (runtimeException != null) {
            accessgetSystemNavigationDowncp.write(googleApiManager.ComponentActivity);
            write(null, runtimeException, false);
            return;
        }
        boolean z = googleApiManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        accessgetNumPadDividecp accessgetnumpaddividecp = this.IconCompatParcelizer;
        if (!z) {
            read(GoogleApiManager.read(accessgetnumpaddividecp, connectionResult));
            return;
        }
        write(GoogleApiManager.read(accessgetnumpaddividecp, connectionResult), null, true);
        if (linkedList.isEmpty() || IconCompatParcelizer(connectionResult) || googleApiManager.write(connectionResult, this.MediaSessionCompatQueueItem)) {
            return;
        }
        if (connectionResult.IconCompatParcelizer == 18) {
            this.RatingCompat = true;
        }
        if (!this.RatingCompat) {
            read(GoogleApiManager.read(accessgetnumpaddividecp, connectionResult));
        } else {
            getBackEK5gGoQ getbackek5ggoq2 = googleApiManager.ComponentActivity;
            getbackek5ggoq2.sendMessageDelayed(Message.obtain(getbackek5ggoq2, 9, accessgetnumpaddividecp), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        }
    }

    public final void read() {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        Status status = GoogleApiManager.RemoteActionCompatParcelizer;
        read(status);
        this.serializer.RemoteActionCompatParcelizer(false, status);
        for (accessgetNumPadEntercp accessgetnumpadentercp : (accessgetNumPadEntercp[]) this.MediaDescriptionCompat.keySet().toArray(new accessgetNumPadEntercp[0])) {
            read(new accessgetProfileSwitchcp(accessgetnumpadentercp, new ParentDataModifierDefaultImpls()));
        }
        RemoteActionCompatParcelizer(new ConnectionResult(4, null, null));
        if (this.RemoteActionCompatParcelizer.ParcelableVolumeInfo()) {
            getExponentimpl getexponentimpl = new getExponentimpl(21, this);
            ((zabk) getexponentimpl.read).read.ComponentActivity.post(new com.google.android.gms.stats.zza(13, getexponentimpl));
        }
    }

    public final void read(int i) {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        this.PlaybackStateCompat = null;
        this.RatingCompat = true;
        String str = this.RemoteActionCompatParcelizer.MediaSessionCompatToken;
        CardView$1 cardView$1 = this.serializer;
        cardView$1.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        cardView$1.RemoteActionCompatParcelizer(true, new Status(20, sb.toString(), null, null));
        accessgetNumPadDividecp accessgetnumpaddividecp = this.IconCompatParcelizer;
        GoogleApiManager googleApiManager = this.read;
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessageDelayed(Message.obtain(getbackek5ggoq, 9, accessgetnumpaddividecp), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        getBackEK5gGoQ getbackek5ggoq2 = googleApiManager.ComponentActivity;
        getbackek5ggoq2.sendMessageDelayed(Message.obtain(getbackek5ggoq2, 11, accessgetnumpaddividecp), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) googleApiManager.MediaSessionCompatToken.write;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.MediaDescriptionCompat.values().iterator();
        while (it.hasNext()) {
            ((accessgetPeriodcp) it.next()).getClass();
        }
    }

    public final void read(Status status) {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        write(status, null, false);
    }

    public final void read(zai zaiVar) {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        boolean zParcelableVolumeInfo = this.RemoteActionCompatParcelizer.ParcelableVolumeInfo();
        LinkedList linkedList = this.write;
        if (zParcelableVolumeInfo) {
            if (IconCompatParcelizer(zaiVar)) {
                serializer();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.PlaybackStateCompat;
        if (connectionResult == null || connectionResult.IconCompatParcelizer == 0 || connectionResult.serializer == null) {
            MediaSessionCompatQueueItem();
        } else {
            RemoteActionCompatParcelizer(connectionResult, null);
        }
    }

    public final void serializer() {
        GoogleApiManager googleApiManager = this.read;
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        accessgetNumPadDividecp accessgetnumpaddividecp = this.IconCompatParcelizer;
        getbackek5ggoq.removeMessages(12, accessgetnumpaddividecp);
        getBackEK5gGoQ getbackek5ggoq2 = googleApiManager.ComponentActivity;
        getbackek5ggoq2.sendMessageDelayed(getbackek5ggoq2.obtainMessage(12, accessgetnumpaddividecp), googleApiManager.MediaBrowserCompatMediaItem);
    }

    public final void serializer(ConnectionResult connectionResult) {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        accessgetScp accessgetscp = this.RemoteActionCompatParcelizer;
        String name = accessgetscp.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        accessgetScp accessgetscp2 = accessgetscp;
        accessgetscp2.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        RemoteActionCompatParcelizer(connectionResult, null);
    }

    public final void write() {
        accessgetScp accessgetscp = this.RemoteActionCompatParcelizer;
        GoogleApiManager googleApiManager = this.read;
        accessgetSystemNavigationDowncp.write(googleApiManager.ComponentActivity);
        this.PlaybackStateCompat = null;
        RemoteActionCompatParcelizer(ConnectionResult.write);
        if (this.RatingCompat) {
            getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
            accessgetNumPadDividecp accessgetnumpaddividecp = this.IconCompatParcelizer;
            getbackek5ggoq.removeMessages(11, accessgetnumpaddividecp);
            googleApiManager.ComponentActivity.removeMessages(9, accessgetnumpaddividecp);
            this.RatingCompat = false;
        }
        Iterator it = this.MediaDescriptionCompat.values().iterator();
        while (it.hasNext()) {
            accessgetPageDowncp accessgetpagedowncp = ((accessgetPeriodcp) it.next()).read;
            try {
                accessgetpagedowncp.IconCompatParcelizer.write.serializer(accessgetscp, new ParentDataModifierDefaultImpls());
            } catch (DeadObjectException unused) {
                IconCompatParcelizer(3);
                accessgetscp.RemoteActionCompatParcelizer("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e) {
                e = e;
                SentryLogcatAdapter.read("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e2) {
                e = e2;
                SentryLogcatAdapter.read("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        IconCompatParcelizer();
        serializer();
    }

    public final void write(Status status, Exception exc, boolean z) {
        accessgetSystemNavigationDowncp.write(this.read.ComponentActivity);
        if ((status == null) == (exc == null)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Status XOR exception should be null");
            return;
        }
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.MediaSessionCompatQueueItem == 2) {
                if (status != null) {
                    zaiVar.RemoteActionCompatParcelizer(status);
                } else {
                    zaiVar.RemoteActionCompatParcelizer(exc);
                }
                it.remove();
            }
        }
    }

    public zabk(GoogleApiManager googleApiManager, accessgetNumPad7cp accessgetnumpad7cp) {
        this.read = googleApiManager;
        Looper looper = googleApiManager.ComponentActivity.getLooper();
        EmojiProcessor emojiProcessorIconCompatParcelizer = accessgetnumpad7cp.IconCompatParcelizer();
        MetricsBatchProcessor metricsBatchProcessor = new MetricsBatchProcessor((createnHHXs2Y) emojiProcessorIconCompatParcelizer.serializer, (String) emojiProcessorIconCompatParcelizer.read, (String) emojiProcessorIconCompatParcelizer.IconCompatParcelizer);
        UtilsKt utilsKt = accessgetnumpad7cp.RatingCompat.IconCompatParcelizer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(utilsKt);
        accessgetScp accessgetscpIconCompatParcelizer = utilsKt.IconCompatParcelizer(accessgetnumpad7cp.write, looper, metricsBatchProcessor, accessgetnumpad7cp.MediaMetadataCompat, this, this);
        Extras$Key extras$Key = accessgetnumpad7cp.MediaSessionCompatQueueItem;
        if (extras$Key == null || !(accessgetscpIconCompatParcelizer instanceof BaseGmsClient)) {
            String str = accessgetnumpad7cp.MediaDescriptionCompat;
            if (str != null && (accessgetscpIconCompatParcelizer instanceof BaseGmsClient)) {
                accessgetscpIconCompatParcelizer.IconCompatParcelizer = str;
            }
        } else {
            accessgetscpIconCompatParcelizer.RemoteActionCompatParcelizer = extras$Key;
        }
        this.RemoteActionCompatParcelizer = accessgetscpIconCompatParcelizer;
        this.IconCompatParcelizer = accessgetnumpad7cp.MediaBrowserCompatMediaItem;
        this.serializer = new CardView$1(28);
        this.MediaSessionCompatQueueItem = accessgetnumpad7cp.MediaSessionCompatToken;
        if (!accessgetscpIconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
            this.MediaBrowserCompatMediaItem = null;
            return;
        }
        Context context = googleApiManager.MediaDescriptionCompat;
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        EmojiProcessor emojiProcessorIconCompatParcelizer2 = accessgetnumpad7cp.IconCompatParcelizer();
        this.MediaBrowserCompatMediaItem = new zacl(context, getbackek5ggoq, new MetricsBatchProcessor((createnHHXs2Y) emojiProcessorIconCompatParcelizer2.serializer, (String) emojiProcessorIconCompatParcelizer2.read, (String) emojiProcessorIconCompatParcelizer2.IconCompatParcelizer));
    }

    public final boolean IconCompatParcelizer(zai zaiVar) {
        if (!(zaiVar instanceof accessgetPairingcp)) {
            CardView$1 cardView$1 = this.serializer;
            accessgetScp accessgetscp = this.RemoteActionCompatParcelizer;
            zaiVar.serializer(cardView$1, accessgetscp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            try {
                zaiVar.serializer(this);
                return true;
            } catch (DeadObjectException unused) {
                IconCompatParcelizer(1);
                accessgetscp.RemoteActionCompatParcelizer("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        accessgetPairingcp accessgetpairingcp = (accessgetPairingcp) zaiVar;
        Feature[] featureArr = accessgetpairingcp.read(this);
        Feature feature = null;
        if (featureArr != null && featureArr.length != 0) {
            zzj zzjVar = this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
            Feature[] featureArr2 = zzjVar == null ? null : zzjVar.write;
            if (featureArr2 == null) {
                featureArr2 = new Feature[0];
            }
            ImageKt imageKt = new ImageKt(featureArr2.length);
            for (Feature feature2 : featureArr2) {
                imageKt.put(feature2.read, Long.valueOf(feature2.IconCompatParcelizer()));
            }
            for (Feature feature3 : featureArr) {
                Long l = (Long) imageKt.get(feature3.read);
                if (l == null || l.longValue() < feature3.IconCompatParcelizer()) {
                    feature = feature3;
                    break;
                }
            }
        }
        if (feature == null) {
            CardView$1 cardView$2 = this.serializer;
            accessgetScp accessgetscp2 = this.RemoteActionCompatParcelizer;
            zaiVar.serializer(cardView$2, accessgetscp2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            try {
                zaiVar.serializer(this);
                return true;
            } catch (DeadObjectException unused2) {
                IconCompatParcelizer(1);
                accessgetscp2.RemoteActionCompatParcelizer("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.RemoteActionCompatParcelizer.getClass().getName();
        String str = feature.read;
        long jIconCompatParcelizer = feature.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jIconCompatParcelizer).length() + 2);
        c8$$ExternalSyntheticOutline0.m(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jIconCompatParcelizer);
        sb.append(").");
        SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", sb.toString());
        GoogleApiManager googleApiManager = this.read;
        if (!googleApiManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus || !accessgetpairingcp.RemoteActionCompatParcelizer(this)) {
            accessgetpairingcp.RemoteActionCompatParcelizer(new UnsupportedApiCallException(feature));
            return true;
        }
        int iWrite = accessgetpairingcp.write(this);
        accessgetOnecp accessgetonecp = new accessgetOnecp(this.IconCompatParcelizer, feature);
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int iIndexOf = arrayList.indexOf(accessgetonecp);
        if (iIndexOf >= 0) {
            accessgetOnecp accessgetonecp2 = (accessgetOnecp) arrayList.get(iIndexOf);
            googleApiManager.ComponentActivity.removeMessages(15, accessgetonecp2);
            googleApiManager.ComponentActivity.sendMessageDelayed(Message.obtain(googleApiManager.ComponentActivity, 15, accessgetonecp2), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        } else {
            arrayList.add(accessgetonecp);
            googleApiManager.ComponentActivity.sendMessageDelayed(Message.obtain(googleApiManager.ComponentActivity, 15, accessgetonecp), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            googleApiManager.ComponentActivity.sendMessageDelayed(Message.obtain(googleApiManager.ComponentActivity, 16, accessgetonecp), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iWrite));
            if (IconCompatParcelizer(connectionResult)) {
                String str2 = feature.read;
                long jIconCompatParcelizer2 = feature.IconCompatParcelizer();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jIconCompatParcelizer2).length());
                af$$ExternalSyntheticOutline0.m(sb2, "A dialog should be displayed for missing feature: ", str2, ", version: ");
                sb2.append(jIconCompatParcelizer2);
                SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", sb2.toString());
            } else if (googleApiManager.write(connectionResult, this.MediaSessionCompatQueueItem)) {
                String str3 = feature.read;
                long jIconCompatParcelizer3 = feature.IconCompatParcelizer();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jIconCompatParcelizer3).length());
                af$$ExternalSyntheticOutline0.m(sb3, "Notification displayed for missing feature: ", str3, ", version: ");
                sb3.append(jIconCompatParcelizer3);
                SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", sb3.toString());
            }
        }
        return false;
    }
}
