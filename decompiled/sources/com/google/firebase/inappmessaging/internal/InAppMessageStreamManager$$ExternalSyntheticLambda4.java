package com.google.firebase.inappmessaging.internal;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeMap;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableAnySingle;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.util.HashSet;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.TouchBoundsExpansionKt;
import o.UnplacedAwareModifierNode;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;
import o.reuse;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class InAppMessageStreamManager$$ExternalSyntheticLambda4 implements Consumer, Function {
    public final /* synthetic */ reuse IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ InAppMessageStreamManager$$ExternalSyntheticLambda4(reuse reuseVar, int i) {
        this.read = i;
        this.IconCompatParcelizer = reuseVar;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.read;
        reuse reuseVar = this.IconCompatParcelizer;
        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) obj;
        if (i == 0) {
            TouchBoundsExpansionKt touchBoundsExpansionKt = reuseVar.MediaDescriptionCompat;
            r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = touchBoundsExpansionKt.read;
            r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
            new CompletableResumeNext(new CompletablePeek(new CompletableFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, 3, fetchEligibleCampaignsResponse)).serializer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(touchBoundsExpansionKt, 21, fetchEligibleCampaignsResponse)).serializer(new FieldType$$ExternalSyntheticBUOutline0(9)), new FieldType$$ExternalSyntheticBUOutline0(10), Functions.read), new FieldType$$ExternalSyntheticBUOutline0(11)).subscribe();
            return;
        }
        ImpressionStorageClient impressionStorageClient = reuseVar.PlaybackStateCompatCustomAction;
        impressionStorageClient.getClass();
        HashSet hashSet = new HashSet();
        for (CampaignProto$ThickContent campaignProto$ThickContent : fetchEligibleCampaignsResponse.getMessagesList()) {
            hashSet.add(campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.VANILLA_PAYLOAD) ? campaignProto$ThickContent.getVanillaPayload().getCampaignId() : campaignProto$ThickContent.getExperimentalPayload().getCampaignId());
        }
        hashSet.toString();
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        MaybePeek maybePeekIconCompatParcelizer = impressionStorageClient.IconCompatParcelizer();
        CampaignImpressionList campaignImpressionList = ImpressionStorageClient.read;
        ObjectHelper.write(campaignImpressionList, "defaultItem is null");
        new MaybeFlatMapCompletable(new MaybeSwitchIfEmpty(maybePeekIconCompatParcelizer, Maybe.RemoteActionCompatParcelizer(campaignImpressionList)), new JankStatsFrameTracker$$ExternalSyntheticLambda3(impressionStorageClient, 7, hashSet)).subscribe();
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        reuse reuseVar = this.IconCompatParcelizer;
        reuseVar.getClass();
        if (campaignProto$ThickContent.getIsTestCampaign()) {
            return Maybe.RemoteActionCompatParcelizer(campaignProto$ThickContent);
        }
        ImpressionStorageClient impressionStorageClient = reuseVar.PlaybackStateCompatCustomAction;
        impressionStorageClient.getClass();
        String campaignId = campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.VANILLA_PAYLOAD) ? campaignProto$ThickContent.getVanillaPayload().getCampaignId() : campaignProto$ThickContent.getExperimentalPayload().getCampaignId();
        ObservableMap observableMap = new ObservableMap(new MaybeFlatMapObservable(new MaybeMap(impressionStorageClient.IconCompatParcelizer(), new FieldType$$ExternalSyntheticBUOutline0(3)), new FieldType$$ExternalSyntheticBUOutline0(4)), new FieldType$$ExternalSyntheticBUOutline0(5));
        ObjectHelper.write(campaignId, "element is null");
        return new MaybeMap(new MaybeFilterSingle(new SingleDoOnSuccess(new SingleResumeNext(new SingleDoOnError(new ObservableAnySingle(observableMap, Functions.serializer(campaignId)), new FieldType$$ExternalSyntheticBUOutline0(12)), Functions.read(Single.serializer(Boolean.FALSE))), new UnplacedAwareModifierNode(campaignProto$ThickContent)), new FieldType$$ExternalSyntheticBUOutline0(13)), new UnplacedAwareModifierNode(campaignProto$ThickContent));
    }
}
