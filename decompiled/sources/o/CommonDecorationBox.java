package o;

import java.util.concurrent.CancellationException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class CommonDecorationBox {
    public final onCreateVirtualViewTranslationRequests read;

    public void RemoteActionCompatParcelizer() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.read;
        Object[] objArr = {0, Integer.valueOf(oncreatevirtualviewtranslationrequests.read)};
        int iWrite = BackspaceCommand.write();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
        int i = ensuresubscribedtoinappmessageeventslambda7.write;
        int i2 = ensuresubscribedtoinappmessageeventslambda7.read;
        if (i <= i2) {
            while (true) {
                ((TextFieldDelegateKt) oncreatevirtualviewtranslationrequests.write[i]).serializer.resumeWith(createFromParcel.INSTANCE);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
    }

    public void IconCompatParcelizer(CancellationException cancellationException) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.read;
        int i = oncreatevirtualviewtranslationrequests.read;
        createTouchAwareListener[] createtouchawarelistenerArr = new createTouchAwareListener[i];
        for (int i2 = 0; i2 < i; i2++) {
            createtouchawarelistenerArr[i2] = ((TextFieldDelegateKt) oncreatevirtualviewtranslationrequests.write[i2]).serializer;
        }
        for (int i3 = 0; i3 < i; i3++) {
            createtouchawarelistenerArr[i3].serializer((Throwable) cancellationException);
        }
        if (oncreatevirtualviewtranslationrequests.read == 0) {
            return;
        }
        TriStateCheckbox.RemoteActionCompatParcelizer("uncancelled requests present");
    }

    public CommonDecorationBox(int i) {
        if (i != 1) {
            this.read = new onCreateVirtualViewTranslationRequests(new TextFieldImplKtCommonDecorationBox3decoratedSuffix1[16]);
        } else {
            this.read = new onCreateVirtualViewTranslationRequests(new TextFieldDelegateKt[16]);
        }
    }
}
