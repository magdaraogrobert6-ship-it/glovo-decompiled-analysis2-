package bo.app;

import android.os.StatFs;
import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import com.braze.Braze;
import java.io.File;
import kotlin.ranges.RangesKt;
import o.HttpUrlFetcher;
import o.RecyclableBufferedInputStream;
import o.VideoDecoderVideoDecoderException;
import o.getWeight;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ wa$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        long jIconCompatParcelizer;
        switch (this.$r8$classId) {
            case 0:
                return wa.d();
            case 1:
                return wa.b();
            case 2:
                return wa.c();
            case 3:
                return wd.b();
            case 4:
                return we.b();
            case 5:
                return xb.a();
            case 6:
                return xb.b();
            case 7:
                return xg.b();
            case 8:
                return yf.l();
            case 9:
                return AsyncImagePreviewHandler$Companion$Default$1.IconCompatParcelizer;
            case 10:
                VideoDecoderVideoDecoderException videoDecoderVideoDecoderException = HttpUrlFetcher.serializer;
                RecyclableBufferedInputStream recyclableBufferedInputStreamWrite = HttpUrlFetcher.RemoteActionCompatParcelizer.write("coil3_disk_cache");
                try {
                    File fileSerializer = recyclableBufferedInputStreamWrite.serializer();
                    fileSerializer.mkdir();
                    StatFs statFs = new StatFs(fileSerializer.getAbsolutePath());
                    jIconCompatParcelizer = RangesKt.IconCompatParcelizer((long) (statFs.getBlockSizeLong() * statFs.getBlockCountLong() * 0.02d), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                    jIconCompatParcelizer = 10485760;
                }
                return new getWeight(jIconCompatParcelizer, videoDecoderVideoDecoderException, recyclableBufferedInputStreamWrite);
            case 11:
                return Braze.logPushNotificationActionClicked$lambda$1$2();
            case 12:
                return Braze.logPushNotificationActionClicked$lambda$1$1();
            case 13:
                return Braze.logPushNotificationActionClicked$lambda$1$0();
            case 14:
                return Braze.logPushNotificationOpened$lambda$3$0();
            case 15:
                return Braze.logPushNotificationOpened$lambda$3$2();
            case 16:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$3$0();
            case 17:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$3$1();
            case 18:
                return Braze.refreshFeatureFlags$lambda$1$0();
            case 19:
                return Braze.waitForUserDependencyThread$lambda$0();
            case 20:
                return Braze.waitForUserDependencyThread$lambda$1();
            case 21:
                return Braze.validateAndStorePushId$lambda$0();
            case 22:
                return Braze.logFeatureFlagImpression$lambda$0();
            case 23:
                return Braze.publishError$lambda$0();
            case 24:
                return Braze.isEphemeralEventKey$lambda$0();
            case 25:
                return Braze.requestGeofences$lambda$0();
            case 26:
                return Braze.requestGeofenceRefresh$lambda$0();
            case 27:
                return Braze.logLocationRecordedEventFromLocationUpdate$lambda$1$0();
            case 28:
                return Braze.setSdkAuthenticationSignature$lambda$1$1();
            default:
                return Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0();
        }
    }
}
