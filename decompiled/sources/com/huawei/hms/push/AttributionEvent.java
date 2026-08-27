package com.huawei.hms.push;

/* JADX INFO: loaded from: classes4.dex */
public enum AttributionEvent {
    APP_START_COMPLETE(1),
    OPEN_PRIVACY_PAGE(2),
    REJECT_PRIVACY(3),
    AGREED_PRIVACY(4),
    PERMISSION_GRANTED(5),
    PERMISSION_DENIED(6),
    OPEN_LANDING_PAGE(7);

    private final int a;

    public int getEventId() {
        return this.a;
    }

    AttributionEvent(int i) {
        this.a = i;
    }
}
