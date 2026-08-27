package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdawBrKwWasLyyD1y67ddXVRT4D0A extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs write;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = this.write;
        if (r8lambda7d1kk4szdotwipf3xpnkewsbnbs.write()) {
            r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.c(r8lambda7d1kk4szdotwipf3xpnkewsbnbs);
        } else {
            r8lambda7d1kk4szdotwipf3xpnkewsbnbs.RemoteActionCompatParcelizer();
            r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.RemoteActionCompatParcelizer(r8lambda7d1kk4szdotwipf3xpnkewsbnbs);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdawBrKwWasLyyD1y67ddXVRT4D0A(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "StepCountTracker");
        this.write = r8lambda7d1kk4szdotwipf3xpnkewsbnbs;
    }
}
