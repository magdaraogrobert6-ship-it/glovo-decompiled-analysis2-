package o;

import com.sentiance.sdk.usercontext.api.UserContext;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ {
    private final UserContext RemoteActionCompatParcelizer;
    private final UserContext write;

    public final UserContext IconCompatParcelizer() {
        return this.write;
    }

    public final UserContext RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
    }

    public final r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ serializer() {
        UserContext userContextCopy = this.write.copy();
        UserContext userContextCopy2 = this.RemoteActionCompatParcelizer.copy();
        if (userContextCopy == null || userContextCopy2 == null) {
            return null;
        }
        return new r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ(userContextCopy, userContextCopy2);
    }

    public r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ(UserContext userContext, UserContext userContext2) {
        this.write = userContext;
        this.RemoteActionCompatParcelizer = userContext2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq = (r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ) obj;
        return this.write.equals(r8lambdarsg9irie_nt_zbfpq8jag00_omq.write) && this.RemoteActionCompatParcelizer.equals(r8lambdarsg9irie_nt_zbfpq8jag00_omq.RemoteActionCompatParcelizer);
    }
}
