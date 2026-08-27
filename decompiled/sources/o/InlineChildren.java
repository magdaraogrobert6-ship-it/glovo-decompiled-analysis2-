package o;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InlineChildren implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ InlineChildren(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    public /* synthetic */ InlineChildren(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState;
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.write;
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult2 = null;
        float f = 0.0f;
        switch (i) {
            case 0:
                androidx.compose.foundation.ScrollState scrollState = (androidx.compose.foundation.ScrollState) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float fSerializer = scrollState.serializer() + fFloatValue + scrollState.write;
                float fWrite = RangesKt.write(fSerializer, 0.0f, scrollState.read());
                i = fSerializer == fWrite ? 1 : 0;
                float fSerializer2 = fWrite - scrollState.serializer();
                int iRound = Math.round(fSerializer2);
                ((onHideTranslationui) scrollState.MediaDescriptionCompat).serializer(scrollState.serializer() + iRound);
                scrollState.write = fSerializer2 - iRound;
                if (i == 0) {
                    fFloatValue = fSerializer2;
                }
                return Float.valueOf(fFloatValue);
            case 1:
                NegativeLatLongSavesIncorrectlyQuirk negativeLatLongSavesIncorrectlyQuirk = (NegativeLatLongSavesIncorrectlyQuirk) obj2;
                negativeLatLongSavesIncorrectlyQuirk.RemoteActionCompatParcelizer(negativeLatLongSavesIncorrectlyQuirk.serializer.read(obj));
                return createfromparcel;
            case 2:
                return ((getCurrentContentInsetRight) obj2).MediaMetadataCompat;
            case 3:
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(2, (androidx.compose.animation.core.Transition) obj2);
            case 4:
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                ((ActivityPackageSender) obj2).invoke(pointerInputChange, Float.valueOf(Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange) >> 32))));
                pointerInputChange.consume();
                return createfromparcel;
            case 5:
                androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = (androidx.compose.foundation.gestures.ScrollingLogic) obj2;
                return androidx.compose.ui.geometry.Offset.m466boximpl(scrollingLogic.serializer(scrollingLogic.RatingCompat, ((androidx.compose.ui.geometry.Offset) obj).m487unboximpl(), scrollingLogic.IconCompatParcelizer));
            case 6:
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) obj2;
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                int i2 = oncreatevirtualviewtranslationrequests.read;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((androidx.compose.ui.layout.MeasureResult) objArr[i3]).placeChildren();
                }
                return createfromparcel;
            case 7:
                ((Integer) obj).getClass();
                return obj2;
            case 8:
                androidx.compose.foundation.lazy.LazyListState lazyListState = (androidx.compose.foundation.lazy.LazyListState) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || lazyListState.write()) && (f2 <= 0.0f || lazyListState.RemoteActionCompatParcelizer())) {
                    if (Math.abs(lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) > 0.5f) {
                        TriStateCheckbox.RemoteActionCompatParcelizer("entered drag with non-zero pending scroll");
                    }
                    lazyListState.MediaSessionCompatQueueItem = true;
                    float f3 = lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + f2;
                    lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        int iRound2 = Math.round(f4);
                        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure = ((androidx.compose.foundation.lazy.LazyListMeasureResult) ((onShowTranslationui) lazyListState.ParcelableVolumeInfo).getValue()).copyWithScrollDeltaWithoutRemeasure(iRound2, !lazyListState.RatingCompat);
                        if (lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure == null || (lazyListMeasureResult = lazyListState.serializer) == null) {
                            lazyListMeasureResult2 = lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                        } else {
                            androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = lazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(iRound2, true);
                            if (lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                                lazyListState.serializer = lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                                lazyListMeasureResult2 = lazyListMeasureResultCopyWithScrollDeltaWithoutRemeasure;
                            }
                        }
                        if (lazyListMeasureResult2 != null) {
                            lazyListState.read(lazyListMeasureResult2, lazyListState.RatingCompat, true);
                            lazyListState.MediaSessionCompatResultReceiverWrapper.setValue(createfromparcel);
                            lazyListState.IconCompatParcelizer(f4 - lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, lazyListMeasureResult2);
                        } else {
                            androidx.compose.ui.layout.Remeasurement remeasurement = lazyListState.ComponentActivity;
                            if (remeasurement != null) {
                                remeasurement.forceRemeasure();
                            }
                            lazyListState.IconCompatParcelizer(f4 - lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, lazyListState.serializer());
                        }
                    }
                    if (Math.abs(lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) > 0.5f) {
                        f2 -= lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        lazyListState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 9:
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(3, (consumeAvailableOffsetMKHz9U) obj2);
            case 10:
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(5, (ExtendedFabLargeTokens) obj2);
            case 11:
                alpha alphaVar = (alpha) obj2;
                return Boolean.valueOf(alphaVar != null ? alphaVar.canBeSaved(obj) : true);
            case 12:
                float fFloatValue2 = ((Float) obj).floatValue();
                androidx.compose.foundation.pager.PagerState pagerState = ((androidx.compose.foundation.pager.PagerWrapperFlingBehavior) obj2).RemoteActionCompatParcelizer;
                ((onHideTranslationui) pagerState.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0).serializer(pagerState.serializer(pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() + MathKt.write(pagerState.MediaBrowserCompatMediaItem() != 0 ? fFloatValue2 / pagerState.MediaBrowserCompatMediaItem() : 0.0f)));
                return createfromparcel;
            case 13:
                ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj).set(androidx.compose.foundation.text.selection.SelectionHandlesKt.read, new getAggregateChildKindSetui(AlignmentCompanion.Cursor, ((accessthenjd) obj2).serializer(), getCoroutineScope.Middle, true));
                return createfromparcel;
            case 14:
                equals equalsVar = (equals) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                float fSerializer3 = equalsVar.serializer() + fFloatValue3;
                getContentCaptureSessionui getcontentcapturesessionui = (getContentCaptureSessionui) equalsVar.write;
                if (fSerializer3 > getcontentcapturesessionui.serializer()) {
                    fFloatValue3 = getcontentcapturesessionui.serializer() - equalsVar.serializer();
                } else if (fSerializer3 < 0.0f) {
                    fFloatValue3 = -equalsVar.serializer();
                }
                ((getContentCaptureSessionui) equalsVar.RemoteActionCompatParcelizer).IconCompatParcelizer(equalsVar.serializer() + fFloatValue3);
                return Float.valueOf(fFloatValue3);
            case 15:
                Drawable drawable = (Drawable) obj2;
                androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)));
                drawable.draw(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
                return createfromparcel;
            case 16:
                update updateVar = (update) obj2;
                updateVar.IconCompatParcelizer.invoke((BiasAlignmentVertical) obj, androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(updateVar, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                return createfromparcel;
            case 17:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).invoke((BiasAlignmentVertical) obj2);
                return createfromparcel;
            case 18:
                InlineChildren inlineChildren = (InlineChildren) obj2;
                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) obj;
                if (traversableNode instanceof CompositionLocalMapInjectionNode) {
                    inlineChildren.invoke(((CompositionLocalMapInjectionNode) traversableNode).RemoteActionCompatParcelizer);
                    return Boolean.TRUE;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 19:
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(8, (androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider) obj2);
            case 20:
                ((KeyedComposedModifier3) obj2).IconCompatParcelizer((androidx.compose.ui.text.input.EditCommand) obj);
                return createfromparcel;
            case 21:
                ut utVar = (ut) obj2;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                long jM2071getPositionF1C5BW0 = pointerInputChange2.m2071getPositionF1C5BW0();
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) utVar.MediaBrowserCompatMediaItem;
                if (textFieldSelectionManager.RemoteActionCompatParcelizer() && textFieldSelectionManager.MediaDescriptionCompat().getText().length() != 0 && (legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null && legacyTextFieldState.serializer() != null) {
                    utVar.RemoteActionCompatParcelizer(textFieldSelectionManager.MediaDescriptionCompat(), jM2071getPositionF1C5BW0, false, getNodeannotations.write);
                    pointerInputChange2.consume();
                }
                return createfromparcel;
            case 22:
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(9, (androidx.compose.material3.TooltipStateImpl) obj2);
            case 23:
                isText istext = (isText) obj2;
                androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
                if (istext.IconCompatParcelizer() > 0.0f) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(istext.IconCompatParcelizer(), new ensureSubscribedToInAppMessageEventslambda0(1.0f), 0));
                }
                return createfromparcel;
            case 24:
                ((onHideTranslationui) obj2).serializer(((Integer) obj).intValue());
                return createfromparcel;
            case 25:
                ((onCreateVirtualViewTranslationRequestsui) obj2).write(((Long) obj).longValue());
                return createfromparcel;
            case 26:
                ((onShowTranslationui) obj2).setValue(obj);
                return createfromparcel;
            case 27:
                alpha alphaVar2 = ((BlockDropShadowNode) obj2).write;
                return Boolean.valueOf(alphaVar2 != null ? alphaVar2.canBeSaved(obj) : true);
            case 28:
                return androidx.compose.ui.text.font.FontFamilyResolverImpl.preload$lambda$1((androidx.compose.ui.text.font.FontFamilyResolverImpl) obj2, (androidx.compose.ui.text.font.TypefaceRequest) obj);
            default:
                return Boolean.valueOf(androidx.compose.ui.tooling.ComposeViewAdapter.findDesignInfoProviders$lambda$1$0((androidx.compose.ui.tooling.ComposeViewAdapter) obj2, (androidx.compose.ui.tooling.data.Group) obj));
        }
    }
}
