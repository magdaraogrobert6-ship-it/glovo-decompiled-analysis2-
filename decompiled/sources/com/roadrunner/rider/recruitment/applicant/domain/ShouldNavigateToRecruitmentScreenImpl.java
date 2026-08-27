package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.RectManager;
import o.SemanticsPropertiesContentDescription1;
import o.isInForeground;
import o.metaMarkUpdatedAndHasCallbacks;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class ShouldNavigateToRecruitmentScreenImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final RectManager IconCompatParcelizer;
    public final SemanticsPropertiesContentDescription1 read;
    public final Lazy serializer;
    public final transferSessionPackageI write;

    public ShouldNavigateToRecruitmentScreenImpl(RectManager rectManager, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, Lazy lazy, transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = rectManager;
        this.read = semanticsPropertiesContentDescription1;
        this.serializer = lazy;
        this.write = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        isInForeground isinforeground;
        int i = 2 % 2;
        if (continuationImpl instanceof isInForeground) {
            isinforeground = (isInForeground) continuationImpl;
            int i2 = isinforeground.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 117;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                isinforeground.read = i3 % 2 != 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                isinforeground = new isInForeground(this, continuationImpl);
            }
        } else {
            isinforeground = new isInForeground(this, continuationImpl);
        }
        Object objInvoke = isinforeground.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = isinforeground.read;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (!((FirebaseRemoteConfigImpl) this.write).IconCompatParcelizer(updateAdidI.IS_RIDER_RECRUITMENT_PHASE_2_AUTO_LOGIN_ENABLED)) {
                Boolean bool = Boolean.FALSE;
                int i5 = MediaDescriptionCompat + 65;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return bool;
            }
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = this.IconCompatParcelizer.serializer();
            if (metamarkupdatedandhascallbacksSerializer != null) {
                if (metamarkupdatedandhascallbacksSerializer.registerUrl == null) {
                    return Boolean.FALSE;
                }
                isinforeground.read = 1;
                objInvoke = ((IsUserSignedInImpl) this.read).invoke(isinforeground);
                if (objInvoke != coroutineSingletons) {
                }
            }
            int i7 = RemoteActionCompatParcelizer + 37;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return Boolean.FALSE;
            }
            int i8 = 92 / 0;
            return Boolean.FALSE;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return objInvoke;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            IsApplicantSessionAvailableUseCaseImpl isApplicantSessionAvailableUseCaseImpl = (IsApplicantSessionAvailableUseCaseImpl) this.serializer.write();
            isinforeground.read = 2;
            Object objInvoke2 = isApplicantSessionAvailableUseCaseImpl.invoke(isinforeground);
            return objInvoke2 == coroutineSingletons ? coroutineSingletons : objInvoke2;
        }
        Boolean bool2 = Boolean.FALSE;
        int i9 = MediaDescriptionCompat + 121;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return bool2;
        }
        throw null;
    }
}
