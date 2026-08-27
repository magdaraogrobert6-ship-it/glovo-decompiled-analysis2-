package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA extends r8lambda8h6ssWCgEJ40frWkOBG5qOs2t0s {
    public final r8lambdaeD0hINKsFSncb2CH40qanlgo5o0 IconCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA(r8lambdaeD0hINKsFSncb2CH40qanlgo5o0 r8lambdaed0hinksfsncb2ch40qanlgo5o0, String str) {
        str.getClass();
        this.IconCompatParcelizer = r8lambdaed0hinksfsncb2ch40qanlgo5o0;
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA) {
            r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA r8lambdadizk_xrmchwlr9wiqgm2lroadia = (r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA) obj;
            if (this.IconCompatParcelizer != r8lambdadizk_xrmchwlr9wiqgm2lroadia.IconCompatParcelizer) {
                return false;
            }
            Object[] objArr = {this.serializer, r8lambdadizk_xrmchwlr9wiqgm2lroadia.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisitEssentialsFailure(error=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", message=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }
}
