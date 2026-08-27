package com.incognia;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IncogniaOptions {
    private final String appId;
    private final boolean backgroundWakeUpEnabled;
    private final boolean installedAppsCollectionEnabled;
    private final boolean locationEnabled;
    private final boolean logEnabled;
    private final int requestTokenMaxLength;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private String appId;
        private boolean backgroundWakeUpEnabled;
        private boolean installedAppsCollectionEnabled;
        private boolean logEnabled;
        private boolean locationEnabled = true;
        private int requestTokenMaxLength = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        public final Builder appId(String str) {
            this.appId = str;
            return this;
        }

        @onItemDismisslambda0
        public final Builder backgroundWakeUpEnabled(boolean z) {
            this.backgroundWakeUpEnabled = z;
            return this;
        }

        public final Builder installedAppsCollectionEnabled(boolean z) {
            this.installedAppsCollectionEnabled = z;
            return this;
        }

        public final Builder locationEnabled(boolean z) {
            this.locationEnabled = z;
            return this;
        }

        public final Builder logEnabled(boolean z) {
            this.logEnabled = z;
            return this;
        }

        public final Builder requestTokenMaxLength(int i) {
            this.requestTokenMaxLength = i;
            return this;
        }

        public final IncogniaOptions build() {
            String str = this.appId;
            if (str == null) {
                str = null;
            }
            return new IncogniaOptions(str, this.logEnabled, this.locationEnabled, this.backgroundWakeUpEnabled, this.installedAppsCollectionEnabled, this.requestTokenMaxLength);
        }
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getBackgroundWakeUpEnabled$annotations() {
    }

    public final String component1() {
        return this.appId;
    }

    public final boolean component2() {
        return this.logEnabled;
    }

    public final boolean component3() {
        return this.locationEnabled;
    }

    public final boolean component4() {
        return this.backgroundWakeUpEnabled;
    }

    public final boolean component5() {
        return this.installedAppsCollectionEnabled;
    }

    public final int component6() {
        return this.requestTokenMaxLength;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getBackgroundWakeUpEnabled() {
        return this.backgroundWakeUpEnabled;
    }

    public final boolean getInstalledAppsCollectionEnabled() {
        return this.installedAppsCollectionEnabled;
    }

    public final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    public final int getRequestTokenMaxLength() {
        return this.requestTokenMaxLength;
    }

    public final IncogniaOptions copy(String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        return new IncogniaOptions(str, z, z2, z3, z4, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public int hashCode() {
        int iHashCode = this.appId.hashCode();
        boolean z = this.logEnabled;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        boolean z2 = this.locationEnabled;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        boolean z3 = this.backgroundWakeUpEnabled;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        boolean z4 = this.installedAppsCollectionEnabled;
        return Integer.hashCode(this.requestTokenMaxLength) + (((((((((iHashCode * 31) + r1) * 31) + r3) * 31) + r4) * 31) + (z4 ? 1 : z4)) * 31);
    }

    public static /* synthetic */ IncogniaOptions copy$default(IncogniaOptions incogniaOptions, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = incogniaOptions.appId;
        }
        if ((i2 & 2) != 0) {
            z = incogniaOptions.logEnabled;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = incogniaOptions.locationEnabled;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = incogniaOptions.backgroundWakeUpEnabled;
        }
        boolean z7 = z3;
        if ((i2 & 16) != 0) {
            z4 = incogniaOptions.installedAppsCollectionEnabled;
        }
        boolean z8 = z4;
        if ((i2 & 32) != 0) {
            i = incogniaOptions.requestTokenMaxLength;
        }
        return incogniaOptions.copy(str, z5, z6, z7, z8, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncogniaOptions)) {
            return false;
        }
        IncogniaOptions incogniaOptions = (IncogniaOptions) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appId, incogniaOptions.appId}, getCieXyz.write())).booleanValue() && this.logEnabled == incogniaOptions.logEnabled && this.locationEnabled == incogniaOptions.locationEnabled && this.backgroundWakeUpEnabled == incogniaOptions.backgroundWakeUpEnabled && this.installedAppsCollectionEnabled == incogniaOptions.installedAppsCollectionEnabled && this.requestTokenMaxLength == incogniaOptions.requestTokenMaxLength;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncogniaOptions(appId=");
        sb.append(this.appId);
        sb.append(", logEnabled=");
        sb.append(this.logEnabled);
        sb.append(", locationEnabled=");
        sb.append(this.locationEnabled);
        sb.append(", backgroundWakeUpEnabled=");
        sb.append(this.backgroundWakeUpEnabled);
        sb.append(", installedAppsCollectionEnabled=");
        sb.append(this.installedAppsCollectionEnabled);
        sb.append(", requestTokenMaxLength=");
        return af$$ExternalSyntheticOutline0.m(sb, this.requestTokenMaxLength, ')');
    }

    public /* synthetic */ IncogniaOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false, (i2 & 32) != 0 ? JosStatusCodes.RTN_CODE_COMMON_ERROR : i);
    }

    public IncogniaOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.appId = str;
        this.logEnabled = z;
        this.locationEnabled = z2;
        this.backgroundWakeUpEnabled = z3;
        this.installedAppsCollectionEnabled = z4;
        this.requestTokenMaxLength = i;
    }
}
