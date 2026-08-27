package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AwaitFirstLayoutModifier;
import o.Transition3;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;
import o.setLegacyRequestDisallowInterceptTouchEventEnabled;
import o.setProgressBackgroundColorSchemeColor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraOverlayKt {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    public static final void read(final float f, final setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        ImageVector imageVectorVectorResource;
        VectorPainter vectorPainterRememberVectorPainter;
        long supportBackgroundTintList;
        int i3;
        int i4;
        int i5 = 2 % 2;
        setlegacyrequestdisallowintercepttoucheventenabled.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(629652368);
        if ((i & 6) == 0) {
            int i6 = write + 81;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i2 = (getpostalcode2.serializer(f) ? 4 : 2) | i;
            } else {
                getpostalcode2.serializer(f);
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(setlegacyrequestdisallowintercepttoucheventenabled.ordinal())) {
                int i7 = serializer + 123;
                write = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 7 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i8 = serializer + 63;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                if (getpostalcode2.read(modifier)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else {
                int i9 = 13 / 0;
                if (getpostalcode2.read(modifier)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, !((i2 & 147) == 146))) {
            final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.arc_stroke_width, getpostalcode2, 0);
            final float f2 = Dimensions.read;
            final float f3 = Dimensions.getNestedScrollAxes;
            Integer indicatorImage = setlegacyrequestdisallowintercepttoucheventenabled.getIndicatorImage();
            if (indicatorImage == null) {
                getpostalcode2.serializer(1851863974);
                getpostalcode2.IconCompatParcelizer(false);
                imageVectorVectorResource = null;
            } else {
                getpostalcode2.serializer(1851863975);
                imageVectorVectorResource = VectorResources_androidKt.vectorResource(ImageVector.Companion, indicatorImage.intValue(), getpostalcode2, 6);
                getpostalcode2.IconCompatParcelizer(false);
            }
            if (imageVectorVectorResource == null) {
                getpostalcode2.serializer(1851962120);
                vectorPainterRememberVectorPainter = null;
            } else {
                getpostalcode2.serializer(1851962121);
                vectorPainterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(imageVectorVectorResource, getpostalcode2, 0);
            }
            getpostalcode2.IconCompatParcelizer(false);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            final long jIconCompatParcelizer = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer();
            final long overflowReserved = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
            switch (setProgressBackgroundColorSchemeColor.serializer[setlegacyrequestdisallowintercepttoucheventenabled.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    getpostalcode2.serializer(-711589785);
                    supportBackgroundTintList = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList();
                    getpostalcode2.IconCompatParcelizer(false);
                    break;
                case 4:
                case 5:
                case 6:
                    getpostalcode2.serializer(-711587323);
                    supportBackgroundTintList = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).read();
                    getpostalcode2.IconCompatParcelizer(false);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    getpostalcode2.serializer(-711584731);
                    supportBackgroundTintList = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                    getpostalcode2.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -711592351, false);
            }
            final VectorPainter vectorPainter = vectorPainterRememberVectorPainter;
            final long j = supportBackgroundTintList;
            Modifier modifierThen = ClipKt.clipToBounds(modifier).then(SizeKt.read);
            boolean z = (i2 & 14) == 4;
            boolean zSerializer = getpostalcode2.serializer(f2);
            boolean zSerializer2 = getpostalcode2.serializer(jIconCompatParcelizer);
            boolean zSerializer3 = getpostalcode2.serializer(overflowReserved);
            boolean z2 = (i2 & 112) == 32;
            boolean zSerializer4 = getpostalcode2.serializer(f3);
            boolean zSerializer5 = getpostalcode2.serializer(fDimensionResource);
            boolean zSerializer6 = getpostalcode2.serializer(j);
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(vectorPainter);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (((z | zSerializer | zSerializer2 | zSerializer3 | z2 | zSerializer4 | zSerializer5 | zSerializer6) || zIconCompatParcelizer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                getpostalcode = getpostalcode2;
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.Transition1
                    private static int MediaSessionCompatQueueItem = 0;
                    private static int MediaSessionCompatToken = 1;

                    /* JADX WARN: Code duplicated, block: B:17:0x017d A[DONT_INVERT, PHI: r3 r4
  0x017d: PHI (r3v27 float) = (r3v26 float), (r3v35 float) binds: [B:16:0x017b, B:13:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r4v11 int) = (r4v10 int), (r4v31 int) binds: [B:16:0x017b, B:13:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:18:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:26:0x019a  */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) throws Throwable {
                        long j2;
                        androidx.compose.ui.graphics.drawscope.DrawContext drawContext;
                        float fIntBitsToFloat;
                        int i10;
                        float fIntBitsToFloat2;
                        float fIntBitsToFloat3;
                        float fIntBitsToFloat4;
                        int i11 = 2 % 2;
                        long j3 = jIconCompatParcelizer;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        drawScope.getClass();
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L));
                        float f4 = f;
                        float fMo48toPx0680j_4 = (fIntBitsToFloat5 - (drawScope.mo48toPx0680j_4(f4) * 2.0f)) / 2.0f;
                        long jM471copydBAh8RU$default = androidx.compose.ui.geometry.Offset.m471copydBAh8RU$default(drawScope.mo1303getCenterF1C5BW0(), 0.0f, drawScope.mo48toPx0680j_4(f4) + fMo48toPx0680j_4, 1, null);
                        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                        androidx.compose.ui.graphics.Path.addOval$default(Path, androidx.compose.ui.geometry.RectKt.m516Rect3MmeM6k(jM471copydBAh8RU$default, fMo48toPx0680j_4), null, 2, null);
                        int iM710getDifferencertfAjoo = androidx.compose.ui.graphics.ClipOp.Companion.m710getDifferencertfAjoo();
                        androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
                        long jMo1225getSizeNHjbRc = drawContext2.mo1225getSizeNHjbRc();
                        drawContext2.getCanvas().save();
                        try {
                            drawContext2.getTransform().mo1227clipPathmtrdDE(Path, iM710getDifferencertfAjoo);
                            try {
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1298drawRectnJ9OG0$default(drawScope, j3, 0L, drawScope.mo1304getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
                                drawContext2.getCanvas().restore();
                                drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, overflowReserved, fMo48toPx0680j_4, jM471copydBAh8RU$default, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(drawScope.mo48toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                                setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled2 = setLegacyRequestDisallowInterceptTouchEventEnabled.None;
                                setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled3 = setlegacyrequestdisallowintercepttoucheventenabled;
                                if (setlegacyrequestdisallowintercepttoucheventenabled3 != setlegacyrequestdisallowintercepttoucheventenabled2) {
                                    float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(f3) + fMo48toPx0680j_4;
                                    long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
                                    float fMo48toPx0680j_6 = drawScope.mo48toPx0680j_4(fDimensionResource);
                                    setlegacyrequestdisallowintercepttoucheventenabled3.getClass();
                                    float startAngle = setlegacyrequestdisallowintercepttoucheventenabled3.getStartAngle();
                                    float angleSweep = setlegacyrequestdisallowintercepttoucheventenabled3.getAngleSweep();
                                    float f5 = fMo48toPx0680j_5 * 2.0f;
                                    long jM537constructorimpl = androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
                                    long jM481minusMKHz9U = androidx.compose.ui.geometry.Offset.m481minusMKHz9U(jMo1303getCenterF1C5BW0, androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_5)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_5)) & 4294967295L)));
                                    androidx.compose.ui.graphics.Path Path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                                    Path2.addArc(androidx.compose.ui.geometry.RectKt.m517Recttz77jQw(jM481minusMKHz9U, jM537constructorimpl), startAngle, angleSweep);
                                    androidx.compose.ui.graphics.drawscope.DrawScope.m1294drawPathLG529CI$default(drawScope, Path2, j, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(fMo48toPx0680j_6, 0.0f, androidx.compose.ui.graphics.StrokeCap.Companion.m1100getRoundKaPHkGw(), 0, null, 26, null), null, androidx.compose.ui.graphics.drawscope.DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU(), 20, null);
                                    androidx.compose.ui.graphics.vector.VectorPainter vectorPainter2 = vectorPainter;
                                    if (vectorPainter2 != null) {
                                        int i12 = MediaSessionCompatToken + 93;
                                        MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        try {
                                            if (i12 % 2 != 0) {
                                                fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() - 4294967295L));
                                                i10 = onAnimationRepeat.write[setlegacyrequestdisallowintercepttoucheventenabled3.ordinal()];
                                                if (i10 != 0) {
                                                    if (i10 != 2) {
                                                        int i13 = MediaSessionCompatToken;
                                                        int i14 = i13 + 99;
                                                        MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        int i15 = i14 % 2;
                                                        if (i10 != 3 || i10 == 4) {
                                                            fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - f5) / 2.0f;
                                                        } else {
                                                            int i16 = i13 + 117;
                                                            MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                            if (i16 % 2 != 0) {
                                                                int i17 = 3 % 4;
                                                            }
                                                            fIntBitsToFloat2 = 0.0f;
                                                        }
                                                    }
                                                }
                                                long jMo1424getIntrinsicSizeNHjbRc = vectorPainter2.mo1424getIntrinsicSizeNHjbRc();
                                                fIntBitsToFloat3 = fIntBitsToFloat2 - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32)) / 2.0f);
                                                fIntBitsToFloat4 = (fIntBitsToFloat / 2.0f) - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L)) / 2.0f);
                                                drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat3, fIntBitsToFloat4);
                                                androidx.compose.ui.graphics.painter.Painter.m1429drawx_KDEd0$default(vectorPainter2, drawScope, jMo1424getIntrinsicSizeNHjbRc, 0.0f, null, 6, null);
                                                drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                            } else {
                                                fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L));
                                                i10 = onAnimationRepeat.write[setlegacyrequestdisallowintercepttoucheventenabled3.ordinal()];
                                                if (i10 != 1) {
                                                    if (i10 != 2) {
                                                        int i18 = MediaSessionCompatToken;
                                                        int i19 = i18 + 99;
                                                        MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        int i110 = i19 % 2;
                                                        if (i10 != 3) {
                                                            fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - f5) / 2.0f;
                                                        } else {
                                                            fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - f5) / 2.0f;
                                                        }
                                                    }
                                                }
                                                long jMo1424getIntrinsicSizeNHjbRc2 = vectorPainter2.mo1424getIntrinsicSizeNHjbRc();
                                                fIntBitsToFloat3 = fIntBitsToFloat2 - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc2 >> 32)) / 2.0f);
                                                fIntBitsToFloat4 = (fIntBitsToFloat / 2.0f) - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc2 & 4294967295L)) / 2.0f);
                                                drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat3, fIntBitsToFloat4);
                                                androidx.compose.ui.graphics.painter.Painter.m1429drawx_KDEd0$default(vectorPainter2, drawScope, jMo1424getIntrinsicSizeNHjbRc2, 0.0f, null, 6, null);
                                                drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                            }
                                            androidx.compose.ui.graphics.painter.Painter.m1429drawx_KDEd0$default(vectorPainter2, drawScope, jMo1424getIntrinsicSizeNHjbRc2, 0.0f, null, 6, null);
                                            drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                        } catch (Throwable th) {
                                            drawScope.getDrawContext().getTransform().translate(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                            throw th;
                                        }
                                        fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - f5) / 2.0f) + f5;
                                        long jMo1424getIntrinsicSizeNHjbRc3 = vectorPainter2.mo1424getIntrinsicSizeNHjbRc();
                                        fIntBitsToFloat3 = fIntBitsToFloat2 - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc3 >> 32)) / 2.0f);
                                        fIntBitsToFloat4 = (fIntBitsToFloat / 2.0f) - (Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc3 & 4294967295L)) / 2.0f);
                                        drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                }
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                int i20 = MediaSessionCompatToken + 29;
                                MediaSessionCompatQueueItem = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                                return createfromparcel;
                            } catch (Throwable th2) {
                                th = th2;
                                drawContext = drawContext2;
                                j2 = jMo1225getSizeNHjbRc;
                                c8$$ExternalSyntheticOutline0.m(drawContext, j2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j2 = jMo1225getSizeNHjbRc;
                            drawContext = drawContext2;
                        }
                    }
                };
                getpostalcode.write(objComponentActivity);
            } else {
                getpostalcode = getpostalcode2;
            }
            AwaitFirstLayoutModifier.serializer(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new Transition3(f, setlegacyrequestdisallowintercepttoucheventenabled, modifier, i);
        }
    }
}
