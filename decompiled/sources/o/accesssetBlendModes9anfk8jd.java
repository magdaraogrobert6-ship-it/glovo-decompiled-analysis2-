package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetBlendModes9anfk8jd {
    public final int IconCompatParcelizer;
    public final Notification serializer;
    public final int write;

    public accesssetBlendModes9anfk8jd(int i, Notification notification, int i2) {
        this.IconCompatParcelizer = i;
        this.serializer = notification;
        this.write = i2;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return this.serializer.hashCode() + (((i * 31) + this.write) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.IconCompatParcelizer + ", mForegroundServiceType=" + this.write + ", mNotification=" + this.serializer + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accesssetBlendModes9anfk8jd.class != obj.getClass()) {
            return false;
        }
        accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd = (accesssetBlendModes9anfk8jd) obj;
        if (this.IconCompatParcelizer == accesssetblendmodes9anfk8jd.IconCompatParcelizer && this.write == accesssetblendmodes9anfk8jd.write) {
            return this.serializer.equals(accesssetblendmodes9anfk8jd.serializer);
        }
        return false;
    }

    public accesssetBlendModes9anfk8jd(int i, Notification notification) {
        this(i, notification, 0);
    }
}
