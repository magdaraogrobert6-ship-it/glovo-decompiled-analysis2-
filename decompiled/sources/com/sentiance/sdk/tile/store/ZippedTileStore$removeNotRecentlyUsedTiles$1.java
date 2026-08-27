package com.sentiance.sdk.tile.store;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import o.DataStoreProviderq;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ZippedTileStore$removeNotRecentlyUsedTiles$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ Set<String> $quadKeysToKeep;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        DataStoreProviderq dataStoreProviderq = (DataStoreProviderq) obj;
        dataStoreProviderq.getClass();
        return Boolean.valueOf(this.$quadKeysToKeep.contains(dataStoreProviderq.RemoteActionCompatParcelizer));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedTileStore$removeNotRecentlyUsedTiles$1(Set<String> set) {
        super(1);
        this.$quadKeysToKeep = set;
    }
}
