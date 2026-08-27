package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.copyTextdefault;
import o.getSelectableGroup;
import o.getTestTag;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyTwoFaUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final AuthRepository IconCompatParcelizer;
    public final ProcessSuccessfulSignInUseCase read;
    public final IncogniaManagerImpl serializer;

    public VerifyTwoFaUseCaseImpl(ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase, AuthRepository authRepository, IncogniaManagerImpl incogniaManagerImpl) {
        processSuccessfulSignInUseCase.getClass();
        authRepository.getClass();
        incogniaManagerImpl.getClass();
        this.read = processSuccessfulSignInUseCase;
        this.IconCompatParcelizer = authRepository;
        this.serializer = incogniaManagerImpl;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    public final Object m4870invokeyxL6bBk(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        VerifyTwoFaUseCaseImpl$invoke$1 verifyTwoFaUseCaseImpl$invoke$1;
        getSelectableGroup getselectablegroup;
        Object objM4862verifyTwoFaCode0E7RQCE;
        String str5;
        Throwable thSerializer;
        Object objInvoke;
        int i = 2 % 2;
        if (continuationImpl instanceof VerifyTwoFaUseCaseImpl$invoke$1) {
            verifyTwoFaUseCaseImpl$invoke$1 = (VerifyTwoFaUseCaseImpl$invoke$1) continuationImpl;
            int i2 = verifyTwoFaUseCaseImpl$invoke$1.RatingCompat;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 101;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                verifyTwoFaUseCaseImpl$invoke$1.RatingCompat = i2 - Integer.MIN_VALUE;
            } else {
                verifyTwoFaUseCaseImpl$invoke$1 = new VerifyTwoFaUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            verifyTwoFaUseCaseImpl$invoke$1 = new VerifyTwoFaUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = verifyTwoFaUseCaseImpl$invoke$1.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = verifyTwoFaUseCaseImpl$invoke$1.RatingCompat;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            verifyTwoFaUseCaseImpl$invoke$1.IconCompatParcelizer = str;
            verifyTwoFaUseCaseImpl$invoke$1.write = str2;
            verifyTwoFaUseCaseImpl$invoke$1.read = str3;
            verifyTwoFaUseCaseImpl$invoke$1.serializer = str4;
            verifyTwoFaUseCaseImpl$invoke$1.RatingCompat = 1;
            obj = this.serializer.read(verifyTwoFaUseCaseImpl$invoke$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            str4 = verifyTwoFaUseCaseImpl$invoke$1.serializer;
            str3 = verifyTwoFaUseCaseImpl$invoke$1.read;
            str2 = verifyTwoFaUseCaseImpl$invoke$1.write;
            str = verifyTwoFaUseCaseImpl$invoke$1.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getselectablegroup = verifyTwoFaUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            str5 = verifyTwoFaUseCaseImpl$invoke$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4862verifyTwoFaCode0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        thSerializer = onItemDismiss.serializer(objM4862verifyTwoFaCode0E7RQCE);
        if (thSerializer == null) {
            return new isItemDismissable(thSerializer);
        }
        String str6 = getselectablegroup.data.phone;
        verifyTwoFaUseCaseImpl$invoke$1.IconCompatParcelizer = null;
        verifyTwoFaUseCaseImpl$invoke$1.write = null;
        verifyTwoFaUseCaseImpl$invoke$1.read = null;
        verifyTwoFaUseCaseImpl$invoke$1.serializer = null;
        verifyTwoFaUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
        verifyTwoFaUseCaseImpl$invoke$1.RatingCompat = 3;
        objInvoke = this.read.invoke((copyTextdefault) objM4862verifyTwoFaCode0E7RQCE, str6, str5, verifyTwoFaUseCaseImpl$invoke$1);
        if (objInvoke != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objInvoke;
        getselectablegroup = new getSelectableGroup(new getTestTag(str, str3), str2);
        verifyTwoFaUseCaseImpl$invoke$1.IconCompatParcelizer = null;
        verifyTwoFaUseCaseImpl$invoke$1.write = null;
        verifyTwoFaUseCaseImpl$invoke$1.read = null;
        verifyTwoFaUseCaseImpl$invoke$1.serializer = str4;
        verifyTwoFaUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = getselectablegroup;
        verifyTwoFaUseCaseImpl$invoke$1.RatingCompat = 2;
        objM4862verifyTwoFaCode0E7RQCE = this.IconCompatParcelizer.m4862verifyTwoFaCode0E7RQCE(getselectablegroup, (String) obj, verifyTwoFaUseCaseImpl$invoke$1);
        if (objM4862verifyTwoFaCode0E7RQCE != coroutineSingletons) {
            int i6 = RemoteActionCompatParcelizer + 59;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            str5 = str4;
            thSerializer = onItemDismiss.serializer(objM4862verifyTwoFaCode0E7RQCE);
            if (thSerializer == null) {
                return new isItemDismissable(thSerializer);
            }
            String str7 = getselectablegroup.data.phone;
            verifyTwoFaUseCaseImpl$invoke$1.IconCompatParcelizer = null;
            verifyTwoFaUseCaseImpl$invoke$1.write = null;
            verifyTwoFaUseCaseImpl$invoke$1.read = null;
            verifyTwoFaUseCaseImpl$invoke$1.serializer = null;
            verifyTwoFaUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
            verifyTwoFaUseCaseImpl$invoke$1.RatingCompat = 3;
            objInvoke = this.read.invoke((copyTextdefault) objM4862verifyTwoFaCode0E7RQCE, str7, str5, verifyTwoFaUseCaseImpl$invoke$1);
            if (objInvoke != coroutineSingletons) {
                return objInvoke;
            }
        }
        return coroutineSingletons;
    }
}
