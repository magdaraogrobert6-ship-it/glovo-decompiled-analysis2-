package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TwoWheelerCrashModelWrapper")
public class r8lambdaVE_zPOiqvDV1CHt6KyA20QVrsc0 extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM, r8lambdaY_tw5xdi3vE_VCye43O8vkd3Gv0> {
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] IconCompatParcelizer;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] read;
    public static final /* synthetic */ int write = 0;
    private ByteBuffer ComponentActivity;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer MediaDescriptionCompat;
    private ByteBuffer MediaMetadataCompat;
    private ByteBuffer MediaSessionCompatQueueItem;
    private ByteBuffer MediaSessionCompatResultReceiverWrapper;
    private ByteBuffer MediaSessionCompatToken;
    private ByteBuffer ParcelableVolumeInfo;
    private ByteBuffer PlaybackStateCompat;
    private ByteBuffer PlaybackStateCompatCustomAction;
    private ByteBuffer RatingCompat;
    private ByteBuffer RemoteActionCompatParcelizer;
    private ByteBuffer serializer;

    public r8lambdaVE_zPOiqvDV1CHt6KyA20QVrsc0(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 14781;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 6;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return IconCompatParcelizer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 6;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return read;
    }

    static {
        FwFClientcache2 fwFClientcache2 = FwFClientcache2.FLOAT32;
        read = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 9, 5), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 14781)};
        IconCompatParcelizer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 14781), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "CrashDetector2w";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this) {
            this.serializer = null;
            this.RemoteActionCompatParcelizer = null;
            this.MediaSessionCompatQueueItem = null;
            ResultReceiver();
            this.RatingCompat = null;
            this.MediaDescriptionCompat = null;
            this.MediaMetadataCompat = null;
            this.ParcelableVolumeInfo = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaSessionCompatToken = null;
            this.PlaybackStateCompat = null;
            this.PlaybackStateCompatCustomAction = null;
            this.MediaSessionCompatResultReceiverWrapper = null;
            this.ComponentActivity = null;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(1, this.RatingCompat);
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaDescriptionCompat);
        this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaBrowserCompatMediaItem);
        this.MediaSessionCompatToken = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatToken);
        this.PlaybackStateCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.PlaybackStateCompat);
        this.PlaybackStateCompatCustomAction = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.PlaybackStateCompatCustomAction);
        this.ParcelableVolumeInfo = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.ParcelableVolumeInfo);
        this.MediaSessionCompatResultReceiverWrapper = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatResultReceiverWrapper);
        this.ComponentActivity = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.ComponentActivity);
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.ParcelableVolumeInfo, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.PlaybackStateCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatToken, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaMetadataCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaDescriptionCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.RatingCompat, map, (Integer) 0, 1), 2), 3), 4), 5), 6), 7), 8), MediaSessionCompatToken().rewind());
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, map, (Integer) 9, 10), this.ComponentActivity.rewind());
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM r8lambdaqblfvutauwlj6mnhoke1qwkobm = (r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        this.serializer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaqblfvutauwlj6mnhoke1qwkobm.write, this.serializer);
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaqblfvutauwlj6mnhoke1qwkobm.read, this.MediaSessionCompatQueueItem);
        this.RemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaqblfvutauwlj6mnhoke1qwkobm.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
        MediaSessionCompatToken().rewind();
        return new ByteBuffer[]{this.serializer, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, MediaSessionCompatToken()};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        CrashSeverityInternal crashSeverityInternal;
        float[] fArr = {0.0f};
        float f = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.RatingCompat, fArr)[0];
        float f2 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaDescriptionCompat, fArr)[0];
        float f3 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaMetadataCompat, fArr)[0];
        float f4 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, fArr)[0];
        float f5 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatToken, fArr)[0];
        float f6 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.PlaybackStateCompat, fArr)[0];
        float f7 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, fArr)[0];
        float f8 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.ParcelableVolumeInfo, fArr)[0];
        float f9 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, fArr)[0];
        int i = (int) r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.ComponentActivity, new float[]{-1.0f})[0];
        r8lambdaUkk11bvXf_SXZaN7i7x90QCDrr4 r8lambdaukk11bvxf_sxzan7i7x90qcdrr4 = new r8lambdaUkk11bvXf_SXZaN7i7x90QCDrr4();
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.MediaBrowserCompatMediaItem(f);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.RatingCompat(f2);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.MediaSessionCompatQueueItem(f3);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.IconCompatParcelizer(f4);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.serializer(f5);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.read(f6);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.MediaMetadataCompat(f7);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.write(f8);
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.RemoteActionCompatParcelizer(f9);
        if (i == 1) {
            crashSeverityInternal = CrashSeverityInternal.LOW;
        } else if (i == 2) {
            crashSeverityInternal = CrashSeverityInternal.MEDIUM;
        } else if (i != 3) {
            crashSeverityInternal = CrashSeverityInternal.INVALID;
        } else {
            crashSeverityInternal = CrashSeverityInternal.HIGH;
        }
        r8lambdaukk11bvxf_sxzan7i7x90qcdrr4.RemoteActionCompatParcelizer(crashSeverityInternal);
        return new r8lambdaY_tw5xdi3vE_VCye43O8vkd3Gv0(r8lambdaukk11bvxf_sxzan7i7x90qcdrr4);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 3;
    }
}
