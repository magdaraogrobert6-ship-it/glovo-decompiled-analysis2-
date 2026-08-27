package com.roadrunner.delivery.accept.autoaccept.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.SaversKtExternalSyntheticLambda0;
import o.SaversKtNonNullValueClassSaver1;
import o.ShortNewsContentCardView;
import o.checkAdjustAdRevenue;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDefaultIndentationXSAIIZE;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptBackgroundHandlerImpl$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public String RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptBackgroundHandlerImpl$invoke$1(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, DownloadChatAssetsUseCase downloadChatAssetsUseCase, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = getdefaultindentationxsaiize;
        this.read = downloadChatAssetsUseCase;
        this.serializer = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptBackgroundHandlerImpl$invoke$1(checkAdjustAdRevenue checkadjustadrevenue, SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver1, SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = checkadjustadrevenue;
        this.MediaSessionCompatResultReceiverWrapper = saversKtNonNullValueClassSaver1;
        this.serializer = saversKtExternalSyntheticLambda0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 117;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((AutoAcceptBackgroundHandlerImpl$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((AutoAcceptBackgroundHandlerImpl$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = PlaybackStateCompat + 123;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r6 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r1 = new com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1((o.checkAdjustAdRevenue) r3, (o.SaversKtNonNullValueClassSaver1) r5.MediaSessionCompatResultReceiverWrapper, (o.SaversKtExternalSyntheticLambda0) r2, r7);
        r1.write = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = new com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1((o.getDefaultIndentationXSAIIZE) r5.MediaSessionCompatQueueItem, (com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase) r3, (java.lang.String) r2, r7);
        r6 = com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.MediaSessionCompatToken + 65;
        com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.PlaybackStateCompat = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.MediaSessionCompatToken
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.PlaybackStateCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            int r1 = r5.RemoteActionCompatParcelizer
            java.lang.Object r2 = r5.serializer
            java.lang.Object r3 = r5.read
            r4 = 73
            int r4 = r4 / 0
            if (r1 == 0) goto L40
            goto L23
        L1b:
            int r1 = r5.RemoteActionCompatParcelizer
            java.lang.Object r2 = r5.serializer
            java.lang.Object r3 = r5.read
            if (r1 == 0) goto L40
        L23:
            java.lang.Object r6 = r5.MediaSessionCompatQueueItem
            o.getDefaultIndentationXSAIIZE r6 = (o.getDefaultIndentationXSAIIZE) r6
            com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase r3 = (com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase) r3
            java.lang.String r2 = (java.lang.String) r2
            com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1 r1 = new com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1
            r1.<init>(r6, r3, r2, r7)
            int r6 = com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.MediaSessionCompatToken
            int r6 = r6 + 65
            int r7 = r6 % 128
            com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.PlaybackStateCompat = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L3f
            r6 = 48
            int r6 = r6 / 0
        L3f:
            return r1
        L40:
            o.checkAdjustAdRevenue r3 = (o.checkAdjustAdRevenue) r3
            java.lang.Object r0 = r5.MediaSessionCompatResultReceiverWrapper
            o.SaversKtNonNullValueClassSaver1 r0 = (o.SaversKtNonNullValueClassSaver1) r0
            o.SaversKtExternalSyntheticLambda0 r2 = (o.SaversKtExternalSyntheticLambda0) r2
            com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1 r1 = new com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1
            r1.<init>(r3, r0, r2, r7)
            r1.write = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x023c A[Catch: all -> 0x013c, TRY_ENTER, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0242  */
    /* JADX WARN: Code duplicated, block: B:107:0x0243 A[Catch: all -> 0x013c, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0247 A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x024b A[Catch: all -> 0x013c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0259  */
    /* JADX WARN: Code duplicated, block: B:117:0x0273  */
    /* JADX WARN: Code duplicated, block: B:118:0x0274 A[Catch: all -> 0x013c, PHI: r0 r2 r3 r4
  0x0274: PHI (r0v8 int) = (r0v6 int), (r0v10 int) binds: [B:116:0x0271, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r2v20 o.copyNs73l9sdefault) = (r2v17 o.copyNs73l9sdefault), (r2v22 o.copyNs73l9sdefault) binds: [B:116:0x0271, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r3v9 o.SaversKtNonNullValueClassSaver1) = (r3v6 o.SaversKtNonNullValueClassSaver1), (r3v11 o.SaversKtNonNullValueClassSaver1) binds: [B:116:0x0271, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r4v21 java.lang.Object) = (r4v19 java.lang.Object), (r4v22 java.lang.Object) binds: [B:116:0x0271, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x028d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x019c A[Catch: all -> 0x013c, TRY_ENTER, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3 A[Catch: all -> 0x013c, PHI: r13
  0x01b3: PHI (r13v20 java.lang.Object) = (r13v16 java.lang.Object), (r13v22 java.lang.Object) binds: [B:80:0x01af, B:55:0x0133] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x013c, blocks: (B:42:0x00ed, B:45:0x00fe, B:118:0x0274, B:48:0x010f, B:115:0x025a, B:51:0x0120, B:97:0x020f, B:100:0x022b, B:104:0x023c, B:107:0x0243, B:108:0x0247, B:110:0x024b, B:54:0x012d, B:89:0x01e3, B:93:0x01f2, B:55:0x0133, B:82:0x01b3, B:85:0x01c2, B:79:0x019c), top: B:137:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0222  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a1, code lost:
    
        if (r13.setRequestRunning(r12) == r8) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        if (r13.invoke(null, r3, r12, true) == r8) goto L126;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
