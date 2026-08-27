package o;

import com.roadrunner.order.history.data.database.HistoryDatabase_Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends y6 {
    public final androidx.room.RoomDatabase IconCompatParcelizer;
    public final BrazeCompanionExternalSyntheticLambda21 serializer;
    public final y5 write;

    public y3(HistoryDatabase_Impl historyDatabase_Impl) {
        historyDatabase_Impl.getClass();
        this.serializer = new BrazeCompanionExternalSyntheticLambda21(4);
        this.IconCompatParcelizer = historyDatabase_Impl;
        this.write = new y5(0, this);
    }
}
