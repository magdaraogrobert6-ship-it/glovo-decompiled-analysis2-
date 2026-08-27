package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA {
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8 serializer;
    public final getPermissionRequestCount write;

    public r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA(String str, getPermissionRequestCount getpermissionrequestcount, long j, r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo) {
        this.IconCompatParcelizer = str;
        TextStreamsKt.serializer(getpermissionrequestcount, "severity");
        this.write = getpermissionrequestcount;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA)) {
            return false;
        }
        r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA r8lambdaqyswzub08pynnyve4xv_lckzra = (r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdaqyswzub08pynnyve4xv_lckzra.IconCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.write, r8lambdaqyswzub08pynnyve4xv_lckzra.write) && this.RemoteActionCompatParcelizer == r8lambdaqyswzub08pynnyve4xv_lckzra.RemoteActionCompatParcelizer && TuplesKt.RemoteActionCompatParcelizer((Object) null, (Object) null) && TuplesKt.RemoteActionCompatParcelizer(this.serializer, r8lambdaqyswzub08pynnyve4xv_lckzra.serializer);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) this.IconCompatParcelizer, "description");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "severity");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "timestampNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) null, "channelRef");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "subchannelRef");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.write, Long.valueOf(j), null, this.serializer});
    }
}
