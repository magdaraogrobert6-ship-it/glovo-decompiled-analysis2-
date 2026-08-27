package o;

import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import io.reactivex.Maybe;
import io.reactivex.functions.Action;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class traverseChildren implements Action {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ ImpressionStorageClient RemoteActionCompatParcelizer;
    public final /* synthetic */ CampaignImpressionList write;

    public /* synthetic */ traverseChildren(ImpressionStorageClient impressionStorageClient, CampaignImpressionList campaignImpressionList, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = impressionStorageClient;
        this.write = campaignImpressionList;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        int i = this.IconCompatParcelizer;
        CampaignImpressionList campaignImpressionList = this.write;
        ImpressionStorageClient impressionStorageClient = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            impressionStorageClient.getClass();
            impressionStorageClient.write = Maybe.RemoteActionCompatParcelizer(campaignImpressionList);
        } else {
            impressionStorageClient.getClass();
            impressionStorageClient.write = Maybe.RemoteActionCompatParcelizer(campaignImpressionList);
        }
    }
}
