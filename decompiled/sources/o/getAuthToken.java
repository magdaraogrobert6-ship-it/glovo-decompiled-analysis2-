package o;

import java.nio.file.attribute.FileTime;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAuthToken {
    public static final long serializer;

    static {
        FileTime.from(Instant.EPOCH);
        serializer = 10000000L;
    }

    public static FileTime IconCompatParcelizer(long j) {
        long jAddExact = Math.addExact(j, -116444736000000000L);
        long j2 = serializer;
        return FileTime.from(Instant.ofEpochSecond(Math.floorDiv(jAddExact, j2), Math.floorMod(jAddExact, j2) * 100));
    }
}
