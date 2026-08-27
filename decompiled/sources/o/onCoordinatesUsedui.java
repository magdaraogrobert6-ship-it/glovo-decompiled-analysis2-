package o;

import android.database.sqlite.SQLiteTransactionListener;
import com.mapbox.navigation.core.utils.Delayer;

/* JADX INFO: loaded from: classes2.dex */
public final class onCoordinatesUsedui implements SQLiteTransactionListener {
    public final /* synthetic */ headH91voCI RemoteActionCompatParcelizer;

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer == -1, "Starting a transaction without committing the previous one", new Object[0]);
        Delayer delayer = (Delayer) onGloballyPositionedModifierDefaultImpls.IconCompatParcelizer;
        long j = delayer.delayRemaining + 1;
        delayer.delayRemaining = j;
        onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer = j;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer != -1, "Committing a transaction without having started one", new Object[0]);
        onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer = -1L;
    }

    public onCoordinatesUsedui(headH91voCI headh91voci) {
        this.RemoteActionCompatParcelizer = headh91voci;
    }
}
