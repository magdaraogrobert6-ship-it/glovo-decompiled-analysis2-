package kotlinx.serialization;

import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MissingFieldException extends SerializationException {
    public final List RemoteActionCompatParcelizer;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(ArrayList arrayList, String str) {
        String strM;
        str.getClass();
        if (arrayList.size() == 1) {
            strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strM = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(strM, null);
        this.RemoteActionCompatParcelizer = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        list.getClass();
        this.RemoteActionCompatParcelizer = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str) {
        super(ff$$ExternalSyntheticOutline0.m("Field '", str, "' is required, but it was missing"), null);
        List listIconCompatParcelizer = SQLite.IconCompatParcelizer((Object) str);
        this.RemoteActionCompatParcelizer = listIconCompatParcelizer;
    }
}
