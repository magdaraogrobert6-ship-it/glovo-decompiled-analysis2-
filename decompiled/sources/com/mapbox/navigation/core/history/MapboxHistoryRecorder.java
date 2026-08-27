package com.mapbox.navigation.core.history;

import androidx.navigation.internal.NavContext;
import com.mapbox.navigation.base.options.HistoryRecorderOptions;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.HistoryRecorderHandle;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxHistoryRecorder {
    public final NavContext historyFiles;
    public final HistoryRecorderOptions historyRecorderOptions;
    public HistoryRecorderHandle historyRecorderHandle = null;
    public final CopyOnWriteArrayList enabledObservers = new CopyOnWriteArrayList();

    public final String fileDirectory() {
        NavContext navContext = this.historyFiles;
        navContext.getClass();
        this.historyRecorderOptions.getClass();
        String absolutePath = new File(navContext.IconCompatParcelizer.getFilesDir(), "mbx_nav/history").getAbsolutePath();
        absolutePath.getClass();
        return NavContext.absolutePath(absolutePath);
    }

    public final void pushHistory(String str, String str2) {
        str2.getClass();
        if (this.historyRecorderHandle == null) {
            LoggerProviderKt.logW("The history recorder is not initialized", "MapboxHistoryRecorder");
        }
        HistoryRecorderHandle historyRecorderHandle = this.historyRecorderHandle;
        if (historyRecorderHandle != null) {
            historyRecorderHandle.pushHistory(str, str2);
        }
    }

    public MapboxHistoryRecorder(NavigationOptions navigationOptions) {
        this.historyRecorderOptions = navigationOptions.historyRecorderOptions;
        this.historyFiles = new NavContext(navigationOptions.applicationContext, 11);
    }
}
