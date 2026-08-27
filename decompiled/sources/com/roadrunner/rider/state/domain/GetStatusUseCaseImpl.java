package com.roadrunner.rider.state.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.checkEventToken;
import o.checkRevenue;
import o.getActionViewIntentlambda0;
import o.getFailureResponseData;
import o.prepareForActivityTransitionCarryover;
import o.setSdkPrefix;
import o.setSessionInterval;
import o.setSubscriptionUrl;
import o.subscribeToBannersUpdateslambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class GetStatusUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final GetRiderStateImpl read;
    public final subscribeToBannersUpdateslambda2 write;

    public GetStatusUseCaseImpl(setSubscriptionUrl setsubscriptionurl, getActionViewIntentlambda0 getactionviewintentlambda0, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, GetRiderStateImpl getRiderStateImpl) {
        this.write = subscribetobannersupdateslambda2;
        this.read = getRiderStateImpl;
    }

    public final GetMapScope$invoke$$inlined$map$1 read() {
        int i = 2 % 2;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.read.write()), this, 5);
        int i2 = serializer + 109;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getMapScope$invoke$$inlined$map$1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static final Object access$getStatus(GetStatusUseCaseImpl getStatusUseCaseImpl, setSdkPrefix setsdkprefix, getFailureResponseData getfailureresponsedata, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        setSessionInterval setsessioninterval;
        getFailureResponseData getfailureresponsedata2;
        boolean z2;
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof setSessionInterval) {
            int i2 = serializer + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((setSessionInterval) continuationImpl).serializer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            setsessioninterval = (setSessionInterval) continuationImpl;
            int i4 = setsessioninterval.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setsessioninterval.serializer = i4 - Integer.MIN_VALUE;
            } else {
                setsessioninterval = new setSessionInterval(getStatusUseCaseImpl, continuationImpl);
            }
        } else {
            setsessioninterval = new setSessionInterval(getStatusUseCaseImpl, continuationImpl);
        }
        Object objWithContext = setsessioninterval.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setsessioninterval.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            setsessioninterval.IconCompatParcelizer = setsdkprefix;
            setsessioninterval.read = getfailureresponsedata;
            setsessioninterval.write = getfailureresponsedata;
            setsessioninterval.RemoteActionCompatParcelizer = z;
            setsessioninterval.serializer = 1;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SingleProcessDataStore$data$1.AnonymousClass1(setsdkprefix, getfailureresponsedata, shortNewsContentCardView, 29), setsessioninterval);
            if (objWithContext == coroutineSingletons) {
                int i6 = RemoteActionCompatParcelizer + 77;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 0;
                }
                return coroutineSingletons;
            }
            getfailureresponsedata2 = getfailureresponsedata;
            z2 = z;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = setsessioninterval.RemoteActionCompatParcelizer;
            getFailureResponseData getfailureresponsedata3 = setsessioninterval.write;
            getFailureResponseData getfailureresponsedata4 = setsessioninterval.read;
            setSdkPrefix setsdkprefix2 = setsessioninterval.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            getfailureresponsedata2 = getfailureresponsedata3;
            z2 = z3;
            getfailureresponsedata = getfailureresponsedata4;
            setsdkprefix = setsdkprefix2;
        }
        int i8 = serializer + 103;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return new checkRevenue(getfailureresponsedata2, (checkEventToken) objWithContext, getActionViewIntentlambda0.read(setsdkprefix.MediaBrowserCompatMediaItem, getfailureresponsedata), z2, setsdkprefix.serializer, setsdkprefix.read, setsdkprefix.MediaDescriptionCompat);
    }
}
