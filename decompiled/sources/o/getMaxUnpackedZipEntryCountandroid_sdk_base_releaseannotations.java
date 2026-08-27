package o;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations {
    public ScheduledFuture IconCompatParcelizer;
    public final replacePrefetchedUrlsWithLocalAssets MediaBrowserCompatMediaItem;
    public final visitSubtreeYYKmhodefault MediaDescriptionCompat;
    public ScheduledFuture MediaMetadataCompat;
    public final replacePrefetchedUrlsWithLocalAssets MediaSessionCompatQueueItem;
    public getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations RatingCompat;
    public final ScheduledExecutorService RemoteActionCompatParcelizer;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release read;
    public final long serializer;
    public final long write;

    public final void IconCompatParcelizer() {
        synchronized (this) {
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations = this.RatingCompat;
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2 = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.DISCONNECTED;
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations != getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2) {
                this.RatingCompat = getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2;
                ScheduledFuture scheduledFuture = this.MediaMetadataCompat;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.IconCompatParcelizer;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.IconCompatParcelizer = null;
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
        }
    }

    public final void read() {
        synchronized (this) {
            visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = this.MediaDescriptionCompat;
            visitsubtreeyykmhodefault.RemoteActionCompatParcelizer = false;
            visitsubtreeyykmhodefault.write();
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations = this.RatingCompat;
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2 = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SCHEDULED;
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2) {
                this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_DELAYED;
            } else if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SENT || getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.MediaMetadataCompat;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.RatingCompat == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE_AND_PING_SENT) {
                    this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE;
                } else {
                    this.RatingCompat = getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2;
                    TextStreamsKt.RemoteActionCompatParcelizer("There should be no outstanding pingFuture", this.IconCompatParcelizer == null);
                    this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.schedule(this.MediaSessionCompatQueueItem, this.write, TimeUnit.NANOSECONDS);
                }
            }
        }
    }

    public final void serializer() {
        synchronized (this) {
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations = this.RatingCompat;
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SCHEDULED || getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_DELAYED) {
                this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE;
            }
            if (this.RatingCompat == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SENT) {
                this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE_AND_PING_SENT;
            }
        }
    }

    public final void write() {
        synchronized (this) {
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations = this.RatingCompat;
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE) {
                this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SCHEDULED;
                if (this.IconCompatParcelizer == null) {
                    ScheduledExecutorService scheduledExecutorService = this.RemoteActionCompatParcelizer;
                    replacePrefetchedUrlsWithLocalAssets replaceprefetchedurlswithlocalassets = this.MediaSessionCompatQueueItem;
                    long j = this.write;
                    visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = this.MediaDescriptionCompat;
                    this.IconCompatParcelizer = scheduledExecutorService.schedule(replaceprefetchedurlswithlocalassets, j - visitsubtreeyykmhodefault.RemoteActionCompatParcelizer(), TimeUnit.NANOSECONDS);
                }
            } else if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE_AND_PING_SENT) {
                this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SENT;
            }
        }
    }

    public getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = new visitSubtreeYYKmhodefault();
        this.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.IDLE;
        this.MediaBrowserCompatMediaItem = new replacePrefetchedUrlsWithLocalAssets(new getLocalHtmlUrlFromRemoteUrllambda3(this, 0));
        this.MediaSessionCompatQueueItem = new replacePrefetchedUrlsWithLocalAssets(new getLocalHtmlUrlFromRemoteUrllambda3(this, 1));
        this.read = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        TextStreamsKt.serializer(scheduledExecutorService, "scheduler");
        this.RemoteActionCompatParcelizer = scheduledExecutorService;
        this.MediaDescriptionCompat = visitsubtreeyykmhodefault;
        this.write = j;
        this.serializer = j2;
        visitsubtreeyykmhodefault.RemoteActionCompatParcelizer = false;
        visitsubtreeyykmhodefault.write();
    }
}
