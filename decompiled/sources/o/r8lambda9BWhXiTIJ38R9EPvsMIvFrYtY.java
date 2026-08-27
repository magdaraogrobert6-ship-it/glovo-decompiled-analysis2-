package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY implements Comparable {
    public static final r8lambdakcTilwmporjFCAWe8ASdQv1Ks RemoteActionCompatParcelizer = new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(3);
    public static final long write = -3153600000000000000L;
    public volatile boolean IconCompatParcelizer;
    public final long read;
    public final r8lambdakcTilwmporjFCAWe8ASdQv1Ks serializer;

    public r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY(long j) {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = RemoteActionCompatParcelizer;
        long jNanoTime = System.nanoTime();
        this.serializer = r8lambdakctilwmporjfcawe8asdqv1ks;
        long jMin = Math.min(3153600000000000000L, Math.max(write, j));
        this.read = jNanoTime + jMin;
        this.IconCompatParcelizer = jMin <= 0;
    }

    public final long RemoteActionCompatParcelizer() {
        this.serializer.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.IconCompatParcelizer && this.read - jNanoTime <= 0) {
            this.IconCompatParcelizer = true;
        }
        return this.read - jNanoTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty = (r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY) obj;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambda9bwhxitij38r9epvsmivfryty.serializer;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks2 = this.serializer;
        if (r8lambdakctilwmporjfcawe8asdqv1ks2 == r8lambdakctilwmporjfcawe8asdqv1ks) {
            long j = this.read - r8lambda9bwhxitij38r9epvsmivfryty.read;
            if (j < 0) {
                return -1;
            }
            return j > 0 ? 1 : 0;
        }
        StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(r8lambdakctilwmporjfcawe8asdqv1ks2);
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks3 = r8lambda9bwhxitij38r9epvsmivfryty.serializer;
        sb.append(" and ");
        sb.append(r8lambdakctilwmporjfcawe8asdqv1ks3);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY)) {
            return false;
        }
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty = (r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY) obj;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambda9bwhxitij38r9epvsmivfryty.serializer;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks2 = this.serializer;
        if (r8lambdakctilwmporjfcawe8asdqv1ks2 != null ? r8lambdakctilwmporjfcawe8asdqv1ks2 == r8lambdakctilwmporjfcawe8asdqv1ks : r8lambdakctilwmporjfcawe8asdqv1ks == null) {
            return this.read == r8lambda9bwhxitij38r9epvsmivfryty.read;
        }
        return false;
    }

    public final String toString() {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        long jAbs = Math.abs(jRemoteActionCompatParcelizer) / 1000000000;
        long jAbs2 = Math.abs(jRemoteActionCompatParcelizer) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (jRemoteActionCompatParcelizer < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        if (jAbs2 > 0) {
            sb.append(String.format(java.util.Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = RemoteActionCompatParcelizer;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks2 = this.serializer;
        if (r8lambdakctilwmporjfcawe8asdqv1ks2 != r8lambdakctilwmporjfcawe8asdqv1ks) {
            sb.append(" (ticker=" + r8lambdakctilwmporjfcawe8asdqv1ks2 + ")");
        }
        return sb.toString();
    }

    public final boolean IconCompatParcelizer() {
        if (!this.IconCompatParcelizer) {
            long j = this.read;
            this.serializer.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.IconCompatParcelizer = true;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.asList(this.serializer, Long.valueOf(this.read)).hashCode();
    }
}
