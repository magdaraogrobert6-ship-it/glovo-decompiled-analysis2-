package o;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetPreviouscp {
    public final CharSequence RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public accessgetPreviouscp(NotificationChannelGroup notificationChannelGroup) {
        List list = Collections.EMPTY_LIST;
        String id = notificationChannelGroup.getId();
        id.getClass();
        this.serializer = id;
        this.RemoteActionCompatParcelizer = notificationChannelGroup.getName();
        this.read = notificationChannelGroup.getDescription();
        notificationChannelGroup.isBlocked();
        List<NotificationChannel> channels = notificationChannelGroup.getChannels();
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : channels) {
            if (this.serializer.equals(notificationChannel.getGroup())) {
                arrayList.add(new accessgetNextcp(notificationChannel));
            }
        }
    }

    public final NotificationChannelGroup serializer() {
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.serializer, this.RemoteActionCompatParcelizer);
        notificationChannelGroup.setDescription(this.read);
        return notificationChannelGroup;
    }
}
