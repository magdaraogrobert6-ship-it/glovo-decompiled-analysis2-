package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class addViewInt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public static final void RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, notifyItemInserted notifyiteminserted, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1219156421);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i8 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 97;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                if (getpostalcode2.read(notifyiteminserted)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            } else {
                int i11 = 46 / 0;
                if (getpostalcode2.read(notifyiteminserted)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i12 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            androidx.compose.ui.Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(modifier, PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14);
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(notifyiteminserted.write, modifierIconCompatParcelizer, androidx.compose.ui.graphics.ColorKt.Color(notifyiteminserted.read), 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(androidx.compose.ui.text.style.TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, notifyiteminserted.IconCompatParcelizer, getpostalcode, 0, 0, 130040);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 13, modifier, notifyiteminserted);
        }
    }
}
