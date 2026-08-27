package o;

import androidx.collection.ObjectList$toString$1;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class TapGestureDetectorKtdetectTapGestures21 {
    public static final width IconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null);

    public static final onViewAttachedToWindow IconCompatParcelizer(long j, Arrangement arrangement, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i, int i2) {
        Arrangement arrangement2 = (i2 & 2) != 0 ? IconCompatParcelizer : arrangement;
        String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (i2 & 8) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean z = getpostalcode.read(androidx.compose.ui.graphics.Color.m726getColorSpaceimpl(j));
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = new requiredSizeInqDBjuR0default(reset.IconCompatParcelizer, new ObjectList$toString$1(4, androidx.compose.ui.graphics.Color.m726getColorSpaceimpl(j)));
            getpostalcode.write(requiredsizeinqdbjur0default);
            objComponentActivity = requiredsizeinqdbjur0default;
        }
        int i3 = i << 6;
        return TapGestureDetectorKtprocessTapGestureresetJob1.write(androidx.compose.ui.graphics.Color.m712boximpl(j), (requiredSizeInqDBjuR0default) objComponentActivity, arrangement2, null, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getpostalcode, ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
