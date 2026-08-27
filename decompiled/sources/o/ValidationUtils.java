package o;

import io.grpc.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ValidationUtils implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 1;

    public ValidationUtils(getHasPremeasured gethaspremeasured, long j) {
        this.RemoteActionCompatParcelizer = j;
        Objects.requireNonNull(gethaspremeasured);
        this.IconCompatParcelizer = gethaspremeasured;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            ((getHasPremeasured) obj).RemoteActionCompatParcelizer(j);
            return;
        }
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
        isBlank isblank = (isBlank) obj;
        isblank.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(applydisplaycutoutmarginstocontentarealambda0);
        long jAbs = Math.abs(j) / 1000000000;
        long jAbs2 = Math.abs(j);
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        java.util.Locale locale = java.util.Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2 % 1000000000)));
        sb.append("s. ");
        Long l = (Long) isblank.RemoteActionCompatParcelizer.serializer(JsonUtilsExternalSyntheticLambda1.read);
        sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l == null ? 0.0d : l.longValue() / isBlank.IconCompatParcelizer)));
        sb.append(applydisplaycutoutmarginstocontentarealambda0);
        isblank.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(Status.read.read(sb.toString()));
    }

    public ValidationUtils(isBlank isblank, long j) {
        this.IconCompatParcelizer = isblank;
        this.RemoteActionCompatParcelizer = j;
    }
}
