package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getHasStaleResolvedFonts;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class BridgeManager$handleIncomingMessage$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getHasStaleResolvedFonts write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeManager$handleIncomingMessage$1(getHasStaleResolvedFonts gethasstaleresolvedfonts, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = gethasstaleresolvedfonts;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 51;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        getHasStaleResolvedFonts gethasstaleresolvedfonts = this.write;
        if (i5 == 0) {
            BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$1 = new BridgeManager$handleIncomingMessage$1(gethasstaleresolvedfonts, shortNewsContentCardView, 0);
            bridgeManager$handleIncomingMessage$1.RemoteActionCompatParcelizer = obj;
            return bridgeManager$handleIncomingMessage$1;
        }
        int i6 = 1;
        if (i5 == 1) {
            BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$2 = new BridgeManager$handleIncomingMessage$1(gethasstaleresolvedfonts, shortNewsContentCardView, i6);
            bridgeManager$handleIncomingMessage$2.RemoteActionCompatParcelizer = obj;
            return bridgeManager$handleIncomingMessage$2;
        }
        BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$3 = new BridgeManager$handleIncomingMessage$1(gethasstaleresolvedfonts, shortNewsContentCardView, i);
        bridgeManager$handleIncomingMessage$3.RemoteActionCompatParcelizer = obj;
        int i7 = read + 81;
        RatingCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return bridgeManager$handleIncomingMessage$3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 == 0) {
            Object objInvokeSuspend = ((BridgeManager$handleIncomingMessage$1) create(webChatEventsTrackerImpl, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = RatingCompat + 27;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        if (i2 != 1) {
            return ((BridgeManager$handleIncomingMessage$1) create(webChatEventsTrackerImpl, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend2 = ((BridgeManager$handleIncomingMessage$1) create(webChatEventsTrackerImpl, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 45;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl) r9.RemoteActionCompatParcelizer;
        r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r8 = r9.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r8 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r1 = com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.read + 67;
        com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r8 != 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r10 = o.getHasStaleResolvedFonts.IconCompatParcelizer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r10 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9.RemoteActionCompatParcelizer = null;
        r9.IconCompatParcelizer = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1.trackWebChatHandshakeFailedEvent(r10, r9) != r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r10 = com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.read + 77;
        com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.RatingCompat = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if ((r10 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r1 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl) r9.RemoteActionCompatParcelizer;
        r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r8 = r9.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r8 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r1 = com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.RatingCompat + 91;
        com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if ((r1 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r8 != 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r8 != 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r10 = o.getHasStaleResolvedFonts.IconCompatParcelizer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r10 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r9.RemoteActionCompatParcelizer = null;
        r9.IconCompatParcelizer = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r1.trackWebChatHandshakeFailedEvent(r10, r9) != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        r10 = com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.RatingCompat + 71;
        com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.read = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.BridgeManager$handleIncomingMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
