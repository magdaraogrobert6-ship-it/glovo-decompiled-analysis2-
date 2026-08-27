package o;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class UnplacedAwareModifierNode implements Function, Consumer {
    public final /* synthetic */ CampaignProto$ThickContent IconCompatParcelizer;

    public /* synthetic */ UnplacedAwareModifierNode(CampaignProto$ThickContent campaignProto$ThickContent) {
        this.IconCompatParcelizer = campaignProto$ThickContent;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        CampaignProto$ThickContent campaignProto$ThickContent = this.IconCompatParcelizer;
        if (campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.VANILLA_PAYLOAD)) {
            campaignProto$ThickContent.getVanillaPayload().getCampaignName();
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
        } else if (campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.EXPERIMENTAL_PAYLOAD)) {
            campaignProto$ThickContent.getExperimentalPayload().getCampaignName();
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return this.IconCompatParcelizer;
    }
}
