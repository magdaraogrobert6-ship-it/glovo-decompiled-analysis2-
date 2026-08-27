package o;

import com.sentiance.protobuf.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SessionStateChangedEventChangeType extends List {
    Object IconCompatParcelizer(int i);

    SessionStateChangedEventChangeType IconCompatParcelizer();

    void IconCompatParcelizer(ByteString byteString);

    List write();
}
