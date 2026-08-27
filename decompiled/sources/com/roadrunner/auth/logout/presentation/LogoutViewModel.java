package com.roadrunner.auth.logout.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.auth.domain.logout.LogoutUserUseCaseImpl;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.SemanticsPropertiesShape1;
import o.SemanticsPropertiesTestTag1;
import o.createFromParcel;
import o.generatePOSTBodyString;
import o.getCieXyz;
import o.getDisabled;
import o.getQueryContext;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.removeNodeAtDepth;
import o.scrollBydefault;
import o.scrollToIndex;
import o.setContentType;
import o.setImeAction4L7nppU;
import o.setPaneTitle;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutViewModel extends ViewModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final String IconCompatParcelizer;
    public final getQueryContext MediaBrowserCompatMediaItem;
    public final SemanticsPropertiesTestTag1 MediaDescriptionCompat;
    public final LogoutUserUseCaseImpl MediaMetadataCompat;
    public final setTransactionSuccessful MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getDisabled read;
    public final AuthStateMachine serializer;
    public final transferSessionPackageI write;

    public final getQueryContext RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 61;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        getQueryContext getquerycontext = this.MediaBrowserCompatMediaItem;
        int i5 = i3 + 23;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getquerycontext;
        }
        throw null;
    }

    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 95;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StateFlow stateFlow = this.RatingCompat;
        int i4 = i2 + 25;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public LogoutViewModel(String str, LogoutUserUseCaseImpl logoutUserUseCaseImpl, SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1, AuthStateMachine authStateMachine, transferSessionPackageI transfersessionpackagei, setTransactionSuccessful settransactionsuccessful, getDisabled getdisabled, getQueryContext getquerycontext) {
        logoutUserUseCaseImpl.getClass();
        semanticsPropertiesTestTag1.getClass();
        authStateMachine.getClass();
        transfersessionpackagei.getClass();
        settransactionsuccessful.getClass();
        getdisabled.getClass();
        getquerycontext.getClass();
        this.IconCompatParcelizer = str;
        this.MediaMetadataCompat = logoutUserUseCaseImpl;
        this.MediaDescriptionCompat = semanticsPropertiesTestTag1;
        this.serializer = authStateMachine;
        this.write = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = settransactionsuccessful;
        this.read = getdisabled;
        this.MediaBrowserCompatMediaItem = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new setContentType(true, null));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new MapboxNavigation$parsing$2(this, null, 4));
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 21;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
        firebaseRemoteConfigImpl.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED);
        getQueryContext getquerycontext = this.MediaBrowserCompatMediaItem;
        String str = this.IconCompatParcelizer;
        if (zIconCompatParcelizer) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "Force update"}, getCieXyz.write())).booleanValue()) {
                int i4 = PlaybackStateCompatCustomAction + 91;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getquerycontext.serializer(scrollBydefault.IconCompatParcelizer);
            }
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "Max retries reached"}, getCieXyz.write())).booleanValue()) {
            return;
        }
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.REVOKE_PREVIOUS_LOGIN_SESSION_ENABLED)) {
            int i6 = ParcelableVolumeInfo + 105;
            PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
            Object obj = null;
            if (i6 % 2 == 0) {
                this.read.write.logEvent("logout_dialog_click", null);
                getquerycontext.serializer(scrollToIndex.write);
            } else {
                this.read.write.logEvent("logout_dialog_click", null);
                getquerycontext.serializer(scrollToIndex.write);
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$logoutUserProcess(LogoutViewModel logoutViewModel, ContinuationImpl continuationImpl) {
        setImeAction4L7nppU setimeaction4l7nppu;
        int i = 2 % 2;
        if (continuationImpl instanceof setImeAction4L7nppU) {
            setimeaction4l7nppu = (setImeAction4L7nppU) continuationImpl;
            int i2 = setimeaction4l7nppu.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setimeaction4l7nppu.read = i2 - Integer.MIN_VALUE;
            } else {
                setimeaction4l7nppu = new setImeAction4L7nppU(logoutViewModel, continuationImpl);
            }
        } else {
            setimeaction4l7nppu = new setImeAction4L7nppU(logoutViewModel, continuationImpl);
        }
        Object obj = setimeaction4l7nppu.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setimeaction4l7nppu.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            LogoutUserUseCaseImpl logoutUserUseCaseImpl = logoutViewModel.MediaMetadataCompat;
            String str = logoutViewModel.IconCompatParcelizer;
            setimeaction4l7nppu.read = 1;
            if (logoutUserUseCaseImpl.invoke(str, setimeaction4l7nppu) == coroutineSingletons) {
                int i4 = ParcelableVolumeInfo + 39;
                PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 2;
                }
            }
        }
        int i6 = ParcelableVolumeInfo + 69;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0 ? i3 == 1 : i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i3 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Update logout state", new Object[0]);
        logoutViewModel.serializer.write(new setPaneTitle("On logout"));
        SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1 = logoutViewModel.MediaDescriptionCompat;
        setimeaction4l7nppu.read = 2;
        semanticsPropertiesTestTag1.IconCompatParcelizer.emit(SemanticsPropertiesShape1.IconCompatParcelizer, setimeaction4l7nppu);
        return createfromparcel == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[PHI: r1 r4 r5 r6
  0x0042: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r4v1 kotlinx.coroutines.flow.MutableStateFlow) = (r4v0 kotlinx.coroutines.flow.MutableStateFlow), (r4v3 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r5v1 o.setTransactionSuccessful) = (r5v0 o.setTransactionSuccessful), (r5v3 o.setTransactionSuccessful) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r6v1 o.transferSessionPackageI) = (r6v0 o.transferSessionPackageI), (r6v6 o.transferSessionPackageI) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    public static final void RemoteActionCompatParcelizer(LogoutViewModel logoutViewModel) {
        String str;
        MutableStateFlow mutableStateFlow;
        setTransactionSuccessful settransactionsuccessful;
        transferSessionPackageI transfersessionpackagei;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 17;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = logoutViewModel.IconCompatParcelizer;
            mutableStateFlow = logoutViewModel.RemoteActionCompatParcelizer;
            settransactionsuccessful = logoutViewModel.MediaSessionCompatQueueItem;
            transfersessionpackagei = logoutViewModel.write;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl.getClass();
            int i3 = 76 / 0;
            if (!(!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED))) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "Force update"}, getCieXyz.write())).booleanValue()) {
                    mutableStateFlow.IconCompatParcelizer(new setContentType(false, new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_description), settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_button), null, null, 56, null)));
                    int i4 = ParcelableVolumeInfo + 7;
                    PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return;
                }
            }
        } else {
            str = logoutViewModel.IconCompatParcelizer;
            mutableStateFlow = logoutViewModel.RemoteActionCompatParcelizer;
            settransactionsuccessful = logoutViewModel.MediaSessionCompatQueueItem;
            transfersessionpackagei = logoutViewModel.write;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl2.getClass();
            if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED)) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "Force update"}, getCieXyz.write())).booleanValue()) {
                    mutableStateFlow.IconCompatParcelizer(new setContentType(false, new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_description), settransactionsuccessful.IconCompatParcelizer(R.string.update_app_dialog_button), null, null, 56, null)));
                    int i6 = ParcelableVolumeInfo + 7;
                    PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return;
                }
            }
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "Max retries reached"}, getCieXyz.write())).booleanValue()) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl3.getClass();
            if (firebaseRemoteConfigImpl3.IconCompatParcelizer(updateAdidI.REVOKE_PREVIOUS_LOGIN_SESSION_ENABLED)) {
                mutableStateFlow.IconCompatParcelizer(new setContentType(false, new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.login_logout_dialog_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.login_logout_dialog_subtitle), settransactionsuccessful.IconCompatParcelizer(R.string.login_logout_dialog_button_title), null, null, 56, null)));
                logoutViewModel.read.write.logEvent("logout_dialog", null);
                return;
            }
        }
        logoutViewModel.MediaBrowserCompatMediaItem.serializer(scrollToIndex.write);
    }
}
