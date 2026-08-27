package com.deliveryhero.perseus.logger;

import android.content.Context;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender;
import com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.pickupdropoff.tasks.data.MergedTaskStateRepositoryImpl$getMergedState$2;
import com.roadrunner.login.domain.auth.DoPostLoginOperations;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import o.AndroidPathMeasure;
import o.AuthenticatorUtils;
import o.KeepScreenOnNode;
import o.LineBreakWordBreak;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.TextAnnouncementContentCardView;
import o.TextUnitTypeCompanion;
import o.accessisRenderNodeCompatiblecp;
import o.afExternalSyntheticLambda3;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getInputTextSuggestionState;
import o.getLogoDescription;
import o.getNormalNSsRyOo;
import o.getRootInfoui;
import o.getStrictusljTpc;
import o.getTextSelectionRange;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isItemDismissable;
import o.onItemDismiss;
import o.populate;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeScheduledCallback;
import o.setNavigationOnClickListener;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusLogger$e$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(TextLayoutResult textLayoutResult, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, AnnotatedString annotatedString, ShortNewsContentCardView shortNewsContentCardView, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        super(2, shortNewsContentCardView);
        this.read = 20;
        this.write = textLayoutResult;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = annotatedString;
        this.MediaMetadataCompat = populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender, String str, Expected expected, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 11;
        this.RemoteActionCompatParcelizer = routeLineHistoryRecordingViewSender;
        this.serializer = str;
        this.MediaMetadataCompat = expected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(removeScheduledCallback removescheduledcallback, WebViewManager webViewManager, String str, TextUnitTypeCompanion textUnitTypeCompanion, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 13;
        this.serializer = removescheduledcallback;
        this.RemoteActionCompatParcelizer = webViewManager;
        this.write = str;
        this.MediaMetadataCompat = textUnitTypeCompanion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(LoginActivityViewModel loginActivityViewModel, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 18;
        this.MediaMetadataCompat = loginActivityViewModel;
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$e$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.RemoteActionCompatParcelizer = obj4;
        this.MediaMetadataCompat = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$e$1(Object obj, Object obj2, Object obj3, Object obj4, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = obj;
        this.serializer = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.MediaMetadataCompat = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$e$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.MediaMetadataCompat = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$e$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.MediaMetadataCompat = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusLogger$e$1(Object obj, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.MediaMetadataCompat = obj;
        this.write = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(String str, String str2, OtpViewModel otpViewModel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 19;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = otpViewModel;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusLogger$e$1(Throwable th, String str, String str2, PerseusLogger perseusLogger, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 0;
        this.RemoteActionCompatParcelizer = th;
        this.write = str;
        this.serializer = str2;
        this.MediaMetadataCompat = perseusLogger;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    private final Object invokeSuspend$com$roadrunner$login$presentation$LoginActivityViewModel$verifyCustomPasswordMagicLink$1(Object obj) throws Throwable {
        Object objM4872invoke0E7RQCE;
        Object obj2;
        LoginActivityViewModel loginActivityViewModel;
        Throwable thSerializer;
        int i = 2 % 2;
        int i2 = 27;
        int i3 = MediaDescriptionCompat + 27;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        LoginActivityViewModel loginActivityViewModel2 = (LoginActivityViewModel) this.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getInputTextSuggestionState getinputtextsuggestionstatePlaybackStateCompat = LoginActivityViewModel.PlaybackStateCompat(loginActivityViewModel2);
            String str = (String) this.IconCompatParcelizer;
            String str2 = (String) this.write;
            this.MediaSessionCompatQueueItem = 1;
            objM4872invoke0E7RQCE = ((VerifyMagicLinkUseCaseImpl) getinputtextsuggestionstatePlaybackStateCompat).m4872invoke0E7RQCE(str, str2, this);
            if (objM4872invoke0E7RQCE != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4872invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            if (i4 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = RatingCompat + 47;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            loginActivityViewModel = (LoginActivityViewModel) this.RemoteActionCompatParcelizer;
            obj2 = this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        LoginActivityViewModel.write(loginActivityViewModel, null, insertOrUpdateTransformedNodeSubhierarchy.MAGIC_LINK);
        objM4872invoke0E7RQCE = obj2;
        thSerializer = onItemDismiss.serializer(objM4872invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to verify the magic link", new Object[0]);
            afExternalSyntheticLambda3 afexternalsyntheticlambda3Write = LoginActivityViewModel.write(loginActivityViewModel2);
            afexternalsyntheticlambda3Write.getClass();
            LoginActivityViewModel.RemoteActionCompatParcelizer(loginActivityViewModel2, afexternalsyntheticlambda3Write.write.write(thSerializer, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(i2)));
        }
        return createFromParcel.INSTANCE;
        if (!(objM4872invoke0E7RQCE instanceof isItemDismissable)) {
            ((getRootInfoui) LoginActivityViewModel.MediaDescriptionCompat(loginActivityViewModel2).write).serializer("login_manual_login");
            DoPostLoginOperations doPostLoginOperations = LoginActivityViewModel.read(loginActivityViewModel2);
            this.serializer = objM4872invoke0E7RQCE;
            this.RemoteActionCompatParcelizer = loginActivityViewModel2;
            this.MediaSessionCompatQueueItem = 2;
            if (doPostLoginOperations.invoke((getTextSelectionRange) objM4872invoke0E7RQCE, "Verified magic link", this) != coroutineSingletons2) {
                obj2 = objM4872invoke0E7RQCE;
                loginActivityViewModel = loginActivityViewModel2;
                LoginActivityViewModel.write(loginActivityViewModel, null, insertOrUpdateTransformedNodeSubhierarchy.MAGIC_LINK);
                objM4872invoke0E7RQCE = obj2;
            }
            return coroutineSingletons2;
        }
        thSerializer = onItemDismiss.serializer(objM4872invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to verify the magic link", new Object[0]);
            afExternalSyntheticLambda3 afexternalsyntheticlambda3Write2 = LoginActivityViewModel.write(loginActivityViewModel2);
            afexternalsyntheticlambda3Write2.getClass();
            LoginActivityViewModel.RemoteActionCompatParcelizer(loginActivityViewModel2, afexternalsyntheticlambda3Write2.write.write(thSerializer, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(i2)));
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 1:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 2:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                return ((PerseusLogger$e$1) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 4:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 5:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 6:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 7:
                return ((PerseusLogger$e$1) create((Flow) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 8:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 9:
                Object objInvokeSuspend = ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = RatingCompat + 71;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            case 10:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 11:
                return ((PerseusLogger$e$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 12:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 13:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 14:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 15:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 16:
                Object objInvokeSuspend2 = ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i6 = MediaDescriptionCompat + 113;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return objInvokeSuspend2;
                }
                throw null;
            case 17:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 18:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 19:
                return ((PerseusLogger$e$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            default:
                return ((PerseusLogger$e$1) create((PointerInputScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        Object obj2 = this.MediaMetadataCompat;
        switch (i3) {
            case 0:
                return new PerseusLogger$e$1((Throwable) this.RemoteActionCompatParcelizer, (String) this.write, (String) this.serializer, (PerseusLogger) obj2, shortNewsContentCardView);
            case 1:
                return new PerseusLogger$e$1((SeekableTransitionState) this.serializer, this.RemoteActionCompatParcelizer, (Transition) obj2, shortNewsContentCardView, 1);
            case 2:
                PerseusLogger$e$1 perseusLogger$e$1 = new PerseusLogger$e$1((PointerInputScope) this.write, (MergedTaskStateRepositoryImpl$getMergedState$2) this.serializer, (SelectionMagnifierKt) this.RemoteActionCompatParcelizer, (PressGestureScopeImpl) obj2, shortNewsContentCardView, 2);
                perseusLogger$e$1.IconCompatParcelizer = obj;
                return perseusLogger$e$1;
            case 3:
                PerseusLogger$e$1 perseusLogger$e$2 = new PerseusLogger$e$1((TrackpadScrollingLogic) this.serializer, (ScrollingLogic) this.RemoteActionCompatParcelizer, (createInAppMessageEventSubscriber) obj2, shortNewsContentCardView, 3);
                perseusLogger$e$2.write = obj;
                return perseusLogger$e$2;
            case 4:
                return new PerseusLogger$e$1((LegacyTextFieldState) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) this.write, (TextInputService) this.serializer, (TextFieldSelectionManager) this.RemoteActionCompatParcelizer, (ImeOptions) obj2, shortNewsContentCardView, 4);
            case 5:
                return new PerseusLogger$e$1((BringIntoViewRequesterImpl) this.IconCompatParcelizer, (TextFieldValue) this.write, (LegacyTextFieldState) this.serializer, (TextLayoutResultProxy) this.RemoteActionCompatParcelizer, (OffsetMapping) obj2, shortNewsContentCardView, 5);
            case 6:
                PerseusLogger$e$1 perseusLogger$e$3 = new PerseusLogger$e$1((PlatformTextInputSession) this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer, (getNormalNSsRyOo) this.RemoteActionCompatParcelizer, (KeepScreenOnNode) obj2, shortNewsContentCardView, 6);
                perseusLogger$e$3.IconCompatParcelizer = obj;
                int i4 = RatingCompat + 121;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return perseusLogger$e$3;
            case 7:
                PerseusLogger$e$1 perseusLogger$e$4 = new PerseusLogger$e$1((AndroidPathMeasure) this.write, (PopulateViewStructure_androidKtpopulate7) this.serializer, (populate) this.RemoteActionCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 7);
                perseusLogger$e$4.IconCompatParcelizer = obj;
                int i6 = RatingCompat + 79;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return perseusLogger$e$4;
            case 8:
                return new PerseusLogger$e$1((PerseusSaveHitUseCase) this.write, (Map) this.serializer, (List) this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView, 8);
            case 9:
                PerseusLogger$e$1 perseusLogger$e$5 = new PerseusLogger$e$1((com.deliveryhero.selfServiceChat.ui.WebViewManager) this.serializer, (MainActivity) this.RemoteActionCompatParcelizer, (ArrayList) obj2, shortNewsContentCardView, 9);
                perseusLogger$e$5.write = obj;
                return perseusLogger$e$5;
            case 10:
                return new PerseusLogger$e$1((MapboxNavigation) this.RemoteActionCompatParcelizer, (RoutesObserver) obj2, shortNewsContentCardView, 10);
            case 11:
                return new PerseusLogger$e$1((RouteLineHistoryRecordingViewSender) this.RemoteActionCompatParcelizer, (String) this.serializer, (Expected) obj2, shortNewsContentCardView);
            case 12:
                return new PerseusLogger$e$1(obj2, (String) this.write, shortNewsContentCardView, 12);
            case 13:
                return new PerseusLogger$e$1((removeScheduledCallback) this.serializer, (WebViewManager) this.RemoteActionCompatParcelizer, (String) this.write, (TextUnitTypeCompanion) obj2, shortNewsContentCardView);
            case 14:
                return new PerseusLogger$e$1((TurnByTurnNavigationLogger) this.RemoteActionCompatParcelizer, (getStrictusljTpc) obj2, shortNewsContentCardView, 14);
            case 15:
                return new PerseusLogger$e$1(obj2, (String) this.write, shortNewsContentCardView, 15);
            case 16:
                return new PerseusLogger$e$1((TurnByTurnNavigationLogger) this.RemoteActionCompatParcelizer, (LineBreakWordBreak) obj2, shortNewsContentCardView, 16);
            case 17:
                return new PerseusLogger$e$1((Context) this.IconCompatParcelizer, (accessisRenderNodeCompatiblecp) this.write, (getLogoDescription) this.serializer, (AuthenticatorUtils) this.RemoteActionCompatParcelizer, (setNavigationOnClickListener) obj2, shortNewsContentCardView, 17);
            case 18:
                return new PerseusLogger$e$1((LoginActivityViewModel) obj2, (String) this.IconCompatParcelizer, (String) this.write, shortNewsContentCardView);
            case 19:
                return new PerseusLogger$e$1((String) this.IconCompatParcelizer, (String) this.write, (OtpViewModel) this.RemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView);
            default:
                PerseusLogger$e$1 perseusLogger$e$6 = new PerseusLogger$e$1((TextLayoutResult) this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer, (AnnotatedString) this.RemoteActionCompatParcelizer, shortNewsContentCardView, (PopulateViewStructure_androidKtpopulate7) obj2);
                perseusLogger$e$6.IconCompatParcelizer = obj;
                return perseusLogger$e$6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:384:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:386:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:387:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:390:0x092d  */
    /* JADX WARN: Code duplicated, block: B:391:0x095a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:445:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:447:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:449:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:451:0x0afd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:452:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:453:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:456:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:458:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:459:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:461:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:462:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:467:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:471:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:473:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:478:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:586:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:387:0x08f7 -> B:388:0x08f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.logger.PerseusLogger$e$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
