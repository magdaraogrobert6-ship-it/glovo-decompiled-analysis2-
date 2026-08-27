package fwfd.com.fwfsdk.model.db;

import android.util.Patterns;
import com.google.gson.JsonObject;
import fwfd.com.fwfsdk.util.FWFHelper;
import fwfd.com.fwfsdk.util.FWFLogger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class FWFUserAttributes {
    private JsonObject custom = new JsonObject();
    private String email;
    private String googleClientId;
    private String userId;

    public JsonObject getCustom() {
        return this.custom;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGoogleClientId() {
        return this.googleClientId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setGoogleClientId(String str) {
        this.googleClientId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean existAttributeWithValue(String str) {
        Iterator<String> it = this.custom.keySet().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return this.custom.get(str) != null;
            }
        }
        return false;
    }

    public void removeAttribute(String str) {
        if (str.equals("fwfOSVersion") || str.equals("fwfDeviceOS")) {
            return;
        }
        this.custom.remove(str);
    }

    public void setCustom(JsonObject jsonObject) {
        this.custom = jsonObject;
        setFwFCustomAttributes();
    }

    private void setFwFCustomAttributes() {
        this.custom.addProperty("fwfOSVersion", FWFHelper.fwfOSVersion);
        this.custom.addProperty("fwfDeviceOS", FWFHelper.fwfDeviceOS);
    }

    public void setAppVersion(String str, String str2) {
        if (this.custom != null) {
            if (!Patterns.IP_ADDRESS.matcher(str2).matches()) {
                FWFLogger.logError("Format Error AppVersion");
            }
            this.custom.addProperty(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public void setAttribute(String str, String str2) {
        byte b;
        if (this.custom != null) {
            str.getClass();
            int iHashCode = str.hashCode();
            if (iHashCode != -836030906) {
                if (iHashCode != 96619420) {
                    if (iHashCode == 1360113567 && str.equals("googleClientId")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("email")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("userId")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                setUserId(str2);
                return;
            }
            if (b == 1) {
                setEmail(str2);
            } else if (b != 2) {
                this.custom.addProperty(str, str2);
            } else {
                setGoogleClientId(str2);
            }
        }
    }

    public void setIpAddress(String str, String str2) {
        if (this.custom != null) {
            if (!Patterns.IP_ADDRESS.matcher(str2).matches()) {
                FWFLogger.logError("Format error IP");
            }
            this.custom.addProperty(str, str2);
        }
    }

    public FWFUserAttributes() {
        setFwFCustomAttributes();
    }

    public void setAttribute(String str, boolean z) {
        JsonObject jsonObject = this.custom;
        if (jsonObject != null) {
            jsonObject.addProperty(str, Boolean.valueOf(z));
        }
    }

    public void setAttribute(String str, float f) {
        JsonObject jsonObject = this.custom;
        if (jsonObject != null) {
            jsonObject.addProperty(str, Float.valueOf(f));
        }
    }

    public void setAttribute(String str, int i) {
        JsonObject jsonObject = this.custom;
        if (jsonObject != null) {
            jsonObject.addProperty(str, Integer.valueOf(i));
        }
    }
}
