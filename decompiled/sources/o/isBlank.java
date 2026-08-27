package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.CallOptions$Builder;
import io.grpc.Status;
import io.grpc.internal.CallTracer;
import io.sentry.CombinedScopeView;
import io.sentry.SentryClient;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isBlank extends JsonUtilsa {
    public static final double IconCompatParcelizer;
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(isBlank.class.getName());
    public final scale0AR0LA0default MediaBrowserCompatMediaItem;
    public final CallTracer MediaDescriptionCompat;
    public final setResourcePackageName MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final ScheduledExecutorService MediaSessionCompatToken;
    public r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs ParcelableVolumeInfo = r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs.write;
    public volatile ScheduledFuture PlaybackStateCompat;
    public final SentryClient PlaybackStateCompatCustomAction;
    public volatile boolean RatingCompat;
    public mergeJsonObjectslambda10 RemoteActionCompatParcelizer;
    public r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final boolean read;
    public final Executor serializer;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        IconCompatParcelizer = 1.0E9d;
    }

    public final void IconCompatParcelizer(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        mergeJsonObjectslambda00 mergejsonobjectslambda00;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks;
        TimeUnit timeUnit;
        mergeJsonObjectslambda10 mergejsonobjectslambda10;
        r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 replaceprefetchedurlswithlocalassetslambda1;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks2 = r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer;
        TextStreamsKt.RemoteActionCompatParcelizer("Already started", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null);
        TextStreamsKt.RemoteActionCompatParcelizer("call was cancelled", !this.MediaSessionCompatQueueItem);
        this.MediaMetadataCompat.getClass();
        mergeJsonObjectslambda10 mergejsonobjectslambda11 = this.RemoteActionCompatParcelizer;
        mergeJsonObjectslambda00 mergejsonobjectslambda01 = iExternalSyntheticLambda0.IconCompatParcelizer;
        iExternalSyntheticLambda0 iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) mergejsonobjectslambda11.serializer(mergejsonobjectslambda01);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (iexternalsyntheticlambda0 == null) {
            mergejsonobjectslambda00 = mergejsonobjectslambda01;
            r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakctilwmporjfcawe8asdqv1ks2;
            timeUnit = timeUnit2;
        } else {
            Integer num = iexternalsyntheticlambda0.RemoteActionCompatParcelizer;
            Integer num2 = iexternalsyntheticlambda0.serializer;
            Long l = iexternalsyntheticlambda0.RatingCompat;
            if (l != null) {
                long jLongValue = l.longValue();
                if (timeUnit2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("units");
                    return;
                }
                r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty = new r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY(jLongValue);
                mergeJsonObjectslambda10 mergejsonobjectslambda12 = this.RemoteActionCompatParcelizer;
                r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty2 = mergejsonobjectslambda12.serializer;
                if (r8lambda9bwhxitij38r9epvsmivfryty2 != null) {
                    r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks3 = r8lambda9bwhxitij38r9epvsmivfryty.serializer;
                    if (r8lambdakctilwmporjfcawe8asdqv1ks3 != r8lambda9bwhxitij38r9epvsmivfryty2.serializer) {
                        StringBuilder sb = new StringBuilder("Tickers (");
                        sb.append(r8lambdakctilwmporjfcawe8asdqv1ks3);
                        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks4 = r8lambda9bwhxitij38r9epvsmivfryty2.serializer;
                        sb.append(" and ");
                        sb.append(r8lambdakctilwmporjfcawe8asdqv1ks4);
                        sb.append(") don't match. Custom Ticker should only be used in tests!");
                        throw new AssertionError(sb.toString());
                    }
                    mergejsonobjectslambda00 = mergejsonobjectslambda01;
                    r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakctilwmporjfcawe8asdqv1ks2;
                    timeUnit = timeUnit2;
                    if (r8lambda9bwhxitij38r9epvsmivfryty.read - r8lambda9bwhxitij38r9epvsmivfryty2.read < 0) {
                    }
                } else {
                    mergejsonobjectslambda00 = mergejsonobjectslambda01;
                    r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakctilwmporjfcawe8asdqv1ks2;
                    timeUnit = timeUnit2;
                }
                mergejsonobjectslambda12.getClass();
                CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda12);
                callOptions$BuilderRemoteActionCompatParcelizer.serializer = r8lambda9bwhxitij38r9epvsmivfryty;
                this.RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
            } else {
                mergejsonobjectslambda00 = mergejsonobjectslambda01;
                r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakctilwmporjfcawe8asdqv1ks2;
                timeUnit = timeUnit2;
            }
            Boolean bool = iexternalsyntheticlambda0.MediaMetadataCompat;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                mergeJsonObjectslambda10 mergejsonobjectslambda13 = this.RemoteActionCompatParcelizer;
                mergejsonobjectslambda13.getClass();
                if (zBooleanValue) {
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer2 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda13);
                    callOptions$BuilderRemoteActionCompatParcelizer2.RatingCompat = Boolean.TRUE;
                    mergejsonobjectslambda10 = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer2);
                } else {
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer3 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda13);
                    callOptions$BuilderRemoteActionCompatParcelizer3.RatingCompat = Boolean.FALSE;
                    mergejsonobjectslambda10 = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer3);
                }
                this.RemoteActionCompatParcelizer = mergejsonobjectslambda10;
            }
            if (num2 != null) {
                mergeJsonObjectslambda10 mergejsonobjectslambda14 = this.RemoteActionCompatParcelizer;
                Integer num3 = mergejsonobjectslambda14.MediaMetadataCompat;
                if (num3 != null) {
                    int iMin = Math.min(num3.intValue(), num2.intValue());
                    TextStreamsKt.serializer("invalid maxsize %s", iMin, iMin >= 0);
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer4 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda14);
                    callOptions$BuilderRemoteActionCompatParcelizer4.IconCompatParcelizer = Integer.valueOf(iMin);
                    this.RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer4);
                } else {
                    int iIntValue = num2.intValue();
                    TextStreamsKt.serializer("invalid maxsize %s", iIntValue, iIntValue >= 0);
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer5 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda14);
                    callOptions$BuilderRemoteActionCompatParcelizer5.IconCompatParcelizer = num2;
                    this.RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer5);
                }
            }
            if (num != null) {
                mergeJsonObjectslambda10 mergejsonobjectslambda15 = this.RemoteActionCompatParcelizer;
                Integer num4 = mergejsonobjectslambda15.MediaBrowserCompatMediaItem;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num.intValue());
                    TextStreamsKt.serializer("invalid maxsize %s", iMin2, iMin2 >= 0);
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer6 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda15);
                    callOptions$BuilderRemoteActionCompatParcelizer6.MediaSessionCompatQueueItem = Integer.valueOf(iMin2);
                    this.RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer6);
                } else {
                    int iIntValue2 = num.intValue();
                    TextStreamsKt.serializer("invalid maxsize %s", iIntValue2, iIntValue2 >= 0);
                    CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer7 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda15);
                    callOptions$BuilderRemoteActionCompatParcelizer7.MediaSessionCompatQueueItem = num;
                    this.RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer7);
                }
            }
        }
        this.RemoteActionCompatParcelizer.getClass();
        r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs r8lambda5t3l_1jntlbjtf0fr47kg54a0bs = this.ParcelableVolumeInfo;
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer);
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaMetadataCompat);
        r8lambdazzuqe02XBR43ox0o_9r6taqg r8lambdazzuqe02xbr43ox0o_9r6taqg = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaDescriptionCompat;
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(r8lambdazzuqe02xbr43ox0o_9r6taqg);
        byte[] bArr = r8lambda5t3l_1jntlbjtf0fr47kg54a0bs.read;
        if (bArr.length != 0) {
            r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(r8lambdazzuqe02xbr43ox0o_9r6taqg, bArr);
        }
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer);
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.read);
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty3 = this.RemoteActionCompatParcelizer.serializer;
        this.MediaMetadataCompat.getClass();
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty4 = r8lambda9bwhxitij38r9epvsmivfryty3 == null ? null : r8lambda9bwhxitij38r9epvsmivfryty3;
        if (r8lambda9bwhxitij38r9epvsmivfryty4 == null || !r8lambda9bwhxitij38r9epvsmivfryty4.IconCompatParcelizer()) {
            this.MediaMetadataCompat.getClass();
            r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty5 = this.RemoteActionCompatParcelizer.serializer;
            java.util.logging.Logger logger = write;
            if (logger.isLoggable(Level.FINE) && r8lambda9bwhxitij38r9epvsmivfryty4 != null && r8lambda9bwhxitij38r9epvsmivfryty4.equals(null)) {
                long jMax = Math.max(0L, r8lambda9bwhxitij38r9epvsmivfryty4.RemoteActionCompatParcelizer());
                java.util.Locale locale = java.util.Locale.US;
                StringBuilder sb2 = new StringBuilder(m1$$ExternalSyntheticOutline0.m(jMax, "Call timeout set to '", "' ns, due to context deadline."));
                if (r8lambda9bwhxitij38r9epvsmivfryty5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + r8lambda9bwhxitij38r9epvsmivfryty5.RemoteActionCompatParcelizer() + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            scale0AR0LA0default scale0ar0la0default = this.MediaBrowserCompatMediaItem;
            SentryClient sentryClient = this.PlaybackStateCompatCustomAction;
            mergeJsonObjectslambda10 mergejsonobjectslambda16 = this.RemoteActionCompatParcelizer;
            setResourcePackageName setresourcepackagename = this.MediaMetadataCompat;
            if (((hasTooManyZipEntrieslambda0) scale0ar0la0default.IconCompatParcelizer).getSavedStateRegistryControllerannotations) {
                iExternalSyntheticLambda0 iexternalsyntheticlambda1 = (iExternalSyntheticLambda0) mergejsonobjectslambda16.serializer(mergejsonobjectslambda00);
                replaceprefetchedurlswithlocalassetslambda1 = new replacePrefetchedUrlsWithLocalAssetslambda1(scale0ar0la0default, sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda16, iexternalsyntheticlambda1 == null ? null : iexternalsyntheticlambda1.read, iexternalsyntheticlambda1 == null ? null : iexternalsyntheticlambda1.write, setresourcepackagename);
            } else {
                r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzanoIconCompatParcelizer = scale0ar0la0default.IconCompatParcelizer(new r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda16));
                setResourcePackageName setresourcepackagenameIconCompatParcelizer = setresourcepackagename.IconCompatParcelizer();
                try {
                    replaceprefetchedurlswithlocalassetslambda1 = r8lambdahmza2hwvd2qpednmehrxqzjzanoIconCompatParcelizer.IconCompatParcelizer(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda16, r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.read(mergejsonobjectslambda16, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 0, false));
                    setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
                } catch (Throwable th) {
                    setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
                    throw th;
                }
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = replaceprefetchedurlswithlocalassetslambda1;
        } else {
            JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.read(this.RemoteActionCompatParcelizer, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 0, false);
            r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty6 = this.RemoteActionCompatParcelizer.serializer;
            this.MediaMetadataCompat.getClass();
            String str = r8lambda9bwhxitij38r9epvsmivfryty6 == null ? "Context" : "CallOptions";
            Long l2 = (Long) this.RemoteActionCompatParcelizer.serializer(JsonUtilsExternalSyntheticLambda1.read);
            double dRemoteActionCompatParcelizer = r8lambda9bwhxitij38r9epvsmivfryty4.RemoteActionCompatParcelizer();
            double d = IconCompatParcelizer;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isValidPushStoryClickInput(Status.read.IconCompatParcelizer(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dRemoteActionCompatParcelizer / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), jsonUtilsExternalSyntheticLambda1Arr);
        }
        if (this.read) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer();
        }
        this.RemoteActionCompatParcelizer.getClass();
        Integer num5 = this.RemoteActionCompatParcelizer.MediaMetadataCompat;
        if (num5 != null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(num5.intValue());
        }
        Integer num6 = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
        if (num6 != null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(num6.intValue());
        }
        if (r8lambda9bwhxitij38r9epvsmivfryty4 != null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(r8lambda9bwhxitij38r9epvsmivfryty4);
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(r8lambdakctilwmporjfcawe8asdqv1ks);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(this.ParcelableVolumeInfo);
        CallTracer callTracer = this.MediaDescriptionCompat;
        ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer.write).read();
        ((WebContentUtils) callTracer.RemoteActionCompatParcelizer).write();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(new CombinedScopeView(this, mathKt));
        setResourcePackageName setresourcepackagename2 = this.MediaMetadataCompat;
        DpTouchBoundsExpansionCompanion dpTouchBoundsExpansionCompanion = DpTouchBoundsExpansionCompanion.INSTANCE;
        setresourcepackagename2.getClass();
        java.util.logging.Logger logger2 = setResourcePackageName.IconCompatParcelizer;
        if (dpTouchBoundsExpansionCompanion == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("executor");
            return;
        }
        if (r8lambda9bwhxitij38r9epvsmivfryty4 != null) {
            this.MediaMetadataCompat.getClass();
            if (!r8lambda9bwhxitij38r9epvsmivfryty4.equals(null) && this.MediaSessionCompatToken != null) {
                long jRemoteActionCompatParcelizer = r8lambda9bwhxitij38r9epvsmivfryty4.RemoteActionCompatParcelizer();
                this.PlaybackStateCompat = this.MediaSessionCompatToken.schedule(new replacePrefetchedUrlsWithLocalAssets(new ValidationUtils(this, jRemoteActionCompatParcelizer)), jRemoteActionCompatParcelizer, timeUnit);
            }
        }
        if (this.RatingCompat) {
            RemoteActionCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaMetadataCompat.getClass();
        ScheduledFuture scheduledFuture = this.PlaybackStateCompat;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public isBlank(SentryClient sentryClient, Executor executor, mergeJsonObjectslambda10 mergejsonobjectslambda10, scale0AR0LA0default scale0ar0la0default, ScheduledExecutorService scheduledExecutorService, CallTracer callTracer) {
        getResourcePackageName getresourcepackagename = getResourcePackageName.write;
        this.PlaybackStateCompatCustomAction = sentryClient;
        Object obj = sentryClient.MediaBrowserCompatMediaItem;
        System.identityHashCode(this);
        executelambda2.serializer.getClass();
        boolean z = true;
        if (executor == DpTouchBoundsExpansionCompanion.INSTANCE) {
            this.serializer = new onPageFinished();
            this.read = true;
        } else {
            this.serializer = new parsePropertiesFromQueryBundle(executor);
            this.read = false;
        }
        this.MediaDescriptionCompat = callTracer;
        this.MediaMetadataCompat = setResourcePackageName.read();
        constructObjectQuietlydefault constructobjectquietlydefault = (constructObjectQuietlydefault) sentryClient.RemoteActionCompatParcelizer;
        if (constructobjectquietlydefault != constructObjectQuietlydefault.UNARY && constructobjectquietlydefault != constructObjectQuietlydefault.SERVER_STREAMING) {
            z = false;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
        this.RemoteActionCompatParcelizer = mergejsonobjectslambda10;
        this.MediaBrowserCompatMediaItem = scale0ar0la0default;
        this.MediaSessionCompatToken = scheduledExecutorService;
    }

    @Override // o.JsonUtilsa
    public final void read() {
        executelambda2.serializer();
        try {
            executelambda2.read();
            TextStreamsKt.RemoteActionCompatParcelizer("Not started", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null);
            TextStreamsKt.RemoteActionCompatParcelizer("call was cancelled", !this.MediaSessionCompatQueueItem);
            TextStreamsKt.RemoteActionCompatParcelizer("call already half-closed", !this.MediaSessionCompatResultReceiverWrapper);
            this.MediaSessionCompatResultReceiverWrapper = true;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.JsonUtilsa
    public final void read(GeneratedMessageLite generatedMessageLite) {
        executelambda2.serializer();
        try {
            executelambda2.read();
            RemoteActionCompatParcelizer(generatedMessageLite);
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.JsonUtilsa
    public final void read(String str, Throwable th) {
        executelambda2.serializer();
        try {
            executelambda2.read();
            write(str, th);
            executelambda2.serializer.getClass();
        } catch (Throwable th2) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // o.JsonUtilsa
    public final void read(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        executelambda2.serializer();
        try {
            executelambda2.read();
            IconCompatParcelizer(mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.JsonUtilsa
    public final void serializer(int i) {
        executelambda2.serializer();
        try {
            executelambda2.read();
            boolean z = true;
            TextStreamsKt.RemoteActionCompatParcelizer("Not started", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null);
            if (i < 0) {
                z = false;
            }
            TextStreamsKt.read("Number requested must be non-negative", z);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(i);
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, "method");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final void write(String str, Throwable th) {
        Status statusIconCompatParcelizer;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            write.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        this.MediaSessionCompatQueueItem = true;
        try {
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                Status status = Status.RemoteActionCompatParcelizer;
                if (str != null) {
                    statusIconCompatParcelizer = status.IconCompatParcelizer(str);
                } else {
                    statusIconCompatParcelizer = status.IconCompatParcelizer("Call cancelled without message");
                }
                if (th != null) {
                    statusIconCompatParcelizer = statusIconCompatParcelizer.RemoteActionCompatParcelizer(th);
                }
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(statusIconCompatParcelizer);
            }
        } finally {
            RemoteActionCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        TextStreamsKt.RemoteActionCompatParcelizer("Not started", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null);
        TextStreamsKt.RemoteActionCompatParcelizer("call was cancelled", !this.MediaSessionCompatQueueItem);
        TextStreamsKt.RemoteActionCompatParcelizer("call was half-closed", !this.MediaSessionCompatResultReceiverWrapper);
        try {
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 instanceof replacePrefetchedUrlsWithLocalAssetslambda1) {
                ((replacePrefetchedUrlsWithLocalAssetslambda1) r8lambda7hj8zhiew8owwyp0e05lxeu0sn0).IconCompatParcelizer(generatedMessageLite);
            } else {
                monthFromInt monthfromint = (monthFromInt) this.PlaybackStateCompatCustomAction.write;
                monthfromint.getClass();
                r8lambda7hj8zhiew8owwyp0e05lxeu0sn0.RemoteActionCompatParcelizer(new setDateOfBirthlambda3(generatedMessageLite, monthfromint.read));
            }
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                return;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
        } catch (Error e) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(Status.RemoteActionCompatParcelizer.IconCompatParcelizer("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(Status.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2).IconCompatParcelizer("Failed to stream message"));
        }
    }
}
