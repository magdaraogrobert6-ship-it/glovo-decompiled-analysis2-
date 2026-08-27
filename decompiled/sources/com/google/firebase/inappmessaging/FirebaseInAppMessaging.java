package com.google.firebase.inappmessaging;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkerWrapper;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$$ExternalSyntheticLambda1;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.internal.operators.flowable.FlowableEmpty;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Executor;
import o.TraversableNodeCompanion;
import o.accesssetInstancecp;
import o.getShowLayoutBoundsannotations;
import o.reuse;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInAppMessaging {
    public JankStatsFrameTracker$$ExternalSyntheticLambda3 IconCompatParcelizer;
    public final TraversableNodeCompanion RemoteActionCompatParcelizer;
    public final Executor serializer;
    public final WorkerWrapper.Builder write;

    /* JADX WARN: Multi-variable type inference failed */
    public FirebaseInAppMessaging(reuse reuseVar, accesssetInstancecp accesssetinstancecp, WorkerWrapper.Builder builder, TraversableNodeCompanion traversableNodeCompanion, Executor executor) throws Exception {
        Flowable flowableConcatMap;
        this.write = builder;
        this.RemoteActionCompatParcelizer = traversableNodeCompanion;
        this.serializer = executor;
        ((FirebaseInstallations) accesssetinstancecp).write().addOnSuccessListener(executor, new Gson$$ExternalSyntheticBUOutline0(10));
        ConnectableFlowable connectableFlowable = reuseVar.read;
        FlowablePublish flowablePublish = reuseVar.RemoteActionCompatParcelizer.serializer;
        ConnectableFlowable connectableFlowable2 = reuseVar.PlaybackStateCompat;
        int i = Flowable.write;
        ObjectHelper.write(connectableFlowable, "source1 is null");
        ObjectHelper.write(flowablePublish, "source2 is null");
        ObjectHelper.write(connectableFlowable2, "source3 is null");
        FlowableDoOnEach flowableDoOnEach = new FlowableDoOnEach(new FlowableFromArray(new syncCustomerProfilefwf_client_release[]{connectableFlowable, flowablePublish, connectableFlowable2}).write(Functions.IconCompatParcelizer, 3, Flowable.write), new Gson$$ExternalSyntheticBUOutline0(12));
        getShowLayoutBoundsannotations getshowlayoutboundsannotations = reuseVar.ParcelableVolumeInfo;
        FlowableObserveOn flowableObserveOnWrite = flowableDoOnEach.write(getshowlayoutboundsannotations.IconCompatParcelizer);
        InAppMessageStreamManager$$ExternalSyntheticLambda1 inAppMessageStreamManager$$ExternalSyntheticLambda1 = new InAppMessageStreamManager$$ExternalSyntheticLambda1(reuseVar);
        ObjectHelper.serializer(2, "prefetch");
        if (flowableObserveOnWrite instanceof ScalarCallable) {
            T tCall = ((ScalarCallable) flowableObserveOnWrite).call();
            flowableConcatMap = tCall == 0 ? FlowableEmpty.read : FlowableScalarXMap.serializer(tCall, inAppMessageStreamManager$$ExternalSyntheticLambda1);
        } else {
            flowableConcatMap = new FlowableConcatMap(flowableObserveOnWrite, inAppMessageStreamManager$$ExternalSyntheticLambda1, ErrorMode.IMMEDIATE);
        }
        flowableConcatMap.write(getshowlayoutboundsannotations.serializer).subscribe(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(25, this));
    }
}
