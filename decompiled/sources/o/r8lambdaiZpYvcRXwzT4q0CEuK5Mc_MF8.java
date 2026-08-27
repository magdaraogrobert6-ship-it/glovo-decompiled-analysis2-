package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.w$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.internal.ServiceConfigUtil;
import io.sentry.SentryClient;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 {
    public final Object IconCompatParcelizer;
    public final Map MediaMetadataCompat;
    public final Map RemoteActionCompatParcelizer;
    public final Map read;
    public final iExternalSyntheticLambda0 serializer;
    public final markPageFinishedlambda00 write;

    public final r8lambdaaazLeu0WqITEICKjR9VLnZVO444 RemoteActionCompatParcelizer() {
        if (this.read.isEmpty() && this.MediaMetadataCompat.isEmpty() && this.serializer == null) {
            return null;
        }
        return new r8lambdaaazLeu0WqITEICKjR9VLnZVO444(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.MediaMetadataCompat, this.read, this.write, this.IconCompatParcelizer});
    }

    public r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8(iExternalSyntheticLambda0 iexternalsyntheticlambda0, HashMap map, HashMap map2, markPageFinishedlambda00 markpagefinishedlambda00, Object obj, Map map3) {
        this.serializer = iexternalsyntheticlambda0;
        this.MediaMetadataCompat = m1$$ExternalSyntheticOutline0.m(map);
        this.read = m1$$ExternalSyntheticOutline0.m(map2);
        this.write = markpagefinishedlambda00;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 RemoteActionCompatParcelizer(Map map, boolean z, int i, int i2, Object obj) {
        markPageFinishedlambda00 markpagefinishedlambda00ResultReceiver = z ? ServiceConfigUtil.ResultReceiver(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapRemoteActionCompatParcelizer = ServiceConfigUtil.RemoteActionCompatParcelizer(map);
        List<Map> listPlaybackStateCompat = ServiceConfigUtil.PlaybackStateCompat(map);
        if (listPlaybackStateCompat == null) {
            return new r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8(null, map2, map3, markpagefinishedlambda00ResultReceiver, obj, mapRemoteActionCompatParcelizer);
        }
        iExternalSyntheticLambda0 iexternalsyntheticlambda0 = null;
        for (Map map4 : listPlaybackStateCompat) {
            iExternalSyntheticLambda0 iexternalsyntheticlambda1 = new iExternalSyntheticLambda0(map4, z, i, i2);
            List<Map> listMediaSessionCompatToken = ServiceConfigUtil.MediaSessionCompatToken(map4);
            if (listMediaSessionCompatToken != null && !listMediaSessionCompatToken.isEmpty()) {
                for (Map map5 : listMediaSessionCompatToken) {
                    String strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = ServiceConfigUtil.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(map5);
                    String strMediaSessionCompatResultReceiverWrapper = ServiceConfigUtil.MediaSessionCompatResultReceiverWrapper(map5);
                    if (visitSubtreeIfYYKmho.write(strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                        TextStreamsKt.read(new Object[]{"missing service name for method %s", strMediaSessionCompatResultReceiverWrapper, Boolean.valueOf(visitSubtreeIfYYKmho.write(strMediaSessionCompatResultReceiverWrapper))}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
                        TextStreamsKt.read(new Object[]{"Duplicate default method config in service config %s", map, Boolean.valueOf(iexternalsyntheticlambda0 == null)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
                        iexternalsyntheticlambda0 = iexternalsyntheticlambda1;
                    } else if (visitSubtreeIfYYKmho.write(strMediaSessionCompatResultReceiverWrapper)) {
                        TextStreamsKt.read(new Object[]{"Duplicate service %s", strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, Boolean.valueOf(!map3.containsKey(strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus))}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
                        map3.put(strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, iexternalsyntheticlambda1);
                    } else {
                        String str = SentryClient.read(strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, strMediaSessionCompatResultReceiverWrapper);
                        TextStreamsKt.read(new Object[]{"Duplicate method name %s", str, Boolean.valueOf(!map2.containsKey(str))}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
                        map2.put(str, iexternalsyntheticlambda1);
                    }
                }
            }
        }
        return new r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8(iexternalsyntheticlambda0, map2, map3, markpagefinishedlambda00ResultReceiver, obj, mapRemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "defaultMethodConfig");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaMetadataCompat, "serviceMethodMap");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "serviceMap");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "retryThrottling");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "loadBalancingConfig");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8.class != obj.getClass()) {
            return false;
        }
        r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8 = (r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.serializer, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.serializer) && TuplesKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.MediaMetadataCompat) && TuplesKt.RemoteActionCompatParcelizer(this.read, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.read) && TuplesKt.RemoteActionCompatParcelizer(this.write, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.write) && TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.IconCompatParcelizer);
    }
}
