package o;

import android.util.Pair;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY {
    private static final HashMap IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private final r8lambdablVN5nNNlkpbL0jtfBN_gCBPM8M MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final Runnable MediaSessionCompatResultReceiverWrapper = new r8lambdaG4tr7zFDrCfVDbKe3Qxfp5j1yo4(this);
    private final migrateTriggersReeligibilityToJsonlambda1<Set<r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c>> RatingCompat = new r8lambdaaOwv_T_z3tffAGD8uDVZn4C80(this);
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 serializer;
    private final com.sentiance.sdk.util.c write;

    private Pair<Byte, Integer> write() {
        synchronized (this) {
            Byte bValueOf = null;
            Long lValueOf = null;
            Integer num = null;
            for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : this.RatingCompat.read()) {
                long jSerializer = r8lambdatlpfyipshywk_bssf3n2g7hro2c.serializer();
                Integer num2 = (Integer) IconCompatParcelizer.get(Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read()));
                if (num2 != null && (lValueOf == null || jSerializer < lValueOf.longValue())) {
                    bValueOf = Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read());
                    lValueOf = Long.valueOf(jSerializer);
                    num = num2;
                }
            }
            if (bValueOf == null) {
                return null;
            }
            long jLongValue = lValueOf.longValue();
            long jIntValue = num.intValue();
            this.MediaSessionCompatQueueItem.getClass();
            return new Pair<>(bValueOf, Integer.valueOf((int) ((jLongValue + jIntValue) - System.currentTimeMillis())));
        }
    }

    public final boolean IconCompatParcelizer(byte b) {
        synchronized (this) {
            Integer num = (Integer) IconCompatParcelizer.get(Byte.valueOf(b));
            boolean z = false;
            if (num == null) {
                return false;
            }
            r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(b);
            if (r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer != null) {
                long jSerializer = r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.serializer();
                long jIntValue = num.intValue();
                this.MediaSessionCompatQueueItem.getClass();
                if (jSerializer + jIntValue <= System.currentTimeMillis()) {
                    z = true;
                }
            }
            return z;
        }
    }

    static {
        HashMap map = new HashMap();
        IconCompatParcelizer = map;
        map.put((byte) 2, 10000);
        map.put((byte) 5, 30000);
        map.put((byte) 11, 30000);
        map.put((byte) 10, 30000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(boolean z) {
        synchronized (this) {
            this.read.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
            if (this.MediaBrowserCompatMediaItem) {
                Pair<Byte, Integer> pairWrite = write();
                int i = 0;
                if (pairWrite != null) {
                    this.MediaSessionCompatQueueItem.getClass();
                    String strC = com.sentiance.sdk.util.x.c(System.currentTimeMillis() + ((long) ((Integer) pairWrite.second).intValue()));
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Scheduling overdue snoozed OTG notification at " + strC, new Object[0]);
                    int iIntValue = ((Integer) pairWrite.second).intValue();
                    if (!z) {
                        i = 1000;
                    }
                    this.read.serializer(this.MediaSessionCompatResultReceiverWrapper, Math.max(iIntValue, i));
                    if (!this.MediaMetadataCompat) {
                        this.MediaMetadataCompat = true;
                        this.serializer.read();
                    }
                } else if (this.MediaMetadataCompat) {
                    this.MediaMetadataCompat = false;
                    this.serializer.IconCompatParcelizer();
                }
            }
        }
    }

    private void serializer() {
        JSONObject jSONObjectRemoteActionCompatParcelizer;
        Set<r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c> set = this.RatingCompat.read();
        JSONArray jSONArray = new JSONArray();
        for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : set) {
            try {
                jSONObjectRemoteActionCompatParcelizer = r8lambdatlpfyipshywk_bssf3n2g7hro2c.RemoteActionCompatParcelizer();
            } catch (JSONException e) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, m1$$ExternalSyntheticOutline0.m(r8lambdatlpfyipshywk_bssf3n2g7hro2c, "Failed to serialize SnoozedOffTheGrid object: "), new Object[0]);
                jSONObjectRemoteActionCompatParcelizer = null;
            }
            if (jSONObjectRemoteActionCompatParcelizer != null) {
                jSONArray.put(jSONObjectRemoteActionCompatParcelizer);
            }
        }
        this.write.RemoteActionCompatParcelizer("snoozed_otgs", jSONArray.toString());
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem = false;
            if (this.MediaMetadataCompat) {
                this.MediaMetadataCompat = false;
                this.serializer.IconCompatParcelizer();
            }
            this.RatingCompat.write();
            this.write.read("snoozed_otgs");
            this.read.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        }
    }

    public static HashSet IconCompatParcelizer(r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy) {
        r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c;
        parseLonglambda0 parselonglambda0 = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer;
        String strWrite = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.write.write("snoozed_otgs", (String) null);
        if (strWrite == null) {
            return new HashSet();
        }
        try {
            JSONArray jSONArray = new JSONArray(strWrite);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                try {
                    r8lambdatlpfyipshywk_bssf3n2g7hro2c = new r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c((JSONObject) obj);
                } catch (JSONException e) {
                    r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to deserialize Snooze OTG: " + obj, new Object[0]);
                    r8lambdatlpfyipshywk_bssf3n2g7hro2c = null;
                }
                if (r8lambdatlpfyipshywk_bssf3n2g7hro2c != null) {
                    arrayList.add(r8lambdatlpfyipshywk_bssf3n2g7hro2c);
                }
            }
            parselonglambda0.IconCompatParcelizer("Loaded the following snoozed OTGs: " + arrayList.toString(), new Object[0]);
            return new HashSet(arrayList);
        } catch (JSONException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to deserialize the snoozed OTG list: ".concat(strWrite), new Object[0]);
            return new HashSet();
        }
    }

    public r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdablVN5nNNlkpbL0jtfBN_gCBPM8M r8lambdablvn5nnnlkpbl0jtfbn_gcbpm8m) {
        this.write = cVar;
        this.serializer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = r8lambdablvn5nnnlkpbl0jtfbn_gcbpm8m;
    }

    public final void read() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem = true;
            IconCompatParcelizer(true);
        }
    }

    public final void read(byte b, long j, boolean z) {
        synchronized (this) {
            if (IconCompatParcelizer.containsKey(Byte.valueOf(b))) {
                r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c = new r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(b, j, z);
                this.RatingCompat.read().remove(r8lambdatlpfyipshywk_bssf3n2g7hro2c);
                this.RatingCompat.read().add(r8lambdatlpfyipshywk_bssf3n2g7hro2c);
                serializer();
                IconCompatParcelizer(false);
            }
        }
    }

    public final r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c RemoteActionCompatParcelizer(byte b) {
        for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : this.RatingCompat.read()) {
            if (r8lambdatlpfyipshywk_bssf3n2g7hro2c.read() == b) {
                return r8lambdatlpfyipshywk_bssf3n2g7hro2c;
            }
        }
        return null;
    }

    public final boolean write(byte b, long j) {
        synchronized (this) {
            Integer num = (Integer) IconCompatParcelizer.get(Byte.valueOf(b));
            if (num == null) {
                return false;
            }
            long jIntValue = num.intValue();
            this.MediaSessionCompatQueueItem.getClass();
            return !(j + jIntValue <= System.currentTimeMillis());
        }
    }

    public final void serializer(byte b) {
        synchronized (this) {
            if (this.RatingCompat.read().remove(new r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(b, 0L, false))) {
                serializer();
                IconCompatParcelizer(false);
            }
        }
    }

    public final ArrayList IconCompatParcelizer() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.RatingCompat.read());
        }
        return arrayList;
    }
}
