package com.sentiance.sdk.tile.store;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import kotlin.jvm.internal.Lambda;
import o.DataStoreProvideri;
import o.DataStoreProviderq;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ZippedTileStore$deleteTileInfo$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ String $quadKey;
    final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedTileStore$deleteTileInfo$1(DataStoreProvideri<DataStoreProviderq> dataStoreProvideri, String str) {
        super(1);
        this.this$0 = dataStoreProvideri;
        this.$quadKey = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.getClass();
        try {
            this.this$0.MediaMetadataCompat().getClass();
            WhereClause whereClauseWrite = WhereClause.serializer("quad_key").write(this.$quadKey);
            sQLiteDatabase.delete(this.this$0.MediaMetadataCompat().read(), whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
        } catch (Exception e) {
            ((DataStoreProvideri) this.this$0).RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to delete tile %s", this.$quadKey);
        }
        return createFromParcel.INSTANCE;
    }
}
