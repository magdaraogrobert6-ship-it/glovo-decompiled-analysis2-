package o;

import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetOnCommitAffectingLayoutp extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void IconCompatParcelizer(String str) {
        RemoteActionCompatParcelizer();
        ((ClientAppInfo) this.RemoteActionCompatParcelizer).setFirebaseInstanceId(str);
    }

    public final void serializer(String str) {
        RemoteActionCompatParcelizer();
        ((ClientAppInfo) this.RemoteActionCompatParcelizer).setGoogleAppId(str);
    }

    public accessgetOnCommitAffectingLayoutp(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
