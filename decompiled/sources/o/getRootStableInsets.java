package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getRootStableInsets {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int ParcelableVolumeInfo;
    public final GetRiderStatusImpl IconCompatParcelizer;
    public final v9 MediaBrowserCompatMediaItem;
    public final va MediaDescriptionCompat;
    public final getActionList MediaMetadataCompat;
    public final GetWorkNowOpportunity MediaSessionCompatQueueItem;
    public final getCurrentInterruptionFilter MediaSessionCompatToken;
    public final E PlaybackStateCompat;
    public final vg PlaybackStateCompatCustomAction;
    public final v4 RatingCompat;
    public final androidx.work.impl.WorkerWrapper.Builder RemoteActionCompatParcelizer;
    public final CanRequestLocationUpdatesImpl read;
    public final subscribeToBannersUpdateslambda2 serializer;
    public final setLastHorizontalStyle write;

    public getRootStableInsets(GetWorkNowOpportunity getWorkNowOpportunity, setLastHorizontalStyle setlasthorizontalstyle, v9 v9Var, va vaVar, vg vgVar, getActiveNotifications getactivenotifications, androidx.work.impl.WorkerWrapper.Builder builder, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, getCurrentInterruptionFilter getcurrentinterruptionfilter, E e, getActionList getactionlist, v4 v4Var, GetRiderStatusImpl getRiderStatusImpl, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.MediaSessionCompatQueueItem = getWorkNowOpportunity;
        this.write = setlasthorizontalstyle;
        this.MediaBrowserCompatMediaItem = v9Var;
        this.MediaDescriptionCompat = vaVar;
        this.PlaybackStateCompatCustomAction = vgVar;
        this.RemoteActionCompatParcelizer = builder;
        this.read = canRequestLocationUpdatesImpl;
        this.MediaSessionCompatToken = getcurrentinterruptionfilter;
        this.PlaybackStateCompat = e;
        this.MediaMetadataCompat = getactionlist;
        this.RatingCompat = v4Var;
        this.IconCompatParcelizer = getRiderStatusImpl;
        this.serializer = subscribetobannersupdateslambda2;
    }

    public final gExternalSyntheticLambda1 RemoteActionCompatParcelizer(createNotificationChannelsCompat createnotificationchannelscompat) {
        long presenter;
        int i;
        int i2;
        int i3 = 2 % 2;
        List list = createnotificationchannelscompat.RemoteActionCompatParcelizer;
        boolean z = this.MediaMetadataCompat.read() ? createnotificationchannelscompat.MediaDescriptionCompat : true;
        if (!list.isEmpty()) {
            int i4 = getBoundingRectsFromInsets.read[createnotificationchannelscompat.write.ordinal()];
            setLastHorizontalStyle setlasthorizontalstyle = this.write;
            if (i4 == 1 || i4 == 2) {
                presenter = setlasthorizontalstyle.IconCompatParcelizer().setPresenter();
            } else {
                int i5 = ParcelableVolumeInfo + 123;
                MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? i4 == 3 : i4 == 5) {
                    presenter = setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintMode();
                    i = ParcelableVolumeInfo + 125;
                    i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else {
                    if (i4 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i6 = MediaSessionCompatResultReceiverWrapper + 93;
                        ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return null;
                    }
                    presenter = setlasthorizontalstyle.IconCompatParcelizer().setOnMenuItemClickListener();
                    i = ParcelableVolumeInfo + 85;
                    i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
                MediaSessionCompatResultReceiverWrapper = i2;
                int i8 = i % 2;
            }
            if (z) {
                List<o7ExternalSyntheticLambda3> list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : list2) {
                    arrayList.add(new f8(o7externalsyntheticlambda3.read, o7externalsyntheticlambda3.write));
                }
                return new gExternalSyntheticLambda1(arrayList, 3.0d, androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(presenter), 0, g5.ALWAYS, null, 80);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r22.MediaDescriptionCompat.read() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r22.MediaDescriptionCompat.read() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.gExternalSyntheticLambda0 read(o.createNotificationChannelsCompat r23) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRootStableInsets.read(o.createNotificationChannelsCompat):o.gExternalSyntheticLambda0");
    }
}
