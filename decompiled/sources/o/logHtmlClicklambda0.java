package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class logHtmlClicklambda0 implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatResultReceiverWrapper = new io.sentry.util.RemoteActionCompatParcelizer();
    public final Date MediaSessionCompatToken;
    public ConcurrentHashMap ParcelableVolumeInfo;
    public BrazeContentCardUtils PlaybackStateCompat;
    public Date PlaybackStateCompatCustomAction;
    public Long RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final AtomicInteger read;
    public final String serializer;
    public Double write;

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final logHtmlClicklambda0 clone() {
        return new logHtmlClicklambda0(this.PlaybackStateCompat, this.MediaSessionCompatToken, this.PlaybackStateCompatCustomAction, this.read.get(), this.serializer, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, this.RatingCompat, this.write, this.MediaDescriptionCompat, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.IconCompatParcelizer);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        String str = this.MediaBrowserCompatMediaItem;
        if (str != null) {
            okHttpCall$1.write("sid");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        String str2 = this.serializer;
        if (str2 != null) {
            okHttpCall$1.write("did");
            okHttpCall$1.IconCompatParcelizer(str2);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("init");
            okHttpCall$1.serializer(this.MediaSessionCompatQueueItem);
        }
        okHttpCall$1.write("started");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatToken);
        okHttpCall$1.write("status");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompat.name().toLowerCase(java.util.Locale.ROOT));
        if (this.RatingCompat != null) {
            okHttpCall$1.write("seq");
            okHttpCall$1.RemoteActionCompatParcelizer(this.RatingCompat);
        }
        okHttpCall$1.write("errors");
        okHttpCall$1.IconCompatParcelizer(this.read.intValue());
        if (this.write != null) {
            okHttpCall$1.write(com.braze.models.inappmessage.InAppMessageBase.DURATION);
            okHttpCall$1.RemoteActionCompatParcelizer(this.write);
        }
        if (this.PlaybackStateCompatCustomAction != null) {
            okHttpCall$1.write("timestamp");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompatCustomAction);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("abnormal_mechanism");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        okHttpCall$1.write("attrs");
        okHttpCall$1.write();
        okHttpCall$1.write("release");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        String str3 = this.RemoteActionCompatParcelizer;
        if (str3 != null) {
            okHttpCall$1.write(com.deliveryhero.fwf_cache.UtilKt.ENVIRONMENT_KEY);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, str3);
        }
        String str4 = this.MediaDescriptionCompat;
        if (str4 != null) {
            okHttpCall$1.write("ip_address");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, str4);
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("user_agent");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        okHttpCall$1.RatingCompat();
        ConcurrentHashMap concurrentHashMap = this.ParcelableVolumeInfo;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.ParcelableVolumeInfo, str5, okHttpCall$1, str5, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final void serializer(Date date) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            this.MediaSessionCompatQueueItem = null;
            if (this.PlaybackStateCompat == BrazeContentCardUtils.Ok) {
                this.PlaybackStateCompat = BrazeContentCardUtils.Exited;
            }
            if (date != null) {
                this.PlaybackStateCompatCustomAction = date;
            } else {
                this.PlaybackStateCompatCustomAction = setNativeShader.serializer();
            }
            Date date2 = this.PlaybackStateCompatCustomAction;
            if (date2 != null) {
                this.write = Double.valueOf(Math.abs(date2.getTime() - this.MediaSessionCompatToken.getTime()) / 1000.0d);
                long time = this.PlaybackStateCompatCustomAction.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.RatingCompat = Long.valueOf(time);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean serializer(BrazeContentCardUtils brazeContentCardUtils, String str, boolean z, String str2) {
        boolean z2;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        boolean z3 = true;
        if (brazeContentCardUtils != null) {
            try {
                this.PlaybackStateCompat = brazeContentCardUtils;
                z2 = true;
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str;
            z2 = true;
        }
        if (z) {
            this.read.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.IconCompatParcelizer = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.MediaSessionCompatQueueItem = null;
            Date dateSerializer = setNativeShader.serializer();
            this.PlaybackStateCompatCustomAction = dateSerializer;
            if (dateSerializer != null) {
                long time = dateSerializer.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.RatingCompat = Long.valueOf(time);
            }
        }
        uriActionExternalSyntheticLambda4Serializer.close();
        return z3;
    }

    public logHtmlClicklambda0(BrazeContentCardUtils brazeContentCardUtils, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.PlaybackStateCompat = brazeContentCardUtils;
        this.MediaSessionCompatToken = date;
        this.PlaybackStateCompatCustomAction = date2;
        this.read = new AtomicInteger(i);
        this.serializer = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.MediaSessionCompatQueueItem = bool;
        this.RatingCompat = l;
        this.write = d;
        this.MediaDescriptionCompat = str3;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaMetadataCompat = str6;
        this.IconCompatParcelizer = str7;
    }

    public final Date IconCompatParcelizer() {
        Date date = this.MediaSessionCompatToken;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }
}
