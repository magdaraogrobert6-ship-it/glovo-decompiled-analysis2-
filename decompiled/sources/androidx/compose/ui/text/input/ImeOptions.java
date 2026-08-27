package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m3276getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m3277getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m3278getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m3273copyYTHSh70(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z, i, z2, i2, i3, platformImeOptions, this.hintLocales, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m3274copyuxg59PA(boolean z, int i, boolean z2, int i2, int i3) {
        return new ImeOptions(z, i, z2, i2, i3, this.platformImeOptions, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m((KeyboardCapitalization.m3285hashCodeimpl(this.capitalization) + (Boolean.hashCode(this.singleLine) * 31)) * 31, 31, this.autoCorrect);
        int iM3302hashCodeimpl = KeyboardType.m3302hashCodeimpl(this.keyboardType);
        int iM3249hashCodeimpl = ImeAction.m3249hashCodeimpl(this.imeAction);
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return this.hintLocales.hashCode() + ((((iM3249hashCodeimpl + ((iM3302hashCodeimpl + iM) * 31)) * 31) + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m3270copyYTHSh70$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        return imeOptions.m3273copyYTHSh70(z, i5, z3, i6, i7, platformImeOptions);
    }

    /* JADX INFO: renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m3271copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        return imeOptions.m3274copyuxg59PA(z, i5, z3, i6, i3);
    }

    /* JADX INFO: renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m3272copywBHncE4$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        if ((i4 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        return imeOptions.m3275copywBHncE4(z, i5, z3, i6, i7, platformImeOptions2, localeList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        if (this.singleLine != imeOptions.singleLine || !KeyboardCapitalization.m3284equalsimpl0(this.capitalization, imeOptions.capitalization) || this.autoCorrect != imeOptions.autoCorrect || !KeyboardType.m3301equalsimpl0(this.keyboardType, imeOptions.keyboardType) || !ImeAction.m3248equalsimpl0(this.imeAction, imeOptions.imeAction)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformImeOptions, imeOptions.platformImeOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hintLocales, imeOptions.hintLocales}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m3286toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m3303toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m3250toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m3294getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m3322getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m3261getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (i4 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m3275copywBHncE4(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        return new ImeOptions(z, i, z2, i2, i3, platformImeOptions, localeList, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, platformImeOptions);
    }

    @onItemDismisslambda0
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, platformImeOptions, localeList);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m3294getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m3322getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m3261getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this(z, i, z2, i2, i3, platformImeOptions, LocaleList.Companion.getEmpty(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m3294getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m3322getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m3261getDefaulteUduSuo() : i3, (DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3) {
        this(z, i, z2, i2, i3, null, null, 64, null);
    }
}
