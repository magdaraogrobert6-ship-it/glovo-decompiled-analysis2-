package com.sentiance.sdk.tile.store;

import com.sentiance.sdk.memory.MemoryDecisionReason;
import kotlin.jvm.internal.Lambda;
import o.DataStoreProviderhExternalSyntheticLambda0;
import o.DataStoreProviderk;
import o.DataStoreProviderq;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setSubtitleGravity;

/* JADX INFO: loaded from: classes5.dex */
public final class ZippedByteStringTileStore$loadTile$result$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ String $parentQuadKey;
    final /* synthetic */ DataStoreProviderhExternalSyntheticLambda0<DataStoreProviderk, DataStoreProviderq> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedByteStringTileStore$loadTile$result$1(DataStoreProviderhExternalSyntheticLambda0<DataStoreProviderk, DataStoreProviderq> dataStoreProviderhExternalSyntheticLambda0, String str) {
        super(1);
        this.this$0 = dataStoreProviderhExternalSyntheticLambda0;
        this.$parentQuadKey = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        if (th instanceof OutOfMemoryError) {
            this.this$0.serializer(this.$parentQuadKey, new setSubtitleGravity(false, MemoryDecisionReason.SYSTEM_MEMORY_LOW, 0L, 0L), true);
        }
        this.this$0.RemoteActionCompatParcelizer(th);
        return createFromParcel.INSTANCE;
    }
}
