package com.incognia.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class WU {
    public static final String HQ = (String) W4i.nE.MediaSessionCompatResultReceiverWrapper();
    public final Context BGx;
    public final NvL mbG;

    public final XD BGx() {
        int intExtra;
        boolean z = true;
        Intent intentBGx = !((JSONObject) this.mbG.BGx.get()).optBoolean(HQ, true) ? null : CUj.BGx(this.BGx, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
        if (intentBGx == null) {
            return null;
        }
        boolean booleanExtra = intentBGx.getBooleanExtra("present", false);
        int intExtra2 = intentBGx.getIntExtra("status", -1);
        if (intExtra2 != 2 && intExtra2 != 5) {
            z = false;
        }
        return new XD(booleanExtra, z, intentBGx.getIntExtra("plugged", 0), intentBGx.getIntExtra("health", 0), intentBGx.getIntExtra("level", -1), intentBGx.getIntExtra("scale", -1), ((double) intentBGx.getIntExtra("temperature", 0)) / 10.0d, intentBGx.getIntExtra("voltage", 0), intentBGx.getStringExtra("technology"), (!XUh.BGx(XUh.BGx, 34, 0, 2) || (intExtra = intentBGx.getIntExtra("android.os.extra.CYCLE_COUNT", -1)) == -1) ? null : Integer.valueOf(intExtra));
    }

    public WU(Context context, NvL nvL) {
        this.BGx = context;
        this.mbG = nvL;
    }
}
