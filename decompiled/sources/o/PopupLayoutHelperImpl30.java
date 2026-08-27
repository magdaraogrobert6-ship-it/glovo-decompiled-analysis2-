package o;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.RangesKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PopupLayoutHelperImpl30 implements setGraphicModalMaxWidthDp {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public final DefaultInAppMessageWebViewClientListenerCompanion read;
    public final String serializer;
    public final List write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PopupLayoutHelperImpl30(String str, r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Enum r4) {
        r8lambdacq4v2aqod74ihhwv724n_b6w0u.getClass();
        this.serializer = str;
        this.write = r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r4;
        this.read = RangesKt.read(str);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer((String) this.IconCompatParcelizer.invoke(obj));
        int i4 = MediaMetadataCompat + 9;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        try {
            Iterator it = this.write.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer.invoke(next), strResultReceiver}, getCieXyz.write())).booleanValue()) {
                    int i4 = RemoteActionCompatParcelizer + 3;
                    MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return next;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e + ": " + this.serializer + " Serializer, Unknown token: " + strResultReceiver, new Object[0]);
            return this.MediaDescriptionCompat;
        }
    }
}
