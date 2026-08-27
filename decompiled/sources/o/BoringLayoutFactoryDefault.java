package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BoringLayoutFactoryDefault {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:10:0x003b A[PHI: r1 r12
  0x003b: PHI (r1v10 int) = (r1v4 int), (r1v11 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r12v5 o.getPostalCode) = (r12v1 o.getPostalCode), (r12v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r1 r12
  0x0030: PHI (r1v5 int) = (r1v4 int), (r1v11 int) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r12v2 o.getPostalCode) = (r12v1 o.getPostalCode), (r12v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(clipOutRect clipoutrect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(330898293);
            i2 = i & 1;
            if (i2 != 0) {
                int i5 = RemoteActionCompatParcelizer + 65;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(330898293);
            i2 = i & 1;
            if (i2 != 0) {
                int i7 = RemoteActionCompatParcelizer + 65;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i2, z)) {
            modifier = androidx.compose.ui.Modifier.Companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        androidx.compose.ui.Modifier modifier2 = modifier;
        int i9 = RemoteActionCompatParcelizer + 77;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) clipoutrect, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 9);
        }
    }
}
