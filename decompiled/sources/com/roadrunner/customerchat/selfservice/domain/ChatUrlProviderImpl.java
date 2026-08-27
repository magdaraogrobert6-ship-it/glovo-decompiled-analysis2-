package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AnnotatedStringExhaustiveAnnotation;
import o.TextUnitType;
import o.accessgetOldDependencyp;
import o.accessisMainThread;
import o.addBulletr9BaKPg;
import o.getLineHeightStyle;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda0dL3NwAAnESqa66IBFAXKvH5HU;
import o.requireIndexInRange;
import o.transactionsuspendImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatUrlProviderImpl {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final addBulletr9BaKPg IconCompatParcelizer;
    public final HelpCenterRemoteDataSourceImpl MediaBrowserCompatMediaItem;
    public final r8lambda0dL3NwAAnESqa66IBFAXKvH5HU MediaDescriptionCompat;
    public final accessisMainThread MediaMetadataCompat;
    public final requireIndexInRange MediaSessionCompatQueueItem;
    public final WebChatEventsTrackerImpl PlaybackStateCompat;
    public final transactionsuspendImpl PlaybackStateCompatCustomAction;
    public final ExecuteHelpCenterApiRequest RatingCompat;
    public final getLineHeightStyle RemoteActionCompatParcelizer;
    public final TextUnitType read;
    public final accessgetOldDependencyp serializer;
    public final AnnotatedStringExhaustiveAnnotation write;

    public ChatUrlProviderImpl(r8lambda0dL3NwAAnESqa66IBFAXKvH5HU r8lambda0dl3nwaanesqa66ibfaxkvh5hu, HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, accessisMainThread accessismainthread, addBulletr9BaKPg addbulletr9bakpg, getLineHeightStyle getlineheightstyle, WebChatEventsTrackerImpl webChatEventsTrackerImpl, TextUnitType textUnitType, AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation, requireIndexInRange requireindexinrange, transactionsuspendImpl transactionsuspendimpl, accessgetOldDependencyp accessgetolddependencyp, ExecuteHelpCenterApiRequest executeHelpCenterApiRequest) {
        r8lambda0dl3nwaanesqa66ibfaxkvh5hu.getClass();
        helpCenterRemoteDataSourceImpl.getClass();
        accessismainthread.getClass();
        addbulletr9bakpg.getClass();
        getlineheightstyle.getClass();
        webChatEventsTrackerImpl.getClass();
        textUnitType.getClass();
        annotatedStringExhaustiveAnnotation.getClass();
        requireindexinrange.getClass();
        transactionsuspendimpl.getClass();
        accessgetolddependencyp.getClass();
        executeHelpCenterApiRequest.getClass();
        this.MediaDescriptionCompat = r8lambda0dl3nwaanesqa66ibfaxkvh5hu;
        this.MediaBrowserCompatMediaItem = helpCenterRemoteDataSourceImpl;
        this.MediaMetadataCompat = accessismainthread;
        this.IconCompatParcelizer = addbulletr9bakpg;
        this.RemoteActionCompatParcelizer = getlineheightstyle;
        this.PlaybackStateCompat = webChatEventsTrackerImpl;
        this.read = textUnitType;
        this.write = annotatedStringExhaustiveAnnotation;
        this.MediaSessionCompatQueueItem = requireindexinrange;
        this.PlaybackStateCompatCustomAction = transactionsuspendimpl;
        this.serializer = accessgetolddependencyp;
        this.RatingCompat = executeHelpCenterApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: fetchBaseChatUrl-IoAF18A, reason: not valid java name */
    public final Serializable m4887fetchBaseChatUrlIoAF18A(ContinuationImpl continuationImpl) {
        ChatUrlProviderImpl$fetchBaseChatUrl$1 chatUrlProviderImpl$fetchBaseChatUrl$1;
        Object objM4882invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof ChatUrlProviderImpl$fetchBaseChatUrl$1) {
            chatUrlProviderImpl$fetchBaseChatUrl$1 = (ChatUrlProviderImpl$fetchBaseChatUrl$1) continuationImpl;
            int i2 = chatUrlProviderImpl$fetchBaseChatUrl$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatToken + 1;
                ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                chatUrlProviderImpl$fetchBaseChatUrl$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                chatUrlProviderImpl$fetchBaseChatUrl$1 = new ChatUrlProviderImpl$fetchBaseChatUrl$1(this, continuationImpl);
            }
        } else {
            chatUrlProviderImpl$fetchBaseChatUrl$1 = new ChatUrlProviderImpl$fetchBaseChatUrl$1(this, continuationImpl);
        }
        Object obj = chatUrlProviderImpl$fetchBaseChatUrl$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = chatUrlProviderImpl$fetchBaseChatUrl$1.RemoteActionCompatParcelizer;
        Object[] objArr = 0;
        if (i5 != 0) {
            int i6 = MediaSessionCompatToken + 111;
            int i7 = i6 % Fields.SpotShadowColor;
            ParcelableVolumeInfo = i7;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i7 + 25;
            MediaSessionCompatToken = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4882invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            if (str != null && str.length() != 0) {
                return str;
            }
            ExecuteHelpCenterApiRequest executeHelpCenterApiRequest = this.RatingCompat;
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, objArr == true ? 1 : 0, 7);
            chatUrlProviderImpl$fetchBaseChatUrl$1.RemoteActionCompatParcelizer = 1;
            objM4882invokegIAlus = executeHelpCenterApiRequest.m4882invokegIAlus(mapboxNavigation$parsing$2, chatUrlProviderImpl$fetchBaseChatUrl$1);
            if (objM4882invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        String str2 = (String) (objM4882invokegIAlus instanceof isItemDismissable ? null : objM4882invokegIAlus);
        if (str2 != null) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer = str2;
            return str2;
        }
        int i10 = MediaSessionCompatToken + 39;
        ParcelableVolumeInfo = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        Throwable thSerializer = onItemDismiss.serializer(objM4882invokegIAlus);
        if (thSerializer == null) {
            thSerializer = new Exception("Failed to fetch base chat URL");
        }
        return new isItemDismissable(thSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r13 == r2) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: fetchChatUrl-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m4888fetchChatUrlgIAlus(java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl.m4888fetchChatUrlgIAlus(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
