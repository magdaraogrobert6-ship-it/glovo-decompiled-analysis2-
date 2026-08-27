package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaxBWoEIk739JmIh5aNadkBGsRfs extends addNotificationForSysPropsChangelambda0 {
    public byte IconCompatParcelizer;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public long write;

    public final r8lambdaxBWoEIk739JmIh5aNadkBGsRfs serializer(String str) {
        this.RemoteActionCompatParcelizer = str;
        return this;
    }

    public final r8lambdaxBWoEIk739JmIh5aNadkBGsRfs IconCompatParcelizer(String str) {
        if (str != null) {
            this.RatingCompat = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null variantId");
        return null;
    }

    public final r8lambdaxBWoEIk739JmIh5aNadkBGsRfs RemoteActionCompatParcelizer(long j) {
        this.write = j;
        this.IconCompatParcelizer = (byte) (this.IconCompatParcelizer | 1);
        return this;
    }

    public final r8lambdaxBWoEIk739JmIh5aNadkBGsRfs read(String str) {
        if (str != null) {
            this.read = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rolloutId");
        return null;
    }

    public final r8lambdaxBWoEIk739JmIh5aNadkBGsRfs write(String str) {
        if (str != null) {
            this.serializer = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null parameterKey");
        return null;
    }

    public final addNotificationForSysPropsChange IconCompatParcelizer() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.IconCompatParcelizer == 1 && (str = this.read) != null && (str2 = this.RatingCompat) != null && (str3 = this.serializer) != null && (str4 = this.RemoteActionCompatParcelizer) != null) {
            return new addNotificationForSysPropsChange(str, str2, str3, str4, this.write);
        }
        StringBuilder sb = new StringBuilder();
        if (this.read == null) {
            sb.append(" rolloutId");
        }
        if (this.RatingCompat == null) {
            sb.append(" variantId");
        }
        if (this.serializer == null) {
            sb.append(" parameterKey");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.IconCompatParcelizer) == 0) {
            sb.append(" templateVersion");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
