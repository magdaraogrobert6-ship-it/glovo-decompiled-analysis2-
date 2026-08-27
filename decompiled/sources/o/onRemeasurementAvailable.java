package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes2.dex */
public final class onRemeasurementAvailable {
    public final /* synthetic */ View RemoteActionCompatParcelizer;
    public getLowfv9h1I read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onRemeasurementAvailable(int i, View view) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = view;
    }

    public final void read(Drawable drawable) {
        int i = this.serializer;
        View view = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ColorStateList colorStateList = ((MaterialCheckBox) view).MediaSessionCompatResultReceiverWrapper;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
                return;
            }
            return;
        }
        if (i == 1) {
            getTookFromPrecomposeMapNjRlDlw gettookfromprecomposemapnjrldlw = (getTookFromPrecomposeMapNjRlDlw) view;
            gettookfromprecomposemapnjrldlw.setIndeterminate(false);
            gettookfromprecomposemapnjrldlw.setProgressCompat(gettookfromprecomposemapnjrldlw.MediaMetadataCompat, gettookfromprecomposemapnjrldlw.MediaDescriptionCompat);
        } else {
            getTookFromPrecomposeMapNjRlDlw gettookfromprecomposemapnjrldlw2 = (getTookFromPrecomposeMapNjRlDlw) view;
            if (gettookfromprecomposemapnjrldlw2.write) {
                return;
            }
            gettookfromprecomposemapnjrldlw2.setVisibility(gettookfromprecomposemapnjrldlw2.PlaybackStateCompatCustomAction);
        }
    }

    public void IconCompatParcelizer(Drawable drawable) {
        MaterialCheckBox materialCheckBox;
        ColorStateList colorStateList;
        if (this.serializer == 0 && (colorStateList = (materialCheckBox = (MaterialCheckBox) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper) != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, colorStateList.getDefaultColor()));
        }
    }
}
