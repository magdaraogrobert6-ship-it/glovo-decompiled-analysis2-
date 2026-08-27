package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import kotlinx.coroutines.DelayKt;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.AwaitFirstLayoutModifier;
import o.BoxMeasurePolicy;
import o.UiMediaScopeViewingDistance;
import o.accesstrimToSafeLength;
import o.aspectRatiodefault;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getSpacingD9Ej5fM;
import o.getViewportSizeYbymL2g;
import o.onInputDeviceAdded;
import o.performFling;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProgressIndicatorKt {
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(240.0f);
    public static final float read;
    public static final float serializer;
    public static final CubicBezierEasing write;

    static {
        float f = LinearProgressIndicatorTokens.read;
        read = LinearProgressIndicatorTokens.read;
        Dp.m3673constructorimpl(6.0f);
        float f2 = CircularProgressIndicatorTokens.read;
        serializer = CircularProgressIndicatorTokens.read;
        CubicBezierEasing cubicBezierEasing = accesstrimToSafeLength.serializer;
        write = accesstrimToSafeLength.read;
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m121drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - (2.0f * width);
        DrawScope.m1283drawArcyD3GUKo$default(drawScope, j, f, f2, false, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m122drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (StrokeCap.m1095equalsimpl0(i, StrokeCap.Companion.m1099getButtKaPHkGw()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            DrawScope.m1290drawLineNGM6Ib0$default(drawScope, j, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m1290drawLineNGM6Ib0$default(drawScope, j, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final void write(final Modifier modifier, final long j, final float f, long j2, int i, float f2, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        getPostalCode getpostalcode;
        final long j3;
        final int i4;
        final float f3;
        int i5;
        int i6;
        float f4;
        long j4;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(333154241);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode2.read(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode2.serializer(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode2.serializer(f) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= Fields.RotationZ;
        }
        int i7 = i3 | 221184;
        if (getpostalcode2.write(i7 & 1, (74899 & i7) != 74898)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) != 0 && !getpostalcode2.PlaybackStateCompat()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i5 = i7 & (-7169);
                j4 = j2;
                i6 = i;
                f4 = f2;
            } else {
                int i8 = onInputDeviceAdded.write;
                long jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                i5 = i7 & (-7169);
                i6 = onInputDeviceAdded.read;
                f4 = onInputDeviceAdded.IconCompatParcelizer;
                j4 = jM757getTransparent0d7_KjU;
            }
            int i9 = i5;
            getpostalcode2.RemoteActionCompatParcelizer();
            final Stroke stroke = new Stroke(((Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(f), 0.0f, i6, 0, null, 26, null);
            ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read(null, getpostalcode2, 1);
            Object[] objArr = {6000, 0, performFling.read, 2};
            final long j5 = j4;
            final placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.0f, 1080.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), (BoxMeasurePolicy) null, 6), null, getpostalcode2, 4536, 8);
            Object[] objArr2 = {new UiMediaScopeViewingDistance(14)};
            final placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer2 = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.0f, 360.0f, DelayKt.RemoteActionCompatParcelizer((aspectRatiodefault) DelayKt.write(-1328669373, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr2), (BoxMeasurePolicy) null, 6), null, getpostalcode2, 4536, 8);
            getSpacingD9Ej5fM getspacingd9ej5fm = new getSpacingD9Ej5fM(0);
            getspacingd9ej5fm.write = 6000;
            getspacingd9ej5fm.read(3000, Float.valueOf(0.87f)).write = write;
            getspacingd9ej5fm.read(6000, Float.valueOf(0.1f));
            final placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer3 = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.1f, 0.87f, DelayKt.RemoteActionCompatParcelizer(new aspectRatiodefault(getspacingd9ej5fm), (BoxMeasurePolicy) null, 6), null, getpostalcode2, 4536, 8);
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(SemanticsModifierKt.semantics(modifier, true, new getViewportSizeYbymL2g(7)), serializer);
            boolean z = getpostalcode2.read(placespacebetweenfoundation_layoutIconCompatParcelizer3);
            boolean z2 = (57344 & i9) == 16384;
            boolean z3 = (458752 & i9) == 131072;
            boolean z4 = (i9 & 896) == 256;
            boolean z5 = getpostalcode2.read(r36);
            boolean z6 = getpostalcode2.read(placespacebetweenfoundation_layoutIconCompatParcelizer2);
            boolean zSerializer = getpostalcode2.serializer(j5);
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(stroke);
            boolean z7 = (((i9 & 112) ^ 48) > 32 && getpostalcode2.serializer(j)) || (i9 & 48) == 32;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (((z | z2 | z3 | z4 | z5 | z6 | zSerializer | zIconCompatParcelizer) || z7) || objComponentActivity == getCreditCardExpirationMonth.write) {
                final int i10 = i6;
                final float f5 = f4;
                getpostalcode = getpostalcode2;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.MediaQuery_androidKtobtainUiMediaScope21listener1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) throws Throwable {
                        long j6;
                        long j7 = j5;
                        androidx.compose.ui.graphics.drawscope.Stroke stroke2 = stroke;
                        long j8 = j;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        float fFloatValue = ((Number) placespacebetweenfoundation_layoutIconCompatParcelizer3.getValue()).floatValue() * 360.0f;
                        boolean zM1095equalsimpl0 = androidx.compose.ui.graphics.StrokeCap.m1095equalsimpl0(i10, androidx.compose.ui.graphics.StrokeCap.Companion.m1099getButtKaPHkGw());
                        float fM3673constructorimpl = f5;
                        if (!zM1095equalsimpl0 && Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32))) {
                            fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(fM3673constructorimpl + f);
                        }
                        float fMo44toDpu2uoSUM = (fM3673constructorimpl / ((float) (((double) drawScope.mo44toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) placespacebetweenfoundation_layoutIconCompatParcelizer.getValue()).floatValue();
                        float fFloatValue3 = ((Number) placespacebetweenfoundation_layoutIconCompatParcelizer2.getValue()).floatValue();
                        long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
                        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
                        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo1231rotateUv8p0NA(fFloatValue3 + fFloatValue2, jMo1303getCenterF1C5BW0);
                            j6 = jMo1225getSizeNHjbRc;
                            try {
                                androidx.compose.material3.ProgressIndicatorKt.m121drawCircularIndicator42QJj7c(drawScope, Math.min(fFloatValue, fMo44toDpu2uoSUM) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo44toDpu2uoSUM) * 2.0f), j7, stroke2);
                                androidx.compose.material3.ProgressIndicatorKt.m121drawCircularIndicator42QJj7c(drawScope, 0.0f, fFloatValue, j8, stroke2);
                                c8$$ExternalSyntheticOutline0.m(drawContext, j6);
                                return createFromParcel.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                c8$$ExternalSyntheticOutline0.m(drawContext, j6);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j6 = jMo1225getSizeNHjbRc;
                        }
                    }
                };
                getpostalcode.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                objComponentActivity = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            } else {
                getpostalcode = getpostalcode2;
            }
            AwaitFirstLayoutModifier.serializer(modifierM83size3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
            i4 = i6;
            f3 = f4;
            j3 = j5;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j3 = j2;
            i4 = i;
            f3 = f2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MediaQuery_androidKtobtainUiMediaScope31ExternalSyntheticLambda0
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.ProgressIndicatorKt.write(modifier, j, f, j3, i4, f3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x0170: INVOKE (r0v4 ?? I:o.getPostalCode), (r1v10 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:348)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void IconCompatParcelizer(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x0170: INVOKE (r0v4 ?? I:o.getPostalCode), (r1v10 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:348)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
}
