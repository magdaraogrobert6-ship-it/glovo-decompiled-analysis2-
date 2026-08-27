package o;

import java.util.Arrays;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropModifierNode extends Okio {
    public int RatingCompat;
    public int serializer;
    public int write;
    public isEnabledannotations[] RemoteActionCompatParcelizer = new isEnabledannotations[16];
    public int[] read = new int[16];
    public Object[] IconCompatParcelizer = new Object[16];

    public final void serializer() {
        this.RatingCompat = 0;
        this.serializer = 0;
        Arrays.fill(this.IconCompatParcelizer, 0, this.write, (Object) null);
        this.write = 0;
    }

    public final boolean write() {
        return this.RatingCompat == 0;
    }

    public final void write(isEnabledannotations isenabledannotations) {
        int i = this.RatingCompat;
        isEnabledannotations[] isenabledannotationsArr = this.RemoteActionCompatParcelizer;
        int length = isenabledannotationsArr.length;
        int i2 = androidx.compose.ui.graphics.Fields.RotationZ;
        if (i == length) {
            isEnabledannotations[] isenabledannotationsArr2 = new isEnabledannotations[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(isenabledannotationsArr, 0, isenabledannotationsArr2, 0, i);
            this.RemoteActionCompatParcelizer = isenabledannotationsArr2;
        }
        int i3 = this.serializer;
        int i4 = isenabledannotations.serializer;
        int i5 = isenabledannotations.read;
        int i6 = i3 + i4;
        int[] iArr = this.read;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            onContentCardClicked.IconCompatParcelizer(iArr, 0, iArr2, 0, length2);
            this.read = iArr2;
        }
        int i8 = this.write + i5;
        Object[] objArr = this.IconCompatParcelizer;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.IconCompatParcelizer = objArr2;
        }
        isEnabledannotations[] isenabledannotationsArr3 = this.RemoteActionCompatParcelizer;
        int i10 = this.RatingCompat;
        this.RatingCompat = i10 + 1;
        isenabledannotationsArr3[i10] = isenabledannotations;
        this.serializer += isenabledannotations.serializer;
        this.write += i5;
    }

    public final void write(getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        int i;
        int i2;
        if (this.RatingCompat != 0) {
            accessgetDragAndDropManager accessgetdraganddropmanager = new accessgetDragAndDropManager(this);
            do {
                DragAndDropModifierNode dragAndDropModifierNode = accessgetdraganddropmanager.serializer;
                isEnabledannotations isenabledannotations = dragAndDropModifierNode.RemoteActionCompatParcelizer[accessgetdraganddropmanager.RemoteActionCompatParcelizer];
                AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1Write = isenabledannotations.write(accessgetdraganddropmanager);
                try {
                    isenabledannotations.write(accessgetdraganddropmanager, getaddresscountry, gettype, firstdescendantornull, drag12sf9dm);
                    int i3 = accessgetdraganddropmanager.RemoteActionCompatParcelizer;
                    i = dragAndDropModifierNode.RatingCompat;
                    if (i3 >= i) {
                        break;
                    }
                    isEnabledannotations isenabledannotations2 = dragAndDropModifierNode.RemoteActionCompatParcelizer[i3];
                    accessgetdraganddropmanager.read += isenabledannotations2.serializer;
                    accessgetdraganddropmanager.write += isenabledannotations2.read;
                    i2 = i3 + 1;
                    accessgetdraganddropmanager.RemoteActionCompatParcelizer = i2;
                } catch (Throwable th) {
                    setRequestDisallowInterceptTouchEvent.read(th, drag12sf9dm, gettype, androidContentCaptureManagercurrentSemanticsNodes1Write);
                    throw th;
                }
            } while (i2 < i);
        }
        serializer();
    }
}
