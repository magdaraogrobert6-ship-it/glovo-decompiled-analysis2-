package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class logFeatureFlagImpressionlambda1 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final logPushNotificationOpenedlambda31 read;
    public final getPersonLastName serializer = androidx.compose.runtime.CompositionKt.serializer(new RealWebSocket$$ExternalSyntheticLambda0(11, this));

    public logFeatureFlagImpressionlambda1(logPushNotificationOpenedlambda31 logpushnotificationopenedlambda31, boolean z, boolean z2) {
        this.read = logpushnotificationopenedlambda31;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    public final int hashCode() {
        boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 123;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int iHashCode = this.read.hashCode();
            z = this.RemoteActionCompatParcelizer;
            i2 = iHashCode << 88;
            i = 7;
        } else {
            int iHashCode2 = this.read.hashCode();
            z = this.RemoteActionCompatParcelizer;
            i = 31;
            i2 = iHashCode2 * 31;
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(i2, i, z);
    }

    public static logFeatureFlagImpressionlambda1 serializer(logFeatureFlagImpressionlambda1 logfeatureflagimpressionlambda1, logPushNotificationOpenedlambda31 logpushnotificationopenedlambda31, boolean z, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = MediaDescriptionCompat + 85;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            logpushnotificationopenedlambda31 = logfeatureflagimpressionlambda1.read;
        }
        if ((i & 2) != 0) {
            z = logfeatureflagimpressionlambda1.RemoteActionCompatParcelizer;
            int i5 = MediaDescriptionCompat + 15;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        boolean z2 = logfeatureflagimpressionlambda1.IconCompatParcelizer;
        logfeatureflagimpressionlambda1.getClass();
        logpushnotificationopenedlambda31.getClass();
        return new logFeatureFlagImpressionlambda1(logpushnotificationopenedlambda31, z, z2);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OneClickStartWorkingViewState(viewEntity=");
        sb.append(this.read);
        sb.append(", startWorkingRequested=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", showContent=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = write + 25;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1
  0x002c: PHI (r1v5 o.logPushNotificationOpenedlambda31) = (r1v4 o.logPushNotificationOpenedlambda31), (r1v12 o.logPushNotificationOpenedlambda31) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public final boolean read() {
        logPushNotificationOpenedlambda31 logpushnotificationopenedlambda31;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 91;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            logpushnotificationopenedlambda31 = this.read;
            int i4 = 0 / 0;
            if (logpushnotificationopenedlambda31.write.isEmpty()) {
                int i5 = write + 111;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (logpushnotificationopenedlambda31.RemoteActionCompatParcelizer.isEmpty()) {
                    i = MediaDescriptionCompat + 99;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        logpushnotificationopenedlambda31.serializer.isEmpty();
                        throw null;
                    }
                    if (logpushnotificationopenedlambda31.serializer.isEmpty()) {
                        return false;
                    }
                }
            }
        } else {
            logpushnotificationopenedlambda31 = this.read;
            if (logpushnotificationopenedlambda31.write.isEmpty()) {
                int i7 = write + 111;
                MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (logpushnotificationopenedlambda31.RemoteActionCompatParcelizer.isEmpty()) {
                    i = MediaDescriptionCompat + 99;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        logpushnotificationopenedlambda31.serializer.isEmpty();
                        throw null;
                    }
                    if (logpushnotificationopenedlambda31.serializer.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        int i9 = MediaDescriptionCompat + 5;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaDescriptionCompat + 25;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            int i3 = 2 / 3;
            return true;
        }
        if (!(obj instanceof logFeatureFlagImpressionlambda1)) {
            return false;
        }
        logFeatureFlagImpressionlambda1 logfeatureflagimpressionlambda1 = (logFeatureFlagImpressionlambda1) obj;
        if (!this.read.equals(logfeatureflagimpressionlambda1.read)) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == logfeatureflagimpressionlambda1.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer == logfeatureflagimpressionlambda1.IconCompatParcelizer;
        }
        int i4 = MediaDescriptionCompat + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
