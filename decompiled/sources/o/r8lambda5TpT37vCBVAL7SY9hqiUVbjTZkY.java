package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "LocationClusteringModelWrapper", componentName = "LocationClusteringModelWrapper")
public class r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<r8lambda8N6k8H5ys5SdUjcAGprIIBW8zs8, r8lambdaHRoBInzy5p0D_Sd1bkVgpTt9zlE> {
    private ByteBuffer RemoteActionCompatParcelizer;
    private ByteBuffer serializer;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] read = {new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2.FLOAT32, 200, 2)};
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] IconCompatParcelizer = {new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2.INT32, 200)};

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        return new r8lambdaHRoBInzy5p0D_Sd1bkVgpTt9zlE(Collections.singletonList(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[]{0}, this.serializer)));
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 1368;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 3;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return IconCompatParcelizer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final boolean PlaybackStateCompatCustomAction() {
        return false;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return null;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 1;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return read;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "LocationClustering";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = null;
            ResultReceiver();
            this.serializer = null;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        ByteBuffer byteBufferWrite = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(200, this.serializer);
        this.serializer = byteBufferWrite;
        map.put(0, byteBufferWrite.rewind());
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        ByteBuffer byteBufferRemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((r8lambda8N6k8H5ys5SdUjcAGprIIBW8zs8) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy).read.get(0));
        this.RemoteActionCompatParcelizer = byteBufferRemoteActionCompatParcelizer;
        return new ByteBuffer[]{byteBufferRemoteActionCompatParcelizer};
    }

    public r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
    }
}
