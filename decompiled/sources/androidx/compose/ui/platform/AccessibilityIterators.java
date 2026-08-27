package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        private static ParagraphTextSegmentIterator instance;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || getText().charAt(i - 1) == '\n') {
                return false;
            }
            return i == getText().length() || getText().charAt(i) == '\n';
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                paragraphTextSegmentIterator.getClass();
                return paragraphTextSegmentIterator;
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        private final boolean isStartBoundary(int i) {
            if (getText().charAt(i) != '\n') {
                return i == 0 || getText().charAt(i - 1) == '\n';
            }
            return false;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && getText().charAt(i) == '\n' && !isStartBoundary(i)) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !isEndBoundary(i2)) {
                i2++;
            }
            return getRange(i, i2);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && getText().charAt(i - 1) == '\n' && !isEndBoundary(i)) {
                i--;
            }
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            while (i2 > 0 && !isStartBoundary(i2)) {
                i2--;
            }
            return getRange(i2, i);
        }
    }

    public interface TextSegmentIterator {
        int[] following(int i);

        int[] preceding(int i);
    }

    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private final boolean isLetterOrDigit(int i) {
            if (i < 0 || i >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i));
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                wordTextSegmentIterator.getClass();
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                removeNodeAtDepth.serializer("impl");
                throw null;
            }
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || !isLetterOrDigit(i - 1)) {
                return false;
            }
            return i == getText().length() || !isLetterOrDigit(i);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (!isLetterOrDigit(i) && !isStartBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                removeNodeAtDepth.serializer("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing == -1 || !isEndBoundary(iFollowing)) {
                return null;
            }
            return getRange(i, iFollowing);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && !isLetterOrDigit(i - 1) && !isEndBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                removeNodeAtDepth.serializer("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding == -1 || !isStartBoundary(iPreceding)) {
                return null;
            }
            return getRange(iPreceding, i);
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final boolean isStartBoundary(int i) {
            if (isLetterOrDigit(i)) {
                return i == 0 || !isLetterOrDigit(i - 1);
            }
            return false;
        }
    }

    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                characterTextSegmentIterator.getClass();
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                removeNodeAtDepth.serializer("impl");
                throw null;
            }
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        removeNodeAtDepth.serializer("impl");
                        throw null;
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return getRange(i, iFollowing);
                }
                if (breakIterator2 == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                i = breakIterator2.following(i);
            } while (i != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        removeNodeAtDepth.serializer("impl");
                        throw null;
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return getRange(iPreceding, i);
                }
                if (breakIterator2 == null) {
                    removeNodeAtDepth.serializer("impl");
                    throw null;
                }
                i = breakIterator2.preceding(i);
            } while (i != -1);
            return null;
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }
    }

    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                lineTextSegmentIterator.getClass();
                return lineTextSegmentIterator;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        private LineTextSegmentIterator() {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int lineForOffset;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (i < 0) {
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(0);
            } else {
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                int lineForOffset2 = textLayoutResult.getLineForOffset(i);
                lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionStart) == i ? lineForOffset2 : lineForOffset2 + 1;
            }
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            if (lineForOffset >= textLayoutResult2.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int lineForOffset;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            int length = getText().length();
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (i > length) {
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(getText().length());
            } else {
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                int lineForOffset2 = textLayoutResult.getLineForOffset(i);
                lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionEnd) + 1 == i ? lineForOffset2 : lineForOffset2 - 1;
            }
            if (lineForOffset < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult2.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.getLineStart(i);
                }
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            if (textLayoutResult3 != null) {
                return TextLayoutResult.getLineEnd$default(textLayoutResult3, i, false, 2, null) - 1;
            }
            removeNodeAtDepth.serializer("layoutResult");
            throw null;
        }
    }

    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                pageTextSegmentIterator.getClass();
                return pageTextSegmentIterator;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int lineCount;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    removeNodeAtDepth.serializer("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                if (i <= 0) {
                    i = 0;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.getLineTop(lineForOffset) + iRound;
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                if (textLayoutResult3 == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                float lineTop2 = textLayoutResult3.getLineTop(textLayoutResult3.getLineCount() - 1);
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (lineTop < lineTop2) {
                    if (textLayoutResult4 == null) {
                        removeNodeAtDepth.serializer("layoutResult");
                        throw null;
                    }
                    lineCount = textLayoutResult4.getLineForVerticalPosition(lineTop);
                } else {
                    if (textLayoutResult4 == null) {
                        removeNodeAtDepth.serializer("layoutResult");
                        throw null;
                    }
                    lineCount = textLayoutResult4.getLineCount();
                }
                return getRange(i, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int lineForVerticalPosition;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    removeNodeAtDepth.serializer("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int length = getText().length();
                if (length <= i) {
                    i = length;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    removeNodeAtDepth.serializer("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.getLineTop(lineForOffset) - iRound;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        removeNodeAtDepth.serializer("layoutResult");
                        throw null;
                    }
                    lineForVerticalPosition = textLayoutResult3.getLineForVerticalPosition(lineTop);
                } else {
                    lineForVerticalPosition = 0;
                }
                if (i == getText().length() && lineForVerticalPosition < lineForOffset) {
                    lineForVerticalPosition++;
                }
                return getRange(getLineEdgeIndex(lineForVerticalPosition, DirectionStart), i);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult2.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.getLineStart(i);
                }
                removeNodeAtDepth.serializer("layoutResult");
                throw null;
            }
            if (textLayoutResult3 != null) {
                return TextLayoutResult.getLineEnd$default(textLayoutResult3, i, false, 2, null) - 1;
            }
            removeNodeAtDepth.serializer("layoutResult");
            throw null;
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        public void initialize(String str) {
            setText(str);
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            removeNodeAtDepth.serializer("text");
            throw null;
        }
    }
}
