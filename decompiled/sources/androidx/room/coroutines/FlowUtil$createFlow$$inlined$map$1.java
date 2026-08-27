package androidx.room.coroutines;

import androidx.room.RoomDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class FlowUtil$createFlow$$inlined$map$1 implements Flow {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ RoomDatabase RemoteActionCompatParcelizer;
    public final /* synthetic */ Flow serializer;
    public final /* synthetic */ boolean write;

    /* JADX INFO: renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
        public final /* synthetic */ RoomDatabase read;
        public final /* synthetic */ FlowCollector serializer;
        public final /* synthetic */ boolean write;

        public AnonymousClass2(FlowCollector flowCollector, RoomDatabase roomDatabase, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.serializer = flowCollector;
            this.read = roomDatabase;
            this.write = z;
            this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L21;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, o.ShortNewsContentCardView r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o.component5impl
                if (r0 == 0) goto L13
                r0 = r9
                o.component5impl r0 = (o.component5impl) r0
                int r1 = r0.RemoteActionCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.RemoteActionCompatParcelizer = r1
                goto L18
            L13:
                o.component5impl r0 = new o.component5impl
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.write
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.RemoteActionCompatParcelizer
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L37
                if (r2 == r5) goto L31
                if (r2 != r3) goto L2b
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                goto L5a
            L2b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
                return r4
            L31:
                kotlinx.coroutines.flow.FlowCollector r8 = r0.serializer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                goto L4f
            L37:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                java.util.Set r8 = (java.util.Set) r8
                kotlinx.coroutines.flow.FlowCollector r8 = r7.serializer
                r0.serializer = r8
                r0.RemoteActionCompatParcelizer = r5
                androidx.room.RoomDatabase r9 = r7.read
                boolean r2 = r7.write
                o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r6 = r7.RemoteActionCompatParcelizer
                java.lang.Object r9 = kotlin.TuplesKt.performSuspending(r9, r5, r2, r6, r0)
                if (r9 != r1) goto L4f
                goto L59
            L4f:
                r0.serializer = r4
                r0.RemoteActionCompatParcelizer = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L5a
            L59:
                return r1
            L5a:
                o.createFromParcel r8 = o.createFromParcel.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.serializer.collect(new AnonymousClass2(flowCollector, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowUtil$createFlow$$inlined$map$1(Flow flow, RoomDatabase roomDatabase, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = flow;
        this.RemoteActionCompatParcelizer = roomDatabase;
        this.write = z;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
