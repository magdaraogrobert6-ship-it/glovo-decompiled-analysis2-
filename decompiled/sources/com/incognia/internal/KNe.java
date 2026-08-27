package com.incognia.internal;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KNe {
    public static final ArrayList x;
    public final UsU BGx;
    public final ArrayList HQ;
    public R1 N;
    public final MJf mbG;

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_FAST));
        }
        x = arrayList;
    }

    public KNe(NvL nvL, UsU usU, MJf mJf) {
        this.BGx = usU;
        this.mbG = mJf;
        String str = (String) W4i.hI.MediaSessionCompatResultReceiverWrapper();
        ArrayList arrayList = x;
        JSONArray jSONArrayOptJSONArray = ((JSONObject) nvL.BGx.get()).optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            try {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList2.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i)));
                }
                arrayList = arrayList2;
            } catch (JSONException unused) {
            }
        }
        this.HQ = arrayList;
    }
}
