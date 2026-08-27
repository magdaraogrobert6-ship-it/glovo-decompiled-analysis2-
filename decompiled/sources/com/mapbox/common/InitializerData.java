package com.mapbox.common;

import android.os.SystemClock;
import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class InitializerData {
    private final int currentInitAttempt;
    private final long firstInitElapsedTimeMs;
    private final InitializerState state;

    public final long component1() {
        return this.firstInitElapsedTimeMs;
    }

    public final InitializerState component2() {
        return this.state;
    }

    public final int component3() {
        return this.currentInitAttempt;
    }

    public final int getCurrentInitAttempt() {
        return this.currentInitAttempt;
    }

    public final long getFirstInitElapsedTimeMs() {
        return this.firstInitElapsedTimeMs;
    }

    public final InitializerState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.firstInitElapsedTimeMs);
        return Integer.hashCode(this.currentInitAttempt) + ((this.state.hashCode() + (iHashCode * 31)) * 31);
    }

    public /* synthetic */ InitializerData(long j, InitializerState initializerState, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SystemClock.elapsedRealtime() : j, (i2 & 2) != 0 ? InitializerState.IN_PROGRESS : initializerState, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ InitializerData copy$default(InitializerData initializerData, long j, InitializerState initializerState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = initializerData.firstInitElapsedTimeMs;
        }
        if ((i2 & 2) != 0) {
            initializerState = initializerData.state;
        }
        if ((i2 & 4) != 0) {
            i = initializerData.currentInitAttempt;
        }
        return initializerData.copy(j, initializerState, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializerData)) {
            return false;
        }
        InitializerData initializerData = (InitializerData) obj;
        return this.firstInitElapsedTimeMs == initializerData.firstInitElapsedTimeMs && this.state == initializerData.state && this.currentInitAttempt == initializerData.currentInitAttempt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InitializerData(firstInitElapsedTimeMs=");
        sb.append(this.firstInitElapsedTimeMs);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", currentInitAttempt=");
        return af$$ExternalSyntheticOutline0.m(sb, this.currentInitAttempt, ')');
    }

    public final InitializerData copy(long j, InitializerState initializerState, int i) {
        initializerState.getClass();
        return new InitializerData(j, initializerState, i);
    }

    public InitializerData(long j, InitializerState initializerState, int i) {
        initializerState.getClass();
        this.firstInitElapsedTimeMs = j;
        this.state = initializerState;
        this.currentInitAttempt = i;
    }

    public InitializerData() {
        this(0L, null, 0, 7, null);
    }
}
