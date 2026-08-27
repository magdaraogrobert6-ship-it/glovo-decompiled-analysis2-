package com.roadrunner.login.presentation.signin;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.room.RoomDatabase$createConnectionManager$2;
import com.logistics.rider.glovo.R;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.ui.common.base.BaseRxViewModel;
import o.AndroidGraphicsContext2;
import o.BrazeExternalSyntheticLambda5;
import o.BrazeLogger;
import o.QueryResultCompanion;
import o.QueryResultDefaultImpls;
import o.SystemLifecycleSystemLifecycleCallback;
import o.accessgetOldDependencyp;
import o.b1;
import o.d4ExternalSyntheticLambda2;
import o.getAbsoluteAdapterPosition;
import o.getBindingAdapter;
import o.getBoolean;
import o.getBytes;
import o.getPivotOffsetF1C5BW0;
import o.getQueryContext;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.markCardAsDismissed;
import o.setAccessibilityExtraKeyui;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInViewModel extends BaseRxViewModel {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final QueryResultCompanion MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final LoginStorageManager MediaSessionCompatQueueItem;
    public final ForgotPasswordPersistedTimerManager MediaSessionCompatResultReceiverWrapper;
    public final BrazeExternalSyntheticLambda5 MediaSessionCompatToken;
    public final BrazeLogger PlaybackStateCompatCustomAction;
    public final SystemLifecycleSystemLifecycleCallback RatingCompat;
    public final getBytes RemoteActionCompatParcelizer;
    public final getBindingAdapter read;
    public final BlockRunner serializer;
    public final setAccessibilityExtraKeyui write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, setTransactionSuccessful settransactionsuccessful, accessgetOldDependencyp accessgetolddependencyp, BlockRunner blockRunner, getBytes getbytes, LoginStorageManager loginStorageManager, getQueryContext getquerycontext, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, setAccessibilityExtraKeyui setaccessibilityextrakeyui, getBindingAdapter getbindingadapter, ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, QueryResultCompanion queryResultCompanion, transferSessionPackageI transfersessionpackagei) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        settransactionsuccessful.getClass();
        accessgetolddependencyp.getClass();
        blockRunner.getClass();
        getbytes.getClass();
        loginStorageManager.getClass();
        getquerycontext.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        setaccessibilityextrakeyui.getClass();
        getbindingadapter.getClass();
        forgotPasswordPersistedTimerManager.getClass();
        brazeExternalSyntheticLambda5.getClass();
        queryResultCompanion.getClass();
        transfersessionpackagei.getClass();
        this.serializer = blockRunner;
        this.RemoteActionCompatParcelizer = getbytes;
        this.MediaSessionCompatQueueItem = loginStorageManager;
        this.MediaDescriptionCompat = getquerycontext;
        this.RatingCompat = systemLifecycleSystemLifecycleCallback;
        this.write = setaccessibilityextrakeyui;
        this.read = getbindingadapter;
        this.MediaSessionCompatResultReceiverWrapper = forgotPasswordPersistedTimerManager;
        this.MediaSessionCompatToken = brazeExternalSyntheticLambda5;
        this.MediaBrowserCompatMediaItem = queryResultCompanion;
        this.MediaMetadataCompat = transfersessionpackagei;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new markCardAsDismissed(this, 0));
        int i = 0;
        int i2 = 0;
        this.PlaybackStateCompatCustomAction = new BrazeLogger(new d4ExternalSyntheticLambda2(new getBoolean(null, 0, "", getbindingadapter.serializer(getAbsoluteAdapterPosition.write), new NafathModalContentKt$NafathModal$1$1(0, this, SignInViewModel.class, "clearAuthErrorOnInputsChanged", "clearAuthErrorOnInputsChanged()V", i, 9), hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) ""), 3), null, "v4.2634.5", false, new b1(R.drawable.ic_identity_verification_illustration, settransactionsuccessful.IconCompatParcelizer(R.string.login_identity_verification_pop_up_title), settransactionsuccessful.IconCompatParcelizer(R.string.login_identity_verification_pop_up_sub_title), false, true, new NestFragment.AnonymousClass1(1, this, SignInViewModel.class, "onDialogVisibilityChanged", "onDialogVisibilityChanged(Z)V", i, 27)), getquerycontext, new RoomDatabase$createConnectionManager$2(2, this, SignInViewModel.class, "onSignInClicked", "onSignInClicked(Lkotlin/jvm/functions/Function1;Z)V", 0, 23), new NafathModalContentKt$NafathModal$1$1(i2, this, SignInViewModel.class, "onForgotPasswordClicked", "onForgotPasswordClicked()V", i, 10), new NafathModalContentKt$NafathModal$1$1(i2, this, SignInViewModel.class, "onNavigationClicked", "onNavigationClicked()V", i, 11)));
    }

    public static final void IconCompatParcelizer(SignInViewModel signInViewModel) {
        AndroidGraphicsContext2 androidGraphicsContext2;
        d4ExternalSyntheticLambda2 d4externalsyntheticlambda2;
        getBoolean getboolean;
        QueryResultDefaultImpls queryResultDefaultImpls;
        boolean z;
        b1 b1Var;
        int i;
        int i2 = 2 % 2;
        int i3 = ParcelableVolumeInfo + 43;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            BrazeLogger brazeLogger = signInViewModel.PlaybackStateCompatCustomAction;
            brazeLogger.getClass();
            androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
            d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) brazeLogger.write();
            getboolean = null;
            queryResultDefaultImpls = null;
            z = false;
            b1Var = null;
            i = 7959;
        } else {
            BrazeLogger brazeLogger2 = signInViewModel.PlaybackStateCompatCustomAction;
            brazeLogger2.getClass();
            androidGraphicsContext2 = brazeLogger2.IconCompatParcelizer;
            d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) brazeLogger2.write();
            getboolean = null;
            queryResultDefaultImpls = null;
            z = false;
            b1Var = null;
            i = 503;
        }
        androidGraphicsContext2.RemoteActionCompatParcelizer(d4ExternalSyntheticLambda2.RemoteActionCompatParcelizer(d4externalsyntheticlambda2, getboolean, queryResultDefaultImpls, z, b1Var, i));
    }
}
