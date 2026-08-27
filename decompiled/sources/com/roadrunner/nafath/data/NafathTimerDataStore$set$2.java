package com.roadrunner.nafath.data;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.BlockRunner;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel$onPinChanged$2;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel$triggerOtp$1;
import com.roadrunner.rider.state.quests.data.QuestsCache;
import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ActivityHandler10;
import o.AndroidPreparedStatement;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.BrazeExternalSyntheticLambda11;
import o.C0212wallpaper;
import o.ComposeAnimationState;
import o.CompositionDataTree;
import o.ConstraintReferenceIncorrectConstraintException;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreferenceScreen;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.SlotTreeKtExternalSyntheticLambda0;
import o.UnsupportedSearchInfo;
import o.ac;
import o.accessgetOldDependencyp;
import o.ad;
import o.addDate;
import o.apiLevel;
import o.backwardFocusSearch;
import o.buildDeeplinkSdkClickPackage;
import o.considerReleasingGlowsOnScroll;
import o.createFromParcel;
import o.decode;
import o.decryptAndGetPasswordBWLJW6A;
import o.dismissBannerlambda1;
import o.findAnimatable;
import o.findParameters;
import o.gdprForgetMeI;
import o.getArgCount;
import o.getContentViewGroupParentLayout;
import o.getFirstErrorCode;
import o.getNoActiveChildannotations;
import o.getNoopState;
import o.getPackageHash;
import o.getRouternavigation_release;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0;
import o.isAdapterPositionOnScreen;
import o.isRoot;
import o.isSpecified0680j_4;
import o.isVerticalSwipeInAllowedDirection;
import o.lambda39;
import o.logBannerClicklambda0;
import o.logPushDeliverylambda1;
import o.mapTree;
import o.mapTreeWithStitching;
import o.q3ExternalSyntheticLambda1;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.relativeMoveTo;
import o.requestContentCardsRefreshlambda10;
import o.requestGeofenceRefreshlambda0;
import o.resetTransientState;
import o.safeCallFlushDelayedInitPushAnalyticsQueuelambda1;
import o.setFirstVerticalBias;
import o.setHorizontalStyle;
import o.setSdkAuthenticationSignaturelambda11;
import o.setWasCloseMessageCalled;
import o.showSystemUi;
import o.toBitmapConfig1JJdX4A;
import o.trackThirdPartySharing;
import o.transferSessionPackageI;
import o.updateAdidI;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathTimerDataStore$set$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerDataStore$set$2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.serializer = obj2;
        this.read = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerDataStore$set$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaBrowserCompatMediaItem + 69;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 28 / 0;
                }
                return createfromparcel;
            case 2:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 3:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 4:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 5:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                return ((NafathTimerDataStore$set$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 8:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 9:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 11:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 14:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 15:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 16:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 18:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 19:
                return ((NafathTimerDataStore$set$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                ((NafathTimerDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 22:
                ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            default:
                return ((NafathTimerDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.serializer;
        switch (i4) {
            case 0:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2((NafathTimerDataStore) obj3, (q3ExternalSyntheticLambda1) obj2, shortNewsContentCardView, 0);
                nafathTimerDataStore$set$2.write = obj;
                return nafathTimerDataStore$set$2;
            case 1:
                return new NafathTimerDataStore$set$2((getNoopState) this.write, (CustomerUnavailableViewModelV2) obj3, (String) obj2, shortNewsContentCardView, 1);
            case 2:
                return new NafathTimerDataStore$set$2((SlotTreeKtExternalSyntheticLambda0) this.write, (PopulateViewStructure_androidKtpopulate7) obj3, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 2);
            case 3:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$3 = new NafathTimerDataStore$set$2((String) this.write, (Integer) obj3, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 3);
                int i5 = IconCompatParcelizer + 27;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return nafathTimerDataStore$set$3;
            case 4:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$4 = new NafathTimerDataStore$set$2((PinValidationTaskUiModelImpl) obj3, (FragmentActivity) obj2, shortNewsContentCardView, 4);
                nafathTimerDataStore$set$4.write = obj;
                return nafathTimerDataStore$set$4;
            case 5:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$5 = new NafathTimerDataStore$set$2((PreferenceScreen) obj3, (getRouternavigation_release) obj2, shortNewsContentCardView, 5);
                nafathTimerDataStore$set$5.write = obj;
                int i7 = IconCompatParcelizer + 89;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return nafathTimerDataStore$set$5;
            case 6:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$6 = new NafathTimerDataStore$set$2((considerReleasingGlowsOnScroll) obj3, (String) obj2, shortNewsContentCardView, 6);
                nafathTimerDataStore$set$6.write = obj;
                return nafathTimerDataStore$set$6;
            case 7:
                return new NafathTimerDataStore$set$2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (ac) obj2, shortNewsContentCardView, 7);
            case 8:
                return new NafathTimerDataStore$set$2((requestContentCardsRefreshlambda10) this.write, (relativeMoveTo) obj3, (AndroidPreparedStatement) obj2, shortNewsContentCardView, 8);
            case 9:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$7 = new NafathTimerDataStore$set$2((PushWithAppStateDataStoreImpl) obj3, (ArrayList) obj2, shortNewsContentCardView, 9);
                nafathTimerDataStore$set$7.write = obj;
                return nafathTimerDataStore$set$7;
            case 10:
                return new NafathTimerDataStore$set$2((OtpVerificationViewModel) this.write, (String) obj3, (String) obj2, shortNewsContentCardView, 10);
            case 11:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$8 = new NafathTimerDataStore$set$2((DropShadowEffect) obj3, (ActivityHandler10) obj2, shortNewsContentCardView, 11);
                nafathTimerDataStore$set$8.write = obj;
                return nafathTimerDataStore$set$8;
            case 12:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$9 = new NafathTimerDataStore$set$2((DropShadowEffect) obj3, (String) obj2, shortNewsContentCardView, 12);
                nafathTimerDataStore$set$9.write = obj;
                return nafathTimerDataStore$set$9;
            case 13:
                return new NafathTimerDataStore$set$2((DropShadowEffect) this.write, (String) obj3, (Map) obj2, shortNewsContentCardView, 13);
            case 14:
                return new NafathTimerDataStore$set$2((getFirstErrorCode) this.write, (String) obj3, (Map) obj2, shortNewsContentCardView, 14);
            case 15:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$10 = new NafathTimerDataStore$set$2((QuestsCache) obj3, (String) obj2, shortNewsContentCardView, 15);
                nafathTimerDataStore$set$10.write = obj;
                return nafathTimerDataStore$set$10;
            case 16:
                return new NafathTimerDataStore$set$2((addDate) this.write, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, 16);
            case 17:
                return new NafathTimerDataStore$set$2((FormBody.Builder) this.write, (String) obj3, (Map) obj2, shortNewsContentCardView, 17);
            case 18:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$11 = new NafathTimerDataStore$set$2((SettingsCacheImpl) obj3, (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj2, shortNewsContentCardView, 18);
                nafathTimerDataStore$set$11.write = obj;
                return nafathTimerDataStore$set$11;
            case 19:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$12 = new NafathTimerDataStore$set$2((lambda39) obj3, (logBannerClicklambda0) obj2, shortNewsContentCardView, 19);
                nafathTimerDataStore$set$12.write = obj;
                return nafathTimerDataStore$set$12;
            case 20:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$13 = new NafathTimerDataStore$set$2((logPushDeliverylambda1) obj3, (dismissBannerlambda1) obj2, shortNewsContentCardView, 20);
                nafathTimerDataStore$set$13.write = obj;
                int i9 = IconCompatParcelizer + 117;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return nafathTimerDataStore$set$13;
            case 21:
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$14 = new NafathTimerDataStore$set$2((NafathTimerDataStore) obj3, (requestGeofenceRefreshlambda0) obj2, shortNewsContentCardView, 21);
                nafathTimerDataStore$set$14.write = obj;
                return nafathTimerDataStore$set$14;
            case 22:
                return new NafathTimerDataStore$set$2((TwoFaViewModel) this.write, (String) obj3, (String) obj2, shortNewsContentCardView, 22);
            default:
                return new NafathTimerDataStore$set$2((BlockRunner) this.write, (String) obj3, (String) obj2, shortNewsContentCardView, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x040f A[PHI: r5
  0x040f: PHI (r5v9 java.lang.Integer) = (r5v8 java.lang.Integer), (r5v10 java.lang.Integer) binds: [B:117:0x040d, B:114:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0415  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        findParameters findparameters;
        mapTreeWithStitching maptreewithstitching;
        ComposeAnimationState composeAnimationState;
        List list;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.read;
        Object obj6 = this.serializer;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i2) {
            case 0:
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NafathTimerDataStore nafathTimerDataStore = (NafathTimerDataStore) obj6;
                isRoot isroot = nafathTimerDataStore.RemoteActionCompatParcelizer;
                resetTransientState resettransientstate = (resetTransientState) nafathTimerDataStore.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                backwardfocussearch.write(isroot, resettransientstate.RemoteActionCompatParcelizer(q3ExternalSyntheticLambda1.Companion.serializer(), (q3ExternalSyntheticLambda1) obj5));
                return createfromparcel;
            case 1:
                String str2 = (String) obj5;
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = (CustomerUnavailableViewModelV2) obj6;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getNoopState getnoopstate = (getNoopState) this.write;
                if (getnoopstate instanceof showSystemUi) {
                    customerUnavailableViewModelV2.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV2), null, null, new ReconnectScheduler$schedule$1(customerUnavailableViewModelV2, (showSystemUi) getnoopstate, str2, null, 2), 3);
                    return createfromparcel;
                }
                if (getnoopstate instanceof CompositionDataTree) {
                    customerUnavailableViewModelV2.MediaSessionCompatQueueItem.read(customerUnavailableViewModelV2.MediaMetadataCompat.RemoteActionCompatParcelizer(((Long) CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{customerUnavailableViewModelV2}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue()));
                    return createfromparcel;
                }
                if (getnoopstate instanceof mapTree) {
                    int i4 = IconCompatParcelizer + 3;
                    MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    customerUnavailableViewModelV2.MediaSessionCompatQueueItem.read(customerUnavailableViewModelV2.MediaMetadataCompat.RemoteActionCompatParcelizer(((Long) CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{customerUnavailableViewModelV2}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue()));
                    return createfromparcel;
                }
                if (getnoopstate instanceof UnsupportedSearchInfo) {
                    customerUnavailableViewModelV2.read(str2, true);
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV2), null, null, new ReconnectScheduler$schedule$1((UnsupportedSearchInfo) getnoopstate, customerUnavailableViewModelV2, str2, null, 1), 3);
                    return createfromparcel;
                }
                if (getnoopstate instanceof findParameters) {
                    customerUnavailableViewModelV2.ComponentActivity.serializer(new findAnimatable(((findParameters) getnoopstate).url, str2));
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0 = (SlotTreeKtExternalSyntheticLambda0) this.write;
                invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = slotTreeKtExternalSyntheticLambda0.currentState;
                if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getPackageHash) {
                    int i6 = IconCompatParcelizer + 37;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0.getClass();
                    ((PopulateViewStructure_androidKtpopulate7) obj6).setValue(((getPackageHash) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).scannedCode);
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1 = slotTreeKtExternalSyntheticLambda0.currentState;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1.getClass();
                    ((PopulateViewStructure_androidKtpopulate7) obj5).setValue(((getPackageHash) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1).scannedCode);
                }
                return createfromparcel;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((String) this.write) == null) {
                    int i8 = MediaBrowserCompatMediaItem + 7;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        num = (Integer) obj6;
                        int i9 = 40 / 0;
                        if (num != null) {
                            if (num.intValue() >= 1) {
                                ((PopulateViewStructure_androidKtpopulate7) obj5).setValue(Boolean.TRUE);
                            }
                        }
                    } else {
                        num = (Integer) obj6;
                        if (num != null) {
                            if (num.intValue() >= 1) {
                                ((PopulateViewStructure_androidKtpopulate7) obj5).setValue(Boolean.TRUE);
                            }
                        }
                    }
                }
                return createfromparcel;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl = (PinValidationTaskUiModelImpl) obj6;
                Object obj7 = pinValidationTaskUiModelImpl.ParcelableVolumeInfo.read();
                isSpecified0680j_4 isspecified0680j_4 = obj7 instanceof isSpecified0680j_4 ? (isSpecified0680j_4) obj7 : null;
                if (isspecified0680j_4 != null) {
                    apiLevel apilevel = isspecified0680j_4.RemoteActionCompatParcelizer.offlineValidation;
                    C0212wallpaper c0212wallpaper = apilevel != null ? apilevel.pinAttempts : null;
                    if (c0212wallpaper != null && (list = c0212wallpaper.trackingEvents) != null) {
                        pinValidationTaskUiModelImpl.PlaybackStateCompat.read(list, Trigger.BUTTON_CLICK, SimpleItemTouchHelperCallback.serializer);
                    }
                    getNoopState getnoopstate2 = (c0212wallpaper == null || (maptreewithstitching = c0212wallpaper.errorMessage) == null || (composeAnimationState = maptreewithstitching.button) == null) ? null : composeAnimationState.actionData;
                    if (getnoopstate2 instanceof findParameters) {
                        int i10 = IconCompatParcelizer + 45;
                        MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            findparameters = (findParameters) getnoopstate2;
                            int i11 = 46 / 0;
                        } else {
                            findparameters = (findParameters) getnoopstate2;
                        }
                    } else {
                        findparameters = null;
                    }
                    String str3 = findparameters != null ? findparameters.url : null;
                    if (str3 != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) obj5;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
                        intent.setPackage(fragmentActivity.getPackageName());
                        try {
                            fragmentActivity.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "PinValidationTaskUiModelImpl: The provided contact dispatcher link is invalid - " + intent, new Object[0]);
                        }
                    } else {
                        Timber.RemoteActionCompatParcelizer.read("PinValidationTaskUiModelImpl: The contact dispatcher link is not available in the payload", new Object[0]);
                    }
                    break;
                }
                return createfromparcel;
            case 5:
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.write;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj6;
                getRouternavigation_release getrouternavigation_release = (getRouternavigation_release) obj5;
                Iterator it = preferenceScreen.read.iterator();
                while (it.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ReconnectScheduler$schedule$1((decryptAndGetPasswordBWLJW6A) it.next(), getrouternavigation_release, preferenceScreen, null, 10), 3);
                }
                return createfromparcel;
            case 6:
                getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.write;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                considerReleasingGlowsOnScroll considerreleasingglowsonscroll = (considerReleasingGlowsOnScroll) obj6;
                backwardfocussearchIconCompatParcelizer.write(considerreleasingglowsonscroll.IconCompatParcelizer, (String) obj5);
                isRoot isroot2 = considerreleasingglowsonscroll.write;
                Integer num2 = (Integer) getnoactivechildannotations.serializer(isroot2);
                backwardfocussearchIconCompatParcelizer.serializer(isroot2, new Integer((num2 != null ? num2.intValue() : -1) + 1));
                return backwardfocussearchIconCompatParcelizer;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write).invoke();
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6).invoke(((ad) ((ac) obj5)).RemoteActionCompatParcelizer);
                return createfromparcel;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                requestContentCardsRefreshlambda10 requestcontentcardsrefreshlambda10 = (requestContentCardsRefreshlambda10) this.write;
                getArgCount getargcount = (getArgCount) ((AndroidPreparedStatement) obj5);
                String str4 = getargcount.serializer;
                String str5 = getargcount.read;
                String str6 = getargcount.RemoteActionCompatParcelizer;
                ((safeCallFlushDelayedInitPushAnalyticsQueuelambda1) requestcontentcardsrefreshlambda10).getClass();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                StringBuilder sb = new StringBuilder("two-fa/");
                c8$$ExternalSyntheticOutline0.m(sb, str4, "/", str5, "/");
                sb.append(str6);
                relativeMoveTo.IconCompatParcelizer((relativeMoveTo) obj6, sb.toString(), null, 6);
                return createfromparcel;
            case 9:
                backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                isRoot isroot3 = ((PushWithAppStateDataStoreImpl) obj6).write;
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                backwardfocussearch2.write(isroot3, isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(gdprForgetMeI.Companion.serializer(), 0), (ArrayList) obj5));
                return createfromparcel;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                OtpVerificationViewModel otpVerificationViewModel = (OtpVerificationViewModel) this.write;
                String str7 = (String) obj6;
                otpVerificationViewModel.getClass();
                MutableStateFlow mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
                do {
                    obj2 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, trackThirdPartySharing.write((trackThirdPartySharing) obj2, null, str7, null, null, null, false, null, false, 507)));
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(otpVerificationViewModel), null, null, new OtpVerificationViewModel$onPinChanged$2(otpVerificationViewModel, str7, objArr == true ? 1 : 0, i3), 3);
                String str8 = (String) obj5;
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, trackThirdPartySharing.write((trackThirdPartySharing) obj3, null, null, str8, null, null, false, null, false, 503)));
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(otpVerificationViewModel), null, null, new OtpVerificationViewModel$triggerOtp$1(otpVerificationViewModel, null), 3);
                return createfromparcel;
            case 11:
                backwardFocusSearch backwardfocussearch3 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DropShadowEffect dropShadowEffect = (DropShadowEffect) obj6;
                isRoot isroot4 = (isRoot) dropShadowEffect.serializer;
                resetTransientState resettransientstate2 = (resetTransientState) ((isAdapterPositionOnScreen) dropShadowEffect.write).MediaSessionCompatResultReceiverWrapper();
                resettransientstate2.getClass();
                backwardfocussearch3.write(isroot4, resettransientstate2.RemoteActionCompatParcelizer(ActivityHandler10.Companion.serializer(), (ActivityHandler10) obj5));
                return createfromparcel;
            case 12:
                backwardFocusSearch backwardfocussearch4 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch4.write((isRoot) ((DropShadowEffect) obj6).MediaDescriptionCompat, (String) obj5);
                return createfromparcel;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((decode) ((DropShadowEffect) this.write).read).logEvent((String) obj6, (Map) obj5);
                return createfromparcel;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((getFirstErrorCode) this.write).serializer.logEvent((String) obj6, (Map) obj5);
                return createfromparcel;
            case 15:
                backwardFocusSearch backwardfocussearch5 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch5.write();
                backwardfocussearch5.write(((QuestsCache) obj6).RemoteActionCompatParcelizer, (String) obj5);
                return createfromparcel;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i12 = buildDeeplinkSdkClickPackage.RemoteActionCompatParcelizer[((addDate) this.write).MediaSessionCompatQueueItem.ordinal()];
                if (i12 != 1) {
                    int i13 = IconCompatParcelizer + 105;
                    int i14 = i13 % Fields.SpotShadowColor;
                    MediaBrowserCompatMediaItem = i14;
                    int i15 = i13 % 2;
                    if (i12 != 2) {
                        if (i12 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i16 = i14 + 123;
                        IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 == 0) {
                            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5).invoke();
                            return createfromparcel;
                        }
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5).invoke();
                        (objArr2 == true ? 1 : 0).hashCode();
                        throw null;
                    }
                }
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6).invoke();
                return createfromparcel;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((decode) ((FormBody.Builder) this.write).serializer).logEvent((String) obj6, (Map) obj5);
                return createfromparcel;
            case 18:
                backwardFocusSearch backwardfocussearch6 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SettingsCacheImpl settingsCacheImpl = (SettingsCacheImpl) obj6;
                settingsCacheImpl.getClass();
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                isverticalswipeinalloweddirection2.getClass();
                backwardfocussearch6.write(settingsCacheImpl.IconCompatParcelizer, isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao.Companion.serializer(), (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj5));
                return createfromparcel;
            case 19:
                getNoActiveChildannotations getnoactivechildannotations2 = (getNoActiveChildannotations) this.write;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardFocusSearch backwardfocussearchIconCompatParcelizer2 = getnoactivechildannotations2.IconCompatParcelizer();
                lambda39 lambda39Var = (lambda39) obj6;
                logBannerClicklambda0 logbannerclicklambda0 = (logBannerClicklambda0) obj5;
                backwardfocussearchIconCompatParcelizer2.write(lambda39Var.serializer, logbannerclicklambda0.serializer);
                backwardfocussearchIconCompatParcelizer2.write(lambda39Var.MediaBrowserCompatMediaItem, logbannerclicklambda0.IconCompatParcelizer);
                backwardfocussearchIconCompatParcelizer2.write(lambda39Var.read, logbannerclicklambda0.read);
                backwardfocussearchIconCompatParcelizer2.write(lambda39Var.RemoteActionCompatParcelizer, logbannerclicklambda0.write);
                return backwardfocussearchIconCompatParcelizer2;
            case 20:
                backwardFocusSearch backwardfocussearch7 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) obj6;
                isRoot isroot5 = logpushdeliverylambda1.write;
                logpushdeliverylambda1.getClass();
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection3 = resetTransientState.read;
                isverticalswipeinalloweddirection3.getClass();
                backwardfocussearch7.write(isroot5, isverticalswipeinalloweddirection3.RemoteActionCompatParcelizer(dismissBannerlambda1.Companion.serializer(), (dismissBannerlambda1) obj5));
                return createfromparcel;
            case 21:
                backwardFocusSearch backwardfocussearch8 = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NafathTimerDataStore nafathTimerDataStore2 = (NafathTimerDataStore) obj6;
                isRoot isroot6 = nafathTimerDataStore2.RemoteActionCompatParcelizer;
                resetTransientState resettransientstate3 = (resetTransientState) nafathTimerDataStore2.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                resettransientstate3.getClass();
                backwardfocussearch8.write(isroot6, resettransientstate3.RemoteActionCompatParcelizer(requestGeofenceRefreshlambda0.Companion.serializer(), (requestGeofenceRefreshlambda0) obj5));
                return createfromparcel;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TwoFaViewModel twoFaViewModel = (TwoFaViewModel) this.write;
                String str9 = (String) obj6;
                twoFaViewModel.getClass();
                MutableStateFlow mutableStateFlow2 = twoFaViewModel.RemoteActionCompatParcelizer;
                do {
                    obj4 = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj4, setSdkAuthenticationSignaturelambda11.RemoteActionCompatParcelizer((setSdkAuthenticationSignaturelambda11) obj4, null, str9, null, false, null, 59)));
                twoFaViewModel.serializer = (String) obj5;
                twoFaViewModel.read();
                return createfromparcel;
            default:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BlockRunner blockRunner = (BlockRunner) this.write;
                String str10 = (String) obj5;
                BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = (BrazeCompanionExternalSyntheticLambda21) blockRunner.RemoteActionCompatParcelizer;
                accessgetOldDependencyp accessgetolddependencyp = (accessgetOldDependencyp) blockRunner.read;
                brazeCompanionExternalSyntheticLambda21.getClass();
                Uri.Builder builderBuildUpon = Uri.parse((String) obj6).buildUpon();
                builderBuildUpon.getClass();
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("manual_run", "true");
                builderAppendQueryParameter.getClass();
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) blockRunner.IconCompatParcelizer);
                firebaseRemoteConfigImpl.getClass();
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_REMOVE_TOKEN_WEBPAGE_QUERY)) {
                    builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("token", str10);
                    builderAppendQueryParameter.getClass();
                }
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) accessgetolddependencyp;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("brand", getstyleable_vector_drawable_path_trim_path_offset.MediaSessionCompatQueueItem);
                builderAppendQueryParameter2.getClass();
                if (((setHorizontalStyle) blockRunner.write).RemoteActionCompatParcelizer()) {
                    if (((ConstraintReferenceIncorrectConstraintException) ((setFirstVerticalBias) blockRunner.RatingCompat)).write()) {
                        int i17 = IconCompatParcelizer + 97;
                        MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        str = "dark";
                    } else {
                        str = "light";
                    }
                    builderAppendQueryParameter2 = builderAppendQueryParameter2.appendQueryParameter("ui_mode", str);
                    builderAppendQueryParameter2.getClass();
                }
                String string = builderAppendQueryParameter2.build().toString();
                string.getClass();
                return new BrazeExternalSyntheticLambda11(string, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("javascript:window.runApp(\"", str10, "\", \"", getstyleable_vector_drawable_path_trim_path_offset.MediaSessionCompatQueueItem, "\");"));
        }
    }
}
