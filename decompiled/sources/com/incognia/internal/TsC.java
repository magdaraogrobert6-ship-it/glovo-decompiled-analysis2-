package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class TsC implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x002f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.incognia.internal.PG
    public final void BGx(com.incognia.internal.y0S r5, com.incognia.internal.Ltx r6) {
        /*
            r4 = this;
            r5 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            o.onViewDetachedFromWindowlambda1 r1 = com.incognia.internal.W4i.qq     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.MediaSessionCompatResultReceiverWrapper()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L15
            goto L16
        L15:
            r0 = r5
        L16:
            if (r0 == 0) goto L2d
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2d
            o.resumeWebviewIfNecessarylambda0 r0 = o.onContentCardClicked.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L2f
            com.incognia.internal.mB r1 = com.incognia.internal.mB.BGx     // Catch: java.lang.Throwable -> L2f
            o.requestDisplayInAppMessagelambda7 r0 = o.resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List r5 = o.resetAfterInAppMessageCloselambda2.read(r0)     // Catch: java.lang.Throwable -> L2f
            goto L2f
        L2d:
            o.instance_delegatelambda0 r5 = o.instance_delegatelambda0.write     // Catch: java.lang.Throwable -> L2f
        L2f:
            o.onViewDetachedFromWindowlambda1 r0 = r4.BGx     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.MediaSessionCompatResultReceiverWrapper()     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L47
            com.incognia.internal.soy r1 = new com.incognia.internal.soy     // Catch: java.lang.Throwable -> L47
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L47
            com.incognia.internal.JWV r2 = new com.incognia.internal.JWV     // Catch: java.lang.Throwable -> L47
            com.incognia.internal.c8h r3 = new com.incognia.internal.c8h     // Catch: java.lang.Throwable -> L47
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L47
            r2.<init>(r0, r5, r3)     // Catch: java.lang.Throwable -> L47
            goto L4d
        L47:
            r5 = move-exception
            o.isItemDismissable r2 = new o.isItemDismissable
            r2.<init>(r5)
        L4d:
            com.incognia.internal.Bq.BGx(r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.TsC.BGx(com.incognia.internal.y0S, com.incognia.internal.Ltx):void");
    }

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public TsC(SJe sJe) {
        Object[] objArr = {Nsx.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
