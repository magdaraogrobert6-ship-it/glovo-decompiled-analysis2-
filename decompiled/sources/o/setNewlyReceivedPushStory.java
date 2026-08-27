package o;

/* JADX INFO: loaded from: classes3.dex */
public class setNewlyReceivedPushStory extends setNotificationBadgeNumber {
    public final boolean IconCompatParcelizer(int i) {
        if (!MediaSessionCompatToken()) {
            return false;
        }
        this.RemoteActionCompatParcelizer = i;
        ParcelableVolumeInfo();
        return true;
    }
}
