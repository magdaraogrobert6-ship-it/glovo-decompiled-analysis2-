package o;

import android.os.Bundle;
import android.text.Spanned;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class getEnd {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final MutableRectKt serializer() {
        int i = 2 % 2;
        if (!MutableRectKt.write()) {
            return null;
        }
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
        if (mutableRectKtRemoteActionCompatParcelizer.IconCompatParcelizer() != 1) {
            return null;
        }
        int i4 = RemoteActionCompatParcelizer + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mutableRectKtRemoteActionCompatParcelizer;
    }

    public static AmountChangingReasonDialogFragment IconCompatParcelizer(CashPaymentTaskUiItem.Reasons reasons) {
        int i = 2 % 2;
        reasons.getClass();
        AmountChangingReasonDialogFragment amountChangingReasonDialogFragment = new AmountChangingReasonDialogFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("KEY_REASONS", reasons)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        amountChangingReasonDialogFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return amountChangingReasonDialogFragment;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f A[PHI: r1
  0x005f: PHI (r1v11 java.lang.Integer) = (r1v7 java.lang.Integer), (r1v13 java.lang.Integer) binds: [B:15:0x0053, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r1
  0x0020: PHI (r1v5 o.MutableRectKt) = (r1v4 o.MutableRectKt), (r1v14 o.MutableRectKt) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final int serializer(String str, int i) {
        MutableRectKt mutableRectKtSerializer;
        int i2;
        Integer numValueOf;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Integer num = null;
        if (i4 % 2 == 0) {
            mutableRectKtSerializer = serializer();
            int i5 = 44 / 0;
            if (mutableRectKtSerializer != null) {
                i2 = write + 69;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    numValueOf = Integer.valueOf(mutableRectKtSerializer.serializer(Math.max(0, i - 1), str));
                    if (numValueOf.intValue() == -1) {
                        int i6 = write + 43;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    } else {
                        num = numValueOf;
                    }
                } else {
                    numValueOf = Integer.valueOf(mutableRectKtSerializer.serializer(Math.max(0, i - 1), str));
                    if (numValueOf.intValue() == -1) {
                        int i8 = write + 43;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else {
                        num = numValueOf;
                    }
                }
            }
        } else {
            mutableRectKtSerializer = serializer();
            if (mutableRectKtSerializer != null) {
                i2 = write + 69;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    numValueOf = Integer.valueOf(mutableRectKtSerializer.serializer(Math.max(0, i - 1), str));
                    if (numValueOf.intValue() == -1) {
                        int i10 = write + 43;
                        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else {
                        num = numValueOf;
                    }
                } else {
                    numValueOf = Integer.valueOf(mutableRectKtSerializer.serializer(Math.max(0, i - 1), str));
                    if (numValueOf.intValue() == -1) {
                        int i12 = write + 43;
                        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    } else {
                        num = numValueOf;
                    }
                }
            }
        }
        if (num == null) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            return characterInstance.preceding(i);
        }
        int i14 = write + 3;
        RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            return num.intValue();
        }
        int i15 = 40 / 0;
        return num.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int write(String str, int i) {
        Integer numValueOf;
        boolean z;
        int spanEnd;
        int i2 = 2 % 2;
        int i3 = write + 53;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        MutableRectKt mutableRectKtSerializer = serializer();
        if (mutableRectKtSerializer != null) {
            int i5 = write + 71;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                mutableRectKtSerializer.IconCompatParcelizer();
            } else {
                if (mutableRectKtSerializer.IconCompatParcelizer() == 1) {
                    z = true;
                }
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Not initialized yet", z);
                coil3.util.UtilsKt.IconCompatParcelizer(str, "charSequence cannot be null");
                androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) mutableRectKtSerializer.serializer.read;
                emojiProcessor.getClass();
                if (i >= 0 || i >= str.length()) {
                    spanEnd = -1;
                } else if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    isValidimpl[] isvalidimplArr = (isValidimpl[]) spanned.getSpans(i, i + 1, isValidimpl.class);
                    if (isvalidimplArr.length > 0) {
                        int i6 = write + 55;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        spanEnd = spanned.getSpanEnd(i6 % 2 != 0 ? isvalidimplArr[1] : isvalidimplArr[0]);
                    } else {
                        spanEnd = ((copydBAh8RUdefault) emojiProcessor.write(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new copydBAh8RUdefault(i))).IconCompatParcelizer;
                        int i7 = write + 43;
                        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    }
                } else {
                    spanEnd = ((copydBAh8RUdefault) emojiProcessor.write(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new copydBAh8RUdefault(i))).IconCompatParcelizer;
                    int i9 = write + 43;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                if (spanEnd == -1) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(spanEnd);
                    int i11 = RemoteActionCompatParcelizer + 73;
                    write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
            }
            z = false;
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Not initialized yet", z);
            coil3.util.UtilsKt.IconCompatParcelizer(str, "charSequence cannot be null");
            androidx.emoji2.text.EmojiProcessor emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) mutableRectKtSerializer.serializer.read;
            emojiProcessor2.getClass();
            if (i >= 0) {
                spanEnd = -1;
            } else {
                spanEnd = -1;
            }
            if (spanEnd == -1) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(spanEnd);
                int i13 = RemoteActionCompatParcelizer + 73;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            return characterInstance.following(i);
        }
        int i15 = write + 59;
        RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            return numValueOf.intValue();
        }
        int i16 = 98 / 0;
        return numValueOf.intValue();
    }
}
