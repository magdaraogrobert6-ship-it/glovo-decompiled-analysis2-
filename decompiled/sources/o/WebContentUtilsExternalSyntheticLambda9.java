package o;

import com.google.protobuf.GeneratedMessageLite;
import com.huawei.hmf.tasks.a.d$a;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.Status;
import io.grpc.internal.DelayedClientCall$2;
import io.grpc.internal.DelayedStream$3;
import io.sentry.SentryClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class WebContentUtilsExternalSyntheticLambda9 extends JsonUtilsa {
    public static final ensureBrazeFieldLengthlambda0 serializer;
    public final Executor IconCompatParcelizer;
    public getEMAIL_ADDRESS_MAX_LENGTHannotations MediaBrowserCompatMediaItem;
    public MathKt MediaDescriptionCompat;
    public Status MediaMetadataCompat;
    public final setResourcePackageName MediaSessionCompatQueueItem;
    public final SentryClient MediaSessionCompatResultReceiverWrapper;
    public volatile boolean MediaSessionCompatToken;
    public final /* synthetic */ getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release ParcelableVolumeInfo;
    public JsonUtilsa PlaybackStateCompat;
    public List PlaybackStateCompatCustomAction;
    public final ScheduledFuture RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final setResourcePackageName read;
    public final mergeJsonObjectslambda10 write;

    public final void serializer(Status status, boolean z) {
        MathKt mathKt;
        boolean z2;
        synchronized (this) {
            JsonUtilsa jsonUtilsa = this.PlaybackStateCompat;
            int i = 1;
            if (jsonUtilsa == null) {
                ensureBrazeFieldLengthlambda0 ensurebrazefieldlengthlambda0 = serializer;
                z2 = false;
                TextStreamsKt.IconCompatParcelizer("realCall already set to %s", jsonUtilsa, jsonUtilsa == null);
                ScheduledFuture scheduledFuture = this.RatingCompat;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.PlaybackStateCompat = ensurebrazefieldlengthlambda0;
                mathKt = this.MediaDescriptionCompat;
                this.MediaMetadataCompat = status;
            } else {
                if (z) {
                    return;
                }
                mathKt = null;
                z2 = true;
            }
            if (z2) {
                serializer(new d$a(this, 6, status));
            } else {
                if (mathKt != null) {
                    this.IconCompatParcelizer.execute(new isValidLineId(this, mathKt, status));
                }
                IconCompatParcelizer();
            }
            this.ParcelableVolumeInfo.write.addOnNewIntentListener.execute(new isInvalidCustomEndpointandroid_sdk_base_release(this, i));
        }
    }

    public final void serializer(Runnable runnable) {
        synchronized (this) {
            if (this.MediaSessionCompatToken) {
                runnable.run();
            } else {
                this.PlaybackStateCompatCustomAction.add(runnable);
            }
        }
    }

    static {
        java.util.logging.Logger.getLogger(WebContentUtilsExternalSyntheticLambda9.class.getName());
        serializer = new ensureBrazeFieldLengthlambda0(0);
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IconCompatParcelizer() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.PlaybackStateCompatCustomAction     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.PlaybackStateCompatCustomAction = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.MediaSessionCompatToken = r0     // Catch: java.lang.Throwable -> L42
            o.getEMAIL_ADDRESS_MAX_LENGTHannotations r0 = r3.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.IconCompatParcelizer
            o.r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo r2 = new o.r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.PlaybackStateCompatCustomAction     // Catch: java.lang.Throwable -> L42
            r3.PlaybackStateCompatCustomAction = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebContentUtilsExternalSyntheticLambda9.IconCompatParcelizer():void");
    }

    public final void serializer() {
        int i;
        r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo r8lambdajaff3caziwgetnrl48ckjoh_eo;
        setResourcePackageName setresourcepackagenameIconCompatParcelizer = this.read.IconCompatParcelizer();
        try {
            mergeJsonObjectslambda10 mergejsonobjectslambda10 = this.write;
            mergeJsonObjectslambda00 mergejsonobjectslambda00 = JsonUtilsExternalSyntheticLambda1.read;
            this.ParcelableVolumeInfo.write.enterPictureInPictureMode.getClass();
            JsonUtilsa jsonUtilsaRemoteActionCompatParcelizer = this.ParcelableVolumeInfo.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, mergejsonobjectslambda10.IconCompatParcelizer(mergejsonobjectslambda00, Long.valueOf(System.nanoTime() - this.RemoteActionCompatParcelizer)));
            this.read.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            synchronized (this) {
                JsonUtilsa jsonUtilsa = this.PlaybackStateCompat;
                i = 1;
                if (jsonUtilsa != null) {
                    r8lambdajaff3caziwgetnrl48ckjoh_eo = null;
                } else {
                    TextStreamsKt.IconCompatParcelizer("realCall already set to %s", jsonUtilsa, jsonUtilsa == null);
                    ScheduledFuture scheduledFuture = this.RatingCompat;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.PlaybackStateCompat = jsonUtilsaRemoteActionCompatParcelizer;
                    r8lambdajaff3caziwgetnrl48ckjoh_eo = new r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo(this, this.MediaSessionCompatQueueItem);
                }
            }
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.ParcelableVolumeInfo.write;
            if (r8lambdajaff3caziwgetnrl48ckjoh_eo == null) {
                hastoomanyzipentrieslambda0.addOnNewIntentListener.execute(new isInvalidCustomEndpointandroid_sdk_base_release(this, i));
                return;
            }
            Executor executor = this.write.write;
            if (executor == null) {
                executor = hastoomanyzipentrieslambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            }
            executor.execute(new DelayedStream$3(this, 10, r8lambdajaff3caziwgetnrl48ckjoh_eo));
        } catch (Throwable th) {
            this.read.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
            throw th;
        }
    }

    public WebContentUtilsExternalSyntheticLambda9(getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release, setResourcePackageName setresourcepackagename, SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.ParcelableVolumeInfo = getmaxunpackedzipentrysizebytesandroid_sdk_base_release;
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = getmaxunpackedzipentrysizebytesandroid_sdk_base_release.write;
        java.util.logging.Logger logger = hasTooManyZipEntrieslambda0.MediaMetadataCompat;
        Executor executor = mergejsonobjectslambda10.write;
        executor = executor == null ? hastoomanyzipentrieslambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : executor;
        setMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release setmaxunpackedzipentrysizebytesandroid_sdk_base_release = hastoomanyzipentrieslambda0.onBackPressedInput_delegatelambda0;
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty = mergejsonobjectslambda10.serializer;
        this.PlaybackStateCompatCustomAction = new ArrayList();
        TextStreamsKt.serializer(executor, "callExecutor");
        this.IconCompatParcelizer = executor;
        TextStreamsKt.serializer(setmaxunpackedzipentrysizebytesandroid_sdk_base_release, "scheduler");
        setResourcePackageName setresourcepackagename2 = setResourcePackageName.read();
        this.MediaSessionCompatQueueItem = setresourcepackagename2;
        setresourcepackagename2.getClass();
        if (r8lambda9bwhxitij38r9epvsmivfryty == null) {
            scheduledFutureSchedule = null;
        } else {
            long jRemoteActionCompatParcelizer = r8lambda9bwhxitij38r9epvsmivfryty.RemoteActionCompatParcelizer();
            long jAbs = Math.abs(jRemoteActionCompatParcelizer) / 1000000000;
            long jAbs2 = Math.abs(jRemoteActionCompatParcelizer);
            StringBuilder sb = new StringBuilder();
            if (jRemoteActionCompatParcelizer < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(java.util.Locale.US, ".%09d", Long.valueOf(jAbs2 % 1000000000)));
            sb.append("s. ");
            scheduledFutureSchedule = setmaxunpackedzipentrysizebytesandroid_sdk_base_release.write.schedule(new DelayedStream$3(this, 2, sb), jRemoteActionCompatParcelizer, TimeUnit.NANOSECONDS);
        }
        this.RatingCompat = scheduledFutureSchedule;
        this.read = setresourcepackagename;
        this.MediaSessionCompatResultReceiverWrapper = sentryClient;
        this.write = mergejsonobjectslambda10;
        hastoomanyzipentrieslambda0.enterPictureInPictureMode.getClass();
        this.RemoteActionCompatParcelizer = System.nanoTime();
    }

    @Override // o.JsonUtilsa
    public final void read() {
        serializer(new isInvalidCustomEndpointandroid_sdk_base_release(this, 0));
    }

    @Override // o.JsonUtilsa
    public final void read(GeneratedMessageLite generatedMessageLite) {
        if (this.MediaSessionCompatToken) {
            this.PlaybackStateCompat.read(generatedMessageLite);
        } else {
            serializer(new DelayedStream$3(this, 3, generatedMessageLite));
        }
    }

    @Override // o.JsonUtilsa
    public final void serializer(int i) {
        if (this.MediaSessionCompatToken) {
            this.PlaybackStateCompat.serializer(i);
        } else {
            serializer(new isValidLocation(this, i, 2));
        }
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.PlaybackStateCompat, "realCall");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    @Override // o.JsonUtilsa
    public final void read(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        Status status;
        boolean z;
        int i = 0;
        TextStreamsKt.RemoteActionCompatParcelizer("already started", this.MediaDescriptionCompat == null);
        synchronized (this) {
            this.MediaDescriptionCompat = mathKt;
            status = this.MediaMetadataCompat;
            z = this.MediaSessionCompatToken;
            if (!z) {
                getEMAIL_ADDRESS_MAX_LENGTHannotations getemail_address_max_lengthannotations = new getEMAIL_ADDRESS_MAX_LENGTHannotations(mathKt);
                this.MediaBrowserCompatMediaItem = getemail_address_max_lengthannotations;
                mathKt = getemail_address_max_lengthannotations;
            }
        }
        if (status != null) {
            this.IconCompatParcelizer.execute(new isValidLineId(this, mathKt, status));
        } else if (z) {
            this.PlaybackStateCompat.read(mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
        } else {
            serializer(new DelayedClientCall$2(this, mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa, i));
        }
    }

    @Override // o.JsonUtilsa
    public final void read(String str, Throwable th) {
        Status statusIconCompatParcelizer;
        Status status = Status.RemoteActionCompatParcelizer;
        if (str != null) {
            statusIconCompatParcelizer = status.IconCompatParcelizer(str);
        } else {
            statusIconCompatParcelizer = status.IconCompatParcelizer("Call cancelled without message");
        }
        if (th != null) {
            statusIconCompatParcelizer = statusIconCompatParcelizer.RemoteActionCompatParcelizer(th);
        }
        serializer(statusIconCompatParcelizer, false);
    }
}
