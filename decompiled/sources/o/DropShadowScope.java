package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class DropShadowScope implements Cloneable {
    public accesstoDpu2uoSUMjd IconCompatParcelizer;
    public final char[] read;
    public long write = -1;
    public long serializer = Long.MAX_VALUE;

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.read);
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.serializer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        accesstoDpu2uoSUMjd accesstodpu2uosumjd = this.IconCompatParcelizer;
        return ((((((iHashCode * 31) + i) * 31) + i2) * 31) + (accesstodpu2uosumjd != null ? accesstodpu2uosumjd.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j = this.write;
        long j2 = this.serializer;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.write);
            sb.append("-");
            return c8$$ExternalSyntheticOutline0.m(this.serializer, ")", sb);
        }
        return RatingCompat() + " (" + this.write + " : " + this.serializer + ") <<" + new String(this.read).substring((int) this.write, ((int) this.serializer) + 1) + ">>";
    }

    public final String write() {
        String str = new String(this.read);
        if (str.length() < 1) {
            return "";
        }
        long j = this.serializer;
        if (j != Long.MAX_VALUE) {
            long j2 = this.write;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.write;
        return str.substring(i, i + 1);
    }

    public float IconCompatParcelizer() {
        if (this instanceof accesstoRectjd) {
            return ((accesstoRectjd) this).IconCompatParcelizer();
        }
        return Float.NaN;
    }

    public int MediaMetadataCompat() {
        if (this instanceof accesstoRectjd) {
            return ((accesstoRectjd) this).MediaMetadataCompat();
        }
        return 0;
    }

    public final String RatingCompat() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropShadowScope)) {
            return false;
        }
        DropShadowScope dropShadowScope = (DropShadowScope) obj;
        if (this.write == dropShadowScope.write && this.serializer == dropShadowScope.serializer && Arrays.equals(this.read, dropShadowScope.read)) {
            return Objects.equals(this.IconCompatParcelizer, dropShadowScope.IconCompatParcelizer);
        }
        return false;
    }

    @Override // 
    public DropShadowScope read() {
        try {
            return (DropShadowScope) super.clone();
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }

    public DropShadowScope(char[] cArr) {
        this.read = cArr;
    }

    public final void write(long j) {
        if (this.serializer != Long.MAX_VALUE) {
            return;
        }
        this.serializer = j;
        accesstoDpu2uoSUMjd accesstodpu2uosumjd = this.IconCompatParcelizer;
        if (accesstodpu2uosumjd != null) {
            accesstodpu2uosumjd.serializer(this);
        }
    }
}
