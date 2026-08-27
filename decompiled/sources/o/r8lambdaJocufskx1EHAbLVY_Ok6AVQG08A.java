package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A {
    private final migrateTriggersReeligibilityToJsonlambda1<Set<getGeofenceTransitionPendingIntent>> IconCompatParcelizer = new r8lambdaEYjrhwJHb36qWIxYM66DFysJknI(this);
    private final Context RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c serializer;
    private final parseLonglambda0 write;

    public static HashSet RemoteActionCompatParcelizer(r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A r8lambdajocufskx1ehablvy_ok6avqg08a) {
        HashSet hashSet;
        synchronized (r8lambdajocufskx1ehablvy_ok6avqg08a) {
            hashSet = new HashSet();
            for (String str : r8lambdajocufskx1ehablvy_ok6avqg08a.serializer.RemoteActionCompatParcelizer()) {
                try {
                    if (str.startsWith("alarm_cache_")) {
                        String strWrite = r8lambdajocufskx1ehablvy_ok6avqg08a.serializer.write(str, "");
                        if (!TextUtils.isEmpty(strWrite)) {
                            getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent = (getGeofenceTransitionPendingIntent) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(getGeofenceTransitionPendingIntent.class, strWrite);
                            getgeofencetransitionpendingintent.write(r8lambdajocufskx1ehablvy_ok6avqg08a.RemoteActionCompatParcelizer);
                            hashSet.add(getgeofencetransitionpendingintent);
                        }
                    }
                } catch (JSONException e) {
                    r8lambdajocufskx1ehablvy_ok6avqg08a.write.IconCompatParcelizer(false, e, "SdkAlarmCache :: Deserialization of alarm %s failed", str);
                }
            }
        }
        return hashSet;
    }

    public final getGeofenceTransitionPendingIntent RemoteActionCompatParcelizer(String str) {
        synchronized (this) {
            for (getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent : this.IconCompatParcelizer.read()) {
                if (str.equals(getgeofencetransitionpendingintent.IconCompatParcelizer())) {
                    return getgeofencetransitionpendingintent;
                }
            }
            return null;
        }
    }

    public final void write(getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        synchronized (this) {
            this.IconCompatParcelizer.read().remove(getgeofencetransitionpendingintent);
            this.IconCompatParcelizer.read().add(getgeofencetransitionpendingintent);
            if (getgeofencetransitionpendingintent.serializer()) {
                serializer(getgeofencetransitionpendingintent);
            } else {
                IconCompatParcelizer(getgeofencetransitionpendingintent);
            }
        }
    }

    private void serializer(getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        synchronized (this) {
            try {
                this.serializer.RemoteActionCompatParcelizer("alarm_cache_" + getgeofencetransitionpendingintent.IconCompatParcelizer(), getgeofencetransitionpendingintent.write());
            } catch (JSONException e) {
                this.write.IconCompatParcelizer(false, e, "SdkAlarmCache :: Unable to serialize alarm %s", getgeofencetransitionpendingintent.IconCompatParcelizer());
            }
        }
    }

    public r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, Context context) {
        this.RemoteActionCompatParcelizer = context;
        this.write = parselonglambda0;
        this.serializer = cVar;
    }

    private void IconCompatParcelizer(getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        synchronized (this) {
            this.serializer.read("alarm_cache_" + getgeofencetransitionpendingintent.IconCompatParcelizer());
        }
    }

    public final ArrayList write() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.IconCompatParcelizer.read());
        }
        return arrayList;
    }

    public final void read(getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        synchronized (this) {
            this.IconCompatParcelizer.read().remove(getgeofencetransitionpendingintent);
            IconCompatParcelizer(getgeofencetransitionpendingintent);
        }
    }

    public final void read() {
        synchronized (this) {
            this.IconCompatParcelizer.read().clear();
            this.serializer.read();
        }
    }
}
