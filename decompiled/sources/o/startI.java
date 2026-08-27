package o;

import com.roadrunner.recentdeliveries.presentation.components.DeliveryKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class startI implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ List IconCompatParcelizer;
    public final /* synthetic */ trackNewSessionI MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY write;

    public startI(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, trackNewSessionI tracknewsessioni) {
        this.IconCompatParcelizer = list;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.write = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        this.MediaBrowserCompatMediaItem = tracknewsessioni;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = 2 % 2;
        AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo2 = (AnchoredDraggableKtanimateTo2) obj;
        int iIntValue = ((Number) obj2).intValue();
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            int i5 = MediaMetadataCompat + 109;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                if (((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2)) {
                    int i6 = MediaDescriptionCompat + 45;
                    MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else {
                int i8 = 30 / 0;
                if (((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2)) {
                    int i9 = MediaDescriptionCompat + 45;
                    MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (((getPostalCode) getbirthdatefull).read(iIntValue)) {
                int i11 = MediaMetadataCompat + 53;
                MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i2 = i11 % 2 == 0 ? 0 : 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            int i12 = MediaDescriptionCompat + 5;
            MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, z)) {
            teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) this.IconCompatParcelizer.get(iIntValue);
            getpostalcode.serializer(926229801);
            DeliveryKt.Delivery(teardownallglobalparameterss, this.read, this.MediaSessionCompatQueueItem, this.serializer, this.write, this.RemoteActionCompatParcelizer, null, getpostalcode, 0);
            if (iIntValue < this.MediaBrowserCompatMediaItem.write.size() - 1) {
                getpostalcode.serializer(926548852);
                DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                getpostalcode.IconCompatParcelizer(false);
                int i14 = MediaDescriptionCompat + 41;
                MediaMetadataCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                getpostalcode.serializer(926601707);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
