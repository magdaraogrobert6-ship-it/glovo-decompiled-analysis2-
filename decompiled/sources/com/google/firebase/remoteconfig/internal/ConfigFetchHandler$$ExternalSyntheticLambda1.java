package com.google.firebase.remoteconfig.internal;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$$ExternalSyntheticLambda1;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$$ExternalSyntheticLambda4;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.internal.operators.flowable.FlowableFilter;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.operators.flowable.FlowableToListSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.sentry.SpanId$$ExternalSyntheticLambda1;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.AccessibilityIterators;
import o.OuterPlacementScope;
import o.reuse;
import o.setLastMatrixRecalculationAnimationTimeui;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ConfigFetchHandler$$ExternalSyntheticLambda1 implements Function, OuterPlacementScope {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ ConfigFetchHandler$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.read = obj4;
        this.serializer = obj5;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        reuse reuseVar = (reuse) this.IconCompatParcelizer;
        String str = (String) this.write;
        InAppMessageStreamManager$$ExternalSyntheticLambda4 inAppMessageStreamManager$$ExternalSyntheticLambda4 = (InAppMessageStreamManager$$ExternalSyntheticLambda4) this.RemoteActionCompatParcelizer;
        CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0 = (CaptureRequestOptions$Builder$$ExternalSyntheticLambda0) this.read;
        FieldType$$ExternalSyntheticBUOutline0 fieldType$$ExternalSyntheticBUOutline0 = (FieldType$$ExternalSyntheticBUOutline0) this.serializer;
        reuseVar.getClass();
        List<CampaignProto$ThickContent> messagesList = ((FetchEligibleCampaignsResponse) obj).getMessagesList();
        int i = Flowable.write;
        ObjectHelper.write(messagesList, "source is null");
        FlowableMap flowableMap = new FlowableMap(new FlowableToListSingle(new FlowableFilter(new FlowableFilter(new FlowableFromIterable(messagesList), new InAppMessageStreamManager$$ExternalSyntheticLambda1(reuseVar)), new SpanId$$ExternalSyntheticLambda1(str, 1)).read(inAppMessageStreamManager$$ExternalSyntheticLambda4).read(captureRequestOptions$Builder$$ExternalSyntheticLambda0).read(fieldType$$ExternalSyntheticBUOutline0)).read(), Functions.IconCompatParcelizer(new LayoutNode$$ExternalSyntheticLambda1(8)));
        int i2 = Flowable.write;
        ObjectHelper.serializer(i2, "bufferSize");
        return new MaybeFlatten(new FlowableElementAtMaybe(new FlowableFlattenIterable(flowableMap, i2)), new JankStatsFrameTracker$$ExternalSyntheticLambda3(reuseVar, 9, str));
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.IconCompatParcelizer;
        Task task2 = (Task) this.write;
        Task task3 = (Task) this.RemoteActionCompatParcelizer;
        Date date = (Date) this.read;
        HashMap map = (HashMap) this.serializer;
        if (!task2.isSuccessful()) {
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException(), 0)});
        }
        if (!task3.isSuccessful()) {
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException(), 0)});
        }
        try {
            setLastMatrixRecalculationAnimationTimeui setlastmatrixrecalculationanimationtimeuiIconCompatParcelizer = configFetchHandler.IconCompatParcelizer((String) task2.getResult(), ((AccessibilityIterators) task3.getResult()).IconCompatParcelizer, date, map);
            return setlastmatrixrecalculationanimationtimeuiIconCompatParcelizer.read != 0 ? LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(setlastmatrixrecalculationanimationtimeuiIconCompatParcelizer) : configFetchHandler.read.IconCompatParcelizer(setlastmatrixrecalculationanimationtimeuiIconCompatParcelizer.IconCompatParcelizer).onSuccessTask(configFetchHandler.serializer, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(23, setlastmatrixrecalculationanimationtimeuiIconCompatParcelizer));
        } catch (FirebaseRemoteConfigException e) {
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{e});
        }
    }
}
