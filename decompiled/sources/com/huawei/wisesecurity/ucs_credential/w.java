package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.TransitionValuesMaps;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import o.Role;
import o.accessgetButtoncp;
import o.accessgetDropdownListcp;
import o.accessgetRadioButtoncp;
import o.accessgetSwitchcp;
import o.getSteps;
import o.prune;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static void a(Context context, String str) {
        try {
            TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(str);
            accessgetRadioButtoncp.read(context, transitionValuesMaps);
            UcsLib.ucsUpdateRootKey(accessgetButtoncp.IconCompatParcelizer(0, ((prune) transitionValuesMaps.MediaDescriptionCompat).RemoteActionCompatParcelizer), 32);
            SpUtil.putInt(context, ((prune) transitionValuesMaps.MediaDescriptionCompat).IconCompatParcelizer, "Local-C1-Version");
        } catch (Throwable th) {
            String string = SpUtil.getInstance(context).getString("ucscomponent.jws", null);
            if (TextUtils.isEmpty(string) || !new File(string).exists()) {
                getSteps.read("KeyComponentLocalHandler", "tryToDeleteFile failed, file not exists.", new Object[0]);
            } else {
                try {
                    boolean zDelete = new File(string).delete();
                    getSteps.read("KeyComponentLocalHandler", zDelete ? "deleteFile success." : "deleteFile failed.", new Object[0]);
                    if (zDelete) {
                        SpUtil.getInstance(context).edit().putLong("Last-Query-Time_ucscomponent_ucscomponent.jws", 0L).apply();
                        SpUtil.putString(context, "ucscomponent.jws", "");
                        SpUtil.putString(context, "ETag_ucscomponent", "");
                        SpUtil.putString(context, "Last-Modified_ucscomponent", "");
                    }
                } catch (Throwable th2) {
                    getSteps.serializer("KeyComponentLocalHandler", "deleteFile failed, {0}", th2.getMessage());
                }
            }
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("verify jws error, ");
            sbIconCompatParcelizer.append(th.getMessage());
            String string2 = sbIconCompatParcelizer.toString();
            throw accessgetDropdownListcp.IconCompatParcelizer("KeyComponentLocalHandler", string2, new Object[0], 1012L, string2);
        }
    }

    public static void a(Context context) {
        String string = SpUtil.getInstance(context).getString("ucscomponent.jws", null);
        if (string == null || !new File(string).exists()) {
            MapboxMap$$ExternalSyntheticLambda0.m(1009L, "Init component from local failed, file error");
            return;
        }
        getSteps.read("KeyComponentLocalHandler", "Start init data =  component through local file", new Object[0]);
        try {
            FileInputStream fileInputStream = new FileInputStream(string);
            try {
                a(context, Role.IconCompatParcelizer(fileInputStream));
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Init data failed, msg = ");
            sbIconCompatParcelizer.append(e.getMessage());
            String string2 = sbIconCompatParcelizer.toString();
            throw accessgetDropdownListcp.IconCompatParcelizer("KeyComponentLocalHandler", string2, new Object[0], 1009L, string2);
        }
    }
}
