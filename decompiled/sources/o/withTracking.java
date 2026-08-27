package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.RangesKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public abstract class withTracking implements setGraphicModalMaxWidthDp {
    public final String IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final DefaultInAppMessageWebViewClientListenerCompanion read;
    public final Object serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer((String) this.write.invoke(obj));
    }

    public withTracking(String str, r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Enum r4) {
        r8lambdacq4v2aqod74ihhwv724n_b6w0u.getClass();
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r4;
        this.read = RangesKt.read(str);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        try {
            for (Object obj : this.RemoteActionCompatParcelizer) {
                Object[] objArr = {this.write.invoke(obj), strResultReceiver};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, " Serializer, Unknown token: ", strResultReceiver), new Object[0]);
            return this.serializer;
        }
    }
}
