package o;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.exception.NativeExceptionHandler;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import com.sentiance.sdk.ondevicecommon.TFLiteException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "CarCrashModelWrapper", componentName = "CarCrashModelWrapper")
public class r8lambda2bKkqxJZ0SIYHKXIK7froon_Bi4 extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs, BrazeGeofenceManager> {
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] read;
    public static final /* synthetic */ int serializer = 0;
    private static final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] write;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI ComponentActivity;
    private ByteBuffer IconCompatParcelizer;
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
    private final NativeExceptionHandler ResultReceiver;
    private final parseLonglambda0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final com.sentiance.sdk.util.c r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final getGeofenceRequestLocationannotations r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private ByteBuffer r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int MediaBrowserCompatMediaItem() {
        return 3663;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final byte MediaDescriptionCompat() {
        return (byte) 0;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem() {
        return write;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final boolean RatingCompat() {
        synchronized (this) {
            boolean zRatingCompat = super.RatingCompat();
            if (zRatingCompat) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                String str = Build.CPU_ABI;
                if (str != null && str.equals("armeabi-v7a")) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer("Checking for previous native crashes around last model run time for ARMv7a architecture", new Object[0]);
                    if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write("model_run_start_time")) {
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer("Previous model run was interrupted. Checking for native crashes...", new Object[0]);
                        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
                            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer("Previous model run was interrupted by a TensorFlow Lite native crash. Not loading the model again to prevent repeated crashes.", new Object[0]);
                            write(new TFLiteException("CarCrashModelWrapper previously crashed natively"), true);
                            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read("model_run_start_time");
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            return false;
                        }
                    }
                }
            }
            return zRatingCompat;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final int read() {
        return 9;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer() {
        return read;
    }

    static {
        FwFClientcache2 fwFClientcache2 = FwFClientcache2.FLOAT32;
        read = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 900, 4), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 9, 5), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 3663)};
        write = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[]{new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 3663), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1), new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientcache2, 1)};
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final String MediaMetadataCompat() {
        return "CrashDetector";
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = null;
            ResultReceiver();
            this.MediaDescriptionCompat = null;
            this.RatingCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            this.PlaybackStateCompat = null;
            this.MediaMetadataCompat = null;
            this.MediaSessionCompatQueueItem = null;
            this.MediaSessionCompatToken = null;
            this.PlaybackStateCompatCustomAction = null;
            this.MediaSessionCompatResultReceiverWrapper = null;
            this.ParcelableVolumeInfo = null;
        }
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk serializer(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        this.ComponentActivity.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.sentiance.sdk.util.c cVar = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        cVar.read(jCurrentTimeMillis, "model_run_start_time");
        BrazeGeofenceManager brazeGeofenceManager = (BrazeGeofenceManager) super.serializer((r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy);
        cVar.read("model_run_start_time");
        return brazeGeofenceManager;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final HashMap write() {
        HashMap map = new HashMap();
        this.MediaDescriptionCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaDescriptionCompat);
        this.RatingCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.RatingCompat);
        this.MediaBrowserCompatMediaItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaBrowserCompatMediaItem);
        this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaMetadataCompat);
        this.MediaSessionCompatQueueItem = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatQueueItem);
        this.MediaSessionCompatToken = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatToken);
        this.PlaybackStateCompatCustomAction = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.PlaybackStateCompatCustomAction);
        this.PlaybackStateCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.PlaybackStateCompat);
        this.MediaSessionCompatResultReceiverWrapper = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.MediaSessionCompatResultReceiverWrapper);
        this.ParcelableVolumeInfo = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(1, this.ParcelableVolumeInfo);
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.PlaybackStateCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatToken, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatQueueItem, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaMetadataCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.RatingCompat, map, MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaDescriptionCompat, map, (Integer) 0, 1), 2), 3), 4), 5), 6), 7), 8), MediaSessionCompatToken().rewind());
        map.put(MediaSessionCompatQueueItem.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, map, (Integer) 9, 10), this.ParcelableVolumeInfo.rewind());
        return map;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final ByteBuffer[] write(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfy) {
        r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs r8lambdaaqqaeoi18rmmjz20uldhfemqvs = (r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs) r8lambdaizrsr5syuyk5t_cq3jk1hplpfy;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaaqqaeoi18rmmjz20uldhfemqvs.IconCompatParcelizer, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        this.RemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaaqqaeoi18rmmjz20uldhfemqvs.write, this.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.read(r8lambdaaqqaeoi18rmmjz20uldhfemqvs.read, this.IconCompatParcelizer);
        MediaSessionCompatToken().rewind();
        return new ByteBuffer[]{this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, MediaSessionCompatToken()};
    }

    private boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        long jIconCompatParcelizer = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("model_run_start_time", -1L);
        Long lValueOf = jIconCompatParcelizer < 0 ? null : Long.valueOf(jIconCompatParcelizer);
        parseLonglambda0 parselonglambda0 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (lValueOf == null) {
            parselonglambda0.IconCompatParcelizer("No last model run start time found in cache", new Object[0]);
            return false;
        }
        parselonglambda0.IconCompatParcelizer("Last model run start time: %d", lValueOf);
        Iterator<NativeExceptionHandler.write> it = this.ResultReceiver.getMaxDayOldExceptionsBetween(lValueOf.longValue(), lValueOf.longValue() + DeviceOrientationRequest.OUTPUT_PERIOD_FAST).iterator();
        while (it.hasNext()) {
            if (it.next().serializer().contains("libtensorflowlite")) {
                return true;
            }
        }
        return false;
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk IconCompatParcelizer() {
        CrashSeverityInternal crashSeverityInternal;
        float[] fArr = {0.0f};
        float f = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaDescriptionCompat, fArr)[0];
        float f2 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.RatingCompat, fArr)[0];
        float f3 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, fArr)[0];
        float f4 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaMetadataCompat, fArr)[0];
        float f5 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatQueueItem, fArr)[0];
        float f6 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatToken, fArr)[0];
        float f7 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, fArr)[0];
        float f8 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.PlaybackStateCompat, fArr)[0];
        float f9 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, fArr)[0];
        int i = (int) r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.ParcelableVolumeInfo, new float[]{-1.0f})[0];
        r8lambdaFLEgXVYp2V5qdfLAhO3cyeghfA r8lambdaflegxvyp2v5qdflaho3cyeghfa = new r8lambdaFLEgXVYp2V5qdfLAhO3cyeghfA();
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.RatingCompat(f);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.MediaBrowserCompatMediaItem(f2);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.MediaDescriptionCompat(f3);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.IconCompatParcelizer(f4);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.write(f5);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.serializer(f6);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.MediaMetadataCompat(f7);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.RemoteActionCompatParcelizer(f8);
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.read(f9);
        if (i == 1) {
            crashSeverityInternal = CrashSeverityInternal.LOW;
        } else if (i == 2) {
            crashSeverityInternal = CrashSeverityInternal.MEDIUM;
        } else if (i != 3) {
            crashSeverityInternal = CrashSeverityInternal.INVALID;
        } else {
            crashSeverityInternal = CrashSeverityInternal.HIGH;
        }
        r8lambdaflegxvyp2v5qdflaho3cyeghfa.write(crashSeverityInternal);
        return new BrazeGeofenceManager(r8lambdaflegxvyp2v5qdflaho3cyeghfa);
    }

    @Override // o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA
    public final Integer RemoteActionCompatParcelizer() {
        return 3;
    }

    public r8lambda2bKkqxJZ0SIYHKXIK7froon_Bi4(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, com.sentiance.sdk.util.c cVar, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, NativeExceptionHandler nativeExceptionHandler, getNotificationIdlambda0 getnotificationidlambda0) {
        super(context, parselonglambda0, cancelnotification, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurationManager, parseobjectasintegerlambda1, r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getgeofencerequestlocationannotations, getnotificationidlambda0);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = cVar;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = parselonglambda0;
        this.ComponentActivity = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getgeofencerequestlocationannotations;
        this.ResultReceiver = nativeExceptionHandler;
    }
}
