package com.roadrunner.push;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.domain.detection.DetectFaceWithFirebase;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.login.presentation.router.RouterViewModel;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.phonenumber.domain.GetCustomerPhoneNumberUseCaseImpl;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.bc;
import o.cd;
import o.ce;
import o.checkArithmeticNB67dxo;
import o.createFromParcel;
import o.dh;
import o.gdprForgetMeI;
import o.getContentViewGroupParentLayout;
import o.getOpeningAnimation;
import o.metaMarkUpdatedAndHasCallbacks;
import o.offsetChildrenVertical;
import o.onFailure;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA;
import o.r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;
import o.setArguments;
import o.setNextTransition;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class PushEventPublisherImpl$emit$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushEventPublisherImpl$emit$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushEventPublisherImpl$emit$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 41;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        Object obj2 = this.write;
        int i6 = 19;
        switch (i5) {
            case 0:
                return new PushEventPublisherImpl$emit$1((r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA) this.RemoteActionCompatParcelizer, (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj2, shortNewsContentCardView, 0);
            case 1:
                return new PushEventPublisherImpl$emit$1((checkArithmeticNB67dxo) this.RemoteActionCompatParcelizer, (TapToPayTaskUiItem$PaymentType) obj2, shortNewsContentCardView, 1);
            case 2:
                return new PushEventPublisherImpl$emit$1((DetectFaceWithFirebase) this.RemoteActionCompatParcelizer, (CameraImage) obj2, shortNewsContentCardView, i);
            case 3:
                PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$1 = new PushEventPublisherImpl$emit$1((WorkNowWithBonusUiModelImpl) obj2, shortNewsContentCardView, 3);
                int i7 = MediaDescriptionCompat + 19;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return pushEventPublisherImpl$emit$1;
            case 4:
                return new PushEventPublisherImpl$emit$1((GoAndStartInformationUiModelImpl) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 4);
            case 5:
                return new PushEventPublisherImpl$emit$1((WorkNowWithInfraBoostUiModelImpl) obj2, shortNewsContentCardView, 5);
            case 6:
                return new PushEventPublisherImpl$emit$1((setArguments) this.RemoteActionCompatParcelizer, (setNextTransition) obj2, shortNewsContentCardView, 6);
            case 7:
                return new PushEventPublisherImpl$emit$1((N$b) this.RemoteActionCompatParcelizer, (Long) obj2, shortNewsContentCardView, 7);
            case 8:
                return new PushEventPublisherImpl$emit$1((InAppNotificationsRepository) obj2, shortNewsContentCardView, 8);
            case 9:
                PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$2 = new PushEventPublisherImpl$emit$1((offsetChildrenVertical) obj2, shortNewsContentCardView, 9);
                int i9 = read + 19;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return pushEventPublisherImpl$emit$2;
            case 10:
                return new PushEventPublisherImpl$emit$1((DropShadowEffect) this.RemoteActionCompatParcelizer, (FeatureCombinationQueryImplExternalSyntheticLambda2) obj2, shortNewsContentCardView, 10);
            case 11:
                return new PushEventPublisherImpl$emit$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (RecordingViewModel) obj2, shortNewsContentCardView, 11);
            case 12:
                return new PushEventPublisherImpl$emit$1((LoginActivityViewModel) obj2, shortNewsContentCardView, 12);
            case 13:
                return new PushEventPublisherImpl$emit$1((CountrySelectionViewModel) this.RemoteActionCompatParcelizer, (metaMarkUpdatedAndHasCallbacks) obj2, shortNewsContentCardView, 13);
            case 14:
                return new PushEventPublisherImpl$emit$1((CountrySelectionViewModel) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 14);
            case 15:
                return new PushEventPublisherImpl$emit$1((ScrollState) this.RemoteActionCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 15);
            case 16:
                return new PushEventPublisherImpl$emit$1((bc) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 16);
            case 17:
                return new PushEventPublisherImpl$emit$1((RouterActivity) this.RemoteActionCompatParcelizer, (ce) obj2, shortNewsContentCardView, 17);
            case 18:
                return new PushEventPublisherImpl$emit$1((RouterViewModel) this.RemoteActionCompatParcelizer, (ce) obj2, shortNewsContentCardView, 18);
            case 19:
                return new PushEventPublisherImpl$emit$1((RouterViewModel) this.RemoteActionCompatParcelizer, (cd) obj2, shortNewsContentCardView, i6);
            case 20:
                return new PushEventPublisherImpl$emit$1((SignInViewModel) obj2, shortNewsContentCardView, 20);
            case 21:
                PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$3 = new PushEventPublisherImpl$emit$1((dh) obj2, shortNewsContentCardView, 21);
                pushEventPublisherImpl$emit$3.RemoteActionCompatParcelizer = obj;
                return pushEventPublisherImpl$emit$3;
            case 22:
                PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$4 = new PushEventPublisherImpl$emit$1((LocationComponentPluginImpl) obj2, shortNewsContentCardView, 22);
                pushEventPublisherImpl$emit$4.RemoteActionCompatParcelizer = obj;
                return pushEventPublisherImpl$emit$4;
            case 23:
                return new PushEventPublisherImpl$emit$1((getOpeningAnimation) this.RemoteActionCompatParcelizer, (SecondaryRouteApi) obj2, shortNewsContentCardView, 23);
            case 24:
                PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$5 = new PushEventPublisherImpl$emit$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, 24);
                int i11 = MediaDescriptionCompat + 43;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return pushEventPublisherImpl$emit$5;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 25:
                return new PushEventPublisherImpl$emit$1((PushWithAppStateDataStoreImpl) this.RemoteActionCompatParcelizer, (gdprForgetMeI) obj2, shortNewsContentCardView, 25);
            case 26:
                return new PushEventPublisherImpl$emit$1((BonusCalendarViewModel) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 26);
            case 27:
                return new PushEventPublisherImpl$emit$1((BlockRunner) this.RemoteActionCompatParcelizer, (LocalDate) obj2, shortNewsContentCardView, 27);
            case 28:
                return new PushEventPublisherImpl$emit$1((onFailure) this.RemoteActionCompatParcelizer, (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj2, shortNewsContentCardView, 28);
            default:
                return new PushEventPublisherImpl$emit$1((GetCustomerPhoneNumberUseCaseImpl) this.RemoteActionCompatParcelizer, (r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                Object objInvokeSuspend = ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = read + 51;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 3:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((PushEventPublisherImpl$emit$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                Object objInvokeSuspend2 = ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaDescriptionCompat + 77;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend2;
            case 25:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((PushEventPublisherImpl$emit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0311  */
    /* JADX WARN: Code duplicated, block: B:138:0x031c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0327  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v44 java.lang.Object, still in use, count: 2, list:
          (r4v44 java.lang.Object) from 0x0773: PHI (r4 I:??) = (r4v41 java.lang.Object), (r4v44 java.lang.Object) binds: [B:342:0x0772, B:529:0x0773] A[DONT_GENERATE, DONT_INLINE]
          (r4v44 java.lang.Object) from 0x076b: CHECK_CAST (o.notifyItemChanged) (r4v44 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.push.PushEventPublisherImpl$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
