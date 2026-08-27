package o;

import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getEnableExtraAssertions extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void IconCompatParcelizer(String str) {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setProjectNumber(str);
    }

    public final void IconCompatParcelizer(accessgetOnCommitAffectingLayoutp accessgetoncommitaffectinglayoutp) {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setClientApp((ClientAppInfo) accessgetoncommitaffectinglayoutp.serializer());
    }

    public final void RemoteActionCompatParcelizer(long j) {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setClientTimestampMillis(j);
    }

    public final void RemoteActionCompatParcelizer(observeReadsui observereadsui) {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setEventType(observereadsui);
    }

    public final void serializer(String str) {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setCampaignId(str);
    }

    public final void write() {
        RemoteActionCompatParcelizer();
        ((CampaignAnalytics) this.RemoteActionCompatParcelizer).setFiamSdkVersion("22.0.2");
    }

    public getEnableExtraAssertions(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
