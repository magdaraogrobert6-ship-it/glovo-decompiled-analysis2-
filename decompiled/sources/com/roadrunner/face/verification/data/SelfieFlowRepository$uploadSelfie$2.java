package com.roadrunner.face.verification.data;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.custom.password.presentation.CustomPasswordViewModel;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidViewHolderlayoutNode12;
import o.ConstraintSet;
import o.InAppMessageHtmlBaseView;
import o.ShortNewsContentCardView;
import o.a9;
import o.createFromParcel;
import o.findFocusableNodeFromRectui;
import o.getInAppMessageEventMap;
import o.getQueryContext;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.invalidateCallbacksFor;
import o.isDescendantOfui;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.sendKeyEvent;
import o.setApplicationContext;
import o.setBackgroundRPmYEkk;
import o.setFontSizeKmRG4DE;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowRepository$uploadSelfie$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelfieFlowRepository$uploadSelfie$2(Object obj, Object obj2, Object obj3, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.serializer = z;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            return ((SelfieFlowRepository$uploadSelfie$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((SelfieFlowRepository$uploadSelfie$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 2) {
            return ((SelfieFlowRepository$uploadSelfie$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SelfieFlowRepository$uploadSelfie$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaBrowserCompatMediaItem + 43;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.MediaDescriptionCompat;
        if (i2 == 0) {
            SelfieFlowRepository$uploadSelfie$2 selfieFlowRepository$uploadSelfie$2 = new SelfieFlowRepository$uploadSelfie$2((SelfieFlowRepository) obj3, (IdentityVerificationParams) obj2, (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) obj, this.serializer, shortNewsContentCardView, 0);
            int i3 = MediaBrowserCompatMediaItem + 59;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return selfieFlowRepository$uploadSelfie$2;
        }
        if (i2 == 1) {
            return new SelfieFlowRepository$uploadSelfie$2((CustomPasswordViewModel) obj3, (String) obj2, (String) obj, this.serializer, shortNewsContentCardView, 1);
        }
        if (i2 == 2) {
            return new SelfieFlowRepository$uploadSelfie$2((ReportPictureUseCase) obj3, (String) obj2, (String) obj, this.serializer, shortNewsContentCardView, 2);
        }
        SelfieFlowRepository$uploadSelfie$2 selfieFlowRepository$uploadSelfie$3 = new SelfieFlowRepository$uploadSelfie$2((InitializeAppStartupItemsImpl) obj3, (AndroidViewHolderlayoutNode12) obj2, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj, this.serializer, shortNewsContentCardView, 3);
        int i5 = MediaBrowserCompatMediaItem + 5;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return selfieFlowRepository$uploadSelfie$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objM3951invokeyxL6bBk;
        Object obj3;
        MutableStateFlow mutableStateFlow;
        Object obj4;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        boolean z = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.RemoteActionCompatParcelizer;
        Object obj6 = this.read;
        Object obj7 = this.MediaDescriptionCompat;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 != 0) {
                int i4 = MediaSessionCompatQueueItem + 5;
                int i5 = i4 % Fields.SpotShadowColor;
                MediaBrowserCompatMediaItem = i5;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = i5 + 113;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SelfieFlowRepository selfieFlowRepository = (SelfieFlowRepository) obj7;
            IdentityVerificationParams identityVerificationParams = (IdentityVerificationParams) obj6;
            r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri = (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) obj5;
            this.write = 1;
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = SQLite.write(ConstantKt.CONTENT_TYPE_JSON);
                int i8 = MediaSessionCompatQueueItem + 67;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } catch (IllegalArgumentException unused) {
            }
            ConstraintSet constraintSet = selfieFlowRepository.IconCompatParcelizer;
            r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = RequestBody.Companion;
            String str = identityVerificationParams.serializer;
            r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
            Object objRemoteActionCompatParcelizer = constraintSet.RemoteActionCompatParcelizer(r8lambdacteglfiy2n5eeyl50py32ciczri, r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str, inAppMessageHtmlBaseViewWrite), r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(identityVerificationParams.write, inAppMessageHtmlBaseViewWrite), this.serializer, null, identityVerificationParams.read, this);
            if (objRemoteActionCompatParcelizer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objRemoteActionCompatParcelizer = createfromparcel;
            }
            return objRemoteActionCompatParcelizer == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.write;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setBackgroundRPmYEkk setbackgroundrpmyekk = (setBackgroundRPmYEkk) ((InitializeAppStartupItemsImpl) obj7).IconCompatParcelizer;
                setFontSizeKmRG4DE setfontsizekmrg4de = new setFontSizeKmRG4DE((AndroidViewHolderlayoutNode12) obj6, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj5);
                this.write = 1;
                Object objIconCompatParcelizer = setbackgroundrpmyekk.IconCompatParcelizer(setfontsizekmrg4de, z, this);
                if (objIconCompatParcelizer != coroutineSingletons2) {
                    return objIconCompatParcelizer;
                }
                int i11 = MediaSessionCompatQueueItem + 91;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    return coroutineSingletons2;
                }
                int i12 = 52 / 0;
                return coroutineSingletons2;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.write;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                sendKeyEvent sendkeyevent = new sendKeyEvent((String) obj5, z);
                this.write = 1;
                if (((ReportPictureUseCase) obj7).serializer.RemoteActionCompatParcelizer((String) obj6, sendkeyevent, this) != coroutineSingletons3) {
                    return createfromparcel;
                }
                int i14 = MediaBrowserCompatMediaItem + 119;
                MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return coroutineSingletons3;
            }
            int i16 = MediaBrowserCompatMediaItem + 61;
            int i17 = i16 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i17;
            int i18 = i16 % 2;
            if (i13 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i19 = i17 + 95;
            MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        String str2 = (String) obj6;
        CustomPasswordViewModel customPasswordViewModel = (CustomPasswordViewModel) obj7;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i21 = this.write;
        if (i21 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow2 = customPasswordViewModel.IconCompatParcelizer;
            do {
                obj2 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, invalidateCallbacksFor.read((invalidateCallbacksFor) obj2, null, false, null, true, 7)));
            insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy = customPasswordViewModel.write.RemoteActionCompatParcelizer;
            this.write = 1;
            objM3951invokeyxL6bBk = customPasswordViewModel.serializer.m3951invokeyxL6bBk(str2, (String) obj5, this.serializer, insertorupdatetransformednodesubhierarchy, this);
            if (objM3951invokeyxL6bBk == coroutineSingletons4) {
                int i22 = MediaSessionCompatQueueItem + 109;
                MediaBrowserCompatMediaItem = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    return coroutineSingletons4;
                }
                inAppMessageHtmlBaseViewWrite.hashCode();
                throw null;
            }
        } else {
            if (i21 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM3951invokeyxL6bBk = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM3951invokeyxL6bBk instanceof isItemDismissable)) {
            int i23 = MediaBrowserCompatMediaItem + 45;
            MediaSessionCompatQueueItem = i23 % Fields.SpotShadowColor;
            if (i23 % 2 != 0) {
                mutableStateFlow = customPasswordViewModel.IconCompatParcelizer;
                int i24 = 18 / 0;
            } else {
                mutableStateFlow = customPasswordViewModel.IconCompatParcelizer;
            }
            do {
                obj4 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj4, invalidateCallbacksFor.read((invalidateCallbacksFor) obj4, null, false, null, false, 7)));
            customPasswordViewModel.MediaDescriptionCompat.serializer(new isDescendantOfui(str2));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM3951invokeyxL6bBk);
        if (thSerializer == null) {
            return createfromparcel;
        }
        MutableStateFlow mutableStateFlow3 = customPasswordViewModel.IconCompatParcelizer;
        do {
            obj3 = mutableStateFlow3.read();
        } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj3, invalidateCallbacksFor.read((invalidateCallbacksFor) obj3, null, false, null, false, 7)));
        getQueryContext getquerycontext = customPasswordViewModel.MediaDescriptionCompat;
        a9 a9Var = customPasswordViewModel.read;
        a9Var.getClass();
        String localizedMessage = thSerializer.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = a9Var.read.getString(R.string.all_error_message);
            localizedMessage.getClass();
        }
        getquerycontext.serializer(new findFocusableNodeFromRectui(new setApplicationContext(localizedMessage, null, null, 6)));
        return createfromparcel;
    }
}
