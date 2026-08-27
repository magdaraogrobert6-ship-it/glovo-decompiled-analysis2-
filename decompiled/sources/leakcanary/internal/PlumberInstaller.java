package leakcanary.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.EnumSet;
import kotlin.TypeCastException;
import o.isAdapterPositionOnScreen;
import o.removeNodeAtDepth;
import o.setCornersRadiusPx;
import o.setImage;
import o.setTextViewColor;

/* JADX INFO: loaded from: classes5.dex */
public final class PlumberInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            removeNodeAtDepth.read();
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        Application application = (Application) applicationContext;
        setTextViewColor settextviewcolor = setImage.Companion;
        EnumSet<setImage> enumSetAllOf = EnumSet.allOf(setImage.class);
        enumSetAllOf.getClass();
        settextviewcolor.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = setCornersRadiusPx.RemoteActionCompatParcelizer;
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        if (mainLooper.getThread() != Thread.currentThread()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(Thread.currentThread(), "Should be called from the main thread, not ");
            return false;
        }
        for (setImage setimage : enumSetAllOf) {
            if (!setimage.applied) {
                setimage.apply(application);
                setimage.applied = true;
            }
        }
        return true;
    }
}
