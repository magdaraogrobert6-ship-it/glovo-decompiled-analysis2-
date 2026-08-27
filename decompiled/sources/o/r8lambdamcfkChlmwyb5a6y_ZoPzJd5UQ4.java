package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.GetAccessTokenUseCaseImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.phonenumber.domain.GetCustomerPhoneNumberUseCaseImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.roadrunner.rider.safety.permission.domain.ShouldNavigateToRiderSafetyPermissions;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.web.presentation.authWebView.AuthWebViewModel;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.O$b;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final getColorIntegerOrNulllambda0 serializer;
    public final /* synthetic */ int write;

    public r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(mergeJsonObjects mergejsonobjects, r8lambda4ctur6dHthQRF8ridJfgtUMxjY0 r8lambda4ctur6dhthqrf8ridjfgtumxjy0, setSdkAuthenticationSignature setsdkauthenticationsignature, setStateDescription setstatedescription, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8) {
        this.write = 10;
        this.IconCompatParcelizer = mergejsonobjects;
        this.read = r8lambda4ctur6dhthqrf8ridjfgtumxjy0;
        this.serializer = setsdkauthenticationsignature;
        this.MediaBrowserCompatMediaItem = setstatedescription;
        this.RemoteActionCompatParcelizer = r8lambdahmuf48geqgedwlhl7mczo1q1bv8;
    }

    public static r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 serializer(applyLayoutFeatures applylayoutfeatures, PreferenceGroupAdapter preferenceGroupAdapter, isHiddenannotations ishiddenannotations, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, acquire acquireVar) {
        int i = 2 % 2;
        r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 r8lambdamcfkchlmwyb5a6y_zopzjd5uq4 = new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(9, r8lambdapkx6kfybgp4leowkebovjpb0ug, applylayoutfeatures, preferenceGroupAdapter, ishiddenannotations, acquireVar);
        int i2 = RatingCompat + 23;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdamcfkchlmwyb5a6y_zopzjd5uq4;
    }

    public /* synthetic */ r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.serializer = getcolorintegerornulllambda0;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda1;
        this.read = getcolorintegerornulllambda2;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    public /* synthetic */ r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(int i, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4) {
        this.write = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaBrowserCompatMediaItem = mergejsonobjects2;
        this.read = mergejsonobjects3;
        this.serializer = getcolorintegerornulllambda0;
        this.RemoteActionCompatParcelizer = mergejsonobjects4;
    }

    public r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(mergeJsonObjects mergejsonobjects, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, setSdkAuthenticationSignature setsdkauthenticationsignature, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3) {
        this.write = 0;
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = r8lambdapkx6kfybgp4leowkebovjpb0ug;
        this.RemoteActionCompatParcelizer = setsdkauthenticationsignature;
        this.MediaBrowserCompatMediaItem = mergejsonobjects2;
        this.read = mergejsonobjects3;
    }

    public r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(acquire acquireVar, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, mergeJsonObjects mergejsonobjects, setStateDescription setstatedescription) {
        this.write = 2;
        this.serializer = acquireVar;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RemoteActionCompatParcelizer = androidIndirectPointerEvent_androidKt;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.read = setstatedescription;
    }

    public r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(lambda31 lambda31Var, isHiddenannotations ishiddenannotations, executeQuery executequery, getFailureMessage getfailuremessage, setPresentationView setpresentationview) {
        this.write = 5;
        this.MediaBrowserCompatMediaItem = lambda31Var;
        this.read = ishiddenannotations;
        this.serializer = executequery;
        this.RemoteActionCompatParcelizer = getfailuremessage;
        this.IconCompatParcelizer = setpresentationview;
    }

    public r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(acquire acquireVar, mergeJsonObjects mergejsonobjects, acquire acquireVar2, getFailureMessage getfailuremessage, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.write = 8;
        this.read = acquireVar;
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = acquireVar2;
        this.RemoteActionCompatParcelizer = getfailuremessage;
        this.MediaBrowserCompatMediaItem = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.write;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.MediaBrowserCompatMediaItem;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.serializer;
        mergeJsonObjects mergejsonobjects3 = this.read;
        mergeJsonObjects mergejsonobjects4 = this.IconCompatParcelizer;
        switch (i3) {
            case 0:
                SideMenuRepository sideMenuRepository = (SideMenuRepository) mergejsonobjects4.write();
                GetAppStateImpl getAppStateImpl = (GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write();
                H$b h$b = (H$b) ((setSdkAuthenticationSignature) mergejsonobjects).write();
                r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0 r8lambdaeen0gug5cgviz6wg1os4ujpkt0 = (r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0) mergejsonobjects2.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects3.write();
                sideMenuRepository.getClass();
                getAppStateImpl.getClass();
                h$b.getClass();
                r8lambdaeen0gug5cgviz6wg1os4ujpkt0.getClass();
                settransactionsuccessful.getClass();
                O$b o$b = new O$b();
                o$b.write = sideMenuRepository;
                o$b.RemoteActionCompatParcelizer = getAppStateImpl;
                o$b.serializer = h$b;
                o$b.read = r8lambdaeen0gug5cgviz6wg1os4ujpkt0;
                o$b.IconCompatParcelizer = settransactionsuccessful;
                int i4 = MediaMetadataCompat + 35;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
                return o$b;
            case 1:
                return new com.airbnb.lottie.parser.DropShadowEffect((setShowingTextSubstitution) ((setStateDescription) mergejsonobjects4).write(), (setTextSubstitutiondefault) ((setStateDescription) mergejsonobjects2).write(), (AnalyticsServiceImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) mergejsonobjects3).write(), (Vw$Vw) ((acquire) getcolorintegerornulllambda0).write(), (Parser.Pair) ((acquire) mergejsonobjects).write());
            case 2:
                Vw$Vw vw$Vw = (Vw$Vw) ((acquire) getcolorintegerornulllambda0).write();
                GetUserDataUseCaseImpl getUserDataUseCaseImpl = (GetUserDataUseCaseImpl) mergejsonobjects4.write();
                OtpLogger otpLogger = (OtpLogger) ((AndroidIndirectPointerEvent_androidKt) mergejsonobjects).write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects2.write();
                Path$Companion path$Companion = new Path$Companion();
                setSensitiveData setsensitivedata = (setSensitiveData) mergejsonobjects3.write();
                vw$Vw.getClass();
                getUserDataUseCaseImpl.getClass();
                otpLogger.getClass();
                transfersessionpackagei.getClass();
                setsensitivedata.getClass();
                androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                blockRunner.read = vw$Vw;
                blockRunner.serializer = getUserDataUseCaseImpl;
                blockRunner.RatingCompat = otpLogger;
                blockRunner.write = transfersessionpackagei;
                blockRunner.RemoteActionCompatParcelizer = path$Companion;
                blockRunner.IconCompatParcelizer = setsensitivedata;
                return blockRunner;
            case 3:
                getNoneui_textannotations getnoneui_textannotations = new getNoneui_textannotations((TextIndentKt) mergejsonobjects4.write(), (TextMotion) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects3.write(), (OtpLogger) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda0).write(), (setVerticalStyle) mergejsonobjects.write(), new getQueryContext());
                int i6 = RatingCompat + 21;
                MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 87 / 0;
                }
                return getnoneui_textannotations;
            case 4:
                Vw$Vw vw$Vw2 = (Vw$Vw) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects4).write();
                SignInDataStore signInDataStore = (SignInDataStore) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects2).write();
                H$b h$b2 = (H$b) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects3).write();
                com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) ((readInstallReferrerHuaweiAppGallery) getcolorintegerornulllambda0).write();
                com.huawei.wisesecurity.ucs_credential.g0 g0Var = new com.huawei.wisesecurity.ucs_credential.g0(0);
                Parser.Pair pair = (Parser.Pair) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects).write();
                vw$Vw2.getClass();
                signInDataStore.getClass();
                h$b2.getClass();
                mVar.getClass();
                pair.getClass();
                androidx.lifecycle.BlockRunner blockRunner2 = new androidx.lifecycle.BlockRunner();
                blockRunner2.read = vw$Vw2;
                blockRunner2.serializer = signInDataStore;
                blockRunner2.RatingCompat = h$b2;
                blockRunner2.write = mVar;
                blockRunner2.RemoteActionCompatParcelizer = g0Var;
                blockRunner2.IconCompatParcelizer = pair;
                return blockRunner2;
            case 5:
                return new offsetChildrenVertical((SignInDataStore) ((lambda31) mergejsonobjects2).write(), new SharedResourcePool(24), (N$b) ((isHiddenannotations) mergejsonobjects3).write(), (a9) ((executeQuery) getcolorintegerornulllambda0).write(), (N$b) ((getFailureMessage) mergejsonobjects).write(), (Clock) mergejsonobjects4.write());
            case 6:
                return new com.airbnb.lottie.parser.DropShadowEffect((GetAppStateImpl) ((getInvisibleToUserannotations) getcolorintegerornulllambda0).write(), (RectManager) mergejsonobjects4.write(), (accesssetDispatchTokenp) mergejsonobjects2.write(), (setSensitiveData) mergejsonobjects3.write(), (AppEventInfoChangeHandler) mergejsonobjects.write());
            case 7:
                return new com.airbnb.lottie.parser.DropShadowEffect((com.huawei.agconnect.config.impl.m) ((acquire) getcolorintegerornulllambda0).write(), (setTransactionSuccessful) mergejsonobjects4.write(), (Clock) mergejsonobjects2.write(), (xa) mergejsonobjects3.write(), (setLastHorizontalStyle) mergejsonobjects.write());
            case 8:
                subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = (subscribeToBannersDismissedEventandroid_sdk_base_release) ((acquire) mergejsonobjects3).write();
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) mergejsonobjects4.write();
                RealImageLoaderexecuteresult1 realImageLoaderexecuteresult1 = (RealImageLoaderexecuteresult1) ((acquire) getcolorintegerornulllambda0).write();
                N$b n$b = (N$b) ((getFailureMessage) mergejsonobjects).write();
                GetCustomerPhoneNumberUseCaseImpl getCustomerPhoneNumberUseCaseImpl = (GetCustomerPhoneNumberUseCaseImpl) mergejsonobjects2.write();
                subscribeToBannersUpdates subscribetobannersupdates = resizeToBitmapDimensionslambda1.serializer;
                return new RealImageLoaderexecute2job1(subscribetobannersdismissedeventandroid_sdk_base_release, settransactionsuccessful2, realImageLoaderexecuteresult1, n$b, getCustomerPhoneNumberUseCaseImpl, (SharedResourcePool) subscribetobannersupdates.write(), (SharedResourcePool) subscribetobannersupdates.write(), (SharedResourcePool) subscribetobannersupdates.write(), (SharedResourcePool) subscribetobannersupdates.write());
            case 9:
                return new ShouldNavigateToRiderSafetyPermissions((getPurchaseVerificationCallback) mergejsonobjects4.write(), (disable) mergejsonobjects2.write(), (enableCoppaComplianceInDelay) mergejsonobjects3.write(), (GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write(), (IsSafetyTrackingAllowedUseCase) mergejsonobjects.write());
            default:
                AuthWebViewModel authWebViewModel = new AuthWebViewModel((getPivotOffsetF1C5BW0) mergejsonobjects4.write(), (androidx.lifecycle.BlockRunner) ((r8lambda4ctur6dHthQRF8ridJfgtUMxjY0) mergejsonobjects3).write(), (subscribeToBannersDismissedEventandroid_sdk_base_release) ((setSdkAuthenticationSignature) getcolorintegerornulllambda0).write(), (GetAccessTokenUseCaseImpl) mergejsonobjects2.write(), (unpackInt2) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects).write());
                int i8 = RatingCompat + 3;
                MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return authWebViewModel;
        }
    }
}
