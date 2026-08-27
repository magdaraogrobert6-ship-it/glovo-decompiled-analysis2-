package o;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAlpha8_sVssgQ implements isSpecified8_81llA, io.sentry.util.runtime.read {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Context read;

    public /* synthetic */ getAlpha8_sVssgQ(Context context, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = context;
    }

    @Override // io.sentry.util.runtime.read
    public Object A_() {
        int i = this.RemoteActionCompatParcelizer;
        Context context = this.read;
        return i != 1 ? io.sentry.android.core.createFullyDrawnExecutor.read(context) : new File(context.getCacheDir(), "sentry").getAbsolutePath();
    }

    @Override // o.isSpecified8_81llA
    public compositeComponent read(getUnspecifiedColorannotations getunspecifiedcolorannotations) {
        Context context = this.read;
        context.getClass();
        String str = getunspecifiedcolorannotations.read;
        SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback = getunspecifiedcolorannotations.IconCompatParcelizer;
        supportSQLiteOpenHelper$Callback.getClass();
        if (str != null && str.length() != 0) {
            return new isUnspecified8_81llAannotations(context, str, supportSQLiteOpenHelper$Callback, true, true);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
