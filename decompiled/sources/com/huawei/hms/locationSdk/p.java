package com.huawei.hms.locationSdk;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import java.util.ArrayList;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    @SerializedName("TopCnOSvCount")
    private int a;

    @SerializedName("StatusCacheTime")
    private int b;

    @SerializedName("GnssExceptionInterval")
    private int c;

    @SerializedName("MaxGnssExceptionCount")
    private int d;

    @SerializedName("GnssExceptionTimeOut")
    private int e;

    @SerializedName("GnssExceptionReportType")
    private int f;

    @SerializedName("GnssExceptionReportPkg")
    private List<String> g;

    public int a() {
        return this.c;
    }

    public List<String> b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.a;
    }

    public void h() {
        this.a = 10;
        this.b = 30;
        this.c = 60;
        this.d = 5;
        this.e = 5;
        this.f = 1;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(LocationRequestHelper.PETAL_MAPS_PACKAGE_NAME);
        this.g.add(LocationRequestHelper.PETAL_MAPS_CAR_PACKAGE_NAME);
        this.g.add("com.huawei.Locationsample6");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GnssExceptionConfigBean{topCnOSvCount=");
        sb.append(this.a);
        sb.append(", statusCacheTime=");
        sb.append(this.b);
        sb.append(", gnssExceptionInterval=");
        sb.append(this.c);
        sb.append(", maxGnssExceptionCount=");
        sb.append(this.d);
        sb.append(", gnssExceptionTimeOut=");
        sb.append(this.e);
        sb.append(", gnssExceptionReportType=");
        sb.append(this.f);
        sb.append(", gnssExceptionReportPkg=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.g, '}');
    }
}
