package com.braze.enums;

import bo.app.p2;
import coil3.util.UtilsKt;
import com.braze.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public enum BrazeSdkMetadata implements IPutIntoJson<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    REACTNATIVENEWARCH("rnna"),
    SEGMENT("sg"),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");

    private final String jsonKey;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final p2 Companion = new p2();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public static final JSONArray toJsonArray(EnumSet<BrazeSdkMetadata> enumSet) {
        Companion.getClass();
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(enumSet, 10));
        for (BrazeSdkMetadata brazeSdkMetadata : enumSet) {
            brazeSdkMetadata.getClass();
            arrayList.add(brazeSdkMetadata.jsonKey);
        }
        return new JSONArray((Collection) onContentCardDismissed.PlaybackStateCompatCustomAction(arrayList));
    }

    BrazeSdkMetadata(String str) {
        this.jsonKey = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.jsonKey;
    }
}
