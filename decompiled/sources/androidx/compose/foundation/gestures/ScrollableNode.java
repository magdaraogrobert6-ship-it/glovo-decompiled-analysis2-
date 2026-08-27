package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.Extras$Key;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import o.FloatingTextActionModeCallback;
import o.LazyLayoutPinnedItemList;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.accessanimateWithTarget;
import o.applyMeasureResultfoundation;
import o.autoInvalidateUpdatedNode;
import o.constructorimpl;
import o.createFromParcel;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getKey;
import o.getStringId9Hzcbyc;
import o.getViewportSizeYbymL2g;
import o.isMouseOrTouchPad;
import o.isNotGestureActionfoundation;
import o.notifyFocusedRectfoundation;
import o.onPostScrollDzOQY0M;
import o.removeNodeAtDepth;
import o.scrollToItem;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode {
    public constructorimpl IconCompatParcelizer;
    public final ContentInViewNode RemoteActionCompatParcelizer;
    public TrackpadScrollingLogic _init_lambda3;
    public MouseWheelScrollingLogic r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ScrollableNestedScrollConnection r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final NestedScrollDispatcher r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public GapComposer$$ExternalSyntheticLambda3 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public isNotGestureActionfoundation r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final ScrollingLogic r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public ScrollableNode$onKeyEvent$1 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final FocusTargetModifierNode read;
    public final notifyFocusedRectfoundation write;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void IconCompatParcelizer(long j) {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo12onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    public ScrollableNode(isNotGestureActionfoundation isnotgestureactionfoundation, getStringId9Hzcbyc getstringid9hzcbyc, constructorimpl constructorimplVar, SelectionHandleIcon selectionHandleIcon, getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        super(ScrollableKt.write, z, mutableInteractionSourceImpl, selectionHandleIcon);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = isnotgestureactionfoundation;
        this.IconCompatParcelizer = constructorimplVar;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = nestedScrollDispatcher;
        notifyFocusedRectfoundation notifyfocusedrectfoundation = new notifyFocusedRectfoundation(new accessanimateWithTarget(new Extras$Key(ScrollableKt.RemoteActionCompatParcelizer)));
        this.write = notifyfocusedrectfoundation;
        isNotGestureActionfoundation isnotgestureactionfoundation2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        constructorimpl constructorimplVar2 = this.IconCompatParcelizer;
        ScrollingLogic scrollingLogic = new ScrollingLogic(getadjustedcoordinatesk4lq0m, isnotgestureactionfoundation2, constructorimplVar2 == null ? notifyfocusedrectfoundation : constructorimplVar2, selectionHandleIcon, z2, nestedScrollDispatcher, this, new isMouseOrTouchPad(this, 0));
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scrollableNestedScrollConnection;
        this.read = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m387FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m412getNeverLCbbffg(), null, 2, null));
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(selectionHandleIcon, scrollingLogic, z2, getstringid9hzcbyc, new isMouseOrTouchPad(this, 1)));
        this.RemoteActionCompatParcelizer = contentInViewNode;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        BringIntoViewResponderNode bringIntoViewResponderNode = new BringIntoViewResponderNode();
        bringIntoViewResponderNode.IconCompatParcelizer = contentInViewNode;
        delegate(bringIntoViewResponderNode);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean RemoteActionCompatParcelizer() {
        ScrollingLogic scrollingLogic = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (scrollingLogic.ParcelableVolumeInfo.IconCompatParcelizer()) {
            return true;
        }
        isNotGestureActionfoundation isnotgestureactionfoundation = scrollingLogic.MediaSessionCompatQueueItem;
        if (isnotgestureactionfoundation == null) {
            return false;
        }
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = ((AndroidEdgeEffectOverscrollEffect) isnotgestureactionfoundation).serializer;
        EdgeEffect edgeEffect = lazyLayoutPinnedItemList.MediaSessionCompatQueueItem;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = lazyLayoutPinnedItemList.read;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = lazyLayoutPinnedItemList.write;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = lazyLayoutPinnedItemList.RatingCompat;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void serializer(FloatingTextActionModeCallback floatingTextActionModeCallback) {
        BuildersKt.RemoteActionCompatParcelizer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getCoroutineScope(), null, null, new BlockRunner$maybeRun$1(floatingTextActionModeCallback, this, null, 8), 3);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            notifyFocusedRectfoundation notifyfocusedrectfoundation = this.write;
            notifyfocusedrectfoundation.getClass();
            notifyfocusedrectfoundation.read = new accessanimateWithTarget(new Extras$Key(densityRequireDensity));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.write = DelegatableNodeKt.requireDensity(this);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this._init_lambda3;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.write = DelegatableNodeKt.requireDensity(this);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.PlaybackStateCompat && (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null || this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null)) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new GapComposer$$ExternalSyntheticLambda3(2, this);
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new ScrollableNode$onKeyEvent$1(this, null);
        }
        GapComposer$$ExternalSyntheticLambda3 gapComposer$$ExternalSyntheticLambda3 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (gapComposer$$ExternalSyntheticLambda3 != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, gapComposer$$ExternalSyntheticLambda3, 1, null);
        }
        ScrollableNode$onKeyEvent$1 scrollableNode$onKeyEvent$1 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (scrollableNode$onKeyEvent$1 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, scrollableNode$onKeyEvent$1);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$2) {
        applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.UserInput;
        ScrollingLogic scrollingLogic = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        Object objScroll = scrollingLogic.scroll(applymeasureresultfoundation, new ScrollableNode$drag$2$1(dragGestureNode$startListeningForEvents$1, scrollingLogic, null), dragGestureNode$startListeningForEvents$2);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : createFromParcel.INSTANCE;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo10onKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM469constructorimpl;
        if (this.PlaybackStateCompat) {
            long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
            Key.Companion companion = Key.Companion;
            if ((Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1780getPageDownEK5gGoQ()) || Key.m1581equalsimpl0(KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent), companion.m1781getPageUpEK5gGoQ())) && KeyEventType.m1894equalsimpl0(KeyEvent_androidKt.m1902getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1898getKeyDownCS__XNY()) && !KeyEvent_androidKt.m1905isCtrlPressedZmokQxo(keyEvent)) {
                boolean z = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.MediaBrowserCompatMediaItem == SelectionHandleIcon.Vertical;
                ContentInViewNode contentInViewNode = this.RemoteActionCompatParcelizer;
                if (z) {
                    int iSerializer = (int) (contentInViewNode.serializer() & 4294967295L);
                    jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Key.m1581equalsimpl0(KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent), companion.m1781getPageUpEK5gGoQ()) ? iSerializer : -iSerializer)) & 4294967295L));
                } else {
                    int iSerializer2 = (int) (contentInViewNode.serializer() >> 32);
                    jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Key.m1581equalsimpl0(KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent), companion.m1781getPageUpEK5gGoQ()) ? iSerializer2 : -iSerializer2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
                }
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, jM469constructorimpl, null, 0), 3);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) this.MediaMetadataCompat.invoke(PointerType.m2143boximpl(changes.get(i).m2074getTypeT8wyACA()))).booleanValue()) {
                super.mo11onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
                break;
            }
        }
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = delegate(new onPostScrollDzOQY0M(this));
        }
        if (this.PlaybackStateCompat) {
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            ScrollingLogic scrollingLogic = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (pointerEventPass == pointerEventPass2 && PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), PointerEventType.Companion.m2026getScroll7fucELk())) {
                if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MouseWheelScrollingLogic(scrollingLogic, new getKey(ViewConfiguration.get(DelegatableNode_androidKt.requireView(this).getContext())), new autoInvalidateUpdatedNode(2, this, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), DelegatableNodeKt.requireDensity(this));
                }
                MouseWheelScrollingLogic mouseWheelScrollingLogic = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (mouseWheelScrollingLogic != null) {
                    getContentViewGroupParentLayout coroutineScope = getCoroutineScope();
                    if (mouseWheelScrollingLogic.RemoteActionCompatParcelizer == null) {
                        mouseWheelScrollingLogic.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(coroutineScope, null, null, new BlockRunner$maybeRun$1(mouseWheelScrollingLogic, shortNewsContentCardView, 5), 3);
                    }
                }
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (mouseWheelScrollingLogic2 != null && PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), PointerEventType.Companion.m2026getScroll7fucELk())) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (changes2.get(i2).isConsumed()) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        if (pointerEventPass == PointerEventPass.Initial && mouseWheelScrollingLogic2.serializer) {
                            mouseWheelScrollingLogic2.read(pointerEvent);
                            NonTouchScrollingLogic.consume$foundation(pointerEvent);
                        }
                        if (pointerEventPass != PointerEventPass.Main || mouseWheelScrollingLogic2.serializer || !mouseWheelScrollingLogic2.read(pointerEvent)) {
                            break;
                            break;
                            break;
                        } else {
                            NonTouchScrollingLogic.consume$foundation(pointerEvent);
                            break;
                        }
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Initial) {
                int iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                PointerEventType.Companion companion = PointerEventType.Companion;
                if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2020getPanStart7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2019getPanMove7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2018getPanEnd7fucELk())) {
                    if (this._init_lambda3 == null) {
                        this._init_lambda3 = new TrackpadScrollingLogic(scrollingLogic, new autoInvalidateUpdatedNode(2, this, ScrollableNode.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), DelegatableNodeKt.requireDensity(this));
                    }
                    TrackpadScrollingLogic trackpadScrollingLogic = this._init_lambda3;
                    if (trackpadScrollingLogic != null) {
                        getContentViewGroupParentLayout coroutineScope2 = getCoroutineScope();
                        if (trackpadScrollingLogic.read == null) {
                            trackpadScrollingLogic.read = BuildersKt.RemoteActionCompatParcelizer(coroutineScope2, null, null, new NavHostKt$NavHost$29$1(trackpadScrollingLogic, null), 3);
                        }
                    }
                }
            }
            TrackpadScrollingLogic trackpadScrollingLogic2 = this._init_lambda3;
            if (trackpadScrollingLogic2 != null) {
                int iM2004getType7fucELk2 = pointerEvent.m2004getType7fucELk();
                PointerEventType.Companion companion2 = PointerEventType.Companion;
                if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk2, companion2.m2020getPanStart7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion2.m2019getPanMove7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion2.m2018getPanEnd7fucELk())) {
                    List<PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (changes3.get(i3).isConsumed()) {
                            return;
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Initial && trackpadScrollingLogic2.serializer) {
                        trackpadScrollingLogic2.onPan(pointerEvent);
                        NonTouchScrollingLogic.consume$foundation(pointerEvent);
                    }
                    if (pointerEventPass == PointerEventPass.Main && !trackpadScrollingLogic2.serializer && trackpadScrollingLogic2.onPan(pointerEvent)) {
                        NonTouchScrollingLogic.consume$foundation(pointerEvent);
                    }
                }
            }
        }
    }

    public final void read(isNotGestureActionfoundation isnotgestureactionfoundation, getStringId9Hzcbyc getstringid9hzcbyc, constructorimpl constructorimplVar, SelectionHandleIcon selectionHandleIcon, getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.PlaybackStateCompat != z) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer = z;
            z3 = true;
        } else {
            z3 = false;
        }
        constructorimpl constructorimplVar2 = constructorimplVar == null ? this.write : constructorimplVar;
        ScrollingLogic scrollingLogic = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{scrollingLogic.ParcelableVolumeInfo, getadjustedcoordinatesk4lq0m}, getCieXyz.write())).booleanValue()) {
            scrollingLogic.ParcelableVolumeInfo = getadjustedcoordinatesk4lq0m;
            z5 = true;
        }
        scrollingLogic.MediaSessionCompatQueueItem = isnotgestureactionfoundation;
        if (scrollingLogic.MediaBrowserCompatMediaItem != selectionHandleIcon) {
            scrollingLogic.MediaBrowserCompatMediaItem = selectionHandleIcon;
            z5 = true;
        }
        if (scrollingLogic.MediaSessionCompatResultReceiverWrapper != z2) {
            scrollingLogic.MediaSessionCompatResultReceiverWrapper = z2;
        } else {
            z4 = z5;
        }
        scrollingLogic.serializer = constructorimplVar2;
        scrollingLogic.read = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        ContentInViewNode contentInViewNode = this.RemoteActionCompatParcelizer;
        contentInViewNode.read = selectionHandleIcon;
        contentInViewNode.MediaSessionCompatQueueItem = z2;
        contentInViewNode.serializer = getstringid9hzcbyc;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = isnotgestureactionfoundation;
        this.IconCompatParcelizer = constructorimplVar;
        getViewportSizeYbymL2g getviewportsizeybyml2g = ScrollableKt.write;
        SelectionHandleIcon selectionHandleIcon2 = scrollingLogic.MediaBrowserCompatMediaItem;
        SelectionHandleIcon selectionHandleIcon3 = SelectionHandleIcon.Vertical;
        serializer(getviewportsizeybyml2g, z, mutableInteractionSourceImpl, selectionHandleIcon2 == selectionHandleIcon3 ? selectionHandleIcon3 : SelectionHandleIcon.Horizontal, z4);
        if (z3) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (isAttached()) {
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            notifyFocusedRectfoundation notifyfocusedrectfoundation = this.write;
            notifyfocusedrectfoundation.getClass();
            notifyfocusedrectfoundation.read = new accessanimateWithTarget(new Extras$Key(densityRequireDensity));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.write = DelegatableNodeKt.requireDensity(this);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this._init_lambda3;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.write = DelegatableNodeKt.requireDensity(this);
        }
    }
}
