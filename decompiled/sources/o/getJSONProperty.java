package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.api.PotentialVehicleTransportStartListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.readBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class getJSONProperty {
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private getCooldownExitSecondsannotations serializer;
    private PotentialVehicleTransportStartListener write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final void IconCompatParcelizer(final PotentialVehicleTransportStartListener potentialVehicleTransportStartListener) {
        this.write = potentialVehicleTransportStartListener;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        if (potentialVehicleTransportStartListener == null) {
            getCooldownExitSecondsannotations getcooldownexitsecondsannotations = this.serializer;
            if (getcooldownexitsecondsannotations != null) {
                getanalyticsenabledenterannotations.read(getcooldownexitsecondsannotations);
                return;
            }
            return;
        }
        getCooldownExitSecondsannotations getcooldownexitsecondsannotations2 = new getCooldownExitSecondsannotations(this.RemoteActionCompatParcelizer, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.api.PotentialVehicleTransportStartNotifier$setListener$2
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                readBoolean.write(new ZM$$ExternalSyntheticLambda2(22, potentialVehicleTransportStartListener));
                return createFromParcel.INSTANCE;
            }
        });
        this.serializer = getcooldownexitsecondsannotations2;
        getanalyticsenabledenterannotations.read(ControlMessage.POTENTIAL_VEHICLE_TRANSPORT_START_DETECTED, getcooldownexitsecondsannotations2);
    }

    static {
        new read(null);
    }

    public getJSONProperty(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        this.read = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
    }
}
