package o;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
public class setToRotateGreenimpl extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new androidx.startup.StartupException();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer(context);
        Class<?> cls = getClass();
        Context context2 = settosaturationimplIconCompatParcelizer.IconCompatParcelizer;
        try {
            try {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("Startup");
                settosaturationimplIconCompatParcelizer.write(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), androidx.compose.ui.graphics.Fields.SpotShadowColor).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
