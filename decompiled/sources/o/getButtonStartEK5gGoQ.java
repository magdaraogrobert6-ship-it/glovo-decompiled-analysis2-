package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import okio.Options;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonStartEK5gGoQ {
    public final String IconCompatParcelizer;
    public final accessgetTvInputComposite1cp MediaBrowserCompatMediaItem;
    public final coil3.memory.MemoryCacheService MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public volatile getCallEK5gGoQ RemoteActionCompatParcelizer;
    public long read;
    public final Context serializer;
    public final getButtonThumbRightEK5gGoQ write;

    public final SQLiteDatabase IconCompatParcelizer(String str) {
        try {
            return this.write.getWritableDatabase();
        } catch (SQLiteException e) {
            getButtonThumbLeftEK5gGoQ.read(str, e);
            accessgetTvInputComponent2cp.read(this.serializer, e);
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
            return null;
        }
    }

    public getButtonStartEK5gGoQ(coil3.memory.MemoryCacheService memoryCacheService, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.serializer = applicationContext;
        this.IconCompatParcelizer = "gtm_urls.db";
        this.MediaSessionCompatQueueItem = memoryCacheService;
        this.MediaBrowserCompatMediaItem = accessgetTvInputComposite1cp.read;
        this.write = new getButtonThumbRightEK5gGoQ(this, applicationContext);
        this.RemoteActionCompatParcelizer = new getCallEK5gGoQ(applicationContext, new getExponentimpl(25, this));
        this.read = 0L;
        this.RatingCompat = 2000;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d6  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x02d3: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:114:0x02d3 */
    public final void read() {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursorQuery2;
        Cursor cursor2;
        HashMap map;
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.RemoteActionCompatParcelizer.read.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer("Error opening database for peekHits");
            int i = 0;
            if (sQLiteDatabaseIconCompatParcelizer != null) {
                try {
                    try {
                        cursorQuery2 = sQLiteDatabaseIconCompatParcelizer.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, "hit_id ASC", Integer.toString(40));
                        try {
                            ArrayList<getButton9EK5gGoQ> arrayList2 = new ArrayList();
                            try {
                                if (cursorQuery2.moveToFirst()) {
                                    while (true) {
                                        long j = cursorQuery2.getLong(i);
                                        cursorQuery2.getLong(1);
                                        arrayList2.add(new getButton9EK5gGoQ(j, cursorQuery2.getLong(2)));
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                        } else {
                                            i = 0;
                                        }
                                    }
                                }
                                cursorQuery2.close();
                                try {
                                    try {
                                        int i2 = 4;
                                        cursorQuery2 = sQLiteDatabaseIconCompatParcelizer.query("gtm_hits", new String[]{"hit_id", "hit_url", "hit_method", "hit_headers", "hit_body"}, null, null, null, null, "hit_id ASC", Integer.toString(40));
                                        if (cursorQuery2.moveToFirst()) {
                                            int i3 = 0;
                                            while (true) {
                                                if (((SQLiteCursor) cursorQuery2).getWindow().getNumRows() > 0) {
                                                    getButton9EK5gGoQ getbutton9ek5ggoq = (getButton9EK5gGoQ) arrayList2.get(i3);
                                                    String string = cursorQuery2.getString(1);
                                                    getbutton9ek5ggoq.getClass();
                                                    if (string != null && !TextUtils.isEmpty(string.trim())) {
                                                        getbutton9ek5ggoq.serializer = string;
                                                    }
                                                    ((getButton9EK5gGoQ) arrayList2.get(i3)).IconCompatParcelizer = cursorQuery2.getString(2);
                                                    ((getButton9EK5gGoQ) arrayList2.get(i3)).RatingCompat = cursorQuery2.getString(i2);
                                                    try {
                                                        String string2 = cursorQuery2.getString(3);
                                                        if (string2 != null) {
                                                            JSONObject jSONObject = new JSONObject(string2);
                                                            JSONArray jSONArrayNames = jSONObject.names();
                                                            map = new HashMap();
                                                            for (int i4 = 0; i4 < jSONArrayNames.length(); i4++) {
                                                                String string3 = jSONArrayNames.getString(i4);
                                                                map.put(string3, (String) jSONObject.opt(string3));
                                                            }
                                                        } else {
                                                            map = null;
                                                        }
                                                        ((getButton9EK5gGoQ) arrayList2.get(i3)).RemoteActionCompatParcelizer = map;
                                                    } catch (JSONException e) {
                                                        getButtonThumbLeftEK5gGoQ.serializer(String.format("Failed to read headers for hitId %d: %s", Long.valueOf(((getButton9EK5gGoQ) arrayList2.get(i3)).read), e.getMessage()));
                                                    }
                                                } else {
                                                    getButtonThumbLeftEK5gGoQ.serializer(String.format("HitString for hitId %d too large. Hit will be deleted.", Long.valueOf(((getButton9EK5gGoQ) arrayList2.get(i3)).read)));
                                                }
                                                i3++;
                                                if (!cursorQuery2.moveToNext()) {
                                                    break;
                                                } else {
                                                    i2 = 4;
                                                }
                                            }
                                        }
                                        cursorQuery2.close();
                                        arrayList = arrayList2;
                                    } catch (SQLiteException e2) {
                                        getButtonThumbLeftEK5gGoQ.serializer("Error in peekHits fetching hit url: " + e2.getMessage());
                                        arrayList = new ArrayList();
                                        boolean z = false;
                                        for (getButton9EK5gGoQ getbutton9ek5ggoq2 : arrayList2) {
                                            if (TextUtils.isEmpty(getbutton9ek5ggoq2.serializer)) {
                                                if (z) {
                                                    break;
                                                } else {
                                                    z = true;
                                                }
                                            }
                                            arrayList.add(getbutton9ek5ggoq2);
                                        }
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                arrayList = arrayList2;
                                getButtonThumbLeftEK5gGoQ.serializer("Error in peekHits fetching hitIds: " + e.getMessage());
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursorQuery2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                getCameraEK5gGoQ getcameraek5ggoq = (getCameraEK5gGoQ) this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
                getcameraek5ggoq.write(true, getcameraek5ggoq.MediaSessionCompatQueueItem);
                return;
            }
            this.RemoteActionCompatParcelizer.read(arrayList);
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer2 = IconCompatParcelizer("Error opening database for getNumStoredHits.");
            if (sQLiteDatabaseIconCompatParcelizer2 == null) {
                return;
            }
            try {
                cursorQuery = sQLiteDatabaseIconCompatParcelizer2.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
                try {
                    try {
                        int count = cursorQuery.getCount();
                        cursorQuery.close();
                        if (count > 0) {
                            if (getCameraEK5gGoQ.write == null) {
                                getCameraEK5gGoQ.write = new getCameraEK5gGoQ();
                            }
                            getCameraEK5gGoQ.write.write();
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        getButtonThumbLeftEK5gGoQ.serializer("Error getting num untried hits: " + e.getMessage());
                        if (cursorQuery == null) {
                            return;
                        }
                        cursorQuery.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e7) {
                e = e7;
                cursorQuery = null;
            } catch (Throwable th5) {
                th = th5;
                cursorQuery = null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } else {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        }
    }

    public final int IconCompatParcelizer() {
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer("Error opening database for getNumRecords.");
        int i = 0;
        if (sQLiteDatabaseIconCompatParcelizer == null) {
            return 0;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseIconCompatParcelizer.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                if (cursorRawQuery.moveToFirst()) {
                    i = (int) cursorRawQuery.getLong(0);
                }
            } catch (SQLiteException e) {
                getButtonThumbLeftEK5gGoQ.serializer("Error getting numStoredRecords: " + e.getMessage());
            }
            return i;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String[] strArr) {
        int length;
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer;
        if (strArr == null || (length = strArr.length) == 0 || (sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            sQLiteDatabaseIconCompatParcelizer.delete("gtm_hits", ff$$ExternalSyntheticOutline0.m("HIT_ID in (", TextUtils.join(",", Collections.nCopies(length, "?")), ")"), strArr);
            coil3.memory.MemoryCacheService memoryCacheService = this.MediaSessionCompatQueueItem;
            boolean z = IconCompatParcelizer() == 0;
            getCameraEK5gGoQ getcameraek5ggoq = (getCameraEK5gGoQ) memoryCacheService.RemoteActionCompatParcelizer;
            getcameraek5ggoq.write(z, getcameraek5ggoq.MediaSessionCompatQueueItem);
        } catch (SQLiteException e) {
            getButtonThumbLeftEK5gGoQ.serializer("Error deleting hits: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
