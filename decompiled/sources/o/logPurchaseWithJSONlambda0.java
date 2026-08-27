package o;

import com.huawei.location.ut;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.Status;
import io.grpc.internal.CallTracer;
import io.grpc.internal.DelayedStream$3;
import io.grpc.internal.SharedResourcePool;
import io.sentry.MovePreviousSession;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class logPurchaseWithJSONlambda0 implements r8lambda6LGSESzBuanebUADYycWZpXP5Kw {
    public static final WebContentUtils IconCompatParcelizer = new WebContentUtils(18);
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object serializer;
    public final Object write;

    public logPurchaseWithJSONlambda0(String str) {
        this.RemoteActionCompatParcelizer = 1;
        wouldPushPermissionPromptDisplaylambda1 wouldpushpermissionpromptdisplaylambda1 = wouldPushPermissionPromptDisplaylambda1.read();
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda1, "registry");
        this.serializer = wouldpushpermissionpromptdisplaylambda1;
        TextStreamsKt.serializer(str, "defaultPolicy");
        this.write = str;
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void read() {
        if (this.RemoteActionCompatParcelizer == 2) {
            ((r8lambda6LGSESzBuanebUADYycWZpXP5Kw) this.serializer).read();
            return;
        }
        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
        if (replaceprefetchedurlswithlocalassetslambda1.IconCompatParcelizer()) {
            replaceprefetchedurlswithlocalassetslambda1.PlaybackStateCompatCustomAction.execute(new MovePreviousSession(19, this));
        }
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void serializer(SharedResourcePool sharedResourcePool) {
        if (this.RemoteActionCompatParcelizer == 2) {
            ((r8lambda6LGSESzBuanebUADYycWZpXP5Kw) this.serializer).serializer(sharedResourcePool);
            return;
        }
        handleQueryAction handlequeryaction = ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        TextStreamsKt.RemoteActionCompatParcelizer("Headers should be received prior to messages.", handlequeryaction.MediaMetadataCompat != null);
        if (handlequeryaction.MediaMetadataCompat == ((handleUrlOverridelambda00) this.serializer)) {
            ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).PlaybackStateCompatCustomAction.execute(new DelayedStream$3(this, 12, sharedResourcePool));
            return;
        }
        java.util.logging.Logger logger = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ResultReceiver;
        while (true) {
            InputStream inputStreamSerializer = sharedResourcePool.serializer();
            if (inputStreamSerializer == null) {
                return;
            } else {
                r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer(inputStreamSerializer);
            }
        }
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 2) {
            return super.toString();
        }
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((r8lambda6LGSESzBuanebUADYycWZpXP5Kw) this.serializer, "delegate");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void write(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        int i;
        int i2;
        if (this.RemoteActionCompatParcelizer == 2) {
            ((r8lambda6LGSESzBuanebUADYycWZpXP5Kw) this.serializer).write(r8lambdaqn1du6uas6agx4srbugfttxtpwa);
            return;
        }
        if (((handleUrlOverridelambda00) this.serializer).read > 0) {
            ReflectionUtils reflectionUtils = replacePrefetchedUrlsWithLocalAssetslambda1.write;
            r8lambdaqn1du6uas6agx4srbugfttxtpwa.serializer(reflectionUtils);
            r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(reflectionUtils, String.valueOf(((handleUrlOverridelambda00) this.serializer).read));
        }
        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
        handleUrlOverridelambda00 handleurloverridelambda00 = (handleUrlOverridelambda00) this.serializer;
        ReflectionUtils reflectionUtils2 = replacePrefetchedUrlsWithLocalAssetslambda1.write;
        getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer = replaceprefetchedurlswithlocalassetslambda1.RemoteActionCompatParcelizer(handleurloverridelambda00);
        if (getclearek5ggoqRemoteActionCompatParcelizer != null) {
            replaceprefetchedurlswithlocalassetslambda1.IconCompatParcelizer.execute(getclearek5ggoqRemoteActionCompatParcelizer);
        }
        if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == ((handleUrlOverridelambda00) this.serializer)) {
            markPageFinishedlambda00 markpagefinishedlambda00 = ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write)._init_lambda1;
            if (markpagefinishedlambda00 != null) {
                AtomicInteger atomicInteger = markpagefinishedlambda00.read;
                do {
                    i = atomicInteger.get();
                    i2 = markpagefinishedlambda00.RemoteActionCompatParcelizer;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(markpagefinishedlambda00.write + i, i2)));
            }
            ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).PlaybackStateCompatCustomAction.execute(new DelayedStream$3(this, 11, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0227  */
    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void serializer(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        boolean z;
        getBundleFromUrl getbundlefromurl;
        long nanos;
        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1;
        ut utVar;
        if (this.RemoteActionCompatParcelizer == 2) {
            CallTracer callTracer = ((getLocalHtmlUrlFromRemoteUrllambda1) this.write).IconCompatParcelizer.serializer;
            if (status.IconCompatParcelizer()) {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer.serializer).read();
            } else {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer.IconCompatParcelizer).read();
            }
            ((r8lambda6LGSESzBuanebUADYycWZpXP5Kw) this.serializer).serializer(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
            return;
        }
        Integer numValueOf = -1;
        synchronized (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).ResultReceiver) {
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda2 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
            replaceprefetchedurlswithlocalassetslambda2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = replaceprefetchedurlswithlocalassetslambda2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read((handleUrlOverridelambda00) this.serializer);
            ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).RatingCompat.write.add(String.valueOf(status.PlaybackStateCompat));
        }
        if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).MediaSessionCompatResultReceiverWrapper.decrementAndGet() == Integer.MIN_VALUE) {
            ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).PlaybackStateCompatCustomAction.execute(new isAutomaticGeofenceRequestsEnabled(17, this));
            return;
        }
        handleUrlOverridelambda00 handleurloverridelambda00 = (handleUrlOverridelambda00) this.serializer;
        if (handleurloverridelambda00.write) {
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda3 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
            getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer = replaceprefetchedurlswithlocalassetslambda3.RemoteActionCompatParcelizer(handleurloverridelambda00);
            if (getclearek5ggoqRemoteActionCompatParcelizer != null) {
                replaceprefetchedurlswithlocalassetslambda3.IconCompatParcelizer.execute(getclearek5ggoqRemoteActionCompatParcelizer);
            }
            if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == ((handleUrlOverridelambda00) this.serializer)) {
                ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).write(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
                return;
            }
            return;
        }
        r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg2 = r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.MISCARRIED;
        if (r8lambdacixdbs1vmz7djpim5hikhhgartg == r8lambdacixdbs1vmz7djpim5hikhhgartg2 && ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.incrementAndGet() > 1000) {
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda4 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
            getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer2 = replaceprefetchedurlswithlocalassetslambda4.RemoteActionCompatParcelizer((handleUrlOverridelambda00) this.serializer);
            if (getclearek5ggoqRemoteActionCompatParcelizer2 != null) {
                replaceprefetchedurlswithlocalassetslambda4.IconCompatParcelizer.execute(getclearek5ggoqRemoteActionCompatParcelizer2);
            }
            if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == ((handleUrlOverridelambda00) this.serializer)) {
                ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).write(Status.write.IconCompatParcelizer("Too many transparent retries. Might be a bug in gRPC").RemoteActionCompatParcelizer(status.RemoteActionCompatParcelizer()), r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
                return;
            }
            return;
        }
        if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == null) {
            int i = 0;
            int i2 = 1;
            if (r8lambdacixdbs1vmz7djpim5hikhhgartg == r8lambdacixdbs1vmz7djpim5hikhhgartg2 || (r8lambdacixdbs1vmz7djpim5hikhhgartg == r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.REFUSED && ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.compareAndSet(false, true))) {
                handleUrlOverridelambda00 handleurloverridelambda00RemoteActionCompatParcelizer = ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).RemoteActionCompatParcelizer(((handleUrlOverridelambda00) this.serializer).read, true);
                if (handleurloverridelambda00RemoteActionCompatParcelizer == null) {
                    return;
                }
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda5 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                if (replaceprefetchedurlswithlocalassetslambda5.MediaSessionCompatToken) {
                    synchronized (replaceprefetchedurlswithlocalassetslambda5.ResultReceiver) {
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda6 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                        replaceprefetchedurlswithlocalassetslambda6.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = replaceprefetchedurlswithlocalassetslambda6.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.IconCompatParcelizer((handleUrlOverridelambda00) this.serializer, handleurloverridelambda00RemoteActionCompatParcelizer);
                    }
                }
                ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).IconCompatParcelizer.execute(new handleUrlOverridelambda1(this, handleurloverridelambda00RemoteActionCompatParcelizer, i));
                return;
            }
            r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg3 = r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.DROPPED;
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda7 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
            if (r8lambdacixdbs1vmz7djpim5hikhhgartg != r8lambdacixdbs1vmz7djpim5hikhhgartg3) {
                replaceprefetchedurlswithlocalassetslambda7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.set(true);
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda8 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                if (replaceprefetchedurlswithlocalassetslambda8.MediaSessionCompatToken) {
                    String str = (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(replacePrefetchedUrlsWithLocalAssetslambda1.serializer);
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        numValueOf = null;
                    }
                    replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda9 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                    boolean zContains = replaceprefetchedurlswithlocalassetslambda9.PlaybackStateCompat.serializer.contains(status.PlaybackStateCompat);
                    boolean z2 = (replaceprefetchedurlswithlocalassetslambda9._init_lambda1 == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !replaceprefetchedurlswithlocalassetslambda9._init_lambda1.serializer();
                    if (zContains && !z2 && !status.IconCompatParcelizer() && numValueOf != null && numValueOf.intValue() > 0) {
                        numValueOf = 0;
                    }
                    if (zContains && !z2) {
                        i = 1;
                    }
                    if (i != 0) {
                        replacePrefetchedUrlsWithLocalAssetslambda1.write((replacePrefetchedUrlsWithLocalAssetslambda1) this.write, numValueOf);
                    }
                    synchronized (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).ResultReceiver) {
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda10 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                        replaceprefetchedurlswithlocalassetslambda10.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = replaceprefetchedurlswithlocalassetslambda10.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.IconCompatParcelizer((handleUrlOverridelambda00) this.serializer);
                        if (i != 0) {
                            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda11 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                            if (replaceprefetchedurlswithlocalassetslambda11.serializer(replaceprefetchedurlswithlocalassetslambda11.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) || !((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RemoteActionCompatParcelizer.isEmpty()) {
                                return;
                            }
                        }
                    }
                } else {
                    onPageFinishedlambda00 onpagefinishedlambda00 = replaceprefetchedurlswithlocalassetslambda8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    long j = 0;
                    if (onpagefinishedlambda00 == null) {
                        getbundlefromurl = new getBundleFromUrl(false, 0L);
                    } else {
                        boolean zContains2 = onpagefinishedlambda00.MediaSessionCompatQueueItem.contains(status.PlaybackStateCompat);
                        String str2 = (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(replacePrefetchedUrlsWithLocalAssetslambda1.serializer);
                        if (str2 != null) {
                            try {
                                numValueOf = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                            }
                        } else {
                            numValueOf = null;
                        }
                        boolean z3 = (replaceprefetchedurlswithlocalassetslambda8._init_lambda1 == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !replaceprefetchedurlswithlocalassetslambda8._init_lambda1.serializer();
                        if (replaceprefetchedurlswithlocalassetslambda8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer <= ((handleUrlOverridelambda00) this.serializer).read + 1 || z3) {
                            z = false;
                        } else if (numValueOf == null) {
                            if (zContains2) {
                                nanos = (long) (replacePrefetchedUrlsWithLocalAssetslambda1.read.nextDouble() * replaceprefetchedurlswithlocalassetslambda8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                double d = replaceprefetchedurlswithlocalassetslambda8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                onPageFinishedlambda00 onpagefinishedlambda01 = replaceprefetchedurlswithlocalassetslambda8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                replaceprefetchedurlswithlocalassetslambda8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Math.min((long) (d * onpagefinishedlambda01.write), onpagefinishedlambda01.IconCompatParcelizer);
                                j = nanos;
                                z = true;
                            } else {
                                z = false;
                            }
                        } else if (numValueOf.intValue() >= 0) {
                            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                            replaceprefetchedurlswithlocalassetslambda8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = replaceprefetchedurlswithlocalassetslambda8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.RemoteActionCompatParcelizer;
                            j = nanos;
                            z = true;
                        } else {
                            z = false;
                        }
                        getbundlefromurl = new getBundleFromUrl(z, j);
                    }
                    if (getbundlefromurl.serializer) {
                        handleUrlOverridelambda00 handleurloverridelambda00RemoteActionCompatParcelizer2 = ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).RemoteActionCompatParcelizer(((handleUrlOverridelambda00) this.serializer).read + 1, false);
                        if (handleurloverridelambda00RemoteActionCompatParcelizer2 == null) {
                            return;
                        }
                        synchronized (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).ResultReceiver) {
                            replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                            utVar = new ut(15, replaceprefetchedurlswithlocalassetslambda1.ResultReceiver);
                            replaceprefetchedurlswithlocalassetslambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = utVar;
                        }
                        utVar.RemoteActionCompatParcelizer(replaceprefetchedurlswithlocalassetslambda1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.schedule(new handleUrlOverridelambda1(this, handleurloverridelambda00RemoteActionCompatParcelizer2, i2), getbundlefromurl.IconCompatParcelizer, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            } else if (replaceprefetchedurlswithlocalassetslambda7.MediaSessionCompatToken) {
                replaceprefetchedurlswithlocalassetslambda7.RemoteActionCompatParcelizer();
            }
        }
        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda12 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
        getClearEK5gGoQ getclearek5ggoqRemoteActionCompatParcelizer3 = replaceprefetchedurlswithlocalassetslambda12.RemoteActionCompatParcelizer((handleUrlOverridelambda00) this.serializer);
        if (getclearek5ggoqRemoteActionCompatParcelizer3 != null) {
            replaceprefetchedurlswithlocalassetslambda12.IconCompatParcelizer.execute(getclearek5ggoqRemoteActionCompatParcelizer3);
        }
        if (((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaMetadataCompat == ((handleUrlOverridelambda00) this.serializer)) {
            ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).write(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
        }
    }

    public logPurchaseWithJSONlambda0() {
        this.RemoteActionCompatParcelizer = 0;
        this.write = coil3.ExtrasKt.IconCompatParcelizer();
        this.serializer = WebContentUtils.write;
    }

    public /* synthetic */ logPurchaseWithJSONlambda0(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.serializer = obj2;
    }
}
