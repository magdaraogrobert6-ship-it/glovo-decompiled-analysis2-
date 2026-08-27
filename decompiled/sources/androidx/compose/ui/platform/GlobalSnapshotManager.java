package androidx.compose.ui.platform;

import androidx.sqlite.SQLite;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOffsetF1C5BW0;
import o.logUnregisterActivitylambda1;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ logUnregisterActivitylambda1 $channel;
        Object L$0;
        Object L$1;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$channel, shortNewsContentCardView);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x003b A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:6:0x0012, B:15:0x0033, B:17:0x003b, B:18:0x004b, B:24:0x0059, B:12:0x0026, B:26:0x005c, B:28:0x0061, B:29:0x0062, B:11:0x0021, B:19:0x004c, B:21:0x0052), top: B:39:0x0006, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x004c, B:21:0x0052), top: B:37:0x004c, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:6:0x0012, B:15:0x0033, B:17:0x003b, B:18:0x004b, B:24:0x0059, B:12:0x0026, B:26:0x005c, B:28:0x0061, B:29:0x0062, B:11:0x0021, B:19:0x004c, B:21:0x0052), top: B:39:0x0006, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0030 -> B:15:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L16
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r1 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r1
                java.lang.Object r4 = r7.L$0
                o.onBackCancelledlambda3 r4 = (o.onBackCancelledlambda3) r4
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L69
                goto L33
            L16:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
                return r2
            L1c:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                o.logUnregisterActivitylambda1 r4 = r7.$channel
                kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r8 = r4.MediaSessionCompatToken()     // Catch: java.lang.Throwable -> L69
                r1 = r8
            L26:
                r7.L$0 = r4     // Catch: java.lang.Throwable -> L69
                r7.L$1 = r1     // Catch: java.lang.Throwable -> L69
                r7.label = r3     // Catch: java.lang.Throwable -> L69
                java.lang.Object r8 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L69
                if (r8 != r0) goto L33
                return r0
            L33:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L69
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L69
                if (r8 == 0) goto L63
                java.lang.Object r8 = r1.write()     // Catch: java.lang.Throwable -> L69
                o.createFromParcel r8 = (o.createFromParcel) r8     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicBoolean r8 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L69
                r5 = 0
                r8.set(r5)     // Catch: java.lang.Throwable -> L69
                java.lang.Object r8 = o.getOffsetF1C5BW0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> L69
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L69
                o.setShape r6 = o.getOffsetF1C5BW0.serializer     // Catch: java.lang.Throwable -> L60
                o.relocationOffsetfbGrOKE r6 = r6.read     // Catch: java.lang.Throwable -> L60
                if (r6 == 0) goto L59
                boolean r6 = r6.read()     // Catch: java.lang.Throwable -> L60
                if (r6 != r3) goto L59
                r5 = r3
            L59:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L69
                if (r5 == 0) goto L26
                o.getOffsetF1C5BW0.read()     // Catch: java.lang.Throwable -> L69
                goto L26
            L60:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L69
                throw r0     // Catch: java.lang.Throwable -> L69
            L63:
                r4.write(r2)
                o.createFromParcel r8 = o.createFromParcel.INSTANCE
                return r8
            L69:
                r8 = move-exception
                throw r8     // Catch: java.lang.Throwable -> L6b
            L6b:
                r0 = move-exception
                o.setNativeShader.IconCompatParcelizer(r4, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(logUnregisterActivitylambda1 logunregisteractivitylambda1, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$channel = logunregisteractivitylambda1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final BufferedChannel bufferedChannelIconCompatParcelizer = SQLite.IconCompatParcelizer(1, 6, (IInAppMessageViewWrapper) null);
            BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(AndroidUiDispatcher.Companion.getMain()), null, null, new AnonymousClass1(bufferedChannelIconCompatParcelizer, null), 3);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2741invoke(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        bufferedChannelIconCompatParcelizer.b_(createFromParcel.INSTANCE);
                    }
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m2741invoke(obj);
                    return createFromParcel.INSTANCE;
                }
            };
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getOffsetF1C5BW0.read = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getOffsetF1C5BW0.read, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            getOffsetF1C5BW0.read();
        }
    }
}
