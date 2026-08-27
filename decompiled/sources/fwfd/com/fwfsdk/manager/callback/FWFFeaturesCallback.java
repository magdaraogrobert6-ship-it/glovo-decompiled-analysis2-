package fwfd.com.fwfsdk.manager.callback;

import fwfd.com.fwfsdk.model.db.FWFResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public interface FWFFeaturesCallback {
    void onFwfResponse(HashMap<String, FWFResult> map);
}
