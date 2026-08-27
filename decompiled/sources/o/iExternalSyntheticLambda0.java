package o;

import bo.app.w$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.internal.ServiceConfigUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class iExternalSyntheticLambda0 {
    public static final mergeJsonObjectslambda00 IconCompatParcelizer = new mergeJsonObjectslambda00("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 0);
    public final Boolean MediaMetadataCompat;
    public final Long RatingCompat;
    public final Integer RemoteActionCompatParcelizer;
    public final onPageFinishedlambda00 read;
    public final Integer serializer;
    public final r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ write;

    public iExternalSyntheticLambda0(Map map, boolean z, int i, int i2) {
        onPageFinishedlambda00 onpagefinishedlambda00;
        r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ r8lambdan5r2kbwv2mtd2em1qhanll_mq;
        int i3 = accessgetSystemHomecp.read();
        this.RatingCompat = (Long) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 156032058, new Object[]{map}, accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), -156032055, i3);
        this.MediaMetadataCompat = ServiceConfigUtil.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(map);
        Integer numParcelableVolumeInfo = ServiceConfigUtil.ParcelableVolumeInfo(map);
        this.serializer = numParcelableVolumeInfo;
        if (numParcelableVolumeInfo != null) {
            TextStreamsKt.read(new Object[]{"maxInboundMessageSize %s exceeds bounds", numParcelableVolumeInfo, Boolean.valueOf(numParcelableVolumeInfo.intValue() >= 0)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
        }
        Integer numRatingCompat = ServiceConfigUtil.RatingCompat(map);
        this.RemoteActionCompatParcelizer = numRatingCompat;
        if (numRatingCompat != null) {
            TextStreamsKt.read(new Object[]{"maxOutboundMessageSize %s exceeds bounds", numRatingCompat, Boolean.valueOf(numRatingCompat.intValue() >= 0)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
        }
        Map mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys = z ? ServiceConfigUtil.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(map) : null;
        if (mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            onpagefinishedlambda00 = null;
        } else {
            int i4 = accessgetSystemHomecp.read();
            Integer num = (Integer) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 889539650, new Object[]{mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys}, accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), -889539646, i4);
            TextStreamsKt.serializer(num, "maxAttempts cannot be empty");
            int iIntValue = num.intValue();
            TextStreamsKt.serializer("maxAttempts must be greater than 1: %s", iIntValue, iIntValue >= 2);
            int iMin = Math.min(iIntValue, i);
            Long lWrite = ServiceConfigUtil.write(mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            TextStreamsKt.serializer(lWrite, "initialBackoff cannot be empty");
            long jLongValue = lWrite.longValue();
            TextStreamsKt.read("initialBackoffNanos must be greater than 0: %s", jLongValue, jLongValue > 0);
            Long lMediaSessionCompatQueueItem = ServiceConfigUtil.MediaSessionCompatQueueItem(mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            TextStreamsKt.serializer(lMediaSessionCompatQueueItem, "maxBackoff cannot be empty");
            long jLongValue2 = lMediaSessionCompatQueueItem.longValue();
            TextStreamsKt.read("maxBackoff must be greater than 0: %s", jLongValue2, jLongValue2 > 0);
            Double dSerializer = ServiceConfigUtil.serializer(mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            TextStreamsKt.serializer(dSerializer, "backoffMultiplier cannot be empty");
            double dDoubleValue = dSerializer.doubleValue();
            TextStreamsKt.read(new Object[]{"backoffMultiplier must be greater than 0: %s", dSerializer, Boolean.valueOf(dDoubleValue > 0.0d)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
            Long lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = ServiceConfigUtil.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            TextStreamsKt.read(new Object[]{"perAttemptRecvTimeout cannot be negative: %s", lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY, Boolean.valueOf(lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.longValue() >= 0)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
            Set setComponentActivity = ServiceConfigUtil.ComponentActivity(mapR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            TextStreamsKt.read("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null && setComponentActivity.isEmpty()) ? false : true);
            onpagefinishedlambda00 = new onPageFinishedlambda00(iMin, jLongValue, jLongValue2, dDoubleValue, lR8lambda7IJBVrN0sHyidCAZufWEJFc7yY, setComponentActivity);
        }
        this.read = onpagefinishedlambda00;
        Map mapIconCompatParcelizer = z ? ServiceConfigUtil.IconCompatParcelizer(map) : null;
        if (mapIconCompatParcelizer == null) {
            r8lambdan5r2kbwv2mtd2em1qhanll_mq = null;
        } else {
            Integer numMediaBrowserCompatMediaItem = ServiceConfigUtil.MediaBrowserCompatMediaItem(mapIconCompatParcelizer);
            TextStreamsKt.serializer(numMediaBrowserCompatMediaItem, "maxAttempts cannot be empty");
            int iIntValue2 = numMediaBrowserCompatMediaItem.intValue();
            TextStreamsKt.serializer("maxAttempts must be greater than 1: %s", iIntValue2, iIntValue2 >= 2);
            int iMin2 = Math.min(iIntValue2, i2);
            Long l = ServiceConfigUtil.read(mapIconCompatParcelizer);
            TextStreamsKt.serializer(l, "hedgingDelay cannot be empty");
            long jLongValue3 = l.longValue();
            TextStreamsKt.read("hedgingDelay must not be negative: %s", jLongValue3, jLongValue3 >= 0);
            int i5 = accessgetSystemHomecp.read();
            r8lambdan5r2kbwv2mtd2em1qhanll_mq = new r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ(iMin2, jLongValue3, (Set) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 2023517407, new Object[]{mapIconCompatParcelizer}, accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), -2023517406, i5));
        }
        this.write = r8lambdan5r2kbwv2mtd2em1qhanll_mq;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RatingCompat, this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, this.read, this.write});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iExternalSyntheticLambda0)) {
            return false;
        }
        iExternalSyntheticLambda0 iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.RatingCompat, iexternalsyntheticlambda0.RatingCompat) && TuplesKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat, iexternalsyntheticlambda0.MediaMetadataCompat) && TuplesKt.RemoteActionCompatParcelizer(this.serializer, iexternalsyntheticlambda0.serializer) && TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iexternalsyntheticlambda0.RemoteActionCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.read, iexternalsyntheticlambda0.read) && TuplesKt.RemoteActionCompatParcelizer(this.write, iexternalsyntheticlambda0.write);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RatingCompat, "timeoutNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaMetadataCompat, "waitForReady");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "maxInboundMessageSize");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "maxOutboundMessageSize");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "retryPolicy");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "hedgingPolicy");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
