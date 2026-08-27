package com.roadrunner.nafath;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToLogin$2;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.login.presentation.welcome.WelcomeViewModel;
import com.roadrunner.map.navigateview.api.NavigateViewUiModel;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import o.AndroidGraphicsContext2;
import o.BrazeLogger;
import o.C0166g;
import o.C0175h;
import o.C0179j;
import o.C0180k;
import o.Transacter;
import o.accessexecute;
import o.ag;
import o.bbExternalSyntheticLambda0;
import o.cg;
import o.createFromParcel;
import o.d7;
import o.decode;
import o.endStream;
import o.lambdaonActivityLifecycle0;
import o.lambdaprocessDeeplink12;
import o.of;
import o.p0;
import o.pb;
import o.proceed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.shouldProcessEventI;
import o.stopForegroundTimerI;
import o.t8;
import o.t9;
import o.toBitmapConfig1JJdX4A;
import o.ub;
import o.v1;
import o.verifyPlayStorePurchaseI;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NafathModalContentKt$NafathModal$1$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(GetAuthStateViewModel getAuthStateViewModel, int i) {
        super(0, 0, GetAuthStateViewModel.class, getAuthStateViewModel, "onIdentityVerificationFinished", "onIdentityVerificationFinished()V");
        this.IconCompatParcelizer = i;
        if (i != 5) {
        } else {
            super(0, 0, GetAuthStateViewModel.class, getAuthStateViewModel, "onIdentityVerificationCanceled", "onIdentityVerificationCanceled()V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathModalContentKt$NafathModal$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.IconCompatParcelizer = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(RouterActivity routerActivity) {
        super(0, 0, RouterActivity.class, routerActivity, "downloadApp", "downloadApp()V");
        this.IconCompatParcelizer = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(NavigateViewUiModel navigateViewUiModel) {
        super(0, 0, NavigateViewUiModel.class, navigateViewUiModel, "onNavigateClicked", "onNavigateClicked()V");
        this.IconCompatParcelizer = 14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(NonFloatablePermissionActivity nonFloatablePermissionActivity, int i) {
        super(0, 0, NonFloatablePermissionActivity.class, nonFloatablePermissionActivity, "finishActivityWithSuccess", "finishActivityWithSuccess()V");
        this.IconCompatParcelizer = i;
        if (i != 25) {
        } else {
            super(0, 0, NonFloatablePermissionActivity.class, nonFloatablePermissionActivity, "finishActivityWithFailure", "finishActivityWithFailure()V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(PermissionActivity permissionActivity, int i) {
        super(0, 0, PermissionActivity.class, permissionActivity, "finishActivityWithSuccess", "finishActivityWithSuccess()V");
        this.IconCompatParcelizer = i;
        if (i != 27) {
        } else {
            super(0, 0, PermissionActivity.class, permissionActivity, "finishActivityWithFailure", "finishActivityWithFailure()V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathModalContentKt$NafathModal$1$1(Object obj) {
        super(0, 0, RouterActivity.class, obj, "downloadApp", "downloadApp()V");
        this.IconCompatParcelizer = 3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[PHI: r7
  0x0029: PHI (r7v30 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[PHI: r7
  0x0035: PHI (r7v29 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[PHI: r7
  0x003d: PHI (r7v28 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r7
  0x0045: PHI (r7v27 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r7
  0x004d: PHI (r7v26 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[PHI: r7
  0x0055: PHI (r7v25 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[PHI: r7
  0x0061: PHI (r7v24 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[PHI: r7
  0x006d: PHI (r7v23 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[PHI: r7
  0x0075: PHI (r7v22 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[PHI: r7
  0x0081: PHI (r7v21 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[PHI: r7
  0x0096: PHI (r7v20 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[PHI: r7
  0x009e: PHI (r7v19 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0111 A[PHI: r7
  0x0111: PHI (r7v18 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0119 A[PHI: r7
  0x0119: PHI (r7v17 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0147 A[PHI: r7
  0x0147: PHI (r7v16 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0159 A[PHI: r7
  0x0159: PHI (r7v15 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0165 A[PHI: r7
  0x0165: PHI (r7v14 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0171 A[PHI: r7
  0x0171: PHI (r7v13 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x017d A[PHI: r7
  0x017d: PHI (r7v12 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0193 A[PHI: r7
  0x0193: PHI (r7v11 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x019b A[PHI: r7
  0x019b: PHI (r7v10 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3 A[PHI: r7
  0x01a3: PHI (r7v9 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab A[PHI: r7
  0x01ab: PHI (r7v8 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd A[PHI: r7
  0x01cd: PHI (r7v7 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3 A[PHI: r7
  0x01e3: PHI (r7v6 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f7 A[PHI: r7
  0x01f7: PHI (r7v5 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0219 A[PHI: r7
  0x0219: PHI (r7v4 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0239 A[PHI: r7
  0x0239: PHI (r7v3 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0247  */
    /* JADX WARN: Code duplicated, block: B:75:0x0258  */
    /* JADX WARN: Code duplicated, block: B:78:0x0269  */
    /* JADX WARN: Code duplicated, block: B:79:0x026c  */
    /* JADX WARN: Code duplicated, block: B:82:0x029d  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ca A[PHI: r7
  0x02ca: PHI (r7v2 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02f8 A[PHI: r7
  0x02f8: PHI (r7v1 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v31 o.createFromParcel) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        createFromParcel createfromparcel;
        C0180k c0180k;
        boolean z;
        OtpLogger otpLogger;
        endStream endstream;
        endStream endstream2;
        String strWrite;
        int i;
        NafathModalFragment nafathModalFragment;
        int i2 = 2 % 2;
        int i3 = read + 43;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i5 = 0;
        if (i3 % 2 != 0) {
            int i6 = this.IconCompatParcelizer;
            createfromparcel = createFromParcel.INSTANCE;
            switch (i6) {
                case 0:
                    pb pbVar = (pb) this.MediaMetadataCompat;
                    pbVar.getClass();
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("User tapped: open Nafath app", new Object[0]);
                    FormBody.Builder builder = pbVar.write;
                    ((decode) builder.serializer).logEvent("nafath_deeplink_clicked", builder.IconCompatParcelizer(pbVar.RatingCompat, new NafathLogger$$ExternalSyntheticLambda0(i5)));
                    pbVar.MediaDescriptionCompat.serializer(of.read);
                    break;
                case 1:
                    c0180k = (C0180k) this.MediaMetadataCompat;
                    endStream endstream3 = c0180k.RemoteActionCompatParcelizer;
                    BrazeLogger brazeLogger = c0180k.PlaybackStateCompatCustomAction;
                    z = endstream3 instanceof C0166g;
                    otpLogger = c0180k.read;
                    if (z) {
                        int i7 = read + 57;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        otpLogger.read(Transacter.EMAIL, Transacter.SMS);
                    } else {
                        otpLogger.read(Transacter.SMS, Transacter.EMAIL);
                    }
                    endstream = c0180k.RemoteActionCompatParcelizer;
                    endstream.getClass();
                    if (!(endstream instanceof C0166g)) {
                        endstream2 = C0166g.read;
                    } else {
                        endstream2 = C0175h.read;
                    }
                    c0180k.RemoteActionCompatParcelizer = endstream2;
                    brazeLogger.getClass();
                    AndroidGraphicsContext2 androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
                    ag agVar = c0180k.RatingCompat;
                    endStream endstream4 = c0180k.RemoteActionCompatParcelizer;
                    strWrite = ((C0179j) brazeLogger.write()).read.write();
                    if (c0180k.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(strWrite, c0180k.RemoteActionCompatParcelizer, (verifyPlayStorePurchaseI) c0180k.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper())) {
                        int i9 = RemoteActionCompatParcelizer + 83;
                        read = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        str = strWrite;
                    }
                    if (str == null) {
                        i = read + 45;
                        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                        str = "";
                        if (i % 2 == 0) {
                            int i11 = 97 / 0;
                        }
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(agVar.write(endstream4, str));
                    int i12 = read + 49;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    break;
                case 2:
                    BrazeLogger brazeLogger2 = ((OtpViewModel) this.MediaMetadataCompat).MediaMetadataCompat;
                    brazeLogger2.getClass();
                    brazeLogger2.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger2.write(), null, false, false, false, 23));
                    break;
                case 3:
                    RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{(RouterActivity) this.MediaMetadataCompat}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 1169793922, -1169793917, BottomSheetBehavior.IconCompatParcelizer());
                    break;
                case 4:
                    GetAuthStateViewModel getAuthStateViewModel = (GetAuthStateViewModel) this.MediaMetadataCompat;
                    getAuthStateViewModel.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel), null, null, new GetAuthStateViewModel$goToLogin$2(getAuthStateViewModel, objArr == true ? 1 : 0, i4), 3);
                    break;
                case 5:
                    GetAuthStateViewModel getAuthStateViewModel2 = (GetAuthStateViewModel) this.MediaMetadataCompat;
                    getAuthStateViewModel2.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel2), null, null, new HomeViewModel.AnonymousClass1(getAuthStateViewModel2, objArr2 == true ? 1 : 0, 21), 3);
                    break;
                case 6:
                    RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{(RouterActivity) this.MediaMetadataCompat}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 1169793922, -1169793917, BottomSheetBehavior.IconCompatParcelizer());
                    break;
                case 7:
                    SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                    break;
                case 8:
                    SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                    break;
                case 9:
                    SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                    break;
                case 10:
                    SignInViewModel signInViewModel = (SignInViewModel) this.MediaMetadataCompat;
                    signInViewModel.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(signInViewModel), null, null, new PushEventPublisherImpl$emit$1(signInViewModel, objArr3 == true ? 1 : 0, 20), 3);
                    break;
                case 11:
                    ((SignInViewModel) this.MediaMetadataCompat).MediaDescriptionCompat.serializer(cg.write);
                    break;
                case 12:
                    ((WelcomeViewModel) this.MediaMetadataCompat).RatingCompat.serializer(d7.read);
                    break;
                case 13:
                    ((WelcomeViewModel) this.MediaMetadataCompat).RatingCompat.serializer(d7.write);
                    break;
                case 14:
                    StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl = (StartingAreaNavigateViewUiModelImpl) ((NavigateViewUiModel) this.MediaMetadataCompat);
                    BuildersKt.RemoteActionCompatParcelizer(startingAreaNavigateViewUiModelImpl.write, null, null, new RxConvertKt$asSingle$1(startingAreaNavigateViewUiModelImpl, objArr4 == true ? 1 : 0, 7), 3);
                    break;
                case 15:
                    pb pbVar2 = (pb) this.MediaMetadataCompat;
                    pbVar2.getClass();
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("User tapped: I verified myself", new Object[0]);
                    FormBody.Builder builder2 = pbVar2.write;
                    ((decode) builder2.serializer).logEvent("nafath_dismiss_clicked", builder2.IconCompatParcelizer(pbVar2.RatingCompat, new NafathLogger$$ExternalSyntheticLambda0(i5)));
                    pbVar2.MediaDescriptionCompat.serializer(p0.IconCompatParcelizer);
                    break;
                case 16:
                    ((NafathModalFragment) this.MediaMetadataCompat).read(false, false);
                    break;
                case 17:
                    nafathModalFragment = (NafathModalFragment) this.MediaMetadataCompat;
                    nafathModalFragment.getClass();
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Attempting to open Nafath app via deep link", new Object[0]);
                    nafathModalFragment.requireContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("nic://nafath")));
                    break;
                case 18:
                    ((BonusCalendarFragment) this.MediaMetadataCompat).read(false, false);
                    break;
                case 19:
                    BonusCalendarViewModel bonusCalendarViewModel = (BonusCalendarViewModel) this.MediaMetadataCompat;
                    bonusCalendarViewModel.MediaSessionCompatQueueItem.write.logEvent("bonus_calendar_closed", null);
                    bonusCalendarViewModel.RatingCompat.serializer(t8.read);
                    break;
                case 20:
                    ((BonusCalendarViewModel) this.MediaMetadataCompat).RatingCompat.serializer(t9.RemoteActionCompatParcelizer);
                    break;
                case 21:
                    ((CalendarInformationFragment) this.MediaMetadataCompat).read(false, false);
                    break;
                case 22:
                    ((v1) this.MediaMetadataCompat).read.serializer(ub.IconCompatParcelizer);
                    break;
                case 23:
                    ((accessexecute) this.MediaMetadataCompat).read.serializer(proceed.write);
                    break;
                case 24:
                    NonFloatablePermissionActivity.read((NonFloatablePermissionActivity) this.MediaMetadataCompat);
                    break;
                case 25:
                    NonFloatablePermissionActivity.serializer((NonFloatablePermissionActivity) this.MediaMetadataCompat);
                    break;
                case 26:
                    PermissionActivity.IconCompatParcelizer((PermissionActivity) this.MediaMetadataCompat);
                    break;
                case 27:
                    PermissionActivity.serializer((PermissionActivity) this.MediaMetadataCompat);
                    break;
                case 28:
                    ((lambdaprocessDeeplink12) this.MediaMetadataCompat).RemoteActionCompatParcelizer.serializer(lambdaonActivityLifecycle0.RemoteActionCompatParcelizer);
                    break;
                default:
                    ((shouldProcessEventI) this.MediaMetadataCompat).MediaDescriptionCompat.serializer(stopForegroundTimerI.RemoteActionCompatParcelizer);
                    break;
            }
            return createfromparcel;
        }
        int i14 = this.IconCompatParcelizer;
        createfromparcel = createFromParcel.INSTANCE;
        int i15 = 44 / 0;
        switch (i14) {
            case 0:
                pb pbVar3 = (pb) this.MediaMetadataCompat;
                pbVar3.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("User tapped: open Nafath app", new Object[0]);
                FormBody.Builder builder3 = pbVar3.write;
                ((decode) builder3.serializer).logEvent("nafath_deeplink_clicked", builder3.IconCompatParcelizer(pbVar3.RatingCompat, new NafathLogger$$ExternalSyntheticLambda0(i5)));
                pbVar3.MediaDescriptionCompat.serializer(of.read);
                break;
            case 1:
                c0180k = (C0180k) this.MediaMetadataCompat;
                endStream endstream5 = c0180k.RemoteActionCompatParcelizer;
                BrazeLogger brazeLogger3 = c0180k.PlaybackStateCompatCustomAction;
                z = endstream5 instanceof C0166g;
                otpLogger = c0180k.read;
                if (z) {
                    int i16 = read + 57;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    otpLogger.read(Transacter.EMAIL, Transacter.SMS);
                } else {
                    otpLogger.read(Transacter.SMS, Transacter.EMAIL);
                }
                endstream = c0180k.RemoteActionCompatParcelizer;
                endstream.getClass();
                if (!(endstream instanceof C0166g)) {
                    endstream2 = C0166g.read;
                } else {
                    endstream2 = C0175h.read;
                }
                c0180k.RemoteActionCompatParcelizer = endstream2;
                brazeLogger3.getClass();
                AndroidGraphicsContext2 androidGraphicsContext3 = brazeLogger3.IconCompatParcelizer;
                ag agVar2 = c0180k.RatingCompat;
                endStream endstream6 = c0180k.RemoteActionCompatParcelizer;
                strWrite = ((C0179j) brazeLogger3.write()).read.write();
                if (c0180k.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(strWrite, c0180k.RemoteActionCompatParcelizer, (verifyPlayStorePurchaseI) c0180k.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper())) {
                    int i18 = RemoteActionCompatParcelizer + 83;
                    read = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    str = strWrite;
                }
                if (str == null) {
                    i = read + 45;
                    RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                    str = "";
                    if (i % 2 == 0) {
                        int i110 = 97 / 0;
                    }
                }
                androidGraphicsContext3.RemoteActionCompatParcelizer(agVar2.write(endstream6, str));
                int i111 = read + 49;
                RemoteActionCompatParcelizer = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
                break;
            case 2:
                BrazeLogger brazeLogger4 = ((OtpViewModel) this.MediaMetadataCompat).MediaMetadataCompat;
                brazeLogger4.getClass();
                brazeLogger4.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger4.write(), null, false, false, false, 23));
                break;
            case 3:
                RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{(RouterActivity) this.MediaMetadataCompat}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 1169793922, -1169793917, BottomSheetBehavior.IconCompatParcelizer());
                break;
            case 4:
                GetAuthStateViewModel getAuthStateViewModel3 = (GetAuthStateViewModel) this.MediaMetadataCompat;
                getAuthStateViewModel3.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel3), null, null, new GetAuthStateViewModel$goToLogin$2(getAuthStateViewModel3, objArr == true ? 1 : 0, i4), 3);
                break;
            case 5:
                GetAuthStateViewModel getAuthStateViewModel4 = (GetAuthStateViewModel) this.MediaMetadataCompat;
                getAuthStateViewModel4.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel4), null, null, new HomeViewModel.AnonymousClass1(getAuthStateViewModel4, objArr2 == true ? 1 : 0, 21), 3);
                break;
            case 6:
                RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{(RouterActivity) this.MediaMetadataCompat}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 1169793922, -1169793917, BottomSheetBehavior.IconCompatParcelizer());
                break;
            case 7:
                SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                break;
            case 8:
                SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                break;
            case 9:
                SignInViewModel.IconCompatParcelizer((SignInViewModel) this.MediaMetadataCompat);
                break;
            case 10:
                SignInViewModel signInViewModel2 = (SignInViewModel) this.MediaMetadataCompat;
                signInViewModel2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(signInViewModel2), null, null, new PushEventPublisherImpl$emit$1(signInViewModel2, objArr3 == true ? 1 : 0, 20), 3);
                break;
            case 11:
                ((SignInViewModel) this.MediaMetadataCompat).MediaDescriptionCompat.serializer(cg.write);
                break;
            case 12:
                ((WelcomeViewModel) this.MediaMetadataCompat).RatingCompat.serializer(d7.read);
                break;
            case 13:
                ((WelcomeViewModel) this.MediaMetadataCompat).RatingCompat.serializer(d7.write);
                break;
            case 14:
                StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl2 = (StartingAreaNavigateViewUiModelImpl) ((NavigateViewUiModel) this.MediaMetadataCompat);
                BuildersKt.RemoteActionCompatParcelizer(startingAreaNavigateViewUiModelImpl2.write, null, null, new RxConvertKt$asSingle$1(startingAreaNavigateViewUiModelImpl2, objArr4 == true ? 1 : 0, 7), 3);
                break;
            case 15:
                pb pbVar4 = (pb) this.MediaMetadataCompat;
                pbVar4.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("User tapped: I verified myself", new Object[0]);
                FormBody.Builder builder4 = pbVar4.write;
                ((decode) builder4.serializer).logEvent("nafath_dismiss_clicked", builder4.IconCompatParcelizer(pbVar4.RatingCompat, new NafathLogger$$ExternalSyntheticLambda0(i5)));
                pbVar4.MediaDescriptionCompat.serializer(p0.IconCompatParcelizer);
                break;
            case 16:
                ((NafathModalFragment) this.MediaMetadataCompat).read(false, false);
                break;
            case 17:
                nafathModalFragment = (NafathModalFragment) this.MediaMetadataCompat;
                nafathModalFragment.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Attempting to open Nafath app via deep link", new Object[0]);
                try {
                    nafathModalFragment.requireContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("nic://nafath")));
                } catch (ActivityNotFoundException e) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.read(e, "Nafath app not found, falling back to Play Store", new Object[0]);
                    forest.IconCompatParcelizer("Attempting to open Nafath in Play Store", new Object[0]);
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=sa.gov.nic.myid"));
                        intent.addFlags(268435456);
                        nafathModalFragment.requireContext().startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                        forest2.RemoteActionCompatParcelizer(e2, "Play Store app not found, falling back to browser", new Object[0]);
                        forest2.IconCompatParcelizer("Opening Nafath install page in browser", new Object[0]);
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=sa.gov.nic.myid"));
                        intent2.addFlags(268435456);
                        nafathModalFragment.requireContext().startActivity(intent2);
                    }
                }
                break;
            case 18:
                ((BonusCalendarFragment) this.MediaMetadataCompat).read(false, false);
                break;
            case 19:
                BonusCalendarViewModel bonusCalendarViewModel2 = (BonusCalendarViewModel) this.MediaMetadataCompat;
                bonusCalendarViewModel2.MediaSessionCompatQueueItem.write.logEvent("bonus_calendar_closed", null);
                bonusCalendarViewModel2.RatingCompat.serializer(t8.read);
                break;
            case 20:
                ((BonusCalendarViewModel) this.MediaMetadataCompat).RatingCompat.serializer(t9.RemoteActionCompatParcelizer);
                break;
            case 21:
                ((CalendarInformationFragment) this.MediaMetadataCompat).read(false, false);
                break;
            case 22:
                ((v1) this.MediaMetadataCompat).read.serializer(ub.IconCompatParcelizer);
                break;
            case 23:
                ((accessexecute) this.MediaMetadataCompat).read.serializer(proceed.write);
                break;
            case 24:
                NonFloatablePermissionActivity.read((NonFloatablePermissionActivity) this.MediaMetadataCompat);
                break;
            case 25:
                NonFloatablePermissionActivity.serializer((NonFloatablePermissionActivity) this.MediaMetadataCompat);
                break;
            case 26:
                PermissionActivity.IconCompatParcelizer((PermissionActivity) this.MediaMetadataCompat);
                break;
            case 27:
                PermissionActivity.serializer((PermissionActivity) this.MediaMetadataCompat);
                break;
            case 28:
                ((lambdaprocessDeeplink12) this.MediaMetadataCompat).RemoteActionCompatParcelizer.serializer(lambdaonActivityLifecycle0.RemoteActionCompatParcelizer);
                break;
            default:
                ((shouldProcessEventI) this.MediaMetadataCompat).MediaDescriptionCompat.serializer(stopForegroundTimerI.RemoteActionCompatParcelizer);
                break;
        }
        return createfromparcel;
        return createfromparcel;
    }
}
