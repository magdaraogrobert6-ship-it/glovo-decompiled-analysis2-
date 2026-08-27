package androidx.room;

import kotlinx.coroutines.flow.FlowCollector;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2 implements FlowCollector {
    public final /* synthetic */ int[] IconCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowCollector serializer;
    public final /* synthetic */ String[] write;

    public TriggerBasedInvalidationTracker$createFlow$1$2(createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector, String[] strArr, int[] iArr) {
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.serializer = flowCollector;
        this.write = strArr;
        this.IconCompatParcelizer = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r7.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r7.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        return r1;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(int[] r14, o.ShortNewsContentCardView r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof o.accessgetCyancp
            if (r0 == 0) goto L13
            r0 = r15
            o.accessgetCyancp r0 = (o.accessgetCyancp) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.RemoteActionCompatParcelizer = r1
            goto L18
        L13:
            o.accessgetCyancp r0 = new o.accessgetCyancp
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.RemoteActionCompatParcelizer
            o.createInAppMessageEventSubscriber r3 = r13.RemoteActionCompatParcelizer
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L36
            if (r2 == r6) goto L30
            if (r2 != r4) goto L2a
            goto L30
        L2a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r14)
            return r5
        L30:
            int[] r14 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto L8f
        L36:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            java.lang.Object r15 = r3.IconCompatParcelizer
            java.lang.String[] r2 = r13.write
            kotlinx.coroutines.flow.FlowCollector r7 = r13.serializer
            if (r15 != 0) goto L50
            java.util.Set r15 = o.onContentCardClicked.MediaSessionCompatQueueItem(r2)
            r0.serializer = r14
            r0.RemoteActionCompatParcelizer = r6
            java.lang.Object r15 = r7.emit(r15, r0)
            if (r15 != r1) goto L8f
            goto L8e
        L50:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r6 = r2.length
            r8 = 0
            r9 = r8
        L58:
            if (r8 >= r6) goto L7a
            r10 = r2[r8]
            java.lang.Object r11 = r3.IconCompatParcelizer
            if (r11 == 0) goto L74
            int[] r11 = (int[]) r11
            int[] r12 = r13.IconCompatParcelizer
            r12 = r12[r9]
            r11 = r11[r12]
            r12 = r14[r12]
            if (r11 == r12) goto L6f
            r15.add(r10)
        L6f:
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L58
        L74:
            java.lang.String r14 = "Required value was null."
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r14)
            return r5
        L7a:
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L8f
            java.util.Set r15 = o.onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(r15)
            r0.serializer = r14
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r15 = r7.emit(r15, r0)
            if (r15 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r3.IconCompatParcelizer = r14
            o.createFromParcel r14 = o.createFromParcel.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2.emit(int[], o.ShortNewsContentCardView):java.lang.Object");
    }
}
