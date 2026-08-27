package com.deliveryhero.fwf_tracking.mapper;

import androidx.sqlite.SQLite;
import com.deliveryhero.fwf_tracking.model.Exposure;
import com.deliveryhero.fwf_tracking.model.ExposureMetadata;
import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import java.time.Clock;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getQueryParameterslambda2;
import o.setShouldNextUnregisterBeSkipped;

/* JADX INFO: loaded from: classes4.dex */
public final class ExposureMapper {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ExposureMetadata fromDomainExposureMetadata(FwFEventValue fwFEventValue) {
            return new ExposureMetadata(fwFEventValue.getBrand(), fwFEventValue.getSdkVersion(), fwFEventValue.getService(), fwFEventValue.getSessionId());
        }

        private Companion() {
        }

        public final Exposure fromDomainExposureEvent(FwFEventValue fwFEventValue) {
            fwFEventValue.getClass();
            setShouldNextUnregisterBeSkipped.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            instant.getClass();
            long jRemoteActionCompatParcelizer = new setShouldNextUnregisterBeSkipped(instant).RemoteActionCompatParcelizer();
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            return new Exposure(jRemoteActionCompatParcelizer, (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{fwFEventValue}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), fromDomainExposureMetadata(fwFEventValue));
        }
    }
}
