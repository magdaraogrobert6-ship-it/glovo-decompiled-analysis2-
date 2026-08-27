package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GlobalParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public GlobalParameters deepCopy() {
        GlobalParameters globalParameters = new GlobalParameters();
        Map<String, String> map = this.callbackParameters;
        if (map != null) {
            globalParameters.callbackParameters = new HashMap(map);
        }
        Map<String, String> map2 = this.partnerParameters;
        if (map2 != null) {
            globalParameters.partnerParameters = new HashMap(map2);
        }
        return globalParameters;
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalParameters globalParameters = (GlobalParameters) obj;
        return Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }
}
