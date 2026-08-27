package com.roadrunner.logger.info;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.web.performance.WebViewInitializer;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.AdjustDeeplink;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.waExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppEventInfoChangeHandler implements SemanticsInfo {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final SharedResourcePool IconCompatParcelizer;
    public final getAllSemanticsNodesToMap MediaMetadataCompat;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final Lazy serializer;
    public final GetRiderStateImpl write;
    public final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(3, this));
    public final AtomicReference MediaDescriptionCompat = new AtomicReference(null);

    /* JADX INFO: renamed from: com.roadrunner.logger.info.AppEventInfoChangeHandler$init$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;
        public final /* synthetic */ AppEventInfoChangeHandler RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(AppEventInfoChangeHandler appEventInfoChangeHandler, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.RemoteActionCompatParcelizer = appEventInfoChangeHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = serializer + 73;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            AppEventInfoChangeHandler appEventInfoChangeHandler = this.RemoteActionCompatParcelizer;
            if (i4 == 0) {
                return new AnonymousClass2(appEventInfoChangeHandler, shortNewsContentCardView, 0);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(appEventInfoChangeHandler, shortNewsContentCardView, 1);
            int i5 = serializer + 113;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = serializer + 19;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 != 0) {
                return ((AnonymousClass2) create((AdjustDeeplink) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = IconCompatParcelizer + 83;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        
            if (r7 == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        
            r1 = com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.IconCompatParcelizer + 99;
            com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            if (r7 != 1) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
            r9.read = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r6.refreshUserInfo(r9) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            r10 = com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.serializer + 71;
            com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.IconCompatParcelizer = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            if ((r10 % 2) != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r1 = r9.read;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        
            if (r1 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        
            if (r1 != 1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
            r10 = kotlinx.coroutines.flow.FlowKt.serializer(kotlinx.coroutines.flow.FlowKt.write(new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(r6.write.write()), kotlinx.coroutines.DelayKt.serializer(o.SuspendingTransacter.IconCompatParcelizer)));
            r1 = new com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2(r6, r3, r4);
            r9.read = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r1, r9) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r7 = r9.read;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.serializer
                int r1 = r1 + 61
                int r2 = r1 % 128
                com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.IconCompatParcelizer = r2
                int r1 = r1 % r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                int r1 = r9.write
                o.createFromParcel r5 = o.createFromParcel.INSTANCE
                com.roadrunner.logger.info.AppEventInfoChangeHandler r6 = r9.RemoteActionCompatParcelizer
                r7 = 68
                int r7 = r7 / 0
                if (r1 == 0) goto L5e
                goto L27
            L1f:
                int r1 = r9.write
                o.createFromParcel r5 = o.createFromParcel.INSTANCE
                com.roadrunner.logger.info.AppEventInfoChangeHandler r6 = r9.RemoteActionCompatParcelizer
                if (r1 == 0) goto L5e
            L27:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r7 = r9.read
                if (r7 == 0) goto L40
                int r1 = com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.IconCompatParcelizer
                int r1 = r1 + 99
                int r6 = r1 % 128
                com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.serializer = r6
                int r1 = r1 % r0
                if (r7 != r4) goto L3c
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                goto L5c
            L3c:
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
                goto L5d
            L40:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                r9.read = r4
                java.lang.Object r10 = r6.refreshUserInfo(r9)
                if (r10 != r1) goto L5c
                int r10 = com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.serializer
                int r10 = r10 + 71
                int r2 = r10 % 128
                com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.IconCompatParcelizer = r2
                int r10 = r10 % r0
                if (r10 != 0) goto L58
                r3 = r1
                goto L5d
            L58:
                r3.hashCode()
                throw r3
            L5c:
                r3 = r5
            L5d:
                return r3
            L5e:
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.read
                if (r1 == 0) goto L6e
                if (r1 != r4) goto L6a
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                goto L99
            L6a:
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
                goto L9a
            L6e:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                com.roadrunner.rider.state.domain.GetRiderStateImpl r10 = r6.write
                kotlinx.coroutines.flow.Flow r10 = r10.write()
                kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
                r1.<init>(r10)
                long r7 = o.SuspendingTransacter.IconCompatParcelizer
                long r7 = kotlinx.coroutines.DelayKt.serializer(r7)
                kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.write(r1, r7)
                kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.serializer(r10)
                com.roadrunner.logger.info.AppEventInfoChangeHandler$init$2 r1 = new com.roadrunner.logger.info.AppEventInfoChangeHandler$init$2
                r1.<init>(r6, r3, r4)
                r9.read = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r1, r9)
                if (r10 != r0) goto L99
                r3 = r0
                goto L9a
            L99:
                r3 = r5
            L9a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.logger.info.AppEventInfoChangeHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AppEventInfoChangeHandler(Lazy lazy, getContentViewGroupParentLayout getcontentviewgroupparentlayout, GetRiderStateImpl getRiderStateImpl, SharedResourcePool sharedResourcePool, isOpenInternalroom_runtime isopeninternalroom_runtime, getAllSemanticsNodesToMap getallsemanticsnodestomap) {
        this.serializer = lazy;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = getRiderStateImpl;
        this.IconCompatParcelizer = sharedResourcePool;
        this.MediaMetadataCompat = getallsemanticsnodestomap;
    }

    public final Set write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objWrite = this.serializer.write();
        objWrite.getClass();
        Set set = (Set) objWrite;
        int i4 = MediaSessionCompatQueueItem + 79;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return set;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null, null, new AnonymousClass2(this, null, 0), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = MediaBrowserCompatMediaItem + 83;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }

    public final Object refreshUserInfo(ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        Object objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) this.MediaMetadataCompat).ofSuspend("asti_app_event_info_refresh", new WebViewInitializer.AnonymousClass2(this, null, 2), continuationImpl);
        if (objOfSuspend != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = MediaBrowserCompatMediaItem + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return objOfSuspend;
    }

    public final void write(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            str2.getClass();
            write().iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        str2.getClass();
        Iterator it = write().iterator();
        while (!(!it.hasNext())) {
            int i3 = MediaBrowserCompatMediaItem + 61;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ((AppInfoChangedListener) it.next()).updateUserProperty(str, str2);
        }
        int i5 = MediaSessionCompatQueueItem + 39;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
