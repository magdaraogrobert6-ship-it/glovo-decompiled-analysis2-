package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzek;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzp();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zza;

    @InitialTrigger
    private final int zzb;
    private final String zzc;

    public static final class Builder {
        private final List zza = new ArrayList();

        @InitialTrigger
        private int zzb = 5;

        public GeofencingRequest build() {
            accessgetSystemNavigationDowncp.write("No geofence has been added to this request.", !this.zza.isEmpty());
            return new GeofencingRequest(new ArrayList(this.zza), this.zzb, null);
        }

        public Builder setInitialTrigger(int i) {
            this.zzb = i & 7;
            return this;
        }

        public Builder addGeofence(Geofence geofence) {
            accessgetSystemNavigationDowncp.write("Geofence must be created using Geofence.Builder.", geofence instanceof zzek);
            this.zza.add((zzek) geofence);
            return this;
        }

        public Builder addGeofences(List<? extends Geofence> list) {
            Iterator<? extends Geofence> it = list.iterator();
            while (it.hasNext()) {
                addGeofence(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public @interface InitialTrigger {
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    public List<Geofence> getGeofences() {
        return new ArrayList(this.zza);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        int length = strValueOf.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(i).length() + 1);
        sb.append("GeofencingRequest[geofences=");
        sb.append(strValueOf);
        sb.append(", initialTrigger=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public GeofencingRequest(List list, int i, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IOException {
        List list = this.zza;
        int i2 = SQLite.read(20293, parcel);
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -36608637, new Object[]{parcel, 1, list}, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        int initialTrigger = getInitialTrigger();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(initialTrigger);
        SQLite.serializer(parcel, 4, this.zzc);
        SQLite.serializer(i2, parcel);
    }
}
