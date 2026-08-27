package com.roadrunner.rider.state.ondemand.offlinebutton;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import o.equalEnum;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.p6;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OnDemandOfflineFloatingContentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r2
  0x0040: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r2
  0x002c: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(boolean z, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 93;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-376901884);
            if ((i & 101) == 0) {
                if (getpostalcode.write(z)) {
                    int i6 = IconCompatParcelizer + 41;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i8 = IconCompatParcelizer + 113;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-376901884);
            if ((i & 6) == 0) {
                if (getpostalcode.write(z)) {
                    int i10 = IconCompatParcelizer + 41;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i12 = IconCompatParcelizer + 113;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i14 = serializer + 9;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i3 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (!getpostalcode.write(i3 & 1, (i3 & 1171) != 1170)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i16 = IconCompatParcelizer;
            int i17 = i16 + 73;
            serializer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z) {
                int i18 = i16 + 33;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                getpostalcode.serializer(-1239351903);
                modifier.getClass();
                PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, Integer.valueOf(R.drawable.ic_power_on_off), null, null, null, 0, null, null, null, 0.0f, getpostalcode, (i3 >> 3) & 126, 0, 16360);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1239092898);
                modifier.getClass();
                float f = Dimensions.setCustomView;
                equalEnum.read(R.drawable.ic_power_on_off, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, false, null, f, f, getpostalcode, (i3 >> 3) & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(z, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 9);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x0147: INVOKE (r12v1 ?? I:o.getPostalCode), (r0v13 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:242)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void OnDemandOfflineFloatingContent(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x0147: INVOKE (r12v1 ?? I:o.getPostalCode), (r0v13 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:242)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
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
