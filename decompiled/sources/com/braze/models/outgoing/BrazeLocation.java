package com.braze.models.outgoing;

import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c2;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import com.braze.support.ValidationUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeLocation implements IBrazeLocation {
    private static final c2 Companion = new c2();
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    private final double component1() {
        return this._latitude;
    }

    private final double component2() {
        return this._longitude;
    }

    private final Double component3() {
        return this._altitude;
    }

    private final Double component4() {
        return this._accuracy;
    }

    private final Double component5() {
        return this._verticalAccuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAccuracy() {
        return this._accuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAltitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLatitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLongitude() {
        return this._longitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating location Json.";
    }

    public final BrazeLocation copy(double d, double d2, Double d3, Double d4, Double d5) {
        return new BrazeLocation(d, d2, d3, d4, d5);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(9), 4, (Object) null);
            return jSONObject;
        }
    }

    public int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this._longitude, Double.hashCode(this._latitude) * 31, 31);
        Double d = this._altitude;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this._accuracy;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this._verticalAccuracy;
        return ((((iRemoteActionCompatParcelizer + iHashCode) * 31) + iHashCode2) * 31) + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        double d = this._latitude;
        double d2 = this._longitude;
        Double d3 = this._altitude;
        Double d4 = this._accuracy;
        Double d5 = this._verticalAccuracy;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "BrazeLocation(_latitude=", ", _longitude=");
        sbM.append(d2);
        sbM.append(", _altitude=");
        sbM.append(d3);
        sbM.append(", _accuracy=");
        sbM.append(d4);
        sbM.append(", _verticalAccuracy=");
        sbM.append(d5);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, c2.a(Companion, location));
        location.getClass();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) obj;
        if (Double.compare(this._latitude, brazeLocation._latitude) != 0 || Double.compare(this._longitude, brazeLocation._longitude) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this._altitude, brazeLocation._altitude}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this._accuracy, brazeLocation._accuracy}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this._verticalAccuracy, brazeLocation._verticalAccuracy}, getCieXyz.write())).booleanValue();
    }

    public BrazeLocation(double d, double d2, Double d3) {
        this(d, d2, d3, null, null, 24, null);
    }

    public BrazeLocation(double d, double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, null, 16, null);
    }

    public BrazeLocation(double d, double d2, Double d3, Double d4, Double d5) {
        this._latitude = d;
        this._longitude = d2;
        this._altitude = d3;
        this._accuracy = d4;
        this._verticalAccuracy = d5;
        if (ValidationUtils.isValidLocation(getLatitude(), getLongitude())) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        throw null;
    }

    public /* synthetic */ BrazeLocation(double d, double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    public BrazeLocation(double d, double d2) {
        this(d, d2, null, null, null, 28, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jSONObject) {
        this(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.VERTICAL_ACCURACY));
        jSONObject.getClass();
    }
}
