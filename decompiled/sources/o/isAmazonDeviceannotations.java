package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.CMMotionActivityConfidence;
import com.sentiance.core.model.thrift.MotionActivity;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class isAmazonDeviceannotations implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 2);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 12) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = (getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations) getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 8) {
                    int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                    MotionActivity motionActivityFindByValue = MotionActivity.findByValue(iMediaSessionCompatToken);
                    if (motionActivityFindByValue != null) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.write = motionActivityFindByValue;
                    } else {
                        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type MotionActivity: "));
                        return null;
                    }
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations getbraze_push_delivery_flush_min_keyannotations = (getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        IconCompatParcelizer.serializer(getbraze_push_delivery_flush_min_keyannotations.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(getbraze_push_delivery_flush_min_keyannotations.serializer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
        getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations getbraze_push_delivery_enabled_keyannotations = getbraze_push_delivery_flush_min_keyannotations.write;
        Byte b = getbraze_push_delivery_enabled_keyannotations.read;
        CMMotionActivityConfidence cMMotionActivityConfidence = getbraze_push_delivery_enabled_keyannotations.IconCompatParcelizer;
        if (b != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getbraze_push_delivery_enabled_keyannotations.read.byteValue());
        }
        if (cMMotionActivityConfidence != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(cMMotionActivityConfidence.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
