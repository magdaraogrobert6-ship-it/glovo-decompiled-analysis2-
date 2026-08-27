package o;

/* JADX INFO: loaded from: classes.dex */
public final class dispose implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.graphics.Shape read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ androidx.compose.material3.TextFieldColors write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.material3.OutlinedTextFieldDefaults.IconCompatParcelizer.m119Container4EFweAY(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, null, this.write, this.read, 0.0f, 0.0f, getpostalcode, 100663296, 200);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public dispose(boolean z, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape) {
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.IconCompatParcelizer = mutableInteractionSourceImpl;
        this.write = textFieldColors;
        this.read = shape;
    }
}
