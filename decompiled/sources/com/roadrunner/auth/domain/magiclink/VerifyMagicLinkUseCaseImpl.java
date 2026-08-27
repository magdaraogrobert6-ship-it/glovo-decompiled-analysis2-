package com.roadrunner.auth.domain.magiclink;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.boundingRectInRoot;
import o.copyTextdefault;
import o.getCustomActionsdelegate;
import o.getDisabled;
import o.getInputTextSuggestionState;
import o.getTraversalIndexdelegate;
import o.isSensitiveDatadelegate;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMagicLinkUseCaseImpl implements getInputTextSuggestionState {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final p0 MediaBrowserCompatMediaItem;
    public final IncogniaManagerImpl MediaDescriptionCompat;
    public final getCustomActionsdelegate MediaMetadataCompat;
    public final getDisabled MediaSessionCompatQueueItem;
    public final SaveAuthDataUseCase ParcelableVolumeInfo;
    public final boundingRectInRoot RatingCompat;
    public final AuthRepository RemoteActionCompatParcelizer;
    public final AppEventInfoChangeHandler read;
    public final FetchRemoteConfigUseCaseImpl serializer;
    public final FetchRiderStatusImpl write;

    public VerifyMagicLinkUseCaseImpl(boundingRectInRoot boundingrectinroot, p0 p0Var, AuthRepository authRepository, SaveAuthDataUseCase saveAuthDataUseCase, getCustomActionsdelegate getcustomactionsdelegate, FetchRiderStatusImpl fetchRiderStatusImpl, getDisabled getdisabled, AppEventInfoChangeHandler appEventInfoChangeHandler, FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, IncogniaManagerImpl incogniaManagerImpl, transferSessionPackageI transfersessionpackagei) {
        boundingrectinroot.getClass();
        p0Var.getClass();
        authRepository.getClass();
        saveAuthDataUseCase.getClass();
        getcustomactionsdelegate.getClass();
        fetchRiderStatusImpl.getClass();
        getdisabled.getClass();
        appEventInfoChangeHandler.getClass();
        fetchRemoteConfigUseCaseImpl.getClass();
        incogniaManagerImpl.getClass();
        transfersessionpackagei.getClass();
        this.RatingCompat = boundingrectinroot;
        this.MediaBrowserCompatMediaItem = p0Var;
        this.RemoteActionCompatParcelizer = authRepository;
        this.ParcelableVolumeInfo = saveAuthDataUseCase;
        this.MediaMetadataCompat = getcustomactionsdelegate;
        this.write = fetchRiderStatusImpl;
        this.MediaSessionCompatQueueItem = getdisabled;
        this.read = appEventInfoChangeHandler;
        this.serializer = fetchRemoteConfigUseCaseImpl;
        this.MediaDescriptionCompat = incogniaManagerImpl;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final Object saveAuthData(copyTextdefault copytextdefault, ContinuationImpl continuationImpl) {
        isSensitiveDatadelegate issensitivedatadelegate;
        getTraversalIndexdelegate gettraversalindexdelegate;
        int i = 2 % 2;
        if (continuationImpl instanceof isSensitiveDatadelegate) {
            issensitivedatadelegate = (isSensitiveDatadelegate) continuationImpl;
            int i2 = issensitivedatadelegate.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatResultReceiverWrapper + 41;
                PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                issensitivedatadelegate.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                issensitivedatadelegate = new isSensitiveDatadelegate(this, continuationImpl);
            }
        } else {
            issensitivedatadelegate = new isSensitiveDatadelegate(this, continuationImpl);
        }
        Object obj = issensitivedatadelegate.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = issensitivedatadelegate.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.MediaBrowserCompatMediaItem.getClass();
            getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = getTraversalIndexdelegate.RemoteActionCompatParcelizer(p0.IconCompatParcelizer(copytextdefault), null, null, 0L, true, null, null, null, null, null, 261119);
            issensitivedatadelegate.write = gettraversalindexdelegateRemoteActionCompatParcelizer;
            issensitivedatadelegate.IconCompatParcelizer = 1;
            if (this.ParcelableVolumeInfo.invoke(gettraversalindexdelegateRemoteActionCompatParcelizer, issensitivedatadelegate) == coroutineSingletons) {
                int i6 = PlaybackStateCompatCustomAction;
                int i7 = i6 + 29;
                MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i6 + 63;
                MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
            gettraversalindexdelegate = gettraversalindexdelegateRemoteActionCompatParcelizer;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gettraversalindexdelegate = issensitivedatadelegate.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i11 = PlaybackStateCompatCustomAction + 117;
            MediaSessionCompatResultReceiverWrapper = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return this.MediaMetadataCompat.serializer(gettraversalindexdelegate);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c5 A[PHI: r1 r10
  0x00c5: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v20 java.lang.Object) binds: [B:23:0x00c1, B:17:0x0073] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r10v4 boolean) = (r10v3 boolean), (r10v5 boolean) binds: [B:23:0x00c1, B:17:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x0113  */
    /* JADX WARN: Code duplicated, block: B:33:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        if (r16.write.m5029invokeIoAF18A(r3) == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014f, code lost:
    
        if (r16.write.m5029invokeIoAF18A(r3) == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        r6 = r1;
        r2 = r5;
        r5 = r10;
     */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4872invoke0E7RQCE(java.lang.String r17, java.lang.String r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl.m4872invoke0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
