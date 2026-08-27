package o;

import com.sentiance.sdk.util.database.WhereClause;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class setDurationInMilliseconds {
    private final setHeaderTextColor read;

    public setDurationInMilliseconds(setHeaderTextColor setheadertextcolor) {
        setheadertextcolor.getClass();
        this.read = setheadertextcolor;
    }

    public final List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> RemoteActionCompatParcelizer(long j, long j2) {
        List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> listIconCompatParcelizer = this.read.IconCompatParcelizer(InAppMessageControl.read(), j, j2, new WhereClause());
        listIconCompatParcelizer.getClass();
        return listIconCompatParcelizer;
    }

    public final List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> read() {
        List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> list = this.read.read(InAppMessageControl.read(), WhereClause.serializer("is_phone_usage_event").write(1), (Integer) null, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "ASC"));
        list.getClass();
        return list;
    }

    public final List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> read(long j, long j2) {
        List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> listIconCompatParcelizer = this.read.IconCompatParcelizer(InAppMessageControl.read(), j, j2, WhereClause.serializer("is_phone_usage_event").write(1));
        listIconCompatParcelizer.getClass();
        return listIconCompatParcelizer;
    }

    public final r8lambda92cmOJndUFWJcG9v70hQ0grNTsw write(long j) {
        return (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) this.read.read(InAppMessageControl.read(), j);
    }
}
