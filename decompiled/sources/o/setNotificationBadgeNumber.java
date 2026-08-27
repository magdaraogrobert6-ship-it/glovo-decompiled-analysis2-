package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setNotificationBadgeNumber {
    private static setNewlyReceivedPushStory IconCompatParcelizer;
    private final r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ write = new r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ();
    volatile int RemoteActionCompatParcelizer = 0;

    public final boolean MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer == 4;
    }

    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer == 0;
    }

    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer == 3;
    }

    public static setNewlyReceivedPushStory RemoteActionCompatParcelizer() {
        setNewlyReceivedPushStory setnewlyreceivedpushstory;
        synchronized (setNotificationBadgeNumber.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new setNewlyReceivedPushStory();
            }
            setnewlyreceivedpushstory = IconCompatParcelizer;
        }
        return setnewlyreceivedpushstory;
    }

    public static setNewlyReceivedPushStory read() {
        setNewlyReceivedPushStory setnewlyreceivedpushstory;
        synchronized (setNotificationBadgeNumber.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new setNewlyReceivedPushStory();
            }
            setnewlyreceivedpushstory = IconCompatParcelizer;
        }
        return setnewlyreceivedpushstory;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        try {
            this.write.RemoteActionCompatParcelizer();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final void MediaMetadataCompat() {
        this.write.serializer();
    }

    public final boolean MediaSessionCompatToken() {
        try {
            this.write.read();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final void ParcelableVolumeInfo() {
        this.write.IconCompatParcelizer();
    }

    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == 2 || this.RemoteActionCompatParcelizer == 3;
    }

    public final boolean MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer == 1 || this.RemoteActionCompatParcelizer == 2 || this.RemoteActionCompatParcelizer == 3;
    }
}
