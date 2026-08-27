package com.deliveryhero.fwf_evaluator.model;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.util.ConstantsKt;
import com.deliveryhero.fwf_evaluator.util.SHA256Kt;
import com.deliveryhero.fwf_http.PlatformKt;
import com.deliveryhero.fwf_util.ConcurrentMap;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class User {
    private String authUserId;
    private final ConcurrentMap<String, Object> custom;
    private String email;
    private List<String> heroDomains;
    private String sessionId;
    private String unAuthUserId;

    private final ConcurrentMap<String, Object> component5() {
        return this.custom;
    }

    public final String component1() {
        return this.authUserId;
    }

    public final String component2() {
        return this.unAuthUserId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4$fwf_client_release() {
        return this.email;
    }

    public final String getAuthUserId() {
        return this.authUserId;
    }

    public final String getEmail$fwf_client_release() {
        return this.email;
    }

    public final List<String> getHeroDomains$fwf_client_release() {
        return this.heroDomains;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUnAuthUserId() {
        return this.unAuthUserId;
    }

    public final void setAuthUserId(String str) {
        this.authUserId = str;
    }

    public final void setEmail$fwf_client_release(String str) {
        this.email = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setUnAuthUserId(String str) {
        this.unAuthUserId = str;
    }

    private final String selectIdentifier(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return (str2 == null || str2.length() <= 0) ? "" : str2;
        }
        return str;
    }

    public final Map<String, Object> getAttributes() {
        return this.custom.snapshot$fwf_client_release();
    }

    public final Map<String, Object> getEvaluatedUserAttributes$fwf_client_release(Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authUserId", this.authUserId);
        linkedHashMap.put("unAuthUserId", this.unAuthUserId);
        if (set != null) {
            for (String str : set) {
                linkedHashMap.put(str, this.custom.get$fwf_client_release(str));
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str = this.authUserId;
        String str2 = this.unAuthUserId;
        String str3 = this.sessionId;
        String str4 = this.email;
        ConcurrentMap<String, Object> concurrentMap = this.custom;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("User(authUserId=", str, ", unAuthUserId=", str2, ", sessionId=");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", email=", str4, ", custom=");
        sbM.append(concurrentMap);
        sbM.append(")");
        return sbM.toString();
    }

    public final String getIdentifier$fwf_client_release(boolean z) {
        if (z) {
            return selectIdentifier(this.authUserId, this.unAuthUserId);
        }
        if (!z) {
            return selectIdentifier(this.unAuthUserId, this.authUserId);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public final void removeAttribute(String str) {
        str.getClass();
        this.custom.remove$fwf_client_release(str);
    }

    public final void setAttribute(String str, Object obj) {
        str.getClass();
        obj.getClass();
        if (isValidAttribute(obj)) {
            this.custom.put$fwf_client_release(str, obj);
        }
    }

    public final void setEmail(String str) {
        str.getClass();
        this.email = PlatformKt.getPlatform().isServer() ? str : SHA256Kt.sha256(setCarryoverInAppMessage.RatingCompat(str)).getHex();
        this.custom.put$fwf_client_release(ConstantsKt.FWF_USER_ATTRIBUTE_STAFF, Boolean.valueOf(this.heroDomains.contains(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str, "@", str))));
    }

    public final void setHeroDomains$fwf_client_release(List<String> list) {
        list.getClass();
        this.heroDomains = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, ConcurrentMap concurrentMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.authUserId;
        }
        if ((i & 2) != 0) {
            str2 = user.unAuthUserId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = user.sessionId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = user.email;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            concurrentMap = user.custom;
        }
        return user.copy(str, str5, str6, str7, concurrentMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.authUserId, user.authUserId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.unAuthUserId, user.unAuthUserId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, user.sessionId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, user.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.custom, user.custom}, getCieXyz.write())).booleanValue();
    }

    public final String getCountry$fwf_client_release() {
        Object next;
        Iterator<T> it = ConstantsKt.getCountryKeys().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (this.custom.get$fwf_client_release((String) next) == null);
        String str = (String) next;
        Object obj = str != null ? this.custom.get$fwf_client_release(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final String getGlobalEntityId$fwf_client_release() {
        Object next;
        String string;
        Iterator<T> it = ConstantsKt.getGlobalEntityIdKeys().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (this.custom.get$fwf_client_release((String) next) == null);
        String str = (String) next;
        Object obj = str != null ? this.custom.get$fwf_client_release(str) : null;
        if (obj == null || (string = obj.toString()) == null) {
            return "";
        }
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public final boolean isValid$fwf_client_release() {
        String str = this.authUserId;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.unAuthUserId;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map getEvaluatedUserAttributes$fwf_client_release$default(User user, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = null;
        }
        return user.getEvaluatedUserAttributes$fwf_client_release(set);
    }

    public final User copy(String str, String str2, String str3, String str4, ConcurrentMap<String, Object> concurrentMap) {
        concurrentMap.getClass();
        return new User(str, str2, str3, str4, concurrentMap);
    }

    public final void setAttributes(Map<String, ? extends Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (isValidAttribute(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.custom.putAll$fwf_client_release(linkedHashMap);
    }

    private final boolean isValidAttribute(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Number);
    }

    public int hashCode() {
        String str = this.authUserId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.unAuthUserId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sessionId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.email;
        return this.custom.hashCode() + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, ConcurrentMap concurrentMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? new ConcurrentMap() : concurrentMap);
    }

    public User(String str, String str2, String str3, String str4, ConcurrentMap<String, Object> concurrentMap) {
        concurrentMap.getClass();
        this.authUserId = str;
        this.unAuthUserId = str2;
        this.sessionId = str3;
        this.email = str4;
        this.custom = concurrentMap;
        this.heroDomains = instance_delegatelambda0.write;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public User(Map<String, ? extends Object> map) {
        this();
        map.getClass();
        this.custom.putAll$fwf_client_release(map);
    }

    public User() {
        this(null, null, null, null, null, 24, null);
    }
}
