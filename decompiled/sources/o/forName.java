package o;

import com.roadrunner.customerchat.legacy.chatlist.presentation.compose.CustomerChatItemKt;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class forName implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ List write;

    public /* synthetic */ forName(int i, Object obj, List list) {
        this.serializer = i;
        this.write = list;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.IconCompatParcelizer;
        List list = this.write;
        int i7 = 16;
        if (i6 == 0) {
            AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo2 = (AnchoredDraggableKtanimateTo2) obj;
            int iIntValue = ((Number) obj2).intValue();
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                int i8 = read + 73;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    ((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2);
                    throw null;
                }
                i = iIntValue2 | (((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2) ? 4 : 2);
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                if (((getPostalCode) getbirthdatefull).read(iIntValue)) {
                    int i9 = RemoteActionCompatParcelizer + 117;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i7 = 32;
                }
                i |= i7;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, (i & 147) != 146)) {
                hasNotBeenRead hasnotbeenread = (hasNotBeenRead) list.get(iIntValue);
                getpostalcode.serializer(-359225676);
                DualColumnTimePickerKt.TimePickerItem(0, getpostalcode, hasnotbeenread.RemoteActionCompatParcelizer, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hasnotbeenread.read, (String) obj5}, getCieXyz.write())).booleanValue());
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo3 = (AnchoredDraggableKtanimateTo2) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        if ((iIntValue4 & 6) == 0) {
            if (((getPostalCode) getbirthdatefull2).read(anchoredDraggableKtanimateTo3)) {
                int i11 = RemoteActionCompatParcelizer;
                int i12 = i11 + 97;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                int i14 = i11 + 87;
                read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = iIntValue4 | i4;
        } else {
            i2 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            if (((getPostalCode) getbirthdatefull2).read(iIntValue3)) {
                int i16 = read + 5;
                RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (!getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            fractionVisibleInRect fractionvisibleinrect = (fractionVisibleInRect) list.get(iIntValue3);
            getpostalcode2.serializer(1427832478);
            CustomerChatItemKt.CustomerChatItem(fractionvisibleinrect, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, null, getpostalcode2, 0);
            DividerKt.read(0.0f, 0, 7, 0L, getpostalcode2, null);
            getpostalcode2.IconCompatParcelizer(false);
        }
        return createfromparcel;
    }
}
