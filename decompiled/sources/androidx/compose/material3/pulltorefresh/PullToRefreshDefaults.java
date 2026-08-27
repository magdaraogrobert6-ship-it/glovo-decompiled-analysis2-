package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOnFill;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;
import o.setMaxTextLength;

/* JADX INFO: loaded from: classes.dex */
public final class PullToRefreshDefaults {
    public static final PullToRefreshDefaults IconCompatParcelizer = new PullToRefreshDefaults();
    public static final getTopLeftannotations RemoteActionCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer;
    public static final float read;
    public static final float serializer;
    public static final float write;

    static {
        float fM3673constructorimpl = Dp.m3673constructorimpl(80.0f);
        read = fM3673constructorimpl;
        serializer = fM3673constructorimpl;
        write = ElevationTokens.RemoteActionCompatParcelizer;
    }

    public final void write(final getOnFill getonfill, final boolean z, final Modifier modifier, long j, long j2, float f, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final long j3;
        final long j4;
        final float f2;
        int i3;
        float f3;
        long j5;
        long j6;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1076870256);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(getonfill) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(this) ? 1048576 : Fields.BlendMode;
        }
        if (getpostalcode.write(i2 & 1, (599187 & i2) != 599186)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i3 = i2 & (-523265);
                j5 = j;
                j6 = j2;
                f3 = f;
            } else {
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getWindowPosturem18o9QQ.serializer;
                long j7 = ((getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onBackPressedDispatcher_delegatelambda00;
                long j8 = ((getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                i3 = i2 & (-523265);
                f3 = serializer;
                j5 = j7;
                j6 = j8;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            m136IndicatorBox1CPYgEU(getonfill, z, modifier, f3, null, j5, 0.0f, ExtrasKt.write(298232649, new setMaxTextLength(z, j6, getonfill), getpostalcode), getpostalcode, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | ((i3 << 6) & 234881024));
            j3 = j5;
            f2 = f3;
            j4 = j6;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setSelected
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.serializer.write(getonfill, z, modifier, j3, j4, f2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ??, still in use, count: 1, list:
          (r2v2 ?? I:java.lang.Object) from 0x0150: INVOKE (r0v1 ?? I:o.getPostalCode), (r2v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:321)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: IndicatorBox-1CPYgEU, reason: not valid java name */
    public final void m136IndicatorBox1CPYgEU(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ??, still in use, count: 1, list:
          (r2v2 ?? I:java.lang.Object) from 0x0150: INVOKE (r0v1 ?? I:o.getPostalCode), (r2v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:321)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
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
