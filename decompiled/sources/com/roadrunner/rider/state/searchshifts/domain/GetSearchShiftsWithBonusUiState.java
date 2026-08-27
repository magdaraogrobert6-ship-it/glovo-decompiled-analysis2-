package com.roadrunner.rider.state.searchshifts.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository$get$$inlined$map$1;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import o.PackageHandler3;
import o.PackageHandler6;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.checkRevenue;
import o.createFromParcel;
import o.getCieXyz;
import o.getPayloadFromSystemProperty;
import o.getPayloadsFromContentProviderIntentAction;
import o.hasAllLocationsBeenRead;
import o.isTrackingEnabled;
import o.moveBydefault;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.readContentProviderIntentAction;
import o.readFileContent;
import o.removeNodeAtDepth;
import o.sa;
import o.sb;
import o.sc;
import o.sd;
import o.sendNextPurchaseVerificationPackage;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.t1;
import o.t2;
import o.t3;
import o.v9;
import o.va;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class GetSearchShiftsWithBonusUiState {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final subscribeToBannersUpdateslambda2 IconCompatParcelizer;
    public final QuickSessionsRepository MediaBrowserCompatMediaItem;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final vg MediaMetadataCompat;
    public final OpportunitiesRepository MediaSessionCompatQueueItem;
    public final GetStatusUseCaseImpl RemoteActionCompatParcelizer;
    public final va read;
    public final readFileContent serializer;
    public final v9 write;

    /* JADX INFO: renamed from: com.roadrunner.rider.state.searchshifts.domain.GetSearchShiftsWithBonusUiState$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
        private static int MediaBrowserCompatMediaItem = 0;
        private static int MediaDescriptionCompat = 1;
        public /* synthetic */ checkRevenue RemoteActionCompatParcelizer;
        public /* synthetic */ sc read;
        public /* synthetic */ getPayloadFromSystemProperty serializer;
        public /* synthetic */ sa write;

        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView) {
            super(5, shortNewsContentCardView);
        }

        @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
        public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = GetSearchShiftsWithBonusUiState.this.new AnonymousClass2((ShortNewsContentCardView) obj5);
            anonymousClass2.RemoteActionCompatParcelizer = (checkRevenue) obj;
            anonymousClass2.write = (sa) obj2;
            anonymousClass2.read = (sc) obj3;
            anonymousClass2.serializer = (getPayloadFromSystemProperty) obj4;
            Object objInvokeSuspend = anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
            int i2 = MediaDescriptionCompat + 41;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:63:0x0123  */
        /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            PackageHandler6 packageHandler6;
            boolean z;
            boolean z2;
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
            t1 t1Var;
            boolean z3;
            List listRemoteActionCompatParcelizer;
            List list;
            Object next2;
            int i = 2 % 2;
            checkRevenue checkrevenue = this.RemoteActionCompatParcelizer;
            sa saVar = this.write;
            sc scVar = this.read;
            getPayloadFromSystemProperty getpayloadfromsystemproperty = this.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (scVar == sc.SCHEDULE && !(saVar instanceof sd)) {
                if (!(saVar instanceof sb)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                Iterator it = ((sb) saVar).write.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    t2 t2Var = (t2) next;
                    if (t2Var.IconCompatParcelizer) {
                        break;
                    }
                    int i2 = MediaDescriptionCompat + 75;
                    MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        boolean z4 = t2Var.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (!(!t2Var.RemoteActionCompatParcelizer)) {
                        int i3 = MediaDescriptionCompat + 51;
                        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            break;
                        }
                        int i4 = 10 / 0;
                        break;
                    }
                }
                t2 t2Var2 = (t2) next;
                GetSearchShiftsWithBonusUiState getSearchShiftsWithBonusUiState = GetSearchShiftsWithBonusUiState.this;
                String str = getSearchShiftsWithBonusUiState.IconCompatParcelizer.read();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ON_DEMAND"}, getCieXyz.write())).booleanValue()) {
                    int i5 = MediaBrowserCompatMediaItem + 83;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (str != null && str.length() != 0 && checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING) {
                        setTransactionSuccessful settransactionsuccessful = getSearchShiftsWithBonusUiState.MediaDescriptionCompat;
                        if (t2Var2 == null) {
                            return new getPayloadsFromContentProviderIntentAction(settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_no_zone_selection_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_search_shifts_text_button));
                        }
                        boolean zIconCompatParcelizer = getSearchShiftsWithBonusUiState.serializer.IconCompatParcelizer();
                        if (getpayloadfromsystemproperty == null || (list = getpayloadfromsystemproperty.zones) == null) {
                            packageHandler6 = null;
                        } else {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((PackageHandler6) next2).read() != t2Var2.MediaDescriptionCompat);
                            packageHandler6 = (PackageHandler6) next2;
                        }
                        if (packageHandler6 == null || (listRemoteActionCompatParcelizer = packageHandler6.RemoteActionCompatParcelizer()) == null || !(!listRemoteActionCompatParcelizer.isEmpty())) {
                            z = false;
                        } else {
                            int i7 = MediaBrowserCompatMediaItem + 111;
                            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            z = true;
                        }
                        if (zIconCompatParcelizer) {
                            int i9 = MediaBrowserCompatMediaItem + 49;
                            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            if (z) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        boolean zSerializer = getSearchShiftsWithBonusUiState.write.serializer();
                        boolean z5 = zSerializer && t2Var2.read != null;
                        if (z2) {
                            List listRemoteActionCompatParcelizer2 = packageHandler6.RemoteActionCompatParcelizer();
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer2, 10));
                            Iterator it3 = listRemoteActionCompatParcelizer2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(moveBydefault.read((PackageHandler3) it3.next()));
                            }
                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                        } else {
                            int i11 = MediaBrowserCompatMediaItem + 83;
                            MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = null;
                        }
                        int i13 = t2Var2.MediaDescriptionCompat;
                        String str2 = t2Var2.MediaMetadataCompat;
                        t3 t3Var = t2Var2.read;
                        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_search_shifts_text_button);
                        String str3 = t2Var2.MediaSessionCompatQueueItem;
                        String str4 = (zIconCompatParcelizer || (t1Var = t2Var2.serializer) == null) ? null : t1Var.serializer;
                        boolean z6 = t2Var2.write.equals(Boolean.TRUE) && zSerializer;
                        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(z5 ? R.string.rid_current_promos_see_all_description : R.string.rid_current_promos_see_all_empty_description);
                        String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title);
                        if (zIconCompatParcelizer) {
                            int i14 = MediaBrowserCompatMediaItem + 49;
                            int i15 = i14 % Fields.SpotShadowColor;
                            MediaDescriptionCompat = i15;
                            if (i14 % 2 == 0) {
                                int i16 = 60 / 0;
                                if (z) {
                                    z3 = false;
                                } else {
                                    int i17 = i15 + 93;
                                    MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                                    int i18 = i17 % 2;
                                    z3 = true;
                                }
                            } else if (z) {
                                z3 = false;
                            } else {
                                int i19 = i15 + 93;
                                MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
                                int i110 = i19 % 2;
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        return new hasAllLocationsBeenRead(i13, str2, zSerializer, t3Var, strIconCompatParcelizer, str3, str4, Boolean.valueOf(z6), strIconCompatParcelizer2, strIconCompatParcelizer3, z3, !z2 || r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null, z2 && r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer != null, settransactionsuccessful.IconCompatParcelizer(R.string.rid_quick_sessions_empty_description), getpayloadfromsystemproperty != null ? Integer.valueOf(getpayloadfromsystemproperty.cityId) : null, settransactionsuccessful.IconCompatParcelizer(R.string.rid_quick_sessions_slider), r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer);
                    }
                }
            }
            return readContentProviderIntentAction.RemoteActionCompatParcelizer;
        }
    }

    public GetSearchShiftsWithBonusUiState(v9 v9Var, va vaVar, readFileContent readfilecontent, OpportunitiesRepository opportunitiesRepository, setTransactionSuccessful settransactionsuccessful, GetStatusUseCaseImpl getStatusUseCaseImpl, vg vgVar, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, QuickSessionsRepository quickSessionsRepository) {
        this.write = v9Var;
        this.read = vaVar;
        this.serializer = readfilecontent;
        this.MediaSessionCompatQueueItem = opportunitiesRepository;
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = getStatusUseCaseImpl;
        this.MediaMetadataCompat = vgVar;
        this.IconCompatParcelizer = subscribetobannersupdateslambda2;
        this.MediaBrowserCompatMediaItem = quickSessionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v13 o.sendNextPurchaseVerificationPackage) = (r1v12 o.sendNextPurchaseVerificationPackage), (r1v15 o.sendNextPurchaseVerificationPackage) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        sendNextPurchaseVerificationPackage sendnextpurchaseverificationpackage;
        int i;
        int i2 = 2 % 2;
        int i3 = 0;
        if (continuationImpl instanceof sendNextPurchaseVerificationPackage) {
            int i4 = RatingCompat + 103;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                sendnextpurchaseverificationpackage = (sendNextPurchaseVerificationPackage) continuationImpl;
                i = sendnextpurchaseverificationpackage.IconCompatParcelizer;
                int i5 = 41 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    sendnextpurchaseverificationpackage.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    sendnextpurchaseverificationpackage = new sendNextPurchaseVerificationPackage(this, continuationImpl);
                }
            } else {
                sendnextpurchaseverificationpackage = (sendNextPurchaseVerificationPackage) continuationImpl;
                i = sendnextpurchaseverificationpackage.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    sendnextpurchaseverificationpackage.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    sendnextpurchaseverificationpackage = new sendNextPurchaseVerificationPackage(this, continuationImpl);
                }
            }
        } else {
            sendnextpurchaseverificationpackage = new sendNextPurchaseVerificationPackage(this, continuationImpl);
        }
        Object obj = sendnextpurchaseverificationpackage.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = sendnextpurchaseverificationpackage.IconCompatParcelizer;
        if (i6 != 0) {
            int i7 = RatingCompat;
            int i8 = i7 + 89;
            PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 35;
            PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!this.write.serializer()) {
                int i11 = RatingCompat + 15;
                PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (!this.read.read()) {
                    return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(readContentProviderIntentAction.RemoteActionCompatParcelizer);
                }
            }
            sendnextpurchaseverificationpackage.IconCompatParcelizer = 1;
            obj = this.RemoteActionCompatParcelizer.read();
            if (obj == obj2) {
                return obj2;
            }
        }
        return FlowKt.RemoteActionCompatParcelizer((Flow) obj, new OpportunitiesRepository$get$$inlined$map$1(this.MediaSessionCompatQueueItem.read(), i3), this.MediaMetadataCompat.write, this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, new AnonymousClass2(null));
    }
}
