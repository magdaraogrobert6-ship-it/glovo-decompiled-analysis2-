package o;

import android.content.Context;
import com.huawei.riemann.location.common.utils.Constant;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportClassifierModelWrapper")
public class isValidKey extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<getlambda0, clonelambda0> {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] read;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] write;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer MediaDescriptionCompat;
    private ByteBuffer MediaMetadataCompat;
    private ByteBuffer MediaSessionCompatQueueItem;
    private ByteBuffer MediaSessionCompatToken;
    private ByteBuffer PlaybackStateCompat;
    private ByteBuffer RatingCompat;
    private ByteBuffer RemoteActionCompatParcelizer;
    private ByteBuffer serializer;

    public isValidKey(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return Constant.ERROR_UNKNOWN;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 1;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return write;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 5;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return read;
    }

    static {
        FwFClientcache2 fwFClientcache2 = FwFClientcache2.FLOAT32;
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1800, 4);
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm2 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1800, 4);
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm3 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 18, 5);
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm4 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 18, 8);
        Integer numValueOf = Integer.valueOf(Constant.ERROR_UNKNOWN);
        read = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{r8lambdawtrzz47alm_pihky7ggotparxm, r8lambdawtrzz47alm_pihky7ggotparxm2, r8lambdawtrzz47alm_pihky7ggotparxm3, r8lambdawtrzz47alm_pihky7ggotparxm4, new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, numValueOf)};
        write = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 9), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 3), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, numValueOf)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "TransportClassifier";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = null;
            this.serializer = null;
            this.RatingCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            ResultReceiver();
            this.MediaDescriptionCompat = null;
            this.MediaSessionCompatQueueItem = null;
            this.MediaMetadataCompat = null;
            this.PlaybackStateCompat = null;
            this.MediaSessionCompatToken = null;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaDescriptionCompat);
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatQueueItem);
        this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(9, this.MediaMetadataCompat);
        this.PlaybackStateCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(3, this.PlaybackStateCompat);
        this.MediaSessionCompatToken = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatToken);
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatToken, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.PlaybackStateCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatQueueItem, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaMetadataCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaDescriptionCompat, map, (Integer) 0, 1), 2), 3), 4), 5), MediaSessionCompatToken().rewind());
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        getlambda0 getlambda0Var = (getlambda0) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        this.RemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getlambda0Var.serializer, this.RemoteActionCompatParcelizer);
        this.serializer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getlambda0Var.IconCompatParcelizer, this.serializer);
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getlambda0Var.write, this.RatingCompat);
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getlambda0Var.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
        MediaSessionCompatToken().rewind();
        return new ByteBuffer[]{this.RemoteActionCompatParcelizer, this.serializer, this.RatingCompat, this.MediaBrowserCompatMediaItem, MediaSessionCompatToken()};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        float[] fArr = {0.0f};
        float[] fArrIconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaDescriptionCompat, fArr);
        return new clonelambda0(fArrIconCompatParcelizer[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatQueueItem, fArr)[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaMetadataCompat, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.PlaybackStateCompat, fArr), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatToken, fArr)[0]);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 4;
    }
}
