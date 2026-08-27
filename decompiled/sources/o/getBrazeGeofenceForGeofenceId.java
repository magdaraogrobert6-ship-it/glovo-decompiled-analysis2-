package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "HarshEventModelWrapper")
public class getBrazeGeofenceForGeofenceId extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<tearDownGeofenceslambda1, configureFromServerConfig> {
    private ByteBuffer IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer MediaDescriptionCompat;
    private ByteBuffer MediaMetadataCompat;
    private ByteBuffer MediaSessionCompatQueueItem;
    private ByteBuffer MediaSessionCompatToken;
    private ByteBuffer ParcelableVolumeInfo;
    private ByteBuffer RatingCompat;
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] RemoteActionCompatParcelizer;
    private ByteBuffer read;
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer;
    private ByteBuffer write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 7211;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 4;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.IconCompatParcelizer = null;
        this.write = null;
        this.read = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaDescriptionCompat = null;
        this.MediaSessionCompatQueueItem = null;
        this.MediaMetadataCompat = null;
        this.RatingCompat = null;
        this.MediaSessionCompatToken = null;
        this.ParcelableVolumeInfo = null;
        ResultReceiver();
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 4;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return this.serializer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "DrivingEvents";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(1, this.MediaBrowserCompatMediaItem);
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(1, this.MediaDescriptionCompat);
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatQueueItem);
        this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(1, this.MediaMetadataCompat);
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.RatingCompat);
        this.MediaSessionCompatToken = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatToken);
        this.ParcelableVolumeInfo = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.ParcelableVolumeInfo);
        ByteBuffer byteBuffer = this.MediaBrowserCompatMediaItem;
        byteBuffer.getClass();
        Buffer bufferRewind = byteBuffer.rewind();
        bufferRewind.getClass();
        map.put(0, bufferRewind);
        ByteBuffer byteBuffer2 = this.MediaDescriptionCompat;
        byteBuffer2.getClass();
        Buffer bufferRewind2 = byteBuffer2.rewind();
        bufferRewind2.getClass();
        map.put(1, bufferRewind2);
        ByteBuffer byteBuffer3 = this.MediaSessionCompatQueueItem;
        byteBuffer3.getClass();
        Buffer bufferRewind3 = byteBuffer3.rewind();
        bufferRewind3.getClass();
        map.put(2, bufferRewind3);
        ByteBuffer byteBuffer4 = this.MediaMetadataCompat;
        byteBuffer4.getClass();
        Buffer bufferRewind4 = byteBuffer4.rewind();
        bufferRewind4.getClass();
        map.put(3, bufferRewind4);
        ByteBuffer byteBuffer5 = this.RatingCompat;
        byteBuffer5.getClass();
        Buffer bufferRewind5 = byteBuffer5.rewind();
        bufferRewind5.getClass();
        map.put(4, bufferRewind5);
        ByteBuffer byteBuffer6 = this.MediaSessionCompatToken;
        byteBuffer6.getClass();
        Buffer bufferRewind6 = byteBuffer6.rewind();
        bufferRewind6.getClass();
        map.put(5, bufferRewind6);
        ByteBuffer byteBuffer7 = this.ParcelableVolumeInfo;
        byteBuffer7.getClass();
        Buffer bufferRewind7 = byteBuffer7.rewind();
        bufferRewind7.getClass();
        map.put(6, bufferRewind7);
        Buffer bufferRewind8 = MediaSessionCompatToken().rewind();
        bufferRewind8.getClass();
        map.put(7, bufferRewind8);
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        tearDownGeofenceslambda1 teardowngeofenceslambda1 = (tearDownGeofenceslambda1) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        teardowngeofenceslambda1.getClass();
        this.IconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(teardowngeofenceslambda1.read(), this.IconCompatParcelizer);
        this.write = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(teardowngeofenceslambda1.serializer(), this.write);
        this.read = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(teardowngeofenceslambda1.IconCompatParcelizer(), this.read);
        MediaSessionCompatToken().rewind();
        ByteBuffer byteBuffer = this.IconCompatParcelizer;
        byteBuffer.getClass();
        ByteBuffer byteBuffer2 = this.write;
        byteBuffer2.getClass();
        ByteBuffer byteBuffer3 = this.read;
        byteBuffer3.getClass();
        ByteBuffer byteBufferMediaSessionCompatToken = MediaSessionCompatToken();
        byteBufferMediaSessionCompatToken.getClass();
        return new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3, byteBufferMediaSessionCompatToken};
    }

    static {
        new IconCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeGeofenceForGeofenceId(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
        context.getClass();
        parselonglambda0.getClass();
        cancelnotification.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        configurationManager.getClass();
        parseobjectasintegerlambda1.getClass();
        r8lambdaremgmq_nnan8kczvrhpi3ubvpia.getClass();
        getgeofencerequestlocationannotations.getClass();
        getnotificationidlambda0.getClass();
        FwFClientcache2 fwFClientcache2 = FwFClientcache2.FLOAT32;
        this.serializer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 9, 5), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 7211)};
        FwFClientcache2 fwFClientcache3 = FwFClientcache2.INT32;
        this.RemoteActionCompatParcelizer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache3, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache3, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache3, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 7211)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        return new configureFromServerConfig(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], this.MediaBrowserCompatMediaItem)[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], this.MediaDescriptionCompat)[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatQueueItem, new float[0])[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], this.MediaMetadataCompat)[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.RatingCompat, new float[0])[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatToken, new float[0])[0], r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.ParcelableVolumeInfo, new float[0])[0]);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 2;
    }
}
