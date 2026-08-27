package com.roadrunner.customerchat.selfservice.data.cache;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.TextUnitType;
import o.copyw_4Rhrwdefault;
import o.getCache;
import o.getError;
import o.processingInstruction;
import o.requireIndexInRange;
import o.startDocument;
import o.startPrefixMapping;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatAssetsDownloadingWorker extends CoroutineWorker {
    public final requireIndexInRange MediaDescriptionCompat;
    public final TextUnitType MediaMetadataCompat;
    public final ChatAssetCacheManager MediaSessionCompatQueueItem;
    public final getCache MediaSessionCompatResultReceiverWrapper;
    public final startDocument MediaSessionCompatToken;
    public final copyw_4Rhrwdefault ParcelableVolumeInfo;
    public final processingInstruction PlaybackStateCompat;
    public final getError PlaybackStateCompatCustomAction;
    public final DownloadChatAssetsUseCase RatingCompat;
    public final WebChatNativeCacheDataStore ResultReceiver;
    private static final byte[] $$a = {110, -118, -94, 113, -55, 29, 55, 10, 11, 15, -9, 29, -5, 9, -7, 43, 8, 1, 15, 3, -28, 55, 10, 11, 15, -9, 29, -1, 16, 9};
    private static final int $$b = ActivityIdentificationData.RUNNING;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
    private static int ComponentActivity = 1;

    /* JADX INFO: renamed from: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker$trackNativeCacheDeviceStatsEvent$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        private static int MediaDescriptionCompat = 0;
        private static int PlaybackStateCompat = 1;
        public boolean IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public boolean MediaMetadataCompat;
        public /* synthetic */ Object MediaSessionCompatQueueItem;
        public String RemoteActionCompatParcelizer;
        public startPrefixMapping read;
        public copyw_4Rhrwdefault serializer;
        public List write;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ChatAssetsDownloadingWorker chatAssetsDownloadingWorker;
            boolean z;
            int i = 2 % 2;
            int i2 = PlaybackStateCompat + 91;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.MediaSessionCompatQueueItem = obj;
                this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
                chatAssetsDownloadingWorker = ChatAssetsDownloadingWorker.this;
                z = true;
            } else {
                this.MediaSessionCompatQueueItem = obj;
                this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
                chatAssetsDownloadingWorker = ChatAssetsDownloadingWorker.this;
                z = false;
            }
            Object objTrackNativeCacheDeviceStatsEvent = chatAssetsDownloadingWorker.trackNativeCacheDeviceStatsEvent(null, null, this, z);
            int i3 = PlaybackStateCompat + 21;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objTrackNativeCacheDeviceStatsEvent;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 111 - r5
            int r6 = r6 * 2
            int r0 = 27 - r6
            byte[] r1 = com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 26 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r5
            r5 = r6
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r7]
        L2b:
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatAssetsDownloadingWorker(Context context, WorkerParameters workerParameters, TextUnitType textUnitType, startDocument startdocument, DownloadChatAssetsUseCase downloadChatAssetsUseCase, requireIndexInRange requireindexinrange, WebChatNativeCacheDataStore webChatNativeCacheDataStore, processingInstruction processinginstruction, ChatAssetCacheManager chatAssetCacheManager, copyw_4Rhrwdefault copyw_4rhrwdefault, getCache getcache, getError geterror) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        textUnitType.getClass();
        startdocument.getClass();
        downloadChatAssetsUseCase.getClass();
        requireindexinrange.getClass();
        webChatNativeCacheDataStore.getClass();
        processinginstruction.getClass();
        chatAssetCacheManager.getClass();
        copyw_4rhrwdefault.getClass();
        getcache.getClass();
        geterror.getClass();
        this.MediaMetadataCompat = textUnitType;
        this.MediaSessionCompatToken = startdocument;
        this.RatingCompat = downloadChatAssetsUseCase;
        this.MediaDescriptionCompat = requireindexinrange;
        this.ResultReceiver = webChatNativeCacheDataStore;
        this.PlaybackStateCompat = processinginstruction;
        this.MediaSessionCompatQueueItem = chatAssetCacheManager;
        this.ParcelableVolumeInfo = copyw_4rhrwdefault;
        this.MediaSessionCompatResultReceiverWrapper = getcache;
        this.PlaybackStateCompatCustomAction = geterror;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (((com.roadrunner.customerchat.selfservice.domain.analytics.NativeCacheEventsTrackerImpl) r4).trackNativeCacheDeviceStatsEvent(r11, r14, r0, r6, (o.AnnotationType) r13, r8) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object trackNativeCacheDeviceStatsEvent(java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker.trackNativeCacheDeviceStatsEvent(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0284  */
    /* JADX WARN: Code duplicated, block: B:103:0x028a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186 A[PHI: r1 r5 r6 r23
  0x0186: PHI (r1v33 java.lang.Object) = (r1v30 java.lang.Object), (r1v2 java.lang.Object) binds: [B:62:0x0182, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r5v4 o.getHeightXSAIIZE) = (r13v0 o.getHeightXSAIIZE), (r5v8 o.getHeightXSAIIZE) binds: [B:62:0x0182, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r6v20 o.getHeightXSAIIZE) = (r6v18 o.getHeightXSAIIZE), (r6v21 o.getHeightXSAIIZE) binds: [B:62:0x0182, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r23v3 androidx.work.WorkerParameters) = (r14v0 androidx.work.WorkerParameters), (r23v4 androidx.work.WorkerParameters) binds: [B:62:0x0182, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:86:0x0218  */
    /* JADX WARN: Code duplicated, block: B:91:0x0246  */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0263  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
    
        if (trackNativeCacheDeviceStatsEvent(r1, r3, r4, true) == r15) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0205, code lost:
    
        if (trackNativeCacheDeviceStatsEvent(r1, r2, r4, false) == r15) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023d, code lost:
    
        if (trackNativeCacheDeviceStatsEvent(r1, r2, r4, false) == r15) goto L88;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(o.ShortNewsContentCardView r26) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker.doWork(o.ShortNewsContentCardView):java.lang.Object");
    }
}
