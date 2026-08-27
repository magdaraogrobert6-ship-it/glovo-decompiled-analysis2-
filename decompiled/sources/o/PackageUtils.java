package o;

import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageUtils {
    public final setResourcePackageNamelambda0 IconCompatParcelizer;
    public final Status read;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ this.read.hashCode();
    }

    public final String toString() {
        Status status = this.read;
        boolean zIconCompatParcelizer = status.IconCompatParcelizer();
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = this.IconCompatParcelizer;
        if (zIconCompatParcelizer) {
            return setresourcepackagenamelambda0.toString();
        }
        return setresourcepackagenamelambda0 + "(" + status + ")";
    }

    public PackageUtils(setResourcePackageNamelambda0 setresourcepackagenamelambda0, Status status) {
        TextStreamsKt.serializer(setresourcepackagenamelambda0, "state is null");
        this.IconCompatParcelizer = setresourcepackagenamelambda0;
        TextStreamsKt.serializer(status, "status is null");
        this.read = status;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PackageUtils)) {
            return false;
        }
        PackageUtils packageUtils = (PackageUtils) obj;
        if (this.IconCompatParcelizer.equals(packageUtils.IconCompatParcelizer)) {
            Status status = packageUtils.read;
            Status status2 = this.read;
            status2.getClass();
            if (status2 == status) {
                return true;
            }
        }
        return false;
    }

    public static PackageUtils read(setResourcePackageNamelambda0 setresourcepackagenamelambda0) {
        TextStreamsKt.read("state is TRANSIENT_ERROR. Use forError() instead", setresourcepackagenamelambda0 != setResourcePackageNamelambda0.TRANSIENT_FAILURE);
        return new PackageUtils(setresourcepackagenamelambda0, Status.RatingCompat);
    }
}
