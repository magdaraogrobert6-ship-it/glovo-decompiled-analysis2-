package com.roadrunner.customerchat.legacy.core.manager;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import dagger.Lazy;
import o.accessisSetgyyYBs;
import o.getAnnotatedString;
import o.getTextIndent;
import o.registerOnGlobalLayoutCallback;
import o.setMinDebounceDeadline;
import o.transactionsuspendImpl;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatManagerImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatToken = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final SelfServiceCustomerChatRepositoryImpl MediaBrowserCompatMediaItem;
    public final getTextIndent MediaMetadataCompat;
    public final WebViewManager MediaSessionCompatQueueItem;
    public final setMinDebounceDeadline RatingCompat;
    public final getAnnotatedString RemoteActionCompatParcelizer;
    public final registerOnGlobalLayoutCallback read;
    public final accessisSetgyyYBs serializer;
    public final Lazy write;

    public CustomerChatManagerImpl(Lazy lazy, transferSessionPackageI transfersessionpackagei, registerOnGlobalLayoutCallback registerongloballayoutcallback, accessisSetgyyYBs accessissetgyyybs, transactionsuspendImpl transactionsuspendimpl, WebViewManager webViewManager, setMinDebounceDeadline setmindebouncedeadline, getAnnotatedString getannotatedstring, SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, getTextIndent gettextindent) {
        this.write = lazy;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.read = registerongloballayoutcallback;
        this.serializer = accessissetgyyybs;
        this.MediaSessionCompatQueueItem = webViewManager;
        this.RatingCompat = setmindebouncedeadline;
        this.RemoteActionCompatParcelizer = getannotatedstring;
        this.MediaBrowserCompatMediaItem = selfServiceCustomerChatRepositoryImpl;
        this.MediaMetadataCompat = gettextindent;
    }

    public final CustomerChatModule read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object objWrite = this.write.write();
            objWrite.getClass();
            return (CustomerChatModule) objWrite;
        }
        Object objWrite2 = this.write.write();
        objWrite2.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r7 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r7 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r7 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken + 35;
        com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(java.lang.String r7, java.lang.String r8, com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken = r2
            int r1 = r1 % r0
            boolean r1 = r10 instanceof o.fireOnRectChangedEntries
            if (r1 == 0) goto L2f
            r1 = r10
            o.fireOnRectChangedEntries r1 = (o.fireOnRectChangedEntries) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L2f
            int r10 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat
            int r10 = r10 + 89
            int r4 = r10 % 128
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken = r4
            int r10 = r10 % r0
            if (r10 != 0) goto L2b
            int r10 = r2 >>> r3
            r1.RemoteActionCompatParcelizer = r10
            goto L34
        L2b:
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L34
        L2f:
            o.fireOnRectChangedEntries r1 = new o.fireOnRectChangedEntries
            r1.<init>(r6, r10)
        L34:
            java.lang.Object r10 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L65
            if (r3 == r5) goto L5b
            int r7 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat
            int r7 = r7 + 89
            int r8 = r7 % 128
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L4f
            r7 = 3
            if (r3 != r7) goto L55
            goto L51
        L4f:
            if (r3 != r0) goto L55
        L51:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            return r10
        L55:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r4
        L5b:
            com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1 r9 = r1.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.onItemDismiss r10 = (o.onItemDismiss) r10
            java.lang.Object r7 = r10.IconCompatParcelizer
            goto L9f
        L65:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.getTextIndent r10 = r6.MediaMetadataCompat
            boolean r10 = r10.write()
            if (r10 == 0) goto Lb0
            int r10 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken
            int r10 = r10 + 121
            int r3 = r10 % 128
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat = r3
            int r10 = r10 % r0
            if (r10 == 0) goto L89
            r1.serializer = r9
            r10 = 0
            r1.RemoteActionCompatParcelizer = r10
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl r10 = r6.MediaBrowserCompatMediaItem
            java.lang.Object r7 = r10.m4893sendMessage0E7RQCE(r7, r8, r1)
            if (r7 != r2) goto L9f
            goto L95
        L89:
            r1.serializer = r9
            r1.RemoteActionCompatParcelizer = r5
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl r10 = r6.MediaBrowserCompatMediaItem
            java.lang.Object r7 = r10.m4893sendMessage0E7RQCE(r7, r8, r1)
            if (r7 != r2) goto L9f
        L95:
            int r7 = com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaSessionCompatToken
            int r7 = r7 + 35
            int r8 = r7 % 128
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.MediaDescriptionCompat = r8
            int r7 = r7 % r0
            goto Lc1
        L9f:
            java.lang.Throwable r8 = o.onItemDismiss.serializer(r7)
            if (r8 == 0) goto La8
            r9.invoke(r8)
        La8:
            boolean r7 = r7 instanceof o.isItemDismissable
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        Lb0:
            com.deliveryhero.customerchat.CustomerChatModule r10 = r6.read()
            o.getCanUseCompositingLayerui_graphics.IconCompatParcelizer(r8)
            r1.serializer = r4
            r1.RemoteActionCompatParcelizer = r0
            java.lang.Object r7 = r10.m4465sendMessage_XzSiO8(r7, r8, r9, r1)
            if (r7 != r2) goto Lc2
        Lc1:
            return r2
        Lc2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl.sendMessage(java.lang.String, java.lang.String, com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
