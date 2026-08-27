package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class N {
    public final setTransactionSuccessful IconCompatParcelizer;
    public final SharedPreferences RemoteActionCompatParcelizer;

    public N(SharedPreferences sharedPreferences, setTransactionSuccessful settransactionsuccessful, int i) {
        if (i != 1) {
            sharedPreferences.getClass();
            settransactionsuccessful.getClass();
            this.RemoteActionCompatParcelizer = sharedPreferences;
            this.IconCompatParcelizer = settransactionsuccessful;
            return;
        }
        this.RemoteActionCompatParcelizer = sharedPreferences;
        this.IconCompatParcelizer = settransactionsuccessful;
    }
}
