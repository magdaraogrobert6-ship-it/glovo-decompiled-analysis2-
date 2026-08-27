package com.braze.events;

import coil3.util.UtilsKt;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public final String component1() {
        return this.sessionId;
    }

    public final ChangeType component2() {
        return this.eventType;
    }

    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.eventType.hashCode() + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }

    public SessionStateChangedEvent(String str, ChangeType changeType) {
        str.getClass();
        changeType.getClass();
        this.sessionId = str;
        this.eventType = changeType;
    }

    public final SessionStateChangedEvent copy(String str, ChangeType changeType) {
        str.getClass();
        changeType.getClass();
        return new SessionStateChangedEvent(str, changeType);
    }

    public static /* synthetic */ SessionStateChangedEvent copy$default(SessionStateChangedEvent sessionStateChangedEvent, String str, ChangeType changeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionStateChangedEvent.sessionId;
        }
        if ((i & 2) != 0) {
            changeType = sessionStateChangedEvent.eventType;
        }
        return sessionStateChangedEvent.copy(str, changeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, sessionStateChangedEvent.sessionId}, getCieXyz.write())).booleanValue() && this.eventType == sessionStateChangedEvent.eventType;
    }
}
