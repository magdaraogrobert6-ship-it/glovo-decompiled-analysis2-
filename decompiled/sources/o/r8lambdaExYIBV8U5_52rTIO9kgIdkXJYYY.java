package o;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY extends BrazeNotificationUtilsWhenMappings {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private getBrazePushEventType MediaBrowserCompatMediaItem;
    private final Runnable MediaSessionCompatQueueItem;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private boolean read;
    boolean serializer;
    private final AudioManager write;

    public abstract String MediaBrowserCompatMediaItem();

    public boolean MediaDescriptionCompat() {
        synchronized (this) {
            if (!this.read) {
                return false;
            }
            this.read = false;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("stopping", new Object[0]);
            this.IconCompatParcelizer.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
            return true;
        }
    }

    public abstract String MediaSessionCompatQueueItem();

    public final boolean RatingCompat() {
        return this.read;
    }

    public abstract void RemoteActionCompatParcelizer(int i);

    public final void write(long j) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("call finished", new Object[0]);
            getBrazePushEventType getbrazepusheventtype = this.MediaBrowserCompatMediaItem;
            if (getbrazepusheventtype != null) {
                getbrazepusheventtype.IconCompatParcelizer((byte) 2, write(), j);
            }
            this.serializer = false;
        }
    }

    public boolean MediaMetadataCompat() {
        synchronized (this) {
            if (this.read) {
                return false;
            }
            this.read = true;
            this.serializer = false;
            getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (readVarRemoteActionCompatParcelizer != null) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer = IconCompatParcelizer(write());
                this.serializer = r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer != null && BrazeNotificationUtilsWhenMappings.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer) && r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer.RemoteActionCompatParcelizer.longValue() >= readVarRemoteActionCompatParcelizer.serializer();
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Starting poll based " + MediaBrowserCompatMediaItem() + " call detector, isCallOngoing = " + this.serializer, new Object[0]);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, MediaSessionCompatQueueItem());
            return true;
        }
    }

    public r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY(AudioManager audioManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy) {
        super(r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getverticalaccuracy, getcooldownenterseconds);
        this.MediaSessionCompatQueueItem = new r8lambda9TZpBImTEtk0HAjJ1Vr5tuCi60U(2, this);
        this.write = audioManager;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    public final void IconCompatParcelizer(getBrazePushEventType getbrazepusheventtype) {
        this.MediaBrowserCompatMediaItem = getbrazepusheventtype;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("call started", new Object[0]);
            this.serializer = true;
            getBrazePushEventType getbrazepusheventtype = this.MediaBrowserCompatMediaItem;
            if (getbrazepusheventtype != null) {
                getbrazepusheventtype.IconCompatParcelizer((byte) 1, write(), j);
            }
        }
    }
}
