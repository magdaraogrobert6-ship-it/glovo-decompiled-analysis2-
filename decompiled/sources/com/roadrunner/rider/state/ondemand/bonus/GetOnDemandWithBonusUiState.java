package com.roadrunner.rider.state.ondemand.bonus;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.domain.IsRiderInsideActiveAreaBoundaryImpl;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.AdjustDeeplink;
import o.AdjustReferrerReceiver;
import o.AdjustRemoteTrigger;
import o.AdjustSessionFailure;
import o.AdjustStoreInfo;
import o.AdjustTestOptions;
import o.AdjustThirdPartySharing;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.access500;
import o.areNotificationsEnabled;
import o.checkEventToken;
import o.checkRevenue;
import o.checkSdkClickResponse;
import o.createFromParcel;
import o.endRearDisplayPresentationSession;
import o.getAttributionI;
import o.getBridge;
import o.getCieXyz;
import o.getRearDisplayPresentation;
import o.getVerificationStatus;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.isTrackingEnabled;
import o.isValidStore;
import o.o7ExternalSyntheticLambda3;
import o.onPopulateAccessibilityEvent;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.removeNodeAtDepth;
import o.removeRearDisplayPresentationStatusListener;
import o.restoreFromCompatExtras;
import o.sa;
import o.sb;
import o.sc;
import o.sd;
import o.se;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.t2;
import o.t2ExternalSyntheticLambda1;
import o.t3;
import o.v4;
import o.v9;
import o.vd;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOnDemandWithBonusUiState {
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final CanRequestLocationUpdatesImpl IconCompatParcelizer;
    public final v9 MediaBrowserCompatMediaItem;
    public final IsRiderInsideActiveAreaBoundaryImpl MediaDescriptionCompat;
    public final IsRiderInsideAreaUseCaseImpl MediaMetadataCompat;
    public final OpportunitiesRepository MediaSessionCompatQueueItem;
    public final setTransactionSuccessful MediaSessionCompatResultReceiverWrapper;
    public final removeRearDisplayPresentationStatusListener MediaSessionCompatToken;
    public final vd RatingCompat;
    public final GetStatusUseCaseImpl RemoteActionCompatParcelizer;
    public final v4 read;
    public final subscribeToBannersUpdateslambda2 serializer;
    public final checkSdkClickResponse write;

    /* JADX INFO: renamed from: com.roadrunner.rider.state.ondemand.bonus.GetOnDemandWithBonusUiState$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
        private static int MediaBrowserCompatMediaItem = 0;
        private static int MediaDescriptionCompat = 1;
        public /* synthetic */ Object IconCompatParcelizer;
        public /* synthetic */ boolean MediaMetadataCompat;
        public final /* synthetic */ Object RatingCompat;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public /* synthetic */ boolean read;
        public /* synthetic */ Object serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(6, shortNewsContentCardView);
            this.write = i;
            this.RatingCompat = obj;
        }

        @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
        public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 61;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.write;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            Object obj7 = this.RatingCompat;
            int i4 = 0;
            if (i3 == 0) {
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2((GetOnDemandWithBonusUiState) obj7, (ShortNewsContentCardView) obj6, i4);
                anonymousClass2.RemoteActionCompatParcelizer = (se) obj;
                anonymousClass2.serializer = (checkRevenue) obj2;
                anonymousClass2.read = zBooleanValue;
                anonymousClass2.MediaMetadataCompat = zBooleanValue2;
                anonymousClass2.IconCompatParcelizer = (getWindowAreaDisplayMetrics) obj5;
                return anonymousClass2.invokeSuspend(createfromparcel2);
            }
            boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
            AnonymousClass2 anonymousClass3 = new AnonymousClass2((access500) obj7, (ShortNewsContentCardView) obj6, 1);
            anonymousClass3.RemoteActionCompatParcelizer = (sc) obj;
            anonymousClass3.read = zBooleanValue3;
            anonymousClass3.serializer = (AdjustDeeplink) obj3;
            anonymousClass3.MediaMetadataCompat = zBooleanValue4;
            anonymousClass3.IconCompatParcelizer = (getBridge) obj5;
            Object objInvokeSuspend = anonymousClass3.invokeSuspend(createfromparcel2);
            int i5 = MediaDescriptionCompat + 13;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0230  */
        /* JADX WARN: Code duplicated, block: B:103:0x0238  */
        /* JADX WARN: Code duplicated, block: B:106:0x0249  */
        /* JADX WARN: Code duplicated, block: B:109:0x0255  */
        /* JADX WARN: Code duplicated, block: B:112:0x025f  */
        /* JADX WARN: Code duplicated, block: B:113:0x0263  */
        /* JADX WARN: Code duplicated, block: B:116:0x0279  */
        /* JADX WARN: Code duplicated, block: B:118:0x0281  */
        /* JADX WARN: Code duplicated, block: B:120:0x028d  */
        /* JADX WARN: Code duplicated, block: B:121:0x0293 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:122:0x0295  */
        /* JADX WARN: Code duplicated, block: B:124:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:125:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:126:0x02ab  */
        /* JADX WARN: Code duplicated, block: B:128:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:129:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:131:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:132:0x02cf  */
        /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
        /* JADX WARN: Code duplicated, block: B:138:0x02f9  */
        /* JADX WARN: Code duplicated, block: B:141:0x0302  */
        /* JADX WARN: Code duplicated, block: B:142:0x0306  */
        /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:95:0x0200  */
        /* JADX WARN: Code duplicated, block: B:96:0x0215  */
        /* JADX WARN: Code duplicated, block: B:98:0x0219  */
        /* JADX WARN: Code duplicated, block: B:99:0x021b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Map map;
            t3 t3Var;
            boolean z;
            String strIconCompatParcelizer;
            boolean z2;
            int i;
            boolean zRemoteActionCompatParcelizer;
            getVerificationStatus getverificationstatus;
            AdjustRemoteTrigger adjustRemoteTrigger;
            AdjustRemoteTrigger adjustRemoteTrigger2;
            t2ExternalSyntheticLambda1 t2externalsyntheticlambda1;
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements;
            int i2;
            int i3;
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements2;
            Object next2;
            t2 t2Var;
            int i4 = 2 % 2;
            int i5 = this.write;
            Object obj2 = this.RatingCompat;
            if (i5 != 0) {
                access500 access500Var = (access500) obj2;
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) access500Var.read;
                sc scVar = (sc) this.RemoteActionCompatParcelizer;
                boolean z3 = this.read;
                AdjustDeeplink adjustDeeplink = (AdjustDeeplink) this.serializer;
                boolean z4 = this.MediaMetadataCompat;
                getBridge getbridge = (getBridge) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (z4) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((subscribeToBannersUpdateslambda2) access500Var.MediaMetadataCompat).read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() && adjustDeeplink.write.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING && !z3 && scVar == sc.START_NOW && !(getbridge instanceof onPopulateAccessibilityEvent)) {
                        return new restoreFromCompatExtras(settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_outside_starting_area_title), settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_outside_starting_area_description), settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_schedule_a_session_action));
                    }
                }
                return areNotificationsEnabled.RemoteActionCompatParcelizer;
            }
            se seVar = (se) this.RemoteActionCompatParcelizer;
            checkRevenue checkrevenue = (checkRevenue) this.serializer;
            boolean z5 = this.read;
            boolean z6 = this.MediaMetadataCompat;
            getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z5) {
                GetOnDemandWithBonusUiState getOnDemandWithBonusUiState = (GetOnDemandWithBonusUiState) obj2;
                setTransactionSuccessful settransactionsuccessful2 = getOnDemandWithBonusUiState.MediaSessionCompatResultReceiverWrapper;
                isTrackingEnabled istrackingenabled = checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                checkEventToken checkeventtoken = checkrevenue.write;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getOnDemandWithBonusUiState.serializer.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() && istrackingenabled != isTrackingEnabled.SUSPENDED) {
                    if (checkeventtoken != null) {
                        return new isValidStore(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description), checkeventtoken.RemoteActionCompatParcelizer);
                    }
                    if (istrackingenabled == isTrackingEnabled.NOT_WORKING) {
                        checkSdkClickResponse checksdkclickresponse = getOnDemandWithBonusUiState.write;
                        sa saVar = seVar.serializer;
                        Map map2 = seVar.RemoteActionCompatParcelizer;
                        if (!(saVar instanceof sd)) {
                            if (saVar instanceof sb) {
                                List list = ((sb) saVar).write;
                                IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl = getOnDemandWithBonusUiState.MediaMetadataCompat;
                                List list2 = list;
                                Iterator it = list2.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    t2Var = (t2) next;
                                    if (t2Var.IconCompatParcelizer) {
                                        break;
                                    }
                                    int i6 = MediaDescriptionCompat + 43;
                                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                                    int i7 = i6 % 2;
                                } while (!t2Var.RemoteActionCompatParcelizer);
                                t2 t2Var2 = (t2) next;
                                if (t2Var2 == null) {
                                    int i8 = MediaDescriptionCompat + 37;
                                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                                    int i9 = i8 % 2;
                                    if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                        int i10 = MediaBrowserCompatMediaItem + 121;
                                        MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                                        if (i10 % 2 == 0) {
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        if (z6) {
                                            if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                                                extensionWindowAreaStatusRequirements2 = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                                            } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                                                extensionWindowAreaStatusRequirements2 = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                                            } else {
                                                map = map2;
                                                if (!(getwindowareadisplaymetrics instanceof getWindowAreaStatus)) {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                }
                                            }
                                            Map map3 = map2;
                                            o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements2.serializer, extensionWindowAreaStatusRequirements2.read);
                                            Iterator it2 = list2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    map = map3;
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it2.next();
                                                map = map3;
                                                t2ExternalSyntheticLambda1 t2externalsyntheticlambda2 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(((t2) next2).MediaDescriptionCompat));
                                                if (t2externalsyntheticlambda2 != null && isRiderInsideAreaUseCaseImpl.invoke(o7externalsyntheticlambda3, t2externalsyntheticlambda2.serializer)) {
                                                    break;
                                                }
                                                map3 = map;
                                            }
                                            t2Var2 = (t2) next2;
                                            if (t2Var2 != null) {
                                                getOnDemandWithBonusUiState.MediaSessionCompatQueueItem.read(t2Var2.MediaDescriptionCompat);
                                            }
                                            if (t2Var2 == null) {
                                                t3Var = t2Var2.read;
                                                if (t3Var != null) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                int i11 = MediaBrowserCompatMediaItem + 29;
                                                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                                                int i12 = i11 % 2;
                                                String str = t2Var2.MediaMetadataCompat;
                                                int i13 = t2Var2.MediaDescriptionCompat;
                                                if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                                    strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_btn);
                                                } else {
                                                    strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.status_start_working);
                                                }
                                                String str2 = strIconCompatParcelizer;
                                                if (getOnDemandWithBonusUiState.MediaBrowserCompatMediaItem.serializer() || !t2Var2.write.equals(Boolean.TRUE)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                boolean zRemoteActionCompatParcelizer2 = getOnDemandWithBonusUiState.read.RemoteActionCompatParcelizer();
                                                if (!(!z)) {
                                                    i = R.string.rid_current_promos_see_all_description;
                                                } else {
                                                    i = R.string.rid_current_promos_see_all_empty_description;
                                                }
                                                String strIconCompatParcelizer2 = settransactionsuccessful2.IconCompatParcelizer(i);
                                                String strIconCompatParcelizer3 = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title);
                                                zRemoteActionCompatParcelizer = checksdkclickresponse.RemoteActionCompatParcelizer();
                                                getverificationstatus = getVerificationStatus.read;
                                                if (!zRemoteActionCompatParcelizer) {
                                                    adjustRemoteTrigger = getverificationstatus;
                                                    adjustRemoteTrigger2 = adjustRemoteTrigger;
                                                } else if (!getOnDemandWithBonusUiState.RatingCompat.RemoteActionCompatParcelizer()) {
                                                    i3 = MediaDescriptionCompat + 113;
                                                    MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                                                    if (i3 % 2 != 0) {
                                                        int i14 = 20 / 0;
                                                    }
                                                    adjustRemoteTrigger = getverificationstatus;
                                                    adjustRemoteTrigger2 = adjustRemoteTrigger;
                                                } else if (z6) {
                                                    t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var2.MediaDescriptionCompat));
                                                    if (t2externalsyntheticlambda1 != null) {
                                                        if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                                                            int i15 = MediaBrowserCompatMediaItem + 107;
                                                            MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                                                            int i16 = i15 % 2;
                                                            extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                                                        } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                                                            int i17 = MediaBrowserCompatMediaItem + 37;
                                                            MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                                                            int i18 = i17 % 2;
                                                            extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                                                        } else if (!(getwindowareadisplaymetrics instanceof getWindowAreaStatus)) {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                        }
                                                        if (!isRiderInsideAreaUseCaseImpl.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), t2externalsyntheticlambda1.serializer)) {
                                                            adjustRemoteTrigger2 = AdjustReferrerReceiver.IconCompatParcelizer;
                                                        }
                                                    }
                                                    adjustRemoteTrigger2 = getverificationstatus;
                                                } else {
                                                    i2 = MediaBrowserCompatMediaItem + 49;
                                                    MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                                                    if (i2 % 2 == 0) {
                                                        adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                        int i19 = 61 / 0;
                                                    } else {
                                                        adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                    }
                                                    adjustRemoteTrigger2 = adjustRemoteTrigger;
                                                }
                                                return new AdjustThirdPartySharing(i13, str, t3Var, str2, z2, zRemoteActionCompatParcelizer2, strIconCompatParcelizer2, strIconCompatParcelizer3, adjustRemoteTrigger2, settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_disclaimer_description), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_btn), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_description));
                                            }
                                            int i20 = MediaDescriptionCompat + 123;
                                            MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                                            int i21 = i20 % 2;
                                            if (!checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                                return new AdjustTestOptions(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description));
                                            }
                                        } else {
                                            map = map2;
                                        }
                                        t2Var2 = null;
                                        if (t2Var2 == null) {
                                            t3Var = t2Var2.read;
                                            if (t3Var != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            int i110 = MediaBrowserCompatMediaItem + 29;
                                            MediaDescriptionCompat = i110 % Fields.SpotShadowColor;
                                            int i111 = i110 % 2;
                                            String str3 = t2Var2.MediaMetadataCompat;
                                            int i112 = t2Var2.MediaDescriptionCompat;
                                            if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                                strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_btn);
                                            } else {
                                                strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.status_start_working);
                                            }
                                            String str4 = strIconCompatParcelizer;
                                            if (getOnDemandWithBonusUiState.MediaBrowserCompatMediaItem.serializer()) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            boolean zRemoteActionCompatParcelizer3 = getOnDemandWithBonusUiState.read.RemoteActionCompatParcelizer();
                                            if (!(!z)) {
                                                i = R.string.rid_current_promos_see_all_description;
                                            } else {
                                                i = R.string.rid_current_promos_see_all_empty_description;
                                            }
                                            String strIconCompatParcelizer4 = settransactionsuccessful2.IconCompatParcelizer(i);
                                            String strIconCompatParcelizer5 = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title);
                                            zRemoteActionCompatParcelizer = checksdkclickresponse.RemoteActionCompatParcelizer();
                                            getverificationstatus = getVerificationStatus.read;
                                            if (!zRemoteActionCompatParcelizer) {
                                                adjustRemoteTrigger = getverificationstatus;
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else if (!getOnDemandWithBonusUiState.RatingCompat.RemoteActionCompatParcelizer()) {
                                                i3 = MediaDescriptionCompat + 113;
                                                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                                                if (i3 % 2 != 0) {
                                                    int i113 = 20 / 0;
                                                }
                                                adjustRemoteTrigger = getverificationstatus;
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else if (z6) {
                                                i2 = MediaBrowserCompatMediaItem + 49;
                                                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                                                if (i2 % 2 == 0) {
                                                    adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                    int i114 = 61 / 0;
                                                } else {
                                                    adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                }
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else {
                                                t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var2.MediaDescriptionCompat));
                                                if (t2externalsyntheticlambda1 != null) {
                                                    if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                                                        int i115 = MediaBrowserCompatMediaItem + 107;
                                                        MediaDescriptionCompat = i115 % Fields.SpotShadowColor;
                                                        int i116 = i115 % 2;
                                                        extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                                                    } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                                                        int i117 = MediaBrowserCompatMediaItem + 37;
                                                        MediaDescriptionCompat = i117 % Fields.SpotShadowColor;
                                                        int i118 = i117 % 2;
                                                        extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                                                    } else if (!(getwindowareadisplaymetrics instanceof getWindowAreaStatus)) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    }
                                                    if (!isRiderInsideAreaUseCaseImpl.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), t2externalsyntheticlambda1.serializer)) {
                                                        adjustRemoteTrigger2 = AdjustReferrerReceiver.IconCompatParcelizer;
                                                    }
                                                }
                                                adjustRemoteTrigger2 = getverificationstatus;
                                            }
                                            return new AdjustThirdPartySharing(i112, str3, t3Var, str4, z2, zRemoteActionCompatParcelizer3, strIconCompatParcelizer4, strIconCompatParcelizer5, adjustRemoteTrigger2, settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_disclaimer_description), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_btn), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_description));
                                        }
                                        int i22 = MediaDescriptionCompat + 123;
                                        MediaBrowserCompatMediaItem = i22 % Fields.SpotShadowColor;
                                        int i23 = i22 % 2;
                                        if (!checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                            return new AdjustTestOptions(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description));
                                        }
                                    } else {
                                        map = map2;
                                        t2Var2 = null;
                                        if (t2Var2 == null) {
                                            t3Var = t2Var2.read;
                                            if (t3Var != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            int i119 = MediaBrowserCompatMediaItem + 29;
                                            MediaDescriptionCompat = i119 % Fields.SpotShadowColor;
                                            int i1110 = i119 % 2;
                                            String str5 = t2Var2.MediaMetadataCompat;
                                            int i1111 = t2Var2.MediaDescriptionCompat;
                                            if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                                strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_btn);
                                            } else {
                                                strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.status_start_working);
                                            }
                                            String str6 = strIconCompatParcelizer;
                                            if (getOnDemandWithBonusUiState.MediaBrowserCompatMediaItem.serializer()) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            boolean zRemoteActionCompatParcelizer4 = getOnDemandWithBonusUiState.read.RemoteActionCompatParcelizer();
                                            if (!(!z)) {
                                                i = R.string.rid_current_promos_see_all_description;
                                            } else {
                                                i = R.string.rid_current_promos_see_all_empty_description;
                                            }
                                            String strIconCompatParcelizer6 = settransactionsuccessful2.IconCompatParcelizer(i);
                                            String strIconCompatParcelizer7 = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title);
                                            zRemoteActionCompatParcelizer = checksdkclickresponse.RemoteActionCompatParcelizer();
                                            getverificationstatus = getVerificationStatus.read;
                                            if (!zRemoteActionCompatParcelizer) {
                                                adjustRemoteTrigger = getverificationstatus;
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else if (!getOnDemandWithBonusUiState.RatingCompat.RemoteActionCompatParcelizer()) {
                                                i3 = MediaDescriptionCompat + 113;
                                                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                                                if (i3 % 2 != 0) {
                                                    int i1112 = 20 / 0;
                                                }
                                                adjustRemoteTrigger = getverificationstatus;
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else if (z6) {
                                                i2 = MediaBrowserCompatMediaItem + 49;
                                                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                                                if (i2 % 2 == 0) {
                                                    adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                    int i1113 = 61 / 0;
                                                } else {
                                                    adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                                }
                                                adjustRemoteTrigger2 = adjustRemoteTrigger;
                                            } else {
                                                t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var2.MediaDescriptionCompat));
                                                if (t2externalsyntheticlambda1 != null) {
                                                    if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                                                        int i1114 = MediaBrowserCompatMediaItem + 107;
                                                        MediaDescriptionCompat = i1114 % Fields.SpotShadowColor;
                                                        int i1115 = i1114 % 2;
                                                        extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                                                    } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                                                        int i1116 = MediaBrowserCompatMediaItem + 37;
                                                        MediaDescriptionCompat = i1116 % Fields.SpotShadowColor;
                                                        int i1117 = i1116 % 2;
                                                        extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                                                    } else if (!(getwindowareadisplaymetrics instanceof getWindowAreaStatus)) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    }
                                                    if (!isRiderInsideAreaUseCaseImpl.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), t2externalsyntheticlambda1.serializer)) {
                                                        adjustRemoteTrigger2 = AdjustReferrerReceiver.IconCompatParcelizer;
                                                    }
                                                }
                                                adjustRemoteTrigger2 = getverificationstatus;
                                            }
                                            return new AdjustThirdPartySharing(i1111, str5, t3Var, str6, z2, zRemoteActionCompatParcelizer4, strIconCompatParcelizer6, strIconCompatParcelizer7, adjustRemoteTrigger2, settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_disclaimer_description), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_btn), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_description));
                                        }
                                        int i24 = MediaDescriptionCompat + 123;
                                        MediaBrowserCompatMediaItem = i24 % Fields.SpotShadowColor;
                                        int i25 = i24 % 2;
                                        if (!checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                            return new AdjustTestOptions(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description));
                                        }
                                    }
                                } else {
                                    map = map2;
                                }
                                if (t2Var2 == null) {
                                    t3Var = t2Var2.read;
                                    if (t3Var != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    int i1118 = MediaBrowserCompatMediaItem + 29;
                                    MediaDescriptionCompat = i1118 % Fields.SpotShadowColor;
                                    int i1119 = i1118 % 2;
                                    String str7 = t2Var2.MediaMetadataCompat;
                                    int i11110 = t2Var2.MediaDescriptionCompat;
                                    if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_btn);
                                    } else {
                                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.status_start_working);
                                    }
                                    String str8 = strIconCompatParcelizer;
                                    if (getOnDemandWithBonusUiState.MediaBrowserCompatMediaItem.serializer()) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean zRemoteActionCompatParcelizer5 = getOnDemandWithBonusUiState.read.RemoteActionCompatParcelizer();
                                    if (!(!z)) {
                                        i = R.string.rid_current_promos_see_all_description;
                                    } else {
                                        i = R.string.rid_current_promos_see_all_empty_description;
                                    }
                                    String strIconCompatParcelizer8 = settransactionsuccessful2.IconCompatParcelizer(i);
                                    String strIconCompatParcelizer9 = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title);
                                    zRemoteActionCompatParcelizer = checksdkclickresponse.RemoteActionCompatParcelizer();
                                    getverificationstatus = getVerificationStatus.read;
                                    if (!zRemoteActionCompatParcelizer) {
                                        adjustRemoteTrigger = getverificationstatus;
                                        adjustRemoteTrigger2 = adjustRemoteTrigger;
                                    } else if (!getOnDemandWithBonusUiState.RatingCompat.RemoteActionCompatParcelizer()) {
                                        i3 = MediaDescriptionCompat + 113;
                                        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                                        if (i3 % 2 != 0) {
                                            int i11111 = 20 / 0;
                                        }
                                        adjustRemoteTrigger = getverificationstatus;
                                        adjustRemoteTrigger2 = adjustRemoteTrigger;
                                    } else if (z6) {
                                        i2 = MediaBrowserCompatMediaItem + 49;
                                        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                                        if (i2 % 2 == 0) {
                                            adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                            int i11112 = 61 / 0;
                                        } else {
                                            adjustRemoteTrigger = AdjustSessionFailure.RemoteActionCompatParcelizer;
                                        }
                                        adjustRemoteTrigger2 = adjustRemoteTrigger;
                                    } else {
                                        t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var2.MediaDescriptionCompat));
                                        if (t2externalsyntheticlambda1 != null) {
                                            if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                                                int i11113 = MediaBrowserCompatMediaItem + 107;
                                                MediaDescriptionCompat = i11113 % Fields.SpotShadowColor;
                                                int i11114 = i11113 % 2;
                                                extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                                            } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                                                int i11115 = MediaBrowserCompatMediaItem + 37;
                                                MediaDescriptionCompat = i11115 % Fields.SpotShadowColor;
                                                int i11116 = i11115 % 2;
                                                extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                                            } else if (!(getwindowareadisplaymetrics instanceof getWindowAreaStatus)) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            }
                                            if (!isRiderInsideAreaUseCaseImpl.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), t2externalsyntheticlambda1.serializer)) {
                                                adjustRemoteTrigger2 = AdjustReferrerReceiver.IconCompatParcelizer;
                                            }
                                        }
                                        adjustRemoteTrigger2 = getverificationstatus;
                                    }
                                    return new AdjustThirdPartySharing(i11110, str7, t3Var, str8, z2, zRemoteActionCompatParcelizer5, strIconCompatParcelizer8, strIconCompatParcelizer9, adjustRemoteTrigger2, settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_outside_active_area_disclaimer_description), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_btn), settransactionsuccessful2.IconCompatParcelizer(R.string.rid_ondemand_go_online_anyway_description));
                                }
                                int i26 = MediaDescriptionCompat + 123;
                                MediaBrowserCompatMediaItem = i26 % Fields.SpotShadowColor;
                                int i27 = i26 % 2;
                                if (!checksdkclickresponse.RemoteActionCompatParcelizer()) {
                                    return new AdjustTestOptions(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description));
                                }
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                            return null;
                        }
                        if (!checksdkclickresponse.RemoteActionCompatParcelizer()) {
                            return new AdjustTestOptions(settransactionsuccessful2.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful2.IconCompatParcelizer(R.string.status_on_demand_working_description));
                        }
                    }
                }
            }
            return AdjustStoreInfo.serializer;
        }
    }

    public GetOnDemandWithBonusUiState(GetStatusUseCaseImpl getStatusUseCaseImpl, v9 v9Var, OpportunitiesRepository opportunitiesRepository, setTransactionSuccessful settransactionsuccessful, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, IsRiderInsideActiveAreaBoundaryImpl isRiderInsideActiveAreaBoundaryImpl, checkSdkClickResponse checksdkclickresponse, vd vdVar, removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener, IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl, v4 v4Var) {
        this.RemoteActionCompatParcelizer = getStatusUseCaseImpl;
        this.MediaBrowserCompatMediaItem = v9Var;
        this.MediaSessionCompatQueueItem = opportunitiesRepository;
        this.MediaSessionCompatResultReceiverWrapper = settransactionsuccessful;
        this.serializer = subscribetobannersupdateslambda2;
        this.IconCompatParcelizer = canRequestLocationUpdatesImpl;
        this.MediaDescriptionCompat = isRiderInsideActiveAreaBoundaryImpl;
        this.write = checksdkclickresponse;
        this.RatingCompat = vdVar;
        this.MediaSessionCompatToken = removereardisplaypresentationstatuslistener;
        this.MediaMetadataCompat = isRiderInsideAreaUseCaseImpl;
        this.read = v4Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getAttributionI getattributioni;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 53;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof getAttributionI;
            throw null;
        }
        if (continuationImpl instanceof getAttributionI) {
            getattributioni = (getAttributionI) continuationImpl;
            int i3 = getattributioni.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getattributioni.read = i3 - Integer.MIN_VALUE;
            } else {
                getattributioni = new getAttributionI(this, continuationImpl);
            }
        } else {
            getattributioni = new getAttributionI(this, continuationImpl);
        }
        Object obj = getattributioni.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getattributioni.read;
        if (i4 != 0) {
            int i5 = PlaybackStateCompatCustomAction + 11;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$2 = getattributioni.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = flowKt__ZipKt$combine$$inlined$unsafeFlow$2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!this.MediaBrowserCompatMediaItem.serializer()) {
                FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(AdjustStoreInfo.serializer);
                int i7 = PlaybackStateCompatCustomAction + 47;
                PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
            }
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$3 = this.MediaSessionCompatQueueItem.read();
            getattributioni.IconCompatParcelizer = flowKt__ZipKt$combine$$inlined$unsafeFlow$3;
            getattributioni.read = 1;
            GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = this.RemoteActionCompatParcelizer.read();
            if (getMapScope$invoke$$inlined$map$1 == coroutineSingletons) {
                int i9 = PlaybackStateCompatCustomAction + 85;
                PlaybackStateCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
            flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = flowKt__ZipKt$combine$$inlined$unsafeFlow$3;
            obj = getMapScope$invoke$$inlined$map$1;
        }
        return FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, (Flow) obj, this.IconCompatParcelizer.serializer(), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(), this.MediaSessionCompatToken.serializer, new AnonymousClass2(this, shortNewsContentCardView, 0)));
    }
}
