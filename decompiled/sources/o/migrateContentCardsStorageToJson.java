package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.status.ApplicationStartReason;
import com.sentiance.sdk.status.ApplicationStartType;

/* JADX INFO: loaded from: classes3.dex */
public final class migrateContentCardsStorageToJson {
    private final ApplicationStartReason read;
    private final ApplicationStartType serializer;

    public migrateContentCardsStorageToJson(int i, int i2) {
        ApplicationStartType applicationStartType;
        ApplicationStartReason applicationStartReason;
        ApplicationStartReason.Companion.getClass();
        ApplicationStartReason[] applicationStartReasonArrValues = ApplicationStartReason.values();
        int length = applicationStartReasonArrValues.length;
        int i3 = 0;
        while (true) {
            applicationStartType = null;
            if (i3 >= length) {
                applicationStartReason = null;
                break;
            }
            applicationStartReason = applicationStartReasonArrValues[i3];
            if (applicationStartReason.getCode() == i) {
                break;
            } else {
                i3++;
            }
        }
        this.read = applicationStartReason;
        ApplicationStartType.Companion.getClass();
        for (ApplicationStartType applicationStartType2 : ApplicationStartType.values()) {
            if (applicationStartType2.getCode() == i2) {
                applicationStartType = applicationStartType2;
                break;
            }
        }
        this.serializer = applicationStartType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupInfo(reason=");
        ApplicationStartReason applicationStartReason = this.read;
        sb.append(applicationStartReason != null ? applicationStartReason.name() : null);
        sb.append(", startType=");
        ApplicationStartType applicationStartType = this.serializer;
        return ff$$ExternalSyntheticOutline0.m(sb, applicationStartType != null ? applicationStartType.name() : null, ')');
    }
}
