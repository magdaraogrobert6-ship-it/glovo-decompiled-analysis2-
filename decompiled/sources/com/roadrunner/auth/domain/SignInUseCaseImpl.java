package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.mapbox.navigator.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BrazeExternalSyntheticLambda5;
import o.QueryResultCompanion;
import o.SemanticsOwner;
import o.SqlCursor;
import o.getHeading;
import o.getRootInfoui;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.verifyPlayStorePurchaseI;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInUseCaseImpl implements getHeading {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final SemanticsOwner IconCompatParcelizer;
    public final C$b MediaSessionCompatQueueItem;
    public final ProcessSuccessfulSignInUseCase RatingCompat;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final g0 read;
    public final AuthenticateWith2FaUseCase serializer;
    public final AuthenticateUseCase write;

    public SignInUseCaseImpl(AuthenticateUseCase authenticateUseCase, transferSessionPackageI transfersessionpackagei, SemanticsOwner semanticsOwner, AuthenticateWith2FaUseCase authenticateWith2FaUseCase, ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase, g0 g0Var, C$b c$b) {
        authenticateUseCase.getClass();
        transfersessionpackagei.getClass();
        semanticsOwner.getClass();
        authenticateWith2FaUseCase.getClass();
        processSuccessfulSignInUseCase.getClass();
        g0Var.getClass();
        c$b.getClass();
        this.write = authenticateUseCase;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.IconCompatParcelizer = semanticsOwner;
        this.serializer = authenticateWith2FaUseCase;
        this.RatingCompat = processSuccessfulSignInUseCase;
        this.read = g0Var;
        this.MediaSessionCompatQueueItem = c$b;
    }

    public final Object IconCompatParcelizer(String str, String str2, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        C$b c$b = this.MediaSessionCompatQueueItem;
        QueryResultCompanion queryResultCompanion = (QueryResultCompanion) c$b.serializer;
        str.getClass();
        Object[] objArr = {(FirebaseRemoteConfigImpl) ((transferSessionPackageI) c$b.write)};
        int iSerializer = R.serializer();
        int i4 = SqlCursor.write[((verifyPlayStorePurchaseI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(-383819351, R.serializer(), R.serializer(), 383819352, R.serializer(), iSerializer, objArr)).ordinal()];
        if (i4 != 1) {
            int i5 = MediaDescriptionCompat;
            int i6 = i5 + 103;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i4 != 2 : i4 != 5) {
                int i7 = i5 + 119;
                int i8 = i7 % Fields.SpotShadowColor;
                MediaMetadataCompat = i8;
                int i9 = i7 % 2;
                if (i4 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i10 = i8 + 5;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ((BrazeExternalSyntheticLambda5) c$b.IconCompatParcelizer).getClass();
                if (BrazeExternalSyntheticLambda5.RemoteActionCompatParcelizer(str)) {
                    str = queryResultCompanion.IconCompatParcelizer(str);
                }
            }
        } else {
            str = queryResultCompanion.IconCompatParcelizer(str);
        }
        ((getRootInfoui) this.IconCompatParcelizer).serializer("authenticate_api");
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOGIN_2FA_ENABLED)) {
            return processAuthenticateWithout2Fa(str, str2, continuationImpl);
        }
        int i12 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return processAuthenticateWith2Fa(str, str2, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r10 == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAuthenticateWithout2Fa(java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.getTextLayoutResultdefault
            if (r1 == 0) goto L1f
            r1 = r10
            o.getTextLayoutResultdefault r1 = (o.getTextLayoutResultdefault) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r10 = com.roadrunner.auth.domain.SignInUseCaseImpl.MediaMetadataCompat
            int r10 = r10 + 19
            int r4 = r10 % 128
            com.roadrunner.auth.domain.SignInUseCaseImpl.MediaDescriptionCompat = r4
            int r10 = r10 % r0
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L24
        L1f:
            o.getTextLayoutResultdefault r1 = new o.getTextLayoutResultdefault
            r1.<init>(r7, r10)
        L24:
            java.lang.Object r10 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L55
            if (r3 == r4) goto L49
            if (r3 != r0) goto L43
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            int r8 = com.roadrunner.auth.domain.SignInUseCaseImpl.MediaDescriptionCompat
            int r8 = r8 + 23
            int r9 = r8 % 128
            com.roadrunner.auth.domain.SignInUseCaseImpl.MediaMetadataCompat = r9
            int r8 = r8 % r0
            if (r8 == 0) goto L90
            r8 = 4
            int r8 = r8 / r8
            goto L90
        L43:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L49:
            java.lang.String r9 = r1.write
            java.lang.String r8 = r1.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.onItemDismiss r10 = (o.onItemDismiss) r10
            java.lang.Object r10 = r10.IconCompatParcelizer
            goto L70
        L55:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r1.serializer = r8
            r1.write = r9
            r1.RemoteActionCompatParcelizer = r4
            com.roadrunner.auth.domain.AuthenticateUseCase r10 = r7.write
            java.lang.Object r10 = r10.m4867invoke0E7RQCE(r8, r9, r1)
            if (r10 != r2) goto L70
            int r8 = com.roadrunner.auth.domain.SignInUseCaseImpl.MediaDescriptionCompat
            int r8 = r8 + 25
            int r9 = r8 % 128
            com.roadrunner.auth.domain.SignInUseCaseImpl.MediaMetadataCompat = r9
            int r8 = r8 % r0
            goto L8f
        L70:
            java.lang.Throwable r3 = o.onItemDismiss.serializer(r10)
            o.SemanticsOwner r4 = r7.IconCompatParcelizer
            java.lang.String r6 = "authenticate_api"
            if (r3 != 0) goto L93
            o.copyTextdefault r10 = (o.copyTextdefault) r10
            o.getRootInfoui r4 = (o.getRootInfoui) r4
            r4.write(r6)
            r1.serializer = r5
            r1.write = r5
            r1.RemoteActionCompatParcelizer = r0
            com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase r0 = r7.RatingCompat
            java.lang.Object r10 = r0.invoke(r10, r8, r9, r1)
            if (r10 != r2) goto L90
        L8f:
            return r2
        L90:
            o.getIsTraversalGroup r10 = (o.getIsTraversalGroup) r10
            return r10
        L93:
            o.getRootInfoui r4 = (o.getRootInfoui) r4
            r4.RemoteActionCompatParcelizer(r6)
            o.getLiveRegion r8 = new o.getLiveRegion
            r8.<init>(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.SignInUseCaseImpl.processAuthenticateWithout2Fa(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        if (r3 == r6) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAuthenticateWith2Fa(java.lang.String r32, java.lang.String r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.SignInUseCaseImpl.processAuthenticateWith2Fa(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
