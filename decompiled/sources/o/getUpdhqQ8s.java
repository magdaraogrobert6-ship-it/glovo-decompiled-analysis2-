package o;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getUpdhqQ8s extends NotificationCompat$Style {
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((androidx.core.app.NotificationCompatBuilder) accessgetleftcp).serializer).setBigContentTitle(this.MediaSessionCompatToken);
        if (this.MediaSessionCompatResultReceiverWrapper) {
            bigContentTitle.setSummaryText(this.PlaybackStateCompat);
        }
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.textLines");
    }
}
