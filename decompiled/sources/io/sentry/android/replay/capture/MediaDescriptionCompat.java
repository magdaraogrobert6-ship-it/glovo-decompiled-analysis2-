package io.sentry.android.replay.capture;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ write serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaDescriptionCompat(write writeVar, int i) {
        super(1);
        this.IconCompatParcelizer = i;
        this.serializer = writeVar;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        write writeVar = this.serializer;
        if (i != 0) {
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = (MediaSessionCompatQueueItem) obj;
            mediaSessionCompatQueueItem.getClass();
            if (mediaSessionCompatQueueItem instanceof RatingCompat) {
                writeVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(mediaSessionCompatQueueItem);
                writeVar.IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer() + 1);
            }
            return createfromparcel;
        }
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = (MediaSessionCompatQueueItem) obj;
        mediaSessionCompatQueueItem2.getClass();
        if (mediaSessionCompatQueueItem2 instanceof RatingCompat) {
            writeVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(mediaSessionCompatQueueItem2);
            writeVar.IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer() + 1);
        }
        return createfromparcel;
    }
}
