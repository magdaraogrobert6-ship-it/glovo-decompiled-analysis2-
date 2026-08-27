package o;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewCompanion {
    public static final Date IconCompatParcelizer = new Date(-1);
    public static final Date serializer = new Date(-1);
    public final SharedPreferences read;
    public final Object RemoteActionCompatParcelizer = new Object();
    public final Object write = new Object();
    public final Object MediaBrowserCompatMediaItem = new Object();

    public final void read(int i, Date date) {
        synchronized (this.write) {
            this.read.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final CSSParseException serializer() {
        CSSParseException cSSParseException;
        synchronized (this.MediaBrowserCompatMediaItem) {
            int i = this.read.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.read.getLong("realtime_backoff_end_time_in_millis", -1L));
            cSSParseException = new CSSParseException(6, (char) 0);
            cSSParseException.IconCompatParcelizer = i;
            cSSParseException.RemoteActionCompatParcelizer = date;
        }
        return cSSParseException;
    }

    public final DeltaDecoder write() {
        DeltaDecoder deltaDecoder;
        synchronized (this.write) {
            deltaDecoder = new DeltaDecoder(this.read.getInt("num_failed_fetches", 0), new Date(this.read.getLong("backoff_end_time_in_millis", -1L)), 8);
        }
        return deltaDecoder;
    }

    public final void write(int i, Date date) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.read.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public AndroidComposeViewCompanion(SharedPreferences sharedPreferences) {
        this.read = sharedPreferences;
    }

    public final HashMap read() {
        try {
            JSONObject jSONObject = new JSONObject(this.read.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
