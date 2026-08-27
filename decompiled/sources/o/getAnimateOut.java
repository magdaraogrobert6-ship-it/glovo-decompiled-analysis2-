package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "HarshScoresCalculatorV1")
public final class getAnimateOut {
    private final setExpirationTimestamp IconCompatParcelizer;
    private final Map<HarshDrivingEntryType, Double> RemoteActionCompatParcelizer;
    private final parseLonglambda0 write;

    public getAnimateOut(parseLonglambda0 parselonglambda0, setExpirationTimestamp setexpirationtimestamp) {
        parselonglambda0.getClass();
        setexpirationtimestamp.getClass();
        this.write = parselonglambda0;
        this.IconCompatParcelizer = setexpirationtimestamp;
        HarshDrivingEntryType harshDrivingEntryType = HarshDrivingEntryType.TURN;
        Double dValueOf = Double.valueOf(0.1d);
        this.RemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(harshDrivingEntryType, dValueOf), new onViewAttachedToWindowlambda0(HarshDrivingEntryType.BRAKING, dValueOf), new onViewAttachedToWindowlambda0(HarshDrivingEntryType.ACCELERATING, Double.valueOf(0.05d)));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    public final List<r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k> write(String str, long j, long j2, TransportChangeType transportChangeType) {
        SafetyScoreType safetyScoreType;
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k;
        int i;
        str.getClass();
        transportChangeType.getClass();
        boolean zIsMotorcycleTransport = transportChangeType.isMotorcycleTransport();
        ArrayList arrayListIconCompatParcelizer = setExpirationTimestamp.IconCompatParcelizer(this.IconCompatParcelizer, j, j2);
        ArrayList<r8lambdaToWEBn4vVR9WqvyA_znNRwHzM> arrayList = new ArrayList();
        for (Object obj : arrayListIconCompatParcelizer) {
            r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm = (r8lambdaToWEBn4vVR9WqvyA_znNRwHzM) obj;
            if ((zIsMotorcycleTransport && r8lambdatowebn4vvr9wqvya_znnrwhzm.RatingCompat() != null) || (!zIsMotorcycleTransport && r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaMetadataCompat() != null)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.write.IconCompatParcelizer(String.format("Skipping the harsh scores calculation for the transport %s: no harsh driving evaluations found.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            arrayList = null;
        }
        if (arrayList == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<HarshDrivingEntryType, Double> entry : this.RemoteActionCompatParcelizer.entrySet()) {
            HarshDrivingEntryType key = entry.getKey();
            double dDoubleValue = entry.getValue().doubleValue();
            int i2 = getAnimateIn.read[key.ordinal()];
            if (i2 == 1) {
                safetyScoreType = SafetyScoreType.HARSH_TURNING;
            } else if (i2 != 2) {
                safetyScoreType = i2 != 3 ? null : SafetyScoreType.HARSH_ACCELERATION;
            } else {
                safetyScoreType = SafetyScoreType.HARSH_BRAKING;
            }
            if (safetyScoreType == null) {
                r8lambdaljnxqufanckwlgxbv6bnxcttl0k = null;
            } else {
                if (safetyScoreType == SafetyScoreType.HARSH_TURNING && zIsMotorcycleTransport) {
                    safetyScoreType = null;
                }
                if (safetyScoreType != null) {
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm2 : arrayList) {
                            if ((zIsMotorcycleTransport ? r8lambdatowebn4vvr9wqvya_znnrwhzm2.RatingCompat() : r8lambdatowebn4vvr9wqvya_znnrwhzm2.MediaMetadataCompat()) == key && (i = i + 1) < 0) {
                                androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                                throw null;
                            }
                        }
                    }
                    r8lambdaljnxqufanckwlgxbv6bnxcttl0k = new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, safetyScoreType, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(1.0d - (dDoubleValue * ((double) i))));
                } else {
                    r8lambdaljnxqufanckwlgxbv6bnxcttl0k = null;
                }
            }
            if (r8lambdaljnxqufanckwlgxbv6bnxcttl0k != null) {
                arrayList2.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0k);
            }
        }
        return arrayList2;
    }
}
