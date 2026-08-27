package o;

import com.google.firebase.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface shutdown {
    public static final Timestamp.Companion serializer = new Timestamp.Companion(0);
    public static final List n_ = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    boolean serializer(int i);

    SurfaceRequest write(int i);
}
