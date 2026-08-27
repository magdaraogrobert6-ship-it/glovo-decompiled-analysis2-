package fwfd.com.fwfsdk.tracker;

import com.google.gson.JsonObject;
import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.model.db.FWFResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FWFTrackManager {
    private FWFFlagData buildFlagData(String str, FWFResult fWFResult, Map<String, String> map) {
        return new FWFFlagData(str, fWFResult.getVariation(), fWFResult.getAbtest(), fWFResult.getTrackerServices(), fWFResult.getExplanationKind(), map);
    }

    public void trackEvents(JsonObject jsonObject, HashMap<String, FWFResult> map, Map<String, String> map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, FWFResult> entry : map.entrySet()) {
            arrayList.add(buildFlagData(entry.getKey(), entry.getValue(), map2));
        }
        Iterator<FWFTracker> it = FunWithFlags.getInstance().getTrackers().iterator();
        while (it.hasNext()) {
            it.next().trackEvents(jsonObject, arrayList);
        }
    }

    public void trackEvent(JsonObject jsonObject, String str, FWFResult fWFResult, Map<String, String> map) {
        Iterator<FWFTracker> it = FunWithFlags.getInstance().getTrackers().iterator();
        while (it.hasNext()) {
            it.next().trackEvent(jsonObject, buildFlagData(str, fWFResult, map));
        }
    }
}
