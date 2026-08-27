package com.sentiance.sdk.geofence.states;

/* JADX INFO: loaded from: classes3.dex */
public enum Type {
    WAITING_ENTER("WaitingEnterState"),
    WAITING_DWELL("WaitingDwellState"),
    WAITING_EXIT("WaitingExitState"),
    LOST("LostState"),
    STOPPED("Stopped");

    private String display;

    public String getName() {
        return this.display;
    }

    Type(String str) {
        this.display = str;
    }

    public static Type fromName(String str) {
        for (Type type : values()) {
            if (type.getName().equals(str)) {
                return type;
            }
        }
        return null;
    }
}
