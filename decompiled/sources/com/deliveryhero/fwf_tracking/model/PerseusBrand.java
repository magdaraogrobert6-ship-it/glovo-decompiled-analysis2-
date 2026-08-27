package com.deliveryhero.fwf_tracking.model;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes2.dex */
public enum PerseusBrand {
    BAEMIN_KOREA("baemin-korea"),
    EFOOD("efood"),
    PANDORA("pandora"),
    TALABAT("talabat"),
    HUNGERSTATION("hungerstation"),
    PEDIDOSYA("pedidosya"),
    TESTBRAND("testbrand"),
    SERVICE("service"),
    INSTASHOP("instashop"),
    GLOVO("glovo"),
    RIDER_APP("rider-app"),
    BAEMIN_RIDER_APP("baemin-rider-app"),
    FINTECH("fintech"),
    VENDOR_SERVICE("vendor-service"),
    QCOMMERCE("qcommerce"),
    GLOBAL_SERVICE_EXPERIMENTS("global-service-experiments");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue$fwf_client_release() {
        return this.value;
    }

    PerseusBrand(String str) {
        this.value = str;
    }
}
