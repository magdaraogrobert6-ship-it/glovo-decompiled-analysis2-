package com.sentiance.sdk.eventtimeline.transportsessionrecorder.api;

import com.sentiance.sdk.DontObfuscate;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public interface ITransportSessionApi {
    void deleteAllTransportSessions();

    void deleteTransportSession(String str);

    void disableTransportSessionRecording();

    void enableTransportSessionRecording();

    List<TransportSession> getAvailableTransportSessions();

    boolean isTransportSessionRecordingEnabled();

    void setTransportSessionListener(TransportSessionListener transportSessionListener);
}
