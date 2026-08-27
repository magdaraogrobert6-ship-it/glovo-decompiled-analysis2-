package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import o.BottomSheetScaffoldKtStandardBottomSheet311;
import o.BottomSheetScaffoldLayout;
import o.BottomSheetScaffoldsdMYb0k;
import o.FloatingTextActionModeCallback;
import o.HandwritingGesture_androidKt;
import o.IInAppMessageViewWrapper;
import o.LinksComposables;
import o.MultiParagraphLayoutCache;
import o.ParagraphLayoutCache;
import o.PrefetchHandleProviderHandleAndRequestImpl;
import o.SelectionHandleIcon;
import o.StylusHandwritingKt;
import o.StylusHandwritingNodesuspendingPointerInputModifierNode11;
import o.TextFieldKeyInputKtExternalSyntheticLambda0;
import o.TextFieldSizeNode;
import o.TextLinkScope;
import o.TextMeasurePolicy;
import o.TextStringSimpleNode;
import o.accesstoOffset;
import o.coerceMinLinesOh53vG4foundation;
import o.coercedInVisibleBoundsOfInputTextMKHz9U;
import o.computeSizeForDefaultText;
import o.createFromParcel;
import o.endStream;
import o.getCieXyz;
import o.isPositionOnTextk4lQ0M;
import o.layoutWithConstraintsK40F9xA;
import o.logUnregisterActivitylambda1;
import o.markDirty;
import o.onContentCardDismissed;
import o.onPostScrollDzOQY0M;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.showTextContextMenu;
import o.textLayoutResultVKLhPVY;
import o.updateClipboardEntryfoundation;
import o.updateMenuItems;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, IndirectPointerInputModifierNode, CompositionLocalConsumerModifierNode, PrefetchHandleProviderHandleAndRequestImpl {
    public boolean ComponentActivity;
    public isPositionOnTextk4lQ0M MediaBrowserCompatMediaItem;
    public TextLinkScope MediaDescriptionCompat;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public coercedInVisibleBoundsOfInputTextMKHz9U MediaSessionCompatQueueItem;
    public TextFieldSizeNode MediaSessionCompatResultReceiverWrapper;
    public BottomSheetScaffoldsdMYb0k MediaSessionCompatToken;
    public IndirectPointerInputDragCycleDetector ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public DelegatableNode PlaybackStateCompatCustomAction;
    public BufferedChannel RatingCompat;
    public SelectionHandleIcon ResultReceiver;
    public long r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public MutableInteractionSourceImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public VelocityTracker r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public TouchSlopDetector r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public TextFieldKeyInputKtExternalSyntheticLambda0 serializer;

    public abstract void IconCompatParcelizer(long j);

    public final void MediaSessionCompatQueueItem() {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        if (this.RatingCompat == null) {
            this.RatingCompat = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
        }
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$2);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        serializer();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Offset.Companion.m493getZeroF1C5BW0();
        DelegatableNode delegatableNode = this.PlaybackStateCompatCustomAction;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.PlaybackStateCompatCustomAction = null;
    }

    public abstract void serializer(FloatingTextActionModeCallback floatingTextActionModeCallback);

    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, SelectionHandleIcon selectionHandleIcon, boolean z2) {
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        if (this.PlaybackStateCompat != z) {
            this.PlaybackStateCompat = z;
            if (!z) {
                serializer();
                this.ParcelableVolumeInfo = null;
            }
            z2 = true;
        }
        Object[] objArr = {this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, mutableInteractionSourceImpl};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            serializer();
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableInteractionSourceImpl;
        }
        if (this.ResultReceiver != selectionHandleIcon) {
            this.ResultReceiver = selectionHandleIcon;
        } else if (!z2) {
            return;
        }
        boolean z3 = this.ComponentActivity;
        TextMeasurePolicy textMeasurePolicy = TextMeasurePolicy.write;
        if (z3) {
            read();
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                IconCompatParcelizer().b_(textMeasurePolicy);
            }
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
        }
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.ParcelableVolumeInfo;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.serializer();
            DragGestureNode dragGestureNode = indirectPointerInputDragCycleDetector.RatingCompat;
            if (dragGestureNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                dragGestureNode.serializer(textMeasurePolicy);
            }
            indirectPointerInputDragCycleDetector.PlaybackStateCompat = null;
            DeltaDecoder deltaDecoder = indirectPointerInputDragCycleDetector.MediaMetadataCompat;
            deltaDecoder.write = 0;
            ((o.AnchoredDraggableNode) deltaDecoder.serializer).RemoteActionCompatParcelizer = 0;
        }
    }

    public DragGestureNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, SelectionHandleIcon selectionHandleIcon) {
        this.ResultReceiver = selectionHandleIcon;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.PlaybackStateCompat = z;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableInteractionSourceImpl;
        Offset.Companion companion = Offset.Companion;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = companion.m492getUnspecifiedF1C5BW0();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = companion.m493getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        PointerInputChange pointerInputChange5;
        computeSizeForDefaultText computesizefordefaulttext;
        boolean z = true;
        this.ComponentActivity = true;
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = delegate(new onPostScrollDzOQY0M(this));
        }
        if (this.PlaybackStateCompat) {
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                TextFieldKeyInputKtExternalSyntheticLambda0 textFieldKeyInputKtExternalSyntheticLambda0 = this.serializer;
                if (textFieldKeyInputKtExternalSyntheticLambda0 == null) {
                    computeSizeForDefaultText computesizefordefaulttext2 = computeSizeForDefaultText.NotInitialized;
                    TextFieldKeyInputKtExternalSyntheticLambda0 textFieldKeyInputKtExternalSyntheticLambda1 = new TextFieldKeyInputKtExternalSyntheticLambda0();
                    textFieldKeyInputKtExternalSyntheticLambda1.IconCompatParcelizer = computesizefordefaulttext2;
                    textFieldKeyInputKtExternalSyntheticLambda1.write = false;
                    this.serializer = textFieldKeyInputKtExternalSyntheticLambda1;
                    textFieldKeyInputKtExternalSyntheticLambda0 = textFieldKeyInputKtExternalSyntheticLambda1;
                }
                this.MediaSessionCompatResultReceiverWrapper = textFieldKeyInputKtExternalSyntheticLambda0;
            }
            TextFieldSizeNode textFieldSizeNode = this.MediaSessionCompatResultReceiverWrapper;
            if (textFieldSizeNode != null) {
                if (textFieldSizeNode instanceof TextFieldKeyInputKtExternalSyntheticLambda0) {
                    TextFieldKeyInputKtExternalSyntheticLambda0 textFieldKeyInputKtExternalSyntheticLambda2 = (TextFieldKeyInputKtExternalSyntheticLambda0) textFieldSizeNode;
                    if (!pointerEvent.getChanges().isEmpty() && TapGestureDetectorKt.isChangedToDown$default(pointerEvent, false)) {
                        PointerInputChange pointerInputChange6 = (PointerInputChange) onContentCardDismissed.read((List) pointerEvent.getChanges());
                        if (HandwritingGesture_androidKt.serializer[textFieldKeyInputKtExternalSyntheticLambda2.IconCompatParcelizer.ordinal()] == 1) {
                            if (!RemoteActionCompatParcelizer()) {
                                computesizefordefaulttext = computeSizeForDefaultText.Yes;
                            } else {
                                computesizefordefaulttext = computeSizeForDefaultText.No;
                            }
                        } else {
                            computesizefordefaulttext = textFieldKeyInputKtExternalSyntheticLambda2.IconCompatParcelizer;
                        }
                        textFieldKeyInputKtExternalSyntheticLambda2.IconCompatParcelizer = computesizefordefaulttext;
                        if (pointerEventPass == PointerEventPass.Initial && computesizefordefaulttext == computeSizeForDefaultText.No) {
                            pointerInputChange6.consume();
                            textFieldKeyInputKtExternalSyntheticLambda2.write = true;
                        }
                        if (pointerEventPass == PointerEventPass.Main) {
                            if (computesizefordefaulttext == computeSizeForDefaultText.Yes) {
                                write(this, pointerInputChange6, pointerInputChange6.m2068getIdJ3iCeTQ(), 0L, 12);
                                return;
                            }
                            if (textFieldKeyInputKtExternalSyntheticLambda2.write) {
                                Offset.Companion companion = Offset.Companion;
                                RemoteActionCompatParcelizer(pointerInputChange6, pointerInputChange6, companion.m493getZeroF1C5BW0());
                                IconCompatParcelizer(pointerInputChange6, companion.m493getZeroF1C5BW0());
                                long jM2068getIdJ3iCeTQ = pointerInputChange6.m2068getIdJ3iCeTQ();
                                coercedInVisibleBoundsOfInputTextMKHz9U coercedinvisibleboundsofinputtextmkhz9u = this.MediaSessionCompatQueueItem;
                                if (coercedinvisibleboundsofinputtextmkhz9u == null) {
                                    long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
                                    coercedInVisibleBoundsOfInputTextMKHz9U coercedinvisibleboundsofinputtextmkhz9u2 = new coercedInVisibleBoundsOfInputTextMKHz9U();
                                    coercedinvisibleboundsofinputtextmkhz9u2.serializer = jM2048constructorimpl;
                                    this.MediaSessionCompatQueueItem = coercedinvisibleboundsofinputtextmkhz9u2;
                                    coercedinvisibleboundsofinputtextmkhz9u = coercedinvisibleboundsofinputtextmkhz9u2;
                                }
                                coercedinvisibleboundsofinputtextmkhz9u.serializer = jM2068getIdJ3iCeTQ;
                                this.MediaSessionCompatResultReceiverWrapper = coercedinvisibleboundsofinputtextmkhz9u;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (textFieldSizeNode instanceof TextLinkScope) {
                    TextLinkScope textLinkScope = (TextLinkScope) textFieldSizeNode;
                    if (pointerEventPass == PointerEventPass.Initial) {
                        return;
                    }
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes.get(i);
                        int i2 = size;
                        if (PointerId.m2050equalsimpl0(pointerInputChange3.m2068getIdJ3iCeTQ(), textLinkScope.read)) {
                            break;
                        }
                        i++;
                        size = i2;
                    }
                    PointerInputChange pointerInputChange7 = pointerInputChange3;
                    if (pointerInputChange7 == null) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                pointerInputChange5 = null;
                                break;
                            }
                            pointerInputChange5 = changes2.get(i3);
                            if (pointerInputChange5.getPressed()) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        pointerInputChange7 = pointerInputChange5;
                        if (pointerInputChange7 == null) {
                            read();
                            return;
                        }
                        textLinkScope.read = pointerInputChange7.m2068getIdJ3iCeTQ();
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (!pointerInputChange7.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange7)) {
                                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                                int size3 = changes3.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size3) {
                                        pointerInputChange4 = null;
                                        break;
                                    }
                                    pointerInputChange4 = changes3.get(i4);
                                    if (pointerInputChange4.getPressed()) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                PointerInputChange pointerInputChange8 = pointerInputChange4;
                                if (pointerInputChange8 == null) {
                                    read();
                                } else {
                                    textLinkScope.read = pointerInputChange8.m2068getIdJ3iCeTQ();
                                }
                            } else {
                                float fWrite = DragGestureDetectorKt.write((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration()), pointerInputChange7.m2074getTypeT8wyACA());
                                TouchSlopDetector touchSlopDetector = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                                if (touchSlopDetector != null) {
                                    long jM61getPostSlopOffsetqto3Fdw = touchSlopDetector.m61getPostSlopOffsetqto3Fdw(fWrite, PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange7), true);
                                    if ((InlineClassHelperKt.DualUnsignedFloatMask & jM61getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                                        boolean zIsInterested = isInterested(pointerInputChange7);
                                        TraversableNode traversableNodeFindNearestAncestor = TraversableNodeKt.findNearestAncestor(this, onPostScrollDzOQY0M.serializer);
                                        onPostScrollDzOQY0M onpostscrolldzoqy0m = traversableNodeFindNearestAncestor instanceof onPostScrollDzOQY0M ? (onPostScrollDzOQY0M) traversableNodeFindNearestAncestor : null;
                                        PrefetchHandleProviderHandleAndRequestImpl prefetchHandleProviderHandleAndRequestImpl = onpostscrolldzoqy0m != null ? onpostscrolldzoqy0m.RemoteActionCompatParcelizer : null;
                                        boolean z2 = prefetchHandleProviderHandleAndRequestImpl != null && prefetchHandleProviderHandleAndRequestImpl.isInterested(pointerInputChange7);
                                        if (!zIsInterested && z2) {
                                            textLinkScope.write = true;
                                        } else {
                                            pointerInputChange7.consume();
                                            PointerInputChange pointerInputChange9 = textLinkScope.serializer;
                                            pointerInputChange9.getClass();
                                            RemoteActionCompatParcelizer(pointerInputChange9, pointerInputChange7, jM61getPostSlopOffsetqto3Fdw);
                                            IconCompatParcelizer(pointerInputChange7, jM61getPostSlopOffsetqto3Fdw);
                                            long jM2068getIdJ3iCeTQ2 = pointerInputChange7.m2068getIdJ3iCeTQ();
                                            coercedInVisibleBoundsOfInputTextMKHz9U coercedinvisibleboundsofinputtextmkhz9u3 = this.MediaSessionCompatQueueItem;
                                            if (coercedinvisibleboundsofinputtextmkhz9u3 == null) {
                                                long jM2048constructorimpl2 = PointerId.m2048constructorimpl(Long.MAX_VALUE);
                                                coercedinvisibleboundsofinputtextmkhz9u3 = new coercedInVisibleBoundsOfInputTextMKHz9U();
                                                coercedinvisibleboundsofinputtextmkhz9u3.serializer = jM2048constructorimpl2;
                                                this.MediaSessionCompatQueueItem = coercedinvisibleboundsofinputtextmkhz9u3;
                                            }
                                            coercedinvisibleboundsofinputtextmkhz9u3.serializer = jM2068getIdJ3iCeTQ2;
                                            this.MediaSessionCompatResultReceiverWrapper = coercedinvisibleboundsofinputtextmkhz9u3;
                                        }
                                    } else {
                                        textLinkScope.write = true;
                                    }
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Touch slop detector not initialized.");
                                    return;
                                }
                            }
                        } else {
                            PointerInputChange pointerInputChange10 = textLinkScope.serializer;
                            if (pointerInputChange10 != null) {
                                long j2 = textLinkScope.read;
                                TouchSlopDetector touchSlopDetector2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                                if (touchSlopDetector2 != null) {
                                    IconCompatParcelizer(pointerInputChange10, j2, touchSlopDetector2);
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    return;
                                }
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Final && textLinkScope.write) {
                        if (pointerInputChange7.isConsumed()) {
                            PointerInputChange pointerInputChange11 = textLinkScope.serializer;
                            if (pointerInputChange11 != null) {
                                long j3 = textLinkScope.read;
                                TouchSlopDetector touchSlopDetector3 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                                if (touchSlopDetector3 != null) {
                                    IconCompatParcelizer(pointerInputChange11, j3, touchSlopDetector3);
                                    return;
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    return;
                                }
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        textLinkScope.write = false;
                        return;
                    }
                    return;
                }
                if (textFieldSizeNode instanceof isPositionOnTextk4lQ0M) {
                    isPositionOnTextk4lQ0M ispositionontextk4lq0m = (isPositionOnTextk4lQ0M) textFieldSizeNode;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List<PointerInputChange> changes4 = pointerEvent.getChanges();
                    int size4 = changes4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        if (changes4.get(i5).isConsumed()) {
                            z = false;
                            break;
                        }
                    }
                    List<PointerInputChange> changes5 = pointerEvent.getChanges();
                    int size5 = changes5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        if (changes5.get(i6).getPressed()) {
                            if (pointerEvent.getChanges().isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM2071getPositionF1C5BW0 = ((PointerInputChange) onContentCardDismissed.read((List) pointerEvent.getChanges())).m2071getPositionF1C5BW0();
                                PointerInputChange pointerInputChange12 = ispositionontextk4lq0m.IconCompatParcelizer;
                                pointerInputChange12.getClass();
                                long jM481minusMKHz9U = Offset.m481minusMKHz9U(jM2071getPositionF1C5BW0, pointerInputChange12.m2071getPositionF1C5BW0());
                                PointerInputChange pointerInputChange13 = ispositionontextk4lq0m.IconCompatParcelizer;
                                if (pointerInputChange13 != null) {
                                    write(this, pointerInputChange13, ispositionontextk4lq0m.serializer, jM481minusMKHz9U, 8);
                                    return;
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    read();
                    return;
                }
                if (textFieldSizeNode instanceof coercedInVisibleBoundsOfInputTextMKHz9U) {
                    coercedInVisibleBoundsOfInputTextMKHz9U coercedinvisibleboundsofinputtextmkhz9u4 = (coercedInVisibleBoundsOfInputTextMKHz9U) textFieldSizeNode;
                    if (pointerEventPass != PointerEventPass.Main) {
                        return;
                    }
                    long j4 = coercedinvisibleboundsofinputtextmkhz9u4.serializer;
                    List<PointerInputChange> changes6 = pointerEvent.getChanges();
                    int size6 = changes6.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size6) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes6.get(i7);
                        if (PointerId.m2050equalsimpl0(pointerInputChange.m2068getIdJ3iCeTQ(), j4)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    PointerInputChange pointerInputChange14 = pointerInputChange;
                    if (pointerInputChange14 == null) {
                        return;
                    }
                    boolean zChangedToUpIgnoreConsumed = PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange14);
                    TextMeasurePolicy textMeasurePolicy = TextMeasurePolicy.write;
                    if (zChangedToUpIgnoreConsumed) {
                        List<PointerInputChange> changes7 = pointerEvent.getChanges();
                        int size7 = changes7.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size7) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes7.get(i8);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        PointerInputChange pointerInputChange15 = pointerInputChange2;
                        if (pointerInputChange15 == null) {
                            if (!pointerInputChange14.isConsumed() && PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange14)) {
                                VelocityTrackerKt.addPointerInputChange(MediaDescriptionCompat(), pointerInputChange14);
                                float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                                long jM2181calculateVelocityAH228Gc = MediaDescriptionCompat().m2181calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                                MediaDescriptionCompat().resetTracking();
                                IconCompatParcelizer().b_(new FloatingTextActionModeCallback(coerceMinLinesOh53vG4foundation.RemoteActionCompatParcelizer(jM2181calculateVelocityAH228Gc), false));
                                this.ComponentActivity = false;
                            } else {
                                IconCompatParcelizer().b_(textMeasurePolicy);
                            }
                            read();
                            return;
                        }
                        coercedinvisibleboundsofinputtextmkhz9u4.serializer = pointerInputChange15.m2068getIdJ3iCeTQ();
                        return;
                    }
                    if (pointerInputChange14.isConsumed()) {
                        IconCompatParcelizer().b_(textMeasurePolicy);
                        return;
                    } else {
                        if (Offset.m475getDistanceimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange14)) == 0.0f) {
                            return;
                        }
                        IconCompatParcelizer(pointerInputChange14, PointerEventKt.positionChange(pointerInputChange14));
                        pointerInputChange14.consume();
                        return;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("currentDragState should not be null");
        }
    }

    public static void write(DragGestureNode dragGestureNode, PointerInputChange pointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = Offset.Companion.m493getZeroF1C5BW0();
        }
        TextLinkScope textLinkScope = dragGestureNode.MediaDescriptionCompat;
        if (textLinkScope == null) {
            long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
            textLinkScope = new TextLinkScope();
            textLinkScope.serializer = null;
            textLinkScope.read = jM2048constructorimpl;
            textLinkScope.write = false;
            dragGestureNode.MediaDescriptionCompat = textLinkScope;
        }
        textLinkScope.serializer = pointerInputChange;
        textLinkScope.read = j;
        TouchSlopDetector touchSlopDetector = dragGestureNode.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        SelectionHandleIcon selectionHandleIcon = dragGestureNode.ResultReceiver;
        if (touchSlopDetector == null) {
            dragGestureNode.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new TouchSlopDetector(selectionHandleIcon);
        } else {
            touchSlopDetector.serializer = selectionHandleIcon;
            touchSlopDetector.RemoteActionCompatParcelizer = j2;
        }
        textLinkScope.write = false;
        dragGestureNode.MediaSessionCompatResultReceiverWrapper = textLinkScope;
    }

    public final void IconCompatParcelizer(PointerInputChange pointerInputChange, long j) {
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(getNode()));
        if (!Offset.m474equalsimpl0(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, Offset.Companion.m492getUnspecifiedF1C5BW0()) && !Offset.m474equalsimpl0(jPositionOnScreen, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM)) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Offset.m482plusMKHz9U(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Offset.m481minusMKHz9U(jPositionOnScreen, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = jPositionOnScreen;
        VelocityTrackerKt.m2182addPointerInputChange0AR0LA0(MediaDescriptionCompat(), pointerInputChange, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        IconCompatParcelizer().b_(new showTextContextMenu(j, false));
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.ParcelableVolumeInfo;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.serializer();
            DragGestureNode dragGestureNode = indirectPointerInputDragCycleDetector.RatingCompat;
            if (dragGestureNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                dragGestureNode.serializer(TextMeasurePolicy.write);
            }
            indirectPointerInputDragCycleDetector.PlaybackStateCompat = null;
            DeltaDecoder deltaDecoder = indirectPointerInputDragCycleDetector.MediaMetadataCompat;
            deltaDecoder.write = 0;
            ((o.AnchoredDraggableNode) deltaDecoder.serializer).RemoteActionCompatParcelizer = 0;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        if (this.ComponentActivity) {
            read();
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                IconCompatParcelizer().b_(TextMeasurePolicy.write);
            }
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
        }
        this.ComponentActivity = false;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        IndirectPointerInputChange indirectPointerInputChange3;
        layoutWithConstraintsK40F9xA layoutwithconstraintsk40f9xa;
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = delegate(new onPostScrollDzOQY0M(this));
        }
        if (this.PlaybackStateCompat) {
            if (this.ParcelableVolumeInfo == null) {
                this.ParcelableVolumeInfo = new IndirectPointerInputDragCycleDetector(this);
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.ParcelableVolumeInfo;
            if (indirectPointerInputDragCycleDetector != null) {
                DragGestureNode dragGestureNode = indirectPointerInputDragCycleDetector.RatingCompat;
                if (indirectPointerInputDragCycleDetector.IconCompatParcelizer == null) {
                    textLayoutResultVKLhPVY textlayoutresultvklhpvy = indirectPointerInputDragCycleDetector.RemoteActionCompatParcelizer;
                    if (textlayoutresultvklhpvy == null) {
                        layoutWithConstraintsK40F9xA layoutwithconstraintsk40f9xa2 = layoutWithConstraintsK40F9xA.NotInitialized;
                        textLayoutResultVKLhPVY textlayoutresultvklhpvy2 = new textLayoutResultVKLhPVY();
                        textlayoutresultvklhpvy2.read = layoutwithconstraintsk40f9xa2;
                        textlayoutresultvklhpvy2.IconCompatParcelizer = false;
                        indirectPointerInputDragCycleDetector.RemoteActionCompatParcelizer = textlayoutresultvklhpvy2;
                        textlayoutresultvklhpvy = textlayoutresultvklhpvy2;
                    }
                    indirectPointerInputDragCycleDetector.IconCompatParcelizer = textlayoutresultvklhpvy;
                }
                endStream endstream = indirectPointerInputDragCycleDetector.IconCompatParcelizer;
                if (endstream != null) {
                    boolean z = true;
                    if (endstream instanceof textLayoutResultVKLhPVY) {
                        textLayoutResultVKLhPVY textlayoutresultvklhpvy3 = (textLayoutResultVKLhPVY) endstream;
                        if (indirectPointerEvent.getChanges().isEmpty()) {
                            return;
                        }
                        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
                        int size = changes.size();
                        for (int i = 0; i < size; i++) {
                            if (!IndirectPointerInputDragCycleDetectorKt.RemoteActionCompatParcelizer(changes.get(i))) {
                                return;
                            }
                        }
                        IndirectPointerInputChange indirectPointerInputChange4 = (IndirectPointerInputChange) onContentCardDismissed.read((List) indirectPointerEvent.getChanges());
                        if (TextStringSimpleNode.serializer[textlayoutresultvklhpvy3.read.ordinal()] == 1) {
                            if (!dragGestureNode.RemoteActionCompatParcelizer()) {
                                layoutwithconstraintsk40f9xa = layoutWithConstraintsK40F9xA.Yes;
                            } else {
                                layoutwithconstraintsk40f9xa = layoutWithConstraintsK40F9xA.No;
                            }
                        } else {
                            layoutwithconstraintsk40f9xa = textlayoutresultvklhpvy3.read;
                        }
                        textlayoutresultvklhpvy3.read = layoutwithconstraintsk40f9xa;
                        if (pointerEventPass == PointerEventPass.Initial && layoutwithconstraintsk40f9xa == layoutWithConstraintsK40F9xA.No) {
                            indirectPointerInputChange4.consume();
                            textlayoutresultvklhpvy3.IconCompatParcelizer = true;
                        }
                        if (pointerEventPass == PointerEventPass.Main) {
                            if (layoutwithconstraintsk40f9xa == layoutWithConstraintsK40F9xA.Yes) {
                                IndirectPointerInputDragCycleDetector.serializer(indirectPointerInputDragCycleDetector, indirectPointerInputChange4, indirectPointerInputChange4.m1573getIdJ3iCeTQ(), 0L, 12);
                                return;
                            }
                            if (textlayoutresultvklhpvy3.IconCompatParcelizer) {
                                IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxisM1552boximpl = IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw());
                                Offset.Companion companion = Offset.Companion;
                                indirectPointerInputDragCycleDetector.IconCompatParcelizer(indirectPointerInputChange4, indirectPointerInputChange4, indirectPointerEventPrimaryDirectionalMotionAxisM1552boximpl, companion.m493getZeroF1C5BW0());
                                indirectPointerInputDragCycleDetector.m37sendDragEventEu1f8Dk(indirectPointerInputChange4, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), companion.m493getZeroF1C5BW0());
                                long jM1573getIdJ3iCeTQ = indirectPointerInputChange4.m1573getIdJ3iCeTQ();
                                MultiParagraphLayoutCache multiParagraphLayoutCache = indirectPointerInputDragCycleDetector.serializer;
                                if (multiParagraphLayoutCache == null) {
                                    long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
                                    multiParagraphLayoutCache = new MultiParagraphLayoutCache();
                                    multiParagraphLayoutCache.read = jM2048constructorimpl;
                                    indirectPointerInputDragCycleDetector.serializer = multiParagraphLayoutCache;
                                }
                                multiParagraphLayoutCache.read = jM1573getIdJ3iCeTQ;
                                indirectPointerInputDragCycleDetector.IconCompatParcelizer = multiParagraphLayoutCache;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IndirectPointerInputChange indirectPointerInputChange5 = null;
                    if (endstream instanceof ParagraphLayoutCache) {
                        ParagraphLayoutCache paragraphLayoutCache = (ParagraphLayoutCache) endstream;
                        if (pointerEventPass == PointerEventPass.Initial) {
                            return;
                        }
                        List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size2) {
                                indirectPointerInputChange2 = null;
                                break;
                            }
                            indirectPointerInputChange2 = changes2.get(i2);
                            if (PointerId.m2050equalsimpl0(indirectPointerInputChange2.m1573getIdJ3iCeTQ(), paragraphLayoutCache.RemoteActionCompatParcelizer)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        IndirectPointerInputChange indirectPointerInputChange6 = indirectPointerInputChange2;
                        if (indirectPointerInputChange6 == null) {
                            List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
                            int size3 = changes3.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    indirectPointerInputChange3 = null;
                                    break;
                                }
                                indirectPointerInputChange3 = changes3.get(i3);
                                if (indirectPointerInputChange3.getPressed()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            indirectPointerInputChange6 = indirectPointerInputChange3;
                            if (indirectPointerInputChange6 == null) {
                                indirectPointerInputDragCycleDetector.serializer();
                                return;
                            }
                            paragraphLayoutCache.RemoteActionCompatParcelizer = indirectPointerInputChange6.m1573getIdJ3iCeTQ();
                        }
                        if (pointerEventPass == PointerEventPass.Main) {
                            if (!indirectPointerInputChange6.isConsumed()) {
                                if (IndirectPointerInputDragCycleDetectorKt.IconCompatParcelizer(indirectPointerInputChange6)) {
                                    List<IndirectPointerInputChange> changes4 = indirectPointerEvent.getChanges();
                                    int size4 = changes4.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        IndirectPointerInputChange indirectPointerInputChange7 = changes4.get(i4);
                                        if (indirectPointerInputChange7.getPressed()) {
                                            indirectPointerInputChange5 = indirectPointerInputChange7;
                                            break;
                                        }
                                    }
                                    IndirectPointerInputChange indirectPointerInputChange8 = indirectPointerInputChange5;
                                    if (indirectPointerInputChange8 == null) {
                                        indirectPointerInputDragCycleDetector.serializer();
                                    } else {
                                        paragraphLayoutCache.RemoteActionCompatParcelizer = indirectPointerInputChange8.m1573getIdJ3iCeTQ();
                                    }
                                } else {
                                    float fWrite = DragGestureDetectorKt.write((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(dragGestureNode, CompositionLocalsKt.getLocalViewConfiguration()), PointerType.Companion.m2153getTouchT8wyACA());
                                    TouchSlopDetector touchSlopDetector = indirectPointerInputDragCycleDetector.MediaSessionCompatQueueItem;
                                    if (touchSlopDetector != null) {
                                        long jM61getPostSlopOffsetqto3Fdw = touchSlopDetector.m61getPostSlopOffsetqto3Fdw(fWrite, IndirectPointerInputDragCycleDetectorKt.m39positionChangeInternalwfG_k4k(indirectPointerInputChange6, dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), true), true);
                                        if ((InlineClassHelperKt.DualUnsignedFloatMask & jM61getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                                            indirectPointerInputChange6.consume();
                                            IndirectPointerInputChange indirectPointerInputChange9 = paragraphLayoutCache.read;
                                            indirectPointerInputChange9.getClass();
                                            indirectPointerInputDragCycleDetector.IconCompatParcelizer(indirectPointerInputChange9, indirectPointerInputChange6, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), jM61getPostSlopOffsetqto3Fdw);
                                            indirectPointerInputDragCycleDetector.m37sendDragEventEu1f8Dk(indirectPointerInputChange6, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), jM61getPostSlopOffsetqto3Fdw);
                                            long jM1573getIdJ3iCeTQ2 = indirectPointerInputChange6.m1573getIdJ3iCeTQ();
                                            MultiParagraphLayoutCache multiParagraphLayoutCache2 = indirectPointerInputDragCycleDetector.serializer;
                                            if (multiParagraphLayoutCache2 == null) {
                                                long jM2048constructorimpl2 = PointerId.m2048constructorimpl(Long.MAX_VALUE);
                                                MultiParagraphLayoutCache multiParagraphLayoutCache3 = new MultiParagraphLayoutCache();
                                                multiParagraphLayoutCache3.read = jM2048constructorimpl2;
                                                indirectPointerInputDragCycleDetector.serializer = multiParagraphLayoutCache3;
                                                multiParagraphLayoutCache2 = multiParagraphLayoutCache3;
                                            }
                                            multiParagraphLayoutCache2.read = jM1573getIdJ3iCeTQ2;
                                            indirectPointerInputDragCycleDetector.IconCompatParcelizer = multiParagraphLayoutCache2;
                                        } else {
                                            paragraphLayoutCache.IconCompatParcelizer = true;
                                        }
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                IndirectPointerInputChange indirectPointerInputChange10 = paragraphLayoutCache.read;
                                if (indirectPointerInputChange10 != null) {
                                    long j = paragraphLayoutCache.RemoteActionCompatParcelizer;
                                    TouchSlopDetector touchSlopDetector2 = indirectPointerInputDragCycleDetector.MediaSessionCompatQueueItem;
                                    if (touchSlopDetector2 != null) {
                                        indirectPointerInputDragCycleDetector.write(indirectPointerInputChange10, j, touchSlopDetector2);
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                        }
                        if (pointerEventPass == PointerEventPass.Final && paragraphLayoutCache.IconCompatParcelizer) {
                            if (indirectPointerInputChange6.isConsumed()) {
                                IndirectPointerInputChange indirectPointerInputChange11 = paragraphLayoutCache.read;
                                if (indirectPointerInputChange11 != null) {
                                    long j2 = paragraphLayoutCache.RemoteActionCompatParcelizer;
                                    TouchSlopDetector touchSlopDetector3 = indirectPointerInputDragCycleDetector.MediaSessionCompatQueueItem;
                                    if (touchSlopDetector3 != null) {
                                        indirectPointerInputDragCycleDetector.write(indirectPointerInputChange11, j2, touchSlopDetector3);
                                        return;
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            paragraphLayoutCache.IconCompatParcelizer = false;
                            return;
                        }
                        return;
                    }
                    if (endstream instanceof markDirty) {
                        markDirty markdirty = (markDirty) endstream;
                        if (pointerEventPass != PointerEventPass.Final) {
                            return;
                        }
                        List<IndirectPointerInputChange> changes5 = indirectPointerEvent.getChanges();
                        int size5 = changes5.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            if (changes5.get(i5).isConsumed()) {
                                z = false;
                                break;
                            }
                        }
                        List<IndirectPointerInputChange> changes6 = indirectPointerEvent.getChanges();
                        int size6 = changes6.size();
                        for (int i6 = 0; i6 < size6; i6++) {
                            if (changes6.get(i6).getPressed()) {
                                if (indirectPointerEvent.getChanges().isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    long jM40primaryAxisPosition_bfSUIo = IndirectPointerInputDragCycleDetectorKt.m40primaryAxisPosition_bfSUIo((IndirectPointerInputChange) onContentCardDismissed.read((List) indirectPointerEvent.getChanges()), dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()));
                                    IndirectPointerInputChange indirectPointerInputChange12 = markdirty.read;
                                    indirectPointerInputChange12.getClass();
                                    long jM481minusMKHz9U = Offset.m481minusMKHz9U(jM40primaryAxisPosition_bfSUIo, IndirectPointerInputDragCycleDetectorKt.m40primaryAxisPosition_bfSUIo(indirectPointerInputChange12, dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw())));
                                    IndirectPointerInputChange indirectPointerInputChange13 = markdirty.read;
                                    if (indirectPointerInputChange13 != null) {
                                        IndirectPointerInputDragCycleDetector.serializer(indirectPointerInputDragCycleDetector, indirectPointerInputChange13, markdirty.write, jM481minusMKHz9U, 8);
                                        return;
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        indirectPointerInputDragCycleDetector.serializer();
                        return;
                    }
                    if (endstream instanceof MultiParagraphLayoutCache) {
                        MultiParagraphLayoutCache multiParagraphLayoutCache4 = (MultiParagraphLayoutCache) endstream;
                        if (pointerEventPass != PointerEventPass.Main) {
                            return;
                        }
                        long j3 = multiParagraphLayoutCache4.read;
                        List<IndirectPointerInputChange> changes7 = indirectPointerEvent.getChanges();
                        int size7 = changes7.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size7) {
                                indirectPointerInputChange = null;
                                break;
                            }
                            indirectPointerInputChange = changes7.get(i7);
                            if (PointerId.m2050equalsimpl0(indirectPointerInputChange.m1573getIdJ3iCeTQ(), j3)) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        IndirectPointerInputChange indirectPointerInputChange14 = indirectPointerInputChange;
                        if (indirectPointerInputChange14 == null) {
                            return;
                        }
                        boolean zIconCompatParcelizer = IndirectPointerInputDragCycleDetectorKt.IconCompatParcelizer(indirectPointerInputChange14);
                        TextMeasurePolicy textMeasurePolicy = TextMeasurePolicy.write;
                        if (zIconCompatParcelizer) {
                            List<IndirectPointerInputChange> changes8 = indirectPointerEvent.getChanges();
                            int size8 = changes8.size();
                            for (int i8 = 0; i8 < size8; i8++) {
                                IndirectPointerInputChange indirectPointerInputChange15 = changes8.get(i8);
                                if (indirectPointerInputChange15.getPressed()) {
                                    indirectPointerInputChange5 = indirectPointerInputChange15;
                                    break;
                                }
                            }
                            IndirectPointerInputChange indirectPointerInputChange16 = indirectPointerInputChange5;
                            if (indirectPointerInputChange16 == null) {
                                if (!indirectPointerInputChange14.isConsumed() && IndirectPointerInputDragCycleDetectorKt.IconCompatParcelizer(indirectPointerInputChange14)) {
                                    IndirectPointerInputDragCycleDetectorKt.m38access$addIndirectPointerInputChangeQf4Zb88(indirectPointerInputDragCycleDetector.write(), indirectPointerInputChange14, dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), indirectPointerInputDragCycleDetector.ParcelableVolumeInfo, indirectPointerInputDragCycleDetector.MediaBrowserCompatMediaItem);
                                    float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(dragGestureNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                                    long jM2181calculateVelocityAH228Gc = indirectPointerInputDragCycleDetector.write().m2181calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                                    indirectPointerInputDragCycleDetector.write().resetTracking();
                                    dragGestureNode.serializer((LinksComposables) new FloatingTextActionModeCallback(coerceMinLinesOh53vG4foundation.RemoteActionCompatParcelizer(jM2181calculateVelocityAH228Gc), true));
                                } else {
                                    dragGestureNode.serializer(textMeasurePolicy);
                                }
                                indirectPointerInputDragCycleDetector.serializer();
                                return;
                            }
                            multiParagraphLayoutCache4.read = indirectPointerInputChange16.m1573getIdJ3iCeTQ();
                            return;
                        }
                        if (indirectPointerInputChange14.isConsumed()) {
                            dragGestureNode.serializer(textMeasurePolicy);
                            return;
                        } else {
                            if (Offset.m475getDistanceimpl(IndirectPointerInputDragCycleDetectorKt.m39positionChangeInternalwfG_k4k(indirectPointerInputChange14, dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), true)) == 0.0f) {
                                return;
                            }
                            indirectPointerInputDragCycleDetector.m37sendDragEventEu1f8Dk(indirectPointerInputChange14, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), IndirectPointerInputDragCycleDetectorKt.m39positionChangeInternalwfG_k4k(indirectPointerInputChange14, dragGestureNode.ResultReceiver, IndirectPointerEventPrimaryDirectionalMotionAxis.m1552boximpl(indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw()), false));
                            indirectPointerInputChange14.consume();
                            return;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("currentDragState should not be null");
            }
        }
    }

    public final void serializer() {
        BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k = this.MediaSessionCompatToken;
        if (bottomSheetScaffoldsdMYb0k != null) {
            MutableInteractionSourceImpl mutableInteractionSourceImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (mutableInteractionSourceImpl != null) {
                mutableInteractionSourceImpl.write(new BottomSheetScaffoldLayout(bottomSheetScaffoldsdMYb0k));
            }
            this.MediaSessionCompatToken = null;
        }
    }

    public final void serializer(LinksComposables linksComposables) {
        if ((linksComposables instanceof updateMenuItems) && !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
            MediaSessionCompatQueueItem();
        }
        IconCompatParcelizer().b_(linksComposables);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$processDragCancel(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        StylusHandwritingKt stylusHandwritingKt;
        if (continuationImpl instanceof StylusHandwritingKt) {
            stylusHandwritingKt = (StylusHandwritingKt) continuationImpl;
            int i = stylusHandwritingKt.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                stylusHandwritingKt.serializer = i - Integer.MIN_VALUE;
            } else {
                stylusHandwritingKt = new StylusHandwritingKt(dragGestureNode, continuationImpl);
            }
        } else {
            stylusHandwritingKt = new StylusHandwritingKt(dragGestureNode, continuationImpl);
        }
        Object obj = stylusHandwritingKt.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stylusHandwritingKt.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k = dragGestureNode.MediaSessionCompatToken;
            if (bottomSheetScaffoldsdMYb0k != null) {
                MutableInteractionSourceImpl mutableInteractionSourceImpl = dragGestureNode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (mutableInteractionSourceImpl != null) {
                    BottomSheetScaffoldLayout bottomSheetScaffoldLayout = new BottomSheetScaffoldLayout(bottomSheetScaffoldsdMYb0k);
                    stylusHandwritingKt.serializer = 1;
                    if (mutableInteractionSourceImpl.emit(bottomSheetScaffoldLayout, stylusHandwritingKt) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.serializer(new FloatingTextActionModeCallback(Velocity.Companion.m3922getZero9UxMQ8M(), false));
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        dragGestureNode.MediaSessionCompatToken = null;
        dragGestureNode.serializer(new FloatingTextActionModeCallback(Velocity.Companion.m3922getZero9UxMQ8M(), false));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$processDragStart(DragGestureNode dragGestureNode, updateMenuItems updatemenuitems, ContinuationImpl continuationImpl) {
        StylusHandwritingNodesuspendingPointerInputModifierNode11 stylusHandwritingNodesuspendingPointerInputModifierNode11;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k;
        updateMenuItems updatemenuitems2;
        BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k2;
        if (continuationImpl instanceof StylusHandwritingNodesuspendingPointerInputModifierNode11) {
            stylusHandwritingNodesuspendingPointerInputModifierNode11 = (StylusHandwritingNodesuspendingPointerInputModifierNode11) continuationImpl;
            int i = stylusHandwritingNodesuspendingPointerInputModifierNode11.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                stylusHandwritingNodesuspendingPointerInputModifierNode11.read = i - Integer.MIN_VALUE;
            } else {
                stylusHandwritingNodesuspendingPointerInputModifierNode11 = new StylusHandwritingNodesuspendingPointerInputModifierNode11(dragGestureNode, continuationImpl);
            }
        } else {
            stylusHandwritingNodesuspendingPointerInputModifierNode11 = new StylusHandwritingNodesuspendingPointerInputModifierNode11(dragGestureNode, continuationImpl);
        }
        Object obj = stylusHandwritingNodesuspendingPointerInputModifierNode11.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stylusHandwritingNodesuspendingPointerInputModifierNode11.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k3 = dragGestureNode.MediaSessionCompatToken;
            if (bottomSheetScaffoldsdMYb0k3 != null && (mutableInteractionSourceImpl = dragGestureNode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null) {
                BottomSheetScaffoldLayout bottomSheetScaffoldLayout = new BottomSheetScaffoldLayout(bottomSheetScaffoldsdMYb0k3);
                stylusHandwritingNodesuspendingPointerInputModifierNode11.serializer = updatemenuitems;
                stylusHandwritingNodesuspendingPointerInputModifierNode11.read = 1;
                if (mutableInteractionSourceImpl.emit(bottomSheetScaffoldLayout, stylusHandwritingNodesuspendingPointerInputModifierNode11) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            dragGestureNode.MediaSessionCompatToken = bottomSheetScaffoldsdMYb0k;
            dragGestureNode.IconCompatParcelizer(updatemenuitems.read);
            return createFromParcel.INSTANCE;
        }
        if (i2 == 1) {
            updatemenuitems = stylusHandwritingNodesuspendingPointerInputModifierNode11.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bottomSheetScaffoldsdMYb0k2 = stylusHandwritingNodesuspendingPointerInputModifierNode11.IconCompatParcelizer;
            updatemenuitems2 = stylusHandwritingNodesuspendingPointerInputModifierNode11.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        bottomSheetScaffoldsdMYb0k = bottomSheetScaffoldsdMYb0k2;
        updatemenuitems = updatemenuitems2;
        dragGestureNode.MediaSessionCompatToken = bottomSheetScaffoldsdMYb0k;
        dragGestureNode.IconCompatParcelizer(updatemenuitems.read);
        return createFromParcel.INSTANCE;
        bottomSheetScaffoldsdMYb0k = new BottomSheetScaffoldsdMYb0k();
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = dragGestureNode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (mutableInteractionSourceImpl2 != null) {
            stylusHandwritingNodesuspendingPointerInputModifierNode11.serializer = updatemenuitems;
            stylusHandwritingNodesuspendingPointerInputModifierNode11.IconCompatParcelizer = bottomSheetScaffoldsdMYb0k;
            stylusHandwritingNodesuspendingPointerInputModifierNode11.read = 2;
            if (mutableInteractionSourceImpl2.emit(bottomSheetScaffoldsdMYb0k, stylusHandwritingNodesuspendingPointerInputModifierNode11) != coroutineSingletons) {
                updatemenuitems2 = updatemenuitems;
                bottomSheetScaffoldsdMYb0k2 = bottomSheetScaffoldsdMYb0k;
                bottomSheetScaffoldsdMYb0k = bottomSheetScaffoldsdMYb0k2;
                updatemenuitems = updatemenuitems2;
            }
            return coroutineSingletons;
        }
        dragGestureNode.MediaSessionCompatToken = bottomSheetScaffoldsdMYb0k;
        dragGestureNode.IconCompatParcelizer(updatemenuitems.read);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$processDragStop(DragGestureNode dragGestureNode, FloatingTextActionModeCallback floatingTextActionModeCallback, ContinuationImpl continuationImpl) {
        accesstoOffset accesstooffset;
        if (continuationImpl instanceof accesstoOffset) {
            accesstooffset = (accesstoOffset) continuationImpl;
            int i = accesstooffset.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accesstooffset.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accesstooffset = new accesstoOffset(dragGestureNode, continuationImpl);
            }
        } else {
            accesstooffset = new accesstoOffset(dragGestureNode, continuationImpl);
        }
        Object obj = accesstooffset.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accesstooffset.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BottomSheetScaffoldsdMYb0k bottomSheetScaffoldsdMYb0k = dragGestureNode.MediaSessionCompatToken;
            if (bottomSheetScaffoldsdMYb0k != null) {
                MutableInteractionSourceImpl mutableInteractionSourceImpl = dragGestureNode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (mutableInteractionSourceImpl != null) {
                    BottomSheetScaffoldKtStandardBottomSheet311 bottomSheetScaffoldKtStandardBottomSheet311 = new BottomSheetScaffoldKtStandardBottomSheet311(bottomSheetScaffoldsdMYb0k);
                    accesstooffset.IconCompatParcelizer = floatingTextActionModeCallback;
                    accesstooffset.RemoteActionCompatParcelizer = 1;
                    if (mutableInteractionSourceImpl.emit(bottomSheetScaffoldKtStandardBottomSheet311, accesstooffset) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.serializer(floatingTextActionModeCallback);
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        floatingTextActionModeCallback = accesstooffset.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        dragGestureNode.MediaSessionCompatToken = null;
        dragGestureNode.serializer(floatingTextActionModeCallback);
        return createFromParcel.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new VelocityTracker();
        }
        VelocityTrackerKt.addPointerInputChange(MediaDescriptionCompat(), pointerInputChange);
        long jM481minusMKHz9U = Offset.m481minusMKHz9U(pointerInputChange2.m2071getPositionF1C5BW0(), j);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Offset.Companion.m493getZeroF1C5BW0();
        if (((Boolean) this.MediaMetadataCompat.invoke(PointerType.m2143boximpl(pointerInputChange.m2074getTypeT8wyACA()))).booleanValue()) {
            if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                if (this.RatingCompat == null) {
                    this.RatingCompat = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
                }
                MediaSessionCompatQueueItem();
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(this));
            IconCompatParcelizer().b_(new updateMenuItems(jM481minusMKHz9U));
        }
    }

    @Override // o.PrefetchHandleProviderHandleAndRequestImpl
    public final boolean isInterested(PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            return this.PlaybackStateCompat;
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new TouchSlopDetector(this.ResultReceiver);
            }
            float touchSlop = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop();
            long jPositionChange = PointerEventKt.positionChange(pointerInputChange);
            TouchSlopDetector touchSlopDetector = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (touchSlopDetector == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Touch slop detector not initialized.");
                return false;
            }
            if (!Offset.m474equalsimpl0(touchSlopDetector.m61getPostSlopOffsetqto3Fdw(touchSlop, jPositionChange, false), Offset.Companion.m492getUnspecifiedF1C5BW0())) {
                long jM482plusMKHz9U = Offset.m482plusMKHz9U(touchSlopDetector.RemoteActionCompatParcelizer, jPositionChange);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM482plusMKHz9U & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM482plusMKHz9U >> 32))))) * 180.0f)) / 3.141592653589793d;
                SelectionHandleIcon selectionHandleIcon = touchSlopDetector.serializer;
                int i = selectionHandleIcon == null ? -1 : updateClipboardEntryfoundation.write[selectionHandleIcon.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final logUnregisterActivitylambda1 IconCompatParcelizer() {
        BufferedChannel bufferedChannel = this.RatingCompat;
        if (bufferedChannel != null) {
            return bufferedChannel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Events channel not initialized.");
        return null;
    }

    public final VelocityTracker MediaDescriptionCompat() {
        VelocityTracker velocityTracker = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Velocity Tracker not initialized.");
        return null;
    }

    public final void read() {
        TextFieldKeyInputKtExternalSyntheticLambda0 textFieldKeyInputKtExternalSyntheticLambda0 = this.serializer;
        if (textFieldKeyInputKtExternalSyntheticLambda0 == null) {
            computeSizeForDefaultText computesizefordefaulttext = computeSizeForDefaultText.NotInitialized;
            TextFieldKeyInputKtExternalSyntheticLambda0 textFieldKeyInputKtExternalSyntheticLambda1 = new TextFieldKeyInputKtExternalSyntheticLambda0();
            textFieldKeyInputKtExternalSyntheticLambda1.IconCompatParcelizer = computesizefordefaulttext;
            textFieldKeyInputKtExternalSyntheticLambda1.write = false;
            this.serializer = textFieldKeyInputKtExternalSyntheticLambda1;
            textFieldKeyInputKtExternalSyntheticLambda0 = textFieldKeyInputKtExternalSyntheticLambda1;
        }
        textFieldKeyInputKtExternalSyntheticLambda0.IconCompatParcelizer = computeSizeForDefaultText.NotInitialized;
        textFieldKeyInputKtExternalSyntheticLambda0.write = false;
        this.MediaSessionCompatResultReceiverWrapper = textFieldKeyInputKtExternalSyntheticLambda0;
    }

    public final void IconCompatParcelizer(PointerInputChange pointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
        isPositionOnTextk4lQ0M ispositionontextk4lq0m = this.MediaBrowserCompatMediaItem;
        if (ispositionontextk4lq0m == null) {
            long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
            isPositionOnTextk4lQ0M ispositionontextk4lq0m2 = new isPositionOnTextk4lQ0M();
            ispositionontextk4lq0m2.IconCompatParcelizer = null;
            ispositionontextk4lq0m2.serializer = jM2048constructorimpl;
            this.MediaBrowserCompatMediaItem = ispositionontextk4lq0m2;
            ispositionontextk4lq0m = ispositionontextk4lq0m2;
        }
        ispositionontextk4lq0m.IconCompatParcelizer = pointerInputChange;
        ispositionontextk4lq0m.serializer = j;
        TouchSlopDetector.RemoteActionCompatParcelizer(touchSlopDetector);
        this.MediaSessionCompatResultReceiverWrapper = ispositionontextk4lq0m;
    }

    @Override // o.PrefetchHandleProviderHandleAndRequestImpl
    public final boolean read(IndirectPointerInputChange indirectPointerInputChange) {
        return IndirectPointerInputDragCycleDetectorKt.RemoteActionCompatParcelizer(indirectPointerInputChange) && this.PlaybackStateCompat;
    }
}
