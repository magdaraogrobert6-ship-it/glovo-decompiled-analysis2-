package o;

import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaGsC5RGy6ZsYRnTdcPR0BNQBv7rc {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;

    public r8lambdaGsC5RGy6ZsYRnTdcPR0BNQBv7rc(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final List<getImageStyle> RemoteActionCompatParcelizer(getLongitudeannotations<setConfiguredCustomEndpointandroid_sdk_base_release> getlongitudeannotations) {
        setConfiguredCustomEndpointandroid_sdk_base_release setconfiguredcustomendpointandroid_sdk_base_release = getlongitudeannotations.read();
        String string = UUID.randomUUID().toString();
        long jWrite = getlongitudeannotations.write();
        Byte b = setconfiguredcustomendpointandroid_sdk_base_release.RemoteActionCompatParcelizer;
        HarshDrivingEntryType harshDrivingEntryTypeOf = b == null ? null : HarshDrivingEntryType.of(b.byteValue());
        Byte b2 = setconfiguredcustomendpointandroid_sdk_base_release.RatingCompat;
        HarshDrivingEntryType harshDrivingEntryTypeOf2 = b2 == null ? null : HarshDrivingEntryType.of(b2.byteValue());
        this.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = setconfiguredcustomendpointandroid_sdk_base_release.read == ThriftBool.TRUE;
        Byte b3 = setconfiguredcustomendpointandroid_sdk_base_release.write;
        Integer numValueOf = b3 == null ? null : Integer.valueOf(b3.intValue());
        Byte b4 = setconfiguredcustomendpointandroid_sdk_base_release.MediaMetadataCompat;
        Integer numValueOf2 = b4 == null ? null : Integer.valueOf(b4.intValue());
        Double d = setconfiguredcustomendpointandroid_sdk_base_release.serializer;
        Double d2 = d == null ? null : d;
        Long l = setconfiguredcustomendpointandroid_sdk_base_release.MediaSessionCompatQueueItem;
        return Collections.singletonList(getImageStyle.RemoteActionCompatParcelizer(new r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0(string, jWrite, jWrite, z, harshDrivingEntryTypeOf, numValueOf, harshDrivingEntryTypeOf2, numValueOf2, d2, l == null ? null : l, l == null ? null : l, jCurrentTimeMillis, jCurrentTimeMillis)));
    }
}
