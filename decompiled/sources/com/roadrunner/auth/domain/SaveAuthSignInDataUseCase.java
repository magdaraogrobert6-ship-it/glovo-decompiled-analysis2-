package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler45;
import o.boundingRectInRoot;
import o.createFromParcel;
import o.getStateDescriptiondelegate;
import o.getTraversalIndexdelegate;
import o.isOffline;
import o.isOnline;
import o.metaMarkUpdatedAndHasCallbacks;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveAuthSignInDataUseCase {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final isOffline IconCompatParcelizer;
    public final SaveAuthDataUseCase RemoteActionCompatParcelizer;
    public final SaveSignInDataUseCaseImpl read;
    public final isOnline serializer;
    public final boundingRectInRoot write;

    public SaveAuthSignInDataUseCase(SaveAuthDataUseCase saveAuthDataUseCase, isOnline isonline, boundingRectInRoot boundingrectinroot, isOffline isoffline, SaveSignInDataUseCaseImpl saveSignInDataUseCaseImpl) {
        saveAuthDataUseCase.getClass();
        isonline.getClass();
        boundingrectinroot.getClass();
        isoffline.getClass();
        saveSignInDataUseCaseImpl.getClass();
        this.RemoteActionCompatParcelizer = saveAuthDataUseCase;
        this.serializer = isonline;
        this.write = boundingrectinroot;
        this.IconCompatParcelizer = isoffline;
        this.read = saveSignInDataUseCaseImpl;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    public final Object storeApplicantData(getTraversalIndexdelegate gettraversalindexdelegate, ContinuationImpl continuationImpl) {
        getStateDescriptiondelegate getstatedescriptiondelegate;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks;
        getTraversalIndexdelegate gettraversalindexdelegate2 = gettraversalindexdelegate;
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 55;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof getStateDescriptiondelegate;
            throw null;
        }
        if (continuationImpl instanceof getStateDescriptiondelegate) {
            int i4 = i2 + 107;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = ((getStateDescriptiondelegate) continuationImpl).serializer;
                obj.hashCode();
                throw null;
            }
            getstatedescriptiondelegate = (getStateDescriptiondelegate) continuationImpl;
            int i6 = getstatedescriptiondelegate.serializer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                getstatedescriptiondelegate.serializer = i6 - Integer.MIN_VALUE;
                int i7 = MediaSessionCompatQueueItem + 87;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                getstatedescriptiondelegate = new getStateDescriptiondelegate(this, continuationImpl);
            }
        } else {
            getstatedescriptiondelegate = new getStateDescriptiondelegate(this, continuationImpl);
        }
        Object obj2 = getstatedescriptiondelegate.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = getstatedescriptiondelegate.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksWrite = this.write.write();
            ActivityHandler45 activityHandler45 = new ActivityHandler45(gettraversalindexdelegate2.expiresIn, gettraversalindexdelegate2.accessToken, gettraversalindexdelegate2.refreshToken, gettraversalindexdelegate2.deviceToken, metamarkupdatedandhascallbacksWrite.countryCode, gettraversalindexdelegate2.userId);
            getstatedescriptiondelegate.read = metamarkupdatedandhascallbacksWrite;
            getstatedescriptiondelegate.write = gettraversalindexdelegate2;
            getstatedescriptiondelegate.serializer = 1;
            Object objStoreApplicantData = this.IconCompatParcelizer.RemoteActionCompatParcelizer.storeApplicantData(activityHandler45, getstatedescriptiondelegate);
            if (objStoreApplicantData != coroutineSingletons) {
                objStoreApplicantData = createfromparcel;
            }
            if (objStoreApplicantData == coroutineSingletons) {
                int i10 = MediaSessionCompatQueueItem + 11;
                RatingCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
            metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacksWrite;
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gettraversalindexdelegate2 = getstatedescriptiondelegate.write;
            metamarkupdatedandhascallbacks = getstatedescriptiondelegate.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        this.serializer.serializer(gettraversalindexdelegate2.userId, metamarkupdatedandhascallbacks.countryCode);
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r20.read.invoke(r2, r1, r5) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (r20.RemoteActionCompatParcelizer.invoke(r23, r5) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r1 = com.roadrunner.auth.domain.SaveAuthSignInDataUseCase.MediaSessionCompatQueueItem + 55;
        com.roadrunner.auth.domain.SaveAuthSignInDataUseCase.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        return r9;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ff, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r21, java.lang.String r22, o.getTraversalIndexdelegate r23, o.getIsTraversalGroup r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.SaveAuthSignInDataUseCase.invoke(java.lang.String, java.lang.String, o.getTraversalIndexdelegate, o.getIsTraversalGroup, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
