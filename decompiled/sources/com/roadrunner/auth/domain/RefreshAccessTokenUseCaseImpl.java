package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.R;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.auth.domain.mapper.MapAuthEntityToRefreshTokenRequest;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.LayerSnapshotV22toBitmap2image11;
import o.ShortNewsContentCardView;
import o.boundingRectInRoot;
import o.createFromParcel;
import o.getContentDataTypedelegate;
import o.getDisabled;
import o.getInputText;
import o.getMaxTextLengthdelegate;
import o.getProgressBarRangeInfodelegate;
import o.getRoledelegate;
import o.getTraversalIndexdelegate;
import o.onItemDismiss;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.resolveParagraphStyleDefaults;
import o.trackThirdPartySharingI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RefreshAccessTokenUseCaseImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final AuthRepository IconCompatParcelizer;
    public final getDisabled MediaBrowserCompatMediaItem;
    public final MapAuthEntityToRefreshTokenRequest MediaDescriptionCompat;
    public final SaveAuthDataUseCase MediaSessionCompatQueueItem;
    public final Set RatingCompat;
    public final getInputText RemoteActionCompatParcelizer;
    public final IncogniaManagerImpl read;
    public final getMaxTextLengthdelegate serializer;
    public final boundingRectInRoot write;

    public RefreshAccessTokenUseCaseImpl(AuthRepository authRepository, MapAuthEntityToRefreshTokenRequest mapAuthEntityToRefreshTokenRequest, boundingRectInRoot boundingrectinroot, getMaxTextLengthdelegate getmaxtextlengthdelegate, SaveAuthDataUseCase saveAuthDataUseCase, getDisabled getdisabled, getInputText getinputtext, IncogniaManagerImpl incogniaManagerImpl, Set set) {
        authRepository.getClass();
        mapAuthEntityToRefreshTokenRequest.getClass();
        boundingrectinroot.getClass();
        getmaxtextlengthdelegate.getClass();
        saveAuthDataUseCase.getClass();
        getdisabled.getClass();
        getinputtext.getClass();
        incogniaManagerImpl.getClass();
        set.getClass();
        this.IconCompatParcelizer = authRepository;
        this.MediaDescriptionCompat = mapAuthEntityToRefreshTokenRequest;
        this.write = boundingrectinroot;
        this.serializer = getmaxtextlengthdelegate;
        this.MediaSessionCompatQueueItem = saveAuthDataUseCase;
        this.MediaBrowserCompatMediaItem = getdisabled;
        this.RemoteActionCompatParcelizer = getinputtext;
        this.read = incogniaManagerImpl;
        this.RatingCompat = set;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: all -> 0x0082, PHI: r1
  0x0031: PHI (r1v5 java.util.concurrent.locks.ReentrantLock) = (r1v4 java.util.concurrent.locks.ReentrantLock), (r1v8 java.util.concurrent.locks.ReentrantLock) binds: [B:11:0x002f, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:5:0x0016, B:14:0x0059, B:12:0x0031, B:10:0x0029), top: B:21:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[Catch: all -> 0x0082, PHI: r1
  0x0059: PHI (r1v7 java.util.concurrent.locks.ReentrantLock) = (r1v4 java.util.concurrent.locks.ReentrantLock), (r1v8 java.util.concurrent.locks.ReentrantLock) binds: [B:11:0x002f, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:5:0x0016, B:14:0x0059, B:12:0x0031, B:10:0x0029), top: B:21:0x000d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0059, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, java.util.concurrent.locks.ReentrantLock] */
    public final Object RemoteActionCompatParcelizer(String str) {
        ReentrantLock reentrantLock;
        Object obj;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 89;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        ?? r1 = i2 % 2;
        try {
            if (r1 != 0) {
                reentrantLock = getRoledelegate.read();
                reentrantLock.lock();
                int i3 = 26 / 0;
                if (this.serializer.read()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Refresh access token called when authenticating url ".concat(str), new Object[0]);
                    obj = ((onItemDismiss) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 4))).IconCompatParcelizer;
                    int i4 = MediaMetadataCompat + 65;
                    MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    Timber.RemoteActionCompatParcelizer.read("When authenticating url " + str + " access token is registered as not expired", new Object[0]);
                    obj = createFromParcel.INSTANCE;
                    int i6 = MediaSessionCompatResultReceiverWrapper + 85;
                    MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            } else {
                reentrantLock = getRoledelegate.read();
                reentrantLock.lock();
                if (this.serializer.read()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Refresh access token called when authenticating url ".concat(str), new Object[0]);
                    obj = ((onItemDismiss) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 4))).IconCompatParcelizer;
                    int i8 = MediaMetadataCompat + 65;
                    MediaSessionCompatResultReceiverWrapper = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    Timber.RemoteActionCompatParcelizer.read("When authenticating url " + str + " access token is registered as not expired", new Object[0]);
                    obj = createFromParcel.INSTANCE;
                    int i10 = MediaSessionCompatResultReceiverWrapper + 85;
                    MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
            reentrantLock.unlock();
            return obj;
        } catch (Throwable th) {
            r1.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object saveAuthData(getContentDataTypedelegate getcontentdatatypedelegate, getTraversalIndexdelegate gettraversalindexdelegate, ContinuationImpl continuationImpl) {
        getProgressBarRangeInfodelegate getprogressbarrangeinfodelegate;
        getContentDataTypedelegate getcontentdatatypedelegate2;
        int i = 2 % 2;
        if (continuationImpl instanceof getProgressBarRangeInfodelegate) {
            getprogressbarrangeinfodelegate = (getProgressBarRangeInfodelegate) continuationImpl;
            int i2 = getprogressbarrangeinfodelegate.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getprogressbarrangeinfodelegate.serializer = i2 - Integer.MIN_VALUE;
            } else {
                getprogressbarrangeinfodelegate = new getProgressBarRangeInfodelegate(this, continuationImpl);
            }
        } else {
            getprogressbarrangeinfodelegate = new getProgressBarRangeInfodelegate(this, continuationImpl);
        }
        Object obj = getprogressbarrangeinfodelegate.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getprogressbarrangeinfodelegate.serializer;
        Object obj2 = null;
        if (i3 != 0) {
            int i4 = MediaMetadataCompat + 61;
            int i5 = i4 % Fields.SpotShadowColor;
            MediaSessionCompatResultReceiverWrapper = i5;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = i5 + 69;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getcontentdatatypedelegate2 = getprogressbarrangeinfodelegate.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                getContentDataTypedelegate getcontentdatatypedelegate3 = getprogressbarrangeinfodelegate.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = getTraversalIndexdelegate.RemoteActionCompatParcelizer(gettraversalindexdelegate, getcontentdatatypedelegate.IconCompatParcelizer(), getcontentdatatypedelegate.serializer(), getcontentdatatypedelegate.write() * 1000, false, null, null, null, null, null, 262132);
            getprogressbarrangeinfodelegate.read = getcontentdatatypedelegate;
            getprogressbarrangeinfodelegate.serializer = 1;
            if (this.MediaSessionCompatQueueItem.invoke(gettraversalindexdelegateRemoteActionCompatParcelizer, getprogressbarrangeinfodelegate) == coroutineSingletons) {
                int i7 = MediaMetadataCompat + 29;
                MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj2.hashCode();
                throw null;
            }
            getcontentdatatypedelegate2 = getcontentdatatypedelegate;
        }
        int i8 = MediaSessionCompatResultReceiverWrapper + 93;
        MediaMetadataCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 4 % 5;
        }
        for (resolveParagraphStyleDefaults resolveparagraphstyledefaults : this.RatingCompat) {
            String strIconCompatParcelizer = getcontentdatatypedelegate2.IconCompatParcelizer();
            resolveparagraphstyledefaults.getClass();
            strIconCompatParcelizer.getClass();
            Object[] objArr = {(FirebaseRemoteConfigImpl) resolveparagraphstyledefaults.IconCompatParcelizer};
            if (((trackThirdPartySharingI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(611636138, R.serializer(), R.serializer(), -611636136, R.serializer(), R.serializer(), objArr)) != trackThirdPartySharingI.NOT_AVAILABLE) {
                CustomerChatProviderImpl customerChatProviderImpl = resolveparagraphstyledefaults.write;
                customerChatProviderImpl.getClass();
                CustomerChatManagerImpl customerChatManagerImpl = customerChatProviderImpl.read;
                if (customerChatManagerImpl.MediaMetadataCompat.write()) {
                    int i10 = MediaSessionCompatResultReceiverWrapper + 3;
                    MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    CustomerChatModule customerChatModule = customerChatManagerImpl.read();
                    LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = new LayerSnapshotV22toBitmap2image11();
                    layerSnapshotV22toBitmap2image11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strIconCompatParcelizer;
                    customerChatModule.write(layerSnapshotV22toBitmap2image11);
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0188, code lost:
    
        if (r13.saveAuthData(r14, r6, r3) == r5) goto L65;
     */
    /* JADX INFO: renamed from: access$refreshAndSave-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4869access$refreshAndSaveIoAF18A(com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl.m4869access$refreshAndSaveIoAF18A(com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
