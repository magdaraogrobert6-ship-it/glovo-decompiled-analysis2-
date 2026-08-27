package androidx.compose.ui.text;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class CharHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
