package o;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.reactive.FlowSubscription;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog implements syncCustomerProfilefwf_client_release {
    public final Flow IconCompatParcelizer;
    public final TextAnnouncementContentCardView write;

    public r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog(Flow flow, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.IconCompatParcelizer = flow;
        this.write = textAnnouncementContentCardView;
    }

    @Override // o.syncCustomerProfilefwf_client_release
    public final void subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        fwFClientaddFeatureKeysfeaturesUpdated1.getClass();
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new FlowSubscription(this.IconCompatParcelizer, fwFClientaddFeatureKeysfeaturesUpdated1, this.write));
    }
}
