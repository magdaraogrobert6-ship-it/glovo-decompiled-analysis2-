package com.mapbox.common.experimental.wss_backend;

/* JADX INFO: loaded from: classes5.dex */
public enum WsOpCode {
    TEXT,
    BINARY,
    CONTINUATION,
    CLOSE,
    PING,
    PONG;

    private int getValue() {
        return ordinal();
    }
}
