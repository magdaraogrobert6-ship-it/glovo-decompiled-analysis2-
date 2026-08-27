package o;

import com.huawei.riemann.location.bean.eph.BdsNav;
import com.huawei.riemann.location.bean.eph.GalileoNav;
import com.huawei.riemann.location.bean.eph.GlonassNav;
import com.huawei.riemann.location.bean.eph.GpsNav;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pluralStringResource {
    public static GlonassNav[] IconCompatParcelizer(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            arrayList.add(GlonassNav.Builder.aGlonassNav().withDeltaTau(jSONObjectOptJSONObject.optDouble("deltaTaun", 0.0d) / 1.073741824E9d).withEn(jSONObjectOptJSONObject.optInt("en", 0)).withGamma(jSONObjectOptJSONObject.optDouble("gamma", 0.0d) / 1.099511627776E12d).withHealth(jSONObjectOptJSONObject.optInt("health", 0)).withIod(jSONObjectOptJSONObject.optInt("iod", 0)).withM(jSONObjectOptJSONObject.optInt("m", 0)).withP1(jSONObjectOptJSONObject.optInt("p1", 0)).withP2(jSONObjectOptJSONObject.optInt("p2", 0)).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withTaun(jSONObjectOptJSONObject.optDouble("taun", 0.0d) / 1.073741824E9d).withX(jSONObjectOptJSONObject.optDouble("x", 0.0d) / 2048.0d).withXDot(jSONObjectOptJSONObject.optDouble("xDot", 0.0d) / 1048576.0d).withXDotDot(jSONObjectOptJSONObject.optDouble("xDotDot", 0.0d) / 1.073741824E9d).withY(jSONObjectOptJSONObject.optDouble("y", 0.0d) / 2048.0d).withYDot(jSONObjectOptJSONObject.optDouble("yDot", 0.0d) / 1048576.0d).withYDotDot(jSONObjectOptJSONObject.optDouble("yDotDot", 0.0d) / 1.073741824E9d).withZ(jSONObjectOptJSONObject.optDouble("z", 0.0d) / 2048.0d).withZDot(jSONObjectOptJSONObject.optDouble("zDot", 0.0d) / 1048576.0d).withZDotDot(jSONObjectOptJSONObject.optDouble("zDotDot", 0.0d) / 1.073741824E9d).build());
        }
        GlonassNav[] glonassNavArr = new GlonassNav[arrayList.size()];
        arrayList.toArray(glonassNavArr);
        return glonassNavArr;
    }

    public static GalileoNav[] read(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            arrayList.add(GalileoNav.Builder.aGalileoNav().withAf0(jSONObjectOptJSONObject.optDouble("af0", 0.0d) / 1.7179869184E10d).withAf1(jSONObjectOptJSONObject.optDouble("af1", 0.0d) / 7.0368744177664E13d).withAf2(jSONObjectOptJSONObject.optDouble("af2", 0.0d) / 5.764607523034235E17d).withCic(jSONObjectOptJSONObject.optDouble("cic", 0.0d) / 5.36870912E8d).withCis(jSONObjectOptJSONObject.optDouble("cis", 0.0d) / 5.36870912E8d).withCrc(jSONObjectOptJSONObject.optDouble("crc", 0.0d) / 32.0d).withCrs(jSONObjectOptJSONObject.optDouble("crs", 0.0d) / 32.0d).withCuc(jSONObjectOptJSONObject.optDouble("cuc", 0.0d) / 5.36870912E8d).withCus(jSONObjectOptJSONObject.optDouble("cus", 0.0d) / 5.36870912E8d).withDeltaN(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "deltaN", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withEcc(jSONObjectOptJSONObject.optDouble("ecc", 0.0d) / 8.589934592E9d).withGroupDelay(jSONObjectOptJSONObject.optDouble("groupDelay", 0.0d) / 4.294967296E9d).withHealth(jSONObjectOptJSONObject.optInt("health", 0)).withI0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "i0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withIDot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "inclinationDot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withIodc(jSONObjectOptJSONObject.optInt("iodc", 0)).withIode(jSONObjectOptJSONObject.optInt("iode", 0)).withM0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "m0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmegaDot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omegaDot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withSqrtA(jSONObjectOptJSONObject.optDouble("sqrtA", 0.0d) / 524288.0d).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withToc(jSONObjectOptJSONObject.optInt("toc", 0) * 60).withToe(jSONObjectOptJSONObject.optInt("toe", 0) * 60).withNumClockModel(jSONObjectOptJSONObject.optInt("numClockModel", 0)).withClockModelId(jSONObjectOptJSONObject.optInt("clockModelID", 0)).build());
        }
        GalileoNav[] galileoNavArr = new GalileoNav[arrayList.size()];
        arrayList.toArray(galileoNavArr);
        return galileoNavArr;
    }

    public static BdsNav[] serializer(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            arrayList.add(BdsNav.Builder.aBdsNav().withAcc(jSONObjectOptJSONObject.optInt("acc", i)).withAf0(jSONObjectOptJSONObject.optDouble("af0", 0.0d) / 8.589934592E9d).withAf1(jSONObjectOptJSONObject.optDouble("af1", 0.0d) / 1.125899906842624E15d).withAf2((jSONObjectOptJSONObject.optDouble("af2", 0.0d) / 1.152921504606847E18d) / 64.0d).withAodc(jSONObjectOptJSONObject.optInt("aodc", i)).withAode(jSONObjectOptJSONObject.optInt("aode", i)).withCic(jSONObjectOptJSONObject.optDouble("cic", 0.0d) / 2.147483648E9d).withCis(jSONObjectOptJSONObject.optDouble("cis", 0.0d) / 2.147483648E9d).withCrs(jSONObjectOptJSONObject.optDouble("crs", 0.0d) / 64.0d).withCrc(jSONObjectOptJSONObject.optDouble("crc", 0.0d) / 64.0d).withCuc(jSONObjectOptJSONObject.optDouble("cuc", 0.0d) / 2.147483648E9d).withCus(jSONObjectOptJSONObject.optDouble("cus", 0.0d) / 2.147483648E9d).withDeltaN(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "deltaN", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withEcc(jSONObjectOptJSONObject.optDouble("ecc", 0.0d) / 8.589934592E9d).withGroupDelay(((double) jSONObjectOptJSONObject.optInt("groupDelay", 0)) / Math.pow(10.0d, 10.0d)).withHealth(jSONObjectOptJSONObject.optInt("health", 0)).withI0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "i0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withIDot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "inclinationDot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withM0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "m0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmegaDot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omegaDot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withSqrtA(jSONObjectOptJSONObject.optDouble("sqrtA", 0.0d) / 524288.0d).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withToc(jSONObjectOptJSONObject.optInt("toc", 0) * 8).withToe(jSONObjectOptJSONObject.optInt("toe", 0) * 8).build());
            i2++;
            i = 0;
        }
        BdsNav[] bdsNavArr = new BdsNav[arrayList.size()];
        arrayList.toArray(bdsNavArr);
        return bdsNavArr;
    }

    public static GpsNav[] write(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            arrayList.add(GpsNav.Builder.aGpsNav().withAcc(jSONObjectOptJSONObject.optInt("acc", i)).withAf0(jSONObjectOptJSONObject.optDouble("af0", 0.0d) / 2.147483648E9d).withAf1(jSONObjectOptJSONObject.optDouble("af1", 0.0d) / 8.796093022208E12d).withAf2(jSONObjectOptJSONObject.optDouble("af2", 0.0d) / 3.602879701896397E16d).withAodo(jSONObjectOptJSONObject.optInt("aodo", i)).withCic(jSONObjectOptJSONObject.optDouble("cic", 0.0d) / 5.36870912E8d).withCis(jSONObjectOptJSONObject.optDouble("cis", 0.0d) / 5.36870912E8d).withCrs(jSONObjectOptJSONObject.optDouble("crs", 0.0d) / 32.0d).withCrc(jSONObjectOptJSONObject.optDouble("crc", 0.0d) / 32.0d).withCuc(jSONObjectOptJSONObject.optDouble("cuc", 0.0d) / 5.36870912E8d).withCus(jSONObjectOptJSONObject.optDouble("cus", 0.0d) / 5.36870912E8d).withDeltaN(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "deltaN", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withEcc(jSONObjectOptJSONObject.optDouble("ecc", 0.0d) / 8.589934592E9d).withGpsTow23b((jSONObjectOptJSONObject.optDouble("gpsTow23b", 0.0d) * 4.0d) / 50.0d).withGroupDelay(jSONObjectOptJSONObject.optDouble("groupDelay", 0.0d) / 2.147483648E9d).withHealth(jSONObjectOptJSONObject.optInt("health", 0)).withI0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "i0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withIdot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "idot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withIodc(jSONObjectOptJSONObject.optInt("iodc", 0)).withIode(jSONObjectOptJSONObject.optInt("iode", 0)).withM0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "m0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmega0(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omega0", 0.0d, 2.147483648E9d, 3.141592653589793d)).withOmegaDot(getBitmapFromCache.IconCompatParcelizer(jSONObjectOptJSONObject, "omegaDot", 0.0d, 8.796093022208E12d, 3.141592653589793d)).withSqrtA(jSONObjectOptJSONObject.optDouble("sqrtA", 0.0d) / 524288.0d).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withToc(jSONObjectOptJSONObject.optInt("toc", 0) * 16).withToe(jSONObjectOptJSONObject.optInt("toe", 0) * 16).withWeekNumber(jSONObjectOptJSONObject.optInt("weekNumber", 0)).build());
            i2++;
            i = 0;
        }
        GpsNav[] gpsNavArr = new GpsNav[arrayList.size()];
        arrayList.toArray(gpsNavArr);
        return gpsNavArr;
    }
}
