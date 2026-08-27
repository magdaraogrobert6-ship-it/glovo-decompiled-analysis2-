package com.google.firebase.inappmessaging.internal;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda1;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeFilter;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.util.concurrent.Executor;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.TouchBoundsExpansionKt;
import o.TouchBoundsExpansiondefault;
import o.component23;
import o.disposeComposition;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;
import o.reuse;
import o.setContentCaptureManagerui;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class InAppMessageStreamManager$$ExternalSyntheticLambda1 implements Function, Predicate {
    public final /* synthetic */ reuse RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        String str = (String) obj;
        reuse reuseVar = this.RemoteActionCompatParcelizer;
        TouchBoundsExpansionKt touchBoundsExpansionKt = reuseVar.MediaDescriptionCompat;
        touchBoundsExpansionKt.getClass();
        MaybeFromCallable maybeFromCallable = new MaybeFromCallable(new setContentCaptureManagerui(3, touchBoundsExpansionKt));
        r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = touchBoundsExpansionKt.read;
        component23 rVar = FetchEligibleCampaignsResponse.parser();
        r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
        int i = 2;
        MaybeFromCallable maybeFromCallable2 = new MaybeFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, i, rVar));
        TouchBoundsExpansiondefault touchBoundsExpansiondefault = new TouchBoundsExpansiondefault(touchBoundsExpansionKt, 0);
        Consumer consumer = Functions.serializer;
        MaybeOnErrorNext maybeOnErrorNext = new MaybeOnErrorNext(new MaybePeek(new MaybePeek(new MaybePeek(new MaybeFilter(new MaybeSwitchIfEmpty(maybeFromCallable, new MaybePeek(maybeFromCallable2, touchBoundsExpansiondefault, consumer)), new TouchBoundsExpansiondefault(touchBoundsExpansionKt, 1)), consumer, new TouchBoundsExpansiondefault(touchBoundsExpansionKt, 2)), new FieldType$$ExternalSyntheticBUOutline0(14), consumer), consumer, new FieldType$$ExternalSyntheticBUOutline0(15)), Functions.read(MaybeEmpty.IconCompatParcelizer));
        InAppMessageStreamManager$$ExternalSyntheticLambda4 inAppMessageStreamManager$$ExternalSyntheticLambda4 = new InAppMessageStreamManager$$ExternalSyntheticLambda4(reuseVar, 0);
        ConfigFetchHandler$$ExternalSyntheticLambda1 configFetchHandler$$ExternalSyntheticLambda1 = new ConfigFetchHandler$$ExternalSyntheticLambda1(reuseVar, str, new InAppMessageStreamManager$$ExternalSyntheticLambda4(reuseVar, i), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(reuseVar, 27, str), new FieldType$$ExternalSyntheticBUOutline0(16));
        MaybePeek maybePeek = new MaybePeek(reuseVar.PlaybackStateCompatCustomAction.IconCompatParcelizer(), consumer, new FieldType$$ExternalSyntheticBUOutline0(17));
        CampaignImpressionList defaultInstance = CampaignImpressionList.getDefaultInstance();
        ObjectHelper.write(defaultInstance, "defaultItem is null");
        MaybeOnErrorNext maybeOnErrorNext2 = new MaybeOnErrorNext(new MaybeSwitchIfEmpty(maybePeek, Maybe.RemoteActionCompatParcelizer(defaultInstance)), Functions.read(Maybe.RemoteActionCompatParcelizer(CampaignImpressionList.getDefaultInstance())));
        FirebaseInstallations firebaseInstallations = (FirebaseInstallations) reuseVar.RatingCompat;
        zzw zzwVarWrite = firebaseInstallations.write();
        Executor executor = reuseVar.MediaMetadataCompat;
        int i2 = 8;
        MaybeZipArray maybeZipArray = new MaybeZipArray(new MaybeSource[]{new MaybeCreate(new JankStatsFrameTracker$$ExternalSyntheticLambda3(zzwVarWrite, i2, executor)), new MaybeCreate(new JankStatsFrameTracker$$ExternalSyntheticLambda3(firebaseInstallations.read(), i2, executor))}, Functions.serializer(new Gson$$ExternalSyntheticBUOutline0(13)));
        Scheduler scheduler = reuseVar.ParcelableVolumeInfo.IconCompatParcelizer;
        ObjectHelper.write(scheduler, "scheduler is null");
        CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0 = new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(reuseVar, 25, new MaybeObserveOn(maybeZipArray, scheduler));
        zzgs zzgsVar = reuseVar.MediaSessionCompatToken;
        if (zzgsVar.RemoteActionCompatParcelizer ? str.equals("ON_FOREGROUND") : zzgsVar.serializer) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
            MaybeFlatten maybeFlatten = new MaybeFlatten(new MaybeFlatten(maybeOnErrorNext2, captureRequestOptions$Builder$$ExternalSyntheticLambda0), configFetchHandler$$ExternalSyntheticLambda1);
            return maybeFlatten instanceof FuseToFlowable ? ((FuseToFlowable) maybeFlatten).read() : new MaybeToFlowable(maybeFlatten);
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        MaybeFlatten maybeFlatten2 = new MaybeFlatten(new MaybeSwitchIfEmpty(maybeOnErrorNext, new MaybePeek(new MaybeFlatten(maybeOnErrorNext2, captureRequestOptions$Builder$$ExternalSyntheticLambda0), inAppMessageStreamManager$$ExternalSyntheticLambda4, consumer)), configFetchHandler$$ExternalSyntheticLambda1);
        return maybeFlatten2 instanceof FuseToFlowable ? ((FuseToFlowable) maybeFlatten2).read() : new MaybeToFlowable(maybeFlatten2);
    }

    public /* synthetic */ InAppMessageStreamManager$$ExternalSyntheticLambda1(reuse reuseVar) {
        this.RemoteActionCompatParcelizer = reuseVar;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        long campaignStartTimeMillis;
        long campaignEndTimeMillis;
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        reuse reuseVar = this.RemoteActionCompatParcelizer;
        if (reuseVar.MediaSessionCompatToken.serializer) {
            return true;
        }
        disposeComposition disposecomposition = reuseVar.MediaSessionCompatQueueItem;
        if (campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.VANILLA_PAYLOAD)) {
            campaignStartTimeMillis = campaignProto$ThickContent.getVanillaPayload().getCampaignStartTimeMillis();
            campaignEndTimeMillis = campaignProto$ThickContent.getVanillaPayload().getCampaignEndTimeMillis();
        } else {
            if (!campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.EXPERIMENTAL_PAYLOAD)) {
                return false;
            }
            campaignStartTimeMillis = campaignProto$ThickContent.getExperimentalPayload().getCampaignStartTimeMillis();
            campaignEndTimeMillis = campaignProto$ThickContent.getExperimentalPayload().getCampaignEndTimeMillis();
        }
        disposecomposition.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > campaignStartTimeMillis && jCurrentTimeMillis < campaignEndTimeMillis;
    }
}
