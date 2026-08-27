package o;

/* JADX INFO: loaded from: classes.dex */
public final class getCenterHorizontally {
    public static final getCenterHorizontally RemoteActionCompatParcelizer;
    public final int IconCompatParcelizer;
    public final Boolean read;
    public final int serializer;
    public final int write;

    public /* synthetic */ getCenterHorizontally(int i, int i2, int i3) {
        this(androidx.compose.ui.text.input.KeyboardCapitalization.Companion.m3296getUnspecifiedIUNYP9k(), (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? androidx.compose.ui.text.input.KeyboardType.Companion.m3323getUnspecifiedPjHm6EE() : i, (i3 & 8) != 0 ? androidx.compose.ui.text.input.ImeAction.Companion.m3269getUnspecifiedeUduSuo() : i2);
    }

    public final int hashCode() {
        int iM3285hashCodeimpl = androidx.compose.ui.text.input.KeyboardCapitalization.m3285hashCodeimpl(this.write);
        Boolean bool = this.read;
        return (androidx.compose.ui.text.input.ImeAction.m3249hashCodeimpl(this.serializer) + ((androidx.compose.ui.text.input.KeyboardType.m3302hashCodeimpl(this.IconCompatParcelizer) + (((iM3285hashCodeimpl * 31) + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 29791;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCenterHorizontally)) {
            return false;
        }
        getCenterHorizontally getcenterhorizontally = (getCenterHorizontally) obj;
        if (!androidx.compose.ui.text.input.KeyboardCapitalization.m3284equalsimpl0(this.write, getcenterhorizontally.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getcenterhorizontally.read}, getCieXyz.write())).booleanValue() && androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(this.IconCompatParcelizer, getcenterhorizontally.IconCompatParcelizer) && androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(this.serializer, getcenterhorizontally.serializer);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.KeyboardCapitalization.m3286toStringimpl(this.write)) + ", autoCorrectEnabled=" + this.read + ", keyboardType=" + ((Object) androidx.compose.ui.text.input.KeyboardType.m3303toStringimpl(this.IconCompatParcelizer)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.ImeAction.m3250toStringimpl(this.serializer)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    static {
        int i = 0;
        RemoteActionCompatParcelizer = new getCenterHorizontally(i, i, 127);
        new getCenterHorizontally(androidx.compose.ui.text.input.KeyboardType.Companion.m3320getPasswordPjHm6EE(), i, 121);
    }

    public getCenterHorizontally(int i, Boolean bool, int i2, int i3) {
        this.write = i;
        this.read = bool;
        this.IconCompatParcelizer = i2;
        this.serializer = i3;
    }
}
