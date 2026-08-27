package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdagc9w6QBfCFPWhZlCuwheORqN8w extends BrazeActionParser {
    public final BaseBrazeActionStep MediaMetadataCompat;
    public final AddToCustomAttributeArrayStep RatingCompat;
    public final BrazeActionParserExternalSyntheticLambda0 serializer;

    @Override // o.BrazeActionParser
    public final boolean serializer(String str) {
        return str.endsWith(".envelope");
    }

    public static void IconCompatParcelizer(r8lambdagc9w6QBfCFPWhZlCuwheORqN8w r8lambdagc9w6qbfcfpwhzlcuwheorqn8w, File file, io.sentry.hints.MediaDescriptionCompat mediaDescriptionCompat) {
        boolean z = mediaDescriptionCompat.read();
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = r8lambdagc9w6qbfcfpwhzlcuwheorqn8w.serializer;
        if (z) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    public r8lambdagc9w6QBfCFPWhZlCuwheORqN8w(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, BaseBrazeActionStep baseBrazeActionStep, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j, int i) {
        super(addToCustomAttributeArrayStep, brazeActionParserExternalSyntheticLambda0, j, i);
        setNativeShader.read(addToCustomAttributeArrayStep, "Scopes are required.");
        this.RatingCompat = addToCustomAttributeArrayStep;
        setNativeShader.read(baseBrazeActionStep, "Serializer is required.");
        this.MediaMetadataCompat = baseBrazeActionStep;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "Logger is required.");
        this.serializer = brazeActionParserExternalSyntheticLambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        IconCompatParcelizer(r7, r8, (io.sentry.hints.MediaDescriptionCompat) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // o.BrazeActionParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serializer(java.io.File r8, o.executelambda4 r9) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdagc9w6QBfCFPWhZlCuwheORqN8w.serializer(java.io.File, o.executelambda4):void");
    }
}
