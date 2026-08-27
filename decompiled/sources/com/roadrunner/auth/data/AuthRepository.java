package com.roadrunner.auth.data;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C0159dialog;
import o.SemanticsPropertiesHideFromAccessibility1;
import o.ShortNewsContentCardView;
import o.clearTextSubstitution;
import o.collapsedefault;
import o.dismiss;
import o.dismissdefault;
import o.getHoldoutVariationName;
import o.getSelectableGroup;
import o.isItemDismissable;
import o.lottieComposition;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.withRect;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final SemanticsPropertiesHideFromAccessibility1 IconCompatParcelizer;
    public final withRect MediaBrowserCompatMediaItem;
    public final MapApiError MediaDescriptionCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final ExecuteTwoFaApiRequest RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final LocalAuthDataSource serializer;
    public final lottieComposition write;

    public AuthRepository(SemanticsPropertiesHideFromAccessibility1 semanticsPropertiesHideFromAccessibility1, ExecuteApiRequest executeApiRequest, LocalAuthDataSource localAuthDataSource, withRect withrect, lottieComposition lottiecomposition, MapApiError mapApiError, transferSessionPackageI transfersessionpackagei, ExecuteTwoFaApiRequest executeTwoFaApiRequest) {
        semanticsPropertiesHideFromAccessibility1.getClass();
        executeApiRequest.getClass();
        localAuthDataSource.getClass();
        withrect.getClass();
        lottiecomposition.getClass();
        mapApiError.getClass();
        transfersessionpackagei.getClass();
        executeTwoFaApiRequest.getClass();
        this.IconCompatParcelizer = semanticsPropertiesHideFromAccessibility1;
        this.read = executeApiRequest;
        this.serializer = localAuthDataSource;
        this.MediaBrowserCompatMediaItem = withrect;
        this.write = lottiecomposition;
        this.MediaDescriptionCompat = mapApiError;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = executeTwoFaApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: logoutUser-gIAlu-s, reason: not valid java name */
    public final Object m4860logoutUsergIAlus(C0159dialog c0159dialog, ContinuationImpl continuationImpl) {
        AuthRepository$logoutUser$1 authRepository$logoutUser$1;
        int i = 2 % 2;
        if (continuationImpl instanceof AuthRepository$logoutUser$1) {
            int i2 = MediaMetadataCompat + 85;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            authRepository$logoutUser$1 = (AuthRepository$logoutUser$1) continuationImpl;
            int i4 = authRepository$logoutUser$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                authRepository$logoutUser$1.read = i4 - Integer.MIN_VALUE;
            } else {
                authRepository$logoutUser$1 = new AuthRepository$logoutUser$1(this, continuationImpl);
            }
        } else {
            authRepository$logoutUser$1 = new AuthRepository$logoutUser$1(this, continuationImpl);
        }
        Object obj = authRepository$logoutUser$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = authRepository$logoutUser$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, c0159dialog, shortNewsContentCardView, 0);
            authRepository$logoutUser$1.read = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(authRepository$logoutUser$2, authRepository$logoutUser$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i6 = RatingCompat + 19;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        int i7 = MediaMetadataCompat + 41;
        int i8 = i7 % Fields.SpotShadowColor;
        RatingCompat = i8;
        int i9 = i7 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i10 = RatingCompat + 3;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i11 = i8 + 39;
        MediaMetadataCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX INFO: renamed from: authenticateUser-0E7RQCE, reason: not valid java name */
    public final Object m4858authenticateUser0E7RQCE(collapsedefault collapsedefaultVar, String str, ContinuationImpl continuationImpl) {
        AuthRepository$authenticateUser$1 authRepository$authenticateUser$1;
        int i = 2 % 2;
        Object obj = null;
        if (!(continuationImpl instanceof AuthRepository$authenticateUser$1)) {
            authRepository$authenticateUser$1 = new AuthRepository$authenticateUser$1(this, continuationImpl);
            int i2 = RatingCompat + 31;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            int i4 = MediaMetadataCompat + 35;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = ((AuthRepository$authenticateUser$1) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            authRepository$authenticateUser$1 = (AuthRepository$authenticateUser$1) continuationImpl;
            int i6 = authRepository$authenticateUser$1.read;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                authRepository$authenticateUser$1.read = i6 - Integer.MIN_VALUE;
            } else {
                authRepository$authenticateUser$1 = new AuthRepository$authenticateUser$1(this, continuationImpl);
                int i7 = RatingCompat + 31;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        Object obj2 = authRepository$authenticateUser$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = authRepository$authenticateUser$1.read;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, collapsedefaultVar, str, null, 6);
            authRepository$authenticateUser$1.read = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(anonymousClass2, authRepository$authenticateUser$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i10 = RatingCompat + 89;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return coroutineSingletons;
        }
        if (i9 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i12 = MediaMetadataCompat + 5;
        RatingCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            return ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        Object obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: authenticateUserWith2Fa-0E7RQCE, reason: not valid java name */
    public final Object m4859authenticateUserWith2Fa0E7RQCE(clearTextSubstitution cleartextsubstitution, String str, ContinuationImpl continuationImpl) {
        AuthRepository$authenticateUserWith2Fa$1 authRepository$authenticateUserWith2Fa$1;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof AuthRepository$authenticateUserWith2Fa$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof AuthRepository$authenticateUserWith2Fa$1) {
            authRepository$authenticateUserWith2Fa$1 = (AuthRepository$authenticateUserWith2Fa$1) continuationImpl;
            int i3 = authRepository$authenticateUserWith2Fa$1.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaMetadataCompat + 113;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                authRepository$authenticateUserWith2Fa$1.read = i3 - Integer.MIN_VALUE;
            } else {
                authRepository$authenticateUserWith2Fa$1 = new AuthRepository$authenticateUserWith2Fa$1(this, continuationImpl);
            }
        } else {
            authRepository$authenticateUserWith2Fa$1 = new AuthRepository$authenticateUserWith2Fa$1(this, continuationImpl);
        }
        Object obj2 = authRepository$authenticateUserWith2Fa$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = authRepository$authenticateUserWith2Fa$1.read;
        if (i6 != 0) {
            int i7 = RatingCompat + 59;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, cleartextsubstitution, str, null, 7);
        authRepository$authenticateUserWith2Fa$1.read = 1;
        Object objM4875invokegIAlus = this.read.m4875invokegIAlus(anonymousClass2, authRepository$authenticateUserWith2Fa$1);
        if (objM4875invokegIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i9 = RatingCompat + 77;
        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return objM4875invokegIAlus;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: verifyMagicLink-0E7RQCE, reason: not valid java name */
    public final Object m4861verifyMagicLink0E7RQCE(dismiss dismissVar, String str, ContinuationImpl continuationImpl) {
        AuthRepository$verifyMagicLink$1 authRepository$verifyMagicLink$1;
        int i = 2 % 2;
        if (!(!(continuationImpl instanceof AuthRepository$verifyMagicLink$1))) {
            authRepository$verifyMagicLink$1 = (AuthRepository$verifyMagicLink$1) continuationImpl;
            int i2 = authRepository$verifyMagicLink$1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authRepository$verifyMagicLink$1.read = i2 - Integer.MIN_VALUE;
                int i3 = RatingCompat + 13;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                authRepository$verifyMagicLink$1 = new AuthRepository$verifyMagicLink$1(this, continuationImpl);
            }
        } else {
            authRepository$verifyMagicLink$1 = new AuthRepository$verifyMagicLink$1(this, continuationImpl);
        }
        Object obj = authRepository$verifyMagicLink$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = authRepository$verifyMagicLink$1.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, dismissVar, str, null, 8);
            authRepository$verifyMagicLink$1.read = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(anonymousClass2, authRepository$verifyMagicLink$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = RatingCompat + 17;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = MediaMetadataCompat + 77;
        RatingCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        throw null;
    }

    public final Object IconCompatParcelizer(dismissdefault dismissdefaultVar, String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        dismissdefaultVar.getClass();
        try {
            getHoldoutVariationName getholdoutvariationnameRemoteActionCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(dismissdefaultVar, str).RemoteActionCompatParcelizer();
            getholdoutvariationnameRemoteActionCompatParcelizer.getClass();
            if (getholdoutvariationnameRemoteActionCompatParcelizer.rawResponse.isSuccessful) {
                int i4 = MediaMetadataCompat + 1;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object obj = getholdoutvariationnameRemoteActionCompatParcelizer.body;
                if (obj != null) {
                    return obj;
                }
                throw new IllegalArgumentException("The response and body should not be null");
            }
            HttpException httpException = new HttpException(getholdoutvariationnameRemoteActionCompatParcelizer);
            if (httpException.read != 401) {
                int i6 = RatingCompat + 67;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(httpException);
            }
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem;
            firebaseRemoteConfigImpl.getClass();
            return firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED) ? new isItemDismissable(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(httpException)) : new isItemDismissable(httpException);
        } catch (Exception e) {
            return new isItemDismissable(new IOException("Token refresh failed", e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: verifyTwoFaCode-0E7RQCE, reason: not valid java name */
    public final Object m4862verifyTwoFaCode0E7RQCE(getSelectableGroup getselectablegroup, String str, ContinuationImpl continuationImpl) {
        AuthRepository$verifyTwoFaCode$1 authRepository$verifyTwoFaCode$1;
        Object objM4863invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof AuthRepository$verifyTwoFaCode$1) {
            int i2 = RatingCompat + 9;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            authRepository$verifyTwoFaCode$1 = (AuthRepository$verifyTwoFaCode$1) continuationImpl;
            int i4 = authRepository$verifyTwoFaCode$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                authRepository$verifyTwoFaCode$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                authRepository$verifyTwoFaCode$1 = new AuthRepository$verifyTwoFaCode$1(this, continuationImpl);
            }
        } else {
            authRepository$verifyTwoFaCode$1 = new AuthRepository$verifyTwoFaCode$1(this, continuationImpl);
        }
        Object obj = authRepository$verifyTwoFaCode$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = authRepository$verifyTwoFaCode$1.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = MediaMetadataCompat + 11;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getselectablegroup = authRepository$verifyTwoFaCode$1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4863invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            String str2 = getselectablegroup.flowId;
            forest.getClass();
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, getselectablegroup, str, null, 9);
            authRepository$verifyTwoFaCode$1.RemoteActionCompatParcelizer = getselectablegroup;
            authRepository$verifyTwoFaCode$1.IconCompatParcelizer = 1;
            objM4863invokegIAlus = this.RemoteActionCompatParcelizer.m4863invokegIAlus(anonymousClass2, authRepository$verifyTwoFaCode$1);
            if (objM4863invokegIAlus == coroutineSingletons) {
                int i8 = MediaMetadataCompat + 111;
                RatingCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        if (!(objM4863invokegIAlus instanceof isItemDismissable)) {
            int i10 = MediaMetadataCompat + 49;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("verifyFaCode: API verify code request succeed for flowId=", getselectablegroup.flowId), new Object[0]);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4863invokegIAlus);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("verifyFaCode: API request failed for flowId=", getselectablegroup.flowId), new Object[0]);
            int i12 = RatingCompat + 97;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return objM4863invokegIAlus;
    }
}
