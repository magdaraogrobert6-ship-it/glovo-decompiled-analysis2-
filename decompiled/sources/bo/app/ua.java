package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ua {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public final String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.d;
        Integer num5 = this.e;
        Integer num6 = this.f;
        Integer num7 = this.g;
        StringBuilder sb = new StringBuilder("InAppMessageTheme(backgroundColor=");
        sb.append(num);
        sb.append(", textColor=");
        sb.append(num2);
        sb.append(", closeButtonColor=");
        sb.append(num3);
        sb.append(", iconColor=");
        sb.append(num4);
        sb.append(", iconBackgroundColor=");
        sb.append(num5);
        sb.append(", headerTextColor=");
        sb.append(num6);
        sb.append(", frameColor=");
        return IconCompatParcelizer.write(num7, ")", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, uaVar.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, uaVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, uaVar.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, uaVar.d}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, uaVar.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.f, uaVar.f}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.g, uaVar.g}, getCieXyz.write())).booleanValue();
    }

    public ua(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.BG_COLOR);
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.MESSAGE_TEXT_COLOR);
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_COLOR);
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_BG_COLOR);
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(jSONObject, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(jSONObject, "frame_color");
        this.a = colorIntegerOrNull;
        this.b = colorIntegerOrNull2;
        this.c = colorIntegerOrNull3;
        this.d = colorIntegerOrNull4;
        this.e = colorIntegerOrNull5;
        this.f = colorIntegerOrNull6;
        this.g = colorIntegerOrNull7;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.c;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.d;
        int iHashCode4 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.e;
        int iHashCode5 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.f;
        int iHashCode6 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.g;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num7 != null ? num7.hashCode() : 0);
    }
}
