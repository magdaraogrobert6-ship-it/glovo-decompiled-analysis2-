package kotlinx.coroutines.flow;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowUtil$createFlow$$inlined$map$1 serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowCollector IconCompatParcelizer;
        public /* synthetic */ Object MediaDescriptionCompat;
        public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 RemoteActionCompatParcelizer;
        public long read;
        public int serializer;
        public Throwable write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.MediaDescriptionCompat = obj;
            this.serializer |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1, UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1) {
        this.serializer = flowUtil$createFlow$$inlined$map$1;
        this.RemoteActionCompatParcelizer = unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008d -> B:32:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, o.ShortNewsContentCardView r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.serializer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.serializer = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.MediaDescriptionCompat
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.serializer
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 != r3) goto L33
            long r6 = r0.read
            java.lang.Throwable r11 = r0.write
            kotlinx.coroutines.flow.FlowCollector r2 = r0.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r8 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L7e
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r4
        L39:
            long r6 = r0.read
            kotlinx.coroutines.flow.FlowCollector r11 = r0.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r2 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r8 = r2
        L43:
            r2 = r11
            goto L61
        L45:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r6 = 0
            r12 = r10
        L4b:
            androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1 r2 = r12.serializer
            r0.RemoteActionCompatParcelizer = r12
            r0.IconCompatParcelizer = r11
            r0.write = r4
            r0.read = r6
            r0.serializer = r5
            java.io.Serializable r2 = kotlinx.coroutines.flow.FlowKt.catchImpl(r2, r11, r0)
            if (r2 != r1) goto L5e
            goto L7d
        L5e:
            r8 = r12
            r12 = r2
            goto L43
        L61:
            r11 = r12
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 == 0) goto L8d
            androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 r12 = r8.RemoteActionCompatParcelizer
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r0.RemoteActionCompatParcelizer = r8
            r0.IconCompatParcelizer = r2
            r0.write = r11
            r0.read = r6
            r0.serializer = r3
            java.lang.Object r12 = r12.invoke(r2, r11, r9, r0)
            if (r12 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L8c
            r11 = 1
            long r6 = r6 + r11
            r11 = r2
            r12 = r5
            goto L90
        L8c:
            throw r11
        L8d:
            r11 = 0
            r12 = r11
            r11 = r2
        L90:
            if (r12 != 0) goto L95
            o.createFromParcel r11 = o.createFromParcel.INSTANCE
            return r11
        L95:
            r12 = r8
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
