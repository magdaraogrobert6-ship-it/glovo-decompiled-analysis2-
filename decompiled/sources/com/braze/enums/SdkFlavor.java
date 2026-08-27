package com.braze.enums;

import coil3.util.UtilsKt;
import com.braze.models.IPutIntoJson;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public enum SdkFlavor implements IPutIntoJson<String> {
    UNITY("unity"),
    REACT("react"),
    CORDOVA("cordova"),
    XAMARIN("xamarin"),
    FLUTTER("flutter"),
    SEGMENT("segment"),
    TEALIUM("tealium"),
    MPARTICLE("mparticle");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String jsonKey;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    SdkFlavor(String str) {
        this.jsonKey = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.jsonKey;
    }
}
