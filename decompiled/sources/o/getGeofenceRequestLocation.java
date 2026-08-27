package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PhoneUsageModelWrapper")
public class getGeofenceRequestLocation extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<initializeGeofences, getBrazeLocationApi> {
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer RemoteActionCompatParcelizer;
    private ByteBuffer read;
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer;
    private ByteBuffer write;

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 1;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 5;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
        this.MediaBrowserCompatMediaItem = null;
        ResultReceiver();
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 3;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return this.serializer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "PhoneUsage";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        ByteBuffer byteBufferWrite = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(1, this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem = byteBufferWrite;
        byteBufferWrite.getClass();
        Buffer bufferRewind = byteBufferWrite.rewind();
        bufferRewind.getClass();
        map.put(0, bufferRewind);
        Buffer bufferRewind2 = MediaSessionCompatToken().rewind();
        bufferRewind2.getClass();
        map.put(1, bufferRewind2);
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        initializeGeofences initializegeofences = (initializeGeofences) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        initializegeofences.getClass();
        this.write = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(initializegeofences.write(), this.write);
        this.RemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(initializegeofences.serializer(), this.RemoteActionCompatParcelizer);
        this.read = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(initializegeofences.RemoteActionCompatParcelizer(), this.read);
        MediaSessionCompatToken().rewind();
        ByteBuffer byteBuffer = this.write;
        byteBuffer.getClass();
        ByteBuffer byteBuffer2 = this.RemoteActionCompatParcelizer;
        byteBuffer2.getClass();
        ByteBuffer byteBuffer3 = this.read;
        byteBuffer3.getClass();
        ByteBuffer byteBufferMediaSessionCompatToken = MediaSessionCompatToken();
        byteBufferMediaSessionCompatToken.getClass();
        return new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3, byteBufferMediaSessionCompatToken};
    }

    static {
        new write(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getGeofenceRequestLocation(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
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
        this.serializer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 200, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 200, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 2, 5), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1)};
        this.IconCompatParcelizer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2.INT32, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        return new getBrazeLocationApi(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], this.MediaBrowserCompatMediaItem)[0]);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 3;
    }
}
