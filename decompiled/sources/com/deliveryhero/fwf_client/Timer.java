package com.deliveryhero.fwf_client;

import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.deliveryhero.fwf_logger.ILogger;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getButtonViews;
import o.getContentViewGroupParentLayout;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class Timer {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM action;
    private final long initialDelay;
    private final getButtonViews job;
    private final ILogger logger;
    private final long repeatAfter;
    private final String resource;
    private final getContentViewGroupParentLayout scope;
    private final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 timer;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.Timer$startCoroutineTimer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = Timer.this.new AnonymousClass1(shortNewsContentCardView);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0065 A[PHI: r1
  0x0065: PHI (r1v8 o.getContentViewGroupParentLayout) = 
  (r1v6 o.getContentViewGroupParentLayout)
  (r1v7 o.getContentViewGroupParentLayout)
  (r1v14 o.getContentViewGroupParentLayout)
 binds: [B:19:0x0063, B:26:0x00c2, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ac A[PHI: r1
  0x00ac: PHI (r1v7 o.getContentViewGroupParentLayout) = (r1v8 o.getContentViewGroupParentLayout), (r1v12 o.getContentViewGroupParentLayout) binds: [B:23:0x00a9, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c2 -> B:20:0x0065). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.Timer.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    private final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 startCoroutineTimer() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.scope;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new AnonymousClass1(null), 2);
    }

    public final void cancelTimer() {
        if (this.timer.I_()) {
            this.timer.write(null);
        }
    }

    public final void startTimer() {
        if (this.timer.I_()) {
            return;
        }
        ILogger iLogger = this.logger;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Starting auto updater. ", this.resource, this.repeatAfter, " will be updated automatically every ");
        sbM.append(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        iLogger.logD(FwFClientKt.MODULE_NAME, sbM.toString());
        this.timer.MediaSessionCompatQueueItem();
    }

    public Timer(String str, ILogger iLogger, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        iLogger.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.resource = str;
        this.logger = iLogger;
        this.repeatAfter = j;
        this.action = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.initialDelay = j + 2;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        this.job = onbackinvokedlambda0Serializer;
        this.scope = YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(onbackinvokedlambda0Serializer));
        this.timer = startCoroutineTimer();
    }
}
