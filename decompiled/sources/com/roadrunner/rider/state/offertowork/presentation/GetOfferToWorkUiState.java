package com.roadrunner.rider.state.offertowork.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AdjustEvent;
import o.AdjustPlayStoreSubscription;
import o.IconCompat;
import o.ShortNewsContentCardView;
import o.checkRevenue;
import o.createFromParcel;
import o.getCieXyz;
import o.getCode;
import o.getPrice;
import o.getSku;
import o.isTrackingEnabled;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.removeNodeAtDepth;
import o.sc;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOfferToWorkUiState {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final subscribeToBannersUpdateslambda2 IconCompatParcelizer;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final vg RemoteActionCompatParcelizer;
    public final GetStatusUseCaseImpl read;
    public final IconCompat serializer;
    public final CanRequestLocationUpdatesImpl write;

    /* JADX INFO: renamed from: com.roadrunner.rider.state.offertowork.presentation.GetOfferToWorkUiState$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
        private static int MediaMetadataCompat = 1;
        private static int RatingCompat;
        public /* synthetic */ checkRevenue IconCompatParcelizer;
        public /* synthetic */ boolean RemoteActionCompatParcelizer;
        public /* synthetic */ boolean read;
        public final /* synthetic */ boolean serializer;
        public /* synthetic */ sc write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, ShortNewsContentCardView shortNewsContentCardView) {
            super(5, shortNewsContentCardView);
            this.serializer = z;
        }

        @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
        public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int i = 2 % 2;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            AnonymousClass2 anonymousClass2 = GetOfferToWorkUiState.this.new AnonymousClass2(this.serializer, (ShortNewsContentCardView) obj5);
            anonymousClass2.IconCompatParcelizer = (checkRevenue) obj;
            anonymousClass2.RemoteActionCompatParcelizer = zBooleanValue;
            anonymousClass2.write = (sc) obj3;
            anonymousClass2.read = zBooleanValue2;
            Object objInvokeSuspend = anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
            int i2 = RatingCompat + 9;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj6 = null;
            obj6.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008b  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:9:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 59;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            checkRevenue checkrevenue = this.IconCompatParcelizer;
            boolean z2 = this.RemoteActionCompatParcelizer;
            sc scVar = this.write;
            boolean z3 = this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isTrackingEnabled istrackingenabled = checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            GetOfferToWorkUiState getOfferToWorkUiState = GetOfferToWorkUiState.this;
            setTransactionSuccessful settransactionsuccessful = getOfferToWorkUiState.MediaDescriptionCompat;
            String str = getOfferToWorkUiState.IconCompatParcelizer.read();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ON_DEMAND"}, getCieXyz.write())).booleanValue() || str == null) {
                z = false;
            } else {
                int i4 = MediaMetadataCompat + 3;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (str.length() == 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z3 && !z2 && z) {
                AdjustEvent adjustEvent = checkrevenue.read;
                if (adjustEvent != null) {
                    int i6 = MediaMetadataCompat + 115;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0 ? !adjustEvent.IconCompatParcelizer : !adjustEvent.IconCompatParcelizer) {
                        if (!(!this.serializer) && istrackingenabled == isTrackingEnabled.NOT_WORKING) {
                            int i7 = RatingCompat + 125;
                            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            if (scVar == sc.SCHEDULE) {
                                return new AdjustPlayStoreSubscription(settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work), settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_button_not_working));
                            }
                        } else if (istrackingenabled == isTrackingEnabled.AVAILABLE) {
                            return new getPrice(settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_title_available), settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work_working_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_button_available));
                        }
                    }
                } else if (!(!this.serializer)) {
                    int i9 = RatingCompat + 125;
                    MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (scVar == sc.SCHEDULE) {
                        return new AdjustPlayStoreSubscription(settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work), settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_button_not_working));
                    }
                } else if (istrackingenabled == isTrackingEnabled.AVAILABLE) {
                    return new getPrice(settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_title_available), settransactionsuccessful.IconCompatParcelizer(R.string.status_offer_to_work_working_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_text_button_available));
                }
            }
            return getSku.IconCompatParcelizer;
        }
    }

    public GetOfferToWorkUiState(transferSessionPackageI transfersessionpackagei, GetStatusUseCaseImpl getStatusUseCaseImpl, IconCompat iconCompat, setTransactionSuccessful settransactionsuccessful, vg vgVar, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl) {
        this.MediaMetadataCompat = transfersessionpackagei;
        this.read = getStatusUseCaseImpl;
        this.serializer = iconCompat;
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = vgVar;
        this.IconCompatParcelizer = subscribetobannersupdateslambda2;
        this.write = canRequestLocationUpdatesImpl;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getCode getcode;
        int i;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1;
        Object obj;
        int i2 = 2 % 2;
        if (continuationImpl instanceof getCode) {
            getcode = (getCode) continuationImpl;
            int i3 = getcode.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaSessionCompatQueueItem + 105;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    getcode.write = i3 >> Integer.MIN_VALUE;
                } else {
                    getcode.write = i3 - Integer.MIN_VALUE;
                }
            } else {
                getcode = new getCode(this, continuationImpl);
            }
        } else {
            getcode = new getCode(this, continuationImpl);
        }
        Object obj2 = getcode.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getcode.write;
        boolean z = false;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            i = !((FirebaseRemoteConfigImpl) this.MediaMetadataCompat).RemoteActionCompatParcelizer(updateAdidI.SEARCH_SHIFTS) ? 1 : 0;
            getcode.read = i;
            getcode.write = 1;
            getMapScope$invoke$$inlined$map$1 = this.read.read();
            if (getMapScope$invoke$$inlined$map$1 == coroutineSingletons) {
                obj = getMapScope$invoke$$inlined$map$1;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = MediaBrowserCompatMediaItem + 57;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 82 / 0;
                }
                return null;
            }
            i = getcode.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            obj = obj2;
        }
        obj = getMapScope$invoke$$inlined$map$1;
        return FlowKt.RemoteActionCompatParcelizer((Flow) obj, new HasWorkNowOpportunityImpl$invoke$$inlined$map$1(this.serializer.IconCompatParcelizer.IconCompatParcelizer(), z ? 1 : 0), this.RemoteActionCompatParcelizer.write, this.write.serializer(), new AnonymousClass2(i != 0, null));
    }
}
