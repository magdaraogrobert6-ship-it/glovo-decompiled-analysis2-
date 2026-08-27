package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContentlambda02 {
    private static int RatingCompat = 1;
    private static int write;
    public final setParameterizedContentlambda0100 IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public setParameterizedContentlambda02(long j, String str, String str2, setParameterizedContentlambda0100 setparameterizedcontentlambda0100) {
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = setparameterizedcontentlambda0100;
    }

    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer);
            str = this.read;
            iHashCode2 = 1;
            if (str != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer);
            str = this.read;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        }
        String str2 = this.serializer;
        if (str2 == null) {
            int i3 = RatingCompat + 81;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return this.IconCompatParcelizer.hashCode() + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 89;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Params(deliveryId=", ", url=", this.RemoteActionCompatParcelizer, this.read);
        sb.append(", deliveryStatus=");
        sb.append(this.serializer);
        sb.append(", confirmTask=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 123;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = RatingCompat + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setParameterizedContentlambda02)) {
            return false;
        }
        setParameterizedContentlambda02 setparameterizedcontentlambda02 = (setParameterizedContentlambda02) obj;
        if (this.RemoteActionCompatParcelizer != setparameterizedcontentlambda02.RemoteActionCompatParcelizer) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setparameterizedcontentlambda02.read}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setparameterizedcontentlambda02.serializer}, getCieXyz.write())).booleanValue()) {
                return this.IconCompatParcelizer.equals(setparameterizedcontentlambda02.IconCompatParcelizer);
            }
            i = write + 113;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = write + 37;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        RatingCompat = i2;
        int i5 = i % 2;
        return false;
    }
}
