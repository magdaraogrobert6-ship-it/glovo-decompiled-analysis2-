package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getRepeated3opZhB0 {
    public final Throwable IconCompatParcelizer;
    public final StrokeJoinCompanion serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.IconCompatParcelizer});
    }

    public getRepeated3opZhB0(StrokeJoinCompanion strokeJoinCompanion) {
        this.serializer = strokeJoinCompanion;
        this.IconCompatParcelizer = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRepeated3opZhB0)) {
            return false;
        }
        getRepeated3opZhB0 getrepeated3opzhb0 = (getRepeated3opZhB0) obj;
        StrokeJoinCompanion strokeJoinCompanion = this.serializer;
        if (strokeJoinCompanion != null && strokeJoinCompanion == getrepeated3opzhb0.serializer) {
            return true;
        }
        Throwable th = this.IconCompatParcelizer;
        if (th == null || getrepeated3opzhb0.IconCompatParcelizer == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public getRepeated3opZhB0(Throwable th) {
        this.IconCompatParcelizer = th;
        this.serializer = null;
    }
}
