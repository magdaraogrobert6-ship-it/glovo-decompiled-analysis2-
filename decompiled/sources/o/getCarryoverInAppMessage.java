package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getCarryoverInAppMessage implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public final /* synthetic */ createBrazeUserChangeEventSubscriberandroid_sdk_ui_release RatingCompat;
    public ensureSubscribedToInAppMessageEventslambda7 RemoteActionCompatParcelizer;
    public int read;
    public int serializer = -1;
    public int write;

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    public final void IconCompatParcelizer() {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        createBrazeUserChangeEventSubscriberandroid_sdk_ui_release createbrazeuserchangeeventsubscriberandroid_sdk_ui_release = this.RatingCompat;
        CharSequence charSequence = createbrazeuserchangeeventsubscriberandroid_sdk_ui_release.serializer;
        int i = this.read;
        if (i < 0) {
            this.serializer = 0;
            this.RemoteActionCompatParcelizer = null;
            return;
        }
        int i2 = createbrazeuserchangeeventsubscriberandroid_sdk_ui_release.write;
        if (i2 > 0) {
            int i3 = this.write + 1;
            this.write = i3;
            if (i3 >= i2) {
                int i4 = this.IconCompatParcelizer;
                charSequence.getClass();
                this.RemoteActionCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(i4, charSequence.length() - 1, 1);
                this.read = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.IconCompatParcelizer;
                charSequence.getClass();
                this.RemoteActionCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(i5, charSequence.length() - 1, 1);
                this.read = -1;
            } else {
                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) createbrazeuserchangeeventsubscriberandroid_sdk_ui_release.IconCompatParcelizer.invoke(charSequence, Integer.valueOf(this.read));
                if (onviewattachedtowindowlambda0 == null) {
                    int i6 = this.IconCompatParcelizer;
                    charSequence.getClass();
                    this.RemoteActionCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(i6, charSequence.length() - 1, 1);
                    this.read = -1;
                } else {
                    int iIntValue = ((Number) onviewattachedtowindowlambda0.serializer).intValue();
                    int iIntValue2 = ((Number) onviewattachedtowindowlambda0.write).intValue();
                    this.RemoteActionCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(iIntValue)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                    int i7 = iIntValue + iIntValue2;
                    this.IconCompatParcelizer = i7;
                    this.read = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.IconCompatParcelizer;
            charSequence.getClass();
            this.RemoteActionCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(i8, charSequence.length() - 1, 1);
            this.read = -1;
        } else {
            onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) createbrazeuserchangeeventsubscriberandroid_sdk_ui_release.IconCompatParcelizer.invoke(charSequence, Integer.valueOf(this.read));
            if (onviewattachedtowindowlambda0 == null) {
                int i9 = this.IconCompatParcelizer;
                charSequence.getClass();
                this.RemoteActionCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(i9, charSequence.length() - 1, 1);
                this.read = -1;
            } else {
                int iIntValue3 = ((Number) onviewattachedtowindowlambda0.serializer).intValue();
                int iIntValue4 = ((Number) onviewattachedtowindowlambda0.write).intValue();
                this.RemoteActionCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(iIntValue3)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                int i10 = iIntValue3 + iIntValue4;
                this.IconCompatParcelizer = i10;
                this.read = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.serializer = 1;
    }

    public getCarryoverInAppMessage(createBrazeUserChangeEventSubscriberandroid_sdk_ui_release createbrazeuserchangeeventsubscriberandroid_sdk_ui_release) {
        this.RatingCompat = createbrazeuserchangeeventsubscriberandroid_sdk_ui_release;
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(0, 0, createbrazeuserchangeeventsubscriberandroid_sdk_ui_release.serializer.length());
        this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        this.read = iRemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.serializer == -1) {
            IconCompatParcelizer();
        }
        return this.serializer == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.serializer == -1) {
            IconCompatParcelizer();
        }
        if (this.serializer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = this.RemoteActionCompatParcelizer;
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        this.RemoteActionCompatParcelizer = null;
        this.serializer = -1;
        return ensuresubscribedtoinappmessageeventslambda7;
    }
}
