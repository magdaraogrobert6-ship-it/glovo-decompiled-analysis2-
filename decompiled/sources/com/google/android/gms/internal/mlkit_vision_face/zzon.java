package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.common.SdkInformation;
import com.mapbox.navigation.navigator.internal.NavigatorLoader$HistoryRecorderHandles;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.SdkHistoryInfo;
import java.util.ArrayList;
import o.HitPathTrackeraddHitPath1;
import o.getSlotIdAtIndex;
import o.onContentCardClicked;
import o.resetLayoutState;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzon {
    public static HitPathTrackeraddHitPath1 write;

    public static NavigatorLoader$HistoryRecorderHandles createHistoryRecorderHandles(ConfigHandle configHandle, String str, String str2, SdkInformation sdkInformation) {
        HistoryRecorderHandle historyRecorderHandleBuild;
        HistoryRecorderHandle historyRecorderHandleBuild2;
        SdkHistoryInfo sdkHistoryInfo = new SdkHistoryInfo(sdkInformation.getVersion(), sdkInformation.getName());
        HistoryRecorderHandle historyRecorderHandleBuildCompositeRecorder = null;
        if (str != null) {
            historyRecorderHandleBuild = HistoryRecorderHandle.build(str, sdkHistoryInfo, configHandle);
            if (historyRecorderHandleBuild == null) {
                LoggerProviderKt.logE("Could not create directory directory to write events", "NavigatorLoader");
            }
        } else {
            historyRecorderHandleBuild = null;
        }
        if (str2 != null) {
            historyRecorderHandleBuild2 = HistoryRecorderHandle.build(str2, sdkHistoryInfo, configHandle);
            if (historyRecorderHandleBuild2 == null) {
                LoggerProviderKt.logE("Could not create directory directory to write events", "NavigatorLoader");
            }
        } else {
            historyRecorderHandleBuild2 = null;
        }
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new HistoryRecorderHandle[]{historyRecorderHandleBuild, historyRecorderHandleBuild2});
        if (!arrayListRemoteActionCompatParcelizer.isEmpty() && (historyRecorderHandleBuildCompositeRecorder = HistoryRecorderHandle.buildCompositeRecorder(arrayListRemoteActionCompatParcelizer)) == null) {
            LoggerProviderKt.logE("Could not create composite history recorder to write events", "NavigatorLoader");
        }
        return new NavigatorLoader$HistoryRecorderHandles(historyRecorderHandleBuild, historyRecorderHandleBuild2, historyRecorderHandleBuildCompositeRecorder);
    }

    public static resetLayoutState read(String str) {
        resetLayoutState resetlayoutstate;
        synchronized (zzon.class) {
            getSlotIdAtIndex getslotidatindex = new getSlotIdAtIndex(str);
            synchronized (zzon.class) {
                if (write == null) {
                    write = new HitPathTrackeraddHitPath1(3);
                }
                resetlayoutstate = (resetLayoutState) write.serializer(getslotidatindex);
            }
            return resetlayoutstate;
        }
        return resetlayoutstate;
    }
}
