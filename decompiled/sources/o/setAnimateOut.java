package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class setAnimateOut {
    private final setDurationInMilliseconds serializer;

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final Boolean serializer(long j, long j2, Boolean bool) {
        setDurationInMilliseconds setdurationinmilliseconds = this.serializer;
        ArrayList arrayList = new ArrayList(setdurationinmilliseconds.RemoteActionCompatParcelizer(j, j2));
        r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntswWrite = setdurationinmilliseconds.write(j);
        if (r8lambda92cmojndufwjcg9v70hq0grntswWrite != null) {
            long jMin = Math.min(r8lambda92cmojndufwjcg9v70hq0grntswWrite.PlaybackStateCompatCustomAction() + ((long) r8lambda92cmojndufwjcg9v70hq0grntswWrite.read()), j2);
            if (jMin > j) {
                arrayList.add(0, r8lambda92cmojndufwjcg9v70hq0grntswWrite.read((int) (jMin - j), j));
            }
        }
        r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw = (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList);
        if (r8lambda92cmojndufwjcg9v70hq0grntsw != null && r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction() + ((long) r8lambda92cmojndufwjcg9v70hq0grntsw.read()) > j2) {
            arrayList.set(arrayList.size() - 1, r8lambda92cmojndufwjcg9v70hq0grntsw.read((int) (j2 - r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction()), r8lambda92cmojndufwjcg9v70hq0grntsw.write));
        }
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) obj).serializer()) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) it.next()).read();
        }
        if (i == 0) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(((double) i) / ((double) (j2 - j)) < 0.1d);
    }

    static {
        new write(null);
    }

    public setAnimateOut(setDurationInMilliseconds setdurationinmilliseconds) {
        setdurationinmilliseconds.getClass();
        this.serializer = setdurationinmilliseconds;
    }
}
