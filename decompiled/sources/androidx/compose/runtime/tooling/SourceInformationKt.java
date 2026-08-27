package androidx.compose.runtime.tooling;

import o.CacheDrawModifierNodeImpl1;
import o.ContentCardsUpdatedEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class SourceInformationKt {
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0053
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final o.CacheDrawModifierNodeImpl1 RemoteActionCompatParcelizer(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.SourceInformationKt.RemoteActionCompatParcelizer(java.lang.String):o.CacheDrawModifierNodeImpl1");
    }

    public static final CacheDrawModifierNodeImpl1 write(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return RemoteActionCompatParcelizer(str);
        } catch (ParseException e) {
            ContentCardsUpdatedEvent.read(e.read, e);
            return null;
        }
    }
}
