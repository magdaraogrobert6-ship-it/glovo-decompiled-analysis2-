package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public final String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        StringBuilder sb = new StringBuilder("MessageButtonTheme(backgroundColor=");
        sb.append(num);
        sb.append(", textColor=");
        sb.append(num2);
        sb.append(", borderColor=");
        return IconCompatParcelizer.write(num3, ")", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ebVar.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, ebVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, ebVar.c}, getCieXyz.write())).booleanValue();
    }

    public eb(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.BG_COLOR);
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.MESSAGE_TEXT_COLOR);
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "border_color");
        this.a = colorIntegerOrNull;
        this.b = colorIntegerOrNull2;
        this.c = colorIntegerOrNull3;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.c;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num3 != null ? num3.hashCode() : 0);
    }
}
