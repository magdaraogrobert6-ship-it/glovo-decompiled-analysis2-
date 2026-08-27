package o;

import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class waitForFirstLayout implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ waitForFirstLayout(androidx.compose.foundation.text.TextLinkScope textLinkScope, androidx.compose.ui.text.AnnotatedString.Range range, getCenter getcenter) {
        this.serializer = 26;
        this.RemoteActionCompatParcelizer = range;
        this.write = getcenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.text.SpanStyle spanStyle;
        androidx.compose.ui.text.SpanStyle spanStyle2;
        androidx.compose.ui.text.SpanStyle spanStyleMerge;
        androidx.compose.ui.text.TextLinkStyles styles;
        androidx.compose.ui.text.SpanStyle pressedStyle;
        androidx.compose.ui.text.SpanStyle spanStyleMerge2;
        androidx.compose.ui.text.TextLinkStyles styles2;
        androidx.compose.ui.text.SpanStyle hoveredStyle;
        androidx.compose.ui.text.SpanStyle spanStyleMerge3;
        androidx.compose.ui.text.TextLinkStyles styles3;
        androidx.compose.ui.text.SpanStyle focusedStyle;
        androidx.compose.ui.graphics.Path pathForRange;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        androidx.compose.ui.text.AnnotatedString.Range rangeSerializer;
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        int i2 = 6;
        int i3 = 4;
        int i4 = 2;
        boolean z = true;
        z = true;
        androidx.compose.ui.text.SpanStyle spanStyle3 = 0;
        spanStyle3 = 0;
        boolean z2 = false;
        switch (i) {
            case 0:
                cancelPendingWebViewPause cancelpendingwebviewpause = (cancelPendingWebViewPause) obj2;
                z2 = cancelpendingwebviewpause.IconCompatParcelizer || ((PrefetchHandleProviderHandleAndRequestImpl) obj).read((androidx.compose.ui.input.indirect.IndirectPointerInputChange) obj3);
                cancelpendingwebviewpause.IconCompatParcelizer = z2;
                return Boolean.valueOf(!z2);
            case 1:
                getLifecycle getlifecycle = (getLifecycle) obj3;
                addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener = (addOnPictureInPictureModeChangedListener) obj2;
                getlifecycle.read(addonpictureinpicturemodechangedlistener);
                return new refreshFeatureFlagslambda10(getlifecycle, z ? 1 : 0, addonpictureinpicturemodechangedlistener);
            case 2:
                ArrangementHorizontal arrangementHorizontal = (ArrangementHorizontal) obj3;
                placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout = (placeSpaceBetweenfoundation_layout) obj2;
                arrangementHorizontal.IconCompatParcelizer.IconCompatParcelizer(placespacebetweenfoundation_layout);
                ((onShowTranslationui) arrangementHorizontal.RemoteActionCompatParcelizer).setValue(Boolean.TRUE);
                return new refreshFeatureFlagslambda10(arrangementHorizontal, i4, placespacebetweenfoundation_layout);
            case 3:
                androidx.compose.animation.core.TransitionState transitionState = (androidx.compose.animation.core.TransitionState) obj3;
                ((androidx.compose.animation.core.SeekableTransitionState) transitionState).read(new setSpread(new waitForFirstLayout(Thread.currentThread(), i3, (getContentViewGroupParentLayout) obj2)));
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(z2 ? 1 : 0, transitionState);
            case 4:
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj2;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj;
                if (obj3 == Thread.currentThread()) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                } else {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, spanStyle3, z ? 1 : 0), 3);
                }
                return createfromparcel;
            case 5:
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) obj3;
                requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) obj2;
                transition.RemoteActionCompatParcelizer.add(requiredsize3abfnks);
                return new refreshFeatureFlagslambda10(transition, 3, requiredsize3abfnks);
            case 6:
                ((androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj3).write((CheckboxKt) obj2);
                return createfromparcel;
            case 7:
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj;
                contentDrawScope.drawContent();
                androidx.compose.ui.graphics.drawscope.DrawScope.m1293drawPathGBMwjPU$default(contentDrawScope, ((androidx.compose.ui.graphics.Outline.Generic) obj3).getPath(), (androidx.compose.ui.graphics.Brush) obj2, 0.0f, null, null, 0, 60, null);
                return createfromparcel;
            case 8:
                cancelPendingWebViewPause cancelpendingwebviewpause2 = (cancelPendingWebViewPause) obj2;
                boolean z3 = cancelpendingwebviewpause2.IconCompatParcelizer || ((PrefetchHandleProviderHandleAndRequestImpl) obj).isInterested((androidx.compose.ui.input.pointer.PointerInputChange) obj3);
                cancelpendingwebviewpause2.IconCompatParcelizer = z3;
                return Boolean.valueOf(!z3);
            case 9:
                ((androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj3).write((ButtonDefaults) obj2);
                return createfromparcel;
            case 10:
                androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode = (androidx.compose.foundation.gestures.AnchoredDraggableNode) obj3;
                HeightInLinesNode heightInLinesNode = (HeightInLinesNode) obj2;
                long j = ((showTextContextMenu) obj).write;
                long jM484timestuRUvjQ = (androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(anchoredDraggableNode) == androidx.compose.ui.unit.LayoutDirection.Rtl && anchoredDraggableNode.read == SelectionHandleIcon.Horizontal) ? androidx.compose.ui.geometry.Offset.m484timestuRUvjQ(j, -1.0f) : androidx.compose.ui.geometry.Offset.m484timestuRUvjQ(j, 1.0f);
                heightInLinesNode.read(anchoredDraggableNode.RemoteActionCompatParcelizer.IconCompatParcelizer(Float.intBitsToFloat((int) (anchoredDraggableNode.read == SelectionHandleIcon.Vertical ? jM484timestuRUvjQ & 4294967295L : jM484timestuRUvjQ >> 32))), 0.0f);
                return createfromparcel;
            case 11:
                ((CommonDecorationBox) obj3).read.RemoteActionCompatParcelizer((TextFieldDelegateKt) obj2);
                return createfromparcel;
            case 12:
                booleanValue booleanvalue = (booleanValue) obj3;
                androidx.compose.foundation.gestures.DraggableNode draggableNode = (androidx.compose.foundation.gestures.DraggableNode) obj2;
                long j2 = ((showTextContextMenu) obj).write;
                long jM484timestuRUvjQ2 = draggableNode.RemoteActionCompatParcelizer ? androidx.compose.ui.geometry.Offset.m484timestuRUvjQ(j2, -1.0f) : androidx.compose.ui.geometry.Offset.m484timestuRUvjQ(j2, 1.0f);
                SelectionHandleIcon selectionHandleIcon = draggableNode.write;
                DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = coerceMinLinesOh53vG4foundation.IconCompatParcelizer;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (selectionHandleIcon == SelectionHandleIcon.Vertical ? jM484timestuRUvjQ2 & 4294967295L : jM484timestuRUvjQ2 >> 32));
                androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState = booleanvalue.serializer;
                getTextValue.IconCompatParcelizer((getTextValue) anchoredDraggableState.read, anchoredDraggableState.RemoteActionCompatParcelizer(fIntBitsToFloat));
                return createfromparcel;
            case 13:
                showTextContextMenu showtextcontextmenu = (showTextContextMenu) obj;
                ((SimpleLayoutKtSimpleLayout11) obj3).write(androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.m1938getUserInputWNlRxjI(), androidx.compose.ui.geometry.Offset.m484timestuRUvjQ(androidx.compose.ui.geometry.Offset.m471copydBAh8RU$default(showtextcontextmenu.write, 0.0f, 0.0f, ((androidx.compose.foundation.gestures.ScrollingLogic) obj2).MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal ? 1 : 2, null), showtextcontextmenu.serializer ? -1.0f : 1.0f));
                return createfromparcel;
            case 14:
                androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState = (androidx.compose.foundation.gestures.UpdatableAnimationState) obj3;
                ((Long) obj).getClass();
                float f = updatableAnimationState.IconCompatParcelizer;
                updatableAnimationState.IconCompatParcelizer = 0.0f;
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Float.valueOf(f));
                return createfromparcel;
            case 15:
                SnackbarKt snackbarKt = (SnackbarKt) obj3;
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj2;
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                boolean z4 = snackbarKt.write;
                float f2 = snackbarKt.RemoteActionCompatParcelizer;
                if (z4) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f2), placementScope.mo42roundToPx0680j_4(snackbarKt.read), 0.0f, 4, null);
                } else {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f2), placementScope.mo42roundToPx0680j_4(snackbarKt.read), 0.0f, 4, null);
                }
                return createfromparcel;
            case 16:
                SurfaceKt surfaceKt = (SurfaceKt) obj3;
                androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                long jM3810unboximpl = ((androidx.compose.ui.unit.IntOffset) surfaceKt.read.invoke(placementScope2)).m3810unboximpl();
                if (surfaceKt.write) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, placeable2, androidx.compose.ui.unit.IntOffset.m3801getXimpl(jM3810unboximpl), androidx.compose.ui.unit.IntOffset.m3802getYimpl(jM3810unboximpl), 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 12, (Object) null);
                } else {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope2, placeable2, androidx.compose.ui.unit.IntOffset.m3801getXimpl(jM3810unboximpl), androidx.compose.ui.unit.IntOffset.m3802getYimpl(jM3810unboximpl), 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 12, (Object) null);
                }
                return createfromparcel;
            case 17:
                ElevationKt elevationKt = (ElevationKt) obj3;
                androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) obj2;
                androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = elevationKt.IconCompatParcelizer;
                if (registrationHandle != null) {
                    registrationHandle.unregister();
                }
                elevationKt.IconCompatParcelizer = null;
                CompletableDeferredImpl completableDeferredImpl = awaitFirstLayoutModifier.read;
                if (completableDeferredImpl != null) {
                    completableDeferredImpl.MediaSessionCompatQueueItem(createfromparcel);
                }
                awaitFirstLayoutModifier.read = null;
                return createfromparcel;
            case 18:
                getCurrent getcurrent = (getCurrent) obj3;
                getcurrent.RemoteActionCompatParcelizer.read(obj2);
                return new refreshFeatureFlagslambda10(getcurrent, i3, obj2);
            case 19:
                return new getCurrent((alpha) obj3, (Map) obj, (AlphaKt) obj2);
            case 20:
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke(Integer.valueOf(((PrefetchHandleProvider$HandleAndRequestImpl) ((OutlinedTextFieldTokens) obj)).read), Integer.valueOf(((androidx.navigation.NavArgsLazy) obj2).MediaBrowserCompatMediaItem().PlaybackStateCompatCustomAction));
                return createfromparcel;
            case 21:
                ((androidx.compose.ui.layout.Placeable.PlacementScope) obj).withMotionFrameOfReferencePlacement(new ParcelableSnapshotMutableState(z2 ? 1 : 0, (ArrayList) obj2));
                ((PopulateViewStructure_androidKtpopulate7) obj3).getValue();
                return createfromparcel;
            case 22:
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = (androidx.compose.foundation.text.LegacyTextFieldState) obj3;
                androidx.compose.ui.graphics.Brush brush = (androidx.compose.ui.graphics.Brush) obj2;
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj;
                contentDrawScope2.drawContent();
                if (((Boolean) ((onShowTranslationui) legacyTextFieldState.read).getValue()).booleanValue() || ((Boolean) ((onShowTranslationui) legacyTextFieldState.MediaBrowserCompatMediaItem).getValue()).booleanValue()) {
                    androidx.compose.ui.graphics.drawscope.DrawScope.m1297drawRectAsUm42w$default(contentDrawScope2, brush, 0L, 0L, 0.0f, null, null, 0, 126, null);
                }
                return createfromparcel;
            case 23:
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope3 = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                ArrayList arrayListAccess$measureWithTextRangeMeasureConstraints = androidx.compose.foundation.text.BasicTextKt.access$measureWithTextRangeMeasureConstraints((List) obj3, ((getCenterEnd) obj2).RemoteActionCompatParcelizer);
                if (arrayListAccess$measureWithTextRangeMeasureConstraints != null) {
                    int size = arrayListAccess$measureWithTextRangeMeasureConstraints.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) arrayListAccess$measureWithTextRangeMeasureConstraints.get(i5);
                        androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) onviewattachedtowindowlambda0.serializer;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) onviewattachedtowindowlambda0.write;
                        androidx.compose.ui.layout.Placeable.PlacementScope.m2280place70tqf50$default(placementScope3, placeable3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1 != null ? ((androidx.compose.ui.unit.IntOffset) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).m3810unboximpl() : androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac(), 0.0f, 2, null);
                    }
                }
                return createfromparcel;
            case 24:
                return new refreshFeatureFlagslambda10((PopulateViewStructure_androidKtpopulate7) obj3, 5, (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj2);
            case 25:
                androidx.compose.foundation.text.TextLinkScope textLinkScope = (androidx.compose.foundation.text.TextLinkScope) obj3;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                textLinkScope.write.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return new refreshFeatureFlagslambda10(textLinkScope, i2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            case 26:
                androidx.compose.ui.text.AnnotatedString.Range range = (androidx.compose.ui.text.AnnotatedString.Range) obj3;
                getCenter getcenter = (getCenter) obj2;
                getStart getstart = (getStart) obj;
                androidx.compose.ui.text.TextLinkStyles styles4 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles();
                androidx.compose.ui.text.SpanStyle style = styles4 != null ? styles4.getStyle() : null;
                if (!getcenter.RemoteActionCompatParcelizer() || (styles3 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) == null) {
                    spanStyle = null;
                } else {
                    focusedStyle = styles3.getFocusedStyle();
                }
                if (style != null && (spanStyleMerge3 = style.merge(spanStyle)) != null) {
                    spanStyle = focusedStyle;
                    spanStyle = spanStyleMerge3;
                }
                spanStyle = focusedStyle;
                spanStyle = focusedStyle;
                if (!getcenter.serializer() || (styles2 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) == null) {
                    spanStyle2 = null;
                } else {
                    hoveredStyle = styles2.getHoveredStyle();
                }
                if (spanStyle != null && (spanStyleMerge2 = spanStyle.merge(spanStyle2)) != null) {
                    spanStyle2 = hoveredStyle;
                    spanStyle2 = spanStyleMerge2;
                }
                spanStyle2 = hoveredStyle;
                spanStyle2 = hoveredStyle;
                if (getcenter.IconCompatParcelizer() && (styles = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) != null) {
                    pressedStyle = styles.getPressedStyle();
                }
                if (spanStyle2 != null && (spanStyleMerge = spanStyle2.merge(spanStyle3)) != null) {
                    spanStyle3 = pressedStyle;
                    spanStyle3 = spanStyleMerge;
                }
                spanStyle3 = pressedStyle;
                spanStyle3 = pressedStyle;
                getstart.read = getstart.write.mapAnnotations(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(new cancelPendingWebViewPause(), range, spanStyle3, i2));
                return createfromparcel;
            case 27:
                androidx.compose.foundation.text.TextLinkScope textLinkScope2 = (androidx.compose.foundation.text.TextLinkScope) obj3;
                androidx.compose.ui.text.AnnotatedString.Range range2 = (androidx.compose.ui.text.AnnotatedString.Range) obj2;
                androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
                androidx.compose.ui.text.AnnotatedString annotatedString = textLinkScope2.IconCompatParcelizer;
                onShowTranslationui onshowtranslationui = (onShowTranslationui) textLinkScope2.RemoteActionCompatParcelizer;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = (androidx.compose.ui.text.TextLayoutResult) onshowtranslationui.getValue();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, (textLayoutResult2 == null || (layoutInput = textLayoutResult2.getLayoutInput()) == null) ? null : layoutInput.getText()}, getCieXyz.write())).booleanValue() || (textLayoutResult = (androidx.compose.ui.text.TextLayoutResult) onshowtranslationui.getValue()) == null || (rangeSerializer = androidx.compose.foundation.text.TextLinkScope.serializer(range2, textLayoutResult)) == null) {
                    pathForRange = null;
                } else {
                    pathForRange = textLayoutResult.getPathForRange(rangeSerializer.getStart(), rangeSerializer.getEnd());
                    androidx.compose.ui.geometry.Rect boundingBox = textLayoutResult.getBoundingBox(rangeSerializer.getStart());
                    pathForRange.mo614translatek4lQ0M(androidx.compose.ui.geometry.Offset.m469constructorimpl(androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(boundingBox.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(textLayoutResult.getLineForOffset(rangeSerializer.getStart()) == textLayoutResult.getLineForOffset(rangeSerializer.getEnd() - 1) ? Math.min(textLayoutResult.getBoundingBox(rangeSerializer.getEnd() - 1).getLeft(), boundingBox.getLeft()) : 0.0f)) << 32)) ^ (-9223372034707292160L)));
                }
                copy copyVar = pathForRange != null ? new copy(pathForRange) : null;
                if (copyVar != null) {
                    graphicsLayerScope.setShape(copyVar);
                    graphicsLayerScope.setClip(true);
                }
                return createfromparcel;
            case 28:
                preferredFrameRatekI47g10 preferredframerateki47g10 = (preferredFrameRatekI47g10) obj3;
                androidx.compose.ui.text.AnnotatedString annotatedString2 = (androidx.compose.ui.text.AnnotatedString) obj;
                if (preferredframerateki47g10.RemoteActionCompatParcelizer) {
                    androidx.compose.ui.text.input.TextInputSession textInputSession = preferredframerateki47g10.MediaSessionCompatQueueItem.MediaDescriptionCompat;
                    if (textInputSession != null) {
                        List<? extends androidx.compose.ui.text.input.EditCommand> list = androidx.sqlite.SQLite.read(new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString2, 1));
                        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = preferredframerateki47g10.MediaSessionCompatQueueItem;
                        androidx.compose.ui.text.input.EditProcessor editProcessor = legacyTextFieldState2.ComponentActivity;
                        Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 = legacyTextFieldState2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        androidx.compose.ui.text.input.TextFieldValue textFieldValueApply = editProcessor.apply(list);
                        textInputSession.updateState(null, textFieldValueApply);
                        actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1.invoke(textFieldValueApply);
                    } else {
                        preferredframerateki47g10.MediaSessionCompatQueueItem.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.invoke(new androidx.compose.ui.text.input.TextFieldValue(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(preferredframerateki47g10.MediaMetadataCompat.getText(), androidx.compose.ui.text.TextRange.m3076getStartimpl(preferredframerateki47g10.MediaMetadataCompat.m3330getSelectiond9O1mEE()), androidx.compose.ui.text.TextRange.m3071getEndimpl(preferredframerateki47g10.MediaMetadataCompat.m3330getSelectiond9O1mEE()), annotatedString2).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString2.length() + androidx.compose.ui.text.TextRange.m3076getStartimpl(preferredframerateki47g10.MediaMetadataCompat.m3330getSelectiond9O1mEE())), (androidx.compose.ui.text.TextRange) null, 4, (DefaultConstructorMarker) null));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = (createBrazeUserChangeEventSubscriberlambda01) obj3;
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda02 = (createBrazeUserChangeEventSubscriberlambda01) obj2;
                getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = (getIsCurrentlyDisplayingInAppMessage) obj;
                if (createbrazeuserchangeeventsubscriberlambda01.read == -1) {
                    createbrazeuserchangeeventsubscriberlambda01.read = getiscurrentlydisplayinginappmessage.serializer().write;
                }
                createbrazeuserchangeeventsubscriberlambda02.read = getiscurrentlydisplayinginappmessage.serializer().read + 1;
                return "";
        }
    }

    public /* synthetic */ waitForFirstLayout(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }
}
