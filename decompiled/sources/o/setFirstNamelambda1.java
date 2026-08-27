package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.ExternalEventType;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeAction;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setFirstNamelambda1 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        O$b o$b = new O$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((Long) o$b.write) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
                    return null;
                }
                if (((TimeAction) o$b.RemoteActionCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'action' is missing");
                    return null;
                }
                if (((ExternalEventType) o$b.serializer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                    return null;
                }
                if (((String) o$b.IconCompatParcelizer) != null) {
                    return new setEmaillambda3(o$b);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
                return null;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            } else if (b == 11) {
                                o$b.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 11) {
                            o$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ExternalEventType externalEventTypeFindByValue = ExternalEventType.findByValue(iMediaSessionCompatToken);
                        if (externalEventTypeFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ExternalEventType: "));
                            return null;
                        }
                        o$b.serializer = externalEventTypeFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 8) {
                    int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                    TimeAction timeActionFindByValue = TimeAction.findByValue(iMediaSessionCompatToken2);
                    if (timeActionFindByValue == null) {
                        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type TimeAction: "));
                        return null;
                    }
                    o$b.RemoteActionCompatParcelizer = timeActionFindByValue;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                o$b.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setEmaillambda3 setemaillambda3 = (setEmaillambda3) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        IconCompatParcelizer.serializer(setemaillambda3.write, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setemaillambda3.RemoteActionCompatParcelizer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setemaillambda3.serializer.value);
        String str = setemaillambda3.read;
        if (str != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setemaillambda3.MediaMetadataCompat);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
