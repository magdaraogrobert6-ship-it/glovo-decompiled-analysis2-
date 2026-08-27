package o;

import android.util.Pair;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class handleNotificationOpenedlambda0 extends logBaiduNotificationClicklambda1 {
    private final long IconCompatParcelizer;
    private final BrazeCompanionExternalSyntheticLambda4 MediaBrowserCompatMediaItem;
    private final Short MediaDescriptionCompat;
    private final List<r8lambdaR6dAybf4g5pc5sZkFujTnBDSk> MediaMetadataCompat;
    private final Short MediaSessionCompatQueueItem;
    private final Short MediaSessionCompatResultReceiverWrapper;
    private final String MediaSessionCompatToken;
    private final Short ParcelableVolumeInfo;
    private final Short PlaybackStateCompatCustomAction;
    private final String RatingCompat;
    private final component4android_sdk_base_release RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final getVerticalAccuracy serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    public static ArrayList read(handleNotificationOpenedlambda0 handlenotificationopenedlambda0, List list) {
        BrazeUser brazeUser;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) it.next()).RemoteActionCompatParcelizer(handlenotificationopenedlambda0.RemoteActionCompatParcelizer);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null || (brazeUser = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addMenuProvider) == null || brazeUser.write.byteValue() != 1) {
                it.remove();
            } else {
                arrayList.add(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    public handleNotificationOpenedlambda0(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, long j, String str, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, List<r8lambdaR6dAybf4g5pc5sZkFujTnBDSk> list, Short sh, Short sh2, Short sh3, Short sh4, Short sh5, String str2) {
        this.read = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = component4android_sdk_base_releaseVar;
        this.serializer = getverticalaccuracy;
        this.IconCompatParcelizer = j;
        this.write = setsoundifpresentandsupportedlambda1;
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = brazeCompanionExternalSyntheticLambda4;
        this.MediaMetadataCompat = list;
        this.MediaDescriptionCompat = sh;
        this.MediaSessionCompatQueueItem = sh2;
        this.PlaybackStateCompatCustomAction = sh3;
        this.ParcelableVolumeInfo = sh4;
        this.MediaSessionCompatResultReceiverWrapper = sh5;
        this.MediaSessionCompatToken = str2;
    }

    public static r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU RemoteActionCompatParcelizer(handleNotificationOpenedlambda0 handlenotificationopenedlambda0, long j) {
        BrazeUser brazeUser;
        boolean z = true;
        while (z) {
            getCooldownEnterSeconds getcooldownenterseconds = handlenotificationopenedlambda0.read;
            getcooldownenterseconds.getClass();
            Optional optional = (Optional) getcooldownenterseconds.serializer(Optional.MediaSessionCompatQueueItem(), new getRadiusMeters(getcooldownenterseconds, j, 2));
            if (optional.IconCompatParcelizer()) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(handlenotificationopenedlambda0.RemoteActionCompatParcelizer);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (brazeUser = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addMenuProvider) != null && brazeUser.write.byteValue() == 1) {
                    return r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
                }
                j = ((getCooldownEnterSeconds.read) optional.write()).IconCompatParcelizer();
            } else {
                z = false;
            }
        }
        return null;
    }

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new handleNotificationOpenedlambda1(this);
    }
}
