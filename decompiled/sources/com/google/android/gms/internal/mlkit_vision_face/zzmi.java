package com.google.android.gms.internal.mlkit_vision_face;

import com.google.gson.JsonElement;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmi {
    public static final boolean isEVRoute(Map map) {
        String asString;
        JsonElement jsonElement;
        if (map == null || (jsonElement = (JsonElement) map.get("engine")) == null) {
            asString = null;
        } else {
            try {
                asString = jsonElement.getAsString();
            } catch (Throwable unused) {
                asString = null;
            }
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{asString, "electric"}, getCieXyz.write())).booleanValue();
    }
}
