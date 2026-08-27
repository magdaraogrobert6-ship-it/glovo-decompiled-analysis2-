package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class updateOutlineResolver extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        ArrayList arrayList = accesssetUpdateDisplayListIfDirtyMethodcp.IconCompatParcelizer;
        synchronized (accesssetUpdateDisplayListIfDirtyMethodcp.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (accesssetUpdateDisplayListIfDirtyMethodcp.RemoteActionCompatParcelizer.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                accesssetUpdateDisplayListIfDirtyMethodcp.read(context, onStateChanged.write(context));
            }
        }
        return false;
    }
}
