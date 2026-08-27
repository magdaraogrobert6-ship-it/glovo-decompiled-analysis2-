package com.incognia;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class LoginEvent {
    private final String accountId;
    private final String externalId;
    private final EventLocation location;
    private final EventProperties properties;
    private final String status;
    private final String tag;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String accountId = "";
        private String externalId;
        private EventLocation location;
        private EventProperties properties;
        private String status;
        private String tag;

        public final Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public final Builder externalId(String str) {
            this.externalId = str;
            return this;
        }

        public final Builder location(EventLocation eventLocation) {
            this.location = eventLocation;
            return this;
        }

        public final Builder properties(EventProperties eventProperties) {
            this.properties = eventProperties;
            return this;
        }

        public final Builder status(String str) {
            this.status = str;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final LoginEvent build() {
            return new LoginEvent(this.accountId, this.externalId, this.location, this.status, this.tag, this.properties);
        }
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.externalId;
    }

    public final EventLocation component3() {
        return this.location;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.tag;
    }

    public final EventProperties component6() {
        return this.properties;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventLocation getLocation() {
        return this.location;
    }

    public final EventProperties getProperties() {
        return this.properties;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTag() {
        return this.tag;
    }

    public final LoginEvent copy(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        return new LoginEvent(str, str2, eventLocation, str3, str4, eventProperties);
    }

    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        String str = this.externalId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        EventLocation eventLocation = this.location;
        int iHashCode3 = eventLocation == null ? 0 : eventLocation.hashCode();
        String str2 = this.status;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        EventProperties eventProperties = this.properties;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (eventProperties != null ? eventProperties.hashCode() : 0);
    }

    public static /* synthetic */ LoginEvent copy$default(LoginEvent loginEvent, String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginEvent.accountId;
        }
        if ((i & 2) != 0) {
            str2 = loginEvent.externalId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            eventLocation = loginEvent.location;
        }
        EventLocation eventLocation2 = eventLocation;
        if ((i & 8) != 0) {
            str3 = loginEvent.status;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = loginEvent.tag;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            eventProperties = loginEvent.properties;
        }
        return loginEvent.copy(str, str5, eventLocation2, str6, str7, eventProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginEvent)) {
            return false;
        }
        LoginEvent loginEvent = (LoginEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accountId, loginEvent.accountId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalId, loginEvent.externalId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, loginEvent.location}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, loginEvent.status}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, loginEvent.tag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.properties, loginEvent.properties}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "LoginEvent(accountId=" + this.accountId + ", externalId=" + this.externalId + ", location=" + this.location + ", status=" + this.status + ", tag=" + this.tag + ", properties=" + this.properties + ')';
    }

    public /* synthetic */ LoginEvent(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : eventLocation, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? eventProperties : null);
    }

    public LoginEvent(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        this.accountId = str;
        this.externalId = str2;
        this.location = eventLocation;
        this.status = str3;
        this.tag = str4;
        this.properties = eventProperties;
    }
}
