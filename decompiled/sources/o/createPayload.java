package o;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class createPayload extends BrazeNotificationUtilsWhenMappings {
    private int IconCompatParcelizer;
    private getBrazePushEventType RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private boolean serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public final boolean MediaBrowserCompatMediaItem() {
        synchronized (this) {
            if (this.serializer) {
                boolean z = read();
                parseLonglambda0 parselonglambda0 = this.read;
                if (z) {
                    parselonglambda0.IconCompatParcelizer("Stopping MobileCallDetector", new Object[0]);
                    MediaMetadataCompat();
                    this.IconCompatParcelizer = -1;
                    this.serializer = false;
                    return true;
                }
                parselonglambda0.IconCompatParcelizer("Not stopping MobileCallDetector, permission is not granted", new Object[0]);
                this.IconCompatParcelizer = -1;
                this.serializer = false;
            }
            return false;
        }
    }

    public final boolean MediaDescriptionCompat() {
        return this.serializer;
    }

    public abstract void MediaMetadataCompat();

    public abstract void RatingCompat();

    public final void serializer(int i) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.write;
        parseLonglambda0 parselonglambda0 = this.read;
        if (i == 0 && this.IconCompatParcelizer == 2) {
            parselonglambda0.IconCompatParcelizer("call ended", new Object[0]);
            getBrazePushEventType getbrazepusheventtype = this.RemoteActionCompatParcelizer;
            if (getbrazepusheventtype != null) {
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                getbrazepusheventtype.IconCompatParcelizer((byte) 2, (byte) 1, System.currentTimeMillis());
            }
        } else if (i == 2 && this.IconCompatParcelizer != i) {
            parselonglambda0.IconCompatParcelizer("call started", new Object[0]);
            getBrazePushEventType getbrazepusheventtype2 = this.RemoteActionCompatParcelizer;
            if (getbrazepusheventtype2 != null) {
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                getbrazepusheventtype2.IconCompatParcelizer((byte) 1, (byte) 1, System.currentTimeMillis());
            }
        }
        this.IconCompatParcelizer = i;
    }

    public final boolean serializer() {
        synchronized (this) {
            if (!this.serializer) {
                boolean z = read();
                parseLonglambda0 parselonglambda0 = this.read;
                if (z) {
                    parselonglambda0.IconCompatParcelizer("Starting MobileCallDetector", new Object[0]);
                    MediaSessionCompatQueueItem();
                    RatingCompat();
                    this.serializer = true;
                    return true;
                }
                parselonglambda0.IconCompatParcelizer("Not starting MobileCallDetector, permission is not granted", new Object[0]);
                this.serializer = true;
            }
            return false;
        }
    }

    @Override // o.BrazeNotificationUtilsWhenMappings
    public final byte write() {
        return (byte) 1;
    }

    private void MediaSessionCompatQueueItem() {
        synchronized (this) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer = IconCompatParcelizer((byte) 1);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer == null) {
                return;
            }
            getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (readVarRemoteActionCompatParcelizer == null || r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer.RemoteActionCompatParcelizer.longValue() < readVarRemoteActionCompatParcelizer.serializer() || !BrazeNotificationUtilsWhenMappings.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer)) {
                this.IconCompatParcelizer = 0;
            } else {
                this.read.IconCompatParcelizer("Previously call was on going", new Object[0]);
                this.IconCompatParcelizer = 2;
            }
        }
    }

    public createPayload(parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, TelephonyManager telephonyManager) {
        super(r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getverticalaccuracy, getcooldownenterseconds);
        this.IconCompatParcelizer = -1;
        this.read = parselonglambda0;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final void IconCompatParcelizer(getBrazePushEventType getbrazepusheventtype) {
        this.RemoteActionCompatParcelizer = getbrazepusheventtype;
    }
}
