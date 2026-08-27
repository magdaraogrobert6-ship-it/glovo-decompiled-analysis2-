package o;

import android.content.Context;
import com.huawei.riemann.location.common.utils.Constant;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TransportPostProcessorModelWrapper")
public class getPushStoryGravityAtIndex extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<getAttachedBrazeExtras, BrazeNotificationPayload> {
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompatMediaItem;
    private ByteBuffer MediaDescriptionCompat;
    private ByteBuffer MediaMetadataCompat;
    private ByteBuffer MediaSessionCompatQueueItem;
    private ByteBuffer ParcelableVolumeInfo;
    private ByteBuffer PlaybackStateCompat;
    private ByteBuffer RatingCompat;
    private ByteBuffer RemoteActionCompatParcelizer;
    private ByteBuffer read;
    private final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer;
    private ByteBuffer write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return Constant.ERROR_UNKNOWN;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 7;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.write = null;
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatMediaItem = null;
        this.RatingCompat = null;
        this.MediaMetadataCompat = null;
        this.MediaSessionCompatQueueItem = null;
        this.MediaDescriptionCompat = null;
        this.ParcelableVolumeInfo = null;
        this.PlaybackStateCompat = null;
        ResultReceiver();
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 0;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return this.serializer;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "TransportClassifierPostProc";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        int[] iArr = ((r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM) onContentCardClicked.serializer(this.serializer)).serializer;
        iArr.getClass();
        if (iArr.length == 0) {
            DrawableTransformation.write("Array is empty.");
            return null;
        }
        int i = iArr[0];
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.write(i, null);
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(i * 9, (ByteBuffer) null);
        this.MediaMetadataCompat = ByteBuffer.allocateDirect(i * i).order(ByteOrder.nativeOrder());
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(i, (ByteBuffer) null);
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(i, (ByteBuffer) null);
        int i2 = i * 36;
        this.ParcelableVolumeInfo = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(i2, (ByteBuffer) null);
        this.PlaybackStateCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(i2, (ByteBuffer) null);
        ByteBuffer byteBuffer = this.MediaBrowserCompatMediaItem;
        byteBuffer.getClass();
        map.put(0, byteBuffer);
        ByteBuffer byteBuffer2 = this.RatingCompat;
        byteBuffer2.getClass();
        map.put(1, byteBuffer2);
        ByteBuffer byteBuffer3 = this.MediaMetadataCompat;
        byteBuffer3.getClass();
        map.put(2, byteBuffer3);
        ByteBuffer byteBuffer4 = this.MediaSessionCompatQueueItem;
        byteBuffer4.getClass();
        map.put(3, byteBuffer4);
        ByteBuffer byteBuffer5 = this.MediaDescriptionCompat;
        byteBuffer5.getClass();
        map.put(4, byteBuffer5);
        ByteBuffer byteBuffer6 = this.ParcelableVolumeInfo;
        byteBuffer6.getClass();
        map.put(5, byteBuffer6);
        ByteBuffer byteBuffer7 = this.PlaybackStateCompat;
        byteBuffer7.getClass();
        map.put(6, byteBuffer7);
        Buffer bufferRewind = MediaSessionCompatToken().rewind();
        bufferRewind.getClass();
        map.put(7, bufferRewind);
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        getAttachedBrazeExtras getattachedbrazeextras = (getAttachedBrazeExtras) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        getattachedbrazeextras.getClass();
        this.write = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getattachedbrazeextras.serializer(), this.write);
        this.read = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getattachedbrazeextras.read(), this.read);
        this.RemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(getattachedbrazeextras.RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer);
        MediaSessionCompatToken().rewind();
        ByteBuffer byteBuffer = this.write;
        byteBuffer.getClass();
        ByteBuffer byteBuffer2 = this.read;
        byteBuffer2.getClass();
        ByteBuffer byteBuffer3 = this.RemoteActionCompatParcelizer;
        byteBuffer3.getClass();
        ByteBuffer byteBufferMediaSessionCompatToken = MediaSessionCompatToken();
        byteBufferMediaSessionCompatToken.getClass();
        return new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3, byteBufferMediaSessionCompatToken};
    }

    static {
        new IconCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPushStoryGravityAtIndex(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
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
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 9);
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm2 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 18, 5);
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm3 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 18, 8);
        Integer numValueOf = Integer.valueOf(Constant.ERROR_UNKNOWN);
        this.serializer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{r8lambdawtrzz47alm_pihky7ggotparxm, r8lambdawtrzz47alm_pihky7ggotparxm2, r8lambdawtrzz47alm_pihky7ggotparxm3, new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, numValueOf)};
        this.IconCompatParcelizer = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2.INT32, -1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 9), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2.BOOL, -1, -1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 18, 2), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, -1, 18, 2), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, numValueOf)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        int[] iArrRemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], this.MediaBrowserCompatMediaItem);
        ByteBuffer byteBuffer = this.RatingCompat;
        float[][] fArr = {new float[0]};
        if (byteBuffer != null) {
            byteBuffer.rewind();
            FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
            int iRemaining = floatBufferAsFloatBuffer.remaining();
            if (iRemaining % 9 == 0) {
                int i = iRemaining / 9;
                float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 9);
                for (int i2 = 0; i2 < i; i2++) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        fArr2[i2][i3] = floatBufferAsFloatBuffer.get();
                    }
                }
                fArr = fArr2;
            }
        }
        fArr.getClass();
        return new BrazeNotificationPayload(iArrRemoteActionCompatParcelizer, fArr);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final BrazeNotificationPayload serializer(getAttachedBrazeExtras getattachedbrazeextras) {
        int length = getattachedbrazeextras.serializer().length;
        FwFClientsyncClientsyncResult1 fwFClientsyncClientsyncResult1PlaybackStateCompat = PlaybackStateCompat();
        if (fwFClientsyncClientsyncResult1PlaybackStateCompat != null) {
            r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] r8lambdawtrzz47alm_pihky7ggotparxmArr = this.serializer;
            int length2 = r8lambdawtrzz47alm_pihky7ggotparxmArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm = r8lambdawtrzz47alm_pihky7ggotparxmArr[i];
                if (i2 != 3) {
                    r8lambdawtrzz47alm_pihky7ggotparxm.write(length);
                    fwFClientsyncClientsyncResult1PlaybackStateCompat.serializer(r8lambdawtrzz47alm_pihky7ggotparxm.serializer, i2);
                }
                i++;
                i2++;
            }
            fwFClientsyncClientsyncResult1PlaybackStateCompat.write();
        }
        return (BrazeNotificationPayload) super.serializer(getattachedbrazeextras);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 3;
    }
}
