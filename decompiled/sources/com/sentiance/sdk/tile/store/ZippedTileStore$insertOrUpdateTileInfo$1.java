package com.sentiance.sdk.tile.store;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import o.DataStoreProvideri;
import o.DataStoreProviderq;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ZippedTileStore$insertOrUpdateTileInfo$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ DataStoreProviderq $tileInfo;
    final /* synthetic */ DataStoreProvideri<DataStoreProviderq> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedTileStore$insertOrUpdateTileInfo$1(DataStoreProvideri<DataStoreProviderq> dataStoreProvideri, DataStoreProviderq dataStoreProviderq) {
        super(1);
        this.this$0 = dataStoreProvideri;
        this.$tileInfo = dataStoreProviderq;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.getClass();
        try {
            sQLiteDatabase.insertWithOnConflict(this.this$0.MediaMetadataCompat().read(), "", this.$tileInfo.read(this.this$0.MediaMetadataCompat()), 5);
        } catch (Exception e) {
            ((DataStoreProvideri) this.this$0).RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to insert or update new zipped tile info", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
