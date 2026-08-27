package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DragAndDropTargetModifierNode;
import o.accessgetReusableRectp;
import o.accessthenjd;
import o.deletePackageQueue;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.then;
import o.validateAndStorePushIdlambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidSelectionHandles_androidKt {
    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = zzsd.write;
        Canvas Canvas = zzsd.IconCompatParcelizer;
        CanvasDrawScope canvasDrawScope = zzsd.serializer;
        if (imageBitmapM961ImageBitmapx__hDU$default == null || Canvas == null || iCeil > imageBitmapM961ImageBitmapx__hDU$default.getWidth() || iCeil > imageBitmapM961ImageBitmapx__hDU$default.getHeight()) {
            imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
            zzsd.write = imageBitmapM961ImageBitmapx__hDU$default;
            Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
            zzsd.IconCompatParcelizer = Canvas;
        }
        ImageBitmap imageBitmap = imageBitmapM961ImageBitmapx__hDU$default;
        Canvas canvas = Canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            zzsd.serializer = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(imageBitmap.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(imageBitmap.getWidth())) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM1221component4NHjbRc = drawParams.m1221component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1224setSizeuvyYCjk(jM537constructorimpl);
        canvas.save();
        DrawScope.m1298drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m748getBlack0d7_KjU(), 0L, canvasDrawScope2.mo1304getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m635getClear0nO6VwU(), 58, null);
        DrawScope.m1298drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m493getZeroF1C5BW0(), Size.m537constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m1285drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)), 0.0f, null, null, 0, 120, null);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m1224setSizeuvyYCjk(jM1221component4NHjbRc);
        return imageBitmap;
    }

    public static final void SelectionHandleIcon(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2111672474);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = {getpostalcode, ComposedModifierKt.composed$default(SizeKt.m84sizeVpY3zN4(modifier, SelectionHandlesKt.RemoteActionCompatParcelizer, SelectionHandlesKt.IconCompatParcelizer), null, new validateAndStorePushIdlambda0(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), 1, null)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new deletePackageQueue(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, i, 1);
        }
    }

    public static final void HandlePopup(accessthenjd accessthenjdVar, Alignment alignment, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1090171650);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(accessthenjdVar);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessthenjdVar);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(alignment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        boolean z = false;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && getpostalcode.read(accessthenjdVar))) {
                z = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new then(alignment, accessthenjdVar);
                getpostalcode.write(objComponentActivity);
            }
            AndroidPopup_androidKt.Popup((then) objComponentActivity, null, new PopupProperties(false, false, false, (SecureFlagPolicy) null, true, false, 15, (DefaultConstructorMarker) null), dragAndDropTargetModifierNode, getpostalcode, ((i2 << 3) & 7168) | 384, 2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 7, accessthenjdVar, alignment, dragAndDropTargetModifierNode);
        }
    }

    /* JADX INFO: renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    public static final void m109SelectionHandlewLIcFTc(final accessthenjd accessthenjdVar, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final long j2;
        long jM3780getUnspecifiedMYxV2XQ;
        int i3;
        final boolean z3;
        Alignment topLeft;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-466280168);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(accessthenjdVar);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessthenjdVar);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(resolvedTextDirection.ordinal()) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.write(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        if (getpostalcode.write(i2 & 1, (533651 & i2) != 533650)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i3 = i2 & (-57345);
                jM3780getUnspecifiedMYxV2XQ = j;
            } else {
                jM3780getUnspecifiedMYxV2XQ = DpSize.Companion.m3780getUnspecifiedMYxV2XQ();
                i3 = i2 & (-57345);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (z) {
                float f2 = SelectionHandlesKt.RemoteActionCompatParcelizer;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                float f3 = SelectionHandlesKt.RemoteActionCompatParcelizer;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            AbsoluteAlignment absoluteAlignment = AbsoluteAlignment.INSTANCE;
            if (z3) {
                topLeft = absoluteAlignment.getTopRight();
            } else {
                topLeft = absoluteAlignment.getTopLeft();
            }
            int i4 = i3 & 14;
            boolean z4 = i4 == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(accessthenjdVar));
            boolean z5 = (i3 & 112) == 32;
            boolean zWrite = getpostalcode.write(z3);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z5 | z4 | zWrite) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeys
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
                        long jSerializer = accessthenjdVar.serializer();
                        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.read, new getAggregateChildKindSetui(z ? AlignmentCompanion.SelectionStart : AlignmentCompanion.SelectionEnd, jSerializer, z3 ? getCoroutineScope.Left : getCoroutineScope.Right, (androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & jSerializer) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats));
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            final Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null);
            final ViewConfiguration viewConfiguration = (ViewConfiguration) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalViewConfiguration());
            Alignment alignment = topLeft;
            final long j3 = jM3780getUnspecifiedMYxV2XQ;
            HandlePopup(accessthenjdVar, alignment, ExtrasKt.write(1365123137, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.derivedMediaQuerylambda0
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        hideTranslatedText hidetranslatedtextWrite = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration().write(viewConfiguration);
                        final long j4 = j3;
                        final boolean z6 = z3;
                        final androidx.compose.ui.Modifier modifier2 = modifierSemantics$default;
                        final accessthenjd accessthenjdVar2 = accessthenjdVar;
                        AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, coil3.ExtrasKt.write(1260045569, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.mediaQuery
                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public final Object invoke(Object obj3, Object obj4) {
                                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j5 = j4;
                                    boolean z7 = z6;
                                    androidx.compose.ui.Modifier modifier3 = modifier2;
                                    final accessthenjd accessthenjdVar3 = accessthenjdVar2;
                                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                                    if (j5 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                                        getpostalcode3.serializer(3458246);
                                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = z7 ? FloatingActionButtonDefaults.read : FloatingActionButtonDefaults.write;
                                        androidx.compose.ui.Modifier modifierM80requiredSizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m80requiredSizeInqDBjuR0$default(modifier3, androidx.compose.ui.unit.DpSize.m3771getWidthD9Ej5fM(j5), androidx.compose.ui.unit.DpSize.m3769getHeightD9Ej5fM(j5), 0.0f, 0.0f, 12);
                                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(horizontal, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode3, 0);
                                        int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierM80requiredSizeInqDBjuR0$default);
                                        androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.Companion;
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                                        if (getpostalcode3.read == null) {
                                            SentryUUID.write();
                                            throw null;
                                        }
                                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                        if (getpostalcode3.ComponentActivity) {
                                            getpostalcode3.serializer(constructor);
                                        } else {
                                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                        }
                                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                                        boolean zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(accessthenjdVar3);
                                        Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                                        if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                                            objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.derivedMediaQuery
                                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                                public final Object invoke() {
                                                    int i7 = i6;
                                                    accessthenjd accessthenjdVar4 = accessthenjdVar3;
                                                    if (i7 != 0) {
                                                        return Boolean.valueOf((accessthenjdVar4.serializer() & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);
                                                    }
                                                    return Boolean.valueOf((accessthenjdVar4.serializer() & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);
                                                }
                                            };
                                            getpostalcode3.write(objComponentActivity2);
                                        }
                                        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon(6, getpostalcode3, companion2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, z7);
                                        getpostalcode3.IconCompatParcelizer(true);
                                        getpostalcode3.IconCompatParcelizer(false);
                                    } else {
                                        getpostalcode3.serializer(4389176);
                                        boolean zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(accessthenjdVar3);
                                        Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                                        if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                                            objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.derivedMediaQuery
                                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                                public final Object invoke() {
                                                    int i7 = i5;
                                                    accessthenjd accessthenjdVar4 = accessthenjdVar3;
                                                    if (i7 != 0) {
                                                        return Boolean.valueOf((accessthenjdVar4.serializer() & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);
                                                    }
                                                    return Boolean.valueOf((accessthenjdVar4.serializer() & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);
                                                }
                                            };
                                            getpostalcode3.write(objComponentActivity3);
                                        }
                                        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon(0, getpostalcode3, modifier3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, z7);
                                        getpostalcode3.IconCompatParcelizer(false);
                                    }
                                } else {
                                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }, getpostalcode2), getpostalcode2, 56);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, i4 | 384);
            j2 = jM3780getUnspecifiedMYxV2XQ;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j2 = j;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getLocalUiMediaScopeannotations
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m109SelectionHandlewLIcFTc(accessthenjdVar, z, resolvedTextDirection, z2, j2, f, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
