package o;

import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.compose.ActionsBottomSheetKt;
import com.roadrunner.freelancing.presentation.bonusinfo.BonusInformationDialogKt;
import com.roadrunner.liveness.instruction.presentation.compose.InstructionComponentKt;
import com.roadrunner.liveness.recording.presentation.compose.ErrorCardKt;
import com.roadrunner.startworking.equipment.SelectedEquipmentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lambda321 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ lambda321(androidx.compose.ui.Modifier modifier, String str, String str2, int i) {
        this.read = 4;
        this.IconCompatParcelizer = modifier;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = i;
    }

    public /* synthetic */ lambda321(String str, String str2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.write;
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i2 == 0) {
            SelectedEquipmentKt.TextWithMiddleIcon(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3), getbirthdatefull, modifier, str2, str);
            int i4 = MediaMetadataCompat + 95;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        if (i2 == 1) {
            ActionsBottomSheetKt.ContactInfo(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3), getbirthdatefull, modifier, str2, str);
            return createfromparcel;
        }
        if (i2 == 2) {
            BonusInformationDialogKt.BonusSection(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3), getbirthdatefull, modifier, str2, str);
            return createfromparcel;
        }
        if (i2 != 3) {
            ErrorCardKt.ErrorCard(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3), getbirthdatefull, modifier, str2, str);
            return createfromparcel;
        }
        InstructionComponentKt.InstructionHeading(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3), getbirthdatefull, modifier, str2, str);
        int i5 = MediaSessionCompatQueueItem + 67;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
