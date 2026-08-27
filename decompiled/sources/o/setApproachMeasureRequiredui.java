package o;

import com.google.android.gms.internal.mlkit_vision_common.zzav;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.mlkit_vision_common.zziz;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.google.common.base.Verify;
import com.mapbox.api.directions.v5.utils.FormatUtils;
import com.mapbox.maps.plugin.logo.LogoUtils;
import com.mapbox.navigation.base.internal.DecodeUtilsExKt;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxCompletableKt;
import okhttp3.internal.platform.AndroidPlatform$Companion;

/* JADX INFO: loaded from: classes2.dex */
public final class setApproachMeasureRequiredui implements accessgetBrightnessDowncp {
    public static setApproachMeasureRequiredui write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final setApproachMeasureRequiredui serializer = new setApproachMeasureRequiredui(1);
    public static final /* synthetic */ setApproachMeasureRequiredui read = new setApproachMeasureRequiredui(2);
    public static final /* synthetic */ setApproachMeasureRequiredui IconCompatParcelizer = new setApproachMeasureRequiredui(3);

    public /* synthetic */ setApproachMeasureRequiredui(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static void RemoteActionCompatParcelizer() {
        synchronized (setApproachMeasureRequiredui.class) {
            if (write == null) {
                write = new setApproachMeasureRequiredui(0);
            }
        }
    }

    public void serializer(getDiffer getdiffer) {
        getdiffer.serializer(ApproachLayoutModifierNodeminApproachIntrinsicWidth1.class, getLastIndex.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        getdiffer.serializer(setMeasureBlock.class, ApproachIntrinsicsMeasureScope.serializer);
        getdiffer.serializer(zziz.class, calculateVelocity9UxMQ8M.RemoteActionCompatParcelizer);
        getdiffer.serializer(ApproachLayoutModifierNodemeasure11.class, calculateLeastSquaresVelocity.write);
        getdiffer.serializer(getLocalImageVectorCache.class, addDataPoint.write);
        getdiffer.serializer(accesslayoutjd.class, VelocityTracker1D.read);
        getdiffer.serializer(drawChildui_graphics.class, addPointerInputChangeUv8p0NA.RemoteActionCompatParcelizer);
        getdiffer.serializer(io.sentry.android.replay.util.read.class, setDataPoint.IconCompatParcelizer);
        getdiffer.serializer(getHapticFeedBack.class, add0FcD4WY.read);
        getdiffer.serializer(accessmergeRulerValues.class, AlignmentLineKtFirstBaseline1.read);
        getdiffer.serializer(accessgetTvInputHdmi4cp.class, setTime.read);
        getdiffer.serializer(getJEK5gGoQ.class, getDataPoint.serializer);
        getdiffer.serializer(accessgetTvInputComponent2cp.class, addPointerInputChange0AR0LA0.read);
        getdiffer.serializer(isNotEmpty.class, setLastMoveEventTimeStampui.RemoteActionCompatParcelizer);
        getdiffer.serializer(getTvInputComposite2EK5gGoQ.class, ExperimentalVelocityTrackerApi.serializer);
        getdiffer.serializer(minApproachIntrinsicWidth.class, PlatformVelocityTracker.IconCompatParcelizer);
        getdiffer.serializer(WindowInfoImplCompanion.class, getVelocityTrackerAddPointsFixannotations.IconCompatParcelizer);
        getdiffer.serializer(AndroidWindowInfo_androidKt.class, getMergerui.RemoteActionCompatParcelizer);
        getdiffer.serializer(NodeCoordinatorCompanionSemanticsSource1.class, getFirstBaseline.serializer);
        getdiffer.serializer(FormatUtils.class, AlignmentLineCompanion.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessgetUpdateDisplayListIfDirtyMethodcp.class, VelocityTracker1DStrategy.IconCompatParcelizer);
        getdiffer.serializer(onPreAttach.class, SuspendingPointerInputModifierNodeImpl1.write);
        getdiffer.serializer(timesUQTWf7w.class, accessset.IconCompatParcelizer);
        getdiffer.serializer(Verify.class, getOnPreRotaryScrollEvent.read);
        getdiffer.serializer(ApproachMeasureScope.class, onRotaryScrollEvent.write);
        getdiffer.serializer(getFrameView.class, RotaryInputModifierKt.read);
        getdiffer.serializer(mergeRulerValues.class, polyFitLeastSquares.write);
        getdiffer.serializer(compareTo9YPOF3E.class, checkPrecondition.RemoteActionCompatParcelizer);
        getdiffer.serializer(ScaleFactorKt.class, requirePreconditionNotNull.RemoteActionCompatParcelizer);
        getdiffer.serializer(setCompositionContext.class, checkPreconditionNotNull.write);
        getdiffer.serializer(FwFDataQueriesdeleteItem1.class, throwIllegalStateExceptionForNullCheck.write);
        getdiffer.serializer(ApproachLayoutModifierNodeminApproachIntrinsicHeight1.class, isDataDifferential.write);
        getdiffer.serializer(getButtono7Vup1c.class, JvmDefaultWithCompatibility_jvmAndAndroidKt.IconCompatParcelizer);
        getdiffer.serializer(getRectManager.class, PlatformOptimizedCancellationException_jvmAndAndroidKt.read);
        getdiffer.serializer(hitNearFh5PU_I.class, AlignmentLine.IconCompatParcelizer);
        getdiffer.serializer(getSetCompositionContextui.class, throwUnsupportedOperationException.RemoteActionCompatParcelizer);
        getdiffer.serializer(DiffCallback.class, throwIndexOutOfBoundsException.serializer);
        getdiffer.serializer(decodeInitialData.class, AlignmentLineKt.RemoteActionCompatParcelizer);
        getdiffer.serializer(shouldHitTestChildren.class, RotaryScrollEvent.RemoteActionCompatParcelizer);
        getdiffer.serializer(getOnKeyEvent.class, remove0FcD4WY.write);
        getdiffer.serializer(getDispatchedToAPointerInputModifierimpl.class, RotaryInputNode.read);
        getdiffer.serializer(FeatureFlagProvider.class, getInputDeviceId.write);
        getdiffer.serializer(accessgetButtoncp.class, getVerticalScrollPixels.read);
        getdiffer.serializer(GlobalPositionAwareModifierNode.class, getLastBaseline.RemoteActionCompatParcelizer);
        getdiffer.serializer(onRequestRelayout.class, getApproachMeasure.IconCompatParcelizer);
        getdiffer.serializer(zzhk.class, SuspendingPointerInputModifierNodeImplPointerEventHandlerCoroutinewithTimeoutjob1.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessgetSetTopBoxPowercp.class, accesssetAwaitPassp.read);
        getdiffer.serializer(ContentScaleCompanionFillWidth1.class, accessgetPointerAwaiterp.RemoteActionCompatParcelizer);
        getdiffer.serializer(AndroidPlatform$Companion.class, getContext.RemoteActionCompatParcelizer);
        getdiffer.serializer(getDisplayP3.class, offerPointerEvent.write);
        getdiffer.serializer(SentryLogcatAdapter.class, SuspendingPointerInputModifierNodeImplPointerEventHandlerCoroutinewithTimeout1.IconCompatParcelizer);
        getdiffer.serializer(setSlotReusePolicy.class, resumeWith.read);
        getdiffer.serializer(getButton5EK5gGoQ.class, SuspendingPointerInputModifierNodeImplonPointerEvent1.read);
        getdiffer.serializer(MemoryCachedecodeFeatures11.class, SuspendingPointerInputModifierNodeImplawaitPointerEventScope22.serializer);
        getdiffer.serializer(accessgetTvInputComponent1cp.class, SuspendingPointerInputModifierNodeImplWhenMappings.RemoteActionCompatParcelizer);
        getdiffer.serializer(io.sentry.android.core.internal.util.ParcelableVolumeInfo.class, SuspendingPointerInputModifierNodeImplpointerInputHandler1.RemoteActionCompatParcelizer);
        getdiffer.serializer(resizeToBitmapDimensionslambda3.class, forEachCurrentPointerHandler.read);
        getdiffer.serializer(displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.class, dispatchPointerEvent.write);
        getdiffer.serializer(toAndroidRectF.class, onViewConfigurationChange.read);
        getdiffer.serializer(ContentScaleCompanion.class, removeAt.write);
        getdiffer.serializer(useLoggerui.class, addPositionUv8p0NA.IconCompatParcelizer);
        getdiffer.serializer(r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8.class, getPointerInteropFilterui.write);
        getdiffer.serializer(toBitmap.class, StylusHoverIconModifierNode.RemoteActionCompatParcelizer);
        getdiffer.serializer(ApproachLayoutModifierNode.class, calculateVelocityAH228Gc.serializer);
        getdiffer.serializer(ColorKt.class, StylusHoverIconModifierElement.write);
        getdiffer.serializer(PositionCalculator.class, setPointerInteropFilterui.serializer);
        getdiffer.serializer(getLowestValueslo4al4.class, getPointerInputEventHandler.write);
        getdiffer.serializer(updatePathOutline.class, accessgetEmptyStackTraceElementsp.IconCompatParcelizer);
        getdiffer.serializer(zzav.class, accessgetEmptyPointerEventp.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessbootstrapIfNeeded.class, SuspendPointerInputElement.IconCompatParcelizer);
        getdiffer.serializer(getRegionfwf_client_release.class, setPointerInputHandler.RemoteActionCompatParcelizer);
        getdiffer.serializer(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.class, getPointerInputHandler.serializer);
        getdiffer.serializer(getCanUseCompositingLayerui_graphics.class, setPointerInputEventHandler.serializer);
        getdiffer.serializer(RxAwaitKt.class, accessgetBoundsSizep.read);
        getdiffer.serializer(screenToLocalMKHz9U.class, updateui.read);
        getdiffer.serializer(InAppMessageManagerBaseWhenMappings.class, accessget_deprecatedPointerInputHandlerp.write);
        getdiffer.serializer(OutlineRounded.class, accessgetCurrentEventp.IconCompatParcelizer);
        getdiffer.serializer(downloadFileToPathlambda1.class, accessgetPointerHandlersp.serializer);
        getdiffer.serializer(parseGroup.class, SuspendingPointerInputModifierNodeImpl.RemoteActionCompatParcelizer);
        getdiffer.serializer(getButton13EK5gGoQ.class, accessgetPointerHandlersLockp.write);
        getdiffer.serializer(delegate.class, ApproachIntrinsicMeasureScope.serializer);
        getdiffer.serializer(getMeasureBlock.class, addPointerInputChangeWithFixUv8p0NA.serializer);
        getdiffer.serializer(accessgetShouldUseDispatchDrawcp.class, VelocityTrackerKt.IconCompatParcelizer);
        getdiffer.serializer(zzlk.class, VelocityTracker1DWhenMappings.read);
        getdiffer.serializer(getFeatureKeys.class, PlatformVelocityTracker_androidKt.read);
        getdiffer.serializer(transformFromAncestorEL8BTi8.class, AlignmentLineKtLastBaseline1.read);
        getdiffer.serializer(AccessibilityIteratorsTextSegmentIterator.class, getLookaheadConstraintsmsEJaDk.RemoteActionCompatParcelizer);
        getdiffer.serializer(getCoordinator.class, merge.write);
        getdiffer.serializer(updateLayerParameters.class, get_I2yYro.read);
        getdiffer.serializer(getLocalLifecycleOwnerannotations.class, isMeasurementApproachInProgress.write);
        getdiffer.serializer(MenuItemOption.class, isMeasurementApproachInProgressozmzZPI.read);
        getdiffer.serializer(zzlq.class, approachMeasure3p2s80s.read);
        getdiffer.serializer(accessremoveNodesInRange.class, getLookaheadSizeYbymL2g.write);
        getdiffer.serializer(minApproachIntrinsicHeight.class, contains0FcD4WY.IconCompatParcelizer);
        getdiffer.serializer(getButtonThumbLeftEK5gGoQ.class, VelocityTracker.read);
        getdiffer.serializer(StrokeCap.class, accesssetPointerAwaiterp.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessgetTvInputcp.class, add.read);
        getdiffer.serializer(accessgetNestedCoroutineScope.class, setDmW0f2w.serializer);
        getdiffer.serializer(getMinimumTouchTargetSizeNHjbRc.class, getLastMoveEventTimeStampui.write);
        getdiffer.serializer(FwFClientevaluateFeature1.class, addPointerInputChangeLegacyUv8p0NA.write);
        getdiffer.serializer(getNumLockEK5gGoQ.class, resetTracking.write);
        getdiffer.serializer(displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.class, DefaultVelocityTracker.RemoteActionCompatParcelizer);
        getdiffer.serializer(io.sentry.config.RemoteActionCompatParcelizer.class, getCurrentPointerPositionAccumulatorF1C5BW0ui.serializer);
        getdiffer.serializer(BrazeInAppMessageManagerregisterInAppMessageManager52.class, calculateVelocity.write);
        getdiffer.serializer(processCancel.class, getPlatformVelocityTrackerui.write);
        getdiffer.serializer(localToScreenMKHz9U.class, getTouchBoundsExpansion.write);
        getdiffer.serializer(runAttachLifecycle.class, getRulers.serializer);
        getdiffer.serializer(getLetterSpacingXSAIIZE.class, getAlignmentLines.serializer);
        getdiffer.serializer(DecodeUtilsExKt.class, placeChildren.read);
        getdiffer.serializer(enableVerboseLogging.class, SuspendingPointerInputModifierNodeImplPointerEventHandlerCoroutine.serializer);
        getdiffer.serializer(getKEK5gGoQ.class, getTime.IconCompatParcelizer);
        getdiffer.serializer(isUnspecifiedFK8aYYs.class, DataPointAtTime.write);
        getdiffer.serializer(isPlacementApproachInProgress.class, SuspendingPointerInputModifierNodeImplPointerEventHandlerCoroutinewithTimeoutOrNull1.serializer);
        getdiffer.serializer(getFillBoundsannotations.class, addPointerInputChange.serializer);
        getdiffer.serializer(RxCompletableKt.class, calculateImpulseVelocity.write);
        getdiffer.serializer(throwIllegalArgumentExceptionForNullCheck.class, accesscalculateImpulseVelocity.IconCompatParcelizer);
        getdiffer.serializer(com.data.extensions.ThrowableExtensionsKt.class, SuspendingPointerInputFilterKt.serializer);
        getdiffer.serializer(RequestDisallowInterceptTouchEvent.class, SuspendingPointerInputModifierNode.IconCompatParcelizer);
        getdiffer.serializer(ApproachLayoutModifierNodeImpl.class, kineticEnergyToVelocity.serializer);
        getdiffer.serializer(getGraphicModalMaxHeightDpannotations.class, norm.write);
        getdiffer.serializer(SubcomposeLayoutKtSubcomposeLayout2.class, getVelocityTrackerAddPointsFix.serializer);
        getdiffer.serializer(getBeforehoxUOeE.class, dot.IconCompatParcelizer);
        getdiffer.serializer(getAutoMirror.class, SuspendingPointerInputFilterKtsamandroidx_compose_ui_input_pointer_PointerInputEventHandler0.write);
        getdiffer.serializer(accessgetBookmarkcp.class, SuspendingPointerInputFilter_jvmAndAndroidKt.read);
        getdiffer.serializer(updateOutline.class, isLookingAhead.write);
        getdiffer.serializer(LogoUtils.class, ApproachIntrinsicsMeasureScopelayout1.IconCompatParcelizer);
        getdiffer.serializer(sortDiagonals.class, C0182layout.RemoteActionCompatParcelizer);
        getdiffer.serializer(setPlacementApproachInProgress.class, ApproachLayoutElement.read);
        getdiffer.serializer(vectorResourcedefault.class, onPreRotaryScrollEvent.RemoteActionCompatParcelizer);
        getdiffer.serializer(getResumePausedNjRlDlw.class, getHorizontalScrollPixels.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessheadNode.class, RotaryInputModifierNode.IconCompatParcelizer);
        getdiffer.serializer(accessgetDepthComparatorp.class, getOnRotaryScrollEvent.IconCompatParcelizer);
        getdiffer.serializer(getAnyMovementConsumedimpl.class, getPointerInputHandlerannotations.serializer);
        getdiffer.serializer(accessgetTvZoomModecp.class, resetPointerInputHandler.read);
        getdiffer.serializer(maxApproachIntrinsicWidth.class, resizeStorage.serializer);
        getdiffer.serializer(getThumbsDownEK5gGoQ.class, PointerIdArray.read);
        getdiffer.serializer(getButton2EK5gGoQ.class, polyFitLeastSquaresdefault.IconCompatParcelizer);
        getdiffer.serializer(popEach.class, RotaryInputElement.serializer);
        getdiffer.serializer(integerArrayResource.class, setVelocityTrackerAddPointsFix.write);
        getdiffer.serializer(getAnyChangeConsumedimpl.class, pointerInput.read);
        getdiffer.serializer(ImageVectorBuilder.class, getPointerInputModifierNoParamErrorannotations.write);
    }

    @Override // o.accessgetBrightnessDowncp
    public Object apply(Object obj) {
        return this.RemoteActionCompatParcelizer != 2 ? (byte[]) obj : (byte[]) obj;
    }
}
