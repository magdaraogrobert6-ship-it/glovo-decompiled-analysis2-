package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM {
    public static final r8lambdad90smTGvkAZCSXd0lxO0wlVTyHw Companion = new r8lambdad90smTGvkAZCSXd0lxO0wlVTyHw();
    public static final setGraphicModalMaxWidthDp[] f = {null, null, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), null, null};
    public final int a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public final int hashCode() {
        return this.e.hashCode() + af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.c, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM)) {
            return false;
        }
        r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) obj;
        if (this.a != r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.a) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.d}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.e}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OSMTypeMapping(orderID=");
        sb.append(this.a);
        sb.append(", internalType=");
        sb.append(this.b);
        sb.append(", businessType=");
        sb.append(this.c);
        sb.append(", todModel=");
        sb.append(this.d);
        sb.append(", durationModel=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.e, ')');
    }

    public r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM(int i, int i2, String str, List list, String str2, String str3) {
        if (31 == (i & 31)) {
            this.a = i2;
            this.b = str;
            this.c = list;
            this.d = str2;
            this.e = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg.IconCompatParcelizer);
        throw null;
    }

    public r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM(int i, String str, String str2, String str3, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
    }
}
