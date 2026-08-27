package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cc implements n9 {
    public static final String e = BrazeLogger.getBrazeLogTag((Class<?>) cc.class);
    public final dc a;
    public final String b;
    public final int c;
    public final Object d;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.a.equals(dc.UNKNOWN)) {
                jSONObject.put("property_type", this.a.toString());
            }
            jSONObject.put("property_key", this.b);
            jSONObject.put("comparator", this.c);
            jSONObject.put("property_value", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.e(e, "Caught exception creating property filter Json.", e2);
            return jSONObject;
        }
    }

    public cc(JSONObject jSONObject) throws JSONException {
        dc dcVar = (dc) JsonUtils.optEnum(jSONObject, "property_type", dc.class, dc.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i = jSONObject.getInt("comparator");
        this.a = dcVar;
        this.b = string;
        this.c = i;
        if (jSONObject.has("property_value")) {
            if (dcVar.equals(dc.STRING)) {
                this.d = jSONObject.getString("property_value");
                return;
            }
            if (dcVar.equals(dc.BOOLEAN)) {
                this.d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (dcVar.equals(dc.NUMBER)) {
                this.d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (dcVar.equals(dc.DATE)) {
                this.d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        Object objOpt;
        if (!(daVar instanceof ea)) {
            return false;
        }
        BrazeProperties brazeProperties = ((rg) ((ea) daVar)).e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                objOpt = brazeProperties.forJsonPut().opt(this.b);
            } catch (Exception e2) {
                BrazeLogger.e(e, "Caught exception checking property filter condition.", e2);
                return false;
            }
        } else {
            objOpt = null;
        }
        int i = this.c;
        if (objOpt == null) {
            return i == 12 || i == 17 || i == 2;
        }
        if (i == 11) {
            return true;
        }
        if (i == 12) {
            return false;
        }
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return a(objOpt);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
                boolean z = objOpt instanceof Boolean;
                int i2 = this.c;
                if (!z) {
                    return i2 == 2;
                }
                if (i2 == 1) {
                    return objOpt.equals(this.d);
                }
                if (i2 != 2) {
                    return false;
                }
                return !objOpt.equals(this.d);
            }
            if (!(objOpt instanceof Integer) && !(objOpt instanceof Double)) {
                return this.c == 2;
            }
            double dDoubleValue = ((Number) objOpt).doubleValue();
            double dDoubleValue2 = ((Number) this.d).doubleValue();
            int i3 = this.c;
            if (i3 == 1) {
                return dDoubleValue == dDoubleValue2;
            }
            if (i3 == 2) {
                return dDoubleValue != dDoubleValue2;
            }
            if (i3 != 3) {
                return i3 == 5 && dDoubleValue < dDoubleValue2;
            }
            return dDoubleValue > dDoubleValue2;
        }
        long j = ((pg) daVar).a;
        if (objOpt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) objOpt, BrazeDateFormat.LONG);
            } catch (Exception e3) {
                BrazeLogger.e(e, "Caught exception trying to parse date in compareTimestamps", e3);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long jLongValue = ((Number) this.d).longValue();
            int i4 = this.c;
            if (i4 != 15) {
                if (i4 != 16) {
                    switch (i4) {
                        case 1:
                            if (timeFromEpochInSeconds != jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j + jLongValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j + jLongValue) {
                return false;
            }
        } else if (this.c != 2) {
            return false;
        }
        return true;
    }

    public final boolean a(Object obj) {
        boolean z = obj instanceof String;
        int i = this.c;
        if (!z) {
            return i == 2 || i == 17;
        }
        if (i == 1) {
            return obj.equals(this.d);
        }
        if (i == 2) {
            return !obj.equals(this.d);
        }
        if (i == 10) {
            return Pattern.compile((String) this.d, 2).matcher((String) obj).find();
        }
        if (i != 17) {
            return false;
        }
        return !Pattern.compile((String) this.d, 2).matcher((String) obj).find();
    }
}
