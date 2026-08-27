package com.qualtrics.digital.theming.embedded;

import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InitialQuestionTheme {
    private final int color;
    private final FontTheme initialQuestion;

    private final int component1() {
        return this.color;
    }

    public final FontTheme component2() {
        return this.initialQuestion;
    }

    public final FontTheme getInitialQuestion() {
        return this.initialQuestion;
    }

    public int hashCode() {
        return this.initialQuestion.hashCode() + (Integer.hashCode(this.color) * 31);
    }

    public final int getColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.color);
    }

    public /* synthetic */ InitialQuestionTheme(int i, FontTheme fontTheme, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.color.qualtricsDefaultText : i, (i2 & 2) != 0 ? new FontTheme(0, 20, 1, null) : fontTheme);
    }

    public static /* synthetic */ InitialQuestionTheme copy$default(InitialQuestionTheme initialQuestionTheme, int i, FontTheme fontTheme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = initialQuestionTheme.color;
        }
        if ((i2 & 2) != 0) {
            fontTheme = initialQuestionTheme.initialQuestion;
        }
        return initialQuestionTheme.copy(i, fontTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialQuestionTheme)) {
            return false;
        }
        InitialQuestionTheme initialQuestionTheme = (InitialQuestionTheme) obj;
        if (this.color != initialQuestionTheme.color) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.initialQuestion, initialQuestionTheme.initialQuestion}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "InitialQuestionTheme(color=" + this.color + ", initialQuestion=" + this.initialQuestion + ')';
    }

    public final InitialQuestionTheme copy(int i, FontTheme fontTheme) {
        fontTheme.getClass();
        return new InitialQuestionTheme(i, fontTheme);
    }

    public InitialQuestionTheme(int i, FontTheme fontTheme) {
        fontTheme.getClass();
        this.color = i;
        this.initialQuestion = fontTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitialQuestionTheme() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
