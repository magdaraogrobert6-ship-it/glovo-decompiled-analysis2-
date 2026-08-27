package com.huawei.hms.location;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LocationSceneRequest implements IMessageEntity {
    public static final int SCENE_CAR_BT_STATUS = 1;
    public static final int SCENE_CHECK_SUPPORT_MAG = 102;
    public static final int SCENE_GET_MAG_LOADING_PROGRESS = 103;
    public static final int SCENE_PARKING_LOCATION = 101;
    private int sceneMode;
    private HashMap<String, String> sceneParam;

    public int getSceneMode() {
        return this.sceneMode;
    }

    public HashMap<String, String> getSceneParam() {
        return this.sceneParam;
    }

    public void setSceneMode(int i) {
        this.sceneMode = i;
    }

    public void setSceneParam(HashMap<String, String> map) {
        this.sceneParam = map;
    }

    public LocationSceneRequest(int i) {
        this.sceneMode = i;
    }
}
