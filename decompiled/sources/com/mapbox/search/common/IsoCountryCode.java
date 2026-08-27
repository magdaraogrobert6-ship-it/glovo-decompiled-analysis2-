package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class IsoCountryCode implements Parcelable {
    public static final Parcelable.Creator<IsoCountryCode> CREATOR = new Vw.yn(16);
    public final String code;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.code.hashCode();
    }

    public IsoCountryCode(String str) {
        str.getClass();
        this.code = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.code);
    }

    static {
        new IsoCountryCode("af");
        new IsoCountryCode("ax");
        new IsoCountryCode("al");
        new IsoCountryCode("dz");
        new IsoCountryCode("as");
        new IsoCountryCode("ad");
        new IsoCountryCode("ao");
        new IsoCountryCode("ai");
        new IsoCountryCode("aq");
        new IsoCountryCode("ag");
        new IsoCountryCode("ar");
        new IsoCountryCode("am");
        new IsoCountryCode("aw");
        new IsoCountryCode("au");
        new IsoCountryCode("at");
        new IsoCountryCode("az");
        new IsoCountryCode("bs");
        new IsoCountryCode("bh");
        new IsoCountryCode("bd");
        new IsoCountryCode("bb");
        new IsoCountryCode("by");
        new IsoCountryCode("be");
        new IsoCountryCode("bz");
        new IsoCountryCode("bj");
        new IsoCountryCode("bm");
        new IsoCountryCode("bt");
        new IsoCountryCode("bo");
        new IsoCountryCode("ba");
        new IsoCountryCode("bw");
        new IsoCountryCode("bv");
        new IsoCountryCode("br");
        new IsoCountryCode("io");
        new IsoCountryCode("vg");
        new IsoCountryCode("bn");
        new IsoCountryCode("bg");
        new IsoCountryCode("bf");
        new IsoCountryCode("bi");
        new IsoCountryCode("kh");
        new IsoCountryCode("cm");
        new IsoCountryCode("ca");
        new IsoCountryCode("cv");
        new IsoCountryCode("bq");
        new IsoCountryCode("ky");
        new IsoCountryCode("cf");
        new IsoCountryCode("td");
        new IsoCountryCode("cl");
        new IsoCountryCode("cn");
        new IsoCountryCode("cx");
        new IsoCountryCode("cc");
        new IsoCountryCode("co");
        new IsoCountryCode("km");
        new IsoCountryCode("cg");
        new IsoCountryCode("cd");
        new IsoCountryCode("ck");
        new IsoCountryCode("cr");
        new IsoCountryCode("ci");
        new IsoCountryCode("hr");
        new IsoCountryCode("cu");
        new IsoCountryCode("cw");
        new IsoCountryCode("cy");
        new IsoCountryCode("cz");
        new IsoCountryCode("dk");
        new IsoCountryCode("dj");
        new IsoCountryCode("dm");
        new IsoCountryCode("do");
        new IsoCountryCode("ec");
        new IsoCountryCode("eg");
        new IsoCountryCode("sv");
        new IsoCountryCode("gq");
        new IsoCountryCode("er");
        new IsoCountryCode("ee");
        new IsoCountryCode("et");
        new IsoCountryCode("fk");
        new IsoCountryCode("fo");
        new IsoCountryCode("fj");
        new IsoCountryCode("fi");
        new IsoCountryCode("fr");
        new IsoCountryCode("gf");
        new IsoCountryCode("pf");
        new IsoCountryCode("tf");
        new IsoCountryCode("ga");
        new IsoCountryCode("gm");
        new IsoCountryCode("ge");
        new IsoCountryCode("de");
        new IsoCountryCode("gh");
        new IsoCountryCode("gi");
        new IsoCountryCode("gr");
        new IsoCountryCode("gl");
        new IsoCountryCode("gd");
        new IsoCountryCode("gp");
        new IsoCountryCode("gu");
        new IsoCountryCode("gt");
        new IsoCountryCode("gg");
        new IsoCountryCode("gn");
        new IsoCountryCode("gw");
        new IsoCountryCode("gy");
        new IsoCountryCode("ht");
        new IsoCountryCode("hm");
        new IsoCountryCode("hn");
        new IsoCountryCode("hk");
        new IsoCountryCode("hu");
        new IsoCountryCode("is");
        new IsoCountryCode("in");
        new IsoCountryCode("id");
        new IsoCountryCode("ir");
        new IsoCountryCode("iq");
        new IsoCountryCode("ie");
        new IsoCountryCode("im");
        new IsoCountryCode("il");
        new IsoCountryCode("it");
        new IsoCountryCode("jm");
        new IsoCountryCode("jp");
        new IsoCountryCode("je");
        new IsoCountryCode("jo");
        new IsoCountryCode("kz");
        new IsoCountryCode("ke");
        new IsoCountryCode("ki");
        new IsoCountryCode("kw");
        new IsoCountryCode("kg");
        new IsoCountryCode("la");
        new IsoCountryCode("lv");
        new IsoCountryCode("lb");
        new IsoCountryCode("ls");
        new IsoCountryCode("lr");
        new IsoCountryCode("ly");
        new IsoCountryCode("li");
        new IsoCountryCode("lt");
        new IsoCountryCode("lu");
        new IsoCountryCode("mo");
        new IsoCountryCode("mk");
        new IsoCountryCode("mg");
        new IsoCountryCode("mw");
        new IsoCountryCode("my");
        new IsoCountryCode("mv");
        new IsoCountryCode("ml");
        new IsoCountryCode("mt");
        new IsoCountryCode("mh");
        new IsoCountryCode("mq");
        new IsoCountryCode("mr");
        new IsoCountryCode("mu");
        new IsoCountryCode("yt");
        new IsoCountryCode("mx");
        new IsoCountryCode("fm");
        new IsoCountryCode("md");
        new IsoCountryCode("mc");
        new IsoCountryCode("mn");
        new IsoCountryCode("me");
        new IsoCountryCode("ms");
        new IsoCountryCode("ma");
        new IsoCountryCode("mz");
        new IsoCountryCode("mm");
        new IsoCountryCode("na");
        new IsoCountryCode("nr");
        new IsoCountryCode("np");
        new IsoCountryCode("nl");
        new IsoCountryCode("nc");
        new IsoCountryCode("nz");
        new IsoCountryCode("ni");
        new IsoCountryCode("ne");
        new IsoCountryCode("ng");
        new IsoCountryCode("nu");
        new IsoCountryCode("nf");
        new IsoCountryCode("mp");
        new IsoCountryCode("kp");
        new IsoCountryCode("no");
        new IsoCountryCode("om");
        new IsoCountryCode("pk");
        new IsoCountryCode("pw");
        new IsoCountryCode("ps");
        new IsoCountryCode("pa");
        new IsoCountryCode("pg");
        new IsoCountryCode("py");
        new IsoCountryCode("pe");
        new IsoCountryCode("ph");
        new IsoCountryCode("pn");
        new IsoCountryCode("pl");
        new IsoCountryCode("pt");
        new IsoCountryCode("pr");
        new IsoCountryCode("qa");
        new IsoCountryCode("re");
        new IsoCountryCode("ro");
        new IsoCountryCode("ru");
        new IsoCountryCode("rw");
        new IsoCountryCode("ws");
        new IsoCountryCode("sm");
        new IsoCountryCode("st");
        new IsoCountryCode("sa");
        new IsoCountryCode("sn");
        new IsoCountryCode("rs");
        new IsoCountryCode("sc");
        new IsoCountryCode("sl");
        new IsoCountryCode("sg");
        new IsoCountryCode("sx");
        new IsoCountryCode("sk");
        new IsoCountryCode("si");
        new IsoCountryCode("sb");
        new IsoCountryCode("so");
        new IsoCountryCode("za");
        new IsoCountryCode("gs");
        new IsoCountryCode("kr");
        new IsoCountryCode("ss");
        new IsoCountryCode("es");
        new IsoCountryCode("lk");
        new IsoCountryCode("bl");
        new IsoCountryCode("sh");
        new IsoCountryCode("kn");
        new IsoCountryCode("lc");
        new IsoCountryCode("mf");
        new IsoCountryCode("pm");
        new IsoCountryCode("vc");
        new IsoCountryCode(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY);
        new IsoCountryCode("sr");
        new IsoCountryCode("sj");
        new IsoCountryCode("sz");
        new IsoCountryCode("se");
        new IsoCountryCode("ch");
        new IsoCountryCode("sy");
        new IsoCountryCode("tw");
        new IsoCountryCode("tj");
        new IsoCountryCode("tz");
        new IsoCountryCode("th");
        new IsoCountryCode("tl");
        new IsoCountryCode("tg");
        new IsoCountryCode("tk");
        new IsoCountryCode(RemoteMessageConst.TO);
        new IsoCountryCode("tt");
        new IsoCountryCode("tn");
        new IsoCountryCode("tr");
        new IsoCountryCode("tm");
        new IsoCountryCode("tc");
        new IsoCountryCode("tv");
        new IsoCountryCode("ug");
        new IsoCountryCode("ua");
        new IsoCountryCode("ae");
        new IsoCountryCode("gb");
        new IsoCountryCode("us");
        new IsoCountryCode("uy");
        new IsoCountryCode("um");
        new IsoCountryCode("vi");
        new IsoCountryCode("uz");
        new IsoCountryCode("vu");
        new IsoCountryCode("va");
        new IsoCountryCode("ve");
        new IsoCountryCode("vn");
        new IsoCountryCode("wf");
        new IsoCountryCode("eh");
        new IsoCountryCode("ye");
        new IsoCountryCode("zm");
        new IsoCountryCode("zw");
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Country(code='"), this.code, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IsoCountryCode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, ((IsoCountryCode) obj).code}, getCieXyz.write())).booleanValue();
    }
}
