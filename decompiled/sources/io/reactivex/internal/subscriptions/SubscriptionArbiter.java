package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SubscriptionArbiter extends AtomicInteger implements FwFClientclose11 {
    public volatile boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public FwFClientclose11 MediaSessionCompatQueueItem;
    public long MediaSessionCompatResultReceiverWrapper;
    public boolean ParcelableVolumeInfo;
    public final AtomicReference PlaybackStateCompatCustomAction = new AtomicReference();
    public final AtomicLong RatingCompat = new AtomicLong();
    public final AtomicLong MediaMetadataCompat = new AtomicLong();

    public void onSubscribe(FwFClientclose11 fwFClientclose11) {
        read(fwFClientclose11);
    }

    public SubscriptionArbiter(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final void read(FwFClientclose11 fwFClientclose11) {
        if (this.MediaBrowserCompatMediaItem) {
            fwFClientclose11.cancel();
            return;
        }
        ObjectHelper.write(fwFClientclose11, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            FwFClientclose11 fwFClientclose12 = (FwFClientclose11) this.PlaybackStateCompatCustomAction.getAndSet(fwFClientclose11);
            if (fwFClientclose12 != null && this.MediaDescriptionCompat) {
                fwFClientclose12.cancel();
            }
            read();
            return;
        }
        FwFClientclose11 fwFClientclose13 = this.MediaSessionCompatQueueItem;
        if (fwFClientclose13 != null && this.MediaDescriptionCompat) {
            fwFClientclose13.cancel();
        }
        this.MediaSessionCompatQueueItem = fwFClientclose11;
        long j = this.MediaSessionCompatResultReceiverWrapper;
        if (decrementAndGet() != 0) {
            write();
        }
        if (j != 0) {
            fwFClientclose11.request(j);
        }
    }

    public final void IconCompatParcelizer(long j) {
        if (this.ParcelableVolumeInfo) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.write(this.MediaMetadataCompat, j);
            read();
            return;
        }
        long j2 = this.MediaSessionCompatResultReceiverWrapper;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                SubscriptionHelper.reportMoreProduced(j3);
                j3 = 0;
            }
            this.MediaSessionCompatResultReceiverWrapper = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        write();
    }

    public void cancel() {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        read();
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        if (!SubscriptionHelper.validate(j) || this.ParcelableVolumeInfo) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.write(this.RatingCompat, j);
            read();
            return;
        }
        long j2 = this.MediaSessionCompatResultReceiverWrapper;
        if (j2 != Long.MAX_VALUE) {
            long jSerializer = BackpressureHelper.serializer(j2, j);
            this.MediaSessionCompatResultReceiverWrapper = jSerializer;
            if (jSerializer == Long.MAX_VALUE) {
                this.ParcelableVolumeInfo = true;
            }
        }
        FwFClientclose11 fwFClientclose11 = this.MediaSessionCompatQueueItem;
        if (decrementAndGet() != 0) {
            write();
        }
        if (fwFClientclose11 != null) {
            fwFClientclose11.request(j);
        }
    }

    public final void read() {
        if (getAndIncrement() != 0) {
            return;
        }
        write();
    }

    public final void write() {
        int iAddAndGet = 1;
        long jSerializer = 0;
        FwFClientclose11 fwFClientclose11 = null;
        do {
            FwFClientclose11 fwFClientclose12 = (FwFClientclose11) this.PlaybackStateCompatCustomAction.get();
            if (fwFClientclose12 != null) {
                fwFClientclose12 = (FwFClientclose11) this.PlaybackStateCompatCustomAction.getAndSet(null);
            }
            long andSet = this.RatingCompat.get();
            if (andSet != 0) {
                andSet = this.RatingCompat.getAndSet(0L);
            }
            long andSet2 = this.MediaMetadataCompat.get();
            if (andSet2 != 0) {
                andSet2 = this.MediaMetadataCompat.getAndSet(0L);
            }
            FwFClientclose11 fwFClientclose13 = this.MediaSessionCompatQueueItem;
            if (this.MediaBrowserCompatMediaItem) {
                if (fwFClientclose13 != null) {
                    fwFClientclose13.cancel();
                    this.MediaSessionCompatQueueItem = null;
                }
                if (fwFClientclose12 != null) {
                    fwFClientclose12.cancel();
                }
            } else {
                long jSerializer2 = this.MediaSessionCompatResultReceiverWrapper;
                if (jSerializer2 != Long.MAX_VALUE) {
                    jSerializer2 = BackpressureHelper.serializer(jSerializer2, andSet);
                    if (jSerializer2 != Long.MAX_VALUE) {
                        jSerializer2 -= andSet2;
                        if (jSerializer2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jSerializer2);
                            jSerializer2 = 0;
                        }
                    }
                    this.MediaSessionCompatResultReceiverWrapper = jSerializer2;
                }
                if (fwFClientclose12 != null) {
                    if (fwFClientclose13 != null && this.MediaDescriptionCompat) {
                        fwFClientclose13.cancel();
                    }
                    this.MediaSessionCompatQueueItem = fwFClientclose12;
                    if (jSerializer2 != 0) {
                        jSerializer = BackpressureHelper.serializer(jSerializer, jSerializer2);
                        fwFClientclose11 = fwFClientclose12;
                    }
                } else if (fwFClientclose13 != null && andSet != 0) {
                    jSerializer = BackpressureHelper.serializer(jSerializer, andSet);
                    fwFClientclose11 = fwFClientclose13;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jSerializer != 0) {
            fwFClientclose11.request(jSerializer);
        }
    }
}
