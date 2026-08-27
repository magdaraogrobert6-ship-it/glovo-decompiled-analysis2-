package o;

import coil3.ImageLoader$Builder;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.DestinationHeaderUiModelImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class setBrush12SF9DMdefault {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final ImageLoader$Builder serializer;

    public setBrush12SF9DMdefault(ImageLoader$Builder imageLoader$Builder) {
        this.serializer = imageLoader$Builder;
    }

    public final DestinationHeaderUiModelImpl serializer(ContextScope contextScope) {
        int i = 2 % 2;
        ImageLoader$Builder imageLoader$Builder = this.serializer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        getComposePaint getcomposepaint = (getComposePaint) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.IconCompatParcelizer).write();
        objWrite2.getClass();
        getNexteUduSuo getnexteudusuo = (getNexteUduSuo) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.read).write();
        objWrite3.getClass();
        DestinationHeaderUiModelImpl destinationHeaderUiModelImpl = new DestinationHeaderUiModelImpl(getcomposepaint, getnexteudusuo, contextScope, (UnifiedPhoneCallerImpl) objWrite3, (toURLSpan) ((LocaleListHelperMethods) imageLoader$Builder.serializer).write(), new getQueryContext());
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return destinationHeaderUiModelImpl;
    }
}
