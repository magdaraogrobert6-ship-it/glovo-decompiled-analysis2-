package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.dispatchRotaryEvent;
import o.getNumPad0EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;
    private static final StringBuilder zzd;

    static {
        Locale locale = Locale.ROOT;
        zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb) {
        String string;
        sb.ensureCapacity(100);
        if (location == null) {
            sb.append((String) null);
            return sb;
        }
        sb.append("{");
        sb.append(location.getProvider());
        sb.append(", ");
        if (Build.VERSION.SDK_INT >= 31 ? dispatchRotaryEvent.read(location) : location.isFromMockProvider()) {
            sb.append("mock, ");
        }
        DecimalFormat decimalFormat = zzb;
        sb.append(decimalFormat.format(location.getLatitude()));
        sb.append(",");
        sb.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb.append("±");
            sb.append(zzc.format(location.getAccuracy()));
            sb.append("m");
        }
        if (location.hasAltitude()) {
            sb.append(", alt=");
            DecimalFormat decimalFormat2 = zzc;
            sb.append(decimalFormat2.format(location.getAltitude()));
            if (location.hasVerticalAccuracy()) {
                sb.append("±");
                sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
            }
            sb.append("m");
        }
        if (location.hasSpeed()) {
            sb.append(", spd=");
            DecimalFormat decimalFormat3 = zzc;
            sb.append(decimalFormat3.format(location.getSpeed()));
            if (location.hasSpeedAccuracy()) {
                sb.append("±");
                sb.append(decimalFormat3.format(location.getSpeedAccuracyMetersPerSecond()));
            }
            sb.append("m/s");
        }
        if (location.hasBearing()) {
            sb.append(", brg=");
            DecimalFormat decimalFormat4 = zzc;
            sb.append(decimalFormat4.format(location.getBearing()));
            if (location.hasBearingAccuracy()) {
                sb.append("±");
                sb.append(decimalFormat4.format(location.getBearingAccuracyDegrees()));
            }
            sb.append("°");
        }
        Bundle extras = location.getExtras();
        String string2 = extras != null ? extras.getString("floorLabel") : null;
        if (string2 != null) {
            sb.append(", fl=");
            sb.append(string2);
        }
        Bundle extras2 = location.getExtras();
        String string3 = extras2 != null ? extras2.getString("levelId") : null;
        if (string3 != null) {
            sb.append(", lv=");
            sb.append(string3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sb.append(", ert=");
        long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + (jCurrentTimeMillis - jElapsedRealtime);
        if (elapsedRealtimeNanos >= 0) {
            string = getNumPad0EK5gGoQ.IconCompatParcelizer.format(new Date(elapsedRealtimeNanos));
        } else {
            SimpleDateFormat simpleDateFormat = getNumPad0EK5gGoQ.IconCompatParcelizer;
            string = Long.toString(elapsedRealtimeNanos);
        }
        sb.append(string);
        sb.append('}');
        return sb;
    }
}
