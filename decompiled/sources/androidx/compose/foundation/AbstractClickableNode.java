package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import coil3.RealImageLoader;
import com.roadrunner.home.HomeFragment;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtanimateToWithDecay2;
import o.Button;
import o.ButtonKt;
import o.CheckboxKt;
import o.ContextMenuColumn;
import o.DefaultPagerNestedScrollConnection;
import o.ItemFoundInScroll;
import o.LazyDslKt;
import o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11;
import o.PrefetchHandleProviderHandleAndRequestImpl;
import o.ShortNewsContentCardView;
import o.accessgetVcp;
import o.cancelPendingWebViewPause;
import o.copyjRlVdoo;
import o.getCieXyz;
import o.onAnimationEndlambda1;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, IndirectPointerInputModifierNode, PrefetchHandleProviderHandleAndRequestImpl {
    public static final accessgetVcp RemoteActionCompatParcelizer = new accessgetVcp(2);
    public boolean ComponentActivity;
    public boolean IconCompatParcelizer;
    public PagerMeasurePolicyKtrememberPagerMeasurePolicy11 MediaBrowserCompatMediaItem;
    public ButtonKt MediaDescriptionCompat;
    public DelegatableNode MediaMetadataCompat;
    public DelegatableNode MediaSessionCompatQueueItem;
    public PagerMeasurePolicyKtrememberPagerMeasurePolicy11 MediaSessionCompatResultReceiverWrapper;
    public Button MediaSessionCompatToken;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public MutableInteractionSourceImpl PlaybackStateCompatCustomAction;
    public final FocusableNode RatingCompat;
    public Button ResultReceiver;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final accessgetVcp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Role r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public MutableInteractionSourceImpl r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public long read;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU serializer;
    public final AnchoredDraggableKtanimateToWithDecay2 write;

    public void IconCompatParcelizer() {
    }

    public abstract void IconCompatParcelizer(KeyEvent keyEvent);

    public void RemoteActionCompatParcelizer(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract boolean RemoteActionCompatParcelizer(KeyEvent keyEvent);

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo12onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void read() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = this.write;
        if (mutableInteractionSourceImpl != null) {
            Button button = this.ResultReceiver;
            if (button != null) {
                mutableInteractionSourceImpl.write(new CheckboxKt(button));
            }
            Button button2 = this.MediaSessionCompatToken;
            if (button2 != null) {
                mutableInteractionSourceImpl.write(new CheckboxKt(button2));
            }
            ButtonKt buttonKt = this.MediaDescriptionCompat;
            if (buttonKt != null) {
                mutableInteractionSourceImpl.write(new copyjRlVdoo(buttonKt));
            }
            Object[] objArr = anchoredDraggableKtanimateToWithDecay2.MediaDescriptionCompat;
            long[] jArr = anchoredDraggableKtanimateToWithDecay2.read;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mutableInteractionSourceImpl.write(new CheckboxKt((Button) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.ResultReceiver = null;
        this.MediaSessionCompatToken = null;
        this.MediaDescriptionCompat = null;
        anchoredDraggableKtanimateToWithDecay2.write();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    public final void read(MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, boolean z2, String str, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        boolean z3;
        DelegatableNode delegatableNode;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, mutableInteractionSourceImpl}, getCieXyz.write())).booleanValue()) {
            z3 = false;
        } else {
            read();
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mutableInteractionSourceImpl;
            this.PlaybackStateCompatCustomAction = mutableInteractionSourceImpl;
            z3 = true;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, pagerMeasurePolicyKtrememberPagerMeasurePolicy11}, getCieXyz.write())).booleanValue()) {
            this.MediaBrowserCompatMediaItem = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
            z3 = true;
        }
        if (this.ComponentActivity != z) {
            this.ComponentActivity = z;
            if (z) {
                onObservedReadsChanged();
            }
            z3 = true;
        }
        boolean z4 = this.IconCompatParcelizer;
        FocusableNode focusableNode = this.RatingCompat;
        if (z4 != z2) {
            if (z2) {
                delegate(focusableNode);
            } else {
                undelegate(focusableNode);
                read();
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            this.IconCompatParcelizer = z2;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, str}, getCieXyz.write())).booleanValue()) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, role}, getCieXyz.write())).booleanValue()) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = role;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.ParcelableVolumeInfo = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        boolean z5 = this.PlaybackStateCompat;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (z5 != (mutableInteractionSourceImpl2 == null)) {
            boolean z6 = mutableInteractionSourceImpl2 == null;
            this.PlaybackStateCompat = z6;
            if (!z6 && this.MediaMetadataCompat == null) {
                delegatableNode = this.MediaMetadataCompat;
                if (delegatableNode == null) {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.MediaMetadataCompat = null;
                    RemoteActionCompatParcelizer();
                } else {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.MediaMetadataCompat = null;
                    RemoteActionCompatParcelizer();
                }
            } else if (z3) {
                delegatableNode = this.MediaMetadataCompat;
                if (delegatableNode == null) {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.MediaMetadataCompat = null;
                    RemoteActionCompatParcelizer();
                } else {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.MediaMetadataCompat = null;
                    RemoteActionCompatParcelizer();
                }
            }
        } else if (z3) {
            delegatableNode = this.MediaMetadataCompat;
            if (delegatableNode == null || !this.PlaybackStateCompat) {
                if (delegatableNode != null) {
                    undelegate(delegatableNode);
                }
                this.MediaMetadataCompat = null;
                RemoteActionCompatParcelizer();
            }
        }
        focusableNode.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
    }

    public AbstractClickableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, boolean z2, String str, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.PlaybackStateCompatCustomAction = mutableInteractionSourceImpl;
        this.MediaBrowserCompatMediaItem = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
        this.ComponentActivity = z;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = role;
        this.IconCompatParcelizer = z2;
        this.ParcelableVolumeInfo = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = new FocusableNode(mutableInteractionSourceImpl, Focusability.Companion.m413getSystemDefinedLCbbffg(), new HomeFragment.AnonymousClass1(1, this, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0, 1));
        int i = ContextMenuColumn.serializer;
        this.write = new AnchoredDraggableKtanimateToWithDecay2(6);
        this.read = Offset.Companion.m493getZeroF1C5BW0();
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.PlaybackStateCompatCustomAction;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mutableInteractionSourceImpl2;
        this.PlaybackStateCompat = mutableInteractionSourceImpl2 == null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = RemoteActionCompatParcelizer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.PlaybackStateCompat) {
            RemoteActionCompatParcelizer();
        }
        if (this.IconCompatParcelizer) {
            delegate(this.RatingCompat);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        read();
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null) {
            this.PlaybackStateCompatCustomAction = null;
        }
        DelegatableNode delegatableNode = this.MediaMetadataCompat;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.MediaMetadataCompat = null;
        DelegatableNode delegatableNode2 = this.MediaSessionCompatQueueItem;
        if (delegatableNode2 != null) {
            undelegate(delegatableNode2);
        }
        this.MediaSessionCompatQueueItem = null;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer && this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = delegate(DefaultPagerNestedScrollConnection.IconCompatParcelizer(this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo10onKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean z;
        RemoteActionCompatParcelizer();
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        boolean z2 = this.IconCompatParcelizer;
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = this.write;
        int i = 3;
        int i2 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (z2 && KeyEventType.m1894equalsimpl0(KeyEvent_androidKt.m1902getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1898getKeyDownCS__XNY()) && ClickableKt.RemoteActionCompatParcelizer(keyEvent)) {
            if (anchoredDraggableKtanimateToWithDecay2.read(jM1901getKeyZmokQxo)) {
                z = false;
            } else {
                Button button = new Button(this.read);
                anchoredDraggableKtanimateToWithDecay2.read(jM1901getKeyZmokQxo, button);
                if (this.PlaybackStateCompatCustomAction != null) {
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, button, shortNewsContentCardView, i2), 3);
                }
                z = true;
            }
            if (RemoteActionCompatParcelizer(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.IconCompatParcelizer && KeyEventType.m1894equalsimpl0(KeyEvent_androidKt.m1902getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1899getKeyUpCS__XNY()) && ClickableKt.RemoteActionCompatParcelizer(keyEvent)) {
            Button button2 = (Button) anchoredDraggableKtanimateToWithDecay2.IconCompatParcelizer(jM1901getKeyZmokQxo);
            if (button2 != null) {
                if (this.PlaybackStateCompatCustomAction != null) {
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, button2, shortNewsContentCardView, i), 3);
                }
                IconCompatParcelizer(keyEvent);
            }
            if (button2 != null) {
                return true;
            }
        }
        return false;
    }

    public final void RemoteActionCompatParcelizer(long j, boolean z) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl != null) {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                Button button = z ? this.MediaSessionCompatToken : this.ResultReceiver;
                if (button != null) {
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(button, mutableInteractionSourceImpl, null), 3);
                }
            } else {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu, j, mutableInteractionSourceImpl, (ShortNewsContentCardView) null, 0), 3);
            }
            if (z) {
                this.MediaSessionCompatToken = null;
            } else {
                this.ResultReceiver = null;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl != null) {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                Button button = z ? this.MediaSessionCompatToken : this.ResultReceiver;
                if (button != null) {
                    CheckboxKt checkboxKt = new CheckboxKt(button);
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getCoroutineScope().getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new RealImageLoader.AnonymousClass2(mutableInteractionSourceImpl, checkboxKt, setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null ? setallviewgroupchildrenasnonaccessibilityimportantlambda0.IconCompatParcelizer(new waitForFirstLayout(mutableInteractionSourceImpl, 6, checkboxKt)) : null, null, 2), 3);
                }
            } else {
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.serializer;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
            }
            if (z) {
                this.MediaSessionCompatToken = null;
            } else {
                this.ResultReceiver = null;
            }
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (role != null) {
            SemanticsPropertiesKt.m2833setRolekuIjeqM(semanticsPropertyReceiver, role.m2813unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, new LazyDslKt(this, 1));
        if (this.IconCompatParcelizer) {
            this.RatingCompat.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        RemoteActionCompatParcelizer(semanticsPropertyReceiver);
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-hWWAJMo, reason: not valid java name */
    public final long m9getExtendedTouchPaddinghWWAJMo(long j) {
        long jMo49toSizeXkaWNTQ = DelegatableNodeKt.requireDensity(this).mo49toSizeXkaWNTQ(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).mo2452getMinimumTouchTargetSizeMYxV2XQ());
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        ButtonKt buttonKt;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl != null && (buttonKt = this.MediaDescriptionCompat) != null) {
            mutableInteractionSourceImpl.write(new copyjRlVdoo(buttonKt));
        }
        this.MediaDescriptionCompat = null;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        long jM3850getCenterozmzZPI = IntSizeKt.m3850getCenterozmzZPI(j);
        this.read = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jM3850getCenterozmzZPI))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jM3850getCenterozmzZPI))) << 32));
        RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer) {
            if (this.MediaSessionCompatQueueItem == null) {
                this.MediaSessionCompatQueueItem = delegate(DefaultPagerNestedScrollConnection.IconCompatParcelizer(this));
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                PointerEventType.Companion companion = PointerEventType.Companion;
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk())) {
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, shortNewsContentCardView, 0), 3);
                } else if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2016getExit7fucELk())) {
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, shortNewsContentCardView, 1), 3);
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat != null) {
            return;
        }
        PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11 = this.ComponentActivity ? this.MediaSessionCompatResultReceiverWrapper : this.MediaBrowserCompatMediaItem;
        if (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 != null) {
            if (this.PlaybackStateCompatCustomAction == null) {
                this.PlaybackStateCompatCustomAction = new MutableInteractionSourceImpl();
            }
            this.RatingCompat.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
            MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
            mutableInteractionSourceImpl.getClass();
            DelegatableNode delegatableNodeIconCompatParcelizer = pagerMeasurePolicyKtrememberPagerMeasurePolicy11.IconCompatParcelizer(mutableInteractionSourceImpl);
            delegate(delegatableNodeIconCompatParcelizer);
            this.MediaMetadataCompat = delegatableNodeIconCompatParcelizer;
        }
    }

    public final void RemoteActionCompatParcelizer(PointerInputChange pointerInputChange) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl != null) {
            Button button = new Button(pointerInputChange.m2071getPositionF1C5BW0());
            cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
            DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(this, new waitForFirstLayout(pointerInputChange, 8, cancelpendingwebviewpause));
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (cancelpendingwebviewpause.IconCompatParcelizer || ItemFoundInScroll.RemoteActionCompatParcelizer(this)) {
                this.serializer = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSourceImpl, button, this, null, 1), 3);
            } else {
                this.ResultReceiver = button;
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSourceImpl, button, shortNewsContentCardView, 2), 3);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        if (this.ComponentActivity) {
            ObserverModifierNodeKt.observeReads(this, new LazyDslKt(this, 0));
        }
    }

    public final void IconCompatParcelizer(IndirectPointerInputChange indirectPointerInputChange) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl != null) {
            Button button = new Button(indirectPointerInputChange.m1574getPositionF1C5BW0());
            cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
            int i = 0;
            DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(this, new waitForFirstLayout(indirectPointerInputChange, i, cancelpendingwebviewpause));
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (!cancelpendingwebviewpause.IconCompatParcelizer && !ItemFoundInScroll.RemoteActionCompatParcelizer(this)) {
                this.MediaSessionCompatToken = button;
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSourceImpl, button, shortNewsContentCardView, i), 3);
            } else {
                this.serializer = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSourceImpl, button, this, null, 0), 3);
            }
        }
    }
}
