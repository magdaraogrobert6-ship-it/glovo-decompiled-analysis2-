package androidx.room;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ClipOpCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getIntersectrtfAjoo;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ TriggerBasedInvalidationTracker RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(triggerBasedInvalidationTracker, shortNewsContentCardView, 1);
            triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.serializer = obj;
            return triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;
        }
        TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$2 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(triggerBasedInvalidationTracker, shortNewsContentCardView, 0);
        triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$2.serializer = obj;
        return triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        return i != 0 ? ((TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) create((ClipOpCompanion) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r8 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.IconCompatParcelizer
            androidx.room.TriggerBasedInvalidationTracker r1 = r7.RemoteActionCompatParcelizer
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r7.write
            if (r5 == 0) goto L1b
            if (r5 != r3) goto L16
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L2b
        L16:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
            r8 = r4
            goto L2b
        L1b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            java.lang.Object r8 = r7.serializer
            o.getIntersectrtfAjoo r8 = (o.getIntersectrtfAjoo) r8
            r7.write = r3
            java.lang.Object r8 = androidx.room.TriggerBasedInvalidationTracker.access$checkInvalidatedTables(r1, r8, r7)
            if (r8 != r0) goto L2b
            r8 = r0
        L2b:
            return r8
        L2c:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r7.write
            r6 = 2
            if (r5 == 0) goto L47
            if (r5 == r3) goto L3f
            if (r5 != r6) goto L3b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)     // Catch: android.database.SQLException -> L7a
            goto L76
        L3b:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
            goto L7c
        L3f:
            java.lang.Object r2 = r7.serializer
            o.ClipOpCompanion r2 = (o.ClipOpCompanion) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L5a
        L47:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            java.lang.Object r8 = r7.serializer
            r2 = r8
            o.ClipOpCompanion r2 = (o.ClipOpCompanion) r2
            r7.serializer = r2
            r7.write = r3
            java.lang.Boolean r8 = r2.IconCompatParcelizer(r7)
            if (r8 != r0) goto L5a
            goto L74
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L63
            goto L7a
        L63:
            o.ClipOp r8 = o.ClipOp.IMMEDIATE     // Catch: android.database.SQLException -> L7a
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r5 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1     // Catch: android.database.SQLException -> L7a
            r5.<init>(r1, r4, r3)     // Catch: android.database.SQLException -> L7a
            r7.serializer = r4     // Catch: android.database.SQLException -> L7a
            r7.write = r6     // Catch: android.database.SQLException -> L7a
            java.lang.Object r8 = r2.withTransaction(r8, r5, r7)     // Catch: android.database.SQLException -> L7a
            if (r8 != r0) goto L76
        L74:
            r4 = r0
            goto L7c
        L76:
            r4 = r8
            java.util.Set r4 = (java.util.Set) r4     // Catch: android.database.SQLException -> L7a
            goto L7c
        L7a:
            o.ItemTouchHelperAdapter r4 = o.ItemTouchHelperAdapter.serializer
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
