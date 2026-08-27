package o;

import com.google.protobuf.GeneratedMessageLite;
import com.huawei.hmf.tasks.a.d$a;
import com.huawei.location.ut;
import io.grpc.CallOptions$Builder;
import io.grpc.Status;
import io.grpc.internal.CallTracer;
import io.sentry.CombinedScopeView;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class replacePrefetchedUrlsWithLocalAssetslambda1 implements r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 {
    public static final Status RemoteActionCompatParcelizer;
    public static final Random read;
    public static final ReflectionUtils serializer;
    public static final ReflectionUtils write;
    public r8lambda6LGSESzBuanebUADYycWZpXP5Kw ComponentActivity;
    public final Executor IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA MediaDescriptionCompat;
    public final JsonObjectSerializer MediaMetadataCompat;
    public Status MediaSessionCompatQueueItem;
    public final AtomicInteger MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public final r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ PlaybackStateCompat;
    public final getMethodQuietlylambda1 PlaybackStateCompatCustomAction;
    public final applyDisplayCutoutMarginsToContentArealambda0 RatingCompat;
    public final Object ResultReceiver;
    public final markPageFinishedlambda00 _init_lambda1;
    public final /* synthetic */ setResourcePackageName _init_lambda2;
    public final /* synthetic */ mergeJsonObjectslambda10 _init_lambda3;
    public final /* synthetic */ SentryClient _init_lambda4;
    public long r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final AtomicInteger r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final SentryClient r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public long r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final AtomicBoolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final onPageFinishedlambda00 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public CombinedScopeView r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ut r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final ScheduledExecutorService r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public volatile handleQueryAction r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final /* synthetic */ scale0AR0LA0default r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public ut r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    static {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        write = new ReflectionUtils("grpc-previous-rpc-attempts", r8lambdakctilwmporjfcawe8asdqv1ks);
        serializer = new ReflectionUtils("grpc-retry-pushback-ms", r8lambdakctilwmporjfcawe8asdqv1ks);
        RemoteActionCompatParcelizer = Status.RemoteActionCompatParcelizer.IconCompatParcelizer("Stream thrown away because RetriableStream committed");
        read = new Random();
    }

    public final void IconCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (!handlequeryaction.MediaDescriptionCompat) {
            write(new appendBridgeJavascriptlambda0(this, generatedMessageLite));
            return;
        }
        r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 = handlequeryaction.MediaMetadataCompat.IconCompatParcelizer;
        monthFromInt monthfromint = (monthFromInt) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write;
        monthfromint.getClass();
        r8lambda7hj8zhiew8owwyp0e05lxeu0sn0.RemoteActionCompatParcelizer(new setDateOfBirthlambda3(generatedMessageLite, monthfromint.read));
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final boolean IconCompatParcelizer() {
        Iterator it = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read.iterator();
        while (it.hasNext()) {
            if (((handleUrlOverridelambda00) it.next()).IconCompatParcelizer.IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    public final getClearEK5gGoQ RemoteActionCompatParcelizer(handleUrlOverridelambda00 handleurloverridelambda00) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.ResultReceiver) {
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat != null) {
                return null;
            }
            Collection collection = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read;
            handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            TextStreamsKt.RemoteActionCompatParcelizer("Already committed", handlequeryaction.MediaMetadataCompat == null);
            List list2 = handlequeryaction.IconCompatParcelizer;
            if (handlequeryaction.read.contains(handleurloverridelambda00)) {
                list = null;
                collectionSingleton = Collections.singleton(handleurloverridelambda00);
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new handleQueryAction(list, collectionSingleton, handlequeryaction.RemoteActionCompatParcelizer, handleurloverridelambda00, handlequeryaction.write, z, handlequeryaction.MediaSessionCompatQueueItem, handlequeryaction.serializer);
            ((AtomicLong) this.MediaMetadataCompat.jsonReflectionObjectSerializer).addAndGet(-this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            ut utVar = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (utVar != null) {
                Future futureResultReceiver = utVar.ResultReceiver();
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
                future = futureResultReceiver;
            } else {
                future = null;
            }
            ut utVar2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (utVar2 != null) {
                Future futureResultReceiver2 = utVar2.ResultReceiver();
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                future2 = futureResultReceiver2;
            } else {
                future2 = null;
            }
            return new getClearEK5gGoQ(this, collection, handleurloverridelambda00, future, future2, 1);
        }
    }

    public final handleUrlOverridelambda00 RemoteActionCompatParcelizer(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.MediaSessionCompatResultReceiverWrapper;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        handleUrlOverridelambda00 handleurloverridelambda00 = new handleUrlOverridelambda00(i);
        r8lambdavHE4ELXpOL1zqc0uBl_3ys0Zrw r8lambdavhe4elxpol1zqc0ubl_3ys0zrw = new r8lambdavHE4ELXpOL1zqc0uBl_3ys0Zrw(new appendBridgeJavascript(this, handleurloverridelambda00));
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.write(this.MediaDescriptionCompat);
        if (i > 0) {
            r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(write, String.valueOf(i));
        }
        mergeJsonObjectslambda10 mergejsonobjectslambda10 = this._init_lambda3;
        mergejsonobjectslambda10.getClass();
        List list = mergejsonobjectslambda10.MediaDescriptionCompat;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(r8lambdavhe4elxpol1zqc0ubl_3ys0zrw);
        CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda10);
        callOptions$BuilderRemoteActionCompatParcelizer.MediaMetadataCompat = Collections.unmodifiableList(arrayList);
        mergeJsonObjectslambda10 mergejsonobjectslambda11 = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
        JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.read(mergejsonobjectslambda11, r8lambdaqn1du6uas6agx4srbugfttxtpwa, i, z);
        SentryClient sentryClient = this._init_lambda4;
        r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzanoIconCompatParcelizer = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(new r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda11));
        setResourcePackageName setresourcepackagename = this._init_lambda2;
        setResourcePackageName setresourcepackagenameIconCompatParcelizer = setresourcepackagename.IconCompatParcelizer();
        try {
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer = r8lambdahmza2hwvd2qpednmehrxqzjzanoIconCompatParcelizer.IconCompatParcelizer(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda11, jsonUtilsExternalSyntheticLambda1Arr);
            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            handleurloverridelambda00.IconCompatParcelizer = r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer;
            return handleurloverridelambda00;
        } catch (Throwable th) {
            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Future future;
        synchronized (this.ResultReceiver) {
            ut utVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            future = null;
            if (utVar != null) {
                Future futureResultReceiver = utVar.ResultReceiver();
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                future = futureResultReceiver;
            }
            handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (!handlequeryaction.MediaSessionCompatQueueItem) {
                handlequeryaction = new handleQueryAction(handlequeryaction.IconCompatParcelizer, handlequeryaction.read, handlequeryaction.RemoteActionCompatParcelizer, handlequeryaction.MediaMetadataCompat, handlequeryaction.write, handlequeryaction.MediaDescriptionCompat, true, handlequeryaction.serializer);
            }
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = handlequeryaction;
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read() {
        handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (handlequeryaction.MediaDescriptionCompat) {
            handlequeryaction.MediaMetadataCompat.IconCompatParcelizer.read();
        } else {
            write(new r8lambdaJurddeq3gIrDF0atktArM8gcyTE(0));
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read(int i) {
        handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (handlequeryaction.MediaDescriptionCompat) {
            handlequeryaction.MediaMetadataCompat.IconCompatParcelizer.read(i);
        } else {
            write(new r8lambdaBxbcmp_c5wlUBK8kpjFZ8DfJXJE(i));
        }
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void read(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        Status status;
        ut utVar;
        markPageFinishedlambda00 markpagefinishedlambda00;
        this.ComponentActivity = r8lambda6lgseszbuanebuadyycwzpxp5kw;
        CallTracer callTracer = ((hasTooManyZipEntrieslambda0) this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer).getDefaultViewModelCreationExtras;
        synchronized (callTracer.RemoteActionCompatParcelizer) {
            status = (Status) callTracer.serializer;
            utVar = null;
            if (status == null) {
                ((HashSet) callTracer.write).add(this);
                status = null;
            }
        }
        if (status != null) {
            RemoteActionCompatParcelizer(status);
            return;
        }
        synchronized (this.ResultReceiver) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.IconCompatParcelizer.add(new handleQueryActionlambda0(this));
        }
        handleUrlOverridelambda00 handleurloverridelambda00RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, false);
        if (handleurloverridelambda00RemoteActionCompatParcelizer == null) {
            return;
        }
        if (this.MediaSessionCompatToken) {
            synchronized (this.ResultReceiver) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer(handleurloverridelambda00RemoteActionCompatParcelizer);
                if (serializer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) && ((markpagefinishedlambda00 = this._init_lambda1) == null || markpagefinishedlambda00.read.get() > markpagefinishedlambda00.IconCompatParcelizer)) {
                    utVar = new ut(15, this.ResultReceiver);
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = utVar;
                }
            }
            if (utVar != null) {
                utVar.RemoteActionCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.schedule(new d$a(this, 16, utVar), this.PlaybackStateCompat.write, TimeUnit.NANOSECONDS));
            }
        }
        serializer(handleurloverridelambda00RemoteActionCompatParcelizer);
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        handleQueryAction handlequeryaction;
        synchronized (this.ResultReceiver) {
            applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(this.RatingCompat, "closed");
            handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        }
        if (handlequeryaction.MediaMetadataCompat != null) {
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda1 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
            handlequeryaction.MediaMetadataCompat.IconCompatParcelizer.serializer(applydisplaycutoutmarginstocontentarealambda1);
            applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(applydisplaycutoutmarginstocontentarealambda1, "committed");
            return;
        }
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda2 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
        for (handleUrlOverridelambda00 handleurloverridelambda00 : handlequeryaction.read) {
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda3 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
            handleurloverridelambda00.IconCompatParcelizer.serializer(applydisplaycutoutmarginstocontentarealambda3);
            applydisplaycutoutmarginstocontentarealambda2.write.add(String.valueOf(applydisplaycutoutmarginstocontentarealambda3));
        }
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(applydisplaycutoutmarginstocontentarealambda2, "open");
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void write() {
        write(new r8lambdalTZ4VTtAvQdx5VNFexaacO7lT40());
    }

    public final void write(accessmarkPageFinished accessmarkpagefinished) {
        Collection collection;
        synchronized (this.ResultReceiver) {
            if (!this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaDescriptionCompat) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.IconCompatParcelizer.add(accessmarkpagefinished);
            }
            collection = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            accessmarkpagefinished.serializer((handleUrlOverridelambda00) it.next());
        }
    }

    public static void write(replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            replaceprefetchedurlswithlocalassetslambda1.RemoteActionCompatParcelizer();
            return;
        }
        synchronized (replaceprefetchedurlswithlocalassetslambda1.ResultReceiver) {
            ut utVar = replaceprefetchedurlswithlocalassetslambda1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (utVar == null) {
                return;
            }
            Future futureResultReceiver = utVar.ResultReceiver();
            ut utVar2 = new ut(15, replaceprefetchedurlswithlocalassetslambda1.ResultReceiver);
            replaceprefetchedurlswithlocalassetslambda1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = utVar2;
            if (futureResultReceiver != null) {
                futureResultReceiver.cancel(false);
            }
            utVar2.RemoteActionCompatParcelizer(replaceprefetchedurlswithlocalassetslambda1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.schedule(new d$a(replaceprefetchedurlswithlocalassetslambda1, 16, utVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void IconCompatParcelizer(int i) {
        write(new r8lambdalMyb9s4KsbMwU0t8igSBvjebqMo(i, 0));
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void IconCompatParcelizer(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        write(new r8lambdaWLKIZ7ypvvIviMaIlzgJo9E80J0(1, r8lambdakctilwmporjfcawe8asdqv1ks));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void RemoteActionCompatParcelizer(Status status) {
        handleUrlOverridelambda00 handleurloverridelambda00;
        handleUrlOverridelambda00 handleurloverridelambda01 = new handleUrlOverridelambda00(0);
        handleurloverridelambda01.IconCompatParcelizer = new r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8();
        getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(handleurloverridelambda01);
        Object obj = this.ResultReceiver;
        if (getclearek5ggoqRemoteActionCompatParcelizer != null) {
            synchronized (obj) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write(handleurloverridelambda01);
            }
            getclearek5ggoqRemoteActionCompatParcelizer.run();
            write(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
            return;
        }
        synchronized (obj) {
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read.contains(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat)) {
                handleurloverridelambda00 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat;
            } else {
                this.MediaSessionCompatQueueItem = status;
                handleurloverridelambda00 = null;
            }
            handleQueryAction handlequeryaction = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new handleQueryAction(handlequeryaction.IconCompatParcelizer, handlequeryaction.read, handlequeryaction.RemoteActionCompatParcelizer, handlequeryaction.MediaMetadataCompat, true, handlequeryaction.MediaDescriptionCompat, handlequeryaction.MediaSessionCompatQueueItem, handlequeryaction.serializer);
        }
        if (handleurloverridelambda00 != null) {
            handleurloverridelambda00.IconCompatParcelizer.RemoteActionCompatParcelizer(status);
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void serializer() {
        write(new r8lambdaJurddeq3gIrDF0atktArM8gcyTE(1));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(int i) {
        write(new r8lambdalMyb9s4KsbMwU0t8igSBvjebqMo(i, 1));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs r8lambda5t3l_1jntlbjtf0fr47kg54a0bs) {
        write(new r8lambdaWLKIZ7ypvvIviMaIlzgJo9E80J0(2, r8lambda5t3l_1jntlbjtf0fr47kg54a0bs));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty) {
        write(new r8lambdaWLKIZ7ypvvIviMaIlzgJo9E80J0(0, r8lambda9bwhxitij38r9epvsmivfryty));
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void RemoteActionCompatParcelizer(setDateOfBirthlambda3 setdateofbirthlambda3) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r4 = (o.accessmarkPageFinished) r0.next();
        r4.serializer(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if ((r4 instanceof o.handleQueryActionlambda0) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r4 = r8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        r5 = r4.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        if (r5 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        if (r5 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        if (r4.write == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serializer(o.handleUrlOverridelambda00 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.ResultReceiver
            monitor-enter(r4)
            o.handleQueryAction r5 = r8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw     // Catch: java.lang.Throwable -> Lb0
            o.handleUrlOverridelambda00 r6 = r5.MediaMetadataCompat     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L11
            if (r6 == r9) goto L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            goto L35
        L11:
            boolean r6 = r5.write     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L17
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            goto L35
        L17:
            java.util.List r6 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb0
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lb0
            if (r0 != r6) goto L5b
            o.handleQueryAction r0 = r5.write(r9)     // Catch: java.lang.Throwable -> Lb0
            r8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r0     // Catch: java.lang.Throwable -> Lb0
            boolean r0 = r8.IconCompatParcelizer()     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L2d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            return
        L2d:
            o.isAutomaticGeofenceRequestsEnabled r1 = new o.isAutomaticGeofenceRequestsEnabled     // Catch: java.lang.Throwable -> Lb0
            r0 = 15
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
        L35:
            if (r1 == 0) goto L3d
            o.getMethodQuietlylambda1 r9 = r8.PlaybackStateCompatCustomAction
            r9.execute(r1)
            return
        L3d:
            if (r2 != 0) goto L4a
            o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r0 = r9.IconCompatParcelizer
            o.logPurchaseWithJSONlambda0 r1 = new o.logPurchaseWithJSONlambda0
            r2 = 4
            r1.<init>(r8, r2, r9)
            r0.read(r1)
        L4a:
            o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r0 = r9.IconCompatParcelizer
            o.handleQueryAction r1 = r8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            o.handleUrlOverridelambda00 r1 = r1.MediaMetadataCompat
            if (r1 != r9) goto L55
            io.grpc.Status r9 = r8.MediaSessionCompatQueueItem
            goto L57
        L55:
            io.grpc.Status r9 = o.replacePrefetchedUrlsWithLocalAssetslambda1.RemoteActionCompatParcelizer
        L57:
            r0.RemoteActionCompatParcelizer(r9)
            return
        L5b:
            boolean r6 = r9.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            return
        L61:
            java.util.List r6 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb0
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lb0
            int r7 = r0 + 128
            int r6 = java.lang.Math.min(r7, r6)     // Catch: java.lang.Throwable -> Lb0
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb0
            java.util.List r5 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb0
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.List r5 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb0
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> Lb0
            r3.addAll(r0)     // Catch: java.lang.Throwable -> Lb0
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            o.accessmarkPageFinished r4 = (o.accessmarkPageFinished) r4
            r4.serializer(r9)
            boolean r4 = r4 instanceof o.handleQueryActionlambda0
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            o.handleQueryAction r4 = r8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            o.handleUrlOverridelambda00 r5 = r4.MediaMetadataCompat
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.write
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.replacePrefetchedUrlsWithLocalAssetslambda1.serializer(o.handleUrlOverridelambda00):void");
    }

    public final boolean serializer(handleQueryAction handlequeryaction) {
        return handlequeryaction.MediaMetadataCompat == null && handlequeryaction.serializer < this.PlaybackStateCompat.RemoteActionCompatParcelizer && !handlequeryaction.MediaSessionCompatQueueItem;
    }

    public final void write(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new CombinedScopeView(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 26);
        if (this.MediaSessionCompatResultReceiverWrapper.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.PlaybackStateCompatCustomAction.execute(new r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(this, status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 0));
        }
    }

    public replacePrefetchedUrlsWithLocalAssetslambda1(scale0AR0LA0default scale0ar0la0default, SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, onPageFinishedlambda00 onpagefinishedlambda00, r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ r8lambdan5r2kbwv2mtd2em1qhanll_mq, setResourcePackageName setresourcepackagename) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = scale0ar0la0default;
        this._init_lambda4 = sentryClient;
        this._init_lambda3 = mergejsonobjectslambda10;
        this._init_lambda2 = setresourcepackagename;
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) scale0ar0la0default.IconCompatParcelizer;
        JsonObjectSerializer jsonObjectSerializer = hastoomanyzipentrieslambda0.PlaybackStateCompatCustomAction;
        long j = hastoomanyzipentrieslambda0.getOnBackPressedInput;
        long j2 = hastoomanyzipentrieslambda0.ParcelableVolumeInfo;
        Executor executor = mergejsonobjectslambda10.write;
        executor = executor == null ? hastoomanyzipentrieslambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : executor;
        ScheduledExecutorService scheduledExecutorService = hastoomanyzipentrieslambda0.addOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer.MediaSessionCompatToken;
        markPageFinishedlambda00 markpagefinishedlambda00 = (markPageFinishedlambda00) scale0ar0la0default.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = new getMethodQuietlylambda1(new shouldOverrideUrlLoading());
        this.ResultReceiver = new Object();
        this.RatingCompat = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new handleQueryAction(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new AtomicBoolean();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new AtomicInteger();
        this.MediaSessionCompatResultReceiverWrapper = new AtomicInteger();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sentryClient;
        this.MediaMetadataCompat = jsonObjectSerializer;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = j;
        this.MediaBrowserCompatMediaItem = j2;
        this.IconCompatParcelizer = executor;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = scheduledExecutorService;
        this.MediaDescriptionCompat = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = onpagefinishedlambda00;
        if (onpagefinishedlambda00 != null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onpagefinishedlambda00.RemoteActionCompatParcelizer;
        }
        this.PlaybackStateCompat = r8lambdan5r2kbwv2mtd2em1qhanll_mq;
        TextStreamsKt.read("Should not provide both retryPolicy and hedgingPolicy", onpagefinishedlambda00 == null || r8lambdan5r2kbwv2mtd2em1qhanll_mq == null);
        this.MediaSessionCompatToken = r8lambdan5r2kbwv2mtd2em1qhanll_mq != null;
        this._init_lambda1 = markpagefinishedlambda00;
    }
}
