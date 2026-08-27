package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface HistoryRecorderHandleInterface {
    void pushHistory(String str, String str2);

    List<String> startRecording();

    void stopRecording(DumpHistoryCallback dumpHistoryCallback);
}
