package o;

import android.util.Log;
import com.huawei.location.gwi.util.GwiErrorCode;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class setInflatedId {
    public static int IconCompatParcelizer = 3;
    private static int read = 0;
    private static int write = 1;

    public static void read(String str, String str2) {
        int i = 2 % 2;
        if (!(!IconCompatParcelizer(5, str))) {
            int i2 = read + 3;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SentryLogcatAdapter.IconCompatParcelizer(str, str2);
            int i4 = read + 101;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public static void serializer(String str, String str2) {
        int i = 2 % 2;
        int i2 = read + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0 ? IconCompatParcelizer(6, str) : IconCompatParcelizer(GwiErrorCode.ALG_LIBRARY_NOT_EXIST, str)) {
            SentryLogcatAdapter.serializer(str, str2);
            int i3 = read + 27;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        int i5 = write + 117;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void RemoteActionCompatParcelizer(String str, String str2, Throwable th) {
        int i = 2 % 2;
        if (IconCompatParcelizer(5, str)) {
            int i2 = read + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SentryLogcatAdapter.write(str, str2, th);
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = read + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void read(String str, String str2, Throwable th) {
        int i = 2 % 2;
        if (!(!IconCompatParcelizer(6, str))) {
            int i2 = read + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SentryLogcatAdapter.read(str, str2, th);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = write + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static boolean IconCompatParcelizer(int i, String str) {
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (IconCompatParcelizer <= i) {
            return true;
        }
        int i6 = i3 + 55;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return Log.isLoggable(str, i);
        }
        Log.isLoggable(str, i);
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v8 ??, still in use, count: 1, list:
          (r12v8 ?? I:java.lang.Object) from 0x0109: INVOKE (r9v1 ?? I:o.getPostalCode), (r12v8 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:168)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v8 ??, still in use, count: 1, list:
          (r12v8 ?? I:java.lang.Object) from 0x0109: INVOKE (r9v1 ?? I:o.getPostalCode), (r12v8 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:168)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
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
