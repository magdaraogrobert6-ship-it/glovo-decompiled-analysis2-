package o;

import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class toAndroidDragEvent implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;

    public /* synthetic */ toAndroidDragEvent(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        alpha alphaVar;
        boolean z;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
        int i3 = 0;
        if (i2 == 0) {
            setBlock setblock = (setBlock) obj;
            List list = (List) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(setblock, obj2);
            List list2 = list;
            int size = list2.size();
            while (i3 < size) {
                int i4 = read + 121;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object obj3 = list.get(i3);
                if (obj3 != null && (alphaVar = ((DragAndDrop_androidKt) setblock).IconCompatParcelizer) != null && !alphaVar.canBeSaved(obj3)) {
                    throw new IllegalArgumentException(("item at index " + i3 + " can't be saved: " + obj3).toString());
                }
                i3++;
                int i6 = write + 33;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
        if (i2 == 1) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i8 = read + 73;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (!getpostalcode.write(iIntValue & 1, z)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, 0);
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = (InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) obj;
            InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = (InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) obj2;
            instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.getClass();
            instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet);
            return createfromparcel;
        }
        if (i2 == 3) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            androidx.compose.ui.geometry.Offset offset = (androidx.compose.ui.geometry.Offset) obj2;
            pointerInputChange.getClass();
            pointerInputChange.consume();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Float.valueOf(Float.intBitsToFloat((int) (offset.m487unboximpl() >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.m487unboximpl() & 4294967295L))));
            return createfromparcel;
        }
        markAsRead markasread = (markAsRead) obj;
        readContentProvider readcontentprovider = (readContentProvider) obj2;
        markasread.getClass();
        readcontentprovider.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(markasread.serializer.read, readcontentprovider.IconCompatParcelizer.read);
        int i10 = write + 119;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return createfromparcel;
    }
}
