package o;

import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM {
    public static final r8lambdavz2pcWwVm497UysrApWjymOBuXs Companion = new r8lambdavz2pcWwVm497UysrApWjymOBuXs();
    public static final setGraphicModalMaxWidthDp[] d = {null, null, new setWasCloseMessageCalled(new r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setSessionStartBasedTimeoutEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer, setIsPushWakeScreenForNotificationEnabled.read, 0), 0)};
    public final boolean a;
    public final r8lambdaZX2xA8csSBSphMPsG20ZD182Io b;
    public List c = instance_delegatelambda0.write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM)) {
            return false;
        }
        r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm = (r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM) obj;
        if (this.a != r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.a) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.b}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "VisitEssentialsInput(isStart=" + this.a + ", stationary=" + this.b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM(boolean z, r8lambdaZX2xA8csSBSphMPsG20ZD182Io r8lambdazx2xa8cssbsphmpsg20zd182io) {
        this.a = z;
        this.b = r8lambdazx2xa8cssbsphmpsg20zd182io;
    }
}
