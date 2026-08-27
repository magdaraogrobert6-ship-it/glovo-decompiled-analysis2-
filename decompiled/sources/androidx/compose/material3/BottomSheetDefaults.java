package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import o.ModifierNodeDetachedCancellationException;
import o.fold;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNone;
import o.getPostalCode;
import o.getWindowPosturem18o9QQ;
import o.get_windowPosturem18o9QQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFocusable;
import o.setImeVisible;

/* JADX INFO: loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final float IconCompatParcelizer;
    public static final float RemoteActionCompatParcelizer;
    public static final float read;
    public static final float serializer;
    public static final BottomSheetDefaults write = new BottomSheetDefaults();

    static {
        getNone getnone = SheetBottomTokens.IconCompatParcelizer;
        IconCompatParcelizer = SheetBottomTokens.serializer;
        Dp.m3673constructorimpl(56.0f);
        RemoteActionCompatParcelizer = Dp.m3673constructorimpl(640.0f);
        serializer = Dp.m3673constructorimpl(56.0f);
        read = Dp.m3673constructorimpl(125.0f);
    }

    public final void read(Modifier modifier, float f, float f2, Shape shape, long j, getBirthDateFull getbirthdatefull, final int i) {
        final Modifier modifier2;
        final float f3;
        final float f4;
        final Shape shape2;
        final long j2;
        Modifier modifier3;
        float f5;
        float f6;
        Shape shape3;
        long jWrite;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1364277227);
        int i2 = i | 438;
        if ((i & 3072) == 0) {
            i2 = i | 1462;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier;
                f5 = f;
                f6 = f2;
                shape3 = shape;
                jWrite = j;
            } else {
                modifier3 = Modifier.Companion;
                f5 = SheetBottomTokens.read;
                f6 = SheetBottomTokens.write;
                shape3 = ((get_windowPosturem18o9QQ) getpostalcode.write((getNewPassword) setImeVisible.IconCompatParcelizer)).RemoteActionCompatParcelizer;
                jWrite = getWindowPosturem18o9QQ.write(SheetBottomTokens.RemoteActionCompatParcelizer, getpostalcode);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            String str = setFocusable.read(getpostalcode, R.string.m3c_bottom_sheet_drag_handle_description);
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.serializer, 1);
            boolean z = getpostalcode.read(str);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new ModifierNodeDetachedCancellationException(str, 0);
                getpostalcode.write(objComponentActivity);
            }
            SurfaceKt.m126SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM73paddingVpY3zN4$default, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null), shape3, jWrite, 0L, 0.0f, 0.0f, null, ExtrasKt.write(-1039573072, new fold(f5, f6), getpostalcode), getpostalcode, 12582912, 120);
            f4 = f6;
            shape2 = shape3;
            j2 = jWrite;
            f3 = f5;
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f3 = f;
            f4 = f2;
            shape2 = shape;
            j2 = j;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MotionDurationScale
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.write.read(modifier2, f3, f4, shape2, j2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
