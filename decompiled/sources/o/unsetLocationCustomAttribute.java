package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.DataAction;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetLocationCustomAttribute implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return builder.serializer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 8) {
                    int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                    DataAction dataActionFindByValue = DataAction.findByValue(iMediaSessionCompatToken);
                    if (dataActionFindByValue == null) {
                        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type DataAction: "));
                        return null;
                    }
                    builder.RemoteActionCompatParcelizer = dataActionFindByValue;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 13) {
                int i = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                HashMap map = new HashMap(i);
                int iWrite = 0;
                while (iWrite < i) {
                    iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                }
                builder.serializer = map;
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        BrazeUserExternalSyntheticLambda1 brazeUserExternalSyntheticLambda1 = (BrazeUserExternalSyntheticLambda1) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer((byte) 11, (byte) 11, brazeUserExternalSyntheticLambda1.write.size());
        for (Map.Entry entry : brazeUserExternalSyntheticLambda1.write.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(brazeUserExternalSyntheticLambda1.IconCompatParcelizer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
