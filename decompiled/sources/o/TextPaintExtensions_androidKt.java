package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class TextPaintExtensions_androidKt {
    public final String IconCompatParcelizer;
    public final SharedPreferences RemoteActionCompatParcelizer;
    public final applySpanStyle read;

    public TextPaintExtensions_androidKt(applySpanStyle applyspanstyle, SharedPreferences sharedPreferences, setTransactionSuccessful settransactionsuccessful) {
        sharedPreferences.getClass();
        settransactionsuccessful.getClass();
        this.read = applyspanstyle;
        this.RemoteActionCompatParcelizer = sharedPreferences;
        this.IconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_naver_route_preview);
    }
}
