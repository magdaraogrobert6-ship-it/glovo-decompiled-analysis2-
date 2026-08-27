package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectorInfo;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.AnchoredDraggableKtanimateTo4;
import o.ContentInViewNode;
import o.createInAppMessageEventSubscriber;
import o.detectDragGestures;
import o.getCieXyz;
import o.onContentCardClicked;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private AnchoredDraggableKtanimateTo4 keysCurrentlyDown;
    private final Owner owner;
    private final PlatformFocusOwner platformFocusOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.Companion.m412getNeverLCbbffg(), false, null, null, 14, null);
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return this.this$0.getRootFocusNode$ui();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode$ui().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }
    };
    private final ContentInViewNode listeners = new ContentInViewNode(1);

    @Override // androidx.compose.ui.focus.FocusOwner
    public ContentInViewNode getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetNode getRootFocusNode$ui() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean isFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo364moveFocus3ESFkO8(int i) {
        return mo370moveFocusaToIllA(i, true);
    }

    public final void setRootFocusNode$ui(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ) | NodeKind.m2551constructorimpl(8192);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    if ((NodeKind.m2551constructorimpl(Fields.RotationZ) & child$ui.getKindSet$ui()) != 0) {
                        return node2;
                    }
                    node2 = child$ui;
                }
            }
        }
        return node2;
    }

    /* JADX INFO: renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m376validateKeyEventZmokQxo(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        long j2;
        int iWrite;
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        int iM1902getTypeZmokQxo = KeyEvent_androidKt.m1902getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        char c = '?';
        int i = 0;
        if (!KeyEventType.m1894equalsimpl0(iM1902getTypeZmokQxo, companion.m1898getKeyDownCS__XNY())) {
            if (!KeyEventType.m1894equalsimpl0(iM1902getTypeZmokQxo, companion.m1899getKeyUpCS__XNY())) {
                return true;
            }
            AnchoredDraggableKtanimateTo4 anchoredDraggableKtanimateTo4 = this.keysCurrentlyDown;
            if (anchoredDraggableKtanimateTo4 == null || !anchoredDraggableKtanimateTo4.IconCompatParcelizer(jM1901getKeyZmokQxo)) {
                return false;
            }
            AnchoredDraggableKtanimateTo4 anchoredDraggableKtanimateTo5 = this.keysCurrentlyDown;
            if (anchoredDraggableKtanimateTo5 != null) {
                int iHashCode = Long.hashCode(jM1901getKeyZmokQxo) * (-862048943);
                int i2 = iHashCode ^ (iHashCode << 16);
                int i3 = anchoredDraggableKtanimateTo5.IconCompatParcelizer;
                int i4 = i2 >>> 7;
                loop5: while (true) {
                    int i5 = i4 & i3;
                    long[] jArr = anchoredDraggableKtanimateTo5.serializer;
                    int i6 = i5 >> 3;
                    int i7 = (i5 & 7) << 3;
                    long j3 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
                    long j4 = (((long) (i2 & 127)) * 72340172838076673L) ^ j3;
                    for (long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i3;
                        if (anchoredDraggableKtanimateTo5.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == jM1901getKeyZmokQxo) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i += 8;
                    i4 = i5 + i;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    anchoredDraggableKtanimateTo5.write--;
                    long[] jArr2 = anchoredDraggableKtanimateTo5.serializer;
                    int i8 = anchoredDraggableKtanimateTo5.IconCompatParcelizer;
                    int i9 = iNumberOfTrailingZeros >> 3;
                    int i10 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
                    jArr2[i9] = j6;
                    jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        AnchoredDraggableKtanimateTo4 anchoredDraggableKtanimateTo6 = this.keysCurrentlyDown;
        if (anchoredDraggableKtanimateTo6 == null) {
            anchoredDraggableKtanimateTo6 = new AnchoredDraggableKtanimateTo4(3);
            this.keysCurrentlyDown = anchoredDraggableKtanimateTo6;
        }
        AnchoredDraggableKtanimateTo4 anchoredDraggableKtanimateTo7 = anchoredDraggableKtanimateTo6;
        int iHashCode2 = Long.hashCode(jM1901getKeyZmokQxo) * (-862048943);
        int i11 = iHashCode2 ^ (iHashCode2 << 16);
        int i12 = i11 >>> 7;
        int i13 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
        int i14 = i12 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr3 = anchoredDraggableKtanimateTo7.serializer;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j7 = (jArr3[i16] >>> i17) | ((jArr3[i16 + 1] << (64 - i17)) & ((-i17) >> c));
            long j8 = i11 & 127;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            for (long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iWrite = (i14 + (Long.numberOfTrailingZeros(j10) >> 3)) & i13;
                if (anchoredDraggableKtanimateTo7.RemoteActionCompatParcelizer[iWrite] == jM1901getKeyZmokQxo) {
                    j = jM1901getKeyZmokQxo;
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iWrite2 = anchoredDraggableKtanimateTo7.write(i12);
                if (anchoredDraggableKtanimateTo7.read != 0 || ((anchoredDraggableKtanimateTo7.serializer[iWrite2 >> 3] >> ((iWrite2 & 7) << 3)) & 255) == 254) {
                    j = jM1901getKeyZmokQxo;
                    j2 = j8;
                    iWrite = iWrite2;
                } else {
                    int i18 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
                    if (i18 <= 8 || Long.compareUnsigned(((long) anchoredDraggableKtanimateTo7.write) * 32, ((long) i18) * 25) > 0) {
                        j = jM1901getKeyZmokQxo;
                        j2 = j8;
                        int iSerializer = detectDragGestures.serializer(anchoredDraggableKtanimateTo7.IconCompatParcelizer);
                        long[] jArr4 = anchoredDraggableKtanimateTo7.serializer;
                        long[] jArr5 = anchoredDraggableKtanimateTo7.RemoteActionCompatParcelizer;
                        int i19 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
                        anchoredDraggableKtanimateTo7.read(iSerializer);
                        long[] jArr6 = anchoredDraggableKtanimateTo7.serializer;
                        long[] jArr7 = anchoredDraggableKtanimateTo7.RemoteActionCompatParcelizer;
                        int i20 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr4[i21 >> 3] >> ((i21 & 7) << 3)) & 255) < 128) {
                                long j11 = jArr5[i21];
                                int iHashCode3 = Long.hashCode(j11) * (-862048943);
                                int i22 = iHashCode3 ^ (iHashCode3 << 16);
                                int iWrite3 = anchoredDraggableKtanimateTo7.write(i22 >>> 7);
                                long j12 = i22 & 127;
                                int i23 = iWrite3 >> 3;
                                int i24 = (iWrite3 & 7) << 3;
                                long j13 = (jArr6[i23] & (~(255 << i24))) | (j12 << i24);
                                jArr6[i23] = j13;
                                jArr6[(((iWrite3 - 7) & i20) + (i20 & 7)) >> 3] = j13;
                                jArr7[iWrite3] = j11;
                            }
                            i21++;
                            jArr4 = jArr4;
                            jArr5 = jArr5;
                        }
                    } else {
                        long[] jArr8 = anchoredDraggableKtanimateTo7.serializer;
                        int i25 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
                        long[] jArr9 = anchoredDraggableKtanimateTo7.RemoteActionCompatParcelizer;
                        for (int i26 = 0; i26 < ((i25 + 7) >> 3); i26++) {
                            long j14 = jArr8[i26] & (-9187201950435737472L);
                            jArr8[i26] = ((~j14) + (j14 >>> 7)) & (-72340172838076674L);
                        }
                        int iRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(jArr8);
                        int i27 = iRemoteActionCompatParcelizer - 1;
                        jArr8[i27] = (jArr8[i27] & 72057594037927935L) | (-72057594037927936L);
                        jArr8[iRemoteActionCompatParcelizer] = jArr8[0];
                        int i28 = 0;
                        while (i28 != i25) {
                            int i29 = i28 >> 3;
                            int i30 = (i28 & 7) << 3;
                            long j15 = (jArr8[i29] >> i30) & 255;
                            if (j15 != 128 && j15 == 254) {
                                int iHashCode4 = Long.hashCode(jArr9[i28]) * (-862048943);
                                int i31 = iHashCode4 ^ (iHashCode4 << 16);
                                int i32 = i31 >>> 7;
                                int iWrite4 = anchoredDraggableKtanimateTo7.write(i32);
                                int i33 = i32 & i25;
                                if (((iWrite4 - i33) & i25) / 8 == ((i28 - i33) & i25) / 8) {
                                    jArr8[i29] = ((~(255 << i30)) & jArr8[i29]) | (((long) (i31 & 127)) << i30);
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i28++;
                                    jM1901getKeyZmokQxo = jM1901getKeyZmokQxo;
                                } else {
                                    long j16 = jM1901getKeyZmokQxo;
                                    int i34 = iWrite4 >> 3;
                                    long j17 = jArr8[i34];
                                    int i35 = (iWrite4 & 7) << 3;
                                    if (((j17 >> i35) & 255) == 128) {
                                        jArr8[i34] = (j17 & (~(255 << i35))) | (((long) (i31 & 127)) << i35);
                                        jArr8[i29] = (jArr8[i29] & (~(255 << i30))) | (128 << i30);
                                        jArr9[iWrite4] = jArr9[i28];
                                        jArr9[i28] = 0;
                                    } else {
                                        jArr8[i34] = (j17 & (~(255 << i35))) | (((long) (i31 & 127)) << i35);
                                        long j18 = jArr9[iWrite4];
                                        jArr9[iWrite4] = jArr9[i28];
                                        jArr9[i28] = j18;
                                        i28--;
                                    }
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i28++;
                                    jM1901getKeyZmokQxo = j16;
                                    j8 = j8;
                                }
                            } else {
                                i28++;
                            }
                        }
                        j = jM1901getKeyZmokQxo;
                        j2 = j8;
                        anchoredDraggableKtanimateTo7.read = detectDragGestures.IconCompatParcelizer(anchoredDraggableKtanimateTo7.IconCompatParcelizer) - anchoredDraggableKtanimateTo7.write;
                    }
                    iWrite = anchoredDraggableKtanimateTo7.write(i12);
                }
                anchoredDraggableKtanimateTo7.write++;
                int i36 = anchoredDraggableKtanimateTo7.read;
                long[] jArr10 = anchoredDraggableKtanimateTo7.serializer;
                int i37 = iWrite >> 3;
                long j19 = jArr10[i37];
                int i38 = (iWrite & 7) << 3;
                anchoredDraggableKtanimateTo7.read = i36 - (((j19 >> i38) & 255) == 128 ? 1 : 0);
                int i39 = anchoredDraggableKtanimateTo7.IconCompatParcelizer;
                long j20 = (j19 & (~(255 << i38))) | (j2 << i38);
                jArr10[i37] = j20;
                jArr10[(((iWrite - 7) & i39) + (i39 & 7)) >> 3] = j20;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            jM1901getKeyZmokQxo = jM1901getKeyZmokQxo;
            c = '?';
        }
        anchoredDraggableKtanimateTo7.RemoteActionCompatParcelizer[iWrite] = j;
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    public boolean mo366clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i) {
        boolean zClearFocus;
        if (z) {
            zClearFocus = clearFocus(z, z2);
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m394performCustomClearFocusMxy_nc0(this.rootFocusNode, i).ordinal()];
            zClearFocus = false;
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return false;
                }
                zClearFocus = clearFocus(z, z2);
            }
        }
        if (zClearFocus && z3) {
            clearOwnerFocus();
        }
        return zClearFocus;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearOwnerFocus() {
        this.platformFocusOwner.clearOwnerFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        int size;
        int size2;
        NodeChain nodes$ui;
        boolean z;
        ?? Pop;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(2097152);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i = 0;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Pop = Pop;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests == 0) {
                                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                            }
                                        } else {
                                            Pop = Pop;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                    if (i == 1) {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    } else {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) Pop;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(2097152);
            if (!indirectPointerInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = indirectPointerInputModifierNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (nodePop.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((IndirectPointerInputModifierNode) arrayList.get(size2)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Initial);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Initial);
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Main);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((IndirectPointerInputModifierNode) arrayList.get(i4)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Main);
                }
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((IndirectPointerInputModifierNode) arrayList.get(size)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Final);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Final);
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size4 = changes.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (changes.get(i6).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo367dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui;
        boolean z;
        ?? Pop;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RenderEffect);
            if (!focusTargetNodeFindActiveFocusNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindActiveFocusNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i = 0;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Pop = Pop;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests == 0) {
                                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                            }
                                        } else {
                                            Pop = Pop;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                    if (i == 1) {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    } else {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) Pop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(Fields.RenderEffect);
            if (!softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = softKeyboardInterceptionModifierNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (nodePop.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (!((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo1577onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                    return true;
                }
            }
            ?? node2 = softKeyboardInterceptionModifierNode.getNode();
            ?? oncreatevirtualviewtranslationrequests3 = 0;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).mo1577onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui3 = ((DelegatingNode) node2).getDelegate$ui();
                    int i4 = 0;
                    while (delegate$ui3 != null) {
                        if ((delegate$ui3.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = node2;
                                oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                                oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                                node2 = delegate$ui3;
                            } else {
                                if (oncreatevirtualviewtranslationrequests3 == 0) {
                                    oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node2 != 0) {
                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(node2);
                                    node2 = 0;
                                }
                                oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui3);
                            }
                        } else {
                            node2 = node2;
                            oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                        }
                        delegate$ui3 = delegate$ui3.getChild$ui();
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    }
                    if (i4 == 1) {
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    } else {
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    }
                }
                node2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
            }
            ?? node3 = softKeyboardInterceptionModifierNode.getNode();
            ?? oncreatevirtualviewtranslationrequests4 = 0;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo1576onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui() & iM2551constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui4 = ((DelegatingNode) node3).getDelegate$ui();
                    int i5 = 0;
                    while (delegate$ui4 != null) {
                        if ((delegate$ui4.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node3 = node3;
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                node3 = delegate$ui4;
                            } else {
                                if (oncreatevirtualviewtranslationrequests4 == 0) {
                                    oncreatevirtualviewtranslationrequests4 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node3 != 0) {
                                    oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(node3);
                                    node3 = 0;
                                }
                                oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(delegate$ui4);
                            }
                        } else {
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        }
                        delegate$ui4 = delegate$ui4.getChild$ui();
                        node3 = node3;
                        oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                    }
                    if (i5 == 1) {
                        node3 = node3;
                        oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                    } else {
                        node3 = node3;
                        oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                    }
                }
                node3 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo1576onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui;
        boolean z;
        ?? Pop;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.Clip);
            if (!focusTargetNodeFindFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindFocusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i = 0;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Pop = Pop;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests == 0) {
                                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                            }
                                        } else {
                                            Pop = Pop;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                    if (i == 1) {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    } else {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) Pop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(Fields.Clip);
            if (!rotaryInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = rotaryInputModifierNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (nodePop.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (!((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                    return true;
                }
            }
            ?? node2 = rotaryInputModifierNode.getNode();
            ?? oncreatevirtualviewtranslationrequests3 = 0;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui3 = ((DelegatingNode) node2).getDelegate$ui();
                    int i4 = 0;
                    while (delegate$ui3 != null) {
                        if ((delegate$ui3.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = node2;
                                oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                                oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                                node2 = delegate$ui3;
                            } else {
                                if (oncreatevirtualviewtranslationrequests3 == 0) {
                                    oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node2 != 0) {
                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(node2);
                                    node2 = 0;
                                }
                                oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui3);
                            }
                        } else {
                            node2 = node2;
                            oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                        }
                        delegate$ui3 = delegate$ui3.getChild$ui();
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    }
                    if (i4 == 1) {
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    } else {
                        node2 = node2;
                        oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests3;
                    }
                }
                node2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
            }
            if (!((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue()) {
                ?? node3 = rotaryInputModifierNode.getNode();
                ?? oncreatevirtualviewtranslationrequests4 = 0;
                while (node3 != 0) {
                    if (node3 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(rotaryScrollEvent)) {
                        }
                    } else if ((node3.getKindSet$ui() & iM2551constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui4 = ((DelegatingNode) node3).getDelegate$ui();
                        int i5 = 0;
                        while (delegate$ui4 != null) {
                            if ((delegate$ui4.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = node3;
                                    oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                    oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                    node3 = delegate$ui4;
                                } else {
                                    if (oncreatevirtualviewtranslationrequests4 == 0) {
                                        oncreatevirtualviewtranslationrequests4 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                    }
                                    if (node3 != 0) {
                                        oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(node3);
                                        node3 = 0;
                                    }
                                    oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(delegate$ui4);
                                }
                            } else {
                                node3 = node3;
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                            }
                            delegate$ui4 = delegate$ui4.getChild$ui();
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        }
                        if (i5 == 1) {
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        } else {
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        }
                    }
                    node3 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (!((RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void focusTargetAvailable() {
        this.platformFocusOwner.focusTargetAvailable();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean hasFocusableContent() {
        if (this.rootFocusNode.isAttached()) {
            FocusTargetNode focusTargetNode = this.rootFocusNode;
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
            }
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
            if (child$ui == null) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusTargetNode.getNode(), false);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i = oncreatevirtualviewtranslationrequests.read;
                if (i == 0) {
                    break;
                }
                Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
                if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                    for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                        if ((child$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            Modifier.Node nodePop = child$ui2;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                    if (focusTargetNode2.isAttached() && focusTargetNode2.fetchFocusProperties$ui().getCanFocus()) {
                                        return true;
                                    }
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, false);
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean hasNonInteropFocusableContent() {
        if (this.rootFocusNode.isAttached()) {
            FocusTargetNode focusTargetNode = this.rootFocusNode;
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
            }
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
            if (child$ui == null) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusTargetNode.getNode(), false);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i = oncreatevirtualviewtranslationrequests.read;
                if (i == 0) {
                    break;
                }
                Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
                if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                    for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                        if ((child$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            Modifier.Node nodePop = child$ui2;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                    if (focusTargetNode2.isAttached()) {
                                        FocusProperties focusPropertiesFetchFocusProperties$ui = focusTargetNode2.fetchFocusProperties$ui();
                                        if (focusTargetNode2.isAttached() && !focusTargetNode2.isInteropViewHost() && focusPropertiesFetchFocusProperties$ui.getCanFocus()) {
                                            return true;
                                        }
                                    }
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, false);
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno */
    public boolean mo371requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect) {
        return this.platformFocusOwner.mo419requestOwnerFocus7o62pno(focusDirection, rect);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: resetFocus-3ESFkO8 */
    public boolean mo372resetFocus3ESFkO8(final int i) {
        if (!mo366clearFocusI7lrPNg(false, true, false, i)) {
            return false;
        }
        Boolean boolMo369focusSearchULY8qGw = mo369focusSearchULY8qGw(i, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(i));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        boolean zBooleanValue = boolMo369focusSearchULY8qGw != null ? boolMo369focusSearchULY8qGw.booleanValue() : false;
        if (!zBooleanValue) {
            clearOwnerFocus();
        }
        return zBooleanValue;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidation();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        ContentInViewNode listeners = getListeners();
        Object[] objArr = listeners.read;
        int i = listeners.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            ((FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setFocusCaptured(boolean z) {
        if (z && getActiveFocusTargetNode() == null) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: takeFocus-aToIllA */
    public boolean mo373takeFocusaToIllA(final int i, Rect rect) {
        Boolean boolMo369focusSearchULY8qGw = mo369focusSearchULY8qGw(i, rect, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(i));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (boolMo369focusSearchULY8qGw != null) {
            return boolMo369focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(PlatformFocusOwner platformFocusOwner, Owner owner) {
        this.platformFocusOwner = platformFocusOwner;
        this.owner = owner;
        this.focusInvalidationManager = new FocusInvalidationManager(this, owner);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || getActiveFocusTargetNode() == null) {
            return;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
    }

    /* JADX INFO: renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final <T> T m374nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final <T extends DelegatableNode> void m375traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        if (delegatableNode.getNode() != null) {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        if (delegatableNode.getNode() == null) {
            return;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        FocusTargetNode focusTargetNode = this.activeFocusTargetNode;
        if (focusTargetNode == null || !focusTargetNode.isAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return focusOwnerImpl.clearFocus(z, z2);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: moveFocus-aToIllA */
    public boolean mo370moveFocusaToIllA(final int i, boolean z) {
        FocusTargetNode activeFocusTargetNode;
        if ((ComposeUiFlags.isViewFocusFixEnabled || (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled && (activeFocusTargetNode = getActiveFocusTargetNode()) != null && activeFocusTargetNode.isInteropViewHost())) && this.platformFocusOwner.mo418moveFocusInChildren3ESFkO8(i)) {
            return true;
        }
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = Boolean.FALSE;
        FocusTargetNode activeFocusTargetNode2 = getActiveFocusTargetNode();
        Boolean boolMo369focusSearchULY8qGw = mo369focusSearchULY8qGw(i, this.platformFocusOwner.getEmbeddedViewFocusRect(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                createinappmessageeventsubscriber.IconCompatParcelizer = Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(i));
                return (Boolean) createinappmessageeventsubscriber.IconCompatParcelizer;
            }
        });
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{boolMo369focusSearchULY8qGw, Boolean.TRUE}, getCieXyz.write())).booleanValue() && activeFocusTargetNode2 != getActiveFocusTargetNode()) {
            return true;
        }
        if (boolMo369focusSearchULY8qGw != null && createinappmessageeventsubscriber.IconCompatParcelizer != null) {
            if (boolMo369focusSearchULY8qGw.booleanValue() && ((Boolean) createinappmessageeventsubscriber.IconCompatParcelizer).booleanValue()) {
                return true;
            }
            if (FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(i) && z) {
                return mo366clearFocusI7lrPNg(false, true, false, i) && mo373takeFocusaToIllA(i, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && !ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                return this.platformFocusOwner.mo418moveFocusInChildren3ESFkO8(i);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x017d A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0182  */
    /* JADX WARN: Code duplicated, block: B:318:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010d A[ADDED_TO_REGION, LOOP:15: B:71:0x010d->B:99:0x0160, LOOP_START, PHI: r10
  0x010d: PHI (r10v9 androidx.compose.ui.Modifier$Node) = (r10v4 androidx.compose.ui.Modifier$Node), (r10v10 androidx.compose.ui.Modifier$Node) binds: [B:70:0x010b, B:99:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x010f A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011f A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0035, B:112:0x0185, B:114:0x0193, B:115:0x0196, B:117:0x01a5, B:120:0x01b6, B:124:0x01c1, B:127:0x01c7, B:128:0x01cc, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:150:0x0210, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:170:0x0257, B:172:0x025b, B:195:0x02a3, B:176:0x0267, B:178:0x026e, B:180:0x0272, B:182:0x027c, B:184:0x0283, B:188:0x028b, B:190:0x0294, B:191:0x0298, B:192:0x029b, B:196:0x02a8, B:200:0x02b8, B:202:0x02bf, B:204:0x02c3, B:227:0x030b, B:208:0x02cf, B:210:0x02d6, B:212:0x02da, B:214:0x02e4, B:216:0x02eb, B:220:0x02f3, B:222:0x02fc, B:223:0x0300, B:224:0x0303, B:229:0x0312, B:231:0x0319, B:18:0x003d, B:20:0x004b, B:21:0x004e, B:23:0x0058, B:26:0x0069, B:30:0x0074, B:61:0x00d3, B:63:0x00d7, B:33:0x0079, B:35:0x0080, B:37:0x0084, B:39:0x008e, B:41:0x0095, B:45:0x009d, B:47:0x00a6, B:48:0x00aa, B:49:0x00ad, B:52:0x00b5, B:53:0x00ba, B:54:0x00bf, B:56:0x00c5, B:58:0x00cb, B:64:0x00dd, B:66:0x00ed, B:67:0x00f0, B:69:0x00fe, B:72:0x010f, B:76:0x011a, B:107:0x0179, B:109:0x017d, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0134, B:87:0x013b, B:91:0x0143, B:93:0x014c, B:94:0x0150, B:95:0x0153, B:98:0x015b, B:99:0x0160, B:100:0x0165, B:102:0x016b, B:104:0x0171), top: B:241:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v12, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v18, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    public boolean mo368dispatchKeyEventYhN2O0w(KeyEvent keyEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        FocusTargetNode focusTargetNode;
        int iM2551constructorimpl;
        Modifier.Node parent$ui;
        LayoutNode layoutNodeRequireLayoutNode;
        Object obj;
        KeyInputModifierNode keyInputModifierNode;
        Modifier.Node node;
        NodeChain nodes$ui;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests;
        Modifier.Node nodePop;
        Object obj2;
        NodeChain nodes$ui2;
        int size;
        NodeChain nodes$ui3;
        boolean z;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.hasPendingInvalidation()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!m376validateKeyEventZmokQxo(keyEvent)) {
                Trace.endSection();
                return false;
            }
            FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
            if (focusTargetNodeFindFocusTargetNode == null || (node = lastLocalKeyInputNode(focusTargetNodeFindFocusTargetNode)) == null) {
                if (focusTargetNodeFindFocusTargetNode != null) {
                    int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(8192);
                    if (!focusTargetNodeFindFocusTargetNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node2 = focusTargetNodeFindFocusTargetNode.getNode();
                    LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindFocusTargetNode);
                    loop10: while (true) {
                        if (layoutNodeRequireLayoutNode2 == null) {
                            obj2 = null;
                            break;
                        }
                        if ((layoutNodeRequireLayoutNode2.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & iM2551constructorimpl2) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                    onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                                    Modifier.Node nodePop2 = node2;
                                    while (nodePop2 != null) {
                                        if (nodePop2 instanceof KeyInputModifierNode) {
                                            obj2 = nodePop2;
                                            break loop10;
                                        }
                                        if ((nodePop2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui = ((DelegatingNode) nodePop2).getDelegate$ui();
                                            int i = 0;
                                            while (delegate$ui != null) {
                                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        nodePop2 = nodePop2;
                                                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                        nodePop2 = delegate$ui;
                                                    } else {
                                                        if (oncreatevirtualviewtranslationrequests2 == null) {
                                                            oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                        }
                                                        if (nodePop2 != null) {
                                                            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop2);
                                                            nodePop2 = null;
                                                        }
                                                        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                                    }
                                                } else {
                                                    nodePop2 = nodePop2;
                                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                }
                                                delegate$ui = delegate$ui.getChild$ui();
                                                nodePop2 = nodePop2;
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                            }
                                            if (i == 1) {
                                                nodePop2 = nodePop2;
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                            } else {
                                                nodePop2 = nodePop2;
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                            }
                                        }
                                        nodePop2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                                    }
                                }
                                node2 = node2.getParent$ui();
                            }
                        }
                        layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                        node2 = (layoutNodeRequireLayoutNode2 == null || (nodes$ui2 = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
                    }
                    KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) obj2;
                    if (keyInputModifierNode2 != null) {
                        node = keyInputModifierNode2.getNode();
                    } else {
                        focusTargetNode = this.rootFocusNode;
                        iM2551constructorimpl = NodeKind.m2551constructorimpl(8192);
                        if (!focusTargetNode.getNode().isAttached()) {
                            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                        }
                        parent$ui = focusTargetNode.getNode().getParent$ui();
                        layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                        loop14: while (true) {
                            if (layoutNodeRequireLayoutNode != null) {
                                obj = null;
                                break;
                            }
                            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                                while (parent$ui != null) {
                                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        oncreatevirtualviewtranslationrequests = null;
                                        nodePop = parent$ui;
                                        while (nodePop != null) {
                                            if (nodePop instanceof KeyInputModifierNode) {
                                                obj = nodePop;
                                                break loop14;
                                            }
                                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) == 0 && (nodePop instanceof DelegatingNode)) {
                                                Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui();
                                                int i2 = 0;
                                                while (delegate$ui2 != null) {
                                                    if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            nodePop = nodePop;
                                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                            nodePop = delegate$ui2;
                                                        } else {
                                                            if (oncreatevirtualviewtranslationrequests == null) {
                                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                            }
                                                            if (nodePop != null) {
                                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                                                nodePop = null;
                                                            }
                                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui2);
                                                        }
                                                    } else {
                                                        nodePop = nodePop;
                                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                    }
                                                    delegate$ui2 = delegate$ui2.getChild$ui();
                                                    nodePop = nodePop;
                                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                }
                                                if (i2 == 1) {
                                                    nodePop = nodePop;
                                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                } else {
                                                    nodePop = nodePop;
                                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                }
                                            }
                                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                                        }
                                    }
                                    parent$ui = parent$ui.getParent$ui();
                                }
                            }
                            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                            parent$ui = (layoutNodeRequireLayoutNode != null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
                        }
                        keyInputModifierNode = (KeyInputModifierNode) obj;
                        if (keyInputModifierNode != null) {
                            node = keyInputModifierNode.getNode();
                        } else {
                            node = null;
                        }
                    }
                } else {
                    focusTargetNode = this.rootFocusNode;
                    iM2551constructorimpl = NodeKind.m2551constructorimpl(8192);
                    if (!focusTargetNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    parent$ui = focusTargetNode.getNode().getParent$ui();
                    layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                    loop14: while (true) {
                        if (layoutNodeRequireLayoutNode != null) {
                            obj = null;
                            break;
                        }
                        if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                            while (parent$ui != null) {
                                if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    oncreatevirtualviewtranslationrequests = null;
                                    nodePop = parent$ui;
                                    while (nodePop != null) {
                                        if (nodePop instanceof KeyInputModifierNode) {
                                            obj = nodePop;
                                            break loop14;
                                        }
                                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) == 0) {
                                        }
                                        nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                                    }
                                }
                                parent$ui = parent$ui.getParent$ui();
                            }
                        }
                        layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                        if (layoutNodeRequireLayoutNode != null) {
                        }
                    }
                    keyInputModifierNode = (KeyInputModifierNode) obj;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    } else {
                        node = null;
                    }
                }
            }
            if (node != null) {
                int iM2551constructorimpl3 = NodeKind.m2551constructorimpl(8192);
                if (!node.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui2 = node.getNode().getParent$ui();
                LayoutNode layoutNodeRequireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(node);
                ArrayList arrayList = null;
                while (layoutNodeRequireLayoutNode3 != null) {
                    if ((layoutNodeRequireLayoutNode3.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & iM2551constructorimpl3) != 0) {
                        while (parent$ui2 != null) {
                            if ((parent$ui2.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                                Modifier.Node nodePop3 = parent$ui2;
                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = null;
                                while (nodePop3 != null) {
                                    if (nodePop3 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(nodePop3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (nodePop3.getKindSet$ui() & iM2551constructorimpl3) != 0 && (nodePop3 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui3 = ((DelegatingNode) nodePop3).getDelegate$ui(); delegate$ui3 != null; delegate$ui3 = delegate$ui3.getChild$ui()) {
                                            if ((delegate$ui3.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop3 = delegate$ui3;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop3 != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop3);
                                                        nodePop3 = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nodePop3 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
                                }
                            }
                            parent$ui2 = parent$ui2.getParent$ui();
                        }
                    }
                    layoutNodeRequireLayoutNode3 = layoutNodeRequireLayoutNode3.getParent$ui();
                    parent$ui2 = (layoutNodeRequireLayoutNode3 == null || (nodes$ui3 = layoutNodeRequireLayoutNode3.getNodes$ui()) == null) ? null : nodes$ui3.getTail$ui();
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (((KeyInputModifierNode) arrayList.get(size)).mo12onPreKeyEventZmokQxo(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                }
                ?? node3 = node.getNode();
                ?? oncreatevirtualviewtranslationrequests4 = 0;
                while (node3 != 0) {
                    if (node3 instanceof KeyInputModifierNode) {
                        if (((KeyInputModifierNode) node3).mo12onPreKeyEventZmokQxo(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node3.getKindSet$ui() & iM2551constructorimpl3) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui4 = ((DelegatingNode) node3).getDelegate$ui();
                        int i5 = 0;
                        while (delegate$ui4 != null) {
                            if ((delegate$ui4.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = node3;
                                    oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                    oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                    node3 = delegate$ui4;
                                } else {
                                    if (oncreatevirtualviewtranslationrequests4 == 0) {
                                        oncreatevirtualviewtranslationrequests4 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                    }
                                    if (node3 != 0) {
                                        oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(node3);
                                        node3 = 0;
                                    }
                                    oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(delegate$ui4);
                                }
                            } else {
                                node3 = node3;
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                            }
                            delegate$ui4 = delegate$ui4.getChild$ui();
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        }
                        if (i5 == 1) {
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        } else {
                            node3 = node3;
                            oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                        }
                    }
                    node3 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests4);
                }
                if (((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? node4 = node.getNode();
                ?? oncreatevirtualviewtranslationrequests5 = 0;
                while (node4 != 0) {
                    if (node4 instanceof KeyInputModifierNode) {
                        if (((KeyInputModifierNode) node4).mo10onKeyEventZmokQxo(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node4.getKindSet$ui() & iM2551constructorimpl3) != 0 && (node4 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui5 = ((DelegatingNode) node4).getDelegate$ui();
                        int i6 = 0;
                        while (delegate$ui5 != null) {
                            if ((delegate$ui5.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node4 = node4;
                                    oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                                    oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                                    node4 = delegate$ui5;
                                } else {
                                    if (oncreatevirtualviewtranslationrequests5 == 0) {
                                        oncreatevirtualviewtranslationrequests5 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                    }
                                    if (node4 != 0) {
                                        oncreatevirtualviewtranslationrequests5.IconCompatParcelizer(node4);
                                        node4 = 0;
                                    }
                                    oncreatevirtualviewtranslationrequests5.IconCompatParcelizer(delegate$ui5);
                                }
                            } else {
                                node4 = node4;
                                oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                            }
                            delegate$ui5 = delegate$ui5.getChild$ui();
                            node4 = node4;
                            oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                        }
                        if (i6 == 1) {
                            node4 = node4;
                            oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                        } else {
                            node4 = node4;
                            oncreatevirtualviewtranslationrequests5 = oncreatevirtualviewtranslationrequests5;
                        }
                    }
                    node4 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        if (((KeyInputModifierNode) arrayList.get(i7)).mo10onKeyEventZmokQxo(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindFocusTargetNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    public Boolean mo369focusSearchULY8qGw(int i, Rect rect, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        final FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            FocusRequester focusRequesterM401customFocusSearchOMvw8 = FocusTraversalKt.m401customFocusSearchOMvw8(focusTargetNodeFindFocusTargetNode, i, this.owner.getLayoutDirection());
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{focusRequesterM401customFocusSearchOMvw8, companion.getCancel()}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{focusRequesterM401customFocusSearchOMvw8, companion.getRedirect$ui()}, getCieXyz.write())).booleanValue()) {
                    FocusTargetNode focusTargetNodeFindFocusTargetNode2 = findFocusTargetNode();
                    if (focusTargetNodeFindFocusTargetNode2 != null) {
                        return (Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNodeFindFocusTargetNode2);
                    }
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{focusRequesterM401customFocusSearchOMvw8, companion.getDefault()}, getCieXyz.write())).booleanValue()) {
                        if (focusRequesterM401customFocusSearchOMvw8 == companion.getDefault()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (focusRequesterM401customFocusSearchOMvw8 == companion.getCancel()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        boolean z = false;
                        if (focusRequesterM401customFocusSearchOMvw8.getFocusRequesterNodes$ui().read == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            onCreateVirtualViewTranslationRequests focusRequesterNodes$ui = focusRequesterM401customFocusSearchOMvw8.getFocusRequesterNodes$ui();
                            Object[] objArr = focusRequesterNodes$ui.write;
                            int i2 = focusRequesterNodes$ui.read;
                            int i3 = 0;
                            boolean z2 = false;
                            while (i3 < i2) {
                                FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i3];
                                int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
                                if (!focusRequesterModifierNode.getNode().isAttached()) {
                                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                                }
                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                                if (child$ui == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusRequesterModifierNode.getNode(), z);
                                } else {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
                                }
                                while (true) {
                                    int i4 = oncreatevirtualviewtranslationrequests.read;
                                    if (i4 == 0) {
                                        break;
                                    }
                                    Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i4 - 1);
                                    if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, z);
                                    } else {
                                        while (nodePop != null) {
                                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                                                while (nodePop != null) {
                                                    if (!(nodePop instanceof FocusTargetNode)) {
                                                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                                            Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui();
                                                            ?? r15 = z;
                                                            while (delegate$ui != null) {
                                                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                                    r15++;
                                                                    if (r15 == 1) {
                                                                        nodePop = delegate$ui;
                                                                    } else {
                                                                        if (oncreatevirtualviewtranslationrequests2 == null) {
                                                                            oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                                        }
                                                                        if (nodePop != null) {
                                                                            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                                            nodePop = null;
                                                                        }
                                                                        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                                                    }
                                                                }
                                                                delegate$ui = delegate$ui.getChild$ui();
                                                                r15 = r15;
                                                            }
                                                            if (r15 == 1) {
                                                            }
                                                        }
                                                        z = false;
                                                    } else if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((FocusTargetNode) nodePop)).booleanValue()) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                    nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                                                    z = false;
                                                }
                                                break;
                                            }
                                            nodePop = nodePop.getChild$ui();
                                            z = false;
                                        }
                                    }
                                }
                                i3++;
                                z = false;
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        focusTargetNodeFindFocusTargetNode = null;
        return FocusTraversalKt.m402focusSearch0X8WOeE(this.rootFocusNode, i, this.owner.getLayoutDirection(), rect, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                Object[] objArr2 = {focusTargetNode, focusTargetNodeFindFocusTargetNode};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    zBooleanValue = false;
                } else {
                    Object[] objArr3 = {focusTargetNode, this.getRootFocusNode$ui()};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    private final boolean clearFocus(boolean z, boolean z2) {
        NodeChain nodes$ui;
        if (getActiveFocusTargetNode() != null) {
            if (isFocusCaptured() && !z) {
                return false;
            }
            FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
            setActiveFocusTargetNode(null);
            if (z2 && activeFocusTargetNode != null) {
                activeFocusTargetNode.dispatchFocusCallbacks$ui(isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
                int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
                if (!activeFocusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
                while (layoutNodeRequireLayoutNode != null) {
                    if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                                Modifier.Node nodePop = parent$ui;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        ((FocusTargetNode) nodePop).dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                            if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nodePop = delegate$ui;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests == null) {
                                                        oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                    parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void dispatchIndirectPointerCancel() {
        IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        NodeChain nodes$ui;
        boolean z;
        ?? Pop;
        NodeChain nodes$ui2;
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(2097152);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i = 0;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Pop = Pop;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests == 0) {
                                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                            }
                                        } else {
                                            Pop = Pop;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                    if (i == 1) {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    } else {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) Pop;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(2097152);
            if (!indirectPointerInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = indirectPointerInputModifierNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (nodePop.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((IndirectPointerInputModifierNode) arrayList.get(i3)).onCancelIndirectPointerInput();
                }
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        mo366clearFocusI7lrPNg(z, true, true, FocusDirection.Companion.m355getExitdhqQ8s());
    }
}
