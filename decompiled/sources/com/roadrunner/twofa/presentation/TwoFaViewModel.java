package com.roadrunner.twofa.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.data.error.TooManyRequestsException;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.api.data.ApiError;
import com.roadrunner.auth.domain.VerifyTwoFaUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.twofa.data.repo.TwoFaRepository;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.RectListDebuggerModifierNode;
import o.ShortNewsContentCardView;
import o.getQueryContext;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import o.requestSingleLocationUpdatelambda0;
import o.retryInAppMessagelambda1;
import o.schedulePushDeliverylambda0;
import o.setCustomBrazeNotificationFactory;
import o.setEndpointProvider;
import o.setSdkAuthenticationSignaturelambda11;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFaViewModel extends ViewModel {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getSdkEnablementProviderandroid_sdk_base_release IconCompatParcelizer;
    public final TwoFaRepository MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final setTransactionSuccessful MediaSessionCompatQueueItem;
    public final setCustomBrazeNotificationFactory MediaSessionCompatResultReceiverWrapper;
    public final e$h MediaSessionCompatToken;
    public final MutableStateFlow ParcelableVolumeInfo;
    public final requestSingleLocationUpdatelambda0 PlaybackStateCompat;
    public final VerifyTwoFaUseCaseImpl PlaybackStateCompatCustomAction;
    public final retryInAppMessagelambda1 RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public boolean read;
    public String serializer;
    public final long write;

    public TwoFaViewModel(getQueryContext getquerycontext, transferSessionPackageI transfersessionpackagei, TwoFaRepository twoFaRepository, VerifyTwoFaUseCaseImpl verifyTwoFaUseCaseImpl, requestSingleLocationUpdatelambda0 requestsinglelocationupdatelambda0, setCustomBrazeNotificationFactory setcustombrazenotificationfactory, setTransactionSuccessful settransactionsuccessful, retryInAppMessagelambda1 retryinappmessagelambda1, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release, e$h e_h) {
        getquerycontext.getClass();
        transfersessionpackagei.getClass();
        twoFaRepository.getClass();
        verifyTwoFaUseCaseImpl.getClass();
        requestsinglelocationupdatelambda0.getClass();
        setcustombrazenotificationfactory.getClass();
        settransactionsuccessful.getClass();
        retryinappmessagelambda1.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        e_h.getClass();
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaBrowserCompatMediaItem = twoFaRepository;
        this.PlaybackStateCompatCustomAction = verifyTwoFaUseCaseImpl;
        this.PlaybackStateCompat = requestsinglelocationupdatelambda0;
        this.MediaSessionCompatResultReceiverWrapper = setcustombrazenotificationfactory;
        this.MediaSessionCompatQueueItem = settransactionsuccessful;
        this.RatingCompat = retryinappmessagelambda1;
        this.IconCompatParcelizer = getsdkenablementproviderandroid_sdk_base_release;
        this.MediaSessionCompatToken = e_h;
        ArrayList arrayList = new ArrayList(4);
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < 4) {
            int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 29;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                arrayList.add(null);
                i2 += 118;
            } else {
                arrayList.add(null);
                i2++;
            }
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 41;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new setSdkAuthenticationSignaturelambda11(removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), "", "", false, new RectListDebuggerModifierNode(null, 3)));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        this.write = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("login_2fa_error_retry_count");
        this.PlaybackStateCompat.RemoteActionCompatParcelizer.IconCompatParcelizer("2FA", null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        e$h e_h = this.MediaSessionCompatToken;
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) e_h.IconCompatParcelizer)).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer), null, null, new RxConvertKt$asSingle$1(e_h, null, 10), 3);
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 35;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 39;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.serializer;
        if (str != null) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            this.PlaybackStateCompat.RemoteActionCompatParcelizer.logEvent("2fa_request_code_button_tapped", null);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asSingle$1(this, shortNewsContentCardView, 11), 3);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asFlow$1(this, str, shortNewsContentCardView, 20), 3);
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 37;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public static final void serializer(TwoFaViewModel twoFaViewModel, Throwable th) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 7;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MutableStateFlow mutableStateFlow = twoFaViewModel.ParcelableVolumeInfo;
        setCustomBrazeNotificationFactory setcustombrazenotificationfactory = twoFaViewModel.MediaSessionCompatResultReceiverWrapper;
        getQueryContext getquerycontext = twoFaViewModel.MediaDescriptionCompat;
        int i4 = twoFaViewModel.MediaMetadataCompat + 1;
        twoFaViewModel.MediaMetadataCompat = i4;
        if (i4 >= twoFaViewModel.write) {
            getquerycontext.serializer(new schedulePushDeliverylambda0(setcustombrazenotificationfactory.RemoteActionCompatParcelizer(new ApiError.TooManyAttempts(null, null))));
            return;
        }
        MutableStateFlow mutableStateFlow2 = twoFaViewModel.RemoteActionCompatParcelizer;
        do {
            obj = mutableStateFlow2.read();
        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj, setSdkAuthenticationSignaturelambda11.RemoteActionCompatParcelizer((setSdkAuthenticationSignaturelambda11) obj, removeNodeAtDepth.RemoteActionCompatParcelizer(instance_delegatelambda0.write), null, null, false, null, 61)));
        if (!(!(th instanceof ApiError.InvalidCode))) {
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, setSdkAuthenticationSignaturelambda11.RemoteActionCompatParcelizer((setSdkAuthenticationSignaturelambda11) obj2, null, null, twoFaViewModel.MediaSessionCompatQueueItem.IconCompatParcelizer(R.string.two_factor_auth_invalid_code_error), false, null, 55)));
            return;
        }
        if (!(th instanceof TooManyRequestsException)) {
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 91;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!(th instanceof ApiError.InvalidFlow)) {
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, setSdkAuthenticationSignaturelambda11.RemoteActionCompatParcelizer((setSdkAuthenticationSignaturelambda11) obj3, null, null, null, true, null, 47)));
                getquerycontext.serializer(new setEndpointProvider(setcustombrazenotificationfactory.RemoteActionCompatParcelizer(th)));
                return;
            }
        }
        getquerycontext.serializer(new schedulePushDeliverylambda0(setcustombrazenotificationfactory.RemoteActionCompatParcelizer(th)));
    }
}
