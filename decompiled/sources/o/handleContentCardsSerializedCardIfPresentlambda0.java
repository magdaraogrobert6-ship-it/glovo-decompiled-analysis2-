package o;

import android.location.Location;
import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.E$b;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.sensorstream.SensorType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class handleContentCardsSerializedCardIfPresentlambda0 implements routeUserWithNotificationOpenedIntentlambda0, routeUserWithNotificationOpenedIntentlambda1, routeUserWithNotificationOpenedIntentlambda4, Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    private final int IconCompatParcelizer;
    private final ConfigurationManager MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final setSoundIfPresentAndSupportedlambda1 MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper = 0;
    private final routeUserWithNotificationOpenedIntentlambda3 PlaybackStateCompat;
    private final getVerticalAccuracy RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final String read;
    private final long serializer;
    private final long write;

    @Override // o.routeUserWithNotificationOpenedIntentlambda0
    public final List<SensorType> RemoteActionCompatParcelizer() {
        HashSet hashSet = new HashSet();
        byte[] bArr = {3, 4, 5};
        for (int i = 0; i < 3; i++) {
            BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0 = this.MediaBrowserCompatMediaItem.read("", bArr[i]);
            if (bannerExternalSyntheticLambda0 != null) {
                hashSet.addAll(bannerExternalSyntheticLambda0.RemoteActionCompatParcelizer().keySet());
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MediaSessionCompatResultReceiverWrapper < this.IconCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility> next() {
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1;
        if (!hasNext()) {
            return null;
        }
        long j = this.MediaSessionCompatResultReceiverWrapper;
        long j2 = this.write;
        long j3 = (j * 1800000) + j2;
        long jMin = Math.min(Math.min(1800000 + j3, this.serializer), j2 + 43200000);
        this.MediaSessionCompatResultReceiverWrapper++;
        String strC = com.sentiance.sdk.util.x.c(j3);
        String strC2 = com.sentiance.sdk.util.x.c(jMin);
        String str = this.read;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Building AppForegroundSession %s for duration %s to %s", str, strC, strC2);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<getCooldownEnterSeconds.read> it = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(j3 - 1), Long.valueOf(jMin), false, false).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            setsoundifpresentandsupportedlambda1 = this.MediaMetadataCompat;
            if (!zHasNext) {
                break;
            }
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null ? r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 : null;
            if (r8lambdaibd0azdffjr6m_pevs2l1iejku != null) {
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                if (hashSet.add(brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer)) {
                    this.RatingCompat.getClass();
                    Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                    setsoundifpresentandsupportedlambda1.getClass();
                    arrayList.add(setSoundIfPresentAndSupportedlambda1.read(locationWrite));
                }
            }
        }
        List<createNotification> listRemoteActionCompatParcelizer = this.PlaybackStateCompat.RemoteActionCompatParcelizer(j3, jMin);
        E$b e$b = new E$b(13);
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'session_id' cannot be null");
            return null;
        }
        e$b.read = str;
        e$b.MediaMetadataCompat = Long.valueOf(j3);
        e$b.RemoteActionCompatParcelizer = Long.valueOf(jMin);
        e$b.write = arrayList;
        e$b.MediaBrowserCompatMediaItem = listRemoteActionCompatParcelizer;
        e$b.MediaDescriptionCompat = Boolean.valueOf(!hasNext());
        e$b.IconCompatParcelizer = Short.valueOf((short) this.MediaSessionCompatResultReceiverWrapper);
        setEmail setemailWrite = e$b.write();
        setsoundifpresentandsupportedlambda1.getClass();
        return new Pair<>(setsoundifpresentandsupportedlambda1.write(setemailWrite, setemailWrite.serializer), null);
    }

    @Override // o.routeUserWithNotificationOpenedIntentlambda1
    public final boolean write() {
        return this.MediaBrowserCompatMediaItem.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    public handleContentCardsSerializedCardIfPresentlambda0(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, String str, long j, long j2) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = j2;
        this.write = j;
        this.read = str;
        this.MediaSessionCompatQueueItem = getcooldownenterseconds;
        this.RatingCompat = getverticalaccuracy;
        this.MediaMetadataCompat = setsoundifpresentandsupportedlambda1;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = configurationManager;
        this.PlaybackStateCompat = new routeUserWithNotificationOpenedIntentlambda3(parselonglambda0, getcooldownenterseconds, component4android_sdk_base_releaseVar, configurationManager, this, this, this);
        this.IconCompatParcelizer = j < j2 ? (int) Math.ceil(Math.min(j2 - j, 43200000L) / 1800000.0d) : 0;
    }

    @Override // o.routeUserWithNotificationOpenedIntentlambda4
    public final long write(long j, long j2) {
        return Math.min(j, this.write);
    }
}
