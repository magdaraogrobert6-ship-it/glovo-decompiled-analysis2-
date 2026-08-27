package com.roadrunner.rider.state.futureshift.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.doInBackground;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FutureShiftKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0068 A[PHI: r3
  0x0068: PHI (r3v62 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v64 o.getPostalCode) binds: [B:8:0x0048, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a A[PHI: r3
  0x004a: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v64 o.getPostalCode) binds: [B:8:0x0048, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FutureShiftWithTitleColumn(doInBackground doinbackground, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 91;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(94320334);
            if ((i & 102) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(doinbackground);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(doinbackground);
                }
                if (zIconCompatParcelizer) {
                    int i8 = read + 93;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(94320334);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(doinbackground);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(doinbackground);
                }
                if (zIconCompatParcelizer) {
                    int i10 = read + 93;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = read + 97;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 23 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    int i14 = read + 65;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i16 = read + 65;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i4 = Fields.RotationZ;
            } else {
                int i18 = serializer + 37;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i4 = Fields.CameraDistance;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode2.write(i3 & 1, (74899 & i3) != 74898)) {
            int i20 = read + 95;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, f, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i22 = serializer + 19;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            FutureShiftTitleRowKt.FutureShiftTitleRow(doinbackground.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode2, i3 & 112);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.setTabContainer)});
            FutureShiftColumnKt.FutureShiftColumn(doinbackground.RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, getpostalcode2, (i3 >> 3) & 8176);
            getpostalcode2.IconCompatParcelizer(true);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) doinbackground, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 24);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 ??, still in use, count: 1, list:
          (r9v6 ?? I:java.lang.Object) from 0x01f5: INVOKE (r14v1 ?? I:o.getPostalCode), (r9v6 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:381)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void FutureShift(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 ??, still in use, count: 1, list:
          (r9v6 ?? I:java.lang.Object) from 0x01f5: INVOKE (r14v1 ?? I:o.getPostalCode), (r9v6 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:381)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
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
