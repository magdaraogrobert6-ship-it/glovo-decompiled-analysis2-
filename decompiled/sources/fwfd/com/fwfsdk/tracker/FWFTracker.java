package fwfd.com.fwfsdk.tracker;

import com.google.gson.JsonObject;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface FWFTracker {
    void trackEvent(JsonObject jsonObject, FWFFlagData fWFFlagData);

    void trackEvents(JsonObject jsonObject, List<FWFFlagData> list);
}
