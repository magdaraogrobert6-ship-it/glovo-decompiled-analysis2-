package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.oss_licenses.zzg;
import com.google.android.gms.tasks.zzw;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;
import o.OnPlacedElement;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPad6cp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvTeletextcp;
import o.getAlignmentLinesMap;
import o.getBackEK5gGoQ;
import o.getLocalPinnableContainer;
import o.getMeasuredSizeYbymL2g;
import o.getNativeFilterQuality;
import o.getNativeStrokeJoin;
import o.getNativeStrokeMiterLimit;
import o.getNativeStrokeWidth;
import o.getOnPlaced;
import o.setCompositionContext;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm {
    public boolean IconCompatParcelizer;
    public getNativeStrokeJoin MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public final Object MediaSessionCompatToken;
    public volatile getNativeFilterQuality PlaybackStateCompat;
    public Executor RatingCompat;
    public final Context RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public volatile getNativeFilterQuality serializer;
    public boolean write;

    public final Object serializer() {
        int iIndexOf;
        int i = this.read;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Object obj = this.MediaSessionCompatToken;
        int i2 = 0;
        if (i != 0) {
            Iterator it = ((Set) obj).iterator();
            if (it.hasNext()) {
                ((accessgetNumPad6cp) it.next()).getClass();
                getAlignmentLinesMap.write();
                return null;
            }
            try {
                ((Semaphore) this.MediaSessionCompatResultReceiverWrapper).tryAcquire(0, 5L, timeUnit);
                return null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        String[] strArrSplit = setCompositionContext.serializer(this.RemoteActionCompatParcelizer.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf2 = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf2).split(":");
            if (strArrSplit2.length != 2 || iIndexOf2 <= 0) {
                Object[] objArr = {str};
                StringBuilder sb = new StringBuilder(50);
                char c = 0;
                int i3 = 0;
                while (c <= 0 && (iIndexOf = "Invalid license meta-data line:\n%s".indexOf("%s", i3)) != -1) {
                    sb.append((CharSequence) "Invalid license meta-data line:\n%s", i3, iIndexOf);
                    sb.append(objArr[0]);
                    i3 = iIndexOf + 2;
                    c = 1;
                }
                sb.append((CharSequence) "Invalid license meta-data line:\n%s", i3, 34);
                if (c <= 0) {
                    sb.append(" [");
                    sb.append(objArr[0]);
                    sb.append(']');
                }
                throw new IllegalStateException(sb.toString());
            }
            arrayList.add(new zzg(str.substring(iIndexOf2 + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        OnPlacedElement onPlacedElement = ((getOnPlaced) obj).IconCompatParcelizer;
        zzw zzwVar = onPlacedElement.read(0, new zzh(onPlacedElement, arrayList));
        accessgetSystemNavigationDowncp.serializer(zzwVar, "Task must not be null");
        accessgetSystemNavigationDowncp.serializer(timeUnit, "TimeUnit must not be null");
        getMeasuredSizeYbymL2g getmeasuredsizeybyml2g = new getMeasuredSizeYbymL2g();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls(getmeasuredsizeybyml2g);
        getBackEK5gGoQ getbackek5ggoq = new getBackEK5gGoQ(Looper.getMainLooper(), 4);
        getbackek5ggoq.postDelayed(new getLocalPinnableContainer(i2, parentDataModifierDefaultImpls), ConstantKt.DEFAULT_REQUEST_TIMEOUT);
        zzwVar.addOnCompleteListener(new accessgetTvTeletextcp(getbackek5ggoq, parentDataModifierDefaultImpls, getmeasuredsizeybyml2g, 22));
        zzw zzwVar2 = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        try {
            LazyKt__LazyJVMKt.read(zzwVar2);
            return zzwVar2.isSuccessful() ? (List) zzwVar2.getResult() : arrayList;
        } catch (InterruptedException | ExecutionException e) {
            SentryLogcatAdapter.IconCompatParcelizer("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e.getMessage())));
            return arrayList;
        }
    }

    public zzm(Context context) {
        this.MediaDescriptionCompat = false;
        this.IconCompatParcelizer = false;
        this.MediaMetadataCompat = true;
        this.write = false;
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.PlaybackStateCompat != null) {
            boolean z = this.MediaDescriptionCompat;
            if (!z) {
                if (z) {
                    IconCompatParcelizer();
                } else {
                    this.write = true;
                }
            }
            getNativeFilterQuality getnativefilterquality = this.serializer;
            getNativeFilterQuality getnativefilterquality2 = this.PlaybackStateCompat;
            if (getnativefilterquality != null) {
                getnativefilterquality2.getClass();
                this.PlaybackStateCompat = null;
                return;
            }
            getnativefilterquality2.getClass();
            getNativeFilterQuality getnativefilterquality3 = this.PlaybackStateCompat;
            getnativefilterquality3.serializer.set(true);
            if (getnativefilterquality3.read.cancel(false)) {
                this.serializer = this.PlaybackStateCompat;
            }
            this.PlaybackStateCompat = null;
        }
    }

    public final void serializer(Object obj) {
        getNativeStrokeJoin getnativestrokejoin = this.MediaBrowserCompatMediaItem;
        if (getnativestrokejoin != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                getnativestrokejoin.RemoteActionCompatParcelizer(obj);
            } else {
                getnativestrokejoin.serializer(obj);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        return af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, "}", sb);
    }

    public final void write() {
        if (this.serializer != null || this.PlaybackStateCompat == null) {
            return;
        }
        this.PlaybackStateCompat.getClass();
        if (this.RatingCompat == null) {
            this.RatingCompat = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        getNativeFilterQuality getnativefilterquality = this.PlaybackStateCompat;
        Executor executor = this.RatingCompat;
        if (getnativefilterquality.RemoteActionCompatParcelizer == getNativeStrokeWidth.PENDING) {
            getnativefilterquality.RemoteActionCompatParcelizer = getNativeStrokeWidth.RUNNING;
            executor.execute(getnativefilterquality.read);
            return;
        }
        int i = getNativeStrokeMiterLimit.serializer[getnativefilterquality.RemoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot execute task: the task is already running.");
        } else if (i != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("We should never reach this state");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer();
        this.PlaybackStateCompat = new getNativeFilterQuality(this);
        write();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzm(Context context, Set set) {
        this(context);
        this.read = 1;
        this.MediaSessionCompatResultReceiverWrapper = new Semaphore(0);
        this.MediaSessionCompatToken = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzm(Context context, getOnPlaced getonplaced) {
        this(context.getApplicationContext());
        this.read = 0;
        this.MediaSessionCompatToken = getonplaced;
    }
}
