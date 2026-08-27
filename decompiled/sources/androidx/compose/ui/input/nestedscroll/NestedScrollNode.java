package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    private static /* synthetic */ void getNestedCoroutineScope$annotations() {
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui(null);
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final getContentViewGroupParentLayout invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }

            {
                super(0);
            }
        });
        this.resolvedDispatcher.setScope$ui(getCoroutineScope());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        long jM3920unboximpl;
        long jM3922getZero9UxMQ8M;
        long j5;
        if (shortNewsContentCardView instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) shortNewsContentCardView;
            int i = nestedScrollNode$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, shortNewsContentCardView);
            }
        } else {
            nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, shortNewsContentCardView);
        }
        Object objMo54onPostFlingRZ2iAVY = nestedScrollNode$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollNode$onPostFling$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMo54onPostFlingRZ2iAVY);
            NestedScrollConnection nestedScrollConnection = this.connection;
            j3 = j;
            nestedScrollNode$onPostFling$1.J$0 = j3;
            j4 = j2;
            nestedScrollNode$onPostFling$1.J$1 = j4;
            nestedScrollNode$onPostFling$1.label = 1;
            objMo54onPostFlingRZ2iAVY = nestedScrollConnection.mo54onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
            if (objMo54onPostFlingRZ2iAVY != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            long j6 = nestedScrollNode$onPostFling$1.J$1;
            long j7 = nestedScrollNode$onPostFling$1.J$0;
            ExtrasKt.RemoteActionCompatParcelizer(objMo54onPostFlingRZ2iAVY);
            j4 = j6;
            j3 = j7;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = nestedScrollNode$onPostFling$1.J$0;
            ExtrasKt.RemoteActionCompatParcelizer(objMo54onPostFlingRZ2iAVY);
        }
        jM3922getZero9UxMQ8M = ((Velocity) objMo54onPostFlingRZ2iAVY).m3920unboximpl();
        jM3920unboximpl = j5;
        return Velocity.m3902boximpl(Velocity.m3915plusAH228Gc(jM3920unboximpl, jM3922getZero9UxMQ8M));
        jM3920unboximpl = ((Velocity) objMo54onPostFlingRZ2iAVY).m3920unboximpl();
        NestedScrollConnection parentConnection = isAttached() ? getParentConnection() : this.lastKnownParentNode;
        if (parentConnection != null) {
            long jM3915plusAH228Gc = Velocity.m3915plusAH228Gc(j3, jM3920unboximpl);
            long jM3914minusAH228Gc = Velocity.m3914minusAH228Gc(j4, jM3920unboximpl);
            nestedScrollNode$onPostFling$1.J$0 = jM3920unboximpl;
            nestedScrollNode$onPostFling$1.label = 2;
            objMo54onPostFlingRZ2iAVY = parentConnection.mo54onPostFlingRZ2iAVY(jM3915plusAH228Gc, jM3914minusAH228Gc, nestedScrollNode$onPostFling$1);
            if (objMo54onPostFlingRZ2iAVY != coroutineSingletons) {
                j5 = jM3920unboximpl;
                jM3922getZero9UxMQ8M = ((Velocity) objMo54onPostFlingRZ2iAVY).m3920unboximpl();
                jM3920unboximpl = j5;
            }
            return coroutineSingletons;
        }
        jM3922getZero9UxMQ8M = Velocity.Companion.m3922getZero9UxMQ8M();
        return Velocity.m3902boximpl(Velocity.m3915plusAH228Gc(jM3920unboximpl, jM3922getZero9UxMQ8M));
    }

    public final void updateNode$ui(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.findNearestAttachedAncestor(this);
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.setLastKnownParentNode$ui(nestedScrollNode);
        resetDispatcherFields();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        long jMo55onPostScrollDzOQY0M = this.connection.mo55onPostScrollDzOQY0M(j, j2, i);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m482plusMKHz9U(jMo55onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo55onPostScrollDzOQY0M(Offset.m482plusMKHz9U(j, jMo55onPostScrollDzOQY0M), Offset.m481minusMKHz9U(j2, jMo55onPostScrollDzOQY0M), i) : Offset.Companion.m493getZeroF1C5BW0());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r9 == r1) goto L25;
     */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo123onPreFlingQWom1Mo(long r7, o.ShortNewsContentCardView<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            long r7 = r0.J$0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L6c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            r7 = 0
            return r7
        L33:
            long r7 = r0.J$0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L4d
        L39:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.getParentConnection()
            if (r9 == 0) goto L54
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.mo123onPreFlingQWom1Mo(r7, r0)
            if (r9 != r1) goto L4d
            goto L6a
        L4d:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r4 = r9.m3920unboximpl()
            goto L5a
        L54:
            androidx.compose.ui.unit.Velocity$Companion r9 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r9.m3922getZero9UxMQ8M()
        L5a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.connection
            long r7 = androidx.compose.ui.unit.Velocity.m3914minusAH228Gc(r7, r4)
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r9.mo123onPreFlingQWom1Mo(r7, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r7 = r4
        L6c:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r0 = r9.m3920unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m3915plusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m3902boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo123onPreFlingQWom1Mo(long, o.ShortNewsContentCardView):java.lang.Object");
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui();
        }
        return null;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo93onPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo93onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo93onPreScrollOzD1aCk(j, i) : Offset.Companion.m493getZeroF1C5BW0();
        return Offset.m482plusMKHz9U(jMo93onPreScrollOzD1aCk, this.connection.mo93onPreScrollOzD1aCk(Offset.m481minusMKHz9U(j, jMo93onPreScrollOzD1aCk), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getContentViewGroupParentLayout getNestedCoroutineScope() {
        NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        getContentViewGroupParentLayout nestedCoroutineScope = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.getNestedCoroutineScope() : null;
        if (nestedCoroutineScope != null && YieldKt.write(nestedCoroutineScope)) {
            return nestedCoroutineScope;
        }
        getContentViewGroupParentLayout scope$ui = this.resolvedDispatcher.getScope$ui();
        if (scope$ui != null) {
            return scope$ui;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (nestedScrollDispatcher != this.resolvedDispatcher) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }
}
