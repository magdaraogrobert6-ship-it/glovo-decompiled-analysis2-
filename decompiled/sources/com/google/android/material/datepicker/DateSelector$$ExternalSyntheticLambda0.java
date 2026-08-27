package com.google.android.material.datepicker;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.ui.graphics.Fields;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import o.containsAll;
import o.removeIf;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DateSelector$$ExternalSyntheticLambda0 implements View.OnFocusChangeListener {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ DateSelector$$ExternalSyntheticLambda0(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = 2 % 2;
        int i2 = serializer + 45;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        if (i4 != 0) {
            if (i4 == 1) {
                containsAll containsall = (containsAll) obj;
                containsall.RemoteActionCompatParcelizer(containsall.MediaSessionCompatQueueItem());
                return;
            }
            if (i4 != 2) {
                EditText editText = (EditText) obj;
                if (z) {
                    editText.postDelayed(new ZM$$ExternalSyntheticLambda2(17, editText), 300L);
                    return;
                }
                return;
            }
            removeIf removeif = (removeIf) obj;
            removeif.MediaBrowserCompatMediaItem = z;
            removeif.MediaSessionCompatToken();
            if (z) {
                return;
            }
            removeif.serializer(false);
            removeif.MediaDescriptionCompat = false;
            return;
        }
        EditText[] editTextArr = (EditText[]) obj;
        int length = editTextArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = serializer + 29;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                editTextArr[i5].hasFocus();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (editTextArr[i5].hasFocus()) {
                return;
            }
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            int i7 = write + 19;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
    }
}
