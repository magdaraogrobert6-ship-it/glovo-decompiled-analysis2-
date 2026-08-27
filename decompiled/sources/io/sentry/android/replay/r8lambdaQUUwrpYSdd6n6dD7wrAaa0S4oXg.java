package io.sentry.android.replay;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg {
    public final int IconCompatParcelizer;
    public final float RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final float write;

    public final int hashCode() {
        return Integer.hashCode(this.read) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline1.m(this.RatingCompat, af$$ExternalSyntheticOutline1.m(this.write, af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, Integer.hashCode(this.serializer) * 31, 31), 31), 31), 31);
    }

    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(int i, int i2, float f, float f2, int i3, int i4) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = f;
        this.RatingCompat = f2;
        this.IconCompatParcelizer = i3;
        this.read = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
            return false;
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) obj;
        return this.serializer == r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer && this.RemoteActionCompatParcelizer == r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer && Float.compare(this.write, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.write) == 0 && Float.compare(this.RatingCompat, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RatingCompat) == 0 && this.IconCompatParcelizer == r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer && this.read == r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.serializer);
        sb.append(", recordingHeight=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", scaleFactorX=");
        sb.append(this.write);
        sb.append(", scaleFactorY=");
        sb.append(this.RatingCompat);
        sb.append(", frameRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bitRate=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
