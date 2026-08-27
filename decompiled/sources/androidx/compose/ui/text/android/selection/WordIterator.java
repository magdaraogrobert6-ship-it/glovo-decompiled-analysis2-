package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MutableRectKt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return getEnd(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return getBeginning(i, true);
    }

    private final void checkOffsetIsValid(int i) {
        int i2 = this.start;
        if (i > this.end || i2 > i) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Invalid offset: ", ". Valid range is [");
            sbM.append(this.start);
            sbM.append(" , ");
            sbM.append(this.end);
            sbM.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
    }

    private final boolean isOnLetterOrDigitOrEmoji(int i) {
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i)) && !Character.isSurrogate(this.charSequence.charAt(i))) {
            if (!MutableRectKt.write()) {
                return false;
            }
            MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
            if (mutableRectKtRemoteActionCompatParcelizer.IconCompatParcelizer() != 1 || mutableRectKtRemoteActionCompatParcelizer.serializer(i, this.charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean isOnPunctuation(int i) {
        int i2 = this.start;
        if (i >= this.end || i2 > i) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointAt(this.charSequence, i));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public WordIterator(CharSequence charSequence, int i, int i2, Locale locale) {
        this.charSequence = charSequence;
        if (i < 0 || i > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i - 50);
        this.end = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
    }

    private final int getBeginning(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isOnLetterOrDigitOrEmoji(i)) {
            return (!isBoundary(i) || (isAfterLetterOrDigitOrEmoji(i) && z)) ? prevBoundary(i) : i;
        }
        if (isAfterLetterOrDigitOrEmoji(i)) {
            return prevBoundary(i);
        }
        return -1;
    }

    private final int getEnd(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isAfterLetterOrDigitOrEmoji(i)) {
            return (!isBoundary(i) || (isOnLetterOrDigitOrEmoji(i) && z)) ? nextBoundary(i) : i;
        }
        if (isOnLetterOrDigitOrEmoji(i)) {
            return nextBoundary(i);
        }
        return -1;
    }

    private final boolean isBoundary(int i) {
        checkOffsetIsValid(i);
        if (!this.iterator.isBoundary(i)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i) && isOnLetterOrDigitOrEmoji(i - 1) && isOnLetterOrDigitOrEmoji(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.charSequence.length() - 1 || !(isHiraganaKatakanaBoundary(i) || isHiraganaKatakanaBoundary(i + 1));
    }

    public final int nextBoundary(int i) {
        checkOffsetIsValid(i);
        int iFollowing = this.iterator.following(i);
        return (isOnLetterOrDigitOrEmoji(iFollowing + (-1)) && isOnLetterOrDigitOrEmoji(iFollowing) && !isHiraganaKatakanaBoundary(iFollowing)) ? nextBoundary(iFollowing) : iFollowing;
    }

    public final int prevBoundary(int i) {
        checkOffsetIsValid(i);
        int iPreceding = this.iterator.preceding(i);
        return (isOnLetterOrDigitOrEmoji(iPreceding) && isAfterLetterOrDigitOrEmoji(iPreceding) && !isHiraganaKatakanaBoundary(iPreceding)) ? prevBoundary(iPreceding) : iPreceding;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int i) {
        int i2 = this.start;
        if (i > this.end || i2 + 1 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(this.charSequence.charAt(i3))) {
                if (!MutableRectKt.write()) {
                    return false;
                }
                MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
                if (mutableRectKtRemoteActionCompatParcelizer.IconCompatParcelizer() != 1 || mutableRectKtRemoteActionCompatParcelizer.serializer(i3, this.charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean isHiraganaKatakanaBoundary(int i) {
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{unicodeBlockOf, unicodeBlock}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Character.UnicodeBlock.of(this.charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA}, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Character.UnicodeBlock.of(this.charSequence.charAt(i)), unicodeBlock}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Character.UnicodeBlock.of(this.charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA}, getCieXyz.write())).booleanValue();
    }

    public final boolean isAfterPunctuation(int i) {
        int i2 = this.start;
        if (i > this.end || i2 + 1 > i) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointBefore(this.charSequence, i));
    }

    private final boolean isPunctuationEndBoundary(int i) {
        return !isOnPunctuation(i) && isAfterPunctuation(i);
    }

    private final boolean isPunctuationStartBoundary(int i) {
        return isOnPunctuation(i) && !isAfterPunctuation(i);
    }

    public final int getPunctuationBeginning(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationStartBoundary(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationEndBoundary(i)) {
            i = nextBoundary(i);
        }
        return i;
    }
}
