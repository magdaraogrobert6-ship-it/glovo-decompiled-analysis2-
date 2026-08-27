package com.deliveryhero.perseus.hits;

import androidx.sqlite.SQLite;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import com.deliveryhero.perseus.utils.BackoffTimer;
import java.util.List;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusWorkFinishedCallback {
    public final PerseusLogger IconCompatParcelizer;
    public final MemoryCacheService RatingCompat;
    public final PerseusHitsRepositoryImpl RemoteActionCompatParcelizer;
    public final List read;
    public BackoffTimer serializer;
    public final PerseusConfigLocalDataStoreImpl write;

    public PerseusWorkFinishedCallback(PerseusHitsRepositoryImpl perseusHitsRepositoryImpl, MemoryCacheService memoryCacheService, PerseusLogger perseusLogger, PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl) {
        perseusHitsRepositoryImpl.getClass();
        memoryCacheService.getClass();
        perseusLogger.getClass();
        perseusConfigLocalDataStoreImpl.getClass();
        this.RemoteActionCompatParcelizer = perseusHitsRepositoryImpl;
        this.RatingCompat = memoryCacheService;
        this.IconCompatParcelizer = perseusLogger;
        this.write = perseusConfigLocalDataStoreImpl;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        this.read = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{400}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r14.refreshConfig$perseus_release(r0) == r1) goto L27;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x008e, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWorkFinished(java.util.List r12, java.lang.Object r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.hits.PerseusWorkFinishedCallback.onWorkFinished(java.util.List, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
