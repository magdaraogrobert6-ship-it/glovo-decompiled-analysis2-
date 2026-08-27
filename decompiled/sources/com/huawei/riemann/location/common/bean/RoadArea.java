package com.huawei.riemann.location.common.bean;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RoadArea {
    private String[] nearRoadIDList;
    private RoadLink[] roadInfoList;
    private String[] roadStart2End;

    public void setNearRoadIDList(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.nearRoadIDList = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public void setRoadInfoList(ArrayList<RoadLink> arrayList) {
        if (arrayList != null) {
            this.roadInfoList = (RoadLink[]) arrayList.toArray(new RoadLink[0]);
        }
    }

    public void setRoadStart2End(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.roadStart2End = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public boolean isValid() {
        RoadLink[] roadLinkArr = this.roadInfoList;
        return (roadLinkArr == null || roadLinkArr.length == 0) ? false : true;
    }

    public String[] getNearRoadIDList() {
        String[] strArr = this.nearRoadIDList;
        return strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public RoadLink[] getRoadInfoList() {
        RoadLink[] roadLinkArr = this.roadInfoList;
        return roadLinkArr == null ? new RoadLink[0] : (RoadLink[]) Arrays.copyOf(roadLinkArr, roadLinkArr.length);
    }

    public String[] getRoadStart2End() {
        String[] strArr = this.roadStart2End;
        return strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
