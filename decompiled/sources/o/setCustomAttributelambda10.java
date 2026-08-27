package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.thrift.PersonTerminator;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributelambda10 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        C$b c$b = new C$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((setCustomEndpoint) c$b.serializer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'person' is missing");
                    return null;
                }
                if (((Integer) c$b.write) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
                    return null;
                }
                if (((PersonTerminator) c$b.IconCompatParcelizer) != null) {
                    return new removeFromSubscriptionGrouplambda2(c$b);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'terminator' is missing");
                return null;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        PersonTerminator personTerminatorFindByValue = PersonTerminator.findByValue(iMediaSessionCompatToken);
                        if (personTerminatorFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type PersonTerminator: "));
                            return null;
                        }
                        c$b.IconCompatParcelizer = personTerminatorFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 8) {
                    c$b.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(13);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        break;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    } else if (b2 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    }
                }
                c$b.serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        removeFromSubscriptionGrouplambda2 removefromsubscriptiongrouplambda2 = (removeFromSubscriptionGrouplambda2) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
        setCustomEndpoint setcustomendpoint = removefromsubscriptiongrouplambda2.serializer;
        if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
        SweepGradientShader9KIMszodefault.write(removefromsubscriptiongrouplambda2.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(removefromsubscriptiongrouplambda2.RemoteActionCompatParcelizer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
