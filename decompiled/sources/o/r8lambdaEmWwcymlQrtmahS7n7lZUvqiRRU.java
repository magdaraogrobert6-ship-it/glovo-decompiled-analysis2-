package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "FailedRoadDirectionTileDownloadTracker", componentName = "FailedRoadDirectionTileDownloadTracker")
public class r8lambdaEmWwcymlQrtmahS7n7lZUvqiRRU extends DataStoreProviderExternalSyntheticLambda7 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public r8lambdaEmWwcymlQrtmahS7n7lZUvqiRRU(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        super(cVar, parselonglambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.DataStoreProviderExternalSyntheticLambda7
    public final String IconCompatParcelizer() {
        return "failed-road-direction-tile-downloads";
    }
}
