package androidx.room;

import android.location.Location;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BorderKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.core.CorruptionException;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.data.remote.api.model.HitDetails;
import com.google.firebase.sessions.SessionDataSerializer;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.navigator.R;
import com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.domain.usecase.ObservableUseCase;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.map.container.enabled.presentation.MapViewModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleCreate;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.TuplesKt;
import kotlin.math.MathKt;
import o.AnchoredDraggableState;
import o.AndroidComposeViewlocaleList2;
import o.AndroidIndirectPointerEvent;
import o.BlockInnerShadowElement;
import o.DefaultInAppMessageViewWrapperCompanion;
import o.GraphicsLayerScope;
import o.ImageKt;
import o.ListUtils_androidKt;
import o.SwitchKt;
import o.UncheckedColordefault;
import o.Worker;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetIntersectcp;
import o.awaitLongPressOrCancellationrnUCldI;
import o.clearUpdated;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.ddefault;
import o.dh;
import o.e7;
import o.fe;
import o.getCieXyz;
import o.getContentCaptureSessionuiannotations;
import o.getCreditCardSecurityCode;
import o.getOffsetBjo55l4;
import o.getOnContentCaptureSession;
import o.getRootInfoui;
import o.getTouchaOaMEAU;
import o.getViewportSizeYbymL2g;
import o.handleUrlOverridelambda1;
import o.height3ABfNKs;
import o.ihExternalSyntheticLambda9;
import o.lerpNullableFloatList;
import o.lineToRelative;
import o.measure0kLqBqw;
import o.notifySubtreeStateChangeIfNeeded;
import o.onMove;
import o.onPrimaryNavigationFragmentChanged;
import o.onTouch;
import o.onViewAttachedToWindowlambda0;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.quadToRelative;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.rotateZimpl;
import o.sendContentCaptureAppearEvents;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAutofillId;
import o.setSpread;
import o.setTranslationX;
import o.tintxETnrds;
import o.toolingGraphicsLayer;
import o.trackThirdPartySharingI;
import o.translateimpldefault;
import o.updateAdidI;
import o.updateHasCallbacks;
import o.waitForFirstLayout;
import okio.Okio;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ RoomDatabase$$ExternalSyntheticLambda2(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:214:0x0746  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        DrawStyle stroke;
        int iM956getArgb8888_sVssgQ;
        ColorFilter colorFilterM763tintxETnrds$default;
        boolean z;
        int i = 15;
        int i2 = 21;
        int i3 = 20;
        int i4 = 22;
        int i5 = 1;
        switch (this.write) {
            case 0:
                RoomDatabase roomDatabase = (RoomDatabase) this.serializer;
                lerpNullableFloatList lerpnullablefloatlist = (lerpNullableFloatList) obj;
                lerpnullablefloatlist.getClass();
                return roomDatabase.createOpenHelper(lerpnullablefloatlist);
            case 1:
                return new height3ABfNKs((Transition) this.serializer);
            case 2:
                getOffsetBjo55l4 getoffsetbjo55l4 = (getOffsetBjo55l4) this.serializer;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                if (cacheDrawScope.mo48toPx0680j_4(getoffsetbjo55l4.serializer) >= 0.0f && Size.m545getMinDimensionimpl(cacheDrawScope.m254getSizeNHjbRc()) > 0.0f) {
                    final float fMin = Math.min(Dp.m3678equalsimpl0(getoffsetbjo55l4.serializer, Dp.Companion.m3691getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo48toPx0680j_4(getoffsetbjo55l4.serializer)), (float) Math.ceil(Size.m545getMinDimensionimpl(cacheDrawScope.m254getSizeNHjbRc()) / 2.0f));
                    final float f = fMin / 2.0f;
                    final long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                    final long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)) - fMin)) << 32));
                    float f2 = fMin * 2.0f;
                    boolean z2 = f2 > Size.m545getMinDimensionimpl(cacheDrawScope.m254getSizeNHjbRc());
                    Outline outlineMo24createOutlinePq9zytI = getoffsetbjo55l4.read.mo24createOutlinePq9zytI(cacheDrawScope.m254getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                    if (outlineMo24createOutlinePq9zytI instanceof Outline.Generic) {
                        Brush brush = getoffsetbjo55l4.write;
                        Outline.Generic generic = (Outline.Generic) outlineMo24createOutlinePq9zytI;
                        if (z2) {
                            return cacheDrawScope.onDrawWithContent(new waitForFirstLayout(generic, 7, brush));
                        }
                        if (brush instanceof SolidColor) {
                            iM956getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ();
                            colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, Color.m721copywmQWz5c$default(((SolidColor) brush).m1081getValue0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
                        } else {
                            iM956getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
                            colorFilterM763tintxETnrds$default = null;
                        }
                        Rect bounds = generic.getPath().getBounds();
                        if (getoffsetbjo55l4.IconCompatParcelizer == null) {
                            getoffsetbjo55l4.IconCompatParcelizer = new measure0kLqBqw();
                        }
                        measure0kLqBqw measure0klqbqw = getoffsetbjo55l4.IconCompatParcelizer;
                        measure0klqbqw.getClass();
                        Path pathRemoteActionCompatParcelizer = measure0klqbqw.RemoteActionCompatParcelizer();
                        pathRemoteActionCompatParcelizer.reset();
                        Path.addRect$default(pathRemoteActionCompatParcelizer, bounds, null, 2, null);
                        pathRemoteActionCompatParcelizer.mo611opN5in7k0(pathRemoteActionCompatParcelizer, generic.getPath(), PathOperation.Companion.m1031getDifferenceb3I0S0c());
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) ((int) Math.ceil(bounds.getBottom() - bounds.getTop()))) & 4294967295L) | (((long) ((int) Math.ceil(bounds.getRight() - bounds.getLeft()))) << 32));
                        measure0kLqBqw measure0klqbqw2 = getoffsetbjo55l4.IconCompatParcelizer;
                        measure0klqbqw2.getClass();
                        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = measure0klqbqw2.serializer;
                        Canvas Canvas = measure0klqbqw2.IconCompatParcelizer;
                        ImageBitmapConfig imageBitmapConfigM948boximpl = imageBitmapM961ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m948boximpl(imageBitmapM961ImageBitmapx__hDU$default.mo586getConfig_sVssgQ()) : null;
                        int iM956getArgb8888_sVssgQ2 = ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
                        if (imageBitmapConfigM948boximpl != null && ImageBitmapConfig.m951equalsimpl0(imageBitmapConfigM948boximpl.m954unboximpl(), iM956getArgb8888_sVssgQ2)) {
                            z = true;
                        } else if (ImageBitmapConfig.m950equalsimpl(iM956getArgb8888_sVssgQ, imageBitmapM961ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m948boximpl(imageBitmapM961ImageBitmapx__hDU$default.mo586getConfig_sVssgQ()) : null)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (imageBitmapM961ImageBitmapx__hDU$default == null || Canvas == null || Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)) > imageBitmapM961ImageBitmapx__hDU$default.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() & 4294967295L)) > imageBitmapM961ImageBitmapx__hDU$default.getHeight() || !z) {
                            imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L), iM956getArgb8888_sVssgQ, false, null, 24, null);
                            measure0klqbqw2.serializer = imageBitmapM961ImageBitmapx__hDU$default;
                            Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
                            measure0klqbqw2.IconCompatParcelizer = Canvas;
                        }
                        CanvasDrawScope canvasDrawScope = measure0klqbqw2.read;
                        if (canvasDrawScope == null) {
                            canvasDrawScope = new CanvasDrawScope();
                            measure0klqbqw2.read = canvasDrawScope;
                        }
                        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(jM3839constructorimpl);
                        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
                        Density densityComponent1 = drawParams.component1();
                        ColorFilter colorFilter = colorFilterM763tintxETnrds$default;
                        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
                        Canvas canvasComponent3 = drawParams.component3();
                        long jM1221component4NHjbRc = drawParams.m1221component4NHjbRc();
                        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
                        drawParams2.setDensity(cacheDrawScope);
                        drawParams2.setLayoutDirection(layoutDirection);
                        drawParams2.setCanvas(Canvas);
                        drawParams2.m1224setSizeuvyYCjk(jM3856toSizeozmzZPI);
                        Canvas.save();
                        long jM748getBlack0d7_KjU = Color.Companion.m748getBlack0d7_KjU();
                        BlendMode.Companion companion = BlendMode.Companion;
                        DrawScope.m1298drawRectnJ9OG0$default(canvasDrawScope, jM748getBlack0d7_KjU, 0L, jM3856toSizeozmzZPI, 0.0f, null, null, companion.m635getClear0nO6VwU(), 58, null);
                        float f3 = -bounds.getLeft();
                        float f4 = -bounds.getTop();
                        canvasDrawScope.getDrawContext().getTransform().translate(f3, f4);
                        try {
                            DrawScope.m1293drawPathGBMwjPU$default(canvasDrawScope, generic.getPath(), brush, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope.mo1304getSizeNHjbRc() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo1304getSizeNHjbRc() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope.mo1304getSizeNHjbRc() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo1304getSizeNHjbRc() & 4294967295L));
                            long jMo1303getCenterF1C5BW0 = canvasDrawScope.mo1303getCenterF1C5BW0();
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            ImageBitmap imageBitmap = imageBitmapM961ImageBitmapx__hDU$default;
                            Canvas canvas = Canvas;
                            long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            try {
                                drawContext.getTransform().mo1232scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo1303getCenterF1C5BW0);
                                DrawScope.m1293drawPathGBMwjPU$default(canvasDrawScope, pathRemoteActionCompatParcelizer, brush, 0.0f, null, null, companion.m635getClear0nO6VwU(), 28, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                                canvasDrawScope.getDrawContext().getTransform().translate(-f3, -f4);
                                canvas.restore();
                                CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
                                drawParams3.setDensity(densityComponent1);
                                drawParams3.setLayoutDirection(layoutDirectionComponent2);
                                drawParams3.setCanvas(canvasComponent3);
                                drawParams3.m1224setSizeuvyYCjk(jM1221component4NHjbRc);
                                imageBitmap.prepareToDraw();
                                createinappmessageeventsubscriber.IconCompatParcelizer = imageBitmap;
                                return cacheDrawScope.onDrawWithContent(new MultiParagraph$$ExternalSyntheticLambda0(bounds, createinappmessageeventsubscriber, jM3839constructorimpl, colorFilter, 1));
                            } catch (Throwable th) {
                                drawContext.getCanvas().restore();
                                drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            canvasDrawScope.getDrawContext().getTransform().translate(-f3, -f4);
                            throw th2;
                        }
                    }
                    if (outlineMo24createOutlinePq9zytI instanceof Outline.Rounded) {
                        final Brush brush2 = getoffsetbjo55l4.write;
                        Outline.Rounded rounded = (Outline.Rounded) outlineMo24createOutlinePq9zytI;
                        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
                            final long jM527getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m527getTopLeftCornerRadiuskKHJgLs();
                            final Stroke stroke2 = new Stroke(fMin, 0.0f, 0, 0, null, 30, null);
                            final boolean z3 = z2;
                            return cacheDrawScope.onDrawWithContent(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.LazyListMeasuredItem
                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj2) throws Throwable {
                                    androidx.compose.ui.graphics.drawscope.DrawContext drawContext2;
                                    long j;
                                    androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj2;
                                    contentDrawScope.drawContent();
                                    boolean z4 = z3;
                                    androidx.compose.ui.graphics.Brush brush3 = brush2;
                                    long j2 = jM527getTopLeftCornerRadiuskKHJgLs;
                                    if (z4) {
                                        androidx.compose.ui.graphics.drawscope.DrawScope.m1299drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, 0L, 0L, j2, 0.0f, null, null, 0, 246, null);
                                    } else {
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
                                        float f5 = f;
                                        if (fIntBitsToFloat3 < f5) {
                                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32));
                                            float f6 = fMin;
                                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L));
                                            int iM710getDifferencertfAjoo = androidx.compose.ui.graphics.ClipOp.Companion.m710getDifferencertfAjoo();
                                            androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = contentDrawScope.getDrawContext();
                                            long jMo1225getSizeNHjbRc2 = drawContext3.mo1225getSizeNHjbRc();
                                            drawContext3.getCanvas().save();
                                            try {
                                                try {
                                                    drawContext3.getTransform().mo1228clipRectN_I0leg(f6, f6, fIntBitsToFloat4 - f6, fIntBitsToFloat5 - f6, iM710getDifferencertfAjoo);
                                                    try {
                                                        androidx.compose.ui.graphics.drawscope.DrawScope.m1299drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, 0L, 0L, j2, 0.0f, null, null, 0, 246, null);
                                                        c8$$ExternalSyntheticOutline0.m(drawContext3, jMo1225getSizeNHjbRc2);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        j = jMo1225getSizeNHjbRc2;
                                                        drawContext2 = drawContext3;
                                                        c8$$ExternalSyntheticOutline0.m(drawContext2, j);
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    drawContext2 = drawContext3;
                                                    j = jMo1225getSizeNHjbRc2;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                drawContext2 = drawContext3;
                                                j = jMo1225getSizeNHjbRc2;
                                            }
                                        } else {
                                            androidx.compose.ui.graphics.drawscope.DrawScope.m1299drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, jM469constructorimpl, jM537constructorimpl, androidx.compose.foundation.BorderKt.m21shrinkKibmq7A(f5, j2), 0.0f, stroke2, null, 0, 208, null);
                                        }
                                    }
                                    return createFromParcel.INSTANCE;
                                }
                            });
                        }
                        if (getoffsetbjo55l4.IconCompatParcelizer == null) {
                            getoffsetbjo55l4.IconCompatParcelizer = new measure0kLqBqw();
                        }
                        measure0kLqBqw measure0klqbqw3 = getoffsetbjo55l4.IconCompatParcelizer;
                        measure0klqbqw3.getClass();
                        Path pathRemoteActionCompatParcelizer2 = measure0klqbqw3.RemoteActionCompatParcelizer();
                        RoundRect roundRect = rounded.getRoundRect();
                        pathRemoteActionCompatParcelizer2.reset();
                        Path.addRoundRect$default(pathRemoteActionCompatParcelizer2, roundRect, null, 2, null);
                        if (!z2) {
                            Path Path = AndroidPath_androidKt.Path();
                            Path.addRoundRect$default(Path, new RoundRect(fMin, fMin, roundRect.getWidth() - fMin, roundRect.getHeight() - fMin, BorderKt.m21shrinkKibmq7A(fMin, roundRect.m527getTopLeftCornerRadiuskKHJgLs()), BorderKt.m21shrinkKibmq7A(fMin, roundRect.m528getTopRightCornerRadiuskKHJgLs()), BorderKt.m21shrinkKibmq7A(fMin, roundRect.m526getBottomRightCornerRadiuskKHJgLs()), BorderKt.m21shrinkKibmq7A(fMin, roundRect.m525getBottomLeftCornerRadiuskKHJgLs()), null), null, 2, null);
                            pathRemoteActionCompatParcelizer2.mo611opN5in7k0(pathRemoteActionCompatParcelizer2, Path, PathOperation.Companion.m1031getDifferenceb3I0S0c());
                        }
                        return cacheDrawScope.onDrawWithContent(new Recomposer$$ExternalSyntheticLambda4(pathRemoteActionCompatParcelizer2, 5, brush2));
                    }
                    if (outlineMo24createOutlinePq9zytI instanceof Outline.Rectangle) {
                        final Brush brush3 = getoffsetbjo55l4.write;
                        final long jM493getZeroF1C5BW0 = z2 ? Offset.Companion.m493getZeroF1C5BW0() : jM469constructorimpl;
                        if (z2) {
                            jM537constructorimpl = cacheDrawScope.m254getSizeNHjbRc();
                        }
                        final long j = jM537constructorimpl;
                        if (z2) {
                            stroke = Fill.INSTANCE;
                        } else {
                            stroke = new Stroke(fMin, 0.0f, 0, 0, null, 30, null);
                        }
                        final DrawStyle drawStyle = stroke;
                        return cacheDrawScope.onDrawWithContent(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.LazyListMeasureResult
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj2) {
                                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj2;
                                contentDrawScope.drawContent();
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1297drawRectAsUm42w$default(contentDrawScope, brush3, jM493getZeroF1C5BW0, j, 0.0f, drawStyle, null, 0, 104, null);
                                return createFromParcel.INSTANCE;
                            }
                        });
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                return cacheDrawScope.onDrawWithContent(new getViewportSizeYbymL2g(0));
            case 3:
                SwitchKt switchKt = (SwitchKt) this.serializer;
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", switchKt);
                return createFromParcel.INSTANCE;
            case 4:
                ArrayList arrayList = (ArrayList) this.serializer;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) arrayList.get(i6), 0, 0, 0.0f, 4, null);
                }
                return createFromParcel.INSTANCE;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) this.serializer;
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                ((setAutofillId) traversableNode).RemoteActionCompatParcelizer(semanticsPropertyReceiver);
                return Boolean.FALSE;
            case 6:
                ((getCreditCardSecurityCode) this.serializer).write(obj);
                return createFromParcel.INSTANCE;
            case 7:
                sendContentCaptureAppearEvents sendcontentcaptureappearevents = (sendContentCaptureAppearEvents) this.serializer;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationExceptionRemoteActionCompatParcelizer = DefaultInAppMessageViewWrapperCompanion.RemoteActionCompatParcelizer("Recomposer effect job completed", th3);
                synchronized (sendcontentcaptureappearevents.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = sendcontentcaptureappearevents.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        sendcontentcaptureappearevents.write.IconCompatParcelizer(notifySubtreeStateChangeIfNeeded.ShuttingDown);
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(cancellationExceptionRemoteActionCompatParcelizer);
                        sendcontentcaptureappearevents.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = null;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.IconCompatParcelizer(new Navigator$$ExternalSyntheticLambda1(sendcontentcaptureappearevents, 12, th3));
                    } else {
                        sendcontentcaptureappearevents.MediaMetadataCompat = cancellationExceptionRemoteActionCompatParcelizer;
                        sendcontentcaptureappearevents.write.IconCompatParcelizer(notifySubtreeStateChangeIfNeeded.ShutDown);
                    }
                }
                return createFromParcel.INSTANCE;
            case 8:
                getOnContentCaptureSession getoncontentcapturesession = (getOnContentCaptureSession) this.serializer;
                r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = getoncontentcapturesession.RemoteActionCompatParcelizer;
                r8lambdahgodiqgpbyai8pyonaxx8pbqx4.getClass();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getoncontentcapturesession.RemoteActionCompatParcelizer, r8lambdahgodiqgpbyai8pyonaxx8pbqx4}, getCieXyz.write())).booleanValue()) {
                    getContentCaptureSessionuiannotations.write("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                relocationOffsetfbGrOKE relocationoffsetfbgroke = getoncontentcapturesession.MediaMetadataCompat;
                Object obj2 = getoncontentcapturesession.MediaBrowserCompatMediaItem;
                if (relocationoffsetfbgroke != null) {
                    if (obj2 != null) {
                        getContentCaptureSessionuiannotations.write("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    relocationoffsetfbgroke.serializer(obj);
                } else if (obj2 == null) {
                    getoncontentcapturesession.MediaBrowserCompatMediaItem = obj;
                } else {
                    relocationOffsetfbGrOKE relocationoffsetfbgroke2 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                    relocationOffsetfbGrOKE relocationoffsetfbgroke3 = new relocationOffsetfbGrOKE();
                    relocationoffsetfbgroke3.serializer(obj2);
                    relocationoffsetfbgroke3.serializer(obj);
                    getoncontentcapturesession.MediaMetadataCompat = relocationoffsetfbgroke3;
                    getoncontentcapturesession.MediaBrowserCompatMediaItem = null;
                }
                return createFromParcel.INSTANCE;
            case 9:
                setSpread setspread = (setSpread) this.serializer;
                synchronized (setspread.RatingCompat) {
                    BlockInnerShadowElement blockInnerShadowElement = setspread.write;
                    blockInnerShadowElement.getClass();
                    Object obj3 = blockInnerShadowElement.serializer;
                    obj3.getClass();
                    int i7 = blockInnerShadowElement.RemoteActionCompatParcelizer;
                    AnchoredDraggableState anchoredDraggableState = blockInnerShadowElement.IconCompatParcelizer;
                    if (anchoredDraggableState == null) {
                        anchoredDraggableState = new AnchoredDraggableState();
                        blockInnerShadowElement.IconCompatParcelizer = anchoredDraggableState;
                        blockInnerShadowElement.PlaybackStateCompat.write(obj3, anchoredDraggableState);
                    }
                    blockInnerShadowElement.IconCompatParcelizer(obj, i7, obj3, anchoredDraggableState);
                }
                return createFromParcel.INSTANCE;
            case 10:
                return FontFamilyResolverImpl.createDefaultTypeface$lambda$0((FontFamilyResolverImpl) this.serializer, (TypefaceRequest) obj);
            case 11:
                translateimpldefault translateimpldefaultVar = (translateimpldefault) this.serializer;
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, "rider_state_polling_work");
                    ImageKt imageKt = new ImageKt(0);
                    ImageKt imageKt2 = new ImageKt(0);
                    while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        String str = uncheckedColordefaultRemoteActionCompatParcelizer.read(0);
                        if (!imageKt.containsKey(str)) {
                            imageKt.put(str, new ArrayList());
                        }
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(0);
                        if (!imageKt2.containsKey(str2)) {
                            imageKt2.put(str2, new ArrayList());
                        }
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer.write();
                    translateimpldefaultVar.write(tintxetnrds, imageKt);
                    translateimpldefaultVar.read(tintxetnrds, imageKt2);
                    ArrayList arrayList2 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer.read(0);
                        setTranslationX settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i5));
                        byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer.write(2);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(3);
                        int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(4);
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(14);
                        long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i);
                        long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(16);
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(17));
                        long jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(18);
                        long jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(19);
                        int iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i3);
                        long jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i2);
                        int iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(22);
                        toolingGraphicsLayer toolinggraphicslayer = new toolingGraphicsLayer(Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer.write(6)), Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(5)), ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(7)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(8)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(9)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(10)) != 0, uncheckedColordefaultRemoteActionCompatParcelizer.serializer(11), uncheckedColordefaultRemoteActionCompatParcelizer.serializer(12), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer.write(13)));
                        Object obj4 = onMove.read(imageKt, uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
                        obj4.getClass();
                        List list = (List) obj4;
                        Object obj5 = onMove.read(imageKt2, uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
                        obj5.getClass();
                        arrayList2.add(new rotateZimpl(str3, settranslationxWrite, accessgetambientshadowcolor0d7_kjujd2, jSerializer, jSerializer2, jSerializer3, toolinggraphicslayer, iSerializer, graphicsLayerScopeIconCompatParcelizer, jSerializer4, jSerializer5, iSerializer3, iSerializer2, jSerializer6, iSerializer4, list, (List) obj5));
                        i = 15;
                        i5 = 1;
                        i2 = 21;
                        i3 = 20;
                        break;
                    }
                    return arrayList2;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 12:
                lineToRelative linetorelative = (lineToRelative) this.serializer;
                ((tintxETnrds) obj).getClass();
                RoomDatabase roomDatabase2 = linetorelative.read;
                return new quadToRelative(((Number) TuplesKt.write(roomDatabase2, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(i4))).longValue(), ((Number) TuplesKt.write(roomDatabase2, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(i3))).intValue(), (List) TuplesKt.write(roomDatabase2, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(i2)));
            case 13:
                PerseusParamsConfig perseusParamsConfig = (PerseusParamsConfig) this.serializer;
                HitDetails hitDetails = (HitDetails) obj;
                hitDetails.getClass();
                Map<String, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> routing = perseusParamsConfig.getRouting();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> entry : routing.entrySet()) {
                    if (((Boolean) entry.getValue().invoke(hitDetails)).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList3.add(new onViewAttachedToWindowlambda0(hitDetails.getHitMatchId$perseus_release(), ((Map.Entry) it.next()).getKey()));
                }
                return arrayList3;
            case 14:
                return Long.valueOf(((AndroidIndirectPointerEvent) obj) == AndroidIndirectPointerEvent.Start ? 0L : ((FirebaseRemoteConfigImpl) ((getTouchaOaMEAU) this.serializer).serializer).IconCompatParcelizer.write("debounce_interval_for_location_lifecycle_events"));
            case 15:
                SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.serializer;
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                SentryLogcatAdapter.write("FirebaseSessions", "CorruptionException in session data DataStore", corruptionException);
                return new AndroidComposeViewlocaleList2(sessionDataSerializer.read.RemoteActionCompatParcelizer(null), null, null);
            case 16:
                clearUpdated clearupdated = (clearUpdated) this.serializer;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                fragmentActivity.getClass();
                ((getRootInfoui) clearupdated.write.RemoteActionCompatParcelizer).serializer("nest_time_to_interactive");
                n0.write().RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.home.nest.NestFragment");
                return createFromParcel.INSTANCE;
            case 17:
                ChatRegisterUseCase chatRegisterUseCase = (ChatRegisterUseCase) this.serializer;
                List list2 = (List) obj;
                list2.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("[Legacy] Customer Chat observe delivery changes for register user.", new Object[0]);
                if (((trackThirdPartySharingI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(611636138, R.serializer(), R.serializer(), -611636136, R.serializer(), R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) chatRegisterUseCase.write})) != trackThirdPartySharingI.NOT_AVAILABLE) {
                    return new SingleCreate(new JankStatsFrameTracker$$ExternalSyntheticLambda3(list2, i, chatRegisterUseCase));
                }
                return Single.serializer(Boolean.FALSE);
            case 18:
                androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2 = (androidx.compose.foundation.gestures.AnchoredDraggableState) this.serializer;
                ((Density) obj).getClass();
                return IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) MathKt.write(anchoredDraggableState2.write())) & 4294967295L));
            case 19:
                HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1 = (HomeFragment$initPopupLayer$1) this.serializer;
                ListUtils_androidKt listUtils_androidKt = (ListUtils_androidKt) obj;
                listUtils_androidKt.getClass();
                if (listUtils_androidKt instanceof ListUtils_androidKt) {
                    homeFragment$initPopupLayer$1.invoke(listUtils_androidKt.IconCompatParcelizer(), ddefault.serializer, 0);
                    return createFromParcel.INSTANCE;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 20:
                StateProviderImpl stateProviderImpl = (StateProviderImpl) this.serializer;
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                ontouch.serializer = true;
                ontouch.RatingCompat = false;
                ontouch.MediaMetadataCompat = true;
                ontouch.IconCompatParcelizer = true;
                ontouch.read = true;
                Object objWrite = stateProviderImpl.IconCompatParcelizer.write();
                objWrite.getClass();
                ontouch.PlaybackStateCompat = (prepareInAppMessageWithZippedAssetHtml) objWrite;
                return createFromParcel.INSTANCE;
            case 21:
                ((ObservableUseCase) this.serializer).MediaSessionCompatQueueItem.onNext(obj);
                return createFromParcel.INSTANCE;
            case 22:
                HomeFragment homeFragment = (HomeFragment) this.serializer;
                onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) obj;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                onprimarynavigationfragmentchanged.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = (HomeBottomSheetUiModelImpl) homeFragment.RemoteActionCompatParcelizer().MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
                homeBottomSheetUiModelImpl.getClass();
                homeBottomSheetUiModelImpl.RatingCompat.IconCompatParcelizer(onprimarynavigationfragmentchanged);
                homeBottomSheetUiModelImpl.MediaSessionCompatQueueItem.IconCompatParcelizer.write(onprimarynavigationfragmentchanged);
                if (homeBottomSheetUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer() && onprimarynavigationfragmentchanged != onPrimaryNavigationFragmentChanged.EXPANDED) {
                    homeBottomSheetUiModelImpl.MediaMetadataCompat.write(createfromparcel);
                }
                return createfromparcel;
            case 23:
                ((RoomDatabase$$ExternalSyntheticLambda2) this.serializer).invoke((Location) obj);
                return createFromParcel.INSTANCE;
            case 24:
                Worker worker = (Worker) this.serializer;
                ((Boolean) obj).getClass();
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) worker.write;
                firebaseRemoteConfigImpl.getClass();
                return Long.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS) ? 0L : firebaseRemoteConfigImpl.IconCompatParcelizer.write("debounce_interval_for_location_lifecycle_events"));
            case 25:
                return Boolean.valueOf(((Set) this.serializer).contains(((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) obj).serializer));
            case 26:
                updateHasCallbacks updatehascallbacks = (updateHasCallbacks) obj;
                dh dhVar = ((MapViewModel) this.serializer).write;
                updatehascallbacks.getClass();
                dhVar.getClass();
                int i8 = e7.read[updatehascallbacks.ordinal()];
                if (i8 == 1 || i8 == 2) {
                    Iterable iterable = (Iterable) dhVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : iterable) {
                        int i9 = e7.IconCompatParcelizer[((fe) obj6).read().ordinal()];
                        if (i9 == 1 || i9 == 2) {
                            arrayList4.add(obj6);
                        } else if (i9 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                    }
                    dhVar.read(arrayList4);
                } else if (i8 == 3) {
                    dhVar.IconCompatParcelizer();
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                return createFromParcel.INSTANCE;
            case 27:
                ihExternalSyntheticLambda9 ihexternalsyntheticlambda9 = (ihExternalSyntheticLambda9) this.serializer;
                LocationComponentSettings.Builder builder = (LocationComponentSettings.Builder) obj;
                builder.getClass();
                builder.enabled = true;
                builder.pulsingEnabled = false;
                builder.puckBearingEnabled = true;
                builder.locationPuck = ihexternalsyntheticlambda9.serializer.RemoteActionCompatParcelizer();
                return createFromParcel.INSTANCE;
            case 28:
                CombinedScopeView combinedScopeView = (CombinedScopeView) this.serializer;
                Location location = (Location) obj;
                if (location != null) {
                    combinedScopeView.notifyLocationUpdates(location);
                }
                return createFromParcel.INSTANCE;
            default:
                r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = (r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) this.serializer;
                onTouch ontouch2 = (onTouch) obj;
                ontouch2.getClass();
                ontouch2.MediaDescriptionCompat = true;
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                ontouch2.PlaybackStateCompat = (prepareInAppMessageWithZippedAssetHtml) objWrite2;
                return createFromParcel.INSTANCE;
        }
    }
}
