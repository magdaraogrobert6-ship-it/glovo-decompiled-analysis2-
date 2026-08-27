package o;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$Style;

/* JADX INFO: loaded from: classes.dex */
public final class getExitdhqQ8s extends NotificationCompat$Style {
    public CharSequence IconCompatParcelizer;

    public getExitdhqQ8s() {
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((androidx.core.app.NotificationCompatBuilder) accessgetleftcp).serializer).setBigContentTitle(this.MediaSessionCompatToken).bigText(this.IconCompatParcelizer);
        if (this.MediaSessionCompatResultReceiverWrapper) {
            bigTextStyleBigText.setSummaryText(this.PlaybackStateCompat);
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void IconCompatParcelizer(CharSequence charSequence) {
        this.PlaybackStateCompat = getEnterdhqQ8s.serializer(charSequence);
        this.MediaSessionCompatResultReceiverWrapper = true;
    }

    public final void serializer(CharSequence charSequence) {
        this.MediaSessionCompatToken = getEnterdhqQ8s.serializer(charSequence);
    }

    public final void write(CharSequence charSequence) {
        this.IconCompatParcelizer = getEnterdhqQ8s.serializer(charSequence);
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.bigText");
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.IconCompatParcelizer = bundle.getCharSequence("android.bigText");
    }

    public getExitdhqQ8s(int i) {
    }
}
