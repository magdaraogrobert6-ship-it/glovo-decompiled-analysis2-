package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TimezoneTimelineCreator")
public class isDismissed implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<accessgetClickLoggedp> read;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.write();
    }

    public isDismissed(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = new isPinned(setheadertextcolor);
    }

    public final List<getImageStyle> write(long j, short s, String str) {
        String string = UUID.randomUUID().toString();
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        accessgetClickLoggedp accessgetclickloggedp = new accessgetClickLoggedp(string, j, j, s, str, jCurrentTimeMillis, jCurrentTimeMillis);
        migrateTriggersReeligibilityToJsonlambda4<accessgetClickLoggedp> migratetriggersreeligibilitytojsonlambda4 = this.read;
        accessgetClickLoggedp accessgetclickloggedp2 = migratetriggersreeligibilitytojsonlambda4.read();
        if (accessgetclickloggedp2 != null && accessgetclickloggedp2.read() == accessgetclickloggedp.read() && Objects.equals(accessgetclickloggedp2.serializer(), accessgetclickloggedp.serializer())) {
            return Collections.EMPTY_LIST;
        }
        migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(accessgetclickloggedp);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getImageStyle.RemoteActionCompatParcelizer(accessgetclickloggedp));
        return arrayList;
    }
}
