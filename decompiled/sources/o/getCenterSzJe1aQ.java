package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class getCenterSzJe1aQ extends copyzey9I6w {
    public final boolean ComponentActivity;
    public final accessgetCiecat02cp ResultReceiver;
    public final accessgetCiecat02cp r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final RectF r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final mul3x3 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ContextMenuSpec r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ContextMenuSpec r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final accessgetCiecat02cp r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    public getCenterSzJe1aQ(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, connectYBCOT_4 connectybcot_4) {
        super(accessgetmirrorcp, extendedSrgblambda0, connectybcot_4.read.toPaintCap(), connectybcot_4.MediaBrowserCompatMediaItem.toPaintJoin(), connectybcot_4.MediaDescriptionCompat, connectybcot_4.MediaMetadataCompat, connectybcot_4.PlaybackStateCompatCustomAction, connectybcot_4.MediaSessionCompatQueueItem, connectybcot_4.write);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ContextMenuSpec((Object) null);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ContextMenuSpec((Object) null);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new RectF();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = connectybcot_4.IconCompatParcelizer;
        this.ComponentActivity = connectybcot_4.RatingCompat;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (int) (accessgetmirrorcp.MediaDescriptionCompat.RemoteActionCompatParcelizer() / 32.0f);
        getColors getcolorsWrite = connectybcot_4.serializer.write();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (accessgetCiecat02cp) getcolorsWrite;
        getcolorsWrite.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        getColors getcolorsWrite2 = connectybcot_4.PlaybackStateCompat.write();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (accessgetCiecat02cp) getcolorsWrite2;
        getcolorsWrite2.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite2);
        getColors getcolorsWrite3 = connectybcot_4.RemoteActionCompatParcelizer.write();
        this.ResultReceiver = (accessgetCiecat02cp) getcolorsWrite3;
        getcolorsWrite3.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite3);
    }

    public final int IconCompatParcelizer() {
        float f = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaBrowserCompatMediaItem;
        float f2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.ResultReceiver.MediaBrowserCompatMediaItem * f2);
        int iRound3 = Math.round(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaBrowserCompatMediaItem * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v10 ??, still in use, count: 1, list:
          (r4v10 ?? I:java.lang.Object) from 0x0051: INVOKE (r7v1 ?? I:o.ContextMenuSpec), (r1v7 ?? I:long), (r4v10 ?? I:java.lang.Object) VIRTUAL call: o.ContextMenuSpec.read(long, java.lang.Object):void A[MD:(long, java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // o.copyzey9I6w, o.TransformOriginCompanion
    public final void RemoteActionCompatParcelizer(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v10 ??, still in use, count: 1, list:
          (r4v10 ?? I:java.lang.Object) from 0x0051: INVOKE (r7v1 ?? I:o.ContextMenuSpec), (r1v7 ?? I:long), (r4v10 ?? I:java.lang.Object) VIRTUAL call: o.ContextMenuSpec.read(long, java.lang.Object):void A[MD:(long, java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
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
