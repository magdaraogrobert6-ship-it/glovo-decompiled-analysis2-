package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 calculateNestedScrollScope = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final getContentViewGroupParentLayout invoke() {
            return this.this$0.getScope$ui();
        }

        {
            super(0);
        }
    };
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private getContentViewGroupParentLayout scope;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getCalculateNestedScrollScope$ui() {
        return this.calculateNestedScrollScope;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getNestedScrollNode$ui() {
        return this.nestedScrollNode;
    }

    public final getContentViewGroupParentLayout getScope$ui() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.calculateNestedScrollScope = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.scope = getcontentviewgroupparentlayout;
    }

    public final getContentViewGroupParentLayout getCoroutineScope() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.calculateNestedScrollScope.invoke();
        if (getcontentviewgroupparentlayout != null) {
            return getcontentviewgroupparentlayout;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final NestedScrollConnection getParent$ui() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1919dispatchPostFlingRZ2iAVY(long r8, long r10, o.ShortNewsContentCardView<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L6d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            r8 = 0
            return r8
        L32:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L4e
        L36:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r7.getParent$ui()
            if (r12 != 0) goto L5c
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L55
            r6.label = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo54onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L4e
            goto L6c
        L4e:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m3920unboximpl()
            goto L7a
        L55:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m3922getZero9UxMQ8M()
            goto L7a
        L5c:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui()
            if (r1 == 0) goto L74
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo54onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L6d
        L6c:
            return r0
        L6d:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m3920unboximpl()
            goto L7a
        L74:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m3922getZero9UxMQ8M()
        L7a:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m3902boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m1919dispatchPostFlingRZ2iAVY(long, long, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    public final Object m1921dispatchPreFlingQWom1Mo(long j, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long jM3922getZero9UxMQ8M;
        if (shortNewsContentCardView instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) shortNewsContentCardView;
            int i = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, shortNewsContentCardView);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, shortNewsContentCardView);
        }
        Object objMo123onPreFlingQWom1Mo = nestedScrollDispatcher$dispatchPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMo123onPreFlingQWom1Mo);
            NestedScrollConnection parent$ui = getParent$ui();
            if (parent$ui != null) {
                nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                objMo123onPreFlingQWom1Mo = parent$ui.mo123onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                if (objMo123onPreFlingQWom1Mo == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                jM3922getZero9UxMQ8M = Velocity.Companion.m3922getZero9UxMQ8M();
            }
            return Velocity.m3902boximpl(jM3922getZero9UxMQ8M);
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objMo123onPreFlingQWom1Mo);
        jM3922getZero9UxMQ8M = ((Velocity) objMo123onPreFlingQWom1Mo).m3920unboximpl();
        return Velocity.m3902boximpl(jM3922getZero9UxMQ8M);
    }

    /* JADX INFO: renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m1920dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo55onPostScrollDzOQY0M(j, j2, i) : Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m1922dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo93onPreScrollOzD1aCk(j, i) : Offset.Companion.m493getZeroF1C5BW0();
    }
}
