package com.sentiance.sdk.eventtimeline.timelines.creators;

import android.annotation.SuppressLint;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.Card;
import o.r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE;

/* JADX INFO: loaded from: classes3.dex */
public enum TransportChangeType {
    STATIONARY(0),
    OFF_THE_GRID(1),
    TRANSPORT_BIKING(2),
    TRANSPORT_TRAM(3),
    TRANSPORT_CAR(4),
    TRANSPORT_TRAIN(5),
    TRANSPORT_WALKING(6),
    TRANSPORT_RUNNING(7),
    TRANSPORT_BUS(8),
    TRANSPORT_ON_FOOT(9),
    TRANSPORT_VEHICLE(10),
    TRANSPORT_RAIL(11),
    TRANSPORT_UNKNOWN(12),
    TRANSPORT_MOTORCYCLE(13),
    TRANSPORT_IDLE(14);

    public final int value;

    public boolean isMotorcycleTransport() {
        return this == TRANSPORT_MOTORCYCLE;
    }

    public static List<TransportChangeType> getTransportChangeTypes(TransportMode transportMode) {
        int i = 0;
        switch (Card.write[transportMode.ordinal()]) {
            case 1:
                Object[] objArr = {TRANSPORT_BIKING};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return Collections.unmodifiableList(arrayList);
            case 2:
                Object[] objArr2 = {TRANSPORT_RUNNING};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                return Collections.unmodifiableList(arrayList2);
            case 3:
                Object[] objArr3 = {TRANSPORT_WALKING, TRANSPORT_ON_FOOT};
                ArrayList arrayList3 = new ArrayList(2);
                while (i < 2) {
                    Object obj3 = objArr3[i];
                    Objects.requireNonNull(obj3);
                    arrayList3.add(obj3);
                    i++;
                }
                return Collections.unmodifiableList(arrayList3);
            case 4:
                Object[] objArr4 = {TRANSPORT_TRAIN, TRANSPORT_RAIL};
                ArrayList arrayList4 = new ArrayList(2);
                while (i < 2) {
                    Object obj4 = objArr4[i];
                    Objects.requireNonNull(obj4);
                    arrayList4.add(obj4);
                    i++;
                }
                return Collections.unmodifiableList(arrayList4);
            case 5:
                Object[] objArr5 = {TRANSPORT_TRAM};
                ArrayList arrayList5 = new ArrayList(1);
                Object obj5 = objArr5[0];
                Objects.requireNonNull(obj5);
                arrayList5.add(obj5);
                return Collections.unmodifiableList(arrayList5);
            case 6:
                Object[] objArr6 = {TRANSPORT_MOTORCYCLE};
                ArrayList arrayList6 = new ArrayList(1);
                Object obj6 = objArr6[0];
                Objects.requireNonNull(obj6);
                arrayList6.add(obj6);
                return Collections.unmodifiableList(arrayList6);
            case 7:
                Object[] objArr7 = {TRANSPORT_CAR, TRANSPORT_VEHICLE};
                ArrayList arrayList7 = new ArrayList(2);
                while (i < 2) {
                    Object obj7 = objArr7[i];
                    Objects.requireNonNull(obj7);
                    arrayList7.add(obj7);
                    i++;
                }
                return Collections.unmodifiableList(arrayList7);
            case 8:
                Object[] objArr8 = {TRANSPORT_BUS};
                ArrayList arrayList8 = new ArrayList(1);
                Object obj8 = objArr8[0];
                Objects.requireNonNull(obj8);
                arrayList8.add(obj8);
                return Collections.unmodifiableList(arrayList8);
            case 9:
                Object[] objArr9 = {TRANSPORT_UNKNOWN};
                ArrayList arrayList9 = new ArrayList(1);
                Object obj9 = objArr9[0];
                Objects.requireNonNull(obj9);
                arrayList9.add(obj9);
                return Collections.unmodifiableList(arrayList9);
            case 10:
                Object[] objArr10 = {TRANSPORT_IDLE};
                ArrayList arrayList10 = new ArrayList(1);
                Object obj10 = objArr10[0];
                Objects.requireNonNull(obj10);
                arrayList10.add(obj10);
                return Collections.unmodifiableList(arrayList10);
            default:
                return Collections.EMPTY_LIST;
        }
    }

    public boolean isOfTypeTransport() {
        int i = this.value;
        return i >= TRANSPORT_BIKING.value && i <= TRANSPORT_IDLE.value;
    }

    public boolean isVehicleTransport() {
        int i = Card.read[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    @SuppressLint
    public ClassifiedTransportMode toClassifiedTransportMode() {
        switch (Card.read[ordinal()]) {
            case 1:
                return ClassifiedTransportMode.CAR;
            case 2:
                return ClassifiedTransportMode.BUS;
            case 3:
                return ClassifiedTransportMode.VEHICLE;
            case 4:
                return ClassifiedTransportMode.MOTORCYCLE;
            case 5:
                return ClassifiedTransportMode.BIKING;
            case 6:
                return ClassifiedTransportMode.TRAM;
            case 7:
                return ClassifiedTransportMode.TRAIN;
            case 8:
                return ClassifiedTransportMode.WALKING;
            case 9:
                return ClassifiedTransportMode.RUNNING;
            case 10:
                return ClassifiedTransportMode.ON_FOOT;
            case 11:
                return ClassifiedTransportMode.RAIL;
            case 12:
                return ClassifiedTransportMode.UNKNOWN;
            case 13:
                return ClassifiedTransportMode.IDLE;
            default:
                throw new RuntimeException("Can't map TransportChangeType " + name() + " to a ClassifiedTransportMode");
        }
    }

    TransportChangeType(int i) {
        this.value = i;
    }

    public static TransportChangeType fromTransportModeEventConstant(byte b) {
        if (b == 3) {
            return TRANSPORT_BIKING;
        }
        if (b == 6) {
            return TRANSPORT_TRAM;
        }
        if (b == 2) {
            return TRANSPORT_CAR;
        }
        if (b == 5) {
            return TRANSPORT_TRAIN;
        }
        if (b == 13) {
            return TRANSPORT_WALKING;
        }
        if (b == 11) {
            return TRANSPORT_RUNNING;
        }
        if (b == 7) {
            return TRANSPORT_BUS;
        }
        if (b == 4) {
            return TRANSPORT_ON_FOOT;
        }
        if (b == 14) {
            return TRANSPORT_VEHICLE;
        }
        if (b == 15) {
            return TRANSPORT_RAIL;
        }
        if (b == 1) {
            return TRANSPORT_UNKNOWN;
        }
        if (b == 16) {
            return TRANSPORT_MOTORCYCLE;
        }
        if (b == 12) {
            return TRANSPORT_IDLE;
        }
        return null;
    }

    @SuppressLint
    public static TransportChangeType findByValue(int i) {
        for (TransportChangeType transportChangeType : values()) {
            if (transportChangeType.value == i) {
                return transportChangeType;
            }
        }
        throw new SdkException(i + " is not mapped to any TransportChangeType type");
    }

    public static TransportChangeType fromClassifiedTransportMode(ClassifiedTransportMode classifiedTransportMode) {
        return fromTransportModeEventConstant(classifiedTransportMode.toEventConstant().byteValue());
    }

    public static TransportChangeType fromTransportState(r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE r8lambdaxwjhgohsivq1p7ngkxwrhunwe) {
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.IconCompatParcelizer != null) {
            return STATIONARY;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.RemoteActionCompatParcelizer != null) {
            return OFF_THE_GRID;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.serializer != null) {
            return TRANSPORT_BIKING;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaDescriptionCompat != null) {
            return TRANSPORT_TRAM;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.RatingCompat != null) {
            return TRANSPORT_CAR;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaMetadataCompat != null) {
            return TRANSPORT_TRAIN;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.read != null) {
            return TRANSPORT_WALKING;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaBrowserCompatMediaItem != null) {
            return TRANSPORT_RUNNING;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaSessionCompatQueueItem != null) {
            return TRANSPORT_BUS;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.PlaybackStateCompatCustomAction != null) {
            return TRANSPORT_ON_FOOT;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.ParcelableVolumeInfo != null) {
            return TRANSPORT_VEHICLE;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaSessionCompatToken != null) {
            return TRANSPORT_RAIL;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.ResultReceiver != null) {
            return TRANSPORT_UNKNOWN;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
            return TRANSPORT_MOTORCYCLE;
        }
        if (r8lambdaxwjhgohsivq1p7ngkxwrhunwe.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            return TRANSPORT_IDLE;
        }
        return null;
    }

    public boolean isOffTheGridOrStationary() {
        return this == STATIONARY || this == OFF_THE_GRID;
    }
}
