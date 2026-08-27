package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "VisitEssentialsModelWrapper", componentName = "VisitEssentialsModelWrapper")
public class deleteSharedPreferencesFile extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<r8lambdaZpsmHbmLPqrOx8Ep95TrDGqbHC8, r8lambdaI2JAG4pt0hsPppV8ZuIPfl7LIl8> {
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] RemoteActionCompatParcelizer;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer;
    private ByteBuffer IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer MediaDescriptionCompat;
    private ByteBuffer MediaMetadataCompat;
    private ByteBuffer MediaSessionCompatQueueItem;
    private ByteBuffer ParcelableVolumeInfo;
    private ByteBuffer RatingCompat;
    private ByteBuffer read;
    private ByteBuffer write;

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 2568;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 2;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return serializer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final boolean PlaybackStateCompatCustomAction() {
        return true;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 2;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return RemoteActionCompatParcelizer;
    }

    static {
        FwFClientcache2 fwFClientcache2 = FwFClientcache2.FLOAT32;
        RemoteActionCompatParcelizer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 8), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 30, 5), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 2568)};
        serializer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 200, 3), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 2568), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1, 27)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "VisitEssentials";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this) {
            this.write = null;
            this.IconCompatParcelizer = null;
            this.read = null;
            ResultReceiver();
            this.MediaBrowserCompatMediaItem = null;
            this.RatingCompat = null;
            this.MediaDescriptionCompat = null;
            this.MediaSessionCompatQueueItem = null;
            this.MediaMetadataCompat = null;
            this.ParcelableVolumeInfo = null;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaBrowserCompatMediaItem);
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.RatingCompat);
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaDescriptionCompat);
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatQueueItem);
        this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(27, this.MediaMetadataCompat);
        this.ParcelableVolumeInfo = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(600, this.ParcelableVolumeInfo);
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.ParcelableVolumeInfo, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaDescriptionCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.RatingCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, map, (Integer) 0, 1), 2), 3), 4), MediaSessionCompatToken().rewind());
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatQueueItem, map, (Integer) 5, 6), this.MediaMetadataCompat.rewind());
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        r8lambdaZpsmHbmLPqrOx8Ep95TrDGqbHC8 r8lambdazpsmhbmlpqrox8ep95trdgqbhc8 = (r8lambdaZpsmHbmLPqrOx8Ep95TrDGqbHC8) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        this.write = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.write, r8lambdazpsmhbmlpqrox8ep95trdgqbhc8.write.get(0));
        List<float[]> list = r8lambdazpsmhbmlpqrox8ep95trdgqbhc8.write;
        this.IconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.IconCompatParcelizer, list.get(1));
        this.read = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.read, list.get(2));
        MediaSessionCompatToken().rewind();
        return new ByteBuffer[]{this.write, this.IconCompatParcelizer, this.read, MediaSessionCompatToken()};
    }

    public deleteSharedPreferencesFile(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        float[] fArr = {0.0f};
        return new r8lambdaI2JAG4pt0hsPppV8ZuIPfl7LIl8(Arrays.asList(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.RatingCompat, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaDescriptionCompat, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.ParcelableVolumeInfo, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(MediaSessionCompatToken(), fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatQueueItem, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaMetadataCompat, fArr)));
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 3;
    }
}
