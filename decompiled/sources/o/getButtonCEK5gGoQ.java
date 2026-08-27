package o;

import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.ArrayList;
import java.util.Map;
import okio.Options;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonCEK5gGoQ implements Runnable {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ Map MediaDescriptionCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public final /* synthetic */ getButtonBEK5gGoQ RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ getButtonBEK5gGoQ serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        getButtonStartEK5gGoQ getbuttonstartek5ggoq;
        getButtonBEK5gGoQ getbuttonbek5ggoq = this.RatingCompat;
        boolean z = false;
        if (getbuttonbek5ggoq.IconCompatParcelizer == null) {
            getButtonBEK5gGoQ getbuttonbek5ggoq2 = this.serializer;
            if (getCameraEK5gGoQ.write == null) {
                getCameraEK5gGoQ.write = new getCameraEK5gGoQ();
            }
            getCameraEK5gGoQ getcameraek5ggoq = getCameraEK5gGoQ.write;
            Context context = getbuttonbek5ggoq.write;
            synchronized (getcameraek5ggoq) {
                if (getcameraek5ggoq.RemoteActionCompatParcelizer == null) {
                    getcameraek5ggoq.RemoteActionCompatParcelizer = context.getApplicationContext();
                    if (getcameraek5ggoq.read == null) {
                        getcameraek5ggoq.read = getbuttonbek5ggoq2;
                    }
                }
            }
            synchronized (getcameraek5ggoq) {
                if (getcameraek5ggoq.serializer == null) {
                    Context context2 = getcameraek5ggoq.RemoteActionCompatParcelizer;
                    if (context2 == null) {
                        throw new IllegalStateException("Cant get a store unless we have a context");
                    }
                    getcameraek5ggoq.serializer = new getButtonStartEK5gGoQ(getcameraek5ggoq.MediaSessionCompatToken, context2);
                }
                if (getcameraek5ggoq.RatingCompat == null) {
                    i$d i_d = new i$d(getcameraek5ggoq);
                    getcameraek5ggoq.RatingCompat = i_d;
                    i_d.RemoteActionCompatParcelizer();
                }
                getcameraek5ggoq.MediaBrowserCompatMediaItem = true;
                if (getcameraek5ggoq.MediaMetadataCompat) {
                    getcameraek5ggoq.write();
                    getcameraek5ggoq.MediaMetadataCompat = false;
                }
                if (getcameraek5ggoq.PlaybackStateCompat == null) {
                    getButtonXEK5gGoQ getbuttonxek5ggoq = new getButtonXEK5gGoQ(getcameraek5ggoq, z, null == true ? 1 : 0);
                    getcameraek5ggoq.PlaybackStateCompat = getbuttonxek5ggoq;
                    Context context3 = getcameraek5ggoq.RemoteActionCompatParcelizer;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    FocusListener.read(context3, getbuttonxek5ggoq, intentFilter, null, 4);
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
                    intentFilter2.addCategory(context3.getPackageName());
                    FocusListener.read(context3, getbuttonxek5ggoq, intentFilter2, null, 4);
                }
                getbuttonstartek5ggoq = getcameraek5ggoq.serializer;
            }
            getbuttonbek5ggoq.IconCompatParcelizer = getbuttonstartek5ggoq;
        }
        long j = this.IconCompatParcelizer;
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        Map map = this.MediaDescriptionCompat;
        String str4 = this.MediaSessionCompatQueueItem;
        getButtonStartEK5gGoQ getbuttonstartek5ggoq2 = getbuttonbek5ggoq.IconCompatParcelizer;
        coil3.memory.MemoryCacheService memoryCacheService = getbuttonstartek5ggoq2.MediaSessionCompatQueueItem;
        getbuttonstartek5ggoq2.MediaBrowserCompatMediaItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > getbuttonstartek5ggoq2.read + CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
            getbuttonstartek5ggoq2.read = jCurrentTimeMillis;
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = getbuttonstartek5ggoq2.IconCompatParcelizer("Error opening database for deleteStaleHits.");
            if (sQLiteDatabaseIconCompatParcelizer != null) {
                sQLiteDatabaseIconCompatParcelizer.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)});
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                boolean z2 = getbuttonstartek5ggoq2.IconCompatParcelizer() == 0;
                getCameraEK5gGoQ getcameraek5ggoq2 = (getCameraEK5gGoQ) memoryCacheService.RemoteActionCompatParcelizer;
                getcameraek5ggoq2.write(z2, getcameraek5ggoq2.MediaSessionCompatQueueItem);
            }
        }
        int iIconCompatParcelizer = (getbuttonstartek5ggoq2.IconCompatParcelizer() - getbuttonstartek5ggoq2.RatingCompat) + 1;
        if (iIconCompatParcelizer > 0) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer2 = getbuttonstartek5ggoq2.IconCompatParcelizer("Error opening database for peekHitIds.");
            if (sQLiteDatabaseIconCompatParcelizer2 != null) {
                try {
                    cursorQuery = sQLiteDatabaseIconCompatParcelizer2.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Integer.toString(iIconCompatParcelizer));
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    arrayList.add(String.valueOf(cursorQuery.getLong(0)));
                                } while (cursorQuery.moveToNext());
                            }
                            cursorQuery.close();
                        } catch (SQLiteException e) {
                            e = e;
                            getButtonThumbLeftEK5gGoQ.serializer("Error in peekHits fetching hitIds: " + e.getMessage());
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            arrayList.size();
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            getbuttonstartek5ggoq2.RemoteActionCompatParcelizer((String[]) arrayList.toArray(new String[0]));
        }
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer3 = getbuttonstartek5ggoq2.IconCompatParcelizer("Error opening database for putHit");
        if (sQLiteDatabaseIconCompatParcelizer3 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", (Integer) 0);
            if (str2 == null) {
                str2 = "GET";
            }
            contentValues.put("hit_method", str2);
            contentValues.put("hit_unique_id", str3);
            contentValues.put("hit_headers", map == null ? null : new JSONObject(map).toString());
            contentValues.put("hit_body", str4);
            try {
                sQLiteDatabaseIconCompatParcelizer3.insertOrThrow("gtm_hits", null, contentValues);
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                getCameraEK5gGoQ getcameraek5ggoq3 = (getCameraEK5gGoQ) memoryCacheService.RemoteActionCompatParcelizer;
                getcameraek5ggoq3.write(false, getcameraek5ggoq3.MediaSessionCompatQueueItem);
            } catch (SQLiteConstraintException unused) {
                "Hit has already been sent: ".concat(String.valueOf(str));
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            } catch (SQLiteException e3) {
                getButtonThumbLeftEK5gGoQ.serializer("Error storing hit: ".concat(String.valueOf(e3.getMessage())));
            }
        }
        if (getCalendarEK5gGoQ.IconCompatParcelizer().serializer == 2) {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            getbuttonstartek5ggoq2.read();
        }
    }

    public getButtonCEK5gGoQ(getButtonBEK5gGoQ getbuttonbek5ggoq, getButtonBEK5gGoQ getbuttonbek5ggoq2, long j, String str, String str2, String str3, Map map, String str4) {
        this.serializer = getbuttonbek5ggoq2;
        this.IconCompatParcelizer = j;
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.MediaDescriptionCompat = map;
        this.MediaSessionCompatQueueItem = str4;
        this.RatingCompat = getbuttonbek5ggoq;
    }
}
