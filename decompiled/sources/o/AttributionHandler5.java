package o;

import com.roadrunner.rider.state.domain.GetRiderStateImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributionHandler5 {
    public final AttributionHandler1 IconCompatParcelizer;
    public final GetRiderStateImpl read;
    public final setTransactionSuccessful serializer;
    public final subscribeToBannersUpdateslambda2 write;

    public AttributionHandler5(GetRiderStateImpl getRiderStateImpl, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, setTransactionSuccessful settransactionsuccessful, AttributionHandler1 attributionHandler1) {
        this.read = getRiderStateImpl;
        this.write = subscribetobannersupdateslambda2;
        this.serializer = settransactionsuccessful;
        this.IconCompatParcelizer = attributionHandler1;
    }
}
