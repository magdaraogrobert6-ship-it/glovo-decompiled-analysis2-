package o;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueInsets_androidKt implements TextWatcher {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ ValueInsets_androidKt(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = serializer;
        int i6 = i5 + 17;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 69;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 76 / 0;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = serializer;
        int i6 = i5 + 29;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i5 + 81;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i2 == 0) {
            TextInputLayout textInputLayout = (TextInputLayout) obj;
            textInputLayout.write(!textInputLayout.getLifecycle, false);
            if (textInputLayout.ResultReceiver) {
                textInputLayout.write(editable);
            }
            if (textInputLayout.addOnUserLeaveHintListener) {
                int i3 = RemoteActionCompatParcelizer + 117;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    textInputLayout.RemoteActionCompatParcelizer(editable);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                textInputLayout.RemoteActionCompatParcelizer(editable);
            }
            int i4 = RemoteActionCompatParcelizer + 71;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
        if (editable != null) {
            int i6 = RemoteActionCompatParcelizer + 87;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            string = editable.toString();
            if (string == null) {
                int i8 = RemoteActionCompatParcelizer + 59;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                string = "";
            }
        } else {
            int i10 = RemoteActionCompatParcelizer + 59;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            string = "";
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(string);
        int i12 = serializer + 119;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }
}
