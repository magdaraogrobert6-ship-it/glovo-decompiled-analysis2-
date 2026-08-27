package com.roadrunner.rider.recruitment.accountcreation.otp_verification;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetOtpVerificationRequestId;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.BrazeExternalSyntheticLambda28;
import o.RectListDebuggerModifierNode;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.trackThirdPartySharing;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationViewModel extends ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final FormBody.Builder MediaBrowserCompatMediaItem;
    public final BrazeExternalSyntheticLambda28 MediaDescriptionCompat;
    public final getQueryContext MediaMetadataCompat;
    public final GetOtpVerificationRequestId MediaSessionCompatQueueItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final DropShadowEffect PlaybackStateCompatCustomAction;
    public final setTransactionSuccessful RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final GetOtpVerificationRequestId read;
    public int serializer;
    public final NetworkBody write;

    /* JADX INFO: renamed from: com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;
        public final /* synthetic */ OtpVerificationViewModel IconCompatParcelizer;
        public int read;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(OtpVerificationViewModel otpVerificationViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = otpVerificationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = 1;
            int i3 = serializer + 1;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i4 = this.write;
            OtpVerificationViewModel otpVerificationViewModel = this.IconCompatParcelizer;
            if (i4 == 0) {
                return new AnonymousClass1(otpVerificationViewModel, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(otpVerificationViewModel, shortNewsContentCardView, i2);
            int i5 = serializer + 93;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return anonymousClass1;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 65;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = RemoteActionCompatParcelizer + 55;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            int i2 = this.write;
            OtpVerificationViewModel otpVerificationViewModel = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.read;
                if (i3 != 0) {
                    int i4 = serializer + 77;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    if (i3 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CountDownTimerUiModel countDownTimerUiModel = (CountDownTimerUiModel) otpVerificationViewModel.PlaybackStateCompatCustomAction.read;
                StateFlow stateFlow = countDownTimerUiModel.write.serializer;
                RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(8, otpVerificationViewModel);
                this.read = 1;
                Object objCollect = stateFlow.collect(new CountDownTimerUiModel$observeTimerState$$inlined$map$1.AnonymousClass2(anonymousClass1, countDownTimerUiModel, R.string.two_factor_auth_request_again_in), this);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objCollect = createfromparcel;
                }
                return objCollect == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.read;
            if (i6 != 0) {
                int i7 = serializer + 13;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i9 = serializer + 85;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                GetOtpVerificationRequestId getOtpVerificationRequestId = otpVerificationViewModel.read;
                this.read = 1;
                obj = getOtpVerificationRequestId.invoke(this);
                if (obj == coroutineSingletons2) {
                    int i11 = RemoteActionCompatParcelizer + 123;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return coroutineSingletons2;
                }
            }
            String str = (String) obj;
            if (str.length() <= 0) {
                return createfromparcel;
            }
            MutableStateFlow mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
            int i13 = serializer + 115;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                int i14 = 5 / 4;
            }
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, trackThirdPartySharing.write((trackThirdPartySharing) obj2, null, null, null, str, null, false, null, false, 495)));
            return createfromparcel;
        }
    }

    public OtpVerificationViewModel(getQueryContext getquerycontext, DropShadowEffect dropShadowEffect, FormBody.Builder builder, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, setTransactionSuccessful settransactionsuccessful, GetOtpVerificationRequestId getOtpVerificationRequestId, GetOtpVerificationRequestId getOtpVerificationRequestId2, NetworkBody networkBody) {
        ShortNewsContentCardView shortNewsContentCardView;
        getquerycontext.getClass();
        dropShadowEffect.getClass();
        builder.getClass();
        brazeExternalSyntheticLambda28.getClass();
        settransactionsuccessful.getClass();
        getOtpVerificationRequestId.getClass();
        getOtpVerificationRequestId2.getClass();
        networkBody.getClass();
        this.MediaMetadataCompat = getquerycontext;
        this.PlaybackStateCompatCustomAction = dropShadowEffect;
        this.MediaBrowserCompatMediaItem = builder;
        this.MediaDescriptionCompat = brazeExternalSyntheticLambda28;
        this.RatingCompat = settransactionsuccessful;
        this.read = getOtpVerificationRequestId;
        this.MediaSessionCompatQueueItem = getOtpVerificationRequestId2;
        this.write = networkBody;
        ArrayList arrayList = new ArrayList(4);
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            shortNewsContentCardView = null;
            if (i3 >= 4) {
                break;
            }
            int i4 = PlaybackStateCompat + 57;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                arrayList.add(null);
                i3 += 121;
            } else {
                arrayList.add(null);
                i3++;
            }
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new trackThirdPartySharing(removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), "", "", "", "", false, new RectListDebuggerModifierNode(null, 3), false));
        this.IconCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        ((decode) this.write.IconCompatParcelizer).IconCompatParcelizer("Account Creation OTP Screen", null);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, i2), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
        int i5 = MediaSessionCompatResultReceiverWrapper + 69;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        String str = ((trackThirdPartySharing) this.IconCompatParcelizer.read()).MediaDescriptionCompat;
        DropShadowEffect dropShadowEffect = this.PlaybackStateCompatCustomAction;
        dropShadowEffect.getClass();
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) dropShadowEffect.MediaDescriptionCompat, null, null, new RxConvertKt$asFlow$1(dropShadowEffect, str, (ShortNewsContentCardView) null, 3), 3);
        int i2 = MediaSessionCompatResultReceiverWrapper + 71;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        String strIconCompatParcelizer;
        int i = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, trackThirdPartySharing.write((trackThirdPartySharing) obj, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, null, null, null, "", false, null, false, 413)));
        int i2 = PlaybackStateCompat + 75;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
            Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            int i4 = PlaybackStateCompat + 17;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, "", null, null, null, 62);
                    break;
                }
                int i6 = MediaSessionCompatResultReceiverWrapper + 91;
                PlaybackStateCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (((Character) it.next()) == null) {
                    int i7 = PlaybackStateCompat + 25;
                    MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 5 / 2;
                    }
                    strIconCompatParcelizer = null;
                    break;
                }
            }
        } else {
            strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, "", null, null, null, 62);
            break;
        }
        int i9 = 0;
        if (strIconCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = false;
            return;
        }
        boolean z = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = false;
        ff$$ExternalSyntheticOutline0.m("method", !(z ^ true) ? "autofill" : "manual", (decode) this.write.IconCompatParcelizer, "account_creation_otp_code_submit");
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatToken;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.MediaSessionCompatToken = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new OtpVerificationViewModel$onPinChanged$2(this, strIconCompatParcelizer, shortNewsContentCardView, i9), 3);
    }
}
