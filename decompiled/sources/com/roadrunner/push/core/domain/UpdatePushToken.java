package com.roadrunner.push.core.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.push.core.domain.work.InvalidSessionException;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.recruitment.applicant.domain.IsApplicantSessionAvailableUseCaseImpl;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdatePushToken {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final GetAppStateImpl IconCompatParcelizer;
    public final UpdateApplicantPushToken read;
    public final IsUserAuthenticatedWrapper serializer;
    public final Lazy write;

    public UpdatePushToken(Lazy lazy, IsUserAuthenticatedWrapper isUserAuthenticatedWrapper, UpdateApplicantPushToken updateApplicantPushToken, GetAppStateImpl getAppStateImpl) {
        this.write = lazy;
        this.serializer = isUserAuthenticatedWrapper;
        this.read = updateApplicantPushToken;
        this.IconCompatParcelizer = getAppStateImpl;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5006invokegIAlus(String str, ContinuationImpl continuationImpl) {
        UpdatePushToken$invoke$1 updatePushToken$invoke$1;
        Object objM5005invokegIAlus;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 43;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof UpdatePushToken$invoke$1;
            throw null;
        }
        if (continuationImpl instanceof UpdatePushToken$invoke$1) {
            updatePushToken$invoke$1 = (UpdatePushToken$invoke$1) continuationImpl;
            int i4 = updatePushToken$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                updatePushToken$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                updatePushToken$invoke$1 = new UpdatePushToken$invoke$1(this, continuationImpl);
            }
        } else {
            updatePushToken$invoke$1 = new UpdatePushToken$invoke$1(this, continuationImpl);
        }
        Object objInvoke = updatePushToken$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = updatePushToken$invoke$1.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            updatePushToken$invoke$1.read = str;
            updatePushToken$invoke$1.RemoteActionCompatParcelizer = 1;
            objInvoke = this.serializer.invoke(updatePushToken$invoke$1);
            if (objInvoke == coroutineSingletons) {
                int i6 = RemoteActionCompatParcelizer + 99;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    str = updatePushToken$invoke$1.read;
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                } else if (i5 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            return ((onItemDismiss) objInvoke).IconCompatParcelizer;
        }
        str = updatePushToken$invoke$1.read;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (((Boolean) objInvoke).booleanValue()) {
            return new isItemDismissable(new InvalidSessionException("Push registration requires session from either applicant or rider"));
        }
        updatePushToken$invoke$1.read = null;
        updatePushToken$invoke$1.RemoteActionCompatParcelizer = 4;
        objM5005invokegIAlus = this.read.m5005invokegIAlus(str, updatePushToken$invoke$1);
        if (objM5005invokegIAlus != coroutineSingletons) {
            i = MediaBrowserCompatMediaItem + 89;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i8 = 98 / 0;
            }
            return objM5005invokegIAlus;
        }
        return coroutineSingletons;
        if (((Boolean) objInvoke).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 63;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            updatePushToken$invoke$1.read = null;
            updatePushToken$invoke$1.RemoteActionCompatParcelizer = 2;
            Object objM5010invokegIAlus = this.IconCompatParcelizer.m5010invokegIAlus(str, updatePushToken$invoke$1);
            if (objM5010invokegIAlus != coroutineSingletons) {
                return objM5010invokegIAlus;
            }
        } else {
            IsApplicantSessionAvailableUseCaseImpl isApplicantSessionAvailableUseCaseImpl = (IsApplicantSessionAvailableUseCaseImpl) this.write.write();
            updatePushToken$invoke$1.read = str;
            updatePushToken$invoke$1.RemoteActionCompatParcelizer = 3;
            objInvoke = isApplicantSessionAvailableUseCaseImpl.invoke(updatePushToken$invoke$1);
            if (objInvoke != coroutineSingletons) {
                if (((Boolean) objInvoke).booleanValue()) {
                    return new isItemDismissable(new InvalidSessionException("Push registration requires session from either applicant or rider"));
                }
                updatePushToken$invoke$1.read = null;
                updatePushToken$invoke$1.RemoteActionCompatParcelizer = 4;
                objM5005invokegIAlus = this.read.m5005invokegIAlus(str, updatePushToken$invoke$1);
                if (objM5005invokegIAlus != coroutineSingletons) {
                    i = MediaBrowserCompatMediaItem + 89;
                    RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i11 = 98 / 0;
                    }
                    return objM5005invokegIAlus;
                }
            }
        }
        return coroutineSingletons;
    }
}
