package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class NonBlockingMessageCompanion implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;
    public final /* synthetic */ createInAppMessageEventSubscriber serializer;
    public final /* synthetic */ GifDrawableTransformation write;

    public /* synthetic */ NonBlockingMessageCompanion(createInAppMessageEventSubscriber createinappmessageeventsubscriber, GifDrawableTransformation gifDrawableTransformation, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, createInAppMessageEventSubscriber createinappmessageeventsubscriber3) {
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.write = gifDrawableTransformation;
        this.serializer = createinappmessageeventsubscriber2;
        this.read = createinappmessageeventsubscriber3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.read;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = this.serializer;
        GifDrawableTransformation gifDrawableTransformation = this.write;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            int iIntValue = ((Integer) obj).intValue();
            long jLongValue = ((Long) obj2).longValue();
            if (iIntValue != 1) {
                return createfromparcel;
            }
            if (createinappmessageeventsubscriber3.IconCompatParcelizer != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: NTFS extra attribute tag 0x0001 repeated");
            } else {
                if (jLongValue == 24) {
                    createinappmessageeventsubscriber3.IconCompatParcelizer = Long.valueOf(gifDrawableTransformation.write());
                    createinappmessageeventsubscriber2.IconCompatParcelizer = Long.valueOf(gifDrawableTransformation.write());
                    createinappmessageeventsubscriber.IconCompatParcelizer = Long.valueOf(gifDrawableTransformation.write());
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            return null;
        }
        int iIntValue2 = ((Integer) obj).intValue();
        long jLongValue2 = ((Long) obj2).longValue();
        if (iIntValue2 != 21589) {
            return createfromparcel;
        }
        if (jLongValue2 >= 1) {
            byte bMediaBrowserCompatMediaItem = gifDrawableTransformation.MediaBrowserCompatMediaItem();
            boolean z = (bMediaBrowserCompatMediaItem & 1) == 1;
            boolean z2 = (bMediaBrowserCompatMediaItem & 2) == 2;
            boolean z3 = (bMediaBrowserCompatMediaItem & 4) == 4;
            long j = z ? 5L : 1L;
            if (z2) {
                j += 4;
            }
            if (z3) {
                j += 4;
            }
            if (jLongValue2 >= j) {
                if (z) {
                    createinappmessageeventsubscriber3.IconCompatParcelizer = Integer.valueOf(gifDrawableTransformation.IconCompatParcelizer());
                }
                if (z2) {
                    createinappmessageeventsubscriber2.IconCompatParcelizer = Integer.valueOf(gifDrawableTransformation.IconCompatParcelizer());
                }
                if (!z3) {
                    return createfromparcel;
                }
                createinappmessageeventsubscriber.IconCompatParcelizer = Integer.valueOf(gifDrawableTransformation.IconCompatParcelizer());
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: extended timestamp extra too short");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: extended timestamp extra too short");
        }
        return null;
    }

    public /* synthetic */ NonBlockingMessageCompanion(GifDrawableTransformation gifDrawableTransformation, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, createInAppMessageEventSubscriber createinappmessageeventsubscriber3) {
        this.write = gifDrawableTransformation;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.serializer = createinappmessageeventsubscriber2;
        this.read = createinappmessageeventsubscriber3;
    }
}
