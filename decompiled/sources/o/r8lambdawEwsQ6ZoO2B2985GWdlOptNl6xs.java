package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs implements AdjustInstance {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final r8lambdahCMuiUVsRubxJCkqZuukT4uD724 read;
    public final String serializer;

    public r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs(String str, r8lambdahCMuiUVsRubxJCkqZuukT4uD724 r8lambdahcmuiuvsrubxjckqzuukt4ud724) {
        str.getClass();
        r8lambdahcmuiuvsrubxjckqzuukt4ud724.getClass();
        this.serializer = str;
        this.read = r8lambdahcmuiuvsrubxjckqzuukt4ud724;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() >>> (this.serializer.hashCode() * 101);
        }
        return (this.serializer.hashCode() * 31) + this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 45;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs)) {
            return false;
        }
        r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs r8lambdawewsq6zoo2b2985gwdloptnl6xs = (r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs) obj;
        Object[] objArr = {this.serializer, r8lambdawewsq6zoo2b2985gwdloptnl6xs.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.read != r8lambdawewsq6zoo2b2985gwdloptnl6xs.read) {
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 125;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(text=" + this.serializer + ", style=" + this.read + ")";
        int i2 = write + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return str;
    }
}
