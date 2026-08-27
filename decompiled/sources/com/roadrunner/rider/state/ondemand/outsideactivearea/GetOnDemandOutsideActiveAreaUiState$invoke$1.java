package com.roadrunner.rider.state.ondemand.outsideactivearea;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import io.grpc.CallOptions$Builder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AdjustDeeplink;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getTimeoutTimer;
import o.isTrackingEnabled;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.removeNodeAtDepth;
import o.sa;
import o.sb;
import o.setOnThirdPartySharingSettingsReadListener;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.t2;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOnDemandOutsideActiveAreaUiState$invoke$1 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ CallOptions$Builder IconCompatParcelizer;
    public /* synthetic */ AdjustDeeplink RemoteActionCompatParcelizer;
    public /* synthetic */ boolean read;
    public /* synthetic */ boolean serializer;
    public /* synthetic */ sa write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOnDemandOutsideActiveAreaUiState$invoke$1(CallOptions$Builder callOptions$Builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(5, shortNewsContentCardView);
        this.IconCompatParcelizer = callOptions$Builder;
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        GetOnDemandOutsideActiveAreaUiState$invoke$1 getOnDemandOutsideActiveAreaUiState$invoke$1 = new GetOnDemandOutsideActiveAreaUiState$invoke$1(this.IconCompatParcelizer, (ShortNewsContentCardView) obj5);
        getOnDemandOutsideActiveAreaUiState$invoke$1.serializer = zBooleanValue;
        getOnDemandOutsideActiveAreaUiState$invoke$1.RemoteActionCompatParcelizer = (AdjustDeeplink) obj2;
        getOnDemandOutsideActiveAreaUiState$invoke$1.read = zBooleanValue2;
        getOnDemandOutsideActiveAreaUiState$invoke$1.write = (sa) obj4;
        Object objInvokeSuspend = getOnDemandOutsideActiveAreaUiState$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaMetadataCompat + 49;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        int i = 2 % 2;
        boolean z = this.serializer;
        AdjustDeeplink adjustDeeplink = this.RemoteActionCompatParcelizer;
        boolean z2 = this.read;
        sa saVar = this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        isTrackingEnabled istrackingenabled = adjustDeeplink.write.RemoteActionCompatParcelizer;
        CallOptions$Builder callOptions$Builder = this.IconCompatParcelizer;
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) callOptions$Builder.RatingCompat;
        Object[] objArr = {((subscribeToBannersUpdateslambda2) callOptions$Builder.MediaSessionCompatQueueItem).read(), "ON_DEMAND"};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (istrackingenabled != isTrackingEnabled.ON_BREAK) {
                int i2 = MediaSessionCompatQueueItem + 105;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (istrackingenabled != isTrackingEnabled.ON_PAID_BREAK) {
                    if (z2 && !z) {
                        if (istrackingenabled == isTrackingEnabled.NOT_WORKING) {
                            int i4 = MediaSessionCompatQueueItem + 45;
                            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                int i5 = 0 / 0;
                                if (saVar instanceof sb) {
                                    list = ((sb) saVar).write;
                                    if ((list instanceof Collection) || !list.isEmpty()) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                int i6 = MediaSessionCompatQueueItem + 39;
                                                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                                                int i7 = i6 % 2;
                                            }
                                        } while (!((t2) it.next()).IconCompatParcelizer);
                                    }
                                }
                            } else if (saVar instanceof sb) {
                                list = ((sb) saVar).write;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            int i8 = MediaSessionCompatQueueItem + 39;
                                            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                                            int i9 = i8 % 2;
                                        }
                                    } while (!((t2) it.next()).IconCompatParcelizer);
                                } else {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            int i10 = MediaSessionCompatQueueItem + 39;
                                            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                                            int i11 = i10 % 2;
                                        }
                                    } while (!((t2) it.next()).IconCompatParcelizer);
                                }
                            }
                            return new setOnThirdPartySharingSettingsReadListener(settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_title), settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_description));
                        }
                        if (istrackingenabled == isTrackingEnabled.READY) {
                            return new setOnThirdPartySharingSettingsReadListener(settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_outside_zone_title), settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_outside_zone_description), false, true);
                        }
                    }
                }
            }
            return new setOnThirdPartySharingSettingsReadListener(settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_paused_title), settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_paused_description), false, true);
        }
        return getTimeoutTimer.RemoteActionCompatParcelizer;
    }
}
