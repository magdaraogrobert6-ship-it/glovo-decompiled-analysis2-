package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class randomInRange implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ hasRootCause IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ Integer write;

    public /* synthetic */ randomInRange(String str, boolean z, Integer num, hasRootCause hasrootcause, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str;
        this.read = z;
        this.write = num;
        this.IconCompatParcelizer = hasrootcause;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        createFromParcel createfromparcel;
        boolean z;
        int i;
        copyejIjP34 copyejijp34;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        getPostalCode getpostalcode;
        int i2;
        copyejIjP34 copyejijp35;
        getBirthDateFull getbirthdatefull2;
        int iIntValue2;
        getPostalCode getpostalcode2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = RatingCompat + 63;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = 4;
        if (i5 % 2 != 0) {
            int i7 = this.RemoteActionCompatParcelizer;
            createfromparcel = createFromParcel.INSTANCE;
            z = false;
            if (i7 == 0) {
                i = 2;
                copyejijp34 = (copyejIjP34) obj;
                getbirthdatefull = (getBirthDateFull) obj2;
                iIntValue = ((Integer) obj3).intValue();
                copyejijp34.getClass();
                if ((iIntValue & 6) == 0) {
                    i2 = RatingCompat + 123;
                    MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        ((getPostalCode) getbirthdatefull).read(copyejijp34);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    if (((getPostalCode) getbirthdatefull).read(copyejijp34)) {
                        int i8 = RatingCompat + 109;
                        MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else {
                        i6 = i;
                    }
                    iIntValue |= i6;
                }
                if ((iIntValue & 19) != 18) {
                    int i10 = MediaDescriptionCompat + 63;
                    RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z = true;
                }
                getpostalcode = (getPostalCode) getbirthdatefull;
                if (!(!getpostalcode.write(iIntValue & 1, z))) {
                    int i12 = MediaDescriptionCompat + 89;
                    RatingCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    isValidParameter.RemoteActionCompatParcelizer(copyejijp34, this.serializer, false, this.read, this.write, this.IconCompatParcelizer, (Integer) null, true, (androidx.compose.ui.text.TextStyle) performLayout.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), (getBirthDateFull) getpostalcode, (iIntValue & 14) | 12583296);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            }
            copyejijp35 = (copyejIjP34) obj;
            getbirthdatefull2 = (getBirthDateFull) obj2;
            iIntValue2 = ((Integer) obj3).intValue();
            copyejijp35.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(copyejijp35) ? 4 : i3;
            }
            getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) == 18 ? z : true)) {
                isValidParameter.RemoteActionCompatParcelizer(copyejijp35, this.serializer, false, this.read, this.write, this.IconCompatParcelizer, (Integer) null, false, (androidx.compose.ui.text.TextStyle) performLayout.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), (getBirthDateFull) getpostalcode2, (iIntValue2 & 14) | 12583296);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        int i14 = this.RemoteActionCompatParcelizer;
        createfromparcel = createFromParcel.INSTANCE;
        if (i14 != 0) {
            i3 = 3;
            z = true;
            copyejijp35 = (copyejIjP34) obj;
            getbirthdatefull2 = (getBirthDateFull) obj2;
            iIntValue2 = ((Integer) obj3).intValue();
            copyejijp35.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(copyejijp35) ? 4 : i3;
            }
            getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) == 18 ? z : true)) {
                isValidParameter.RemoteActionCompatParcelizer(copyejijp35, this.serializer, false, this.read, this.write, this.IconCompatParcelizer, (Integer) null, false, (androidx.compose.ui.text.TextStyle) performLayout.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), (getBirthDateFull) getpostalcode2, (iIntValue2 & 14) | 12583296);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        i = 3;
        z = true;
        copyejijp34 = (copyejIjP34) obj;
        getbirthdatefull = (getBirthDateFull) obj2;
        iIntValue = ((Integer) obj3).intValue();
        copyejijp34.getClass();
        if ((iIntValue & 6) == 0) {
            i2 = RatingCompat + 123;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ((getPostalCode) getbirthdatefull).read(copyejijp34);
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            if (((getPostalCode) getbirthdatefull).read(copyejijp34)) {
                int i15 = RatingCompat + 109;
                MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else {
                i6 = i;
            }
            iIntValue |= i6;
        }
        if ((iIntValue & 19) != 18) {
            int i17 = MediaDescriptionCompat + 63;
            RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = true;
        }
        getpostalcode = (getPostalCode) getbirthdatefull;
        if (!(!getpostalcode.write(iIntValue & 1, z))) {
            int i19 = MediaDescriptionCompat + 89;
            RatingCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i110 = i19 % 2;
            isValidParameter.RemoteActionCompatParcelizer(copyejijp34, this.serializer, false, this.read, this.write, this.IconCompatParcelizer, (Integer) null, true, (androidx.compose.ui.text.TextStyle) performLayout.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), (getBirthDateFull) getpostalcode, (iIntValue & 14) | 12583296);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
