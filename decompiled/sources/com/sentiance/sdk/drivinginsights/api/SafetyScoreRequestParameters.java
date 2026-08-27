package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.registerGeofenceslambda20;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class SafetyScoreRequestParameters {
    private final OccupantRoles mOccupantRoles;
    private final Period mPeriod;
    private final TransportModes mTransportModes;

    @DontObfuscate
    public static class OccupantRoles {
        private final List<OccupantRole> mRoles;

        public List<OccupantRole> getRoles() {
            return this.mRoles;
        }

        public static OccupantRoles all() {
            OccupantRole[] occupantRoleArrValues = OccupantRole.values();
            ArrayList arrayList = new ArrayList(occupantRoleArrValues.length);
            for (OccupantRole occupantRole : occupantRoleArrValues) {
                Objects.requireNonNull(occupantRole);
                arrayList.add(occupantRole);
            }
            return new OccupantRoles(Collections.unmodifiableList(arrayList));
        }

        private OccupantRoles(List<OccupantRole> list) {
            this.mRoles = list;
        }

        public static OccupantRoles some(OccupantRole... occupantRoleArr) {
            ArrayList arrayList = new ArrayList(occupantRoleArr.length);
            for (OccupantRole occupantRole : occupantRoleArr) {
                Objects.requireNonNull(occupantRole);
                arrayList.add(occupantRole);
            }
            return new OccupantRoles(Collections.unmodifiableList(arrayList));
        }
    }

    @DontObfuscate
    public enum Period {
        LAST_7_DAYS,
        LAST_14_DAYS,
        LAST_30_DAYS;

        public long toMillis() {
            int i = registerGeofenceslambda20.write[ordinal()];
            if (i == 1) {
                return 604800000L;
            }
            if (i != 2) {
                return i != 3 ? 0L : 2592000000L;
            }
            return 1209600000L;
        }
    }

    @DontObfuscate
    public static class TransportModes {
        private final List<TransportMode> mModes;

        public List<TransportMode> getModes() {
            return this.mModes;
        }

        public static TransportModes all() {
            TransportMode[] transportModeArrValues = TransportMode.values();
            ArrayList arrayList = new ArrayList(transportModeArrValues.length);
            for (TransportMode transportMode : transportModeArrValues) {
                Objects.requireNonNull(transportMode);
                arrayList.add(transportMode);
            }
            return new TransportModes(Collections.unmodifiableList(arrayList));
        }

        private TransportModes(List<TransportMode> list) {
            this.mModes = list;
        }

        public static TransportModes some(TransportMode... transportModeArr) {
            ArrayList arrayList = new ArrayList(transportModeArr.length);
            for (TransportMode transportMode : transportModeArr) {
                Objects.requireNonNull(transportMode);
                arrayList.add(transportMode);
            }
            return new TransportModes(Collections.unmodifiableList(arrayList));
        }
    }

    public OccupantRoles getOccupantRoles() {
        return this.mOccupantRoles;
    }

    public Period getPeriod() {
        return this.mPeriod;
    }

    public TransportModes getTransportModes() {
        return this.mTransportModes;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @DontObfuscate
    public static class Builder {
        private final Period mPeriod;
        private TransportModes mTransportModes = TransportModes.all();
        private OccupantRoles mOccupantRoles = OccupantRoles.all();

        public Builder setOccupantRoles(OccupantRoles occupantRoles) {
            this.mOccupantRoles = occupantRoles;
            return this;
        }

        public Builder setTransportModes(TransportModes transportModes) {
            this.mTransportModes = transportModes;
            return this;
        }

        public Builder(Period period) {
            this.mPeriod = period;
        }

        public SafetyScoreRequestParameters build() {
            return new SafetyScoreRequestParameters(this, null);
        }
    }

    private SafetyScoreRequestParameters(Builder builder) {
        this.mPeriod = builder.mPeriod;
        this.mTransportModes = builder.mTransportModes;
        this.mOccupantRoles = builder.mOccupantRoles;
    }

    public /* synthetic */ SafetyScoreRequestParameters(Builder builder, registerGeofenceslambda20 registergeofenceslambda20) {
        this(builder);
    }
}
